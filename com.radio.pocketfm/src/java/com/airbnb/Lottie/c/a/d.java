/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.c.a;

import com.airbnb.lottie.a.b.e;
import com.airbnb.lottie.c.a.n;
import com.airbnb.lottie.g.a;
import java.util.List;

public class d
extends n<Integer, Integer> {
    public d() {
        super(100);
    }

    public d(List<a<Integer>> list) {
        super(list);
    }

    @Override
    public com.airbnb.lottie.a.b.a<Integer, Integer> a() {
        return new e((List<a<Integer>>)this.a);
    }
}

