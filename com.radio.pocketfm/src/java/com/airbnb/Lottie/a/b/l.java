/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  java.lang.Object
 *  java.util.List
 */
package com.airbnb.lottie.a.b;

import android.graphics.Path;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.f.e;
import java.util.List;

public class l
extends a<com.airbnb.lottie.c.b.l, Path> {
    private final com.airbnb.lottie.c.b.l c = new com.airbnb.lottie.c.b.l();
    private final Path d = new Path();

    public l(List<com.airbnb.lottie.g.a<com.airbnb.lottie.c.b.l>> list) {
        super(list);
    }

    @Override
    public /* synthetic */ Object a(com.airbnb.lottie.g.a a2, float f2) {
        return this.b(a2, f2);
    }

    public Path b(com.airbnb.lottie.g.a<com.airbnb.lottie.c.b.l> a2, float f2) {
        com.airbnb.lottie.c.b.l l2 = (com.airbnb.lottie.c.b.l)a2.a;
        com.airbnb.lottie.c.b.l l3 = (com.airbnb.lottie.c.b.l)a2.b;
        this.c.a(l2, l3, f2);
        e.a(this.c, this.d);
        return this.d;
    }
}

