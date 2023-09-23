package xyz.devkey.app;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "xyz.devkey")
@MapperScan(basePackages = "xyz.devkey.mapper")
public class SpringBootThymleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootThymleafApplication.class, args);  }

}
