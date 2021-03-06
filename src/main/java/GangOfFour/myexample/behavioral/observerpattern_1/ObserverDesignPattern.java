package GangOfFour.myexample.behavioral.observerpattern_1;

public class ObserverDesignPattern {
	public static void main(String args[]) {
		Blog blog = new Blog();
		User user1 = new User();
		User user2 = new User();
		blog.registerObserver(user1);
		blog.registerObserver(user2);
		user1.setSubject(blog);
		user2.setSubject(blog);
	
		System.out.println(user1.getArticle());		
		blog.postNewArticle();
		System.out.println(user1.getArticle());
	}

}

/*==============================OutPut====================================
No New Article!
State change reported by Subject.
State change reported by Subject.
Observer Design Pattern
 */
