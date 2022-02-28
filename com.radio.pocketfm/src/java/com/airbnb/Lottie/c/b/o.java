/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.airbnb.lottie.a.a.q
 *  com.airbnb.lottie.c.a.h
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.c.b;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.q;
import com.airbnb.lottie.c.a.h;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.f;

public class o
implements b {
    private final String a;
    private final int b;
    private final h c;
    private final boolean d;

    public o(String string2, int n2, h h2, boolean bl2) {
        this.a = string2;
        this.b = n2;
        this.c = h2;
        this.d = bl2;
    }

    @Override
    public c a(f f2, a a2) {
        return new q(f2, a2, this);
    }

    public String a() {
        return this.a;
    }

    public h b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapePath{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", index=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

