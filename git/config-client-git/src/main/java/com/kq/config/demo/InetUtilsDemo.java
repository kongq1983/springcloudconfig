package com.kq.config.demo;

import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;

import java.net.InetAddress;

/**
 * InetUtilsDemo
 *
 * @author kq
 * @date 2019-03-11
 */
public class InetUtilsDemo {

    public static void main(String args[]) {

        InetUtilsProperties p = new InetUtilsProperties();
        InetUtils u = new InetUtils(p);
        InetAddress address = u.findFirstNonLoopbackAddress();

        System.out.printf("address=%s",address);

    }

}
