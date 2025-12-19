package com.upupa.common.interfaces.tx;
import  java.util.function.Supplier;

public interface UnitOfWork {
    <T> T execute(Supplier<T> work);
    void execute(Runnable work);
}

