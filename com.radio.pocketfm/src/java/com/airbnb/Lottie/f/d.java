/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.airbnb.lottie.f;

public class d {
    private float a;
    private int b;

    public void a(float f2) {
        this.a = f2 + this.a;
        this.b = 1 + this.b;
        int n2 = this.b;
        if (n2 == Integer.MAX_VALUE) {
            this.a /= 2.0f;
            this.b = n2 / 2;
        }
    }
}

