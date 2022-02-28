/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.graphics.RectF
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.a.a.b;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.k;
import com.airbnb.lottie.a.a.m;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.b.j;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.f;
import java.util.List;

public class o
implements k,
m,
a.a {
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final String c;
    private final boolean d;
    private final f e;
    private final com.airbnb.lottie.a.b.a<?, PointF> f;
    private final com.airbnb.lottie.a.b.a<?, PointF> g;
    private final com.airbnb.lottie.a.b.a<?, Float> h;
    private b i = new b();
    private boolean j;

    public o(f f2, a a2, j j2) {
        this.c = j2.a();
        this.d = j2.e();
        this.e = f2;
        this.f = j2.d().a();
        this.g = j2.c().a();
        this.h = j2.b().a();
        a2.a(this.f);
        a2.a(this.g);
        a2.a(this.h);
        this.f.a(this);
        this.g.a(this);
        this.h.a(this);
    }

    private void c() {
        this.j = false;
        this.e.invalidateSelf();
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
    }

    @Override
    public void a(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            s s2;
            c c2 = (c)list.get(i2);
            if (!(c2 instanceof s) || (s2 = (s)c2).c() != q.a.a) continue;
            this.i.a(s2);
            s2.a(this);
        }
    }

    @Override
    public String b() {
        return this.c;
    }

    @Override
    public Path e() {
        float f2;
        float f3;
        float f4;
        if (this.j) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.j = true;
            return this.a;
        }
        PointF pointF = this.g.g();
        com.airbnb.lottie.a.b.a<?, Float> a2 = this.h;
        float f5 = a2 == null ? 0.0f : ((com.airbnb.lottie.a.b.c)a2).i();
        if (f5 > (f3 = Math.min((float)(f2 = pointF.x / 2.0f), (float)(f4 = pointF.y / 2.0f)))) {
            f5 = f3;
        }
        PointF pointF2 = this.f.g();
        this.a.moveTo(f2 + pointF2.x, f5 + (pointF2.y - f4));
        this.a.lineTo(f2 + pointF2.x, f4 + pointF2.y - f5);
        if (f5 > 0.0f) {
            RectF rectF = this.b;
            float f6 = f2 + pointF2.x;
            float f7 = f5 * 2.0f;
            rectF.set(f6 - f7, f4 + pointF2.y - f7, f2 + pointF2.x, f4 + pointF2.y);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo(f5 + (pointF2.x - f2), f4 + pointF2.y);
        if (f5 > 0.0f) {
            RectF rectF = this.b;
            float f8 = pointF2.x - f2;
            float f9 = f4 + pointF2.y;
            float f10 = f5 * 2.0f;
            rectF.set(f8, f9 - f10, f10 + (pointF2.x - f2), f4 + pointF2.y);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - f2, f5 + (pointF2.y - f4));
        if (f5 > 0.0f) {
            RectF rectF = this.b;
            float f11 = pointF2.x - f2;
            float f12 = pointF2.y - f4;
            float f13 = pointF2.x - f2;
            float f14 = f5 * 2.0f;
            rectF.set(f11, f12, f13 + f14, f14 + (pointF2.y - f4));
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo(f2 + pointF2.x - f5, pointF2.y - f4);
        if (f5 > 0.0f) {
            RectF rectF = this.b;
            float f15 = f2 + pointF2.x;
            float f16 = f5 * 2.0f;
            rectF.set(f15 - f16, pointF2.y - f4, f2 + pointF2.x, f16 + (pointF2.y - f4));
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.a(this.a);
        this.j = true;
        return this.a;
    }
}

