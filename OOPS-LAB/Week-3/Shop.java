import java.util.*;

class Items{
	double price;
	int quantity;
	String name;
	Items(String name,int quantity,double price){
		this.price=price;
		this.quantity=quantity;
		this.name=name;
	}
}
public class Shop{
	public static void main(String ...args){
	
		Scanner sc=new Scanner(System.in);
		

		System.out.println("enter the items in the shop ex: name quantity price");
		Items arr[]=new Items[5];
		
		arr[0]=new Items("A",100,99.90);
		arr[1]=new Items("B",100,20.20);
		arr[2]=new Items("C",100,6.87) ;
		arr[3]=new Items("D",100,45.50);
		arr[4]=new Items("E",100,40.49);
		
		for(int i=0;i<5;i++){
			System.out.println(i+1+" "+arr[i].name+" "+arr[i].quantity+" "+arr[i].price);
		}
		System.out.println("enter the items you want to purchase ex: product_id quantity");
		System.out.println("enter 9 9 to get total bill");
		double total=0.0;
		while(true){
			int id=sc.nextInt(); id--;
			int quantity=sc.nextInt(); 
			Boolean flag=false;
			switch(id){
				case 0:
					double a=quantity*arr[id].price;
					System.out.println("product id = "+(id+1)+" quantity = "+quantity+" net total ="+a);
					total+=a;
					break;
				case 1:
					double b=quantity*arr[id].price;
					System.out.println("product id = "+(id+1)+" quantity = "+quantity+" net total ="+b);
					total+=b;
					break;
				case 2:
					double c=quantity*arr[id].price;
					System.out.println("product id = "+(id+1)+" quantity = "+quantity+" net total ="+c);
					total+=c;
					break;
				case 3:
					double d=quantity*arr[id].price;
					System.out.println("product id = "+(id+1)+" quantity = "+quantity+" net total ="+d);
					total+=d;
					break;
				case 4:
					double e=quantity*arr[id].price;
					System.out.println("product id = "+(id+1)+" quantity = "+quantity+" net total ="+e);
					total+=e;
					break;
				default :
					System.out.println("Total Bill = "+total);
					flag=true;
					break;
			}
			if(flag==true){
				break;
			}
		}
		
	}
}
