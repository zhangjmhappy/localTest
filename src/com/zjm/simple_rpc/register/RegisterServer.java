package com.zjm.simple_rpc.register;

import java.io.IOException;

public interface RegisterServer {

	public void stop();

	public void start() throws IOException;

	public void register(Class serviceInterface, Class impl);

	public boolean isRuning();

	public int getPort();
}
