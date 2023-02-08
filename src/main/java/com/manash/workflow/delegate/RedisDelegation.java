package com.manash.workflow.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import redis.clients.jedis.Jedis;

public class RedisDelegation implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        try {
         System.out.println("Hello Delegate");

            Jedis jedis = new Jedis("http://localhost:6379");
            System.out.println("Connected");
            jedis.set("Name2","Manash");
            System.out.println(jedis.get("Name2"));

        } catch(Exception e){
            System.out.println("From Catch of Exception");
        }
    }
}
