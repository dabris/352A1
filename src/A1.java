import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class A1 {
	
	
	private static int[] oddoNums = {1,1,1};
	private static int result;//result stored in this variable
	private static int j;
	private static int k;
	private static double startTime;
	private static double endTime;

	public static int[] linearOdd(int x){
		
		if(x<=0) {
			int[] error= {-1};
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
		
		startTime=System.currentTimeMillis();
		String a=Arrays.toString(linearOdd(20));
		endTime=System.currentTimeMillis();
		
		
		try {
			PrintWriter pr = new PrintWriter("out1.txt");
		    pr.println(a+" run time:"+(endTime-startTime));
		    pr.close();
		}catch(FileNotFoundException e) {
			e.getMessage();
		}
		
		
		
	}

}
