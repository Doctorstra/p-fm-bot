/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.core.g.d
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.c;

import androidx.core.g.d;

public class i<T> {
    T a;
    T b;

    private static boolean b(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    public void a(T t2, T t3) {
        this.a = t2;
        this.b = t3;
    }

    public boolean equals(Object object) {
        if (!(object instanceof d)) {
            return false;
        }
        d d2 = (d)object;
        boolean bl = i.b(d2.a, this.a);
        boolean bl2 = false;
        if (bl) {
            boolean bl3 = i.b(d2.b, this.b);
            bl2 = false;
            if (bl3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public int hashCode() {
        T t2 = this.a;
        int n2 = t2 == null ? 0 : t2.hashCode();
        T t3 = this.b;
        int n3 = t3 == null ? 0 : t3.hashCode();
        return n2 ^ n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pair{");
        stringBuilder.append(String.valueOf(this.a));
        stringBuilder.append(" ");
        stringBuilder.append(String.valueOf(this.b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

