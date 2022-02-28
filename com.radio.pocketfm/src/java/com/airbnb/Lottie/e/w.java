/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  com.airbnb.lottie.a.b.h
 *  com.airbnb.lottie.e.x
 *  java.io.IOException
 *  java.lang.Object
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.a.b.h;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.q;
import com.airbnb.lottie.e.x;
import com.airbnb.lottie.f.f;
import com.airbnb.lottie.g.a;
import java.io.IOException;

class w {
    static h a(JsonReader jsonReader, d d2) throws IOException {
        boolean bl = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        return new h(d2, q.a(jsonReader, d2, f.a(), x.a, bl));
    }
}

