package com.example.test.io;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取hello.txt文件中的字符数据，并显示在控制台上
 * @author wansui
 * @date 2023/09/25
 */
public class FileInputStreamTest {

    @Test
    public void test() throws IOException {
        //1. 创建File类的对象，对应着物理磁盘上的某个文件
        File file = new File("abc.txt");
        //2. 创建FileReader流对象，将File类的对象作为参数传递到FileReader的构造器中
        FileReader fileReader = new FileReader(file);
        //3. 通过相关流的方法，读取文件中的数据
        int data = fileReader.read();

        while (data!=-1){
            System.out.print((char) data);
            data=fileReader.read();

        }



    }
}
