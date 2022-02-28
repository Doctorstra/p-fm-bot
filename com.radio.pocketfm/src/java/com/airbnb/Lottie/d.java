/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.util.Log
 *  androidx.a.d
 *  androidx.a.h
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.airbnb.lottie;

import android.graphics.Rect;
import android.util.Log;
import com.airbnb.lottie.c.c;
import com.airbnb.lottie.c.h;
import com.airbnb.lottie.g;
import com.airbnb.lottie.m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class d {
    private final m a = new m();
    private final HashSet<String> b = new HashSet();
    private Map<String, List<com.airbnb.lottie.c.c.d>> c;
    private Map<String, g> d;
    private Map<String, c> e;
    private List<h> f;
    private androidx.a.h<com.airbnb.lottie.c.d> g;
    private androidx.a.d<com.airbnb.lottie.c.c.d> h;
    private List<com.airbnb.lottie.c.c.d> i;
    private Rect j;
    private float k;
    private float l;
    private float m;
    private boolean n;
    private int o = 0;

    public com.airbnb.lottie.c.c.d a(long l2) {
        return (com.airbnb.lottie.c.c.d)this.h.a(l2);
    }

    public void a(int n2) {
        this.o = n2 + this.o;
    }

    public void a(Rect rect, float f2, float f3, float f4, List<com.airbnb.lottie.c.c.d> list, androidx.a.d<com.airbnb.lottie.c.c.d> d2, Map<String, List<com.airbnb.lottie.c.c.d>> map, Map<String, g> map2, androidx.a.h<com.airbnb.lottie.c.d> h2, Map<String, c> map3, List<h> list2) {
        this.j = rect;
        this.k = f2;
        this.l = f3;
        this.m = f4;
        this.i = list;
        this.h = d2;
        this.c = map;
        this.d = map2;
        this.g = h2;
        this.e = map3;
        this.f = list2;
    }

    public void a(String string2) {
        Log.w((String)"LOTTIE", (String)string2);
        this.b.add((Object)string2);
    }

    public void a(boolean bl) {
        this.n = bl;
    }

    public boolean a() {
        return this.n;
    }

    public int b() {
        return this.o;
    }

    public List<com.airbnb.lottie.c.c.d> b(String string2) {
        return (List)this.c.get((Object)string2);
    }

    public void b(boolean bl) {
        this.a.a(bl);
    }

    public h c(String string2) {
        this.f.size();
        for (int i2 = 0; i2 < this.f.size(); ++i2) {
            h h2 = (h)this.f.get(i2);
            if (!string2.equals((Object)h2.a)) continue;
            return h2;
        }
        return null;
    }

    public m c() {
        return this.a;
    }

    public Rect d() {
        return this.j;
    }

    public float e() {
        return (long)(1000.0f * (this.m() / this.m));
    }

    public float f() {
        return this.k;
    }

    public float g() {
        return this.l;
    }

    public float h() {
        return this.m;
    }

    public List<com.airbnb.lottie.c.c.d> i() {
        return this.i;
    }

    public androidx.a.h<com.airbnb.lottie.c.d> j() {
        return this.g;
    }

    public Map<String, c> k() {
        return this.e;
    }

    public Map<String, g> l() {
        return this.d;
    }

    public float m() {
        return this.l - this.k;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LottieComposition:\n");
        Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(((com.airbnb.lottie.c.c.d)iterator.next()).a("\t"));
        }
        return stringBuilder.toString();
    }
}

