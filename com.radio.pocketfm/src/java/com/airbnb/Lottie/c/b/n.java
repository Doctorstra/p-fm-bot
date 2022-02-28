/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.airbnb.lottie.a.a.d
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package com.airbnb.lottie.c.b;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.d;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.f;
import java.util.Arrays;
import java.util.List;

public class n
implements b {
    private final String a;
    private final List<b> b;
    private final boolean c;

    public n(String string2, List<b> list, boolean bl2) {
        this.a = string2;
        this.b = list;
        this.c = bl2;
    }

    @Override
    public c a(f f2, a a2) {
        return new d(f2, a2, this);
    }

    public String a() {
        return this.a;
    }

    public List<b> b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeGroup{name='");
        stringBuilder.append(this.a);
        stringBuilder.append("' Shapes: ");
        stringBuilder.append(Arrays.toString((Object[])this.b.toArray()));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

