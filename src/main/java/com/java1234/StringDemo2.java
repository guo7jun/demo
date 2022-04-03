package com.java1234;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDemo2 {
    /**
     * 移除字符串中连续出现的3个字符
     * @param string 原字符串
     * @param count 第几次移除操作
     */
    public static void removeConsecutiveChar(String string, int count){
        String resultString = string;
        String subString = null;
        // 统计各个字符的个数
        Map<String, Long> strCountMap = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // 出现次数大于等于3的字符
        List<String> strCountList = strCountMap.entrySet().stream()
                .filter(o -> o.getValue() >= 3)
                .map(o -> o.getKey())
                .collect(Collectors.toList());

        // 截取三个或三个以上的字符
        for (String str : strCountList){
            Long strCount = strCountMap.get(str);
            StringBuffer stringBuffer = new StringBuffer();
            // 拼接查重字符串
            for (long i = 0; i < strCount; i++){
                stringBuffer.append(str);
            }
            // 查重操作，返回原字符串中存在的重复字符串
            subString = checkDuplicate(string, stringBuffer);
            if(StringUtils.isNotBlank(subString)){
                String lastChar = getLastChar(subString);
                // 移除重复字符串
                resultString = string.replace(subString, lastChar);
                System.out.println("->" + resultString + "," + subString + " is replaced by " + lastChar);
            }
        }

        // 如果字符串有重排序而且结果字符串的长度大于等于3,则继续执行截取操作
        if (StringUtils.isNotBlank(subString) && resultString.length() >= 3){
            removeConsecutiveChar(resultString, ++count);
        }else  {
            return;
        }
    }

    /**
     * 查重操作
     * @param originString 原字符串
     * @param stringBuffer 存在可能重复的字符串("aaa","bbbb")
     * @return
     */
    private static String checkDuplicate(String originString, StringBuffer stringBuffer){
        // 如果查重字符串的长度小于3，则结束查询
        if (stringBuffer.length() < 3){
            return "";
        }
        // 判断原字符串是否存在重复字符串
        if (originString.contains(stringBuffer.toString())){
            // 返回重复字符串
            return stringBuffer.toString();
        }else {
            // 重复字符串长度-1，继续查重，直至长度小于3
            stringBuffer = stringBuffer.delete(1, 2);
            return checkDuplicate(originString, stringBuffer);
        }
    }

    /**
     * 获取上一个字母
     * @param string 需要替换的字符串
     * @return
     */
    private static String getLastChar(String string){
        char c = string.toCharArray()[0];
        return c == 'a' ? "" : String.valueOf((char)(c - 1));
    }
}
