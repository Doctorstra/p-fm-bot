/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.c.b;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.f;

public class q
implements b {
    private final String a;
    private final a b;
    private final com.airbnb.lottie.c.a.b c;
    private final com.airbnb.lottie.c.a.b d;
    private final com.airbnb.lottie.c.a.b e;
    private final boolean f;

    public q(String string2, a a2, com.airbnb.lottie.c.a.b b2, com.airbnb.lottie.c.a.b b3, com.airbnb.lottie.c.a.b b4, boolean bl2) {
        this.a = string2;
        this.b = a2;
        this.c = b2;
        this.d = b3;
        this.e = b4;
        this.f = bl2;
    }

    @Override
    public c a(f f2, com.airbnb.lottie.c.c.a a2) {
        return new s(a2, this);
    }

    public String a() {
        return this.a;
    }

    public a b() {
        return this.b;
    }

    public com.airbnb.lottie.c.a.b c() {
        return this.d;
    }

    public com.airbnb.lottie.c.a.b d() {
        return this.c;
    }

    public com.airbnb.lottie.c.a.b e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trim Path: {start: ");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", end: ");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", offset: ");
        stringBuilder.append((Object)this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}

