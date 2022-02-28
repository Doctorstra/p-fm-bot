/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.a.g
 *  com.airbnb.lottie.c.c.a
 *  java.lang.Float
 *  java.lang.Object
 *  java.util.List
 */
package com.airbnb.lottie.c.a;

import android.graphics.PointF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.d;
import com.airbnb.lottie.c.a.e;
import com.airbnb.lottie.c.a.g;
import com.airbnb.lottie.c.a.i;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.f;
import com.airbnb.lottie.g.a;
import java.util.List;

public class l
implements com.airbnb.lottie.c.b.b {
    private final e a;
    private final m<PointF, PointF> b;
    private final g c;
    private final b d;
    private final d e;
    private final boolean f;
    private final b g;
    private final b h;
    private final b i;
    private final b j;

    public l() {
        this(new e(), new e(), new g(), new b(), new d(), new b(), new b(), new b(), new b());
    }

    public l(e e2, m<PointF, PointF> m2, g g2, b b2, d d2, b b3, b b4, b b5, b b6) {
        boolean bl2;
        block2 : {
            block5 : {
                block4 : {
                    block3 : {
                        this.a = e2;
                        this.b = m2;
                        this.c = g2;
                        this.d = b2;
                        this.e = d2;
                        this.i = b3;
                        this.j = b4;
                        this.g = b5;
                        this.h = b6;
                        boolean bl3 = e2.b();
                        bl2 = false;
                        if (!bl3) break block2;
                        boolean bl4 = ((PointF)((a)e2.c().get((int)0)).a).equals(0.0f, 0.0f);
                        bl2 = false;
                        if (!bl4) break block2;
                        boolean bl5 = m2 instanceof i;
                        bl2 = false;
                        if (bl5) break block2;
                        boolean bl6 = m2.b();
                        bl2 = false;
                        if (!bl6) break block2;
                        boolean bl7 = ((PointF)((a)m2.c().get((int)0)).a).equals(0.0f, 0.0f);
                        bl2 = false;
                        if (!bl7) break block2;
                        boolean bl8 = g2.b();
                        bl2 = false;
                        if (!bl8) break block2;
                        boolean bl9 = ((com.airbnb.lottie.g.d)((a)g2.c().get((int)0)).a).b(1.0f, 1.0f);
                        bl2 = false;
                        if (!bl9) break block2;
                        if (b2.b() && ((Float)((a)b2.c().get((int)0)).a).floatValue() == 0.0f) break block3;
                        boolean bl10 = b2.a.isEmpty();
                        bl2 = false;
                        if (!bl10) break block2;
                    }
                    if (b5 == null) break block4;
                    boolean bl11 = b5.b();
                    bl2 = false;
                    if (!bl11) break block2;
                    float f2 = ((Float)((a)b5.c().get((int)0)).a).floatValue() FCMPL 0.0f;
                    bl2 = false;
                    if (f2 != false) break block2;
                }
                if (b6 == null) break block5;
                boolean bl12 = b6.b();
                bl2 = false;
                if (!bl12) break block2;
                float f3 = ((Float)((a)b6.c().get((int)0)).a).floatValue() FCMPL 0.0f;
                bl2 = false;
                if (f3 != false) break block2;
            }
            bl2 = true;
        }
        this.f = bl2;
    }

    @Override
    public c a(f f2, com.airbnb.lottie.c.c.a a2) {
        return null;
    }

    public e a() {
        return this.a;
    }

    public m<PointF, PointF> b() {
        return this.b;
    }

    public g c() {
        return this.c;
    }

    public b d() {
        return this.d;
    }

    public d e() {
        return this.e;
    }

    public b f() {
        return this.i;
    }

    public b g() {
        return this.j;
    }

    public b h() {
        return this.g;
    }

    public b i() {
        return this.h;
    }

    public boolean j() {
        return this.f;
    }

    public o k() {
        return new o(this);
    }
}

