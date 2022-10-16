package pl.javasolution.config;

import api.IOrder;
import api.IPizza;
import implementation.GoodPizza;
import implementation.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public IPizza pizza(){
        return new GoodPizza(35,"Pinsa");
    }
    @Bean
    public IOrder order (){
        return new Order(pizza());
    }
}
