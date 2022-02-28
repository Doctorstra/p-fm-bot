/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.a.b;

import android.graphics.PointF;
import com.airbnb.lottie.a.b.f;
import com.airbnb.lottie.g.a;
import com.airbnb.lottie.g.c;
import java.util.List;

public class j
extends f<PointF> {
    private final PointF c = new PointF();

    public j(List<a<PointF>> list) {
        super(list);
    }

    @Override
    public /* synthetic */ Object a(a a2, float f2) {
        return this.b(a2, f2);
    }

    public PointF b(a<PointF> a2, float f2) {
        if (a2.a != null && a2.b != null) {
            PointF pointF;
            PointF pointF2 = (PointF)a2.a;
            PointF pointF3 = (PointF)a2.b;
            if (this.b != null && (pointF = this.b.a(a2.d, a2.e.floatValue(), pointF2, pointF3, f2, this.d(), this.h())) != null) {
                return pointF;
            }
            this.c.set(pointF2.x + f2 * (pointF3.x - pointF2.x), pointF2.y + f2 * (pointF3.y - pointF2.y));
            return this.c;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

