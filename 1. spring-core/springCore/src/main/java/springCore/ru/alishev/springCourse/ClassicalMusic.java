package springCore.ru.alishev.springCourse;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music {
	private ClassicalMusic() {}
	
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
