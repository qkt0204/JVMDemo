package com.qkt.jvm;

import sun.misc.Launcher;

import java.net.URL;

/**
 * ClassName: StackStruTest <br/>
 * Description: <br/>
 * date: 2020/7/14 16:37<br/>
 *
 * @author 馨儿<br />
 * @since JDK 1.8
 */
public class StackStruTest {
    public static void main(String[] args) {
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL url:
                urLs) {
            System.out.println(url.toExternalForm());
        }
    }

}
