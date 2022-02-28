/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.airbnb.lottie.g;

import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.g.b;

public class c<T> {
    protected T a = null;
    private final b<T> b = new b();
    private a<?, ?> c;

    public c() {
    }

    public c(T t2) {
        this.a = t2;
    }

    public final T a(float f2, float f3, T t2, T t3, float f4, float f5, float f6) {
        return this.a(this.b.a(f2, f3, t2, t3, f4, f5, f6));
    }

    public T a(b<T> b2) {
        return this.a;
    }

    public final void a(a<?, ?> a2) {
        this.c = a2;
    }
}

