
public class A1 {
	
	private static int[] oddoNums = {-1,-1,-1};
	private static int i=oddoNums[0];
	private static int j=oddoNums[1];
	private static int k=oddoNums[2];

	public static int[] linearOdd(int x){
		
		switch (x) {
		case 3: oddoNums[2]=1;
		case 2: oddoNums[1]=1;
		case 1: oddoNums[0]=1;
		return oddoNums;
		}
		
		if(x<=0) {
			return oddoNums;
		}
		
			oddoNums=linearOdd(x-1);
			oddoNums[0]=i+j+k;
			oddoNums[1]=j+k;
			oddoNums[2]=j;
			return oddoNums;
		
	}
	
	

}
