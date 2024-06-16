package com.sysftech.erp.common.dto;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;
import lombok.Data;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 需要签名的参数都要继承这个类
 * @author xuyan
 * @since 2024-06-16
 */
@Data
public class BaseSignDto {

    String sign;
    Integer timestamp;
    String nonce;
    String appId;

    public void init() {
        this.nonce = RandomUtil.randomString(10);
        this.timestamp = (int)(System.currentTimeMillis() / 1000);
        Field[] fields = ReflectUtil.getFields(this.getClass());

        SortedMap<String, String> sortedMap = new TreeMap<>();
        for(Field field : fields){
            if(field.getName().equals("sign")){
                continue;
            }

            Object value = ReflectUtil.getFieldValue(this, field.getName());
            if(value != null){
                sortedMap.put(field.getName(), value.toString());
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String key : sortedMap.keySet()){
            sb.append(key).append("=").append(sortedMap.get(key)).append("&");
        }
        Sign sign = SecureUtil.sign(SignAlgorithm.MD5withRSA);
        String signStr = sb.substring(0, sb.length()-1).toLowerCase();
        System.out.println(signStr);
        byte[] n1 = sign.sign(signStr);
        this.sign = Base64.encode(n1);
        System.out.println(this.sign);

        // 验签
        byte[] s1 =  this.sign.getBytes();

        if (sign.verify(signStr.getBytes(), s1)){
            System.out.println("验签成功");
        }
    }
}

