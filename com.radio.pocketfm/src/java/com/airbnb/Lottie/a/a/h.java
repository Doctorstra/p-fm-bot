/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.LinearGradient
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.PointF
 *  android.graphics.RadialGradient
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  androidx.a.d
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.a.a;
import com.airbnb.lottie.a.a.e;
import com.airbnb.lottie.a.a.k;
import com.airbnb.lottie.a.a.m;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import java.util.ArrayList;
import java.util.List;

public class h
implements e,
k,
a.a {
    private final String a;
    private final boolean b;
    private final com.airbnb.lottie.c.c.a c;
    private final androidx.a.d<LinearGradient> d = new androidx.a.d();
    private final androidx.a.d<RadialGradient> e = new androidx.a.d();
    private final Matrix f = new Matrix();
    private final Path g = new Path();
    private final Paint h = new a(1);
    private final RectF i = new RectF();
    private final List<m> j = new ArrayList();
    private final com.airbnb.lottie.c.b.f k;
    private final com.airbnb.lottie.a.b.a<com.airbnb.lottie.c.b.c, com.airbnb.lottie.c.b.c> l;
    private final com.airbnb.lottie.a.b.a<Integer, Integer> m;
    private final com.airbnb.lottie.a.b.a<PointF, PointF> n;
    private final com.airbnb.lottie.a.b.a<PointF, PointF> o;
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> p;
    private final f q;
    private final int r;

    public h(f f2, com.airbnb.lottie.c.c.a a2, com.airbnb.lottie.c.b.d d2) {
        this.c = a2;
        this.a = d2.a();
        this.b = d2.h();
        this.q = f2;
        this.k = d2.b();
        this.g.setFillType(d2.c());
        this.r = (int)(f2.s().e() / 32.0f);
        this.l = d2.d().a();
        this.l.a(this);
        a2.a(this.l);
        this.m = d2.e().a();
        this.m.a(this);
        a2.a(this.m);
        this.n = d2.f().a();
        this.n.a(this);
        a2.a(this.n);
        this.o = d2.g().a();
        this.o.a(this);
        a2.a(this.o);
    }

    private LinearGradient c() {
        androidx.a.d<LinearGradient> d2 = this.d;
        int n2 = this.e();
        long l2 = n2;
        LinearGradient linearGradient = (LinearGradient)d2.a(l2);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = this.n.g();
        PointF pointF2 = this.o.g();
        com.airbnb.lottie.c.b.c c2 = this.l.g();
        int[] arrn = c2.b();
        float[] arrf = c2.a();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, arrn, arrf, Shader.TileMode.CLAMP);
        this.d.b(l2, (Object)linearGradient2);
        return linearGradient2;
    }

    private RadialGradient d() {
        androidx.a.d<RadialGradient> d2 = this.e;
        int n2 = this.e();
        long l2 = n2;
        RadialGradient radialGradient = (RadialGradient)d2.a(l2);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = this.n.g();
        PointF pointF2 = this.o.g();
        com.airbnb.lottie.c.b.c c2 = this.l.g();
        int[] arrn = c2.b();
        float[] arrf = c2.a();
        float f2 = pointF2.x;
        float f3 = pointF.x;
        float f4 = pointF2.y;
        float f5 = pointF.y;
        float f6 = (float)Math.hypot((double)(f2 - f3), (double)(f4 - f5));
        float f7 = f6 <= 0.0f ? 0.001f : f6;
        RadialGradient radialGradient2 = new RadialGradient(f3, f5, f7, arrn, arrf, Shader.TileMode.CLAMP);
        this.e.b(l2, (Object)radialGradient2);
        return radialGradient2;
    }

    private int e() {
        int n2 = Math.round((float)(this.n.h() * (float)this.r));
        int n3 = Math.round((float)(this.o.h() * (float)this.r));
        int n4 = Math.round((float)(this.l.h() * (float)this.r));
        int n5 = n2 != 0 ? 527 * n2 : 17;
        if (n3 != 0) {
            n5 = n3 * (n5 * 31);
        }
        if (n4 != 0) {
            n5 = n4 * (n5 * 31);
        }
        return n5;
    }

    @Override
    public void a() {
        this.q.invalidateSelf();
    }

    @Override
    public void a(Canvas canvas, Matrix matrix, int n2) {
        if (this.b) {
            return;
        }
        c.c("GradientFillContent#draw");
        this.g.reset();
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            this.g.addPath(((m)this.j.get(i2)).e(), matrix);
        }
        this.g.computeBounds(this.i, false);
        Object object = this.k == com.airbnb.lottie.c.b.f.a ? this.c() : this.d();
        this.f.set(matrix);
        object.setLocalMatrix(this.f);
        this.h.setShader((Shader)object);
        com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> a2 = this.p;
        if (a2 != null) {
            this.h.setColorFilter(a2.g());
        }
        int n3 = (int)(255.0f * ((float)n2 / 255.0f * (float)this.m.g().intValue() / 100.0f));
        this.h.setAlpha(com.airbnb.lottie.f.e.a(n3, 0, 255));
        canvas.drawPath(this.g, this.h);
        c.d("GradientFillContent#draw");
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl) {
        this.g.reset();
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            this.g.addPath(((m)this.j.get(i2)).e(), matrix);
        }
        this.g.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, 1.0f + rectF.right, 1.0f + rectF.bottom);
    }

    @Override
    public void a(com.airbnb.lottie.c.e e2, int n2, List<com.airbnb.lottie.c.e> list, com.airbnb.lottie.c.e e3) {
        com.airbnb.lottie.f.e.a(e2, n2, list, e3, this);
    }

    @Override
    public <T> void a(T t2, com.airbnb.lottie.g.c<T> c2) {
        if (t2 == j.z) {
            if (c2 == null) {
                this.p = null;
                return;
            }
            this.p = new p<ColorFilter, T>(c2);
            this.p.a(this);
            this.c.a(this.p);
        }
    }

    @Override
    public void a(List<com.airbnb.lottie.a.a.c> list, List<com.airbnb.lottie.a.a.c> list2) {
        for (int i2 = 0; i2 < list2.size(); ++i2) {
            com.airbnb.lottie.a.a.c c2 = (com.airbnb.lottie.a.a.c)list2.get(i2);
            if (!(c2 instanceof m)) continue;
            this.j.add((Object)((m)c2));
        }
    }

    @Override
    public String b() {
        return this.a;
    }
}

