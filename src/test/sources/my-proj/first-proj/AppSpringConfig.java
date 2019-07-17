package my-proj.first-proj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

/**
 * Base configuration for spring
 */
@Configuration
@ComponentScan("my-proj.first-proj")
public class AppSpringConfig
{
}
