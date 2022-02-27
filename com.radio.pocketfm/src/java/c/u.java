/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.u$1
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.util.concurrent.TimeUnit
 */
package c;

import c.u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class u {
    public static final u c = new 1();
    private boolean a;
    private long b;
    private long d;

    public u a(long l2) {
        this.a = true;
        this.b = l2;
        return this;
    }

    public u a(long l2, TimeUnit timeUnit) {
        if (l2 >= 0L) {
            if (timeUnit != null) {
                this.d = timeUnit.toNanos(l2);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("timeout < 0: ");
        stringBuilder.append(l2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public long d() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public u f() {
        this.a = false;
        return this;
    }

    public void g() throws IOException {
        if (!Thread.interrupted()) {
            if (this.a) {
                if (this.b - System.nanoTime() > 0L) {
                    return;
                }
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("thread interrupted");
    }

    public long s_() {
        return this.d;
    }

    public boolean t_() {
        return this.a;
    }

    public u u_() {
        this.d = 0L;
        return this;
    }
}

