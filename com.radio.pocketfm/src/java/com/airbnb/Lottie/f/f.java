/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.graphics.PointF
 *  android.util.DisplayMetrics
 *  com.airbnb.lottie.a.a.s
 *  com.airbnb.lottie.a.b.c
 *  java.io.Closeable
 *  java.lang.Math
 *  java.lang.Object
 */
package com.airbnb.lottie.f;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c;
import com.airbnb.lottie.f.e;
import java.io.Closeable;

public final class f {
    private static final PathMeasure a = new PathMeasure();
    private static final Path b = new Path();
    private static final Path c = new Path();
    private static final float[] d = new float[4];
    private static final float e = (float)Math.sqrt((double)2.0);
    private static float f = -1.0f;

    public static float a() {
        if (f == -1.0f) {
            f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f;
    }

    public static float a(Matrix matrix) {
        float f2;
        float[] arrf = d;
        arrf[0] = 0.0f;
        arrf[1] = 0.0f;
        arrf[2] = f2 = e;
        arrf[3] = f2;
        matrix.mapPoints(arrf);
        float[] arrf2 = d;
        float f3 = arrf2[2] - arrf2[0];
        float f4 = arrf2[3] - arrf2[1];
        return (float)Math.hypot((double)f3, (double)f4) / 2.0f;
    }

    public static int a(float f2, float f3, float f4, float f5) {
        int n2 = f2 != 0.0f ? (int)(f2 * (float)527) : 17;
        if (f3 != 0.0f) {
            n2 = (int)(f3 * (float)(n2 * 31));
        }
        if (f4 != 0.0f) {
            n2 = (int)(f4 * (float)(n2 * 31));
        }
        if (f5 != 0.0f) {
            n2 = (int)(f5 * (float)(n2 * 31));
        }
        return n2;
    }

    public static Path a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF.x + pointF3.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static void a(Path path, float f2, float f3, float f4) {
        c.c("applyTrimPathIfNeeded");
        a.setPath(path, false);
        float f5 = a.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            c.d("applyTrimPathIfNeeded");
            return;
        }
        if (!(f5 < 1.0f) && !((double)Math.abs((float)(f3 - f2 - 1.0f)) < 0.01)) {
            float f6 = f2 * f5;
            float f7 = f3 * f5;
            float f8 = Math.min((float)f6, (float)f7);
            float f9 = Math.max((float)f6, (float)f7);
            float f10 = f4 * f5;
            float f11 = f8 + f10;
            float f12 = f9 + f10;
            if (f11 >= f5 && f12 >= f5) {
                f11 = e.a(f11, f5);
                f12 = e.a(f12, f5);
            }
            if (f11 < 0.0f) {
                f11 = e.a(f11, f5);
            }
            if (f12 < 0.0f) {
                f12 = e.a(f12, f5);
            }
            if (f11 == f12) {
                path.reset();
                c.d("applyTrimPathIfNeeded");
                return;
            }
            if (f11 >= f12) {
                f11 -= f5;
            }
            b.reset();
            a.getSegment(f11, f12, b, true);
            if (f12 > f5) {
                c.reset();
                a.getSegment(0.0f, f12 % f5, c, true);
                b.addPath(c);
            } else if (f11 < 0.0f) {
                c.reset();
                a.getSegment(f11 + f5, f5, c, true);
                b.addPath(c);
            }
            path.set(b);
            c.d("applyTrimPathIfNeeded");
            return;
        }
        c.d("applyTrimPathIfNeeded");
    }

    public static void a(Path path, s s2) {
        if (s2 != null) {
            if (s2.g()) {
                return;
            }
            float f2 = ((com.airbnb.lottie.a.b.c)s2.d()).i();
            float f3 = ((com.airbnb.lottie.a.b.c)s2.e()).i();
            float f4 = ((com.airbnb.lottie.a.b.c)s2.f()).i();
            f.a(path, f2 / 100.0f, f3 / 100.0f, f4 / 360.0f);
        }
    }

    /*
     * Exception decompiling
     */
    public static void a(Closeable var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl9.1 : RETURN : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 < n5) {
            return false;
        }
        if (n2 > n5) {
            return true;
        }
        if (n3 < n6) {
            return false;
        }
        if (n3 > n6) {
            return true;
        }
        boolean bl = false;
        if (n4 >= n7) {
            bl = true;
        }
        return bl;
    }
}

