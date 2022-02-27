/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 */
package c;

import c.p;

final class q {
    static p a;
    static long b;

    private q() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static p a() {
        Class<q> class_ = q.class;
        synchronized (q.class) {
            if (a != null) {
                p p2 = a;
                a = p2.f;
                p2.f = null;
                b -= 8192L;
                // ** MonitorExit[var2] (shouldn't be in output)
                return p2;
            }
            // ** MonitorExit[var2] (shouldn't be in output)
            return new p();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void a(p p2) {
        if (p2.f == null && p2.g == null) {
            if (p2.d) {
                return;
            }
            Class<q> class_ = q.class;
            synchronized (q.class) {
                if (8192L + b > 65536L) {
                    // ** MonitorExit[var2_1] (shouldn't be in output)
                    return;
                }
                b = 8192L + b;
                p2.f = a;
                p2.c = 0;
                p2.b = 0;
                a = p2;
                // ** MonitorExit[var2_1] (shouldn't be in output)
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}

