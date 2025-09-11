package data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadPhoto {


    public static void main(String[] args) {
        String imageUrl = "https://img.picui.cn/free/2025/06/27/685ea83b0baef.jpeg";
        // 保存的文件名
        String destinationFile = "header.jpg";
        DownloadPhoto.imageDownloader(imageUrl, destinationFile);
    }

    public static void imageDownloader(String photoUrl, String destinationFile) {
        try (InputStream in = new URL(photoUrl).openStream();
             OutputStream out = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[2048];
            int bytesRead;
            while ((bytesRead = in.read(buffer, 0, buffer.length)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("图片已成功下载并保存为: " + destinationFile);
        } catch (IOException e) {
            System.err.println("下载图片时发生错误: " + e.getMessage());
        }
    }
}
