/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.System
 */
package c;

import c.q;

final class p {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    p f;
    p g;

    p() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    p(byte[] arrby, int n2, int n3, boolean bl, boolean bl2) {
        this.a = arrby;
        this.b = n2;
        this.c = n3;
        this.d = bl;
        this.e = bl2;
    }

    p a() {
        this.d = true;
        p p2 = new p(this.a, this.b, this.c, true, false);
        return p2;
    }

    public p a(int n2) {
        if (n2 > 0 && n2 <= this.c - this.b) {
            p p2;
            if (n2 >= 1024) {
                p2 = this.a();
            } else {
                p2 = q.a();
                System.arraycopy((Object)this.a, (int)this.b, (Object)p2.a, (int)0, (int)n2);
            }
            p2.c = n2 + p2.b;
            this.b = n2 + this.b;
            this.g.a(p2);
            return p2;
        }
        throw new IllegalArgumentException();
    }

    public p a(p p2) {
        p2.g = this;
        p2.f = this.f;
        this.f.g = p2;
        this.f = p2;
        return p2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(p p2, int n2) {
        if (!p2.e) throw new IllegalArgumentException();
        int n3 = p2.c;
        if (n3 + n2 > 8192) {
            if (p2.d) throw new IllegalArgumentException();
            int n4 = n3 + n2;
            int n5 = p2.b;
            if (n4 - n5 > 8192) throw new IllegalArgumentException();
            byte[] arrby = p2.a;
            System.arraycopy((Object)arrby, (int)n5, (Object)arrby, (int)0, (int)(n3 - n5));
            p2.c -= p2.b;
            p2.b = 0;
        }
        System.arraycopy((Object)this.a, (int)this.b, (Object)p2.a, (int)p2.c, (int)n2);
        p2.c = n2 + p2.c;
        this.b = n2 + this.b;
    }

    public p b() {
        p p2 = this.f;
        if (p2 == this) {
            p2 = null;
        }
        p p3 = this.g;
        p3.f = this.f;
        this.f.g = p3;
        this.f = null;
        this.g = null;
        return p2;
    }

    public void c() {
        p p2 = this.g;
        if (p2 != this) {
            if (!p2.e) {
                return;
            }
            int n2 = this.c - this.b;
            int n3 = 8192 - p2.c;
            int n4 = p2.d ? 0 : p2.b;
            if (n2 > n3 + n4) {
                return;
            }
            this.a(this.g, n2);
            this.b();
            q.a(this);
            return;
        }
        throw new IllegalStateException();
    }
}

