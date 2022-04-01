package id.jyotisa.learnspring;

import id.jyotisa.learnspring.data.Bar;
import id.jyotisa.learnspring.data.Foo;
import id.jyotisa.learnspring.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("foo2") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }

}
