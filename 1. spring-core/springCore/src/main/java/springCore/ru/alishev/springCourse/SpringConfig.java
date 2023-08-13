package springCore.ru.alishev.springCourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("springCore.ru.alishev.springCourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
	// создадим бин для жанров музыки
	@Bean
	public ClassicalMusic classicalMusic() {
		return new ClassicalMusic();
	};
	
	@Bean 
	public RockMusic rockMusic() {
		return new RockMusic();
 	}
	
	@Bean 
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(rockMusic(), classicalMusic());
	}
}
