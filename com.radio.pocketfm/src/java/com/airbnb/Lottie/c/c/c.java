/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.c.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.c.c.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;

public class c
extends a {
    private final Paint e = new com.airbnb.lottie.a.a(3);
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> h;

    c(f f2, d d2) {
        super(f2, d2);
    }

    private Bitmap f() {
        String string = this.c.g();
        return this.b.e(string);
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl2) {
        super.a(rectF, matrix, bl2);
        Bitmap bitmap = this.f();
        if (bitmap != null) {
            rectF.set(0.0f, 0.0f, (float)bitmap.getWidth() * com.airbnb.lottie.f.f.a(), (float)bitmap.getHeight() * com.airbnb.lottie.f.f.a());
            this.a.mapRect(rectF);
        }
    }

    @Override
    public <T> void a(T t2, com.airbnb.lottie.g.c<T> c2) {
        super.a(t2, c2);
        if (t2 == j.z) {
            if (c2 == null) {
                this.h = null;
                return;
            }
            this.h = new p<ColorFilter, T>(c2);
        }
    }

    @Override
    public void b(Canvas canvas, Matrix matrix, int n2) {
        Bitmap bitmap = this.f();
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                return;
            }
            float f2 = com.airbnb.lottie.f.f.a();
            this.e.setAlpha(n2);
            com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> a2 = this.h;
            if (a2 != null) {
                this.e.setColorFilter(a2.g());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.g.set(0, 0, (int)(f2 * (float)bitmap.getWidth()), (int)(f2 * (float)bitmap.getHeight()));
            canvas.drawBitmap(bitmap, this.f, this.g, this.e);
            canvas.restore();
        }
    }
}

