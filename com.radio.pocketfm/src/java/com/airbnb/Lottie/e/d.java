/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.a
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.c
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.a.f
 *  com.airbnb.lottie.c.a.g
 *  com.airbnb.lottie.c.a.h
 *  com.airbnb.lottie.c.a.j
 *  com.airbnb.lottie.e.ac
 *  com.airbnb.lottie.e.ad
 *  com.airbnb.lottie.e.f
 *  com.airbnb.lottie.e.h
 *  com.airbnb.lottie.e.i
 *  com.airbnb.lottie.e.l
 *  com.airbnb.lottie.e.o
 *  com.airbnb.lottie.e.y
 *  java.io.IOException
 *  java.lang.Object
 *  java.util.List
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.c;
import com.airbnb.lottie.c.a.g;
import com.airbnb.lottie.c.a.j;
import com.airbnb.lottie.e.ac;
import com.airbnb.lottie.e.ad;
import com.airbnb.lottie.e.aj;
import com.airbnb.lottie.e.f;
import com.airbnb.lottie.e.h;
import com.airbnb.lottie.e.i;
import com.airbnb.lottie.e.l;
import com.airbnb.lottie.e.o;
import com.airbnb.lottie.e.r;
import com.airbnb.lottie.e.y;
import com.airbnb.lottie.g.a;
import java.io.IOException;
import java.util.List;

public class d {
    public static b a(JsonReader jsonReader, com.airbnb.lottie.d d2) throws IOException {
        return d.a(jsonReader, d2, true);
    }

    public static b a(JsonReader jsonReader, com.airbnb.lottie.d d2, boolean bl) throws IOException {
        float f2 = bl ? com.airbnb.lottie.f.f.a() : 1.0f;
        return new b(d.a(jsonReader, f2, d2, i.a));
    }

    static c a(JsonReader jsonReader, com.airbnb.lottie.d d2, int n2) throws IOException {
        return new c(d.a(jsonReader, d2, new l(n2)));
    }

    private static <T> List<a<T>> a(JsonReader jsonReader, float f2, com.airbnb.lottie.d d2, aj<T> aj2) throws IOException {
        return r.a(jsonReader, d2, f2, aj2);
    }

    private static <T> List<a<T>> a(JsonReader jsonReader, com.airbnb.lottie.d d2, aj<T> aj2) throws IOException {
        return r.a(jsonReader, d2, 1.0f, aj2);
    }

    static com.airbnb.lottie.c.a.d b(JsonReader jsonReader, com.airbnb.lottie.d d2) throws IOException {
        return new com.airbnb.lottie.c.a.d(d.a(jsonReader, d2, o.a));
    }

    static com.airbnb.lottie.c.a.f c(JsonReader jsonReader, com.airbnb.lottie.d d2) throws IOException {
        return new com.airbnb.lottie.c.a.f(d.a(jsonReader, com.airbnb.lottie.f.f.a(), d2, y.a));
    }

    static g d(JsonReader jsonReader, com.airbnb.lottie.d d2) throws IOException {
        return new g(d.a(jsonReader, d2, ac.a));
    }

    static com.airbnb.lottie.c.a.h e(JsonReader jsonReader, com.airbnb.lottie.d d2) throws IOException {
        return new com.airbnb.lottie.c.a.h(d.a(jsonReader, com.airbnb.lottie.f.f.a(), d2, ad.a));
    }

    static j f(JsonReader jsonReader, com.airbnb.lottie.d d2) throws IOException {
        return new j(d.a(jsonReader, d2, h.a));
    }

    static com.airbnb.lottie.c.a.a g(JsonReader jsonReader, com.airbnb.lottie.d d2) throws IOException {
        return new com.airbnb.lottie.c.a.a(d.a(jsonReader, d2, f.a));
    }
}

