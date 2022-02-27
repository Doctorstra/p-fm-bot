/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c
 *  java.io.EOFException
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.zip.CRC32
 *  java.util.zip.Inflater
 */
package c;

import c.c;
import c.e;
import c.l;
import c.m;
import c.p;
import c.t;
import c.u;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class k
implements t {
    private int a = 0;
    private final e b;
    private final Inflater c;
    private final l d;
    private final CRC32 e = new CRC32();

    public k(t t2) {
        if (t2 != null) {
            this.c = new Inflater(true);
            this.b = m.a(t2);
            this.d = new l(this.b, this.c);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a(c c2, long l2, long l3) {
        p p2 = c2.a;
        while (l2 >= (long)(p2.c - p2.b)) {
            l2 -= (long)(p2.c - p2.b);
            p2 = p2.f;
        }
        while (l3 > 0L) {
            int n2 = (int)(l2 + (long)p2.b);
            int n3 = (int)Math.min((long)(p2.c - n2), (long)l3);
            this.e.update(p2.a, n2, n3);
            l3 -= (long)n3;
            p2 = p2.f;
            l2 = 0L;
        }
    }

    private void a(String string2, int n2, int n3) throws IOException {
        if (n3 == n2) {
            return;
        }
        Object[] arrobject = new Object[]{string2, n3, n2};
        throw new IOException(String.format((String)"%s: actual 0x%08x != expected 0x%08x", (Object[])arrobject));
    }

    private void b() throws IOException {
        this.b.a(10L);
        byte by = this.b.c().b(3L);
        boolean bl2 = (1 & by >> 1) == 1;
        if (bl2) {
            this.a(this.b.c(), 0L, 10L);
        }
        this.a("ID1ID2", 8075, this.b.k());
        this.b.h(8L);
        if ((1 & by >> 2) == 1) {
            this.b.a(2L);
            if (bl2) {
                this.a(this.b.c(), 0L, 2L);
            }
            short s2 = this.b.c().m();
            e e2 = this.b;
            long l2 = s2;
            e2.a(l2);
            if (bl2) {
                this.a(this.b.c(), 0L, l2);
            }
            this.b.h(l2);
        }
        if ((1 & by >> 3) == 1) {
            long l3 = this.b.a((byte)0);
            if (l3 != -1L) {
                if (bl2) {
                    this.a(this.b.c(), 0L, l3 + 1L);
                }
                this.b.h(l3 + 1L);
            } else {
                throw new EOFException();
            }
        }
        if ((1 & by >> 4) == 1) {
            long l4 = this.b.a((byte)0);
            if (l4 != -1L) {
                if (bl2) {
                    this.a(this.b.c(), 0L, l4 + 1L);
                }
                this.b.h(l4 + 1L);
            } else {
                throw new EOFException();
            }
        }
        if (bl2) {
            this.a("FHCRC", this.b.m(), (short)this.e.getValue());
            this.e.reset();
        }
    }

    private void c() throws IOException {
        this.a("CRC", this.b.n(), (int)this.e.getValue());
        this.a("ISIZE", this.b.n(), (int)this.c.getBytesWritten());
    }

    @Override
    public long a(c c2, long l2) throws IOException {
        if (l2 >= 0L) {
            if (l2 == 0L) {
                return 0L;
            }
            if (this.a == 0) {
                this.b();
                this.a = 1;
            }
            if (this.a == 1) {
                long l3 = c2.b;
                long l4 = this.d.a(c2, l2);
                if (l4 != -1L) {
                    this.a(c2, l3, l4);
                    return l4;
                }
                this.a = 2;
            }
            if (this.a == 2) {
                this.c();
                this.a = 3;
                if (this.b.g()) {
                    return -1L;
                }
                throw new IOException("gzip finished without exhausting source");
            }
            return -1L;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount < 0: ");
        stringBuilder.append(l2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public u a() {
        return this.b.a();
    }

    @Override
    public void close() throws IOException {
        this.d.close();
    }
}

