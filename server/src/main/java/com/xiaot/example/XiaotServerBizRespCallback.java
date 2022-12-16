package com.xiaot.example;

import com.alibaba.fastjson.JSONObject;
import com.xiaot.protocol.constant.Command;
import com.xiaot.protocol.custom.XiaotServerBizReqCallbackProvide;
import com.xiaot.protocol.pojo.XiaotHeader;
import com.xiaot.protocol.pojo.XiaotMessage;
import com.xiaot.protocol.util.ChannelWriteUtil;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author lzy
 * @since 2021/5/30.
 */
@Slf4j
public class XiaotServerBizRespCallback implements XiaotServerBizReqCallbackProvide {


    @Override
    public void execute(Object body, Map<String, Object> headerMap, ChannelHandlerContext ctx) {

        log.info("server receive message body: " + JSONObject.toJSONString(body));
//        XiaotMessage message = (XiaotMessage) body;
        XiaotHeader header = new XiaotHeader();
        header.setCommand(Command.BIZ_RESP.getVal());
        Map<String, Object> attr = new HashMap<>();
        attr.put("msgType", "example");
        header.setAttribute(attr);
        XiaotMessage message = new XiaotMessage();
        message.setHeader(header);
        message.setBody("server response msg....");

        log.info("server response message: " + JSONObject.toJSONString(message));
        ChannelWriteUtil.write(ctx.channel(), message, future -> {
            if (future.isSuccess()) {
                log.debug("server response biz success...");
            } else {
                log.error("server response biz fail..", future.cause());
            }
        });
    }


}
