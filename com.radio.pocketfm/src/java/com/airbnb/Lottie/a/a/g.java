/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.RectF
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.a.a;
import com.airbnb.lottie.a.a.e;
import com.airbnb.lottie.a.a.k;
import com.airbnb.lottie.a.a.m;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.b;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.c;
import com.airbnb.lottie.c.a.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import java.util.ArrayList;
import java.util.List;

public class g
implements e,
k,
a.a {
    private final Path a = new Path();
    private final Paint b = new a(1);
    private final com.airbnb.lottie.c.c.a c;
    private final String d;
    private final boolean e;
    private final List<m> f = new ArrayList();
    private final com.airbnb.lottie.a.b.a<Integer, Integer> g;
    private final com.airbnb.lottie.a.b.a<Integer, Integer> h;
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> i;
    private final f j;

    public g(f f2, com.airbnb.lottie.c.c.a a2, com.airbnb.lottie.c.b.m m2) {
        this.c = a2;
        this.d = m2.a();
        this.e = m2.e();
        this.j = f2;
        if (m2.b() != null && m2.c() != null) {
            this.a.setFillType(m2.d());
            this.g = m2.b().a();
            this.g.a(this);
            a2.a(this.g);
            this.h = m2.c().a();
            this.h.a(this);
            a2.a(this.h);
            return;
        }
        this.g = null;
        this.h = null;
    }

    @Override
    public void a() {
        this.j.invalidateSelf();
    }

    @Override
    public void a(Canvas canvas, Matrix matrix, int n2) {
        if (this.e) {
            return;
        }
        c.c("FillContent#draw");
        this.b.setColor(((b)this.g).i());
        int n3 = (int)(255.0f * ((float)n2 / 255.0f * (float)this.h.g().intValue() / 100.0f));
        Paint paint = this.b;
        int n4 = 0;
        paint.setAlpha(com.airbnb.lottie.f.e.a(n3, 0, 255));
        com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> a2 = this.i;
        if (a2 != null) {
            this.b.setColorFilter(a2.g());
        }
        this.a.reset();
        while (n4 < this.f.size()) {
            this.a.addPath(((m)this.f.get(n4)).e(), matrix);
            ++n4;
        }
        canvas.drawPath(this.a, this.b);
        c.d("FillContent#draw");
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl) {
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); ++i2) {
            this.a.addPath(((m)this.f.get(i2)).e(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, 1.0f + rectF.right, 1.0f + rectF.bottom);
    }

    @Override
    public void a(com.airbnb.lottie.c.e e2, int n2, List<com.airbnb.lottie.c.e> list, com.airbnb.lottie.c.e e3) {
        com.airbnb.lottie.f.e.a(e2, n2, list, e3, this);
    }

    @Override
    public <T> void a(T t2, com.airbnb.lottie.g.c<T> c2) {
        if (t2 == j.a) {
            this.g.a(c2);
            return;
        }
        if (t2 == j.d) {
            this.h.a(c2);
            return;
        }
        if (t2 == j.z) {
            if (c2 == null) {
                this.i = null;
                return;
            }
            this.i = new p<ColorFilter, T>(c2);
            this.i.a(this);
            this.c.a(this.i);
        }
    }

    @Override
    public void a(List<com.airbnb.lottie.a.a.c> list, List<com.airbnb.lottie.a.a.c> list2) {
        for (int i2 = 0; i2 < list2.size(); ++i2) {
            com.airbnb.lottie.a.a.c c2 = (com.airbnb.lottie.a.a.c)list2.get(i2);
            if (!(c2 instanceof m)) continue;
            this.f.add((Object)((m)c2));
        }
    }

    @Override
    public String b() {
        return this.d;
    }
}

