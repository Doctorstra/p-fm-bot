/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.LinearGradient
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.PointF
 *  android.graphics.RadialGradient
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  androidx.a.d
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.a.a.a;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.b.c;
import com.airbnb.lottie.c.b.e;
import com.airbnb.lottie.c.b.p;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import java.util.List;

public class i
extends a {
    private final String b;
    private final boolean c;
    private final androidx.a.d<LinearGradient> d = new androidx.a.d();
    private final androidx.a.d<RadialGradient> e = new androidx.a.d();
    private final RectF f = new RectF();
    private final com.airbnb.lottie.c.b.f g;
    private final int h;
    private final com.airbnb.lottie.a.b.a<c, c> i;
    private final com.airbnb.lottie.a.b.a<PointF, PointF> j;
    private final com.airbnb.lottie.a.b.a<PointF, PointF> k;

    public i(f f2, com.airbnb.lottie.c.c.a a2, e e2) {
        super(f2, a2, e2.h().a(), e2.i().a(), e2.l(), e2.d(), e2.g(), e2.j(), e2.k());
        this.b = e2.a();
        this.g = e2.b();
        this.c = e2.m();
        this.h = (int)(f2.s().e() / 32.0f);
        this.i = e2.c().a();
        this.i.a(this);
        a2.a(this.i);
        this.j = e2.e().a();
        this.j.a(this);
        a2.a(this.j);
        this.k = e2.f().a();
        this.k.a(this);
        a2.a(this.k);
    }

    private LinearGradient c() {
        androidx.a.d<LinearGradient> d2 = this.d;
        int n2 = this.e();
        long l2 = n2;
        LinearGradient linearGradient = (LinearGradient)d2.a(l2);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = this.j.g();
        PointF pointF2 = this.k.g();
        c c2 = this.i.g();
        int[] arrn = c2.b();
        float[] arrf = c2.a();
        int n3 = (int)(this.f.left + this.f.width() / 2.0f + pointF.x);
        int n4 = (int)(this.f.top + this.f.height() / 2.0f + pointF.y);
        int n5 = (int)(this.f.left + this.f.width() / 2.0f + pointF2.x);
        int n6 = (int)(this.f.top + this.f.height() / 2.0f + pointF2.y);
        LinearGradient linearGradient2 = new LinearGradient((float)n3, (float)n4, (float)n5, (float)n6, arrn, arrf, Shader.TileMode.CLAMP);
        this.d.b(l2, (Object)linearGradient2);
        return linearGradient2;
    }

    private RadialGradient d() {
        androidx.a.d<RadialGradient> d2 = this.e;
        int n2 = this.e();
        long l2 = n2;
        RadialGradient radialGradient = (RadialGradient)d2.a(l2);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = this.j.g();
        PointF pointF2 = this.k.g();
        c c2 = this.i.g();
        int[] arrn = c2.b();
        float[] arrf = c2.a();
        int n3 = (int)(this.f.left + this.f.width() / 2.0f + pointF.x);
        int n4 = (int)(this.f.top + this.f.height() / 2.0f + pointF.y);
        int n5 = (int)(this.f.left + this.f.width() / 2.0f + pointF2.x);
        int n6 = (int)(this.f.top + this.f.height() / 2.0f + pointF2.y);
        float f2 = (float)Math.hypot((double)(n5 - n3), (double)(n6 - n4));
        RadialGradient radialGradient2 = new RadialGradient((float)n3, (float)n4, f2, arrn, arrf, Shader.TileMode.CLAMP);
        this.e.b(l2, (Object)radialGradient2);
        return radialGradient2;
    }

    private int e() {
        int n2 = Math.round((float)(this.j.h() * (float)this.h));
        int n3 = Math.round((float)(this.k.h() * (float)this.h));
        int n4 = Math.round((float)(this.i.h() * (float)this.h));
        int n5 = n2 != 0 ? 527 * n2 : 17;
        if (n3 != 0) {
            n5 = n3 * (n5 * 31);
        }
        if (n4 != 0) {
            n5 = n4 * (n5 * 31);
        }
        return n5;
    }

    @Override
    public void a(Canvas canvas, Matrix matrix, int n2) {
        if (this.c) {
            return;
        }
        this.a(this.f, matrix, false);
        if (this.g == com.airbnb.lottie.c.b.f.a) {
            this.a.setShader((Shader)this.c());
        } else {
            this.a.setShader((Shader)this.d());
        }
        super.a(canvas, matrix, n2);
    }

    @Override
    public String b() {
        return this.b;
    }
}

