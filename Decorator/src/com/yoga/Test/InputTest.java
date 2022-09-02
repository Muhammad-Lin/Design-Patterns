package com.yoga.Test;

import com.yoga.javaio.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * java I/O装饰者测试类
 *
 * @name: InputTest
 * @author: yoga
 * @create: 2022-09-02 10:09
 **/
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/com/yoga/test.txt")));

            while ((c = in.read()) >= 0)
                System.out.print((char)c);

            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
