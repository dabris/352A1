import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class A1 {
	
	private static int[] oddoNums = {1,1,1};
	private static int i;
	private static int j;
	private static int k;
	

	public static int[] linearOdd(int x){
		
		if(x<=3) {
		return oddoNums;
		}else {
		
			oddoNums=linearOdd(x-1);
			
			
			i=oddoNums[0]+oddoNums[1]+oddoNums[2];
			j=oddoNums[0];
			k=oddoNums[1];
			oddoNums[0]=i;
			oddoNums[1]=j;
			oddoNums[2]=k;
			return oddoNums;
		}
		
		
	}
	
	public static void printX( String x)  {
		
		try {
			PrintWriter pr = new PrintWriter("out.txt");
		    pr.println(x);
		}catch(FileNotFoundException e) {
			e.getMessage();
		}
		
	}
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(linearOdd(6)));
	}

}
