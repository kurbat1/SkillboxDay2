package com.company;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {
//	MyThread thread1 = new MyThread(5);
//		thread1.start();
//  look here!
//         private static void printProgress(long uploaded, long size) {
//        System.out.printf("Uploaded %12d / %12d bytes (%5.2f%%)\n", uploaded, size, 100 * (uploaded / (double) size));
//    }
//    MyThread thread2 = new MyThread(1);
//        thread2.start();
        String ACCESS_TOKEN = "hFzCrE-Vr48AAAAAAAAAFi02rapWMzYlzhXU_TEen7Ton_SZe84uPG_sMjz6iseL";

        String filePath = "C:\\Users\\kurba\\Desktop\\test.txt";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        try {
            FileInputStream in = new FileInputStream(filePath); {


        client.files().uploadBuilder("/test.txt").uploadAndFinish(in);
        }

    } catch (Exception e) {e.printStackTrace();}
}}
