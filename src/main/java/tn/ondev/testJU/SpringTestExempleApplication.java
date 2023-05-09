package tn.ondev.testJU;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import tn.ondev.configuration.FooConfig;

@SpringBootApplication
@ComponentScan(basePackages = "tn.ondev")
@EnableEncryptableProperties
public class SpringTestExempleApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringTestExempleApplication.class);
	@Autowired
    FooConfig fooProperties;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTestExempleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info(fooProperties.toString());
	}

}
