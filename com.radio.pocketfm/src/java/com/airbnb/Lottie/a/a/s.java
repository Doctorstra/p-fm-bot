/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.a.a;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.c.c.a;
import java.util.ArrayList;
import java.util.List;

public class s
implements c,
a.a {
    private final String a;
    private final boolean b;
    private final List<a.a> c = new ArrayList();
    private final q.a d;
    private final com.airbnb.lottie.a.b.a<?, Float> e;
    private final com.airbnb.lottie.a.b.a<?, Float> f;
    private final com.airbnb.lottie.a.b.a<?, Float> g;

    public s(a a2, q q2) {
        this.a = q2.a();
        this.b = q2.f();
        this.d = q2.b();
        this.e = q2.d().a();
        this.f = q2.c().a();
        this.g = q2.e().a();
        a2.a(this.e);
        a2.a(this.f);
        a2.a(this.g);
        this.e.a(this);
        this.f.a(this);
        this.g.a(this);
    }

    @Override
    public void a() {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            ((a.a)this.c.get(i2)).a();
        }
    }

    void a(a.a a2) {
        this.c.add((Object)a2);
    }

    @Override
    public void a(List<c> list, List<c> list2) {
    }

    @Override
    public String b() {
        return this.a;
    }

    q.a c() {
        return this.d;
    }

    public com.airbnb.lottie.a.b.a<?, Float> d() {
        return this.e;
    }

    public com.airbnb.lottie.a.b.a<?, Float> e() {
        return this.f;
    }

    public com.airbnb.lottie.a.b.a<?, Float> f() {
        return this.g;
    }

    public boolean g() {
        return this.b;
    }
}

