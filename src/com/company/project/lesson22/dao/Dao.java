package com.company.project.lesson22.dao;

import java.util.List;
import java.util.function.Predicate;

public interface Dao<T, UniqueId> {
    void add(T t);
    boolean delete(T t);
    T getByUniqueId(UniqueId uniqueId);
    List<T> getByConditions(Predicate<T> predicate);
}
