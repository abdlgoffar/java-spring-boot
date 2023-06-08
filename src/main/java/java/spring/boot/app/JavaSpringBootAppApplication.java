package java.spring.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.spring.boot.app.components.Foo;

//untuk membuat spring boot application cukup memberikan annotation @SpringBootApplication.
//spring boot application adalah container dari spring sama seperti @Configuration pada umumnya pada spring core.
//pada @SpringBootApplication terdapat banyak annotation otomatis seperti @Configuration dan @ComponentScan.
//jadi pada intinya @SpringBootApplication adalah container spring boot.
@SpringBootApplication
public class JavaSpringBootAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run() merupakana application context sama sepe rti di spring core.
		//SpringApplication.run() akan menjalankan semua @Bean atau @Component yang terdapat pada container spring boot.
		SpringApplication.run(JavaSpringBootAppApplication.class, args);
	}


	///conto cara memasukkan, registrasi atau membuat bean langsung di dalam container spring boot .
	@Bean
	public Foo foo() {
		return new Foo();
	}
}
