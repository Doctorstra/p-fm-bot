/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.DashPathEffect
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PathEffect
 *  android.graphics.PathMeasure
 *  android.graphics.RectF
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.a.a.a;
import com.airbnb.lottie.a.a.e;
import com.airbnb.lottie.a.a.k;
import com.airbnb.lottie.a.a.m;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.c;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.d;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import java.util.ArrayList;
import java.util.List;

public abstract class a
implements e,
k,
a.a {
    final Paint a = new com.airbnb.lottie.a.a(1);
    private final PathMeasure b = new PathMeasure();
    private final Path c = new Path();
    private final Path d = new Path();
    private final RectF e = new RectF();
    private final f f;
    private final com.airbnb.lottie.c.c.a g;
    private final List<a> h = new ArrayList();
    private final float[] i;
    private final com.airbnb.lottie.a.b.a<?, Float> j;
    private final com.airbnb.lottie.a.b.a<?, Integer> k;
    private final List<com.airbnb.lottie.a.b.a<?, Float>> l;
    private final com.airbnb.lottie.a.b.a<?, Float> m;
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> n;

    a(f f2, com.airbnb.lottie.c.c.a a2, Paint.Cap cap, Paint.Join join, float f3, d d2, b b2, List<b> list, b b3) {
        this.f = f2;
        this.g = a2;
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeCap(cap);
        this.a.setStrokeJoin(join);
        this.a.setStrokeMiter(f3);
        this.k = d2.a();
        this.j = b2.a();
        this.m = b3 == null ? null : b3.a();
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        int n2 = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.l.add(((b)list.get(i2)).a());
        }
        a2.a(this.k);
        a2.a(this.j);
        for (int i3 = 0; i3 < this.l.size(); ++i3) {
            a2.a((com.airbnb.lottie.a.b.a)this.l.get(i3));
        }
        com.airbnb.lottie.a.b.a<?, Float> a3 = this.m;
        if (a3 != null) {
            a2.a(a3);
        }
        this.k.a(this);
        this.j.a(this);
        while (n2 < list.size()) {
            ((com.airbnb.lottie.a.b.a)this.l.get(n2)).a(this);
            ++n2;
        }
        com.airbnb.lottie.a.b.a<?, Float> a4 = this.m;
        if (a4 != null) {
            a4.a(this);
        }
    }

    private void a(Canvas canvas, a a2, Matrix matrix) {
        c.c("StrokeContent#applyTrimPath");
        if (a2.b == null) {
            c.d("StrokeContent#applyTrimPath");
            return;
        }
        this.c.reset();
        for (int i2 = -1 + a.a(a2).size(); i2 >= 0; --i2) {
            this.c.addPath(((m)a2.a.get(i2)).e(), matrix);
        }
        this.b.setPath(this.c, false);
        float f2 = this.b.getLength();
        while (this.b.nextContour()) {
            f2 += this.b.getLength();
        }
        float f3 = f2 * a2.b.f().g().floatValue() / 360.0f;
        float f4 = f3 + f2 * a2.b.d().g().floatValue() / 100.0f;
        float f5 = f3 + f2 * a2.b.e().g().floatValue() / 100.0f;
        float f6 = 0.0f;
        for (int i3 = -1 + a.a(a2).size(); i3 >= 0; --i3) {
            float f7;
            this.d.set(((m)a2.a.get(i3)).e());
            this.d.transform(matrix);
            this.b.setPath(this.d, false);
            float f8 = this.b.getLength();
            float f9 = 1.0f;
            if (f5 > f2 && (f7 = f5 - f2) < f6 + f8 && f6 < f7) {
                float f10 = f4 > f2 ? (f4 - f2) / f8 : 0.0f;
                float f11 = Math.min((float)(f7 / f8), (float)f9);
                com.airbnb.lottie.f.f.a(this.d, f10, f11, 0.0f);
                canvas.drawPath(this.d, this.a);
            } else {
                float f12 = f6 + f8;
                if (!(f12 < f4) && !(f6 > f5)) {
                    if (f12 <= f5 && f4 < f6) {
                        canvas.drawPath(this.d, this.a);
                    } else {
                        float f13 = f4 < f6 ? 0.0f : (f4 - f6) / f8;
                        if (!(f5 > f12)) {
                            f9 = (f5 - f6) / f8;
                        }
                        com.airbnb.lottie.f.f.a(this.d, f13, f9, 0.0f);
                        canvas.drawPath(this.d, this.a);
                    }
                }
            }
            f6 += f8;
        }
        c.d("StrokeContent#applyTrimPath");
    }

    private void a(Matrix matrix) {
        c.c("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            c.d("StrokeContent#applyDashPattern");
            return;
        }
        float f2 = com.airbnb.lottie.f.f.a(matrix);
        for (int i2 = 0; i2 < this.l.size(); ++i2) {
            this.i[i2] = ((Float)((com.airbnb.lottie.a.b.a)this.l.get(i2)).g()).floatValue();
            if (i2 % 2 == 0) {
                float[] arrf = this.i;
                if (arrf[i2] < 1.0f) {
                    arrf[i2] = 1.0f;
                }
            } else {
                float[] arrf = this.i;
                if (arrf[i2] < 0.1f) {
                    arrf[i2] = 0.1f;
                }
            }
            float[] arrf = this.i;
            arrf[i2] = f2 * arrf[i2];
        }
        com.airbnb.lottie.a.b.a<?, Float> a2 = this.m;
        float f3 = a2 == null ? 0.0f : a2.g().floatValue();
        this.a.setPathEffect((PathEffect)new DashPathEffect(this.i, f3));
        c.d("StrokeContent#applyDashPattern");
    }

    @Override
    public void a() {
        this.f.invalidateSelf();
    }

    @Override
    public void a(Canvas canvas, Matrix matrix, int n2) {
        c.c("StrokeContent#draw");
        int n3 = (int)(255.0f * ((float)n2 / 255.0f * (float)((com.airbnb.lottie.a.b.e)this.k).i() / 100.0f));
        this.a.setAlpha(com.airbnb.lottie.f.e.a(n3, 0, 255));
        this.a.setStrokeWidth(((com.airbnb.lottie.a.b.c)this.j).i() * com.airbnb.lottie.f.f.a(matrix));
        if (this.a.getStrokeWidth() <= 0.0f) {
            c.d("StrokeContent#draw");
            return;
        }
        this.a(matrix);
        com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> a2 = this.n;
        int n4 = 0;
        if (a2 != null) {
            this.a.setColorFilter(a2.g());
        }
        while (n4 < this.h.size()) {
            a a3 = this.h.get(n4);
            if (a3.b != null) {
                this.a(canvas, a3, matrix);
            } else {
                c.c("StrokeContent#buildPath");
                this.c.reset();
                for (int i2 = -1 + a.a(a3).size(); i2 >= 0; --i2) {
                    this.c.addPath(((m)a3.a.get(i2)).e(), matrix);
                }
                c.d("StrokeContent#buildPath");
                c.c("StrokeContent#drawPath");
                canvas.drawPath(this.c, this.a);
                c.d("StrokeContent#drawPath");
            }
            ++n4;
        }
        c.d("StrokeContent#draw");
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl) {
        c.c("StrokeContent#getBounds");
        this.c.reset();
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            a a2 = this.h.get(i2);
            for (int i3 = 0; i3 < a2.a.size(); ++i3) {
                this.c.addPath(((m)a2.a.get(i3)).e(), matrix);
            }
        }
        this.c.computeBounds(this.e, false);
        float f2 = ((com.airbnb.lottie.a.b.c)this.j).i();
        RectF rectF2 = this.e;
        float f3 = rectF2.left;
        float f4 = f2 / 2.0f;
        rectF2.set(f3 - f4, this.e.top - f4, f4 + this.e.right, f4 + this.e.bottom);
        rectF.set(this.e);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, 1.0f + rectF.right, 1.0f + rectF.bottom);
        c.d("StrokeContent#getBounds");
    }

    @Override
    public void a(com.airbnb.lottie.c.e e2, int n2, List<com.airbnb.lottie.c.e> list, com.airbnb.lottie.c.e e3) {
        com.airbnb.lottie.f.e.a(e2, n2, list, e3, this);
    }

    @Override
    public <T> void a(T t2, com.airbnb.lottie.g.c<T> c2) {
        if (t2 == j.d) {
            this.k.a(c2);
            return;
        }
        if (t2 == j.m) {
            this.j.a(c2);
            return;
        }
        if (t2 == j.z) {
            if (c2 == null) {
                this.n = null;
                return;
            }
            this.n = new p<ColorFilter, T>(c2);
            this.n.a(this);
            this.g.a(this.n);
        }
    }

    @Override
    public void a(List<com.airbnb.lottie.a.a.c> list, List<com.airbnb.lottie.a.a.c> list2) {
        s s2 = null;
        for (int i2 = -1 + list.size(); i2 >= 0; --i2) {
            s s3;
            com.airbnb.lottie.a.a.c c2 = (com.airbnb.lottie.a.a.c)list.get(i2);
            if (!(c2 instanceof s) || (s3 = (s)c2).c() != q.a.b) continue;
            s2 = s3;
        }
        if (s2 != null) {
            s2.a(this);
        }
        Object object = null;
        for (int i3 = -1 + list2.size(); i3 >= 0; --i3) {
            s s4;
            com.airbnb.lottie.a.a.c c3 = (com.airbnb.lottie.a.a.c)list2.get(i3);
            if (c3 instanceof s && (s4 = (s)c3).c() == q.a.b) {
                if (object != null) {
                    this.h.add(object);
                }
                object = new Object(s4){
                    private final List<m> a = new ArrayList();
                    private final s b;
                    {
                        this.b = s2;
                    }
                };
                s4.a(this);
                continue;
            }
            if (!(c3 instanceof m)) continue;
            if (object == null) {
                object = new /* invalid duplicate definition of identical inner class */;
            }
            object.a.add((Object)((m)c3));
        }
        if (object != null) {
            this.h.add(object);
        }
    }

}

