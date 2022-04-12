package com.java1234.executor;

import com.java1234.pojo.StringVO;

/**
 * 任务分配者
 */
public class StringDispatch {
    StringExecutor stringExecutor = new StringExecutor();

    public void removeConsecutiveChar(StringVO stringVO){
        stringExecutor.removeConsecutiveChar(stringVO);
    }
}
