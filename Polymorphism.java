
//Run-time Polymorphism example:
class Animal
{
	public void move()
	{
		System.out.println("Animals can move");
	}
}
class Dog extends Animal
{
	public void move()
	{
		System.out.println("Dogs can walk and run");
	}
}
public class TestDog 
{
	public static void main(String[] args) 
	{
		Animal a = new Animal();
		Animal b = new Dog();
		a.move();
		b.move();
	}
}


/* Output:

Animals can move
Dogs can walk and run

*/
