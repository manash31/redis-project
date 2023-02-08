package com.manash.workflow;

import com.manash.workflow.delegate.RedisDelegation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.Jedis;

import java.util.Arrays;

@SpringBootApplication
public class Application {


  public static void main(String... args) {
   SpringApplication.run(Application.class, args);
  }
}