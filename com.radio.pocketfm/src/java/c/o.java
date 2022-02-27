/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 */
package c;

import c.c;
import c.e;
import c.f;
import c.o;
import c.s;
import c.t;
import c.u;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

final class o
implements e {
    public final c a = new c();
    public final t b;
    boolean c;

    o(t t2) {
        if (t2 != null) {
            this.b = t2;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override
    public long a(byte by) throws IOException {
        return this.a(by, 0L, Long.MAX_VALUE);
    }

    public long a(byte by, long l2, long l3) throws IOException {
        if (!this.c) {
            if (l2 >= 0L && l3 >= l2) {
                while (l2 < l3) {
                    long l4 = this.a.a(by, l2, l3);
                    if (l4 != -1L) {
                        return l4;
                    }
                    long l5 = this.a.b;
                    if (l5 >= l3) break;
                    if (this.b.a(this.a, 8192L) == -1L) {
                        return -1L;
                    }
                    l2 = Math.max((long)l2, (long)l5);
                }
                return -1L;
            }
            Object[] arrobject = new Object[]{l2, l3};
            throw new IllegalArgumentException(String.format((String)"fromIndex=%s toIndex=%s", (Object[])arrobject));
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public long a(c c2, long l2) throws IOException {
        if (c2 != null) {
            if (l2 >= 0L) {
                if (!this.c) {
                    if (this.a.b == 0L && this.b.a(this.a, 8192L) == -1L) {
                        return -1L;
                    }
                    long l3 = Math.min((long)l2, (long)this.a.b);
                    return this.a.a(c2, l3);
                }
                throw new IllegalStateException("closed");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(l2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override
    public long a(s s2) throws IOException {
        if (s2 != null) {
            long l2 = 0L;
            while (this.b.a(this.a, 8192L) != -1L) {
                long l3 = this.a.i();
                if (l3 <= 0L) continue;
                l2 += l3;
                s2.a_(this.a, l3);
            }
            if (this.a.b() > 0L) {
                l2 += this.a.b();
                c c2 = this.a;
                s2.a_(c2, c2.b());
            }
            return l2;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override
    public u a() {
        return this.b.a();
    }

    @Override
    public String a(Charset charset) throws IOException {
        if (charset != null) {
            this.a.a(this.b);
            return this.a.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override
    public void a(long l2) throws IOException {
        if (this.b(l2)) {
            return;
        }
        throw new EOFException();
    }

    @Override
    public void a(byte[] arrby) throws IOException {
        try {
            this.a(arrby.length);
        }
        catch (EOFException eOFException) {
            int n2 = 0;
            while (this.a.b > 0L) {
                c c2 = this.a;
                int n3 = c2.a(arrby, n2, (int)c2.b);
                if (n3 != -1) {
                    n2 += n3;
                    continue;
                }
                throw new AssertionError();
            }
            throw eOFException;
        }
        this.a.a(arrby);
    }

    @Override
    public boolean a(long l2, f f2) throws IOException {
        return this.a(l2, f2, 0, f2.h());
    }

    public boolean a(long l2, f f2, int n2, int n3) throws IOException {
        if (!this.c) {
            if (l2 >= 0L && n2 >= 0 && n3 >= 0) {
                if (f2.h() - n2 < n3) {
                    return false;
                }
                for (int i2 = 0; i2 < n3; ++i2) {
                    long l3 = l2 + (long)i2;
                    if (!this.b(1L + l3)) {
                        return false;
                    }
                    if (this.a.b(l3) == f2.a(n2 + i2)) continue;
                    return false;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    public boolean b(long l2) throws IOException {
        if (l2 >= 0L) {
            if (!this.c) {
                while (this.a.b < l2) {
                    if (this.b.a(this.a, 8192L) != -1L) continue;
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("closed");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount < 0: ");
        stringBuilder.append(l2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public c c() {
        return this.a;
    }

    @Override
    public f c(long l2) throws IOException {
        this.a(l2);
        return this.a.c(l2);
    }

    @Override
    public void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.u();
    }

    @Override
    public String e(long l2) throws IOException {
        if (l2 >= 0L) {
            long l3 = l2 == Long.MAX_VALUE ? Long.MAX_VALUE : l2 + 1L;
            long l4 = this.a((byte)10, 0L, l3);
            if (l4 != -1L) {
                return this.a.f(l4);
            }
            if (l3 < Long.MAX_VALUE && this.b(l3) && this.a.b(l3 - 1L) == 13 && this.b(1L + l3) && this.a.b(l3) == 10) {
                return this.a.f(l3);
            }
            c c2 = new c();
            c c3 = this.a;
            c3.a(c2, 0L, Math.min((long)32L, (long)c3.b()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\\n not found: limit=");
            stringBuilder.append(Math.min((long)this.a.b(), (long)l2));
            stringBuilder.append(" content=");
            stringBuilder.append(c2.q().f());
            stringBuilder.append('\u2026');
            throw new EOFException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("limit < 0: ");
        stringBuilder.append(l2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public boolean g() throws IOException {
        if (!this.c) {
            return this.a.g() && this.b.a(this.a, 8192L) == -1L;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public byte[] g(long l2) throws IOException {
        this.a(l2);
        return this.a.g(l2);
    }

    @Override
    public InputStream h() {
        return new InputStream(this){
            final /* synthetic */ o a;
            {
                this.a = o2;
            }

            public int available() throws IOException {
                if (!this.a.c) {
                    return (int)Math.min((long)this.a.a.b, (long)Integer.MAX_VALUE);
                }
                throw new IOException("closed");
            }

            public void close() throws IOException {
                this.a.close();
            }

            public int read() throws IOException {
                if (!this.a.c) {
                    if (this.a.a.b == 0L && this.a.b.a(this.a.a, 8192L) == -1L) {
                        return -1;
                    }
                    return 255 & this.a.a.j();
                }
                throw new IOException("closed");
            }

            public int read(byte[] arrby, int n2, int n3) throws IOException {
                if (!this.a.c) {
                    c.v.a(arrby.length, n2, n3);
                    if (this.a.a.b == 0L && this.a.b.a(this.a.a, 8192L) == -1L) {
                        return -1;
                    }
                    return this.a.a.a(arrby, n2, n3);
                }
                throw new IOException("closed");
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)this.a);
                stringBuilder.append(".inputStream()");
                return stringBuilder.toString();
            }
        };
    }

    @Override
    public void h(long l2) throws IOException {
        if (!this.c) {
            while (l2 > 0L) {
                if (this.a.b == 0L && this.b.a(this.a, 8192L) == -1L) {
                    throw new EOFException();
                }
                long l3 = Math.min((long)l2, (long)this.a.b());
                this.a.h(l3);
                l2 -= l3;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return true ^ this.c;
    }

    @Override
    public byte j() throws IOException {
        this.a(1L);
        return this.a.j();
    }

    @Override
    public short k() throws IOException {
        this.a(2L);
        return this.a.k();
    }

    @Override
    public int l() throws IOException {
        this.a(4L);
        return this.a.l();
    }

    @Override
    public short m() throws IOException {
        this.a(2L);
        return this.a.m();
    }

    @Override
    public int n() throws IOException {
        this.a(4L);
        return this.a.n();
    }

    @Override
    public long o() throws IOException {
        int n2;
        this.a(1L);
        int n3 = 0;
        while (this.b(n2 = n3 + 1)) {
            byte by = this.a.b((long)n3);
            if (by >= 48 && by <= 57 || n3 == 0 && by == 45) {
                n3 = n2;
                continue;
            }
            if (n3 != 0) break;
            Object[] arrobject = new Object[]{by};
            throw new NumberFormatException(String.format((String)"Expected leading [0-9] or '-' character but was %#x", (Object[])arrobject));
        }
        return this.a.o();
    }

    @Override
    public long p() throws IOException {
        int n2;
        this.a(1L);
        int n3 = 0;
        while (this.b(n2 = n3 + 1)) {
            byte by = this.a.b((long)n3);
            if (by >= 48 && by <= 57 || by >= 97 && by <= 102 || by >= 65 && by <= 70) {
                n3 = n2;
                continue;
            }
            if (n3 != 0) break;
            Object[] arrobject = new Object[]{by};
            throw new NumberFormatException(String.format((String)"Expected leading [0-9a-fA-F] character but was %#x", (Object[])arrobject));
        }
        return this.a.p();
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        if (this.a.b == 0L && this.b.a(this.a, 8192L) == -1L) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    @Override
    public String s() throws IOException {
        return this.e(Long.MAX_VALUE);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("buffer(");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

