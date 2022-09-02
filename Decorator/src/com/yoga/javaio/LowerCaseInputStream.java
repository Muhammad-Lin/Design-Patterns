package com.yoga.javaio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 具体装饰者，将输入流内的所有大写字符转换为小写
 *
 * @name: LowerCaseInputStream
 * @author: yoga
 * @create: 2022-09-02 10:02
 **/
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException{
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    public  int read(byte[] b ,int offset, int len) throws IOException{
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++){
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
