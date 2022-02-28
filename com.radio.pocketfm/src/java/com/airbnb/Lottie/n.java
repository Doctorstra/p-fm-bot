/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie;

public final class n
extends Enum<n> {
    public static final /* enum */ n a = new n();
    public static final /* enum */ n b = new n();
    public static final /* enum */ n c = new n();
    private static final /* synthetic */ n[] d;

    static {
        n[] arrn = new n[]{a, b, c};
        d = arrn;
    }

    public static n valueOf(String string2) {
        return (n)Enum.valueOf(n.class, (String)string2);
    }

    public static n[] values() {
        return (n[])d.clone();
    }
}

