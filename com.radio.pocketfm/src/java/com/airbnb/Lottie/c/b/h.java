/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.airbnb.lottie.a.a.l
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.c.b;

import com.airbnb.lottie.a.a.l;
import com.airbnb.lottie.c;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.f;

public class h
implements b {
    private final String a;
    private final a b;
    private final boolean c;

    public h(String string2, a a2, boolean bl2) {
        this.a = string2;
        this.b = a2;
        this.c = bl2;
    }

    @Override
    public com.airbnb.lottie.a.a.c a(f f2, com.airbnb.lottie.c.c.a a2) {
        if (!f2.a()) {
            c.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new l(this);
    }

    public String a() {
        return this.a;
    }

    public a b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MergePaths{mode=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

}

