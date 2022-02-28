/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.e.aj;
import com.airbnb.lottie.e.p;
import java.io.IOException;

public class o
implements aj<Integer> {
    public static final o a = new o();

    private o() {
    }

    public Integer a(JsonReader jsonReader, float f2) throws IOException {
        return Math.round((float)(f2 * p.b(jsonReader)));
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader, float f2) throws IOException {
        return this.a(jsonReader, f2);
    }
}

