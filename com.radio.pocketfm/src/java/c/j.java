/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 */
package c;

import c.u;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class j
extends u {
    private u a;

    public j(u u2) {
        if (u2 != null) {
            this.a = u2;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final j a(u u2) {
        if (u2 != null) {
            this.a = u2;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final u a() {
        return this.a;
    }

    @Override
    public u a(long l2) {
        return this.a.a(l2);
    }

    @Override
    public u a(long l2, TimeUnit timeUnit) {
        return this.a.a(l2, timeUnit);
    }

    @Override
    public long d() {
        return this.a.d();
    }

    @Override
    public u f() {
        return this.a.f();
    }

    @Override
    public void g() throws IOException {
        this.a.g();
    }

    @Override
    public long s_() {
        return this.a.s_();
    }

    @Override
    public boolean t_() {
        return this.a.t_();
    }

    @Override
    public u u_() {
        return this.a.u_();
    }
}

