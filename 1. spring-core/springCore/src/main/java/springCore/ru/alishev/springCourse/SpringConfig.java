package springCore.ru.alishev.springCourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springCore.ru.alishev.springCourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
