package sampleworkout;

public class Arraytrialsum {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2},{1,2}};
		int b[][]= {{1,2},{1,2}};
		int i;
		int j;
		int sum=0;
		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=a.length-1;j++)
			{
				sum=a[i][j]+b[i][j];
				System.out.print(" " +sum);

			}
			System.out.println(" ");
		}
	}

}
