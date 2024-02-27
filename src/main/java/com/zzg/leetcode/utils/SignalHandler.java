package com.zzg.leetcode.utils;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignalHandler {
    public static void main(String[] args) throws IOException {
        // 设置要执行的外部命令或脚本  
        String command = "/path/to/your/script.sh";  
          
        // 创建进程执行命令  
        Process process = Runtime.getRuntime().exec(command);  
          
        // 监听进程的输出流和错误流  
        BufferedReader outputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
          
        // 处理输出和错误信息  
        String line;  
        while ((line = outputReader.readLine()) != null) {  
            System.out.println(line);  
        }  
        while ((line = errorReader.readLine()) != null) {  
            System.err.println(line);  
        }  
          
        // 在接收到信号时执行特定的操作  
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {  
            System.out.println("Received shutdown signal.");  
            // 在这里执行你希望在接收到信号时进行的操作  
        }));  
    }  
}