/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.a.a;

import android.graphics.Path;
import com.airbnb.lottie.a.a.b;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.m;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.a.h;
import com.airbnb.lottie.c.b.l;
import com.airbnb.lottie.c.b.o;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.f;
import java.util.List;

public class q
implements m,
a.a {
    private final Path a = new Path();
    private final String b;
    private final boolean c;
    private final f d;
    private final com.airbnb.lottie.a.b.a<?, Path> e;
    private boolean f;
    private b g = new b();

    public q(f f2, a a2, o o2) {
        this.b = o2.a();
        this.c = o2.c();
        this.d = f2;
        this.e = o2.b().a();
        a2.a(this.e);
        this.e.a(this);
    }

    private void c() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override
    public void a() {
        this.c();
    }

    @Override
    public void a(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            s s2;
            c c2 = (c)list.get(i2);
            if (!(c2 instanceof s) || (s2 = (s)c2).c() != q.a.a) continue;
            this.g.a(s2);
            s2.a(this);
        }
    }

    @Override
    public String b() {
        return this.b;
    }

    @Override
    public Path e() {
        if (this.f) {
            return this.a;
        }
        this.a.reset();
        if (this.c) {
            this.f = true;
            return this.a;
        }
        this.a.set(this.e.g());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.g.a(this.a);
        this.f = true;
        return this.a;
    }
}

