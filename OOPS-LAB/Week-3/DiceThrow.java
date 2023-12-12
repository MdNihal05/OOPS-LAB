import java.util.*;

class Dices{

	public static void main(String ...args){
		Scanner in=new Scanner(System.in);
		Random R=new Random();
		int successfull=0;
		for(int i=1;i<=10;i++){
			int roll1=R.nextInt(6)+1;
			int roll2=R.nextInt(6)+1;
			//System.out.println(roll1+" "+roll2);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				throw new RuntimeException(e);
			}
			if(roll1==roll2){
				successfull++;
			}
		}
		System.out.println("Success throws : "+successfull);
	}
}
