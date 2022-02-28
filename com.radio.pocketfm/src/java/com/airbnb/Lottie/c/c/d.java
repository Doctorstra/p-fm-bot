/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.j
 *  com.airbnb.lottie.c.a.l
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Locale
 */
package com.airbnb.lottie.c.c;

import com.airbnb.lottie.c.a.j;
import com.airbnb.lottie.c.a.k;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.c.b.g;
import java.util.List;
import java.util.Locale;

public class d {
    private final List<com.airbnb.lottie.c.b.b> a;
    private final com.airbnb.lottie.d b;
    private final String c;
    private final long d;
    private final a e;
    private final long f;
    private final String g;
    private final List<g> h;
    private final l i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;
    private final j q;
    private final k r;
    private final com.airbnb.lottie.c.a.b s;
    private final List<com.airbnb.lottie.g.a<Float>> t;
    private final b u;
    private final boolean v;

    public d(List<com.airbnb.lottie.c.b.b> list, com.airbnb.lottie.d d2, String string2, long l2, a a2, long l3, String string3, List<g> list2, l l4, int n2, int n3, int n4, float f2, float f3, int n5, int n6, j j2, k k2, List<com.airbnb.lottie.g.a<Float>> list3, b b2, com.airbnb.lottie.c.a.b b3, boolean bl) {
        this.a = list;
        this.b = d2;
        this.c = string2;
        this.d = l2;
        this.e = a2;
        this.f = l3;
        this.g = string3;
        this.h = list2;
        this.i = l4;
        this.j = n2;
        this.k = n3;
        this.l = n4;
        this.m = f2;
        this.n = f3;
        this.o = n5;
        this.p = n6;
        this.q = j2;
        this.r = k2;
        this.t = list3;
        this.u = b2;
        this.s = b3;
        this.v = bl;
    }

    com.airbnb.lottie.d a() {
        return this.b;
    }

    public String a(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(this.f());
        stringBuilder.append("\n");
        d d2 = this.b.a(this.m());
        if (d2 != null) {
            stringBuilder.append("\t\tParents: ");
            stringBuilder.append(d2.f());
            d d3 = this.b.a(d2.m());
            while (d3 != null) {
                stringBuilder.append("->");
                stringBuilder.append(d3.f());
                d3 = this.b.a(d3.m());
            }
            stringBuilder.append(string2);
            stringBuilder.append("\n");
        }
        if (!this.j().isEmpty()) {
            stringBuilder.append(string2);
            stringBuilder.append("\tMasks: ");
            stringBuilder.append(this.j().size());
            stringBuilder.append("\n");
        }
        if (this.r() != 0 && this.q() != 0) {
            stringBuilder.append(string2);
            stringBuilder.append("\tBackground: ");
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{this.r(), this.q(), this.p()};
            stringBuilder.append(String.format((Locale)locale, (String)"%dx%d %X\n", (Object[])arrobject));
        }
        if (!this.a.isEmpty()) {
            stringBuilder.append(string2);
            stringBuilder.append("\tShapes:\n");
            for (Object object : this.a) {
                stringBuilder.append(string2);
                stringBuilder.append("\t\t");
                stringBuilder.append(object);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    float b() {
        return this.m;
    }

    float c() {
        return this.n / this.b.m();
    }

    List<com.airbnb.lottie.g.a<Float>> d() {
        return this.t;
    }

    public long e() {
        return this.d;
    }

    String f() {
        return this.c;
    }

    String g() {
        return this.g;
    }

    int h() {
        return this.o;
    }

    int i() {
        return this.p;
    }

    List<g> j() {
        return this.h;
    }

    public a k() {
        return this.e;
    }

    b l() {
        return this.u;
    }

    long m() {
        return this.f;
    }

    List<com.airbnb.lottie.c.b.b> n() {
        return this.a;
    }

    l o() {
        return this.i;
    }

    int p() {
        return this.l;
    }

    int q() {
        return this.k;
    }

    int r() {
        return this.j;
    }

    j s() {
        return this.q;
    }

    k t() {
        return this.r;
    }

    public String toString() {
        return this.a("");
    }

    com.airbnb.lottie.c.a.b u() {
        return this.s;
    }

    public boolean v() {
        return this.v;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        private static final /* synthetic */ a[] h;

        static {
            a[] arra = new a[]{a, b, c, d, e, f, g};
            h = arra;
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])h.clone();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        public static final /* enum */ b d = new b();
        private static final /* synthetic */ b[] e;

        static {
            b[] arrb = new b[]{a, b, c, d};
            e = arrb;
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])e.clone();
        }
    }

}

