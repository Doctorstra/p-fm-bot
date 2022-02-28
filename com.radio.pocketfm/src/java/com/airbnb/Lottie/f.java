/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.Typeface
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.View
 *  androidx.a.h
 *  com.airbnb.lottie.c.c.b
 *  com.airbnb.lottie.f$10
 *  com.airbnb.lottie.f$11
 *  com.airbnb.lottie.f$12
 *  com.airbnb.lottie.f$13
 *  com.airbnb.lottie.f$14
 *  com.airbnb.lottie.f$2
 *  com.airbnb.lottie.f$3
 *  com.airbnb.lottie.f$4
 *  com.airbnb.lottie.f$5
 *  com.airbnb.lottie.f$6
 *  com.airbnb.lottie.f$7
 *  com.airbnb.lottie.f$8
 *  com.airbnb.lottie.f$9
 *  com.airbnb.lottie.f.c
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.b.b;
import com.airbnb.lottie.c;
import com.airbnb.lottie.c.h;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.s;
import com.airbnb.lottie.f;
import com.airbnb.lottie.f.e;
import com.airbnb.lottie.g;
import com.airbnb.lottie.j;
import com.airbnb.lottie.m;
import com.airbnb.lottie.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class f
extends Drawable
implements Animatable,
Drawable.Callback {
    private static final String c = "f";
    com.airbnb.lottie.a a;
    p b;
    private final Matrix d = new Matrix();
    private d e;
    private final com.airbnb.lottie.f.c f = new com.airbnb.lottie.f.c();
    private float g = 1.0f;
    private final Set<Object> h = new HashSet();
    private final ArrayList<a> i = new ArrayList();
    private b j;
    private String k;
    private com.airbnb.lottie.b l;
    private com.airbnb.lottie.b.a m;
    private boolean n;
    private com.airbnb.lottie.c.c.b o;
    private int p = 255;
    private boolean q;
    private boolean r = false;

    public f() {
        this.f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(){

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (f.this.o != null) {
                    f.this.o.a(f.this.f.d());
                }
            }
        });
    }

    private Context A() {
        Drawable.Callback callback = this.getCallback();
        if (callback == null) {
            return null;
        }
        if (callback instanceof View) {
            return ((View)callback).getContext();
        }
        return null;
    }

    private float a(Canvas canvas) {
        return Math.min((float)((float)canvas.getWidth() / (float)this.e.d().width()), (float)((float)canvas.getHeight() / (float)this.e.d().height()));
    }

    private void w() {
        this.o = new com.airbnb.lottie.c.c.b(this, s.a(this.e), this.e.i(), this.e);
    }

    private void x() {
        if (this.e == null) {
            return;
        }
        float f2 = this.r();
        this.setBounds(0, 0, (int)(f2 * (float)this.e.d().width()), (int)(f2 * (float)this.e.d().height()));
    }

    private b y() {
        if (this.getCallback() == null) {
            return null;
        }
        b b2 = this.j;
        if (b2 != null && !b2.a(this.A())) {
            this.j = null;
        }
        if (this.j == null) {
            this.j = new b(this.getCallback(), this.k, this.l, this.e.l());
        }
        return this.j;
    }

    private com.airbnb.lottie.b.a z() {
        if (this.getCallback() == null) {
            return null;
        }
        if (this.m == null) {
            this.m = new com.airbnb.lottie.b.a(this.getCallback(), this.a);
        }
        return this.m;
    }

    public Typeface a(String string2, String string3) {
        com.airbnb.lottie.b.a a2 = this.z();
        if (a2 != null) {
            return a2.a(string2, string3);
        }
        return null;
    }

    public List<com.airbnb.lottie.c.e> a(com.airbnb.lottie.c.e e2) {
        if (this.o == null) {
            Log.w((String)"LOTTIE", (String)"Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.o.a(e2, 0, (List)arrayList, new com.airbnb.lottie.c.e(new String[0]));
        return arrayList;
    }

    public void a(float f2) {
        d d2 = this.e;
        if (d2 == null) {
            this.i.add((Object)new 10(this, f2));
            return;
        }
        this.a((int)e.a(d2.f(), this.e.g(), f2));
    }

    public void a(int n2) {
        if (this.e == null) {
            this.i.add((Object)new 9(this, n2));
            return;
        }
        this.f.b(n2);
    }

    public void a(int n2, int n3) {
        if (this.e == null) {
            this.i.add((Object)new 3(this, n2, n3));
            return;
        }
        this.f.a(n2, n3);
    }

    public void a(Animator.AnimatorListener animatorListener) {
        this.f.addListener(animatorListener);
    }

    public void a(com.airbnb.lottie.a a2) {
        this.a = a2;
        com.airbnb.lottie.b.a a3 = this.m;
        if (a3 != null) {
            a3.a(a2);
        }
    }

    public void a(com.airbnb.lottie.b b2) {
        this.l = b2;
        b b3 = this.j;
        if (b3 != null) {
            b3.a(b2);
        }
    }

    public <T> void a(com.airbnb.lottie.c.e e2, T t2, com.airbnb.lottie.g.c<T> c2) {
        if (this.o == null) {
            this.i.add((Object)new 6(this, e2, t2, c2));
            return;
        }
        com.airbnb.lottie.c.f f2 = e2.a();
        boolean bl = true;
        if (f2 != null) {
            e2.a().a(t2, c2);
        } else {
            List<com.airbnb.lottie.c.e> list = this.a(e2);
            for (int i2 = 0; i2 < list.size(); ++i2) {
                ((com.airbnb.lottie.c.e)list.get(i2)).a().a(t2, c2);
            }
            bl ^= list.isEmpty();
        }
        if (bl) {
            this.invalidateSelf();
            if (t2 == j.y) {
                this.d(this.v());
            }
        }
    }

    public void a(p p2) {
        this.b = p2;
    }

    public void a(String string2) {
        this.k = string2;
    }

    public void a(boolean bl) {
        if (this.n == bl) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            Log.w((String)c, (String)"Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.n = bl;
        if (this.e != null) {
            this.w();
        }
    }

    public boolean a() {
        return this.n;
    }

    public boolean a(d d2) {
        if (this.e == d2) {
            return false;
        }
        this.r = false;
        this.d();
        this.e = d2;
        this.w();
        this.f.a(d2);
        this.d(this.f.getAnimatedFraction());
        this.e(this.g);
        this.x();
        Iterator iterator = new ArrayList(this.i).iterator();
        while (iterator.hasNext()) {
            ((a)iterator.next()).a(d2);
            iterator.remove();
        }
        this.i.clear();
        d2.b(this.q);
        return true;
    }

    public String b() {
        return this.k;
    }

    public void b(float f2) {
        d d2 = this.e;
        if (d2 == null) {
            this.i.add((Object)new 12(this, f2));
            return;
        }
        this.b((int)e.a(d2.f(), this.e.g(), f2));
    }

    public void b(int n2) {
        if (this.e == null) {
            this.i.add((Object)new 11(this, n2));
            return;
        }
        this.f.c(n2);
    }

    public void b(String string2) {
        d d2 = this.e;
        if (d2 == null) {
            this.i.add((Object)new 13(this, string2));
            return;
        }
        h h2 = d2.c(string2);
        if (h2 != null) {
            this.a((int)h2.b);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find marker with name ");
        stringBuilder.append(string2);
        stringBuilder.append(".");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void b(boolean bl) {
        this.q = bl;
        d d2 = this.e;
        if (d2 != null) {
            d2.b(bl);
        }
    }

    public m c() {
        d d2 = this.e;
        if (d2 != null) {
            return d2.c();
        }
        return null;
    }

    public void c(float f2) {
        this.f.a(f2);
    }

    public void c(int n2) {
        if (this.e == null) {
            this.i.add((Object)new 4(this, n2));
            return;
        }
        this.f.a(n2);
    }

    public void c(String string2) {
        d d2 = this.e;
        if (d2 == null) {
            this.i.add((Object)new 14(this, string2));
            return;
        }
        h h2 = d2.c(string2);
        if (h2 != null) {
            this.b((int)(h2.b + h2.c));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find marker with name ");
        stringBuilder.append(string2);
        stringBuilder.append(".");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void d() {
        if (this.f.isRunning()) {
            this.f.cancel();
        }
        this.e = null;
        this.o = null;
        this.j = null;
        this.f.f();
        this.invalidateSelf();
    }

    public void d(float f2) {
        d d2 = this.e;
        if (d2 == null) {
            this.i.add((Object)new 5(this, f2));
            return;
        }
        this.c((int)e.a(d2.f(), this.e.g(), f2));
    }

    public void d(int n2) {
        this.f.setRepeatMode(n2);
    }

    public void d(String string2) {
        d d2 = this.e;
        if (d2 == null) {
            this.i.add((Object)new 2(this, string2));
            return;
        }
        h h2 = d2.c(string2);
        if (h2 != null) {
            int n2 = (int)h2.b;
            this.a(n2, n2 + (int)h2.c);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find marker with name ");
        stringBuilder.append(string2);
        stringBuilder.append(".");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void draw(Canvas canvas) {
        float f2;
        this.r = false;
        c.c("Drawable#draw");
        if (this.o == null) {
            return;
        }
        float f3 = this.g;
        float f4 = this.a(canvas);
        if (f3 > f4) {
            f2 = this.g / f4;
        } else {
            f4 = f3;
            f2 = 1.0f;
        }
        int n2 = -1;
        if (f2 > 1.0f) {
            n2 = canvas.save();
            float f5 = (float)this.e.d().width() / 2.0f;
            float f6 = (float)this.e.d().height() / 2.0f;
            float f7 = f5 * f4;
            float f8 = f6 * f4;
            canvas.translate(f5 * this.r() - f7, f6 * this.r() - f8);
            canvas.scale(f2, f2, f7, f8);
        }
        this.d.reset();
        this.d.preScale(f4, f4);
        this.o.a(canvas, this.d, this.p);
        c.d("Drawable#draw");
        if (n2 > 0) {
            canvas.restoreToCount(n2);
        }
    }

    public Bitmap e(String string2) {
        b b2 = this.y();
        if (b2 != null) {
            return b2.a(string2);
        }
        return null;
    }

    public void e() {
        if (this.o == null) {
            this.i.add((Object)new 7(this));
            return;
        }
        this.f.i();
    }

    public void e(float f2) {
        this.g = f2;
        this.x();
    }

    public void e(int n2) {
        this.f.setRepeatCount(n2);
    }

    public void f() {
        this.i.clear();
        this.f.j();
    }

    public void g() {
        if (this.o == null) {
            this.i.add((Object)new 8(this));
            return;
        }
        this.f.l();
    }

    public int getAlpha() {
        return this.p;
    }

    public int getIntrinsicHeight() {
        d d2 = this.e;
        if (d2 == null) {
            return -1;
        }
        return (int)((float)d2.d().height() * this.r());
    }

    public int getIntrinsicWidth() {
        d d2 = this.e;
        if (d2 == null) {
            return -1;
        }
        return (int)((float)d2.d().width() * this.r());
    }

    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.f.m();
    }

    public float i() {
        return this.f.n();
    }

    public void invalidateDrawable(Drawable drawable2) {
        Drawable.Callback callback = this.getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable((Drawable)this);
    }

    public void invalidateSelf() {
        if (this.r) {
            return;
        }
        this.r = true;
        Drawable.Callback callback = this.getCallback();
        if (callback != null) {
            callback.invalidateDrawable((Drawable)this);
        }
    }

    public boolean isRunning() {
        return this.o();
    }

    public float j() {
        return this.f.h();
    }

    public void k() {
        this.f.removeAllListeners();
    }

    public int l() {
        return (int)this.f.e();
    }

    public int m() {
        return this.f.getRepeatMode();
    }

    public int n() {
        return this.f.getRepeatCount();
    }

    public boolean o() {
        return this.f.isRunning();
    }

    public p p() {
        return this.b;
    }

    public boolean q() {
        return this.b == null && this.e.j().b() > 0;
    }

    public float r() {
        return this.g;
    }

    public d s() {
        return this.e;
    }

    public void scheduleDrawable(Drawable drawable2, Runnable runnable, long l2) {
        Drawable.Callback callback = this.getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable((Drawable)this, runnable, l2);
    }

    public void setAlpha(int n2) {
        this.p = n2;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Log.w((String)"LOTTIE", (String)"Use addColorFilter instead.");
    }

    public void start() {
        this.e();
    }

    public void stop() {
        this.f();
    }

    public void t() {
        this.i.clear();
        this.f.cancel();
    }

    public void u() {
        this.i.clear();
        this.f.k();
    }

    public void unscheduleDrawable(Drawable drawable2, Runnable runnable) {
        Drawable.Callback callback = this.getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable((Drawable)this, runnable);
    }

    public float v() {
        return this.f.d();
    }

    private static interface a {
        public void a(d var1);
    }

}

