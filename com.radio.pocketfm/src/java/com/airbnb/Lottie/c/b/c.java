/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.c.b;

import com.airbnb.lottie.f.b;
import com.airbnb.lottie.f.e;

public class c {
    private final float[] a;
    private final int[] b;

    public c(float[] arrf, int[] arrn) {
        this.a = arrf;
        this.b = arrn;
    }

    public void a(c c2, c c3, float f2) {
        if (c2.b.length == c3.b.length) {
            for (int i2 = 0; i2 < c2.b.length; ++i2) {
                this.a[i2] = e.a(c2.a[i2], c3.a[i2], f2);
                this.b[i2] = b.a(f2, c2.b[i2], c3.b[i2]);
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot interpolate between gradients. Lengths vary (");
        stringBuilder.append(c2.b.length);
        stringBuilder.append(" vs ");
        stringBuilder.append(c3.b.length);
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public float[] a() {
        return this.a;
    }

    public int[] b() {
        return this.b;
    }

    public int c() {
        return this.b.length;
    }
}

