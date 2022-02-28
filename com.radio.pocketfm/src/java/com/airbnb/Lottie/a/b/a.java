/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.a.b;

import android.view.animation.Interpolator;
import com.airbnb.lottie.g.c;
import java.util.ArrayList;
import java.util.List;

public abstract class a<K, A> {
    final List<a> a = new ArrayList(1);
    protected c<A> b;
    private boolean c = false;
    private final List<? extends com.airbnb.lottie.g.a<K>> d;
    private float e = 0.0f;
    private com.airbnb.lottie.g.a<K> f;
    private com.airbnb.lottie.g.a<K> g;
    private float h = -1.0f;
    private A i = null;
    private float j = -1.0f;
    private float k = -1.0f;

    a(List<? extends com.airbnb.lottie.g.a<K>> list) {
        this.d = list;
    }

    private float i() {
        if (this.j == -1.0f) {
            float f2 = this.d.isEmpty() ? 0.0f : ((com.airbnb.lottie.g.a)this.d.get(0)).c();
            this.j = f2;
        }
        return this.j;
    }

    abstract A a(com.airbnb.lottie.g.a<K> var1, float var2);

    public void a() {
        this.c = true;
    }

    public void a(float f2) {
        if (this.d.isEmpty()) {
            return;
        }
        com.airbnb.lottie.g.a<K> a2 = this.c();
        if (f2 < this.i()) {
            f2 = this.i();
        } else if (f2 > this.f()) {
            f2 = this.f();
        }
        if (f2 == this.e) {
            return;
        }
        this.e = f2;
        com.airbnb.lottie.g.a<K> a3 = this.c();
        if (a2 != a3 || !a3.e()) {
            this.b();
        }
    }

    public void a(a a2) {
        this.a.add((Object)a2);
    }

    public void a(c<A> c2) {
        c<A> c3 = this.b;
        if (c3 != null) {
            c3.a((a<?, ?>)null);
        }
        this.b = c2;
        if (c2 != null) {
            c2.a(this);
        }
    }

    public void b() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            ((a)this.a.get(i2)).a();
        }
    }

    protected com.airbnb.lottie.g.a<K> c() {
        com.airbnb.lottie.g.a<K> a2 = this.f;
        if (a2 != null && a2.a(this.e)) {
            return this.f;
        }
        List<? extends com.airbnb.lottie.g.a<K>> list = this.d;
        com.airbnb.lottie.g.a a3 = (com.airbnb.lottie.g.a)list.get(-1 + list.size());
        if (this.e < a3.c()) {
            for (int i2 = -1 + this.d.size(); i2 >= 0 && !(a3 = (com.airbnb.lottie.g.a)this.d.get(i2)).a(this.e); --i2) {
            }
        }
        this.f = a3;
        return a3;
    }

    float d() {
        if (this.c) {
            return 0.0f;
        }
        com.airbnb.lottie.g.a<K> a2 = this.c();
        if (a2.e()) {
            return 0.0f;
        }
        return (this.e - a2.c()) / (a2.d() - a2.c());
    }

    protected float e() {
        com.airbnb.lottie.g.a<K> a2 = this.c();
        if (a2.e()) {
            return 0.0f;
        }
        return a2.c.getInterpolation(this.d());
    }

    float f() {
        if (this.k == -1.0f) {
            float f2;
            if (this.d.isEmpty()) {
                f2 = 1.0f;
            } else {
                List<? extends com.airbnb.lottie.g.a<K>> list = this.d;
                f2 = ((com.airbnb.lottie.g.a)list.get(-1 + list.size())).d();
            }
            this.k = f2;
        }
        return this.k;
    }

    public A g() {
        com.airbnb.lottie.g.a<K> a2 = this.c();
        float f2 = this.e();
        if (this.b == null && a2 == this.g && this.h == f2) {
            return this.i;
        }
        this.g = a2;
        this.h = f2;
        A a3 = this.a(a2, f2);
        this.i = a3;
        return a3;
    }

    public float h() {
        return this.e;
    }

    public static interface a {
        public void a();
    }

}

