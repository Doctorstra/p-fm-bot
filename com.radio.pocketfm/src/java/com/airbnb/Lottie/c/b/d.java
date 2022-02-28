/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  com.airbnb.lottie.a.a.h
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.c
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.a.f
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.c.b;

import android.graphics.Path;
import com.airbnb.lottie.a.a.h;
import com.airbnb.lottie.c.a.c;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.f;

public class d
implements b {
    private final com.airbnb.lottie.c.b.f a;
    private final Path.FillType b;
    private final c c;
    private final com.airbnb.lottie.c.a.d d;
    private final com.airbnb.lottie.c.a.f e;
    private final com.airbnb.lottie.c.a.f f;
    private final String g;
    private final com.airbnb.lottie.c.a.b h;
    private final com.airbnb.lottie.c.a.b i;
    private final boolean j;

    public d(String string2, com.airbnb.lottie.c.b.f f2, Path.FillType fillType, c c2, com.airbnb.lottie.c.a.d d2, com.airbnb.lottie.c.a.f f3, com.airbnb.lottie.c.a.f f4, com.airbnb.lottie.c.a.b b2, com.airbnb.lottie.c.a.b b3, boolean bl2) {
        this.a = f2;
        this.b = fillType;
        this.c = c2;
        this.d = d2;
        this.e = f3;
        this.f = f4;
        this.g = string2;
        this.h = b2;
        this.i = b3;
        this.j = bl2;
    }

    @Override
    public com.airbnb.lottie.a.a.c a(f f2, a a2) {
        return new h(f2, a2, this);
    }

    public String a() {
        return this.g;
    }

    public com.airbnb.lottie.c.b.f b() {
        return this.a;
    }

    public Path.FillType c() {
        return this.b;
    }

    public c d() {
        return this.c;
    }

    public com.airbnb.lottie.c.a.d e() {
        return this.d;
    }

    public com.airbnb.lottie.c.a.f f() {
        return this.e;
    }

    public com.airbnb.lottie.c.a.f g() {
        return this.f;
    }

    public boolean h() {
        return this.j;
    }
}

