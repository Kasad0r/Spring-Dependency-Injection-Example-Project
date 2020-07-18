package kasad0r.dispring.config;

import kasad0r.dispring.examplebeans.FakeDataSource;
import kasad0r.dispring.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
/*@PropertySources({
        @PropertySource("classpath:jms.properties"),
        @PropertySource("classpath:datasource.properties")
})*/
public class PropertyConfig {
/*  @Autowired
    Environment env;*/

    @Value("${db.username}")
    String user;
    @Value("${db.password}")
    String password;
    @Value("${db.url}")
    String url;
    @Value("${jms.username}")
    String jmsUsername;
    @Value("${jms.password}")
    String jmsPassword;
    @Value("${jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        return new FakeDataSource(user, password, url);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        return new FakeJmsBroker(jmsUsername, jmsPassword, jmsUrl);
    }
}
