package com.kq.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * GitConfigServer
 *
 * @author kq
 * @date 2019/3/10
 */

@SpringBootApplication
@EnableConfigServer
public class GitConfigServer {

    public static void main(String args[]) {
        SpringApplication.run(GitConfigServer.class,args);
    }

}
