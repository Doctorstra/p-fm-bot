/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.c;

public class b {
    public final String a;
    public final String b;
    public final double c;
    public final a d;
    public final int e;
    final double f;
    public final double g;
    public final int h;
    public final int i;
    public final double j;
    public final boolean k;

    public b(String string2, String string3, double d2, a a2, int n2, double d3, double d4, int n3, int n4, double d5, boolean bl) {
        this.a = string2;
        this.b = string3;
        this.c = d2;
        this.d = a2;
        this.e = n2;
        this.f = d3;
        this.g = d4;
        this.h = n3;
        this.i = n4;
        this.j = d5;
        this.k = bl;
    }

    public int hashCode() {
        double d2 = 31 * (31 * this.a.hashCode() + this.b.hashCode());
        double d3 = this.c;
        Double.isNaN((double)d2);
        int n2 = 31 * (31 * (int)(d2 + d3) + this.d.ordinal()) + this.e;
        long l2 = Double.doubleToLongBits((double)this.f);
        return 31 * (n2 * 31 + (int)(l2 ^ l2 >>> 32)) + this.h;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        static {
            a[] arra = new a[]{a, b, c};
            d = arra;
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])d.clone();
        }
    }

}

