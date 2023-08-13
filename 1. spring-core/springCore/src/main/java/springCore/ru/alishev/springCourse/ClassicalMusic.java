package springCore.ru.alishev.springCourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("classicalMusic")
//@Scope("prototype")
public class ClassicalMusic implements Music {
	ClassicalMusic() {}
	
	public static ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}

	public void doMyInit() {
		System.out.println("Doing my initialization");
	
	}
	
	public void doMyDestroy() {
		System.out.println("Doing mty destruction");
	}
	
	
	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "Hungarian Rhapsody";
	}

}
