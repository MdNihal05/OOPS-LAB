import java.util.*;

public class Quadratic{
	public static void main(String ...args){
		System.out.println("enter the coefficients a b c : ");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double det=b*b-4*a*c;
		double detabs=Math.sqrt(Math.abs(det));
		double rootimaginary=detabs/(2.0*a);
		double rootreal=-b/(2.0*a);
		if(det<0){
			System.out.println(rootreal+"+i"+rootimaginary);
			System.out.println(rootreal+"-i"+rootimaginary);
		}else{
			System.out.println(rootreal+rootimaginary);
			System.out.println(rootreal-rootimaginary);
		}
	}
}
