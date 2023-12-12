import java.util.*;

class Books{
	String name,author;
	int count;
	Books(String name,String author,int count){
		this.name=name;
		this.author=author;
		this.count=count;
	}
}

class Customers{
	int id;
	String name,address;
	Customers(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
}

class BookStall{
	public static void print(Books books[],int n){
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.println(i+" "+books[i].name+" "+books[i].author+" "+books[i].count);
		}
		System.out.println();
	}
	public static void main(String ...args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter the no of books");
		int n=in.nextInt();
		System.out.println("Enter the books details ex : name author count");
		Books books[]=new Books[n];
		for(int i=0;i<n;i++){
			in.nextLine();
			String name=in.nextLine();
			String author=in.nextLine();
			int count=in.nextInt();
			books[i]=new Books(name,author,count);
		}
		System.out.println("enter the customer details ex: id name address");
		int id=in.nextInt();
		in.nextLine();
		String name=in.nextLine();
		String address=in.nextLine();
		Customers customer=new Customers(id,name,address);
		System.out.println("available Books\n Bookid   name    author    count");
		while(true){
			print(books,n);
			System.out.println("enter 1. buy books 2. exit");
			int op=in.nextInt();
			if(op==1){
				System.out.println("enter the books id and quantity");
				id=in.nextInt();
				int quantity=in.nextInt();
				if(books[id].count<quantity){
					System.out.println("quantity exeeded");
				}else{
					books[id].count-=quantity;
					System.out.println("Sold "+quantity+" Books with id : "+id+" remaining count "+books[id].count);
				}
			}else{
				break;
			}
		}
				
	}
}
