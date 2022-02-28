/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.a.b
 *  androidx.core.g.d
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 */
package com.airbnb.lottie;

import androidx.a.b;
import com.airbnb.lottie.f.d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class m {
    private boolean a = false;
    private final Set<a> b = new b();
    private final Map<String, d> c = new HashMap();
    private final Comparator<androidx.core.g.d<String, Float>> d = new Comparator<androidx.core.g.d<String, Float>>(){

        public int a(androidx.core.g.d<String, Float> d2, androidx.core.g.d<String, Float> d3) {
            float f2 = ((Float)d2.b).floatValue();
            float f3 = ((Float)d3.b).floatValue();
            if (f3 > f2) {
                return 1;
            }
            if (f2 > f3) {
                return -1;
            }
            return 0;
        }

        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((androidx.core.g.d<String, Float>)((androidx.core.g.d)object), (androidx.core.g.d<String, Float>)((androidx.core.g.d)object2));
        }
    };

    public void a(String string2, float f2) {
        if (!this.a) {
            return;
        }
        d d2 = (d)this.c.get((Object)string2);
        if (d2 == null) {
            d2 = new d();
            this.c.put((Object)string2, (Object)d2);
        }
        d2.a(f2);
        if (string2.equals((Object)"__container")) {
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((a)iterator.next()).a(f2);
            }
        }
    }

    void a(boolean bl) {
        this.a = bl;
    }

    public static interface a {
        public void a(float var1);
    }

}

