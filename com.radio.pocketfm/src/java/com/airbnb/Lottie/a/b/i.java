/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.graphics.PointF
 *  java.lang.Float
 *  java.lang.Object
 *  java.util.List
 */
package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.a.b.f;
import com.airbnb.lottie.a.b.h;
import com.airbnb.lottie.g.a;
import com.airbnb.lottie.g.c;
import java.util.List;

public class i
extends f<PointF> {
    private final PointF c = new PointF();
    private final float[] d = new float[2];
    private h e;
    private PathMeasure f = new PathMeasure();

    public i(List<? extends a<PointF>> list) {
        super(list);
    }

    @Override
    public /* synthetic */ Object a(a a2, float f2) {
        return this.b(a2, f2);
    }

    public PointF b(a<PointF> a2, float f2) {
        PointF pointF;
        h h2 = (h)a2;
        Path path = h2.b();
        if (path == null) {
            return (PointF)a2.a;
        }
        if (this.b != null && (pointF = (PointF)this.b.a(h2.d, h2.e.floatValue(), h2.a, h2.b, this.d(), f2, this.h())) != null) {
            return pointF;
        }
        if (this.e != h2) {
            this.f.setPath(path, false);
            this.e = h2;
        }
        PathMeasure pathMeasure = this.f;
        pathMeasure.getPosTan(f2 * pathMeasure.getLength(), this.d, null);
        PointF pointF2 = this.c;
        float[] arrf = this.d;
        pointF2.set(arrf[0], arrf[1]);
        return this.c;
    }
}

