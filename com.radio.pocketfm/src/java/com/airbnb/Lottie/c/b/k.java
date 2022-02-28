/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.airbnb.lottie.a.a.p
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.c.b;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.p;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.f;

public class k
implements b {
    private final String a;
    private final com.airbnb.lottie.c.a.b b;
    private final com.airbnb.lottie.c.a.b c;
    private final l d;
    private final boolean e;

    public k(String string2, com.airbnb.lottie.c.a.b b2, com.airbnb.lottie.c.a.b b3, l l2, boolean bl2) {
        this.a = string2;
        this.b = b2;
        this.c = b3;
        this.d = l2;
        this.e = bl2;
    }

    @Override
    public c a(f f2, a a2) {
        return new p(f2, a2, this);
    }

    public String a() {
        return this.a;
    }

    public com.airbnb.lottie.c.a.b b() {
        return this.b;
    }

    public com.airbnb.lottie.c.a.b c() {
        return this.c;
    }

    public l d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }
}

