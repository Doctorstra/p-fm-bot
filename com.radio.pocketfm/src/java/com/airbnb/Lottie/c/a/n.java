/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package com.airbnb.lottie.c.a;

import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.g.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

abstract class n<V, O>
implements m<V, O> {
    final List<a<V>> a;

    n(V v2) {
        this(Collections.singletonList(new a<V>(v2)));
    }

    n(List<a<V>> list) {
        this.a = list;
    }

    @Override
    public boolean b() {
        boolean bl2;
        block3 : {
            block2 : {
                if (this.a.isEmpty()) break block2;
                int n2 = this.a.size();
                bl2 = false;
                if (n2 != 1) break block3;
                boolean bl3 = ((a)this.a.get(0)).e();
                bl2 = false;
                if (!bl3) break block3;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public List<a<V>> c() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.a.isEmpty()) {
            stringBuilder.append("values=");
            stringBuilder.append(Arrays.toString((Object[])this.a.toArray()));
        }
        return stringBuilder.toString();
    }
}

