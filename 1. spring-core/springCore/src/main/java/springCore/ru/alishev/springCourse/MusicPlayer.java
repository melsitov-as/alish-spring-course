package springCore.ru.alishev.springCourse;

// в этом классе применим архитектуру инверсии управления
public class MusicPlayer {
	private Music music;
	
	
	public MusicPlayer(Music music) {
		this.music = music;
	}

	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}
}
