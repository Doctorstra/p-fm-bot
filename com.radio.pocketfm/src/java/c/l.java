/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c
 *  java.io.EOFException
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.zip.DataFormatException
 *  java.util.zip.Inflater
 */
package c;

import c.c;
import c.e;
import c.m;
import c.p;
import c.q;
import c.t;
import c.u;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class l
implements t {
    private final e a;
    private final Inflater b;
    private int c;
    private boolean d;

    l(e e2, Inflater inflater) {
        if (e2 != null) {
            if (inflater != null) {
                this.a = e2;
                this.b = inflater;
                return;
            }
            throw new IllegalArgumentException("inflater == null");
        }
        throw new IllegalArgumentException("source == null");
    }

    public l(t t2, Inflater inflater) {
        this(m.a(t2), inflater);
    }

    private void c() throws IOException {
        int n2 = this.c;
        if (n2 == 0) {
            return;
        }
        int n3 = n2 - this.b.getRemaining();
        this.c -= n3;
        this.a.h(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long a(c c2, long l2) throws IOException {
        boolean bl2;
        if (l2 < 0L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(l2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (l2 == 0L) {
            return 0L;
        }
        do {
            bl2 = this.b();
            try {
                p p2 = c2.e(1);
                int n2 = (int)Math.min((long)l2, (long)(8192 - p2.c));
                int n3 = this.b.inflate(p2.a, p2.c, n2);
                if (n3 > 0) {
                    p2.c = n3 + p2.c;
                    long l3 = c2.b;
                    long l4 = n3;
                    c2.b = l3 + l4;
                    return l4;
                }
                if (this.b.finished() || this.b.needsDictionary()) {
                    this.c();
                    if (p2.b == p2.c) {
                        c2.a = p2.b();
                        q.a(p2);
                    }
                    return -1L;
                }
            }
            catch (DataFormatException dataFormatException) {
                throw new IOException((Throwable)dataFormatException);
            }
        } while (!bl2);
        throw new EOFException("source exhausted prematurely");
    }

    @Override
    public u a() {
        return this.a.a();
    }

    public boolean b() throws IOException {
        if (!this.b.needsInput()) {
            return false;
        }
        this.c();
        if (this.b.getRemaining() == 0) {
            if (this.a.g()) {
                return true;
            }
            p p2 = this.a.c().a;
            this.c = p2.c - p2.b;
            this.b.setInput(p2.a, p2.b, this.c);
            return false;
        }
        throw new IllegalStateException("?");
    }

    @Override
    public void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}

