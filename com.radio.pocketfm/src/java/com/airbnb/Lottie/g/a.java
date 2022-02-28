/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.view.animation.Interpolator
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.g;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.d;

public class a<T> {
    public final T a;
    public T b;
    public final Interpolator c;
    public final float d;
    public Float e;
    public PointF f = null;
    public PointF g = null;
    private final d h;
    private float i = -3987645.8f;
    private float j = -3987645.8f;
    private int k = 784923401;
    private int l = 784923401;
    private float m = Float.MIN_VALUE;
    private float n = Float.MIN_VALUE;

    public a(d d2, T t2, T t3, Interpolator interpolator, float f2, Float f3) {
        this.h = d2;
        this.a = t2;
        this.b = t3;
        this.c = interpolator;
        this.d = f2;
        this.e = f3;
    }

    public a(T t2) {
        this.h = null;
        this.a = t2;
        this.b = t2;
        this.c = null;
        this.d = Float.MIN_VALUE;
        this.e = Float.valueOf((float)Float.MAX_VALUE);
    }

    public boolean a(float f2) {
        return f2 >= this.c() && f2 < this.d();
    }

    public float c() {
        d d2 = this.h;
        if (d2 == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            this.m = (this.d - d2.f()) / this.h.m();
        }
        return this.m;
    }

    public float d() {
        if (this.h == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            this.n = this.e == null ? 1.0f : this.c() + (this.e.floatValue() - this.d) / this.h.m();
        }
        return this.n;
    }

    public boolean e() {
        return this.c == null;
    }

    public float f() {
        if (this.i == -3987645.8f) {
            this.i = ((Float)this.a).floatValue();
        }
        return this.i;
    }

    public float g() {
        if (this.j == -3987645.8f) {
            this.j = ((Float)this.b).floatValue();
        }
        return this.j;
    }

    public int h() {
        if (this.k == 784923401) {
            this.k = (Integer)this.a;
        }
        return this.k;
    }

    public int i() {
        if (this.l == 784923401) {
            this.l = (Integer)this.b;
        }
        return this.l;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Keyframe{startValue=");
        stringBuilder.append(this.a);
        stringBuilder.append(", endValue=");
        stringBuilder.append(this.b);
        stringBuilder.append(", startFrame=");
        stringBuilder.append(this.d);
        stringBuilder.append(", endFrame=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(", interpolator=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

