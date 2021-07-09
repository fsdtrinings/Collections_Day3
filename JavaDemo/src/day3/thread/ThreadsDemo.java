package day3.thread;

// common resource
class Printer {
	public void doPrint(String fileInfo) {

		System.out.println(" Auth - Code for User");
		System.out.println(" Logging ");

		synchronized (this) {

			System.out.println("*** Page Start ****");
			try {
				System.out.println(fileInfo);
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}

			System.out.println("*** Page End ****");
		}

		System.out.println(" Resource deallocation code ");
	}
}

class Users extends Thread {

	Printer p;
	Thread t;
	String fileInfo;

	public Users(Printer p, String fileInfo) {
		this.p = p;
		this.fileInfo = fileInfo;
		new Thread(this).start();
		;
	}

	public void run() {
		p.doPrint(fileInfo);
	}
}

public class ThreadsDemo {

	public static void main(String[] args) {

		Printer hpPrinter = new Printer();

		new Users(hpPrinter, "Java-doc"); // user-mike
		new Users(hpPrinter, "SFDC-doc"); // user-Jenny
		new Users(hpPrinter, "Spring-doc"); // user-john

	}
}
