/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.Path$Op
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.ListIterator
 */
package com.airbnb.lottie.a.a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.d;
import com.airbnb.lottie.a.a.j;
import com.airbnb.lottie.a.a.l;
import com.airbnb.lottie.a.a.m;
import com.airbnb.lottie.c.b.h;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class l
implements j,
m {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final String d;
    private final List<m> e = new ArrayList();
    private final h f;

    public l(h h2) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.d = h2.a();
            this.f = h2;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    private void a() {
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            this.c.addPath(((m)this.e.get(i2)).e());
        }
    }

    private void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int i2 = this.e.size() - 1; i2 >= 1; --i2) {
            m m2 = (m)this.e.get(i2);
            if (m2 instanceof d) {
                d d2 = (d)m2;
                List<m> list = d2.c();
                for (int i3 = list.size() - 1; i3 >= 0; --i3) {
                    Path path = ((m)list.get(i3)).e();
                    path.transform(d2.d());
                    this.b.addPath(path);
                }
                continue;
            }
            this.b.addPath(m2.e());
        }
        List<m> list = this.e;
        m m3 = (m)list.get(0);
        if (m3 instanceof d) {
            d d3 = (d)m3;
            List<m> list2 = d3.c();
            for (int i4 = 0; i4 < list2.size(); ++i4) {
                Path path = ((m)list2.get(i4)).e();
                path.transform(d3.d());
                this.a.addPath(path);
            }
        } else {
            this.a.set(m3.e());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override
    public void a(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            ((m)this.e.get(i2)).a(list, list2);
        }
    }

    @Override
    public void a(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c c2 = (c)listIterator.previous();
            if (!(c2 instanceof m)) continue;
            this.e.add((Object)((m)c2));
            listIterator.remove();
        }
    }

    @Override
    public String b() {
        return this.d;
    }

    @Override
    public Path e() {
        this.c.reset();
        if (this.f.c()) {
            return this.c;
        }
        int n2 = 1.a[this.f.b().ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 == 5) {
                            this.a(Path.Op.XOR);
                        }
                    } else {
                        this.a(Path.Op.INTERSECT);
                    }
                } else {
                    this.a(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                this.a(Path.Op.UNION);
            }
        } else {
            this.a();
        }
        return this.c;
    }
}

