/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c
 *  java.lang.AssertionError
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Arrays
 */
package c;

import c.c;
import c.f;
import c.p;
import c.v;
import java.util.Arrays;

final class r
extends f {
    final transient byte[][] f;
    final transient int[] g;

    r(c c2, int n2) {
        super(null);
        v.a(c2.b, 0L, n2);
        p p2 = c2.a;
        int n3 = 0;
        p p3 = p2;
        int n4 = 0;
        int n5 = 0;
        while (n4 < n2) {
            if (p3.c != p3.b) {
                n4 += p3.c - p3.b;
                ++n5;
                p3 = p3.f;
                continue;
            }
            throw new AssertionError((Object)"s.limit == s.pos");
        }
        this.f = new byte[n5][];
        this.g = new int[n5 * 2];
        p p4 = c2.a;
        int n6 = 0;
        while (n3 < n2) {
            this.f[n6] = p4.a;
            if ((n3 += p4.c - p4.b) > n2) {
                n3 = n2;
            }
            int[] arrn = this.g;
            arrn[n6] = n3;
            arrn[n6 + this.f.length] = p4.b;
            p4.d = true;
            ++n6;
            p4 = p4.f;
        }
    }

    private int b(int n2) {
        int n3 = Arrays.binarySearch((int[])this.g, (int)0, (int)this.f.length, (int)(n2 + 1));
        if (n3 >= 0) {
            return n3;
        }
        return ~n3;
    }

    private f j() {
        return new f(this.i());
    }

    private Object writeReplace() {
        return this.j();
    }

    @Override
    public byte a(int n2) {
        v.a(this.g[-1 + this.f.length], n2, 1L);
        int n3 = this.b(n2);
        int n4 = n3 == 0 ? 0 : this.g[n3 - 1];
        int[] arrn = this.g;
        byte[][] arrby = this.f;
        int n5 = arrn[n3 + arrby.length];
        return arrby[n3][n5 + (n2 - n4)];
    }

    @Override
    public f a(int n2, int n3) {
        return this.j().a(n2, n3);
    }

    @Override
    public String a() {
        return this.j().a();
    }

    @Override
    void a(c c2) {
        int n2 = this.f.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int[] arrn = this.g;
            int n4 = arrn[n2 + i2];
            int n5 = arrn[i2];
            p p2 = new p(this.f[i2], n4, n4 + n5 - n3, true, false);
            if (c2.a == null) {
                p2.g = p2;
                p2.f = p2;
                c2.a = p2;
            } else {
                c2.a.g.a(p2);
            }
            n3 = n5;
        }
        c2.b += (long)n3;
    }

    @Override
    public boolean a(int n2, f f2, int n3, int n4) {
        if (n2 >= 0) {
            if (n2 > this.h() - n4) {
                return false;
            }
            int n5 = this.b(n2);
            while (n4 > 0) {
                int n6;
                byte[][] arrby = this.f;
                int[] arrn = this.g;
                int n7 = n5 == 0 ? 0 : this.g[n5 - 1];
                int n8 = arrn[n5 + arrby.length] + (n2 - n7);
                if (!f2.a(n3, arrby[n5], n8, n6 = Math.min((int)n4, (int)(n7 + (this.g[n5] - n7) - n2)))) {
                    return false;
                }
                n2 += n6;
                n3 += n6;
                n4 -= n6;
                ++n5;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(int n2, byte[] arrby, int n3, int n4) {
        if (n2 >= 0 && n2 <= this.h() - n4 && n3 >= 0) {
            if (n3 > arrby.length - n4) {
                return false;
            }
            int n5 = this.b(n2);
            while (n4 > 0) {
                int n6;
                byte[][] arrby2 = this.f;
                int[] arrn = this.g;
                int n7 = n5 == 0 ? 0 : this.g[n5 - 1];
                int n8 = arrn[n5 + arrby2.length] + (n2 - n7);
                if (!v.a(arrby2[n5], n8, arrby, n3, n6 = Math.min((int)n4, (int)(n7 + (this.g[n5] - n7) - n2)))) {
                    return false;
                }
                n2 += n6;
                n3 += n6;
                n4 -= n6;
                ++n5;
            }
            return true;
        }
        return false;
    }

    @Override
    public String b() {
        return this.j().b();
    }

    @Override
    public f c() {
        return this.j().c();
    }

    @Override
    public f d() {
        return this.j().d();
    }

    @Override
    public f e() {
        return this.j().e();
    }

    @Override
    public boolean equals(Object object) {
        f f2;
        if (object == this) {
            return true;
        }
        return object instanceof f && (f2 = (f)object).h() == this.h() && this.a(0, f2, 0, this.h());
    }

    @Override
    public String f() {
        return this.j().f();
    }

    @Override
    public f g() {
        return this.j().g();
    }

    @Override
    public int h() {
        return this.g[-1 + this.f.length];
    }

    @Override
    public int hashCode() {
        int n2 = this.d;
        if (n2 != 0) {
            return n2;
        }
        int n3 = this.f.length;
        int n4 = 1;
        int n5 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n6;
            byte[] arrby = this.f[i2];
            int[] arrn = this.g;
            int n7 = arrn[i2];
            int n8 = n6 + (n7 - n5);
            for (n6 = arrn[n3 + i2]; n6 < n8; ++n6) {
                n4 = n4 * 31 + arrby[n6];
            }
            n5 = n7;
        }
        this.d = n4;
        return n4;
    }

    @Override
    public byte[] i() {
        int[] arrn = this.g;
        byte[][] arrby = this.f;
        byte[] arrby2 = new byte[arrn[-1 + arrby.length]];
        int n2 = arrby.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int[] arrn2 = this.g;
            int n4 = arrn2[n2 + i2];
            int n5 = arrn2[i2];
            System.arraycopy((Object)this.f[i2], (int)n4, (Object)arrby2, (int)n3, (int)(n5 - n3));
            n3 = n5;
        }
        return arrby2;
    }

    @Override
    public String toString() {
        return this.j().toString();
    }
}

