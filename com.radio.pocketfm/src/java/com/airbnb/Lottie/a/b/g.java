/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.a.h
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.a.b;

import android.graphics.Path;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.a.d;
import com.airbnb.lottie.c.a.h;
import com.airbnb.lottie.c.b.l;
import java.util.ArrayList;
import java.util.List;

public class g {
    private final List<a<l, Path>> a;
    private final List<a<Integer, Integer>> b;
    private final List<com.airbnb.lottie.c.b.g> c;

    public g(List<com.airbnb.lottie.c.b.g> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.a.add((Object)((com.airbnb.lottie.c.b.g)list.get(i2)).b().a());
            d d2 = ((com.airbnb.lottie.c.b.g)list.get(i2)).c();
            this.b.add((Object)d2.a());
        }
    }

    public List<com.airbnb.lottie.c.b.g> a() {
        return this.c;
    }

    public List<a<l, Path>> b() {
        return this.a;
    }

    public List<a<Integer, Integer>> c() {
        return this.b;
    }
}

