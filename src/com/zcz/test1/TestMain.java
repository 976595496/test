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


String str = "<form id="form1" name="form1" method="post"> <input type="button" name="button"  onClick="inputBox();"id="button" value="Add Note" /><ul id="ul"> <li>metting</li><li>读书</li> <li>打代码</li><li>看代码</li><li>看博客</li> </ul> </form><div></div>"


    }
}
