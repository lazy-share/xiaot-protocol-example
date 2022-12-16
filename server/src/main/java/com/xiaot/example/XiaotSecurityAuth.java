package com.xiaot.example;

import com.alibaba.fastjson.JSONObject;
import com.xiaot.protocol.custom.XiaotSecurityAuthProvide;
import com.xiaot.protocol.pojo.XiaotSecurity;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 *
 * </p>
 *
 * @author lzy
 * @since 2021/9/7.
 */
@Slf4j
public class XiaotSecurityAuth implements XiaotSecurityAuthProvide {

    @Override
    public String isAllow(XiaotSecurity security) {
//        if ("127.0.0.1".equals(security.getRemoteAddress().getAddress().getHostAddress())){
//            return "不合法IP请求";
//        }
        return null;
    }
}
