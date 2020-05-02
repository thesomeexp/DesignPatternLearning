package Proxy.SearcherSystem;


import Proxy.SearcherSystem.proxy.ProxySearcher;
import Proxy.SearcherSystem.real.Searcher;

public class Client {
    public static void main(String[] args) {

        // 通过类名生成实例对象并将其返回
        Searcher searcher = new ProxySearcher();
        String result = searcher.doSearch("杨过", "玉女心经");
        System.out.println(result);

    }
}
