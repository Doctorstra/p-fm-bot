/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.a.a.a;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.d;
import com.airbnb.lottie.c.b.p;
import com.airbnb.lottie.f;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.j;
import java.util.List;

public class r
extends a {
    private final com.airbnb.lottie.c.c.a b;
    private final String c;
    private final boolean d;
    private final com.airbnb.lottie.a.b.a<Integer, Integer> e;
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> f;

    public r(f f2, com.airbnb.lottie.c.c.a a2, p p2) {
        super(f2, a2, p2.g().a(), p2.h().a(), p2.i(), p2.c(), p2.d(), p2.e(), p2.f());
        this.b = a2;
        this.c = p2.a();
        this.d = p2.j();
        this.e = p2.b().a();
        this.e.a(this);
        a2.a(this.e);
    }

    @Override
    public void a(Canvas canvas, Matrix matrix, int n2) {
        if (this.d) {
            return;
        }
        this.a.setColor(((com.airbnb.lottie.a.b.b)this.e).i());
        if (this.f != null) {
            this.a.setColorFilter(this.f.g());
        }
        super.a(canvas, matrix, n2);
    }

    @Override
    public <T> void a(T t2, c<T> c2) {
        super.a(t2, c2);
        if (t2 == j.b) {
            this.e.a(c2);
            return;
        }
        if (t2 == j.z) {
            if (c2 == null) {
                this.f = null;
                return;
            }
            this.f = new com.airbnb.lottie.a.b.p<ColorFilter, T>(c2);
            this.f.a(this);
            this.b.a(this.e);
        }
    }

    @Override
    public String b() {
        return this.c;
    }
}

