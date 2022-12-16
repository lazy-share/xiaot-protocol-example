package com.xiaot.example;

import com.xiaot.protocol.bootstrap.XiaotServer;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author lzy
 * @since 2021/6/1.
 */
@Component
public class ServerConfig implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new XiaotServer().bind(9000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
