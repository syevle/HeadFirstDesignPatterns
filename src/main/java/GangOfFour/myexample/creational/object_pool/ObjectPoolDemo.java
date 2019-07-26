package GangOfFour.myexample.creational.object_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ObjectPoolDemo

{
	
	
          private ObjectPool<ExportingProcess> pool;
	
	      private AtomicLong processNo=new AtomicLong(0);
	
	
	       public void setUp() 
	       
	       {
       
	    	// Create a pool of objects of type ExportingProcess.
	    	   
	       /*Parameters:
                 
              1) Minimum number of special ExportingProcess instances residing in the pool = 4
             
              2) Maximum number of special ExportingProcess instances residing in the pool = 10
               
              3) Time in seconds for periodical checking of minObjects / maxObjects conditions in a separate thread = 5.
        
          -->When the number of ExportingProcess instances is less than minObjects, missing instances will be created.
           
          -->When the number of ExportingProcess instances is greater than maxObjects, too many instances will be removed.
           
          -->If the validation interval is negative, no periodical checking of minObjects / maxObjects conditions 
             in a separate thread take place. These boundaries are ignored then.
             
             
           */
	    	   
	    	   
        pool = new ObjectPool<ExportingProcess>(4, 10, 5)
        {
            protected ExportingProcess createObject()
            {
                // create a test object which takes some time for creation
                return new ExportingProcess( processNo.incrementAndGet());
            }
        };
    }
	
	
	
	public void tearDown() 
	{
        pool.shutdown();
    }

 
    public void testObjectPool()
    {
    
    	ExecutorService executor = Executors.newFixedThreadPool(8);

        // execute 8 tasks in separate threads
        
        executor.execute(new ExportingTask(pool, 1));
        executor.execute(new ExportingTask(pool, 2));
        executor.execute(new ExportingTask(pool, 3));
        executor.execute(new ExportingTask(pool, 4));
        executor.execute(new ExportingTask(pool, 5));
        executor.execute(new ExportingTask(pool, 6));
        executor.execute(new ExportingTask(pool, 7));
        executor.execute(new ExportingTask(pool, 8));

        executor.shutdown();
        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
            } catch (InterruptedException e)
            
              {
               e.printStackTrace();
              }
    }
	
   
    
    public static void main(String args[])
    { 
    	
    	ObjectPoolDemo op=new ObjectPoolDemo();
    	op.setUp();
    	op.tearDown();
    	op.testObjectPool();
    	
    	
   } 

}//End of the ObjectPoolDemo class.
/*
Object with process no. 1 was created
Object with process no. 2 was created
Object with process no. 3 was created
Object with process no. 4 was created
Thread 1: Object with process no. 1 was borrowed
Thread 2: Object with process no. 2 was borrowed
Thread 3: Object with process no. 3 was borrowed
Thread 1: Object with process no. 1 was returned
Thread 4: Object with process no. 4 was borrowed
Thread 4: Object with process no. 4 was returned
Thread 3: Object with process no. 3 was returned
Thread 2: Object with process no. 2 was returned
Thread 5: Object with process no. 1 was borrowed
Thread 6: Object with process no. 2 was borrowed
Thread 5: Object with process no. 1 was returned
Thread 6: Object with process no. 2 was returned
Thread 7: Object with process no. 3 was borrowed
Thread 7: Object with process no. 3 was returned
Thread 8: Object with process no. 4 was borrowed
Thread 8: Object with process no. 4 was returned

 */