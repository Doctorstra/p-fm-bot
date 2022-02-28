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
import java.util.List;

public class c
extends f<Float> {
    public c(List<a<Float>> list) {
        super(list);
    }

    @Override
    /* synthetic */ Object a(a a2, float f2) {
        return this.b(a2, f2);
    }

    Float b(a<Float> a2, float f2) {
        return Float.valueOf((float)this.c(a2, f2));
    }

    float c(a<Float> a2, float f2) {
        if (a2.a != null && a2.b != null) {
            Float f3;
            if (this.b != null && (f3 = (Float)this.b.a(a2.d, a2.e.floatValue(), a2.a, a2.b, f2, this.d(), this.h())) != null) {
                return f3.floatValue();
            }
            return e.a(a2.f(), a2.g(), f2);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    public float i() {
        return this.c(this.c(), this.e());
    }
}

