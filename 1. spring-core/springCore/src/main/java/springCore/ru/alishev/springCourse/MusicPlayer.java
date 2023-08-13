package springCore.ru.alishev.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class MusicPlayer {
	private Music music1;
	private Music music2;
	
	
	
	public MusicPlayer(@Qualifier("rockMusic") Music music1,@Qualifier("classicalMusic") Music music2) {
		super();
		this.music1 = music1;
		this.music2 = music2;
	}



	public void playMusic() {
		System.out.println("Playing: " + music1.getSong());
		System.out.println("Playing: " + music2.getSong());
	}
}
