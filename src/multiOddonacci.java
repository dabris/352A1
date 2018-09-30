import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class multiOddonacci {
	private static double startTime;
	private static double endTime;

	public static double multiOdd(int x){
		if(x<=0)
			return 0;
		
		if(x<=3)
		return 1;
		else {
			return multiOdd(x-3) +multiOdd(x-2)+multiOdd(x-1);
		}
		
	}
	
	public static void main(String[] args) {
		try {
			PrintWriter pr = new PrintWriter("out1.txt");
		
		for(int count=5;count<=40;count=count+5) {
		
		startTime=System.nanoTime();
		double a=multiOdd(count);
		endTime=System.nanoTime();
		    pr.println("Oddonacci("+count+") result: "+a+"\nrun time:"+(endTime-startTime)+" nanoseconds\n");
		    System.out.println(a);
		    if(count>=40) {
				pr.close();
			}
		}
		}catch(FileNotFoundException e) {
			e.getMessage();
		}
		
	}
		
}

