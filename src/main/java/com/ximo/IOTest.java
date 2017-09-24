package com.ximo;


import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/**
 * 开始尝试使用common-io操作
 * Created by 朱文赵
 * 2017/9/23
 */
public class IOTest {

    private String filename = "D:/test.md";

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
        File file = new File(filename);
        List line = FileUtils.readLines(file, "UTF-8");
        for (Object aLine : line) {
            String lineString = (String) aLine;
            System.out.println(lineString);
        }
    }

    /**
     * 测试迭代的方法
     * 其实我感觉也差不多
     */
    public void testLineIterator(){
        try {
            LineIterator it = FileUtils.lineIterator(new File(filename), "UTF-8");
            while (it.hasNext()){
                String sLine = it.nextLine();
                System.out.println(sLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getFreeSpace(){
        try {
            Long freeSpace = FileSystemUtils.freeSpaceKb("D:/");
            System.out.println(freeSpace / (1024*1024));
        } catch (IOException e) {
            System.err.println("文件操作错误");
            e.printStackTrace();
        }
    }







}
