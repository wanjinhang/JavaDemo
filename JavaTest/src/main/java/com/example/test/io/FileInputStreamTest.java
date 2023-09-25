package com.example.test.io;

import org.junit.Test;

import java.io.*;

/**
 * @author wansui
 * @date 2023/09/25
 */
public class FileInputStreamTest {
    //字符流  读取hello.txt文件中的字符数据，并显示在控制台上
    @Test
    public void test() throws IOException {
        //1. 创建File类的对象，对应着物理磁盘上的某个文件
        File file = new File("abc.txt");
        //2. 创建FileReader流对象，将File类的对象作为参数传递到FileReader的构造器中
        FileReader fileReader = new FileReader(file);
        //3. 通过相关流的方法，读取文件中的数据
        char[] cbuf = new char[5];
        int len;
        while ((len = fileReader.read(cbuf)) != -1) {
            String str = new String(cbuf, 0, len);
            System.out.println(str);
        }
        fileReader.close();

    }

    //字符流  写入文件
    @Test
    public void test1() throws IOException {
        //1、获取文件对象
        File file = new File("test.txt");
        //2、创建字符输出流
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("你好你好");
        }

    }

    //字符流  复制文件
    @Test
    public void test2() throws RuntimeException {
        //创建两个文件对象
        File file1 = new File("abc.txt");
        File file2 = new File("abc-copy.txt");
        //分别输入输出流
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(file1);
            fileWriter = new FileWriter(file2);
            char[] cbuff = new char[5];
            int len;
            while ((len = fileReader.read(cbuff)) != -1) {
                fileWriter.write(cbuff, 0, len);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭流
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
    //字节流  复制文件
    @Test
    public void test3(){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        File file1 = new File("abc.txt");
        File file2 = new File("abc-stream.txt");

        try {
            fis  = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            byte[] buff = new byte[1024];
            int len;
            while ((len = fis.read(buff)) !=-1){
                fos.write(buff,0,len);
            }
            System.out.println("复制成功！");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if(fis !=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
