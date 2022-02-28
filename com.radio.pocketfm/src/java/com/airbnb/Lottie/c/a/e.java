/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  com.airbnb.lottie.a.b.i
 *  com.airbnb.lottie.a.b.j
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
package com.airbnb.lottie.c.a;

import android.graphics.PointF;
import com.airbnb.lottie.a.b.i;
import com.airbnb.lottie.a.b.j;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.g.a;
import java.util.Collections;
import java.util.List;

public class e
implements m<PointF, PointF> {
    private final List<a<PointF>> a;

    public e() {
        this.a = Collections.singletonList(new a<PointF>(new PointF(0.0f, 0.0f)));
    }

    public e(List<a<PointF>> list) {
        this.a = list;
    }

    @Override
    public com.airbnb.lottie.a.b.a<PointF, PointF> a() {
        if (((a)this.a.get(0)).e()) {
            return new j(this.a);
        }
        return new i(this.a);
    }

    @Override
    public boolean b() {
        int n2 = this.a.size();
        boolean bl2 = false;
        if (n2 == 1) {
            boolean bl3 = ((a)this.a.get(0)).e();
            bl2 = false;
            if (bl3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    @Override
    public List<a<PointF>> c() {
        return this.a;
    }
}

