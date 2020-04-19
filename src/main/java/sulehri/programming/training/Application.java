package sulehri.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public Application() {
		System.out.println("Inside application");
	}
	
	public void greet() {
		List<String> greetings=new ArrayList<String>();
		greetings.add("Hello World");
		for(String greeting:greetings) {
			System.out.println(greeting);
		}
	}
	public static void main(String[] args) {
		System.out.println("Starting application");
		
		Application app=new Application();
		app.greet();
	}

}
