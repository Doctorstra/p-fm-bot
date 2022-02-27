/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.AssertionError
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.IllegalAccessError
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.ByteBuffer
 *  java.nio.channels.ByteChannel
 *  java.nio.charset.Charset
 */
package c;

import c.c;
import c.d;
import c.e;
import c.f;
import c.p;
import c.q;
import c.r;
import c.s;
import c.t;
import c.u;
import c.v;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class c
implements d,
e,
Cloneable,
ByteChannel {
    private static final byte[] c = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    p a;
    long b;

    public int a(byte[] arrby, int n2, int n3) {
        v.a(arrby.length, n2, n3);
        p p2 = this.a;
        if (p2 == null) {
            return -1;
        }
        int n4 = Math.min((int)n3, (int)(p2.c - p2.b));
        System.arraycopy((Object)p2.a, (int)p2.b, (Object)arrby, (int)n2, (int)n4);
        p2.b = n4 + p2.b;
        this.b -= (long)n4;
        if (p2.b == p2.c) {
            this.a = p2.b();
            q.a(p2);
        }
        return n4;
    }

    @Override
    public long a(byte by) {
        return this.a(by, 0L, Long.MAX_VALUE);
    }

    public long a(byte by, long l2, long l3) {
        long l4 = 0L;
        if (l2 >= l4 && l3 >= l2) {
            long l5 = this.b;
            if (l3 <= l5) {
                l5 = l3;
            }
            if (l2 == l5) {
                return -1L;
            }
            p p2 = this.a;
            if (p2 == null) {
                return -1L;
            }
            long l6 = this.b;
            if (l6 - l2 < l2) {
                while (l6 > l2) {
                    p2 = p2.g;
                    l6 -= (long)(p2.c - p2.b);
                }
            } else {
                do {
                    l6 = l4;
                    l4 = l6 + (long)(p2.c - p2.b);
                    if (l4 >= l2) break;
                    p2 = p2.f;
                } while (true);
            }
            long l7 = l2;
            while (l6 < l5) {
                byte[] arrby = p2.a;
                int n2 = (int)Math.min((long)p2.c, (long)(l5 + (long)p2.b - l6));
                for (int i2 = (int)(l7 + (long)p2.b - l6); i2 < n2; ++i2) {
                    if (arrby[i2] != by) continue;
                    return l6 + (long)(i2 - p2.b);
                }
                l7 = l6 + (long)(p2.c - p2.b);
                p2 = p2.f;
                l6 = l7;
            }
            return -1L;
        }
        Object[] arrobject = new Object[]{this.b, l2, l3};
        throw new IllegalArgumentException(String.format((String)"size=%s fromIndex=%s toIndex=%s", (Object[])arrobject));
    }

    @Override
    public long a(c c2, long l2) {
        if (c2 != null) {
            if (l2 >= 0L) {
                long l3 = this.b;
                if (l3 == 0L) {
                    return -1L;
                }
                if (l2 > l3) {
                    l2 = l3;
                }
                c2.a_(this, l2);
                return l2;
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
        long l2 = this.b;
        if (l2 > 0L) {
            s2.a_(this, l2);
        }
        return l2;
    }

    @Override
    public long a(t t2) throws IOException {
        if (t2 != null) {
            long l2;
            long l3 = 0L;
            while ((l2 = t2.a(this, 8192L)) != -1L) {
                l3 += l2;
            }
            return l3;
        }
        throw new IllegalArgumentException("source == null");
    }

    public c a(int n2) {
        if (n2 < 128) {
            this.b(n2);
            return this;
        }
        if (n2 < 2048) {
            this.b(192 | n2 >> 6);
            this.b(128 | n2 & 63);
            return this;
        }
        if (n2 < 65536) {
            if (n2 >= 55296 && n2 <= 57343) {
                this.b(63);
                return this;
            }
            this.b(224 | n2 >> 12);
            this.b(128 | 63 & n2 >> 6);
            this.b(128 | n2 & 63);
            return this;
        }
        if (n2 <= 1114111) {
            this.b(240 | n2 >> 18);
            this.b(128 | 63 & n2 >> 12);
            this.b(128 | 63 & n2 >> 6);
            this.b(128 | n2 & 63);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected code point: ");
        stringBuilder.append(Integer.toHexString((int)n2));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public c a(c c2, long l2, long l3) {
        if (c2 != null) {
            v.a(this.b, l2, l3);
            if (l3 == 0L) {
                return this;
            }
            c2.b = l3 + c2.b;
            p p2 = this.a;
            while (l2 >= (long)(p2.c - p2.b)) {
                l2 -= (long)(p2.c - p2.b);
                p2 = p2.f;
            }
            while (l3 > 0L) {
                p p3 = p2.a();
                p3.b = (int)(l2 + (long)p3.b);
                p3.c = Math.min((int)(p3.b + (int)l3), (int)p3.c);
                p p4 = c2.a;
                if (p4 == null) {
                    p3.g = p3;
                    p3.f = p3;
                    c2.a = p3;
                } else {
                    p4.g.a(p3);
                }
                l3 -= (long)(p3.c - p3.b);
                p2 = p2.f;
                l2 = 0L;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public c a(f f2) {
        if (f2 != null) {
            f2.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public c a(String string) {
        return this.a(string, 0, string.length());
    }

    /*
     * Enabled aggressive block sorting
     */
    public c a(String string, int n2, int n3) {
        if (string == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (n2 < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("beginIndex < 0: ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (n3 < n2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex < beginIndex: ");
            stringBuilder.append(n3);
            stringBuilder.append(" < ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (n3 > string.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex > string.length: ");
            stringBuilder.append(n3);
            stringBuilder.append(" > ");
            stringBuilder.append(string.length());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        while (n2 < n3) {
            p p2;
            int n4;
            int n5;
            char c2;
            int n6;
            char c3 = string.charAt(n2);
            if (c3 < '') {
                p2 = this.e(1);
                byte[] arrby = p2.a;
                n5 = p2.c - n2;
                n6 = Math.min((int)n3, (int)(8192 - n5));
                n4 = n2 + 1;
                arrby[n2 + n5] = (byte)c3;
            } else {
                if (c3 < '\u0800') {
                    this.b(192 | c3 >> 6);
                    this.b(128 | c3 & 63);
                } else {
                    if (c3 >= '\ud800' && c3 <= '\udfff') {
                        int n7 = n2 + 1;
                        char c4 = n7 < n3 ? string.charAt(n7) : (char)'\u0000';
                        if (c3 <= '\udbff' && c4 >= '\udc00' && c4 <= '\udfff') {
                            int n8 = 65536 + ((c3 & -55297) << 10 | -56321 & c4);
                            this.b(240 | n8 >> 18);
                            this.b(128 | 63 & n8 >> 12);
                            this.b(128 | 63 & n8 >> 6);
                            this.b(128 | n8 & 63);
                            n2 += 2;
                            continue;
                        }
                        this.b(63);
                        n2 = n7;
                        continue;
                    }
                    this.b(224 | c3 >> 12);
                    this.b(128 | 63 & c3 >> 6);
                    this.b(128 | c3 & 63);
                }
                ++n2;
                continue;
            }
            while (n4 < n6 && (c2 = string.charAt(n4)) < '') {
                int n9 = n4 + 1;
                arrby[n4 + n5] = (byte)c2;
                n4 = n9;
            }
            int n10 = n5 + n4 - p2.c;
            p2.c = n10 + p2.c;
            this.b += (long)n10;
            n2 = n4;
        }
        return this;
    }

    public c a(String string, int n2, int n3, Charset charset) {
        if (string != null) {
            if (n2 >= 0) {
                if (n3 >= n2) {
                    if (n3 <= string.length()) {
                        if (charset != null) {
                            if (charset.equals((Object)v.a)) {
                                return this.a(string, n2, n3);
                            }
                            byte[] arrby = string.substring(n2, n3).getBytes(charset);
                            return this.b(arrby, 0, arrby.length);
                        }
                        throw new IllegalArgumentException("charset == null");
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("endIndex > string.length: ");
                    stringBuilder.append(n3);
                    stringBuilder.append(" > ");
                    stringBuilder.append(string.length());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("endIndex < beginIndex: ");
                stringBuilder.append(n3);
                stringBuilder.append(" < ");
                stringBuilder.append(n2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("beginIndex < 0: ");
            stringBuilder.append(n2);
            throw new IllegalAccessError(stringBuilder.toString());
        }
        throw new IllegalArgumentException("string == null");
    }

    @Override
    public u a() {
        return u.c;
    }

    public String a(long l2, Charset charset) throws EOFException {
        v.a(this.b, 0L, l2);
        if (charset != null) {
            if (l2 <= Integer.MAX_VALUE) {
                if (l2 == 0L) {
                    return "";
                }
                p p2 = this.a;
                if (l2 + (long)p2.b > (long)p2.c) {
                    return new String(this.g(l2), charset);
                }
                String string = new String(p2.a, p2.b, (int)l2, charset);
                p2.b = (int)(l2 + (long)p2.b);
                this.b -= l2;
                if (p2.b == p2.c) {
                    this.a = p2.b();
                    q.a(p2);
                }
                return string;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
            stringBuilder.append(l2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override
    public String a(Charset charset) {
        try {
            String string = this.a(this.b, charset);
            return string;
        }
        catch (EOFException eOFException) {
            throw new AssertionError((Object)eOFException);
        }
    }

    @Override
    public void a(long l2) throws EOFException {
        if (this.b >= l2) {
            return;
        }
        throw new EOFException();
    }

    @Override
    public void a(byte[] arrby) throws EOFException {
        int n2;
        for (int i2 = 0; i2 < arrby.length; i2 += n2) {
            n2 = this.a(arrby, i2, arrby.length - i2);
            if (n2 != -1) {
                continue;
            }
            throw new EOFException();
        }
    }

    @Override
    public boolean a(long l2, f f2) {
        return this.a(l2, f2, 0, f2.h());
    }

    public boolean a(long l2, f f2, int n2, int n3) {
        if (l2 >= 0L && n2 >= 0 && n3 >= 0 && this.b - l2 >= (long)n3) {
            if (f2.h() - n2 < n3) {
                return false;
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                if (this.b(l2 + (long)i2) == f2.a(n2 + i2)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void a_(c c2, long l2) {
        if (c2 != null) {
            if (c2 != this) {
                v.a(c2.b, 0L, l2);
                while (l2 > 0L) {
                    if (l2 < (long)(c2.a.c - c2.a.b)) {
                        int n2;
                        long l3;
                        p p2 = this.a;
                        p p3 = p2 != null ? p2.g : null;
                        if (p3 != null && p3.e && (l3 = l2 + (long)p3.c) - (long)(n2 = p3.d ? 0 : p3.b) <= 8192L) {
                            c2.a.a(p3, (int)l2);
                            c2.b -= l2;
                            this.b = l2 + this.b;
                            return;
                        }
                        c2.a = c2.a.a((int)l2);
                    }
                    p p4 = c2.a;
                    long l4 = p4.c - p4.b;
                    c2.a = p4.b();
                    p p5 = this.a;
                    if (p5 == null) {
                        p p6;
                        p6.g = p6 = (this.a = p4);
                        p6.f = p6;
                    } else {
                        p5.g.a(p4).c();
                    }
                    c2.b -= l4;
                    this.b = l4 + this.b;
                    l2 -= l4;
                }
                return;
            }
            throw new IllegalArgumentException("source == this");
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte b(long l2) {
        v.a(this.b, l2, 1L);
        long l3 = this.b;
        if (l3 - l2 > l2) {
            p p2 = this.a;
            do {
                long l4;
                if (l2 < (l4 = (long)(p2.c - p2.b))) {
                    return p2.a[p2.b + (int)l2];
                }
                l2 -= l4;
                p2 = p2.f;
            } while (true);
        }
        long l5 = l2 - l3;
        p p3 = this.a;
        do {
            p3 = p3.g;
        } while ((l5 += (long)(p3.c - p3.b)) < 0L);
        return p3.a[p3.b + (int)l5];
    }

    public long b() {
        return this.b;
    }

    public c b(int n2) {
        p p2 = this.e(1);
        byte[] arrby = p2.a;
        int n3 = p2.c;
        p2.c = n3 + 1;
        arrby[n3] = (byte)n2;
        this.b = 1L + this.b;
        return this;
    }

    public c b(byte[] arrby) {
        if (arrby != null) {
            return this.b(arrby, 0, arrby.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public c b(byte[] arrby, int n2, int n3) {
        if (arrby != null) {
            long l2 = arrby.length;
            long l3 = n2;
            long l4 = n3;
            v.a(l2, l3, l4);
            int n4 = n3 + n2;
            while (n2 < n4) {
                p p2 = this.e(1);
                int n5 = Math.min((int)(n4 - n2), (int)(8192 - p2.c));
                System.arraycopy((Object)arrby, (int)n2, (Object)p2.a, (int)p2.c, (int)n5);
                n2 += n5;
                p2.c = n5 + p2.c;
            }
            this.b = l4 + this.b;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override
    public /* synthetic */ d b(f f2) throws IOException {
        return this.a(f2);
    }

    @Override
    public /* synthetic */ d b(String string) throws IOException {
        return this.a(string);
    }

    @Override
    public c c() {
        return this;
    }

    public c c(int n2) {
        p p2 = this.e(2);
        byte[] arrby = p2.a;
        int n3 = p2.c;
        int n4 = n3 + 1;
        arrby[n3] = (byte)(255 & n2 >>> 8);
        int n5 = n4 + 1;
        arrby[n4] = (byte)(n2 & 255);
        p2.c = n5;
        this.b = 2L + this.b;
        return this;
    }

    @Override
    public /* synthetic */ d c(byte[] arrby) throws IOException {
        return this.b(arrby);
    }

    @Override
    public /* synthetic */ d c(byte[] arrby, int n2, int n3) throws IOException {
        return this.b(arrby, n2, n3);
    }

    @Override
    public f c(long l2) throws EOFException {
        return new f(this.g(l2));
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.v();
    }

    @Override
    public void close() {
    }

    public c d(int n2) {
        p p2 = this.e(4);
        byte[] arrby = p2.a;
        int n3 = p2.c;
        int n4 = n3 + 1;
        arrby[n3] = (byte)(255 & n2 >>> 24);
        int n5 = n4 + 1;
        arrby[n4] = (byte)(255 & n2 >>> 16);
        int n6 = n5 + 1;
        arrby[n5] = (byte)(255 & n2 >>> 8);
        int n7 = n6 + 1;
        arrby[n6] = (byte)(n2 & 255);
        p2.c = n7;
        this.b = 4L + this.b;
        return this;
    }

    public OutputStream d() {
        return new OutputStream(this){
            final /* synthetic */ c a;
            {
                this.a = c2;
            }

            public void close() {
            }

            public void flush() {
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)this.a);
                stringBuilder.append(".outputStream()");
                return stringBuilder.toString();
            }

            public void write(int n2) {
                this.a.b((byte)n2);
            }

            public void write(byte[] arrby, int n2, int n3) {
                this.a.b(arrby, n2, n3);
            }
        };
    }

    public String d(long l2) throws EOFException {
        return this.a(l2, v.a);
    }

    public c e() {
        return this;
    }

    p e(int n2) {
        if (n2 >= 1 && n2 <= 8192) {
            p p2 = this.a;
            if (p2 == null) {
                p p3;
                p3.g = p3 = (this.a = q.a());
                p3.f = p3;
                return p3;
            }
            p p4 = p2.g;
            if (n2 + p4.c > 8192 || !p4.e) {
                p4 = p4.a(q.a());
            }
            return p4;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String e(long l2) throws EOFException {
        if (l2 >= 0L) {
            long l3 = Long.MAX_VALUE;
            if (l2 != l3) {
                l3 = l2 + 1L;
            }
            long l4 = this.a((byte)10, 0L, l3);
            if (l4 != -1L) {
                return this.f(l4);
            }
            if (l3 < this.b() && this.b(l3 - 1L) == 13 && this.b(l3) == 10) {
                return this.f(l3);
            }
            c c2 = new c();
            this.a(c2, 0L, Math.min((long)32L, (long)this.b()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\\n not found: limit=");
            stringBuilder.append(Math.min((long)this.b(), (long)l2));
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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        c c2 = (c)object;
        long l2 = this.b;
        if (l2 != c2.b) {
            return false;
        }
        long l3 = 0L;
        if (l2 == l3) {
            return true;
        }
        p p2 = this.a;
        p p3 = c2.a;
        int n2 = p2.b;
        int n3 = p3.b;
        while (l3 < this.b) {
            long l4 = Math.min((int)(p2.c - n2), (int)(p3.c - n3));
            int n4 = n3;
            int n5 = n2;
            int n6 = 0;
            while ((long)n6 < l4) {
                byte[] arrby = p2.a;
                int n7 = n5 + 1;
                byte by = arrby[n5];
                byte[] arrby2 = p3.a;
                int n8 = n4 + 1;
                if (by != arrby2[n4]) {
                    return false;
                }
                ++n6;
                n5 = n7;
                n4 = n8;
            }
            if (n5 == p2.c) {
                p2 = p2.f;
                n2 = p2.b;
            } else {
                n2 = n5;
            }
            if (n4 == p3.c) {
                p3 = p3.f;
                n3 = p3.b;
            } else {
                n3 = n4;
            }
            l3 += l4;
        }
        return true;
    }

    @Override
    public d f() {
        return this;
    }

    public f f(int n2) {
        if (n2 == 0) {
            return f.b;
        }
        return new r(this, n2);
    }

    String f(long l2) throws EOFException {
        long l3;
        if (l2 > 0L && this.b(l3 = l2 - 1L) == 13) {
            String string = this.d(l3);
            this.h(2L);
            return string;
        }
        String string = this.d(l2);
        this.h(1L);
        return string;
    }

    @Override
    public void flush() {
    }

    @Override
    public /* synthetic */ d g(int n2) throws IOException {
        return this.d(n2);
    }

    @Override
    public boolean g() {
        return this.b == 0L;
    }

    @Override
    public byte[] g(long l2) throws EOFException {
        v.a(this.b, 0L, l2);
        if (l2 <= Integer.MAX_VALUE) {
            byte[] arrby = new byte[(int)l2];
            this.a(arrby);
            return arrby;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
        stringBuilder.append(l2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public /* synthetic */ d h(int n2) throws IOException {
        return this.c(n2);
    }

    @Override
    public InputStream h() {
        return new InputStream(this){
            final /* synthetic */ c a;
            {
                this.a = c2;
            }

            public int available() {
                return (int)Math.min((long)this.a.b, (long)Integer.MAX_VALUE);
            }

            public void close() {
            }

            public int read() {
                if (this.a.b > 0L) {
                    return 255 & this.a.j();
                }
                return -1;
            }

            public int read(byte[] arrby, int n2, int n3) {
                return this.a.a(arrby, n2, n3);
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
    public void h(long l2) throws EOFException {
        while (l2 > 0L) {
            p p2 = this.a;
            if (p2 != null) {
                int n2 = (int)Math.min((long)l2, (long)(p2.c - this.a.b));
                long l3 = this.b;
                long l4 = n2;
                this.b = l3 - l4;
                l2 -= l4;
                p p3 = this.a;
                p3.b = n2 + p3.b;
                if (this.a.b != this.a.c) continue;
                p p4 = this.a;
                this.a = p4.b();
                q.a(p4);
                continue;
            }
            throw new EOFException();
        }
    }

    public int hashCode() {
        p p2 = this.a;
        if (p2 == null) {
            return 0;
        }
        int n2 = 1;
        do {
            int n3 = p2.c;
            for (int i2 = p2.b; i2 < n3; ++i2) {
                n2 = n2 * 31 + p2.a[i2];
            }
        } while ((p2 = p2.f) != this.a);
        return n2;
    }

    public long i() {
        long l2 = this.b;
        if (l2 == 0L) {
            return 0L;
        }
        p p2 = this.a.g;
        if (p2.c < 8192 && p2.e) {
            l2 -= (long)(p2.c - p2.b);
        }
        return l2;
    }

    public c i(long l2) {
        if (l2 == 0L) {
            return this.b(48);
        }
        int n2 = 1;
        long l3 = l2 LCMP 0L;
        boolean bl = false;
        if (l3 < 0) {
            if ((l2 = -l2) < 0L) {
                return this.a("-9223372036854775808");
            }
            bl = true;
        }
        if (l2 < 100000000L) {
            if (l2 < 10000L) {
                if (l2 < 100L) {
                    if (l2 >= 10L) {
                        n2 = 2;
                    }
                } else {
                    n2 = l2 < 1000L ? 3 : 4;
                }
            } else {
                n2 = l2 < 1000000L ? (l2 < 100000L ? 5 : 6) : (l2 < 10000000L ? 7 : 8);
            }
        } else {
            n2 = l2 < 1000000000000L ? (l2 < 10000000000L ? (l2 < 1000000000L ? 9 : 10) : (l2 < 100000000000L ? 11 : 12)) : (l2 < 1000000000000000L ? (l2 < 10000000000000L ? 13 : (l2 < 100000000000000L ? 14 : 15)) : (l2 < 100000000000000000L ? (l2 < 10000000000000000L ? 16 : 17) : (l2 < 1000000000000000000L ? 18 : 19)));
        }
        if (bl) {
            ++n2;
        }
        p p2 = this.e(n2);
        byte[] arrby = p2.a;
        int n3 = n2 + p2.c;
        while (l2 != 0L) {
            int n4 = (int)(l2 % 10L);
            arrby[--n3] = c[n4];
            l2 /= 10L;
        }
        if (bl) {
            arrby[n3 - 1] = 45;
        }
        p2.c = n2 + p2.c;
        this.b += (long)n2;
        return this;
    }

    @Override
    public /* synthetic */ d i(int n2) throws IOException {
        return this.b(n2);
    }

    public boolean isOpen() {
        return true;
    }

    @Override
    public byte j() {
        if (this.b != 0L) {
            p p2 = this.a;
            int n2 = p2.b;
            int n3 = p2.c;
            byte[] arrby = p2.a;
            int n4 = n2 + 1;
            byte by = arrby[n2];
            --this.b;
            if (n4 == n3) {
                this.a = p2.b();
                q.a(p2);
                return by;
            }
            p2.b = n4;
            return by;
        }
        throw new IllegalStateException("size == 0");
    }

    public c j(long l2) {
        if (l2 == 0L) {
            return this.b(48);
        }
        int n2 = 1 + Long.numberOfTrailingZeros((long)Long.highestOneBit((long)l2)) / 4;
        p p2 = this.e(n2);
        byte[] arrby = p2.a;
        int n3 = p2.c;
        for (int i2 = -1 + (n2 + p2.c); i2 >= n3; --i2) {
            arrby[i2] = c[(int)(15L & l2)];
            l2 >>>= 4;
        }
        p2.c = n2 + p2.c;
        this.b += (long)n2;
        return this;
    }

    @Override
    public /* synthetic */ d k(long l2) throws IOException {
        return this.j(l2);
    }

    @Override
    public short k() {
        if (this.b >= 2L) {
            p p2 = this.a;
            int n2 = p2.c;
            int n3 = p2.b;
            if (n2 - n3 < 2) {
                return (short)((255 & this.j()) << 8 | 255 & this.j());
            }
            byte[] arrby = p2.a;
            int n4 = n3 + 1;
            int n5 = (255 & arrby[n3]) << 8;
            int n6 = n4 + 1;
            int n7 = n5 | 255 & arrby[n4];
            this.b -= 2L;
            if (n6 == n2) {
                this.a = p2.b();
                q.a(p2);
            } else {
                p2.b = n6;
            }
            return (short)n7;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size < 2: ");
        stringBuilder.append(this.b);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public int l() {
        if (this.b >= 4L) {
            p p2 = this.a;
            int n2 = p2.c;
            int n3 = p2.b;
            if (n2 - n3 < 4) {
                return (255 & this.j()) << 24 | (255 & this.j()) << 16 | (255 & this.j()) << 8 | 255 & this.j();
            }
            byte[] arrby = p2.a;
            int n4 = n3 + 1;
            int n5 = (255 & arrby[n3]) << 24;
            int n6 = n4 + 1;
            int n7 = n5 | (255 & arrby[n4]) << 16;
            int n8 = n6 + 1;
            int n9 = n7 | (255 & arrby[n6]) << 8;
            int n10 = n8 + 1;
            int n11 = n9 | 255 & arrby[n8];
            this.b -= 4L;
            if (n10 == n2) {
                this.a = p2.b();
                q.a(p2);
                return n11;
            }
            p2.b = n10;
            return n11;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size < 4: ");
        stringBuilder.append(this.b);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public /* synthetic */ d l(long l2) throws IOException {
        return this.i(l2);
    }

    @Override
    public short m() {
        return v.a(this.k());
    }

    @Override
    public int n() {
        return v.a(this.l());
    }

    @Override
    public long o() {
        block9 : {
            long l2 = this.b;
            long l3 = 0L;
            if (l2 == l3) break block9;
            int n2 = 0;
            long l4 = -7L;
            boolean bl = false;
            boolean bl2 = false;
            do {
                p p2 = this.a;
                byte[] arrby = p2.a;
                int n3 = p2.b;
                int n4 = p2.c;
                while (n3 < n4) {
                    byte by;
                    block13 : {
                        block12 : {
                            block10 : {
                                block11 : {
                                    by = arrby[n3];
                                    if (by < 48 || by > 57) break block10;
                                    int n5 = 48 - by;
                                    if (l3 < -922337203685477580L || l3 == -922337203685477580L && (long)n5 < l4) break block11;
                                    l3 = l3 * 10L + (long)n5;
                                    break block12;
                                }
                                c c2 = new c().i(l3).b(by);
                                if (!bl) {
                                    c2.j();
                                }
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Number too large: ");
                                stringBuilder.append(c2.r());
                                throw new NumberFormatException(stringBuilder.toString());
                            }
                            if (by != 45 || n2 != 0) break block13;
                            --l4;
                            bl = true;
                        }
                        ++n3;
                        ++n2;
                        continue;
                    }
                    if (n2 != 0) {
                        bl2 = true;
                        break;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected leading [0-9] or '-' character but was 0x");
                    stringBuilder.append(Integer.toHexString((int)by));
                    throw new NumberFormatException(stringBuilder.toString());
                }
                if (n3 == n4) {
                    this.a = p2.b();
                    q.a(p2);
                    continue;
                }
                p2.b = n3;
            } while (!bl2 && this.a != null);
            this.b -= (long)n2;
            if (bl) {
                return l3;
            }
            return -l3;
        }
        throw new IllegalStateException("size == 0");
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public long p() {
        if (this.b == 0L) {
            throw new IllegalStateException("size == 0");
        }
        boolean bl = false;
        long l2 = 0L;
        int n2 = 0;
        do {
            int n3;
            p p2 = this.a;
            byte[] arrby = p2.a;
            int n4 = p2.c;
            for (n3 = p2.b; n3 < n4; ++n3, ++n2) {
                byte by;
                block13 : {
                    int n5;
                    block10 : {
                        int n6;
                        block12 : {
                            block11 : {
                                block9 : {
                                    by = arrby[n3];
                                    if (by < 48 || by > 57) break block9;
                                    n5 = by - 48;
                                    break block10;
                                }
                                if (by < 97 || by > 102) break block11;
                                n6 = by - 97;
                                break block12;
                            }
                            if (by < 65 || by > 70) break block13;
                            n6 = by - 65;
                        }
                        n5 = n6 + 10;
                    }
                    if ((-1152921504606846976L & l2) != 0L) {
                        c c2 = new c().j(l2).b(by);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Number too large: ");
                        stringBuilder.append(c2.r());
                        throw new NumberFormatException(stringBuilder.toString());
                    }
                    l2 = l2 << 4 | (long)n5;
                    continue;
                }
                if (n2 == 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected leading [0-9a-fA-F] character but was 0x");
                    stringBuilder.append(Integer.toHexString((int)by));
                    throw new NumberFormatException(stringBuilder.toString());
                }
                bl = true;
                break;
            }
            if (n3 == n4) {
                this.a = p2.b();
                q.a(p2);
                continue;
            }
            p2.b = n3;
        } while (!bl && this.a != null);
        this.b -= (long)n2;
        return l2;
    }

    public f q() {
        return new f(this.t());
    }

    public String r() {
        try {
            String string = this.a(this.b, v.a);
            return string;
        }
        catch (EOFException eOFException) {
            throw new AssertionError((Object)eOFException);
        }
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        p p2 = this.a;
        if (p2 == null) {
            return -1;
        }
        int n2 = Math.min((int)byteBuffer.remaining(), (int)(p2.c - p2.b));
        byteBuffer.put(p2.a, p2.b, n2);
        p2.b = n2 + p2.b;
        this.b -= (long)n2;
        if (p2.b == p2.c) {
            this.a = p2.b();
            q.a(p2);
        }
        return n2;
    }

    @Override
    public String s() throws EOFException {
        return this.e(Long.MAX_VALUE);
    }

    public byte[] t() {
        try {
            byte[] arrby = this.g(this.b);
            return arrby;
        }
        catch (EOFException eOFException) {
            throw new AssertionError((Object)eOFException);
        }
    }

    public String toString() {
        return this.w().toString();
    }

    public void u() {
        try {
            this.h(this.b);
            return;
        }
        catch (EOFException eOFException) {
            throw new AssertionError((Object)eOFException);
        }
    }

    public c v() {
        p p2;
        c c2 = new c();
        if (this.b == 0L) {
            return c2;
        }
        p2.g = p2 = (c2.a = this.a.a());
        p2.f = p2;
        p p3 = this.a;
        while ((p3 = p3.f) != this.a) {
            c2.a.g.a(p3.a());
        }
        c2.b = this.b;
        return c2;
    }

    public f w() {
        long l2 = this.b;
        if (l2 <= Integer.MAX_VALUE) {
            return this.f((int)l2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size > Integer.MAX_VALUE: ");
        stringBuilder.append(this.b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int n2;
            int n3;
            for (int i2 = n2 = byteBuffer.remaining(); i2 > 0; i2 -= n3) {
                p p2 = this.e(1);
                n3 = Math.min((int)i2, (int)(8192 - p2.c));
                byteBuffer.get(p2.a, p2.c, n3);
                p2.c = n3 + p2.c;
            }
            this.b += (long)n2;
            return n2;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override
    public /* synthetic */ d x() throws IOException {
        return this.e();
    }
}

