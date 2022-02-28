/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.c.a;

import com.airbnb.lottie.a.b.k;
import com.airbnb.lottie.c.a.n;
import com.airbnb.lottie.g.a;
import com.airbnb.lottie.g.d;
import java.util.List;

public class g
extends n<d, d> {
    g() {
        this(new d(1.0f, 1.0f));
    }

    public g(d d2) {
        super(d2);
    }

    public g(List<a<d>> list) {
        super(list);
    }

    @Override
    public com.airbnb.lottie.a.b.a<d, d> a() {
        return new k((List<a<d>>)this.a);
    }
}

