/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.airbnb.lottie.c.b.n
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.c;

import com.airbnb.lottie.c.b.n;
import java.util.List;

public class d {
    private final List<n> a;
    private final char b;
    private final double c;
    private final double d;
    private final String e;
    private final String f;

    public d(List<n> list, char c2, double d2, double d3, String string2, String string3) {
        this.a = list;
        this.b = c2;
        this.c = d2;
        this.d = d3;
        this.e = string2;
        this.f = string3;
    }

    public static int a(char c2, String string2, String string3) {
        return 31 * (31 * ('\u0000' + c2) + string2.hashCode()) + string3.hashCode();
    }

    public List<n> a() {
        return this.a;
    }

    public double b() {
        return this.d;
    }

    public int hashCode() {
        return d.a(this.b, this.f, this.e);
    }
}

