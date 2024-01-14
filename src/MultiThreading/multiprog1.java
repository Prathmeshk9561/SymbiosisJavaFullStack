package MultiThreading;

//**Thread -****
//1 .multiple threads work for a program/process it is a executing
//2. thread share same address space
//3. switching between thread is easy than between process

//***Process -*********
//
//
//Multiprocessing - 
// Thread -
//		* A thread is an independent sequential path of execution within a program

public class multiprog1 {
	 public void run(){
		for (int i = 0; i < 6; i++) {
			System.out.println("Inside the thread "+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread is Starting");
		Thread t = new Thread("");
		t.start();
		System.out.println("main is Exiting");	
	}
}