package com.upupa.common.interfaces.id;

public interface IdGenerator {
    String next(String domain, String prefix);
}

