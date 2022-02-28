/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.a.b;

import com.airbnb.lottie.a.b.f;
import com.airbnb.lottie.g.a;
import com.airbnb.lottie.g.c;
import java.util.List;

public class e
extends f<Integer> {
    public e(List<a<Integer>> list) {
        super(list);
    }

    @Override
    /* synthetic */ Object a(a a2, float f2) {
        return this.b(a2, f2);
    }

    Integer b(a<Integer> a2, float f2) {
        return this.c(a2, f2);
    }

    int c(a<Integer> a2, float f2) {
        if (a2.a != null && a2.b != null) {
            Integer n2;
            if (this.b != null && (n2 = (Integer)this.b.a(a2.d, a2.e.floatValue(), a2.a, a2.b, f2, this.d(), this.h())) != null) {
                return n2;
            }
            return com.airbnb.lottie.f.e.a(a2.h(), a2.i(), f2);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    public int i() {
        return this.c(this.c(), this.e());
    }
}

