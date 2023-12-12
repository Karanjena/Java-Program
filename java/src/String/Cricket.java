package String;

public class Cricket {
	String name;
	int number;
	int age;
	Cricket(String name,int number,int age){
		this.name=name;
		this.number=number;
		this.age=age;
		
	}
	@Override
	public String toString() {
		return "Cricket [name=" + name + ", number=" + number + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		Cricket c=new Cricket("Karan", 17, 22);
		Cricket c1=new Cricket("Rahul", 07, 24);	
		Cricket c2=new Cricket("Virat", 18, 34);
		Cricket c3=new Cricket("Rohit", 45, 35);
		Cricket c4=new Cricket("Karan", 17, 22);
		Cricket c5=new Cricket("Rahul", 07, 24);	
		Cricket c6=new Cricket("Virat", 18, 34);
		Cricket c7=new Cricket("Rohit", 45, 35);
		Cricket c8=new Cricket("Karan", 17, 22);
		Cricket c9=new Cricket("Rahul", 07, 24);	
		Cricket c10=new Cricket("Virat", 18, 34);
		Cricket c11=new Cricket("Rohit", 45, 35);
		Cricket [] a= {c,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11};
		for(int i=0 ; i<=a.length-1 ; i++) {
			System.out.println(a[i]);
		}
	}
}
