import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class linearOddonacci {
	
	
	private static double[] oddoNums = {1,1,1};
	private static double result;//result stored in this variable
	private static double j;
	private static double k;
	private static double startTime;
	private static double endTime;

	public static double[] linearOdd(int x){
		
		if(x<=0) {
			double[] error= {-1};
			return error;
					
		}
		
		if(x<=3) {
		return oddoNums;
		}else {
		
			oddoNums=linearOdd(x-1);
			
			//add the previous 3 numbers to obtain the new value
			result=oddoNums[0]+oddoNums[1]+oddoNums[2];
			//store the last 2 values into j and k
			j=oddoNums[0];
			k=oddoNums[1];
			//replace the current value with result, and the two previous values with j and k
			oddoNums[0]=result;
			oddoNums[1]=j;
			oddoNums[2]=k;
			return oddoNums;
		}
		
		
	}
	
	
	
	public static void main(String args[]) {
		try {
			PrintWriter pr = new PrintWriter("out.txt");
		
		for(int count=5;count<101;count=count+5) {
		
		startTime=System.nanoTime();
		double a=linearOdd(count)[0];
		endTime=System.nanoTime();
		
		
		
		    pr.println("Oddonacci("+count+") result: "+a+"\nrun time:"+(endTime-startTime)+" nanoseconds\n");
		   //reset value
		    oddoNums[0]=1;
		    oddoNums[1]=1;
		    oddoNums[2]=1;
		   
		    if(count==100) {
		    pr.close();
		    }
		  }
		}catch(FileNotFoundException e) {
			e.getMessage();
		}
		
		
		
	}

}
