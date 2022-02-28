/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.d;

public final class a
extends Enum<a> {
    public static final /* enum */ a a = new a(".json");
    public static final /* enum */ a b = new a(".zip");
    private static final /* synthetic */ a[] d;
    public final String c;

    static {
        a[] arra = new a[]{a, b};
        d = arra;
    }

    private a(String string3) {
        this.c = string3;
    }

    public static a valueOf(String string2) {
        return (a)Enum.valueOf(a.class, (String)string2);
    }

    public static a[] values() {
        return (a[])d.clone();
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".temp");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public String toString() {
        return this.c;
    }
}

