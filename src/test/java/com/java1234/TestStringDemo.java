package com.java1234;

import com.java1234.executor.StringDispatch;
import com.java1234.pojo.StringVO;
import com.java1234.utils.StringUtil;
import org.junit.Test;

public class TestStringDemo {

    @Test
    public void removeConsecutiveChar1(){
        int count = 1;
        String string = "aabcccbbad";
        System.out.println("Input:" + string);
        System.out.println("Output:");
        StringUtil.removeConsecutiveChar(string, count);
    }

    @Test
    public void removeConsecutiveChar2(){
        // 需要查重的对象
        StringVO stringVO = new StringVO("abcccbad");
        // 任务分配者
        StringDispatch stringDispatch = new StringDispatch();
        System.out.println("Input:" + stringVO.getValue());
        System.out.println("Output:");
        stringDispatch.removeConsecutiveChar(stringVO);
    }
}
