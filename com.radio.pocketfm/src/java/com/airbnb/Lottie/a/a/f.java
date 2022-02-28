/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PointF
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.a.a.b;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.k;
import com.airbnb.lottie.a.a.m;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.j;
import java.util.List;

public class f
implements k,
m,
a.a {
    private final Path a = new Path();
    private final String b;
    private final com.airbnb.lottie.f c;
    private final com.airbnb.lottie.a.b.a<?, PointF> d;
    private final com.airbnb.lottie.a.b.a<?, PointF> e;
    private final com.airbnb.lottie.c.b.a f;
    private b g = new b();
    private boolean h;

    public f(com.airbnb.lottie.f f2, a a2, com.airbnb.lottie.c.b.a a3) {
        this.b = a3.a();
        this.c = f2;
        this.d = a3.c().a();
        this.e = a3.b().a();
        this.f = a3;
        a2.a(this.d);
        a2.a(this.e);
        this.d.a(this);
        this.e.a(this);
    }

    private void c() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override
    public void a() {
        this.c();
    }

    @Override
    public void a(e e2, int n2, List<e> list, e e3) {
        com.airbnb.lottie.f.e.a(e2, n2, list, e3, this);
    }

    @Override
    public <T> void a(T t2, com.airbnb.lottie.g.c<T> c2) {
        if (t2 == j.g) {
            this.d.a(c2);
            return;
        }
        if (t2 == j.h) {
            this.e.a(c2);
        }
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
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e()) {
            this.h = true;
            return this.a;
        }
        PointF pointF = this.d.g();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.a.reset();
        if (this.f.d()) {
            Path path = this.a;
            float f6 = -f3;
            path.moveTo(0.0f, f6);
            Path path2 = this.a;
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            path2.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            Path path3 = this.a;
            float f10 = f5 + 0.0f;
            path3.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            Path path4 = this.a;
            float f11 = f4 + 0.0f;
            path4.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            this.a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            Path path = this.a;
            float f12 = -f3;
            path.moveTo(0.0f, f12);
            Path path5 = this.a;
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            path5.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            Path path6 = this.a;
            float f15 = f5 + 0.0f;
            path6.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            Path path7 = this.a;
            float f16 = 0.0f - f4;
            float f17 = -f2;
            path7.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            this.a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF pointF2 = this.e.g();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.g.a(this.a);
        this.h = true;
        return this.a;
    }
}

