package com.zzg.leetcode.utils;

public class SignalHandlerExample {
//    public static void main(String[] args) {
//        // 创建一个ExecutorService来执行清理操作
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//        // 注册信号处理程序
//        Runtime.getRuntime().addSignalHandler(new SignalHandler() {
//            @Override
//            public void handle(Signal signal) {
//                // 如果是正常终止信号(-15)，则执行清理操作
//                if (signal.getNumber() == 15) {
//                    executorService.submit(() -> {
//                        // 在这里执行清理操作
//                        System.out.println("Received normal termination signal. Cleaning up...");
//                    });
//                } else if (signal.getNumber() == 9) {
//                    System.out.println("Received termination signal (-9). Forcing immediate exit.");
//                } else {
//                    System.out.println("Received unknown signal: " + signal.getName());
//                }
//            }
//        });
//
//        // 添加一个关闭钩子来执行清理操作（可选）
//        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//            System.out.println("JVM is shutting down. Cleaning up...");
//            executorService.shutdown(); // 关闭ExecutorService（如果需要）
//        }));
//
//        // 主线程继续执行其他操作（如果有）
//        System.out.println("Main thread is running...");
//    }
}