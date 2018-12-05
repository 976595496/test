package com.zcz.test1;

/**
 * Created by Administrator on 2018/11/17 0017.
 */
public class TestMain {
    public static void main(String[] args) {

        // 定义HTML标签的正则表达式
        String regEx_html = "<[^>]+>";
        // 定义一些特殊字符的正则表达式 如：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        String regEx_special = "\\&[a-zA-Z]{1,10};";

//        content = content.replace(regEx_special, " ");
//        content = content.replace(regEx_html, "");

//        m.put("content", content);



    }
}
