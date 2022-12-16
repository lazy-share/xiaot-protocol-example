package com.xiaot.example;

import com.alibaba.fastjson.JSONObject;
import com.xiaot.protocol.custom.XiaotClientBizRespCallbackProvide;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author lzy
 * @since 2021/9/7.
 */
@Slf4j
public class XiaotClientCallback implements XiaotClientBizRespCallbackProvide {

    public XiaotClientCallback() {
        log.info("instance XiaotClientCallback");
    }

    @Override
    public void execute(Object body, Map<String, Object> headerMap, ChannelHandlerContext ctx) {
        log.info("异步接收到服务端响应消息body：" + JSONObject.toJSONString(body) + " , \nheaderMap：" + JSONObject.toJSONString(headerMap));
        log.info("异步接收到服务端响应消息headerMap：" + JSONObject.toJSONString(headerMap));
    }
}
