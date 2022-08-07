package com.www.nio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * @author evelyn0322
 * @Description
 * @Date 2022/8/7 11:10 上午
 */
public class Server {
    private Selector selector;
    private ServerSocketChannel ssChannel;
    private static final int PORT = 9999;

    private Server() {
        try {
            // 打开选择器
            this.selector = Selector.open();
            // 打开一个通道
            this.ssChannel = ServerSocketChannel.open();

            // 设置通道端口
            ssChannel.bind(new InetSocketAddress(PORT));

            // 设置通道为非阻塞模式
            ssChannel.configureBlocking(false);

            // 将通道注册到选择器
            ssChannel.register(selector, SelectionKey.OP_ACCEPT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

}
