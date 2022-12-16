package com.xiaot.example;

import com.xiaot.protocol.bootstrap.XiaotClient;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>
 *
 * </p>
 *
 * @author lzy
 * @since 2021/5/30.
 */
@Slf4j
@RestController
public class HelloController {

    @Autowired
    XiaotClient xiaotClient;

    AtomicInteger count = new AtomicInteger();

    @GetMapping("/sayHello")
    public String sayHello() throws Exception {

        List<String> likes = new LinkedList<>();
        likes.add("11111111111");
        likes.add("2222222222222");
        likes.add("11111111333333333333333111");
        likes.add("555555555555555555555");
        likes.add("666666666666666666");
        Hello hello = new Hello();
        hello.setAge(28)
                .setLikes(likes)
                .setName("testxxx")
                .setPrice(33333.999)
                .setVersion(11332432413L);

        Map<String, Object> header = new HashMap<>();
        header.put("msgType", "aaaaaaaaaa");
        header.put("msgSize", "111111111111111111111111111");
        xiaotClient.sendMessage(hello, header, new GenericFutureListener<Future<? super Void>>() {
            @Override
            public void operationComplete(Future<? super Void> future) throws Exception {
                if (future.isSuccess()) {
                    count.addAndGet(1);
                } else {
                    log.error("发送失败");
                }
            }
        });
        return "ok";
    }

}
