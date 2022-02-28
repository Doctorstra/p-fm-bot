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
import com.airbnb.lottie.f.e;
import com.airbnb.lottie.g.a;
import com.airbnb.lottie.g.c;
import java.util.List;

public class b
extends f<Integer> {
    public b(List<a<Integer>> list) {
        super(list);
    }

    @Override
    /* synthetic */ Object a(a a2, float f2) {
        return this.b(a2, f2);
    }

    Integer b(a<Integer> a2, float f2) {
        return this.c(a2, f2);
    }

    public int c(a<Integer> a2, float f2) {
        if (a2.a != null && a2.b != null) {
            Integer n2;
            int n3 = (Integer)a2.a;
            int n4 = (Integer)a2.b;
            if (this.b != null && (n2 = this.b.a(a2.d, a2.e.floatValue(), n3, n4, f2, this.d(), this.h())) != null) {
                return n2;
            }
            return com.airbnb.lottie.f.b.a(e.b(f2, 0.0f, 1.0f), n3, n4);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    public int i() {
        return this.c(this.c(), this.e());
    }
}

