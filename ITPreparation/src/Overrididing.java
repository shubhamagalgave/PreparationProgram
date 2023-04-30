class Animal1
{
	public void Move()
	{
		System.out.println("Animal Can Move");
	}
}
class Dog extends Animal1
{
	public void Move() 
	{
		//super.Move();
		System.out.println("Dog Can Walk & Run");
	}

	public void Bark() 
	{
		System.out.println("Dog Can Bark");
	}
}
public class Overrididing {

	public static void main(String[] args) 
	{
		Animal1 a =new Animal1();
		a.Move();
		Dog d = new Dog();
		d.Move();
		d.Bark();
		Animal1 a1 =new Dog();
		a1.Move();
	}

}
