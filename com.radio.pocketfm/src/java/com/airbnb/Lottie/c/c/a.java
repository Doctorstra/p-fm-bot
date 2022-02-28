/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  android.os.Build
 *  android.os.Build$VERSION
 *  com.airbnb.lottie.c.c.b
 *  com.airbnb.lottie.c.c.c
 *  com.airbnb.lottie.c.c.e
 *  com.airbnb.lottie.c.c.f
 *  com.airbnb.lottie.c.c.g
 *  com.airbnb.lottie.c.c.h
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package com.airbnb.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.c;
import com.airbnb.lottie.c.b.g;
import com.airbnb.lottie.c.b.l;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.c.c.b;
import com.airbnb.lottie.c.c.d;
import com.airbnb.lottie.c.c.g;
import com.airbnb.lottie.c.c.h;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class a
implements com.airbnb.lottie.a.a.e,
a.a,
com.airbnb.lottie.c.f {
    final Matrix a = new Matrix();
    final f b;
    final com.airbnb.lottie.c.c.d c;
    final o d;
    private final Path e = new Path();
    private final Matrix f = new Matrix();
    private final Paint g = new com.airbnb.lottie.a.a(1);
    private final Paint h = new com.airbnb.lottie.a.a(1);
    private final Paint i = new com.airbnb.lottie.a.a(1);
    private final Paint j = new com.airbnb.lottie.a.a(1);
    private final Paint k = new com.airbnb.lottie.a.a();
    private final RectF l = new RectF();
    private final RectF m = new RectF();
    private final RectF n = new RectF();
    private final RectF o = new RectF();
    private final String p;
    private com.airbnb.lottie.a.b.g q;
    private a r;
    private a s;
    private List<a> t;
    private final List<com.airbnb.lottie.a.b.a<?, ?>> u = new ArrayList();
    private boolean v = true;

    a(f f2, com.airbnb.lottie.c.c.d d2) {
        this.b = f2;
        this.c = d2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d2.f());
        stringBuilder.append("#draw");
        this.p = stringBuilder.toString();
        this.k.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.i.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        if (d2.l() == d.b.c) {
            this.j.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.j.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        this.d = d2.o().k();
        this.d.a((a.a)this);
        if (d2.j() != null && !d2.j().isEmpty()) {
            this.q = new com.airbnb.lottie.a.b.g(d2.j());
            Iterator iterator = this.q.b().iterator();
            while (iterator.hasNext()) {
                ((com.airbnb.lottie.a.b.a)iterator.next()).a(this);
            }
            for (com.airbnb.lottie.a.b.a a2 : this.q.c()) {
                this.a(a2);
                a2.a(this);
            }
        }
        this.f();
    }

    static a a(com.airbnb.lottie.c.c.d d2, f f2, d d3) {
        switch (2.a[d2.k().ordinal()]) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown layer type ");
                stringBuilder.append((Object)d2.k());
                c.b(stringBuilder.toString());
                return null;
            }
            case 6: {
                return new h(f2, d2);
            }
            case 5: {
                return new com.airbnb.lottie.c.c.e(f2, d2);
            }
            case 4: {
                return new com.airbnb.lottie.c.c.c(f2, d2);
            }
            case 3: {
                return new g(f2, d2);
            }
            case 2: {
                return new b(f2, d2, d3.b(d2.g()), d3);
            }
            case 1: 
        }
        return new com.airbnb.lottie.c.c.f(f2, d2);
    }

    private void a(Canvas canvas) {
        c.c("Layer#clearLayer");
        canvas.drawRect(this.l.left - 1.0f, this.l.top - 1.0f, 1.0f + this.l.right, 1.0f + this.l.bottom, this.k);
        c.d("Layer#clearLayer");
    }

    private void a(Canvas canvas, Matrix matrix) {
        this.a(canvas, matrix, g.a.a);
        this.a(canvas, matrix, g.a.c);
        this.a(canvas, matrix, g.a.b);
    }

    private void a(Canvas canvas, Matrix matrix, g.a a2) {
        int n2;
        int n3;
        int n4;
        Paint paint;
        block5 : {
            int n5 = 2.b[a2.ordinal()];
            paint = n5 != (n3 = 1) ? this.h : this.i;
            n2 = this.q.a().size();
            n4 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (((com.airbnb.lottie.c.b.g)this.q.a().get(i2)).a() != a2) {
                    continue;
                }
                break block5;
            }
            n3 = 0;
        }
        if (n3 == 0) {
            return;
        }
        c.c("Layer#drawMask");
        c.c("Layer#saveLayer");
        this.a(canvas, this.l, paint, false);
        c.d("Layer#saveLayer");
        this.a(canvas);
        while (n4 < n2) {
            if (((com.airbnb.lottie.c.b.g)this.q.a().get(n4)).a() == a2) {
                Path path = (Path)((com.airbnb.lottie.a.b.a)this.q.b().get(n4)).g();
                this.e.set(path);
                this.e.transform(matrix);
                com.airbnb.lottie.a.b.a a3 = (com.airbnb.lottie.a.b.a)this.q.c().get(n4);
                int n6 = this.g.getAlpha();
                this.g.setAlpha((int)(2.55f * (float)((Integer)a3.g()).intValue()));
                canvas.drawPath(this.e, this.g);
                this.g.setAlpha(n6);
            }
            ++n4;
        }
        c.c("Layer#restoreLayer");
        canvas.restore();
        c.d("Layer#restoreLayer");
        c.d("Layer#drawMask");
    }

    private void a(Canvas canvas, RectF rectF, Paint paint, boolean bl) {
        if (Build.VERSION.SDK_INT < 23) {
            int n2 = bl ? 31 : 19;
            canvas.saveLayer(rectF, paint, n2);
            return;
        }
        canvas.saveLayer(rectF, paint);
    }

    private void a(RectF rectF, Matrix matrix) {
        this.m.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (!this.e()) {
            return;
        }
        int n2 = this.q.a().size();
        for (int i2 = 0; i2 < n2; ++i2) {
            com.airbnb.lottie.c.b.g g2 = (com.airbnb.lottie.c.b.g)this.q.a().get(i2);
            Path path = (Path)((com.airbnb.lottie.a.b.a)this.q.b().get(i2)).g();
            this.e.set(path);
            this.e.transform(matrix);
            int n3 = 2.b[g2.a().ordinal()];
            if (n3 != 1 && n3 != 2) {
                this.e.computeBounds(this.o, false);
                if (i2 == 0) {
                    this.m.set(this.o);
                    continue;
                }
                RectF rectF2 = this.m;
                rectF2.set(Math.min((float)rectF2.left, (float)this.o.left), Math.min((float)this.m.top, (float)this.o.top), Math.max((float)this.m.right, (float)this.o.right), Math.max((float)this.m.bottom, (float)this.o.bottom));
                continue;
            }
            return;
        }
        if (!rectF.intersect(this.m)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    static /* synthetic */ void a(a a2, boolean bl) {
        a2.a(bl);
    }

    private void a(boolean bl) {
        if (bl != this.v) {
            this.v = bl;
            this.g();
        }
    }

    private void b(float f2) {
        this.b.s().c().a(this.c.f(), f2);
    }

    private void b(RectF rectF, Matrix matrix) {
        if (!this.d()) {
            return;
        }
        if (this.c.l() == d.b.c) {
            return;
        }
        this.n.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.r.a(this.n, matrix, true);
        if (!rectF.intersect(this.n)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void f() {
        boolean bl = this.c.d().isEmpty();
        boolean bl2 = true;
        if (!bl) {
            com.airbnb.lottie.a.b.c c2 = new com.airbnb.lottie.a.b.c(this.c.d());
            c2.a();
            c2.a(new a.a(this, c2){
                final /* synthetic */ com.airbnb.lottie.a.b.c a;
                final /* synthetic */ a b;
                {
                    this.b = a2;
                    this.a = c2;
                }

                public void a() {
                    a a2 = this.b;
                    boolean bl = this.a.i() == 1.0f;
                    a.a(a2, bl);
                }
            });
            if (((Float)c2.g()).floatValue() != 1.0f) {
                bl2 = false;
            }
            this.a(bl2);
            this.a(c2);
            return;
        }
        this.a(bl2);
    }

    private void g() {
        this.b.invalidateSelf();
    }

    private void h() {
        if (this.t != null) {
            return;
        }
        if (this.s == null) {
            this.t = Collections.emptyList();
            return;
        }
        this.t = new ArrayList();
        a a2 = this.s;
        while (a2 != null) {
            this.t.add((Object)a2);
            a2 = a2.s;
        }
    }

    @Override
    public void a() {
        this.g();
    }

    void a(float f2) {
        this.d.a(f2);
        if (this.q != null) {
            for (int i2 = 0; i2 < this.q.b().size(); ++i2) {
                ((com.airbnb.lottie.a.b.a)this.q.b().get(i2)).a(f2);
            }
        }
        if (this.c.b() != 0.0f) {
            f2 /= this.c.b();
        }
        a a2 = this.r;
        int n2 = 0;
        if (a2 != null) {
            float f3 = a2.c.b();
            this.r.a(f3 * f2);
        }
        while (n2 < this.u.size()) {
            ((com.airbnb.lottie.a.b.a)this.u.get(n2)).a(f2);
            ++n2;
        }
    }

    @Override
    public void a(Canvas canvas, Matrix matrix, int n2) {
        c.c(this.p);
        if (this.v && !this.c.v()) {
            this.h();
            c.c("Layer#parentMatrix");
            this.f.reset();
            this.f.set(matrix);
            for (int i2 = this.t.size() - 1; i2 >= 0; --i2) {
                this.f.preConcat(((a)this.t.get((int)i2)).d.d());
            }
            c.d("Layer#parentMatrix");
            int n3 = (int)(255.0f * ((float)n2 / 255.0f * (float)this.d.a().g().intValue() / 100.0f));
            if (!this.d() && !this.e()) {
                this.f.preConcat(this.d.d());
                c.c("Layer#drawLayer");
                this.b(canvas, this.f, n3);
                c.d("Layer#drawLayer");
                this.b(c.d(this.p));
                return;
            }
            c.c("Layer#computeBounds");
            this.a(this.l, this.f, false);
            this.b(this.l, matrix);
            this.f.preConcat(this.d.d());
            this.a(this.l, this.f);
            c.d("Layer#computeBounds");
            if (!this.l.isEmpty()) {
                c.c("Layer#saveLayer");
                this.a(canvas, this.l, this.g, true);
                c.d("Layer#saveLayer");
                this.a(canvas);
                c.c("Layer#drawLayer");
                this.b(canvas, this.f, n3);
                c.d("Layer#drawLayer");
                if (this.e()) {
                    this.a(canvas, this.f);
                }
                if (this.d()) {
                    c.c("Layer#drawMatte");
                    c.c("Layer#saveLayer");
                    this.a(canvas, this.l, this.j, false);
                    c.d("Layer#saveLayer");
                    this.a(canvas);
                    this.r.a(canvas, matrix, n3);
                    c.c("Layer#restoreLayer");
                    canvas.restore();
                    c.d("Layer#restoreLayer");
                    c.d("Layer#drawMatte");
                }
                c.c("Layer#restoreLayer");
                canvas.restore();
                c.d("Layer#restoreLayer");
            }
            this.b(c.d(this.p));
            return;
        }
        c.d(this.p);
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl) {
        this.l.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.h();
        this.a.set(matrix);
        if (bl) {
            List<a> list = this.t;
            if (list != null) {
                for (int i2 = -1 + list.size(); i2 >= 0; --i2) {
                    this.a.preConcat(((a)this.t.get((int)i2)).d.d());
                }
            } else {
                a a2 = this.s;
                if (a2 != null) {
                    this.a.preConcat(a2.d.d());
                }
            }
        }
        this.a.preConcat(this.d.d());
    }

    public void a(com.airbnb.lottie.a.b.a<?, ?> a2) {
        this.u.add(a2);
    }

    void a(a a2) {
        this.r = a2;
    }

    @Override
    public void a(e e2, int n2, List<e> list, e e3) {
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
            this.b(e2, n2 + e2.b(this.b(), n2), list, e3);
        }
    }

    @Override
    public <T> void a(T t2, com.airbnb.lottie.g.c<T> c2) {
        this.d.a(t2, c2);
    }

    @Override
    public void a(List<com.airbnb.lottie.a.a.c> list, List<com.airbnb.lottie.a.a.c> list2) {
    }

    @Override
    public String b() {
        return this.c.f();
    }

    abstract void b(Canvas var1, Matrix var2, int var3);

    void b(a a2) {
        this.s = a2;
    }

    void b(e e2, int n2, List<e> list, e e3) {
    }

    com.airbnb.lottie.c.c.d c() {
        return this.c;
    }

    boolean d() {
        return this.r != null;
    }

    boolean e() {
        com.airbnb.lottie.a.b.g g2 = this.q;
        return g2 != null && !g2.b().isEmpty();
    }
}

