/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.RectF
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.ListIterator
 */
package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.e;
import com.airbnb.lottie.a.a.j;
import com.airbnb.lottie.a.a.m;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.c.b.n;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class d
implements e,
m,
a.a,
com.airbnb.lottie.c.f {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final RectF c = new RectF();
    private final String d;
    private final boolean e;
    private final List<c> f;
    private final f g;
    private List<m> h;
    private o i;

    public d(f f2, a a2, n n2) {
        this(f2, a2, n2.a(), n2.c(), d.a(f2, a2, n2.b()), d.a(n2.b()));
    }

    d(f f2, a a2, String string2, boolean bl, List<c> list, l l2) {
        this.d = string2;
        this.g = f2;
        this.e = bl;
        this.f = list;
        if (l2 != null) {
            this.i = l2.k();
            this.i.a(a2);
            this.i.a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = -1 + list.size(); i2 >= 0; --i2) {
            c c2 = (c)list.get(i2);
            if (!(c2 instanceof j)) continue;
            arrayList.add((Object)((j)((Object)c2)));
        }
        for (int i3 = -1 + arrayList.size(); i3 >= 0; --i3) {
            ((j)arrayList.get(i3)).a((ListIterator<c>)list.listIterator(list.size()));
        }
    }

    static l a(List<b> list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            b b2 = (b)list.get(i2);
            if (!(b2 instanceof l)) continue;
            return (l)b2;
        }
        return null;
    }

    private static List<c> a(f f2, a a2, List<b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); ++i2) {
            c c2 = ((b)list.get(i2)).a(f2, a2);
            if (c2 == null) continue;
            arrayList.add((Object)c2);
        }
        return arrayList;
    }

    @Override
    public void a() {
        this.g.invalidateSelf();
    }

    @Override
    public void a(Canvas canvas, Matrix matrix, int n2) {
        if (this.e) {
            return;
        }
        this.a.set(matrix);
        o o2 = this.i;
        if (o2 != null) {
            this.a.preConcat(o2.d());
            n2 = (int)(255.0f * ((float)this.i.a().g().intValue() / 100.0f * (float)n2 / 255.0f));
        }
        for (int i2 = -1 + this.f.size(); i2 >= 0; --i2) {
            Object object = this.f.get(i2);
            if (!(object instanceof e)) continue;
            ((e)object).a(canvas, this.a, n2);
        }
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl) {
        this.a.set(matrix);
        o o2 = this.i;
        if (o2 != null) {
            this.a.preConcat(o2.d());
        }
        this.c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int i2 = -1 + this.f.size(); i2 >= 0; --i2) {
            c c2 = (c)this.f.get(i2);
            if (!(c2 instanceof e)) continue;
            ((e)c2).a(this.c, this.a, bl);
            rectF.union(this.c);
        }
    }

    @Override
    public void a(com.airbnb.lottie.c.e e2, int n2, List<com.airbnb.lottie.c.e> list, com.airbnb.lottie.c.e e3) {
        if (!e2.a(this.b(), n2)) {
            return;
        }
        if (!"__container".equals((Object)this.b())) {
            e3 = e3.a(this.b());
            if (e2.c(this.b(), n2)) {
                list.add((Object)e3.a(this));
            }
        }
        if (e2.d(this.b(), n2)) {
            int n3 = n2 + e2.b(this.b(), n2);
            for (int i2 = 0; i2 < this.f.size(); ++i2) {
                c c2 = (c)this.f.get(i2);
                if (!(c2 instanceof com.airbnb.lottie.c.f)) continue;
                ((com.airbnb.lottie.c.f)((Object)c2)).a(e2, n3, list, e3);
            }
        }
    }

    @Override
    public <T> void a(T t2, com.airbnb.lottie.g.c<T> c2) {
        o o2 = this.i;
        if (o2 != null) {
            o2.a(t2, c2);
        }
    }

    @Override
    public void a(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f.size());
        arrayList.addAll(list);
        for (int i2 = -1 + this.f.size(); i2 >= 0; --i2) {
            c c2 = (c)this.f.get(i2);
            c2.a((List<c>)arrayList, (List<c>)this.f.subList(0, i2));
            arrayList.add((Object)c2);
        }
    }

    @Override
    public String b() {
        return this.d;
    }

    List<m> c() {
        if (this.h == null) {
            this.h = new ArrayList();
            for (int i2 = 0; i2 < this.f.size(); ++i2) {
                c c2 = (c)this.f.get(i2);
                if (!(c2 instanceof m)) continue;
                this.h.add((Object)((m)c2));
            }
        }
        return this.h;
    }

    Matrix d() {
        o o2 = this.i;
        if (o2 != null) {
            return o2.d();
        }
        this.a.reset();
        return this.a;
    }

    @Override
    public Path e() {
        this.a.reset();
        o o2 = this.i;
        if (o2 != null) {
            this.a.set(o2.d());
        }
        this.b.reset();
        if (this.e) {
            return this.b;
        }
        for (int i2 = -1 + this.f.size(); i2 >= 0; --i2) {
            c c2 = (c)this.f.get(i2);
            if (!(c2 instanceof m)) continue;
            this.b.addPath(((m)c2).e(), this.a);
        }
        return this.b;
    }
}

