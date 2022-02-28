/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PointF
 *  com.airbnb.lottie.a.a.k
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.f;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.a.a.k;
import com.airbnb.lottie.c.a;
import com.airbnb.lottie.c.b.l;
import com.airbnb.lottie.c.f;
import java.util.List;

public class e {
    private static PointF a = new PointF();

    public static double a(double d2, double d3, double d4) {
        return d2 + d4 * (d3 - d2);
    }

    public static float a(float f2, float f3, float f4) {
        return f2 + f4 * (f3 - f2);
    }

    static int a(float f2, float f3) {
        return e.a((int)f2, (int)f3);
    }

    private static int a(int n2, int n3) {
        return n2 - n3 * e.b(n2, n3);
    }

    public static int a(int n2, int n3, float f2) {
        return (int)((float)n2 + f2 * (float)(n3 - n2));
    }

    public static int a(int n2, int n3, int n4) {
        return Math.max((int)n3, (int)Math.min((int)n4, (int)n2));
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void a(l l2, Path path) {
        path.reset();
        PointF pointF = l2.a();
        path.moveTo(pointF.x, pointF.y);
        a.set(pointF.x, pointF.y);
        for (int i2 = 0; i2 < l2.c().size(); ++i2) {
            a a2 = (a)l2.c().get(i2);
            PointF pointF2 = a2.a();
            PointF pointF3 = a2.b();
            PointF pointF4 = a2.c();
            if (pointF2.equals((Object)a) && pointF3.equals((Object)pointF4)) {
                path.lineTo(pointF4.x, pointF4.y);
            } else {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            }
            a.set(pointF4.x, pointF4.y);
        }
        if (l2.b()) {
            path.close();
        }
    }

    public static void a(com.airbnb.lottie.c.e e2, int n2, List<com.airbnb.lottie.c.e> list, com.airbnb.lottie.c.e e3, k k2) {
        if (e2.c(k2.b(), n2)) {
            list.add((Object)e3.a(k2.b()).a((f)k2));
        }
    }

    public static float b(float f2, float f3, float f4) {
        return Math.max((float)f3, (float)Math.min((float)f4, (float)f2));
    }

    private static int b(int n2, int n3) {
        int n4 = n2 / n3;
        boolean bl = (n2 ^ n3) >= 0;
        int n5 = n2 % n3;
        if (!bl && n5 != 0) {
            --n4;
        }
        return n4;
    }

    public static boolean c(float f2, float f3, float f4) {
        return f2 >= f3 && f2 <= f4;
    }
}

