/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  com.airbnb.lottie.c.a.b
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.List
 */
package com.airbnb.lottie.c.a;

import android.graphics.PointF;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.g.a;
import java.util.List;

public class i
implements m<PointF, PointF> {
    private final b a;
    private final b b;

    public i(b b2, b b3) {
        this.a = b2;
        this.b = b3;
    }

    @Override
    public com.airbnb.lottie.a.b.a<PointF, PointF> a() {
        return new com.airbnb.lottie.a.b.m(this.a.a(), this.b.a());
    }

    @Override
    public boolean b() {
        return this.a.b() && this.b.b();
    }

    @Override
    public List<a<PointF>> c() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}

