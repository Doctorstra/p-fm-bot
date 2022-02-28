/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  androidx.a.h
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package com.airbnb.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.c.a.k;
import com.airbnb.lottie.c.b;
import com.airbnb.lottie.c.b.n;
import com.airbnb.lottie.c.c;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.c.c.h;
import com.airbnb.lottie.c.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import com.airbnb.lottie.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h
extends a {
    private final char[] e = new char[1];
    private final RectF f = new RectF();
    private final Matrix g = new Matrix();
    private final Paint h = new Paint(this, 1){
        final /* synthetic */ h a;
        {
            this.a = h2;
            super(n2);
            this.setStyle(Paint.Style.FILL);
        }
    };
    private final Paint i = new Paint(this, 1){
        final /* synthetic */ h a;
        {
            this.a = h2;
            super(n2);
            this.setStyle(Paint.Style.STROKE);
        }
    };
    private final Map<d, List<com.airbnb.lottie.a.a.d>> j = new HashMap();
    private final com.airbnb.lottie.a.b.n k;
    private final f l;
    private final com.airbnb.lottie.d m;
    private com.airbnb.lottie.a.b.a<Integer, Integer> n;
    private com.airbnb.lottie.a.b.a<Integer, Integer> o;
    private com.airbnb.lottie.a.b.a<Float, Float> p;
    private com.airbnb.lottie.a.b.a<Float, Float> q;

    h(f f2, com.airbnb.lottie.c.c.d d2) {
        super(f2, d2);
        this.l = f2;
        this.m = d2.a();
        this.k = d2.s().d();
        this.k.a(this);
        this.a(this.k);
        k k2 = d2.t();
        if (k2 != null && k2.a != null) {
            this.n = k2.a.a();
            this.n.a(this);
            this.a(this.n);
        }
        if (k2 != null && k2.b != null) {
            this.o = k2.b.a();
            this.o.a(this);
            this.a(this.o);
        }
        if (k2 != null && k2.c != null) {
            this.p = k2.c.a();
            this.p.a(this);
            this.a(this.p);
        }
        if (k2 != null && k2.d != null) {
            this.q = k2.d.a();
            this.q.a(this);
            this.a(this.q);
        }
    }

    private float a(b b2, c c2, float f2, float f3) {
        float f4 = 0.0f;
        for (int i2 = 0; i2 < b2.a.length(); ++i2) {
            int n2 = d.a(b2.a.charAt(i2), c2.a(), c2.c());
            d d2 = (d)this.m.j().a(n2);
            if (d2 == null) continue;
            double d3 = f4;
            double d4 = d2.b();
            double d5 = f2;
            Double.isNaN((double)d5);
            double d6 = d4 * d5;
            double d7 = com.airbnb.lottie.f.f.a();
            Double.isNaN((double)d7);
            double d8 = d6 * d7;
            double d9 = f3;
            Double.isNaN((double)d9);
            double d10 = d8 * d9;
            Double.isNaN((double)d3);
            f4 = (float)(d3 + d10);
        }
        return f4;
    }

    private List<com.airbnb.lottie.a.a.d> a(d d2) {
        if (this.j.containsKey((Object)d2)) {
            return (List)this.j.get((Object)d2);
        }
        List<n> list = d2.a();
        int n2 = list.size();
        ArrayList arrayList = new ArrayList(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            n n3 = (n)list.get(i2);
            arrayList.add((Object)new com.airbnb.lottie.a.a.d(this.l, this, n3));
        }
        this.j.put((Object)d2, (Object)arrayList);
        return arrayList;
    }

    private void a(char c2, b b2, Canvas canvas) {
        this.e[0] = c2;
        if (b2.k) {
            this.a(this.e, this.h, canvas);
            this.a(this.e, this.i, canvas);
            return;
        }
        this.a(this.e, this.i, canvas);
        this.a(this.e, this.h, canvas);
    }

    private void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void a(b.a a2, Canvas canvas, float f2) {
        int n2 = 3.a[a2.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return;
                }
                canvas.translate(-f2 / 2.0f, 0.0f);
                return;
            }
            canvas.translate(-f2, 0.0f);
        }
    }

    private void a(b b2, Matrix matrix, c c2, Canvas canvas) {
        float f2 = (float)b2.c / 100.0f;
        float f3 = com.airbnb.lottie.f.f.a(matrix);
        float f4 = this.a(b2, c2, f2, f3);
        this.a(b2.d, canvas, f4);
        String string = b2.a;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n2 = d.a(string.charAt(i2), c2.a(), c2.c());
            d d2 = (d)this.m.j().a(n2);
            if (d2 == null) continue;
            this.a(d2, matrix, f2, b2, canvas);
            float f5 = f3 * (f2 * (float)d2.b() * com.airbnb.lottie.f.f.a());
            float f6 = (float)b2.e / 10.0f;
            com.airbnb.lottie.a.b.a<Float, Float> a2 = this.q;
            if (a2 != null) {
                f6 += a2.g().floatValue();
            }
            canvas.translate(f5 + f6 * f3, 0.0f);
        }
    }

    private void a(b b2, c c2, Matrix matrix, Canvas canvas) {
        float f2 = com.airbnb.lottie.f.f.a(matrix);
        Typeface typeface = this.l.a(c2.a(), c2.c());
        if (typeface == null) {
            return;
        }
        String string = b2.a;
        p p2 = this.l.p();
        if (p2 != null) {
            string = p2.a(string);
        }
        this.h.setTypeface(typeface);
        Paint paint = this.h;
        double d2 = b2.c;
        double d3 = com.airbnb.lottie.f.f.a();
        Double.isNaN((double)d3);
        paint.setTextSize((float)(d2 * d3));
        this.i.setTypeface(this.h.getTypeface());
        this.i.setTextSize(this.h.getTextSize());
        float f3 = this.i.measureText(string);
        this.a(b2.d, canvas, f3);
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c3 = string.charAt(i2);
            this.a(c3, b2, canvas);
            char[] arrc = this.e;
            arrc[0] = c3;
            float f4 = this.h.measureText(arrc, 0, 1);
            float f5 = (float)b2.e / 10.0f;
            com.airbnb.lottie.a.b.a<Float, Float> a2 = this.q;
            if (a2 != null) {
                f5 += a2.g().floatValue();
            }
            canvas.translate(f4 + f5 * f2, 0.0f);
        }
    }

    private void a(d d2, Matrix matrix, float f2, b b2, Canvas canvas) {
        List<com.airbnb.lottie.a.a.d> list = this.a(d2);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Path path = ((com.airbnb.lottie.a.a.d)list.get(i2)).e();
            path.computeBounds(this.f, false);
            this.g.set(matrix);
            this.g.preTranslate(0.0f, (float)(-b2.g) * com.airbnb.lottie.f.f.a());
            this.g.preScale(f2, f2);
            path.transform(this.g);
            if (b2.k) {
                this.a(path, this.h, canvas);
                this.a(path, this.i, canvas);
                continue;
            }
            this.a(path, this.i, canvas);
            this.a(path, this.h, canvas);
        }
    }

    private void a(char[] arrc, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(arrc, 0, 1, 0.0f, 0.0f, paint);
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl2) {
        super.a(rectF, matrix, bl2);
        rectF.set(0.0f, 0.0f, (float)this.m.d().width(), (float)this.m.d().height());
    }

    @Override
    public <T> void a(T t2, com.airbnb.lottie.g.c<T> c2) {
        com.airbnb.lottie.a.b.a<Integer, Integer> a2;
        com.airbnb.lottie.a.b.a<Integer, Integer> a3;
        com.airbnb.lottie.a.b.a<Float, Float> a4;
        com.airbnb.lottie.a.b.a<Float, Float> a5;
        super.a(t2, c2);
        if (t2 == j.a && (a3 = this.n) != null) {
            a3.a(c2);
            return;
        }
        if (t2 == j.b && (a2 = this.o) != null) {
            a2.a(c2);
            return;
        }
        if (t2 == j.m && (a4 = this.p) != null) {
            a4.a(c2);
            return;
        }
        if (t2 == j.n && (a5 = this.q) != null) {
            a5.a(c2);
        }
    }

    @Override
    void b(Canvas canvas, Matrix matrix, int n2) {
        canvas.save();
        if (!this.l.q()) {
            canvas.setMatrix(matrix);
        }
        b b2 = (b)this.k.g();
        c c2 = (c)this.m.k().get((Object)b2.b);
        if (c2 == null) {
            canvas.restore();
            return;
        }
        com.airbnb.lottie.a.b.a<Integer, Integer> a2 = this.n;
        if (a2 != null) {
            this.h.setColor(a2.g().intValue());
        } else {
            this.h.setColor(b2.h);
        }
        com.airbnb.lottie.a.b.a<Integer, Integer> a3 = this.o;
        if (a3 != null) {
            this.i.setColor(a3.g().intValue());
        } else {
            this.i.setColor(b2.i);
        }
        int n3 = 255 * this.d.a().g() / 100;
        this.h.setAlpha(n3);
        this.i.setAlpha(n3);
        com.airbnb.lottie.a.b.a<Float, Float> a4 = this.p;
        if (a4 != null) {
            this.i.setStrokeWidth(a4.g().floatValue());
        } else {
            float f2 = com.airbnb.lottie.f.f.a(matrix);
            Paint paint = this.i;
            double d2 = b2.j;
            double d3 = com.airbnb.lottie.f.f.a();
            Double.isNaN((double)d3);
            double d4 = d2 * d3;
            double d5 = f2;
            Double.isNaN((double)d5);
            paint.setStrokeWidth((float)(d4 * d5));
        }
        if (this.l.q()) {
            this.a(b2, matrix, c2, canvas);
        } else {
            this.a(b2, c2, matrix, canvas);
        }
        canvas.restore();
    }
}

