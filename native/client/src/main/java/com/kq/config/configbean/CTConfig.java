package com.kq.config.configbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Config
 *
 * @author kq
 * @date 2019/3/10
 */
@Component
@ConfigurationProperties(prefix="ctservice")
public class CTConfig {

    private String version;
    private String info;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "CTConfig{" +
                "version='" + version + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
