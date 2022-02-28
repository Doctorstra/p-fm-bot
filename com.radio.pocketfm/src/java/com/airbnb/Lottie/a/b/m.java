/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  java.lang.Float
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
package com.airbnb.lottie.a.b;

import android.graphics.PointF;
import com.airbnb.lottie.a.b.a;
import java.util.Collections;
import java.util.List;

public class m
extends a<PointF, PointF> {
    private final PointF c = new PointF();
    private final a<Float, Float> d;
    private final a<Float, Float> e;

    public m(a<Float, Float> a2, a<Float, Float> a3) {
        super(Collections.emptyList());
        this.d = a2;
        this.e = a3;
        this.a(this.h());
    }

    @Override
    /* synthetic */ Object a(com.airbnb.lottie.g.a a2, float f2) {
        return this.b(a2, f2);
    }

    @Override
    public void a(float f2) {
        this.d.a(f2);
        this.e.a(f2);
        this.c.set(this.d.g().floatValue(), this.e.g().floatValue());
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            ((a.a)this.a.get(i2)).a();
        }
    }

    PointF b(com.airbnb.lottie.g.a<PointF> a2, float f2) {
        return this.c;
    }

    @Override
    public /* synthetic */ Object g() {
        return this.i();
    }

    public PointF i() {
        return this.b(null, 0.0f);
    }
}

