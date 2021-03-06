package com.along.config.ftp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description: ftp信息配置
 * @Author along
 * @Date 2019/4/11 17:23
 */
@Component
@ConfigurationProperties(prefix = "ftp")
public class FtpConfig {

    /**
     * 服务器ip地址
     */
    private String ftp_address;

    /**
     * 端口号
     */
    private int ftp_port;

    /**
     * 用户名
     */
    private String ftp_username;

    /**
     * 密码
     */
    private String ftp_password;

    /**
     * 基本路径
     */
    private String ftp_basePath;

    /**
     * 报表导出
     */
    private String ftp_export;

    public String getFtp_address() {
        return ftp_address;
    }

    public void setFtp_address(String ftp_address) {
        this.ftp_address = ftp_address;
    }

    public int getFtp_port() {
        return ftp_port;
    }

    public void setFtp_port(int ftp_port) {
        this.ftp_port = ftp_port;
    }

    public String getFtp_username() {
        return ftp_username;
    }

    public void setFtp_username(String ftp_username) {
        this.ftp_username = ftp_username;
    }

    public String getFtp_password() {
        return ftp_password;
    }

    public void setFtp_password(String ftp_password) {
        this.ftp_password = ftp_password;
    }

    public String getFtp_basePath() {
        return ftp_basePath;
    }

    public void setFtp_basePath(String ftp_basePath) {
        this.ftp_basePath = ftp_basePath;
    }

    public String getFtp_export() {
        return ftp_export;
    }

    public void setFtp_export(String ftp_export) {
        this.ftp_export = ftp_export;
    }

}
