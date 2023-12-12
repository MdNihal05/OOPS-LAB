import java.util.*;

class ReverseString{
	public static void main(String ...args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev+=s.charAt(i);
		}
		System.out.println(rev);
	}
}
