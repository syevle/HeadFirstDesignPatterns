package GangOfFour.myexample.structural.proxy_protection_proxy;

public class Client {
	public static void main(String[] args) {
		new Client().folderAccess();
	}

	private void folderAccess() {
		System.out
				.println(this.getClass()
						+ " : Client passing user with designation 'CEO' to folderproxy");
		User john = new User("John", "John123", "CEO");
		FolderProxy folderProxy = new FolderProxy(john);
		folderProxy.performReadOrWriteOperations();
		System.out
				.println("\n************************************************************           ***********************\n");
		System.out
				.println(this.getClass()
						+ " : Client passing user with designation 'Developer' to folderproxy");
		User raj = new User("Raj", "Raj123", "Developer");
		FolderProxy folderProxyWrong = new FolderProxy(raj);
		folderProxyWrong.performReadOrWriteOperations();
	}
}
/*

class GangOfFour.myexample.structural.proxy_protection_proxy.Client : Client passing user with designation 'CEO' to folderproxy
class GangOfFour.myexample.structural.proxy_protection_proxy.FolderProxy : Folder Proxy makes call to the RealFolder 'performReadOrWriteOperations method'
class GangOfFour.myexample.structural.proxy_protection_proxy.Folder : Performing read or write operation on the folder

		************************************************************           ***********************

class GangOfFour.myexample.structural.proxy_protection_proxy.Client : Client passing user with designation 'Developer' to folderproxy
class GangOfFour.myexample.structural.proxy_protection_proxy.FolderProxy: Folder proxy says 'You don't have access to this folder'
*/