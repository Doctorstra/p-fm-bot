/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  com.airbnb.lottie.a.a.g
 *  com.airbnb.lottie.c.a.a
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.c.b;

import android.graphics.Path;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.g;
import com.airbnb.lottie.c.a.d;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.f;

public class m
implements b {
    private final boolean a;
    private final Path.FillType b;
    private final String c;
    private final com.airbnb.lottie.c.a.a d;
    private final d e;
    private final boolean f;

    public m(String string2, boolean bl2, Path.FillType fillType, com.airbnb.lottie.c.a.a a2, d d2, boolean bl3) {
        this.c = string2;
        this.a = bl2;
        this.b = fillType;
        this.d = a2;
        this.e = d2;
        this.f = bl3;
    }

    @Override
    public c a(f f2, a a2) {
        return new g(f2, a2, this);
    }

    public String a() {
        return this.c;
    }

    public com.airbnb.lottie.c.a.a b() {
        return this.d;
    }

    public d c() {
        return this.e;
    }

    public Path.FillType d() {
        return this.b;
    }

    public boolean e() {
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeFill{color=, fillEnabled=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

