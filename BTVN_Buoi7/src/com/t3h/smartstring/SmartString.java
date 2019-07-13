package com.t3h.smartstring;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class SmartString {
    private String text;
    private ArrayList<News> newsList = new ArrayList<>();

    public SmartString() {
            try {
                File f = new File("C:/Users/Deki/Desktop/news.txt");
                if (f.exists() == false) {
                    System.out.println("File chua ton tai");
                    return;
                }
                FileInputStream in= new FileInputStream(f);
                byte[] b = new byte[1024];
                int count =in.read(b);
                StringBuilder textbd =new StringBuilder();
                while (count !=-1){
                    text = new String(b,0,count);
                    count =in.read(b);
                    textbd.append(text);
                }
                text =new String(textbd);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    public void filter() {
        String[] arrText = text.split("</item>\r\n");
        for (String s : arrText
        ) {
            try {
                String title = s.substring(s.indexOf("<title><![CDATA[") + "<title><![CDATA[".length(), s.indexOf("]]></title>"));
                String linkDetail = s.substring(s.indexOf("<link><![CDATA[") + "<link><![CDATA[".length(), s.indexOf("]]></link>\r\n"));
                String imgLink = s.substring(s.indexOf("<img src=\"") + "<img src=\"".length(), s.indexOf("\" /></a>]]></description>\r\n"));
                String date = s.substring(s.indexOf("<pubDate><![CDATA[") + "<pubDate><![CDATA[".length(), s.indexOf("]]></pubDate>\r\n"));
                News n = new News(title, linkDetail, imgLink, date);
                newsList.add(n);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void printNewsList() {
        for (News n : newsList
        ) {
            System.out.println(n);
        }
    }
}
