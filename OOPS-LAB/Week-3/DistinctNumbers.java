import java.util.*;

class DistinctNumbers{

	public static void main(String ...args){
		Scanner in=new Scanner(System.in);
		int count=0;
		int arr[]=new int[6];
		for(int i=0;i<5;i++) arr[i]=-1;
		System.out.println("enter number in range [10,100]");
		for(int i=0;i<5;i++){
			int n=in.nextInt();
			if(n<10 || n>100){
				System.out.println("enter number in range [10,100]");
			}
			Boolean found=false;
			for(int j=0;j<5;j++){
				if(arr[j]==n){
					found=true;
					break;
				}
			}
			if(found==false){
				arr[count]=n;
				count++;
			}
			for(int j=0;j<5;j++){
				if(arr[j]>=0) System.out.print(arr[j]+" ");	
			}
			System.out.println();
		}
	}
}
