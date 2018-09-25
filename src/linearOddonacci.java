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
			
			
			result=oddoNums[0]+oddoNums[1]+oddoNums[2];
			j=oddoNums[0];
			k=oddoNums[1];
			oddoNums[0]=result;
			oddoNums[1]=j;
			oddoNums[2]=k;
			return oddoNums;
		}
		
		
	}
	
	
	
	public static void main(String args[]) {
		try {
			PrintWriter pr = new PrintWriter("out.txt");
		
		for(int count=1;count<101;count=count+1) {
		
		startTime=System.currentTimeMillis();
		String a=Arrays.toString(linearOdd(count));
		endTime=System.currentTimeMillis();
		
		
		
		    pr.println("count: "+count+" "+a+" run time:"+(endTime-startTime)+"milliseconds");
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
