package com.ximo;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

/**
 * 开始尝试使用common-io操作
 * Created by 朱文赵
 * 2017/9/23
 */
public class IOTest {

    public void inputStream() throws IOException {
        InputStream inputStream = new URL("http://jakarta.apache.org").openStream();
        try {
            System.out.println(IOUtils.toString(inputStream));
        }finally {
            IOUtils.closeQuietly(inputStream);
        }
    }

    /**
     * 读取文件的所有行
     * @throws IOException
     */
    public void readFile() throws IOException {
        File file = new File("D:/test.md");
        List line = FileUtils.readLines(file, "UTF-8");
        Iterator iterator = line.iterator();
        while (iterator.hasNext()){
            String lineString = (String) iterator.next();
            System.out.println(lineString);
        }
    }





}
