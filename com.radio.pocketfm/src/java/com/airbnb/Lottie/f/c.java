/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.airbnb.lottie.f;

import android.view.Choreographer;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f.a;
import com.airbnb.lottie.f.e;

public class c
extends a
implements Choreographer.FrameCallback {
    protected boolean a = false;
    private float b = 1.0f;
    private boolean c = false;
    private long d = 0L;
    private float e = 0.0f;
    private int f = 0;
    private float g = -2.14748365E9f;
    private float h = 2.14748365E9f;
    private d i;

    private float q() {
        d d2 = this.i;
        if (d2 == null) {
            return Float.MAX_VALUE;
        }
        return 1.0E9f / d2.h() / Math.abs((float)this.b);
    }

    private boolean r() {
        return this.h() < 0.0f;
    }

    private void s() {
        if (this.i == null) {
            return;
        }
        float f2 = this.e;
        if (!(f2 < this.g) && !(f2 > this.h)) {
            return;
        }
        Object[] arrobject = new Object[]{Float.valueOf((float)this.g), Float.valueOf((float)this.h), Float.valueOf((float)this.e)};
        throw new IllegalStateException(String.format((String)"Frame must be [%f,%f]. It is %f", (Object[])arrobject));
    }

    public void a(float f2) {
        this.b = f2;
    }

    public void a(int n2) {
        float f2 = this.e;
        float f3 = n2;
        if (f2 == f3) {
            return;
        }
        this.e = e.b(f3, this.m(), this.n());
        this.d = System.nanoTime();
        this.c();
    }

    public void a(int n2, int n3) {
        if (n2 <= n3) {
            d d2 = this.i;
            float f2 = d2 == null ? -3.4028235E38f : d2.f();
            d d3 = this.i;
            float f3 = d3 == null ? Float.MAX_VALUE : d3.g();
            float f4 = n2;
            this.g = e.b(f4, f2, f3);
            float f5 = n3;
            this.h = e.b(f5, f2, f3);
            this.a((int)e.b(this.e, f4, f5));
            return;
        }
        Object[] arrobject = new Object[]{n2, n3};
        throw new IllegalArgumentException(String.format((String)"minFrame (%s) must be <= maxFrame (%s)", (Object[])arrobject));
    }

    public void a(d d2) {
        boolean bl2 = this.i == null;
        this.i = d2;
        if (bl2) {
            this.a((int)Math.max((float)this.g, (float)d2.f()), (int)Math.min((float)this.h, (float)d2.g()));
        } else {
            this.a((int)d2.f(), (int)d2.g());
        }
        float f2 = this.e;
        this.e = 0.0f;
        this.a((int)f2);
    }

    public void b(int n2) {
        this.a(n2, (int)this.h);
    }

    public void c(int n2) {
        this.a((int)this.g, n2);
    }

    protected void c(boolean bl2) {
        Choreographer.getInstance().removeFrameCallback((Choreographer.FrameCallback)this);
        if (bl2) {
            this.a = false;
        }
    }

    public void cancel() {
        this.b();
        this.p();
    }

    public float d() {
        d d2 = this.i;
        if (d2 == null) {
            return 0.0f;
        }
        return (this.e - d2.f()) / (this.i.g() - this.i.f());
    }

    public void doFrame(long l2) {
        this.o();
        if (this.i != null) {
            if (!this.isRunning()) {
                return;
            }
            long l3 = System.nanoTime();
            long l4 = l3 - this.d;
            float f2 = this.q();
            float f3 = (float)l4 / f2;
            float f4 = this.e;
            if (this.r()) {
                f3 = -f3;
            }
            this.e = f4 + f3;
            boolean bl2 = true ^ e.c(this.e, this.m(), this.n());
            this.e = e.b(this.e, this.m(), this.n());
            this.d = l3;
            this.c();
            if (bl2) {
                if (this.getRepeatCount() != -1 && this.f >= this.getRepeatCount()) {
                    this.e = this.n();
                    this.p();
                    this.b(this.r());
                } else {
                    this.a();
                    this.f = 1 + this.f;
                    if (this.getRepeatMode() == 2) {
                        this.c = true ^ this.c;
                        this.g();
                    } else {
                        float f5 = this.r() ? this.n() : this.m();
                        this.e = f5;
                    }
                    this.d = l3;
                }
            }
            this.s();
        }
    }

    public float e() {
        return this.e;
    }

    public void f() {
        this.i = null;
        this.g = -2.14748365E9f;
        this.h = 2.14748365E9f;
    }

    public void g() {
        this.a(-this.h());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float getAnimatedFraction() {
        float f2;
        float f3;
        float f4;
        if (this.i == null) {
            return 0.0f;
        }
        if (this.r()) {
            f4 = this.n() - this.e;
            f2 = this.n();
            f3 = this.m();
            do {
                return f4 / (f2 - f3);
                break;
            } while (true);
        }
        f4 = this.e - this.m();
        f2 = this.n();
        f3 = this.m();
        return f4 / (f2 - f3);
    }

    public Object getAnimatedValue() {
        return Float.valueOf((float)this.d());
    }

    public long getDuration() {
        d d2 = this.i;
        if (d2 == null) {
            return 0L;
        }
        return (long)d2.e();
    }

    public float h() {
        return this.b;
    }

    public void i() {
        this.a = true;
        this.a(this.r());
        float f2 = this.r() ? this.n() : this.m();
        this.a((int)f2);
        this.d = System.nanoTime();
        this.f = 0;
        this.o();
    }

    public boolean isRunning() {
        return this.a;
    }

    public void j() {
        this.p();
        this.b(this.r());
    }

    public void k() {
        this.p();
    }

    public void l() {
        this.a = true;
        this.o();
        this.d = System.nanoTime();
        if (this.r() && this.e() == this.m()) {
            this.e = this.n();
            return;
        }
        if (!this.r() && this.e() == this.n()) {
            this.e = this.m();
        }
    }

    public float m() {
        d d2 = this.i;
        if (d2 == null) {
            return 0.0f;
        }
        float f2 = this.g;
        if (f2 == -2.14748365E9f) {
            f2 = d2.f();
        }
        return f2;
    }

    public float n() {
        d d2 = this.i;
        if (d2 == null) {
            return 0.0f;
        }
        float f2 = this.h;
        if (f2 == 2.14748365E9f) {
            f2 = d2.g();
        }
        return f2;
    }

    protected void o() {
        if (this.isRunning()) {
            this.c(false);
            Choreographer.getInstance().postFrameCallback((Choreographer.FrameCallback)this);
        }
    }

    protected void p() {
        this.c(true);
    }

    public void setRepeatMode(int n2) {
        super.setRepeatMode(n2);
        if (n2 != 2 && this.c) {
            this.c = false;
            this.g();
        }
    }
}

