package com.test;

import org.reflections.Reflections;

public interface Config {
    <T> Class<? extends T> getImpClass(Class<T> ifc);
    Reflections getScanner();
}
