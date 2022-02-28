/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie;

import android.graphics.Bitmap;

public class g {
    private final int a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private Bitmap f;

    public g(int n2, int n3, String string2, String string3, String string4) {
        this.a = n2;
        this.b = n3;
        this.c = string2;
        this.d = string3;
        this.e = string4;
    }

    public String a() {
        return this.c;
    }

    public void a(Bitmap bitmap) {
        this.f = bitmap;
    }

    public String b() {
        return this.d;
    }

    public Bitmap c() {
        return this.f;
    }
}

