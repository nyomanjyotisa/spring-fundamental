package id.jyotisa.learnspring;

import id.jyotisa.learnspring.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DuplicateConfiguration {

    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }

}
