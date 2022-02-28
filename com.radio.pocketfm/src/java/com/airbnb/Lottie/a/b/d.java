/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package com.airbnb.lottie.a.b;

import com.airbnb.lottie.a.b.f;
import com.airbnb.lottie.c.b.c;
import com.airbnb.lottie.g.a;
import java.util.List;

public class d
extends f<c> {
    private final c c;

    public d(List<a<c>> list) {
        super(list);
        c c2 = (c)((a)list.get((int)0)).a;
        int n2 = c2 == null ? 0 : c2.c();
        this.c = new c(new float[n2], new int[n2]);
    }

    @Override
    /* synthetic */ Object a(a a2, float f2) {
        return this.b(a2, f2);
    }

    c b(a<c> a2, float f2) {
        this.c.a((c)a2.a, (c)a2.b, f2);
        return this.c;
    }
}

