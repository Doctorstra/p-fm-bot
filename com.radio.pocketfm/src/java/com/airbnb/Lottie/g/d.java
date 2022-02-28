/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.g;

public class d {
    private float a;
    private float b;

    public d() {
        this(1.0f, 1.0f);
    }

    public d(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public float a() {
        return this.a;
    }

    public void a(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public float b() {
        return this.b;
    }

    public boolean b(float f2, float f3) {
        return this.a == f2 && this.b == f3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a());
        stringBuilder.append("x");
        stringBuilder.append(this.b());
        return stringBuilder.toString();
    }
}

