/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.RectF
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.airbnb.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.c.b.n;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.c.c.d;
import com.airbnb.lottie.c.e;
import java.util.Collections;
import java.util.List;

public class f
extends a {
    private final com.airbnb.lottie.a.a.d e;

    f(com.airbnb.lottie.f f2, d d2) {
        super(f2, d2);
        this.e = new com.airbnb.lottie.a.a.d(f2, this, new n("__container", d2.n(), false));
        this.e.a((List<c>)Collections.emptyList(), (List<c>)Collections.emptyList());
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl2) {
        super.a(rectF, matrix, bl2);
        this.e.a(rectF, this.a, bl2);
    }

    @Override
    void b(Canvas canvas, Matrix matrix, int n2) {
        this.e.a(canvas, matrix, n2);
    }

    @Override
    protected void b(e e2, int n2, List<e> list, e e3) {
        this.e.a(e2, n2, list, e3);
    }
}

