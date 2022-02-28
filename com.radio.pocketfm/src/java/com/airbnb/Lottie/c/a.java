/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  java.lang.Object
 */
package com.airbnb.lottie.c;

import android.graphics.PointF;

public class a {
    private final PointF a;
    private final PointF b;
    private final PointF c;

    public a() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }

    public PointF a() {
        return this.a;
    }

    public void a(float f2, float f3) {
        this.a.set(f2, f3);
    }

    public PointF b() {
        return this.b;
    }

    public void b(float f2, float f3) {
        this.b.set(f2, f3);
    }

    public PointF c() {
        return this.c;
    }

    public void c(float f2, float f3) {
        this.c.set(f2, f3);
    }
}

