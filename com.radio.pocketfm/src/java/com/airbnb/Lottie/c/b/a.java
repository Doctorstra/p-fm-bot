/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  com.airbnb.lottie.a.a.f
 *  com.airbnb.lottie.c.a.f
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.c.b;

import android.graphics.PointF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.f;

public class a
implements b {
    private final String a;
    private final m<PointF, PointF> b;
    private final com.airbnb.lottie.c.a.f c;
    private final boolean d;
    private final boolean e;

    public a(String string2, m<PointF, PointF> m2, com.airbnb.lottie.c.a.f f2, boolean bl2, boolean bl3) {
        this.a = string2;
        this.b = m2;
        this.c = f2;
        this.d = bl2;
        this.e = bl3;
    }

    @Override
    public c a(f f2, com.airbnb.lottie.c.c.a a2) {
        return new com.airbnb.lottie.a.a.f(f2, a2, this);
    }

    public String a() {
        return this.a;
    }

    public m<PointF, PointF> b() {
        return this.b;
    }

    public com.airbnb.lottie.c.a.f c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }
}

