/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 */
package com.airbnb.lottie.e;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.e.aj;
import java.io.IOException;

public class f
implements aj<Integer> {
    public static final f a = new f();

    private f() {
    }

    public Integer a(JsonReader jsonReader, float f2) throws IOException {
        boolean bl2 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (bl2) {
            jsonReader.beginArray();
        }
        double d2 = jsonReader.nextDouble();
        double d3 = jsonReader.nextDouble();
        double d4 = jsonReader.nextDouble();
        double d5 = jsonReader.nextDouble();
        if (bl2) {
            jsonReader.endArray();
        }
        if (d2 <= 1.0 && d3 <= 1.0 && d4 <= 1.0 && d5 <= 1.0) {
            d2 *= 255.0;
            d3 *= 255.0;
            d4 *= 255.0;
            d5 *= 255.0;
        }
        return Color.argb((int)((int)d5), (int)((int)d2), (int)((int)d3), (int)((int)d4));
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader, float f2) throws IOException {
        return this.a(jsonReader, f2);
    }
}

