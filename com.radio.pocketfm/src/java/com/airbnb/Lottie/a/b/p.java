/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
package com.airbnb.lottie.a.b;

import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.g.b;
import com.airbnb.lottie.g.c;
import java.util.Collections;
import java.util.List;

public class p<K, A>
extends a<K, A> {
    private final b<A> c = new b();

    public p(c<A> c2) {
        super(Collections.emptyList());
        this.a(c2);
    }

    @Override
    A a(com.airbnb.lottie.g.a<K> a2, float f2) {
        return this.g();
    }

    @Override
    public void b() {
        if (this.b != null) {
            super.b();
        }
    }

    @Override
    float f() {
        return 1.0f;
    }

    @Override
    public A g() {
        return this.b.a(0.0f, 0.0f, null, null, this.h(), this.h(), this.h());
    }
}

