package com.java1234.executor;

import com.java1234.pojo.StringVO;

public interface IExecutor {
    /**
     * 移除重复字符
     * @param stringVO
     */
    void removeConsecutiveChar(StringVO stringVO);
}
