package com.zjm.simple_rpc;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.zjm.simple_rpc.client.RPCClient;
import com.zjm.simple_rpc.register.RegisterServer;
import com.zjm.simple_rpc.register.RegisterServerCenter;
import com.zjm.simple_rpc.servcice.HelloService;
import com.zjm.simple_rpc.servcice.HelloServiceImpl;

public class RPCTest2 {
 
    public static void main(String[] args) throws IOException {
        new Thread(new Runnable() {
            public void run() {
                try {
                    RegisterServer serviceServer = new RegisterServerCenter(8088);
                    serviceServer.register(HelloService.class, HelloServiceImpl.class);
                    serviceServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHi("test"));
    }
}