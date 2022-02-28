/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.PointF
 *  com.airbnb.lottie.a.b.c
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.a.e
 *  com.airbnb.lottie.c.a.g
 *  com.airbnb.lottie.c.a.l
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 */
package com.airbnb.lottie.a.b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.c;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.d;
import com.airbnb.lottie.c.a.e;
import com.airbnb.lottie.c.a.g;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.j;

public class o {
    private final Matrix a = new Matrix();
    private final Matrix b;
    private final Matrix c;
    private final Matrix d;
    private final float[] e;
    private boolean f;
    private final a<PointF, PointF> g;
    private final a<?, PointF> h;
    private final a<com.airbnb.lottie.g.d, com.airbnb.lottie.g.d> i;
    private final a<Float, Float> j;
    private final a<Integer, Integer> k;
    private final c l;
    private final c m;
    private final a<?, Float> n;
    private final a<?, Float> o;

    public o(l l2) {
        this.f = l2.j();
        if (this.f) {
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.l = null;
            this.m = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        } else {
            this.g = l2.a().a();
            this.h = l2.b().a();
            this.i = l2.c().a();
            this.j = l2.d().a();
            c c2 = l2.h() == null ? null : (c)l2.h().a();
            this.l = c2;
            if (this.l != null) {
                this.b = new Matrix();
                this.c = new Matrix();
                this.d = new Matrix();
                this.e = new float[9];
            } else {
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
            }
            c c3 = l2.i() == null ? null : (c)l2.i().a();
            this.m = c3;
        }
        this.k = l2.e().a();
        this.n = l2.f() != null ? l2.f().a() : null;
        if (l2.g() != null) {
            this.o = l2.g().a();
            return;
        }
        this.o = null;
    }

    private void e() {
        for (int i2 = 0; i2 < 9; ++i2) {
            this.e[i2] = 0.0f;
        }
    }

    public a<?, Integer> a() {
        return this.k;
    }

    public void a(float f2) {
        a<?, Float> a2;
        c c2;
        this.k.a(f2);
        a<?, Float> a3 = this.n;
        if (a3 != null) {
            a3.a(f2);
        }
        if ((a2 = this.o) != null) {
            a2.a(f2);
        }
        if (this.f) {
            return;
        }
        this.g.a(f2);
        this.h.a(f2);
        this.i.a(f2);
        this.j.a(f2);
        c c3 = this.l;
        if (c3 != null) {
            c3.a(f2);
        }
        if ((c2 = this.m) != null) {
            c2.a(f2);
        }
    }

    public void a(a.a a2) {
        a<?, Float> a3;
        c c2;
        this.k.a(a2);
        a<?, Float> a4 = this.n;
        if (a4 != null) {
            a4.a(a2);
        }
        if ((a3 = this.o) != null) {
            a3.a(a2);
        }
        if (this.f) {
            return;
        }
        this.g.a(a2);
        this.h.a(a2);
        this.i.a(a2);
        this.j.a(a2);
        c c3 = this.l;
        if (c3 != null) {
            c3.a(a2);
        }
        if ((c2 = this.m) != null) {
            c2.a(a2);
        }
    }

    public void a(com.airbnb.lottie.c.c.a a2) {
        a<?, Float> a3;
        c c2;
        a2.a(this.k);
        a<?, Float> a4 = this.n;
        if (a4 != null) {
            a2.a(a4);
        }
        if ((a3 = this.o) != null) {
            a2.a(a3);
        }
        if (this.f) {
            return;
        }
        a2.a(this.g);
        a2.a(this.h);
        a2.a(this.i);
        a2.a(this.j);
        c c3 = this.l;
        if (c3 != null) {
            a2.a((a)c3);
        }
        if ((c2 = this.m) != null) {
            a2.a((a)c2);
        }
    }

    public <T> boolean a(T t2, com.airbnb.lottie.g.c<T> c2) {
        block11 : {
            block3 : {
                c c3;
                block10 : {
                    c c4;
                    block9 : {
                        a<?, Float> a2;
                        block8 : {
                            a<?, Float> a3;
                            block7 : {
                                block6 : {
                                    block5 : {
                                        block4 : {
                                            block2 : {
                                                this.f = false;
                                                if (t2 != j.e) break block2;
                                                this.g.a(c2);
                                                break block3;
                                            }
                                            if (t2 != j.f) break block4;
                                            this.h.a(c2);
                                            break block3;
                                        }
                                        if (t2 != j.i) break block5;
                                        this.i.a(c2);
                                        break block3;
                                    }
                                    if (t2 != j.j) break block6;
                                    this.j.a(c2);
                                    break block3;
                                }
                                if (t2 != j.c) break block7;
                                this.k.a(c2);
                                break block3;
                            }
                            if (t2 != j.w || (a3 = this.n) == null) break block8;
                            a3.a(c2);
                            break block3;
                        }
                        if (t2 != j.x || (a2 = this.o) == null) break block9;
                        a2.a(c2);
                        break block3;
                    }
                    if (t2 != j.k || (c4 = this.l) == null) break block10;
                    c4.a(c2);
                    break block3;
                }
                if (t2 != j.l || (c3 = this.m) == null) break block11;
                c3.a(c2);
            }
            return true;
        }
        return false;
    }

    public Matrix b(float f2) {
        if (this.f) {
            return this.a;
        }
        PointF pointF = this.h.g();
        PointF pointF2 = this.g.g();
        com.airbnb.lottie.g.d d2 = this.i.g();
        float f3 = this.j.g().floatValue();
        this.a.reset();
        this.a.preTranslate(f2 * pointF.x, f2 * pointF.y);
        Matrix matrix = this.a;
        double d3 = d2.a();
        double d4 = f2;
        matrix.preScale((float)Math.pow((double)d3, (double)d4), (float)Math.pow((double)d2.b(), (double)d4));
        this.a.preRotate(f3 * f2, pointF2.x, pointF2.y);
        return this.a;
    }

    public a<?, Float> b() {
        return this.n;
    }

    public a<?, Float> c() {
        return this.o;
    }

    public Matrix d() {
        com.airbnb.lottie.g.d d2;
        float f2;
        if (this.f) {
            return this.a;
        }
        this.a.reset();
        PointF pointF = this.h.g();
        if (pointF.x != 0.0f || pointF.y != 0.0f) {
            this.a.preTranslate(pointF.x, pointF.y);
        }
        if ((f2 = ((c)this.j).i()) != 0.0f) {
            this.a.preRotate(f2);
        }
        if (this.l != null) {
            float f3;
            c c2 = this.m;
            float f4 = c2 == null ? 0.0f : (float)Math.cos((double)Math.toRadians((double)(90.0f + -c2.i())));
            c c3 = this.m;
            float f5 = c3 == null ? 0.0f : (float)Math.sin((double)Math.toRadians((double)(90.0f + -c3.i())));
            float f6 = (float)Math.tan((double)Math.toRadians((double)this.l.i()));
            this.e();
            float[] arrf = this.e;
            arrf[0] = f4;
            arrf[1] = f5;
            arrf[3] = f3 = -f5;
            arrf[4] = f4;
            arrf[8] = 1.0f;
            this.b.setValues(arrf);
            this.e();
            float[] arrf2 = this.e;
            arrf2[0] = 1.0f;
            arrf2[3] = f6;
            arrf2[4] = 1.0f;
            arrf2[8] = 1.0f;
            this.c.setValues(arrf2);
            this.e();
            float[] arrf3 = this.e;
            arrf3[0] = f4;
            arrf3[1] = f3;
            arrf3[3] = f5;
            arrf3[4] = f4;
            arrf3[8] = 1.0f;
            this.d.setValues(arrf3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.a.preConcat(this.d);
        }
        if ((d2 = this.i.g()).a() != 1.0f || d2.b() != 1.0f) {
            this.a.preScale(d2.a(), d2.b());
        }
        PointF pointF2 = this.g.g();
        if (pointF2.x != 0.0f || pointF2.y != 0.0f) {
            this.a.preTranslate(-pointF2.x, -pointF2.y);
        }
        return this.a;
    }
}

