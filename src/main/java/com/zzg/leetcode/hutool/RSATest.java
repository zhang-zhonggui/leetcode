package com.zzg.leetcode.hutool;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import org.springframework.util.StringUtils;

public class RSATest {
    public static void main(String[] args) {
        RSA rsa = new  RSA();
        byte[] encrypt = rsa.encrypt(StrUtil.bytes("123456", CharsetUtil.CHARSET_UTF_8), KeyType.PublicKey);
        byte[] decrypt = rsa.decrypt(encrypt, KeyType.PrivateKey);
        String str = StrUtil.str(decrypt, CharsetUtil.CHARSET_UTF_8);
        System.out.println(str);

    }
}
