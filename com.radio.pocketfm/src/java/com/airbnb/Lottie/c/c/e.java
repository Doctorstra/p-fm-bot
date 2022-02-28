/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.RectF
 */
package com.airbnb.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.c.c.d;
import com.airbnb.lottie.f;

public class e
extends a {
    e(f f2, d d2) {
        super(f2, d2);
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl2) {
        super.a(rectF, matrix, bl2);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override
    void b(Canvas canvas, Matrix matrix, int n2) {
    }
}

