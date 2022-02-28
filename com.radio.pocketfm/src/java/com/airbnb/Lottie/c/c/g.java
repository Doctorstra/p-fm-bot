/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.RectF
 *  java.lang.Integer
 *  java.lang.Object
 */
package com.airbnb.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.c.c.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.j;

public class g
extends a {
    private final RectF e = new RectF();
    private final Paint f = new com.airbnb.lottie.a.a();
    private final float[] g = new float[8];
    private final Path h = new Path();
    private final d i;
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> j;

    g(f f2, d d2) {
        super(f2, d2);
        this.i = d2;
        this.f.setAlpha(0);
        this.f.setStyle(Paint.Style.FILL);
        this.f.setColor(d2.p());
    }

    @Override
    public void a(RectF rectF, Matrix matrix, boolean bl2) {
        super.a(rectF, matrix, bl2);
        this.e.set(0.0f, 0.0f, (float)this.i.r(), (float)this.i.q());
        this.a.mapRect(this.e);
        rectF.set(this.e);
    }

    @Override
    public <T> void a(T t2, c<T> c2) {
        super.a(t2, c2);
        if (t2 == j.z) {
            if (c2 == null) {
                this.j = null;
                return;
            }
            this.j = new p<ColorFilter, T>(c2);
        }
    }

    @Override
    public void b(Canvas canvas, Matrix matrix, int n2) {
        int n3 = Color.alpha((int)this.i.p());
        if (n3 == 0) {
            return;
        }
        int n4 = (int)(255.0f * ((float)n2 / 255.0f * ((float)n3 / 255.0f * (float)this.d.a().g().intValue() / 100.0f)));
        this.f.setAlpha(n4);
        com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> a2 = this.j;
        if (a2 != null) {
            this.f.setColorFilter(a2.g());
        }
        if (n4 > 0) {
            float[] arrf = this.g;
            arrf[0] = 0.0f;
            arrf[1] = 0.0f;
            arrf[2] = this.i.r();
            float[] arrf2 = this.g;
            arrf2[3] = 0.0f;
            arrf2[4] = this.i.r();
            this.g[5] = this.i.q();
            float[] arrf3 = this.g;
            arrf3[6] = 0.0f;
            arrf3[7] = this.i.q();
            matrix.mapPoints(this.g);
            this.h.reset();
            Path path = this.h;
            float[] arrf4 = this.g;
            path.moveTo(arrf4[0], arrf4[1]);
            Path path2 = this.h;
            float[] arrf5 = this.g;
            path2.lineTo(arrf5[2], arrf5[3]);
            Path path3 = this.h;
            float[] arrf6 = this.g;
            path3.lineTo(arrf6[4], arrf6[5]);
            Path path4 = this.h;
            float[] arrf7 = this.g;
            path4.lineTo(arrf7[6], arrf7[7]);
            Path path5 = this.h;
            float[] arrf8 = this.g;
            path5.lineTo(arrf8[0], arrf8[1]);
            this.h.close();
            canvas.drawPath(this.h, this.f);
        }
    }
}

