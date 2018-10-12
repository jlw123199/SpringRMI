package org.shirdrn.spring.remote.rmi;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiServer {

    private static final Logger LOG = Logger.getLogger(RmiServer.class);

    public static void main(String[] args) throws InterruptedException {
        //       new ClassPathXmlApplicationContext("org/shirdrn/spring/remote/rmi/server.xml");
        new ClassPathXmlApplicationContext("spring.xml");



        LOG.info("Servier is atarted");
        Object lock = new Object();
        synchronized (lock) {
            lock.wait();
        }
    }
}