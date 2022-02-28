/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PointF
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.a.a.b;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.k;
import com.airbnb.lottie.a.a.m;
import com.airbnb.lottie.a.a.n;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.b.i;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import java.util.List;

public class n
implements k,
m,
a.a {
    private final Path a = new Path();
    private final String b;
    private final f c;
    private final i.a d;
    private final boolean e;
    private final com.airbnb.lottie.a.b.a<?, Float> f;
    private final com.airbnb.lottie.a.b.a<?, PointF> g;
    private final com.airbnb.lottie.a.b.a<?, Float> h;
    private final com.airbnb.lottie.a.b.a<?, Float> i;
    private final com.airbnb.lottie.a.b.a<?, Float> j;
    private final com.airbnb.lottie.a.b.a<?, Float> k;
    private final com.airbnb.lottie.a.b.a<?, Float> l;
    private b m = new b();
    private boolean n;

    public n(f f2, a a2, i i2) {
        this.c = f2;
        this.b = i2.a();
        this.d = i2.b();
        this.e = i2.j();
        this.f = i2.c().a();
        this.g = i2.d().a();
        this.h = i2.e().a();
        this.j = i2.g().a();
        this.l = i2.i().a();
        if (this.d == i.a.a) {
            this.i = i2.f().a();
            this.k = i2.h().a();
        } else {
            this.i = null;
            this.k = null;
        }
        a2.a(this.f);
        a2.a(this.g);
        a2.a(this.h);
        a2.a(this.j);
        a2.a(this.l);
        if (this.d == i.a.a) {
            a2.a(this.i);
            a2.a(this.k);
        }
        this.f.a(this);
        this.g.a(this);
        this.h.a(this);
        this.j.a(this);
        this.l.a(this);
        if (this.d == i.a.a) {
            this.i.a(this);
            this.k.a(this);
        }
    }

    private void c() {
        this.n = false;
        this.c.invalidateSelf();
    }

    private void d() {
        double d2;
        double d3;
        float f2;
        float f3;
        float f4;
        float f5;
        double d4;
        float f6;
        float f7 = this.f.g().floatValue();
        com.airbnb.lottie.a.b.a<?, Float> a2 = this.h;
        double d5 = a2 == null ? 0.0 : (double)a2.g().floatValue();
        double d6 = Math.toRadians((double)(d5 - 90.0));
        double d7 = f7;
        Double.isNaN((double)d7);
        float f8 = (float)(6.283185307179586 / d7);
        float f9 = f8 / 2.0f;
        float f10 = f7 - (float)((int)f7);
        if (f10 != 0.0f) {
            double d8 = f9 * (1.0f - f10);
            Double.isNaN((double)d8);
            d6 += d8;
        }
        float f11 = this.j.g().floatValue();
        float f12 = this.i.g().floatValue();
        com.airbnb.lottie.a.b.a<?, Float> a3 = this.k;
        float f13 = a3 != null ? a3.g().floatValue() / 100.0f : 0.0f;
        com.airbnb.lottie.a.b.a<?, Float> a4 = this.l;
        float f14 = a4 != null ? a4.g().floatValue() / 100.0f : 0.0f;
        if (f10 != 0.0f) {
            float f15 = f12 + f10 * (f11 - f12);
            double d9 = f15;
            double d10 = Math.cos((double)d6);
            Double.isNaN((double)d9);
            d3 = d7;
            float f16 = (float)(d9 * d10);
            double d11 = Math.sin((double)d6);
            Double.isNaN((double)d9);
            float f17 = (float)(d9 * d11);
            this.a.moveTo(f16, f17);
            double d12 = f8 * f10 / 2.0f;
            Double.isNaN((double)d12);
            d4 = d6 + d12;
            f3 = f16;
            f6 = f15;
            f4 = f11;
            f2 = f17;
            f5 = f9;
        } else {
            d3 = d7;
            f4 = f11;
            double d13 = f4;
            double d14 = Math.cos((double)d6);
            Double.isNaN((double)d13);
            f5 = f9;
            f3 = (float)(d13 * d14);
            double d15 = Math.sin((double)d6);
            Double.isNaN((double)d13);
            f2 = (float)(d13 * d15);
            this.a.moveTo(f3, f2);
            double d16 = f5;
            Double.isNaN((double)d16);
            d4 = d6 + d16;
            f6 = 0.0f;
        }
        double d17 = 2.0 * Math.ceil((double)d3);
        int n2 = 0;
        double d18 = d4;
        boolean bl = false;
        while ((d2 = (double)n2) < d17) {
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            float f29 = bl ? f4 : f12;
            if (f6 != 0.0f && d2 == d17 - 2.0) {
                float f30 = f8 * f10 / 2.0f;
                f22 = f29;
                f20 = f30;
            } else {
                f22 = f29;
                f20 = f5;
            }
            if (f6 != 0.0f && d2 == d17 - 1.0) {
                f28 = f8;
                f18 = f4;
                f21 = f6;
            } else {
                f28 = f8;
                f21 = f22;
                f18 = f4;
            }
            double d19 = f21;
            double d20 = Math.cos((double)d18);
            Double.isNaN((double)d19);
            float f31 = (float)(d19 * d20);
            double d21 = Math.sin((double)d18);
            Double.isNaN((double)d19);
            float f32 = (float)(d19 * d21);
            if (f13 == 0.0f && f14 == 0.0f) {
                this.a.lineTo(f31, f32);
                f26 = f32;
                f24 = f5;
                f25 = f12;
                f23 = f13;
                f27 = f14;
                f19 = f20;
            } else {
                f24 = f5;
                double d22 = f2;
                f25 = f12;
                f23 = f13;
                double d23 = (float)(Math.atan2((double)d22, (double)f3) - 1.5707963267948966);
                float f33 = (float)Math.cos((double)d23);
                float f34 = (float)Math.sin((double)d23);
                f27 = f14;
                double d24 = f32;
                float f35 = f20;
                f26 = f32;
                double d25 = (float)(Math.atan2((double)d24, (double)f31) - 1.5707963267948966);
                float f36 = (float)Math.cos((double)d25);
                float f37 = (float)Math.sin((double)d25);
                float f38 = bl ? f23 : f27;
                float f39 = bl ? f27 : f23;
                float f40 = bl ? f25 : f18;
                float f41 = bl ? f18 : f25;
                float f42 = 0.47829f * (f40 * f38);
                float f43 = f33 * f42;
                float f44 = f42 * f34;
                float f45 = 0.47829f * (f41 * f39);
                float f46 = f36 * f45;
                float f47 = f45 * f37;
                if (f10 != 0.0f) {
                    if (n2 == 0) {
                        f43 *= f10;
                        f44 *= f10;
                    } else if (d2 == d17 - 1.0) {
                        f46 *= f10;
                        f47 *= f10;
                    }
                }
                this.a.cubicTo(f3 - f43, f2 - f44, f31 + f46, f26 + f47, f31, f26);
                f19 = f35;
            }
            double d26 = f19;
            Double.isNaN((double)d26);
            d18 += d26;
            bl ^= true;
            ++n2;
            f14 = f27;
            f3 = f31;
            f5 = f24;
            f4 = f18;
            f8 = f28;
            f12 = f25;
            f13 = f23;
            f2 = f26;
        }
        PointF pointF = this.g.g();
        this.a.offset(pointF.x, pointF.y);
        this.a.close();
    }

    private void f() {
        int n2 = (int)Math.floor((double)this.f.g().floatValue());
        com.airbnb.lottie.a.b.a<?, Float> a2 = this.h;
        double d2 = a2 == null ? 0.0 : (double)a2.g().floatValue();
        double d3 = Math.toRadians((double)(d2 - 90.0));
        double d4 = n2;
        Double.isNaN((double)d4);
        float f2 = (float)(6.283185307179586 / d4);
        float f3 = this.l.g().floatValue() / 100.0f;
        float f4 = this.j.g().floatValue();
        double d5 = f4;
        double d6 = Math.cos((double)d3);
        Double.isNaN((double)d5);
        float f5 = (float)(d6 * d5);
        double d7 = Math.sin((double)d3);
        Double.isNaN((double)d5);
        float f6 = (float)(d7 * d5);
        this.a.moveTo(f5, f6);
        double d8 = f2;
        Double.isNaN((double)d8);
        double d9 = d3 + d8;
        double d10 = Math.ceil((double)d4);
        int n3 = 0;
        while ((double)n3 < d10) {
            double d11;
            double d12;
            double d13;
            int n4;
            double d14 = Math.cos((double)d9);
            Double.isNaN((double)d5);
            float f7 = (float)(d14 * d5);
            double d15 = Math.sin((double)d9);
            Double.isNaN((double)d5);
            double d16 = d10;
            float f8 = (float)(d5 * d15);
            if (f3 != 0.0f) {
                d13 = d5;
                double d17 = f6;
                n4 = n3;
                d11 = d9;
                double d18 = (float)(Math.atan2((double)d17, (double)f5) - 1.5707963267948966);
                float f9 = (float)Math.cos((double)d18);
                float f10 = (float)Math.sin((double)d18);
                double d19 = f8;
                d12 = d8;
                double d20 = (float)(Math.atan2((double)d19, (double)f7) - 1.5707963267948966);
                float f11 = (float)Math.cos((double)d20);
                float f12 = (float)Math.sin((double)d20);
                float f13 = 0.25f * (f4 * f3);
                float f14 = f9 * f13;
                float f15 = f10 * f13;
                float f16 = f11 * f13;
                float f17 = f13 * f12;
                this.a.cubicTo(f5 - f14, f6 - f15, f7 + f16, f8 + f17, f7, f8);
            } else {
                d11 = d9;
                d13 = d5;
                d12 = d8;
                n4 = n3;
                this.a.lineTo(f7, f8);
            }
            Double.isNaN((double)d12);
            d9 = d11 + d12;
            n3 = n4 + 1;
            f6 = f8;
            f5 = f7;
            d10 = d16;
            d5 = d13;
            d8 = d12;
        }
        PointF pointF = this.g.g();
        this.a.offset(pointF.x, pointF.y);
        this.a.close();
    }

    @Override
    public void a() {
        this.c();
    }

    @Override
    public void a(e e2, int n2, List<e> list, e e3) {
        com.airbnb.lottie.f.e.a(e2, n2, list, e3, this);
    }

    @Override
    public <T> void a(T t2, com.airbnb.lottie.g.c<T> c2) {
        com.airbnb.lottie.a.b.a<?, Float> a2;
        com.airbnb.lottie.a.b.a<?, Float> a3;
        if (t2 == j.q) {
            this.f.a(c2);
            return;
        }
        if (t2 == j.r) {
            this.h.a(c2);
            return;
        }
        if (t2 == j.h) {
            this.g.a(c2);
            return;
        }
        if (t2 == j.s && (a2 = this.i) != null) {
            a2.a(c2);
            return;
        }
        if (t2 == j.t) {
            this.j.a(c2);
            return;
        }
        if (t2 == j.u && (a3 = this.k) != null) {
            a3.a(c2);
            return;
        }
        if (t2 == j.v) {
            this.l.a(c2);
        }
    }

    @Override
    public void a(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            s s2;
            c c2 = (c)list.get(i2);
            if (!(c2 instanceof s) || (s2 = (s)c2).c() != q.a.a) continue;
            this.m.a(s2);
            s2.a(this);
        }
    }

    @Override
    public String b() {
        return this.b;
    }

    @Override
    public Path e() {
        if (this.n) {
            return this.a;
        }
        this.a.reset();
        if (this.e) {
            this.n = true;
            return this.a;
        }
        int n2 = 1.a[this.d.ordinal()];
        if (n2 != 1) {
            if (n2 == 2) {
                this.f();
            }
        } else {
            this.d();
        }
        this.a.close();
        this.m.a(this.a);
        this.n = true;
        return this.a;
    }
}

