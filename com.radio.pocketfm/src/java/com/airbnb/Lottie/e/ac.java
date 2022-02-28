/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  java.io.IOException
 *  java.lang.Object
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.e.aj;
import com.airbnb.lottie.g.d;
import java.io.IOException;

public class ac
implements aj<d> {
    public static final ac a = new ac();

    private ac() {
    }

    public d a(JsonReader jsonReader, float f2) throws IOException {
        boolean bl2 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (bl2) {
            jsonReader.beginArray();
        }
        float f3 = (float)jsonReader.nextDouble();
        float f4 = (float)jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (bl2) {
            jsonReader.endArray();
        }
        return new d(f2 * (f3 / 100.0f), f2 * (f4 / 100.0f));
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader, float f2) throws IOException {
        return this.a(jsonReader, f2);
    }
}

