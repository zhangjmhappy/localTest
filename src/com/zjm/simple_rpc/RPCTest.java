package com.zjm.simple_rpc;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.zjm.simple_rpc.client.RPCClient;
import com.zjm.simple_rpc.register.RegisterServer;
import com.zjm.simple_rpc.register.RegisterServerCenter;
import com.zjm.simple_rpc.servcice.HelloService;
import com.zjm.simple_rpc.servcice.HelloServiceImpl;

public class RPCTest {
 
    public static void main(String[] args) throws IOException {
     
        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHi("test111"));
    }
}