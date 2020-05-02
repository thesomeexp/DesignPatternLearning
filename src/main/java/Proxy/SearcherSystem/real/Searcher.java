package Proxy.SearcherSystem.real;

// 抽象查询类：抽象主题类
public interface Searcher {
    String doSearch(String userId,String keyword);
}