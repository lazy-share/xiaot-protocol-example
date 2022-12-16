package com.xiaot.example;

import com.xiaot.protocol.bootstrap.XiaotClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * </p>
 *
 * @author lzy
 * @since 2021/5/30.
 */
@Configuration
public class ClientConfig {

    @Bean
    public XiaotClient xiaotClient() {
        return new XiaotClient("localhost", 9000);
    }

}
