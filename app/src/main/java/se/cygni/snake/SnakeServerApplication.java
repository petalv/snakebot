package se.cygni.snake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import se.cygni.snake.api.GameMessageParser;
import se.cygni.snake.api.request.RegisterPlayer;

import java.io.IOException;
import java.util.Arrays;

@SpringBootApplication
public class SnakeServerApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SnakeServerApplication.class, args);
    }
}
