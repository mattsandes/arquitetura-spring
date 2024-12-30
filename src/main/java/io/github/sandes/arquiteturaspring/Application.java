package io.github.sandes.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

		builder.bannerMode(Banner.Mode.OFF); //desativa o banner do spring;
		builder.profiles("producao", "homologacao"); //subir a aplicação com perfis diferentes;

		builder.run(args);

		ConfigurableApplicationContext applicationContext = builder.context(); //captura o contexto da aplicacao

		//var produtoRepository = applicationContext.getBean("produtoRepository"); //forma de pegar algum bean que esteja no contexto da aplicaçao;
		//System.out.println(produtoRepository);

	}

}
