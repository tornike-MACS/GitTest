import acm.program.ConsoleProgram;

public class AnimalSample extends ConsoleProgram{
	public void run() {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		a.eat();
		c.meww();
		d.bark();
		
	}
}