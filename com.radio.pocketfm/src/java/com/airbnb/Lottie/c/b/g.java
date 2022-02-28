/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.a.h
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.c.b;

import com.airbnb.lottie.c.a.d;
import com.airbnb.lottie.c.a.h;

public class g {
    private final a a;
    private final h b;
    private final d c;

    public g(a a2, h h2, d d2) {
        this.a = a2;
        this.b = h2;
        this.c = d2;
    }

    public a a() {
        return this.a;
    }

    public h b() {
        return this.b;
    }

    public d c() {
        return this.c;
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

