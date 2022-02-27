/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  com.airbnb.lottie.a.a.s
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.a.a;

import android.graphics.Path;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.f.f;
import java.util.ArrayList;
import java.util.List;

public class b {
    private List<s> a = new ArrayList();

    public void a(Path path) {
        for (int i2 = -1 + this.a.size(); i2 >= 0; --i2) {
            f.a(path, (s)this.a.get(i2));
        }
    }

    void a(s s2) {
        this.a.add((Object)s2);
    }
}

