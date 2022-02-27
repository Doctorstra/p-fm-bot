/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c;

import c.c;
import c.t;
import c.u;
import java.io.IOException;

public abstract class i
implements t {
    private final t a;

    public i(t t2) {
        if (t2 != null) {
            this.a = t2;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override
    public long a(c c2, long l2) throws IOException {
        return this.a.a(c2, l2);
    }

    @Override
    public u a() {
        return this.a.a();
    }

    public final t b() {
        return this.a;
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.a.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

