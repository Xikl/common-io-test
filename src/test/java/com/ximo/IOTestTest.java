package com.ximo;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by 朱文赵
 * 2017/9/23
 */

public class IOTestTest {

    private IOTest ioTest;

    @Before
    public void init(){
        ioTest = new IOTest();
    }

    @Test
    public void inputStream() throws Exception {
        ioTest.inputStream();
    }

    @Test
    public void readFile() throws Exception{
        ioTest.readFile();
    }

    @Test
    public void testLineIterator() throws Exception {
        ioTest.testLineIterator();
    }

    @Test
    public void getFreeSpace() throws Exception {
        ioTest.getFreeSpace();
    }
}
