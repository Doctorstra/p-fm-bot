/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.e.aj;
import com.airbnb.lottie.e.p;
import java.io.IOException;

public class y
implements aj<PointF> {
    public static final y a = new y();

    private y() {
    }

    public PointF a(JsonReader jsonReader, float f2) throws IOException {
        JsonToken jsonToken = jsonReader.peek();
        if (jsonToken == JsonToken.BEGIN_ARRAY) {
            return p.b(jsonReader, f2);
        }
        if (jsonToken == JsonToken.BEGIN_OBJECT) {
            return p.b(jsonReader, f2);
        }
        if (jsonToken == JsonToken.NUMBER) {
            PointF pointF = new PointF(f2 * (float)jsonReader.nextDouble(), f2 * (float)jsonReader.nextDouble());
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot convert json to point. Next token is ");
        stringBuilder.append((Object)jsonToken);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader, float f2) throws IOException {
        return this.a(jsonReader, f2);
    }
}

