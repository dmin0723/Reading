package com.dengmin.news.database.cache;

import java.util.List;

/**
 * interface
 */
public interface ICache<T> {

    void addToCollection(T object);
    void execSQL(String sql);
    List<T> getmList();
    boolean hasDAta();
    void load();
    void loadFromCache();
    void cache();
}
