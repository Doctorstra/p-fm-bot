/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.view.animation.Interpolator
 *  java.lang.Float
 *  java.lang.Object
 */
package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f.f;
import com.airbnb.lottie.g.a;

public class h
extends a<PointF> {
    private Path h;
    private final a<PointF> i;

    public h(d d2, a<PointF> a2) {
        super(d2, a2.a, a2.b, a2.c, a2.d, a2.e);
        this.i = a2;
        this.a();
    }

    public void a() {
        boolean bl2 = this.b != null && this.a != null && ((PointF)this.a).equals(((PointF)this.b).x, ((PointF)this.b).y);
        if (this.b != null && !bl2) {
            this.h = f.a((PointF)this.a, (PointF)this.b, this.i.f, this.i.g);
        }
    }

    Path b() {
        return this.h;
    }
}

