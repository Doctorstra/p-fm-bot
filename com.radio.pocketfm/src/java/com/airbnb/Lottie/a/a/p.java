/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.RectF
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  java.util.ListIterator
 */
package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.d;
import com.airbnb.lottie.a.a.e;
import com.airbnb.lottie.a.a.k;
import com.airbnb.lottie.a.a.m;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class p
implements e,
com.airbnb.lottie.a.a.j,
k,
m,
a.a {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final f c;
    private final a d;
    private final String e;
    private final boolean f;
    private final com.airbnb.lottie.a.b.a<Float, Float> g;
    private final com.airbnb.lottie.a.b.a<Float, Float> h;
    private final o i;
    private d j;

    public p(f f2, a a2, com.airbnb.lottie.c.b.k k2) {
        this.c = f2;
        this.d = a2;
        this.e = k2.a();
        this.f = k2.e();
        this.g = k2.b().a();
        a2.a(this.g);
        this.g.a(this);
        this.h = k2.c().a();
        a2.a(this.h);
        this.h.a(this);
        this.i = k2.d().k();
        this.i.a(a2);
        this.i.a(this);
    }

    @Override
    public void a() {
        this.c.invalidateSelf();
    }

    @Override
    public void a(Canvas canvas, Matrix matrix, int n2) {
        float f2 = this.g.g().floatValue();
        float f3 = this.h.g().floatValue();
        float f4 = this.i.b().g().floatValue() / 100.0f;
        float f5 = this.i.c().g().floatValue() / 100.0f;
        for (int i2 = -1 + (int)f2; i2 >= 0; --i2) {
            this.a.set(matrix);
            Matrix matrix2 = this.a;
            o o2 = this.i;
            float f6 = i2;
            matrix2.preConcat(o2.b(f6 + f3));
            float f7 = (float)n2 * com.airbnb.lottie.f.e.a(f4, f5, f6 / f2);
            this.j.a(canvas, this.a, (int)f7);
        }
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl) {
        this.j.a(rectF, matrix, bl);
    }

    @Override
    public void a(com.airbnb.lottie.c.e e2, int n2, List<com.airbnb.lottie.c.e> list, com.airbnb.lottie.c.e e3) {
        com.airbnb.lottie.f.e.a(e2, n2, list, e3, this);
    }

    @Override
    public <T> void a(T t2, com.airbnb.lottie.g.c<T> c2) {
        if (this.i.a(t2, c2)) {
            return;
        }
        if (t2 == j.o) {
            this.g.a(c2);
            return;
        }
        if (t2 == j.p) {
            this.h.a(c2);
        }
    }

    @Override
    public void a(List<c> list, List<c> list2) {
        this.j.a(list, list2);
    }

    @Override
    public void a(ListIterator<c> listIterator) {
        d d2;
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse((List)arrayList);
        this.j = d2 = new d(this.c, this.d, "Repeater", this.f, (List<c>)arrayList, null);
    }

    @Override
    public String b() {
        return this.e;
    }

    @Override
    public Path e() {
        Path path = this.j.e();
        this.b.reset();
        float f2 = this.g.g().floatValue();
        float f3 = this.h.g().floatValue();
        for (int i2 = -1 + (int)f2; i2 >= 0; --i2) {
            this.a.set(this.i.b(f3 + (float)i2));
            this.b.addPath(path, this.a);
        }
        return this.b;
    }
}

