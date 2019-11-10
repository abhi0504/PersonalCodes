package oops;

class phone
{
	int price,ram,rom;
	String color;
	boolean flash;
	public void Desc()
	{
		System.out.println("price"+ price + "color" + color + "ok");
	}
}
class laptops
{
	int price,ram,rom;
	String color;
	boolean flash;
	public void Desci()
	{
		System.out.println("price"+ price + "color" + color + "ok");
	}
}
public class MainClass {
	public static void main(String[] args)
	{
		System.out.println("Now we are starting our classes and objects in JAVA");
		phone iphone = new phone();
		iphone.price = 90000;
		iphone.color = "black";
		iphone.Desc();
		iphone.Desc();
		
	}

}
