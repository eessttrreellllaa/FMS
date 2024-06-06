package com.fms.pojo;

public class search<T> {

    private T t;

    private String searchType;

    public void add(T t, String searchType) {
        this.t = t;
        this.searchType = searchType;
    }

    public T getT() {
        return t;
    }

    public String getSearchType() {
        return searchType;
    }
}
