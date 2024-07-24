import com.example.demo.FirstService;
import com.example.demo.SecondService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("singleton")
    public FirstService first()
    {
        return new FirstService();
    }
    @Bean
    @Scope("prototype")
    public SecondService second()
    {
        return new SecondService();
    }
}
