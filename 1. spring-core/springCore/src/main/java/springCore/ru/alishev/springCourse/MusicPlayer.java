package springCore.ru.alishev.springCourse;

// в этом классе применим архитектуру инверсии управления
public class MusicPlayer {
	private Music music;
	
	private String name;
	private int volume;
	
	public MusicPlayer(Music music) {
		this.music = music;
	}

	public MusicPlayer() {
	}

	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
	
}
