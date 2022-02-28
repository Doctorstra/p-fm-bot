/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.a.e
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.c;

import androidx.a.e;
import com.airbnb.lottie.d;

public class g {
    private static final g a = new g();
    private final e<String, d> b = new e(20);

    g() {
    }

    public static g a() {
        return a;
    }

    public d a(String string2) {
        if (string2 == null) {
            return null;
        }
        return (d)this.b.a((Object)string2);
    }

    public void a(String string2, d d2) {
        if (string2 == null) {
            return;
        }
        this.b.a((Object)string2, (Object)d2);
    }
}

