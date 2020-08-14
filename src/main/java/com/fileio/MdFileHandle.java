package com.fileio;

import java.io.*;

public class MdFileHandle {
    public static void main(String[] args) throws IOException {
       // singleMdFile(); //单个md文件的读取
        File file=new File("F:\\notes");
        boolean directory = file.isDirectory();
      

    }

    private static void singleMdFile() throws IOException {
        File mdFile=new File("F:\\Win10使用.md");

        FileInputStream fileInputStream=new FileInputStream(mdFile);
        InputStreamReader inputStream=new InputStreamReader(fileInputStream);
        BufferedReader reader=new BufferedReader(inputStream);

        String line = null;
        int i=1;
        while ((line=reader.readLine())!=null){
            System.out.println(i+" "+line);
            i++;
        }

    }

}
