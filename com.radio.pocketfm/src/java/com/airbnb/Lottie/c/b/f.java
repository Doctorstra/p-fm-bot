/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.c.b;

public final class f
extends Enum<f> {
    public static final /* enum */ f a = new f();
    public static final /* enum */ f b = new f();
    private static final /* synthetic */ f[] c;

    static {
        f[] arrf = new f[]{a, b};
        c = arrf;
    }

    public static f valueOf(String string2) {
        return (f)Enum.valueOf(f.class, (String)string2);
    }

    public static f[] values() {
        return (f[])c.clone();
    }
}

