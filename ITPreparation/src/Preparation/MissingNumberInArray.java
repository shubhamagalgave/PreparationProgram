package Preparation;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5};
		//sum=1+2+3+5
		//sum2=1+2+3+4+5
		//missing num   sum=sum2-sum1
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
		int sum2=0;
		for(int j=0;j<=5;j++)
		{
			sum2=sum2+j;
		}
		System.out.println(sum2);
		int sum=sum2-sum1;
		System.out.println("missing number is "+sum);
	
	

	}

}
