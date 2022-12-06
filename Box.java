package javas;

import java.util.Scanner;



	
	class MainThread extends Thread{
		public void run() {
			try {
				System.out.println("thread"+Thread.currentThread().getId()+"is running");
				
			
			}catch(Exception e) {
				System.out.println("Exception is caught");
			}
		}
	}
	class Box{
		public static void main(String[] args) {
		int n=3;
		for(int i=0;i<n;i++) {
			MainThread obj=new MainThread();
			obj.start();
		}
		}
		}
		
	


