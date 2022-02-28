/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.RectF
 *  androidx.a.d
 *  java.lang.Float
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.c;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.c.c.b;
import com.airbnb.lottie.c.c.d;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import java.util.ArrayList;
import java.util.List;

public class b
extends a {
    private com.airbnb.lottie.a.b.a<Float, Float> e;
    private final List<a> f = new ArrayList();
    private final RectF g = new RectF();
    private final RectF h = new RectF();

    public b(f f2, com.airbnb.lottie.c.c.d d2, List<com.airbnb.lottie.c.c.d> list, d d3) {
        super(f2, d2);
        com.airbnb.lottie.c.a.b b2 = d2.u();
        if (b2 != null) {
            this.e = b2.a();
            this.a(this.e);
            this.e.a(this);
        } else {
            this.e = null;
        }
        androidx.a.d d4 = new androidx.a.d(d3.i().size());
        int n2 = list.size() - 1;
        a a2 = null;
        do {
            if (n2 < 0) break;
            com.airbnb.lottie.c.c.d d5 = (com.airbnb.lottie.c.c.d)list.get(n2);
            a a3 = a.a(d5, f2, d3);
            if (a3 != null) {
                d4.b(a3.c().e(), (Object)a3);
                if (a2 != null) {
                    a2.a(a3);
                    a2 = null;
                } else {
                    this.f.add(0, (Object)a3);
                    int n3 = 1.a[d5.l().ordinal()];
                    if (n3 == 1 || n3 == 2) {
                        a2 = a3;
                    }
                }
            }
            --n2;
        } while (true);
        for (int i2 = 0; i2 < d4.b(); ++i2) {
            a a4;
            a a5 = (a)d4.a(d4.b(i2));
            if (a5 == null || (a4 = (a)d4.a(a5.c().m())) == null) continue;
            a5.b(a4);
        }
    }

    @Override
    public void a(float f2) {
        super.a(f2);
        if (this.e != null) {
            float f3 = this.b.s().e();
            f2 = (float)((long)(1000.0f * this.e.g().floatValue())) / f3;
        }
        if (this.c.b() != 0.0f) {
            f2 /= this.c.b();
        }
        float f4 = f2 - this.c.c();
        for (int i2 = -1 + this.f.size(); i2 >= 0; --i2) {
            ((a)this.f.get(i2)).a(f4);
        }
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl2) {
        super.a(rectF, matrix, bl2);
        for (int i2 = this.f.size() - 1; i2 >= 0; --i2) {
            this.g.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((a)this.f.get(i2)).a(this.g, this.a, true);
            rectF.union(this.g);
        }
    }

    @Override
    public <T> void a(T t2, com.airbnb.lottie.g.c<T> c2) {
        super.a(t2, c2);
        if (t2 == j.y) {
            if (c2 == null) {
                this.e = null;
                return;
            }
            this.e = new p<Float, T>(c2);
            this.a(this.e);
        }
    }

    @Override
    void b(Canvas canvas, Matrix matrix, int n2) {
        c.c("CompositionLayer#draw");
        canvas.save();
        this.h.set(0.0f, 0.0f, (float)this.c.h(), (float)this.c.i());
        matrix.mapRect(this.h);
        for (int i2 = this.f.size() - 1; i2 >= 0; --i2) {
            boolean bl2 = !this.h.isEmpty() ? canvas.clipRect(this.h) : true;
            if (!bl2) continue;
            ((a)this.f.get(i2)).a(canvas, matrix, n2);
        }
        canvas.restore();
        c.d("CompositionLayer#draw");
    }

    @Override
    protected void b(e e2, int n2, List<e> list, e e3) {
        for (int i2 = 0; i2 < this.f.size(); ++i2) {
            ((a)this.f.get(i2)).a(e2, n2, list, e3);
        }
    }
}

