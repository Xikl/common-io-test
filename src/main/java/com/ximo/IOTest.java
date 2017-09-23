package com.ximo;


import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * 开始尝试使用common-io操作
 * Created by 朱文赵
 * 2017/9/23
 */
public class IOTest {

    public void inputStream(){
        try {
            InputStream inputStream = new URL("http://jakarta.apache.org").openStream();
            System.out.println(IOUtils.toString(inputStream));
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        IOTest ioTest = new IOTest();
        ioTest.inputStream();
    }

}
