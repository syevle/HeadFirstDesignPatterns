package GangOfFour.myexample.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
/**
 * Sometimes in distributed systems, we need to implement Serializable interface 
 * in Singleton class so that we can store its state in file system and retrieve
 * it at later point of time. 
 * Here is a small singleton class that implements Serializable interface also.
 * @author syevle
 *
 */
public class SingletonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
				"filename.ser"));
		out.writeObject(instanceOne);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream(
				"filename.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

	}

}
