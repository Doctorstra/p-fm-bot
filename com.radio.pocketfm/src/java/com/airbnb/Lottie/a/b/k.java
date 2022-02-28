/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.a.b;

import com.airbnb.lottie.a.b.f;
import com.airbnb.lottie.f.e;
import com.airbnb.lottie.g.a;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.g.d;
import java.util.List;

public class k
extends f<d> {
    private final d c = new d();

    public k(List<a<d>> list) {
        super(list);
    }

    @Override
    public /* synthetic */ Object a(a a2, float f2) {
        return this.b(a2, f2);
    }

    public d b(a<d> a2, float f2) {
        if (a2.a != null && a2.b != null) {
            d d2;
            d d3 = (d)a2.a;
            d d4 = (d)a2.b;
            if (this.b != null && (d2 = this.b.a(a2.d, a2.e.floatValue(), d3, d4, f2, this.d(), this.h())) != null) {
                return d2;
            }
            this.c.a(e.a(d3.a(), d4.a(), f2), e.a(d3.b(), d4.b(), f2));
            return this.c;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

