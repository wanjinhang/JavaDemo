package com.example.test.socket;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/26 21:56
 */
public class SocketTest {

    @Test
    public void test() throws UnknownHostException {
        byte[] addr = {(byte)192,(byte)168,24,56};
        InetAddress atguigu = InetAddress.getByAddress(addr);
        System.out.println(atguigu);

    }
}
