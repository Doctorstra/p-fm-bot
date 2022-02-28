/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 */
package com.airbnb.lottie;

import java.util.Arrays;

public final class k<V> {
    private final V a;
    private final Throwable b;

    public k(V v2) {
        this.a = v2;
        this.b = null;
    }

    public k(Throwable throwable) {
        this.b = throwable;
        this.a = null;
    }

    public V a() {
        return this.a;
    }

    public Throwable b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof k)) {
            return false;
        }
        k k2 = (k)object;
        if (this.a() != null && this.a().equals(k2.a())) {
            return true;
        }
        if (this.b() != null && k2.b() != null) {
            return this.b().toString().equals((Object)this.b().toString());
        }
        return false;
    }

    public int hashCode() {
        Object[] arrobject = new Object[]{this.a(), this.b()};
        return Arrays.hashCode((Object[])arrobject);
    }
}

