package FibNo;
public class FibNumbers {


	//Functions are created at beginning, 
	//First recursive and then iterative.
	
	
	public static long fib(int n) {

		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else {
		return fib(n-1)+fib(n-2);
		
		}
		
	}
		

	public static long fibo(long n) {
		
		long next = 44; 	
		long first = 0;
		long second = 1;
		
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else {
			for (int i=2;i<=n;i++) {
				next = first  + second;
				first = second;
				second = next;
				
			}
		}
			
		return next;
			
			}
		
	
	
	public static void main(String[] args) {


		long startTime=System.nanoTime();
		long endTime;
		//System.out.println("Start Time: " + startTime);
		
		
		startTime=System.nanoTime();
		System.out.println(fib(1));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run of 1: " + (endTime-startTime) + " Nanoseconds");
		System.out.println("\n");
		
		startTime=System.nanoTime();
		System.out.println(fib(6));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run of 6: " + (endTime-startTime) + " Nanoseconds");
		System.out.println("\n");
		
		startTime=System.nanoTime();
		System.out.println(fib(15));
		endTime=System.nanoTime();
		
		
		System.out.println("Time Taken For recursive run of 15: " + (endTime-startTime) + " Nanoseconds");
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fib(30));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run of 30: " + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fib(41));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run of 41: " + (endTime-startTime) + " Nanoseconds");
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fib(45));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run of 45: " + (endTime-startTime) + " Nanoseconds");
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fib(50));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run of 50: " + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(1));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run of 1: " + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(6));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run of 6: " + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(15));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run of 15: " + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(30));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run of 30: " + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(41));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run of 41: " + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(45));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run of 45: " + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(50));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run of 50: " + (endTime-startTime) + " Nanoseconds");
		
		
	}

	
	
	
	
}