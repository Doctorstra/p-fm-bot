/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  com.airbnb.lottie.a.a.o
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.f
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.c.b;

import android.graphics.PointF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.o;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.f;

public class j
implements b {
    private final String a;
    private final m<PointF, PointF> b;
    private final com.airbnb.lottie.c.a.f c;
    private final com.airbnb.lottie.c.a.b d;
    private final boolean e;

    public j(String string2, m<PointF, PointF> m2, com.airbnb.lottie.c.a.f f2, com.airbnb.lottie.c.a.b b2, boolean bl2) {
        this.a = string2;
        this.b = m2;
        this.c = f2;
        this.d = b2;
        this.e = bl2;
    }

    @Override
    public c a(f f2, a a2) {
        return new o(f2, a2, this);
    }

    public String a() {
        return this.a;
    }

    public com.airbnb.lottie.c.a.b b() {
        return this.d;
    }

    public com.airbnb.lottie.c.a.f c() {
        return this.c;
    }

    public m<PointF, PointF> d() {
        return this.b;
    }

    public boolean e() {
        return this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RectangleShape{position=");
        stringBuilder.append(this.b);
        stringBuilder.append(", size=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

