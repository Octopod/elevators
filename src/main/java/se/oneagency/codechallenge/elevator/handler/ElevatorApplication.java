package se.oneagency.codechallenge.elevator.handler;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Preconfigured Spring Application boot class.
 *
 */
@Configuration
@ComponentScan(basePackages = { "se.oneagency.codechallenge.elevator" })
@EnableAutoConfiguration
@org.springframework.context.annotation.PropertySources({ @PropertySource("classpath:application.properties") })
public class ElevatorApplication {

    @Value("${se.oneagency.elevator.numberofelevators}")
    private int numberOfElevators;

    /**
     * Start method that will be invoked when starting the Spring context.
     *
     * @param args
     *            Not in use
     */
    public static void main(final String[] args) {
        new SpringApplication(ElevatorApplication.class).run(args);
    }


    /**
     * Create a default thread pool for your convenience.
     *
     * @return Executor thread pool
     */
    @Bean
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(numberOfElevators);
    }

    /**
     * Create an event bus for your convenience.
     *
     * @return EventBus for async task execution
     */
    @Bean
    public EventBus eventBus() {
        return new AsyncEventBus(Executors.newCachedThreadPool());
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }

}
