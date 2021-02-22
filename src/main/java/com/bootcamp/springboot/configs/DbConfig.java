package com.bootcamp.springboot.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DbConfig {

    private String url;
    private String username;
    private String password;
    private String driverClassName;

    public String getServer() {
        return this.url;
    }

    public void setServer(String _serverName) {
        this.url = _serverName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String _username) {
        this.username = _username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String _password) {
        this.password = _password;
    }

    public String getDatabase() {
        return this.driverClassName;
    }

    public void setDatabase(String _database) {
        this.driverClassName = _database;
    }

    @Profile("dev")
    @Bean

    public String getDevMessage() {
        return "You are in Dev Environment";
    }

    @Profile("uat")
    @Bean

    public String getUatMessage() {
        return "You are in UAT Environment";
    }
}
