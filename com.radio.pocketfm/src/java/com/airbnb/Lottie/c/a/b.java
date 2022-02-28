/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.c.a;

import com.airbnb.lottie.a.b.c;
import com.airbnb.lottie.c.a.n;
import com.airbnb.lottie.g.a;
import java.util.List;

public class b
extends n<Float, Float> {
    b() {
        super(Float.valueOf((float)0.0f));
    }

    public b(List<a<Float>> list) {
        super(list);
    }

    @Override
    public com.airbnb.lottie.a.b.a<Float, Float> a() {
        return new c((List<a<Float>>)this.a);
    }
}

