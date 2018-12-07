package top.myjnxj.lotteryexposer.conf;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;


/**
 * @ClassName RedisConfig
 * @Description TODO
 * @Author 江南小俊
 * @Date 2018/11/4 20:35
 * @Version 1.0.0
 **/
@Configuration
public class RedisConfig {

    @Bean("redisTemplate")
    public RedisTemplate<String,String> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String,String> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new StringRedisSerializer());
        return template;
    }


}
