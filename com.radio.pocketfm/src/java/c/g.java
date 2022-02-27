/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.zip.Deflater
 */
package c;

import c.c;
import c.d;
import c.m;
import c.p;
import c.q;
import c.s;
import c.u;
import c.v;
import java.io.IOException;
import java.util.zip.Deflater;

public final class g
implements s {
    private final d a;
    private final Deflater b;
    private boolean c;

    g(d d2, Deflater deflater) {
        if (d2 != null) {
            if (deflater != null) {
                this.a = d2;
                this.b = deflater;
                return;
            }
            throw new IllegalArgumentException("inflater == null");
        }
        throw new IllegalArgumentException("source == null");
    }

    public g(s s2, Deflater deflater) {
        this(m.a(s2), deflater);
    }

    private void a(boolean bl2) throws IOException {
        p p2;
        c c2 = this.a.c();
        do {
            p2 = c2.e(1);
            int n2 = bl2 ? this.b.deflate(p2.a, p2.c, 8192 - p2.c, 2) : this.b.deflate(p2.a, p2.c, 8192 - p2.c);
            if (n2 > 0) {
                p2.c = n2 + p2.c;
                c2.b += (long)n2;
                this.a.x();
                continue;
            }
            if (this.b.needsInput()) break;
        } while (true);
        if (p2.b == p2.c) {
            c2.a = p2.b();
            q.a(p2);
        }
    }

    @Override
    public u a() {
        return this.a.a();
    }

    @Override
    public void a_(c c2, long l2) throws IOException {
        v.a(c2.b, 0L, l2);
        while (l2 > 0L) {
            p p2 = c2.a;
            int n2 = (int)Math.min((long)l2, (long)(p2.c - p2.b));
            this.b.setInput(p2.a, p2.b, n2);
            this.a(false);
            long l3 = c2.b;
            long l4 = n2;
            c2.b = l3 - l4;
            p2.b = n2 + p2.b;
            if (p2.b == p2.c) {
                c2.a = p2.b();
                q.a(p2);
            }
            l2 -= l4;
        }
    }

    void b() throws IOException {
        this.b.finish();
        this.a(false);
    }

    @Override
    public void close() throws IOException {
        Throwable throwable;
        block9 : {
            block8 : {
                if (this.c) {
                    return;
                }
                try {
                    this.b();
                    throwable = null;
                }
                catch (Throwable throwable2) {
                    // empty catch block
                }
                try {
                    this.b.end();
                }
                catch (Throwable throwable3) {
                    if (throwable != null) break block8;
                    throwable = throwable3;
                }
            }
            try {
                this.a.close();
            }
            catch (Throwable throwable4) {
                if (throwable != null) break block9;
                throwable = throwable4;
            }
        }
        this.c = true;
        if (throwable != null) {
            v.a(throwable);
        }
    }

    @Override
    public void flush() throws IOException {
        this.a(true);
        this.a.flush();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeflaterSink(");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

