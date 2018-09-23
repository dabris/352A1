
public class A1 {
	private static int i;
	private static int j;
	private static int k;
	private static int[] oddoNums = {-1,-1,-1};
	public static int[] linearOdd(int x){
		switch (x) {
		case 3: oddoNums[2]=1;
		case 2: oddoNums[1]=1;
		case 1: oddoNums[0]=1;
		break;
		}
		return oddoNums;
	}

}
