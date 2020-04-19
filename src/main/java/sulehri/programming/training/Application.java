package sulehri.programming.training;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

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
		
		System.out.println(app.countWords("A quick brown fox jumps over the lazy dog"));
	}
	
	public int countWords(String words) {
		String[] seperateWords=StringUtils.split(words);
		return seperateWords==null ?0 : seperateWords.length;
	}

}
