/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package com.airbnb.lottie.c.b;

import android.graphics.PointF;
import com.airbnb.lottie.c;
import com.airbnb.lottie.c.a;
import com.airbnb.lottie.f.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class l {
    private final List<a> a;
    private PointF b;
    private boolean c;

    public l() {
        this.a = new ArrayList();
    }

    public l(PointF pointF, boolean bl, List<a> list) {
        this.b = pointF;
        this.c = bl;
        this.a = new ArrayList(list);
    }

    private void a(float f2, float f3) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f2, f3);
    }

    public PointF a() {
        return this.b;
    }

    public void a(l l2, l l3, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        boolean bl = l2.b() || l3.b();
        this.c = bl;
        if (l2.c().size() != l3.c().size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Curves must have the same number of control points. Shape 1: ");
            stringBuilder.append(l2.c().size());
            stringBuilder.append("\tShape 2: ");
            stringBuilder.append(l3.c().size());
            c.b(stringBuilder.toString());
        }
        int n2 = Math.min((int)l2.c().size(), (int)l3.c().size());
        if (this.a.size() < n2) {
            for (int i2 = this.a.size(); i2 < n2; ++i2) {
                this.a.add((Object)new a());
            }
        } else if (this.a.size() > n2) {
            for (int i3 = this.a.size() - 1; i3 >= n2; --i3) {
                List<a> list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = l2.a();
        PointF pointF2 = l3.a();
        this.a(e.a(pointF.x, pointF2.x, f2), e.a(pointF.y, pointF2.y, f2));
        for (int i4 = this.a.size() - 1; i4 >= 0; --i4) {
            a a2 = (a)l2.c().get(i4);
            a a3 = (a)l3.c().get(i4);
            PointF pointF3 = a2.a();
            PointF pointF4 = a2.b();
            PointF pointF5 = a2.c();
            PointF pointF6 = a3.a();
            PointF pointF7 = a3.b();
            PointF pointF8 = a3.c();
            ((a)this.a.get(i4)).a(e.a(pointF3.x, pointF6.x, f2), e.a(pointF3.y, pointF6.y, f2));
            ((a)this.a.get(i4)).b(e.a(pointF4.x, pointF7.x, f2), e.a(pointF4.y, pointF7.y, f2));
            ((a)this.a.get(i4)).c(e.a(pointF5.x, pointF8.x, f2), e.a(pointF5.y, pointF8.y, f2));
        }
    }

    public boolean b() {
        return this.c;
    }

    public List<a> c() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeData{numCurves=");
        stringBuilder.append(this.a.size());
        stringBuilder.append("closed=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

