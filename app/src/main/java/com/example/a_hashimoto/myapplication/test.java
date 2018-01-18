package com.example.a_hashimoto.myapplication;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by a-hashimoto on 2018/01/18.
 */

public class test {
    Map<Pair, Integer> rates = new HashMap<>();
    void function() {
        rates.put(new Pair("a", "b"), 1);
    }
}
