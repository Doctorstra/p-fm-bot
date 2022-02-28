/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.PointF
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.e;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class p {
    static int a(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int n2 = (int)(255.0 * jsonReader.nextDouble());
        int n3 = (int)(255.0 * jsonReader.nextDouble());
        int n4 = (int)(255.0 * jsonReader.nextDouble());
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb((int)255, (int)n2, (int)n3, (int)n4);
    }

    static List<PointF> a(JsonReader jsonReader, float f2) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add((Object)p.b(jsonReader, f2));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    static float b(JsonReader jsonReader) throws IOException {
        JsonToken jsonToken = jsonReader.peek();
        int n2 = 1.a[jsonToken.ordinal()];
        if (n2 != 1) {
            if (n2 == 2) {
                jsonReader.beginArray();
                float f2 = (float)jsonReader.nextDouble();
                while (jsonReader.hasNext()) {
                    jsonReader.skipValue();
                }
                jsonReader.endArray();
                return f2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown value for token of type ");
            stringBuilder.append((Object)jsonToken);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return (float)jsonReader.nextDouble();
    }

    static PointF b(JsonReader jsonReader, float f2) throws IOException {
        int n2 = 1.a[jsonReader.peek().ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return p.e(jsonReader, f2);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown point starts with ");
                stringBuilder.append((Object)jsonReader.peek());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return p.d(jsonReader, f2);
        }
        return p.c(jsonReader, f2);
    }

    private static PointF c(JsonReader jsonReader, float f2) throws IOException {
        float f3 = (float)jsonReader.nextDouble();
        float f4 = (float)jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(f3 * f2, f4 * f2);
    }

    private static PointF d(JsonReader jsonReader, float f2) throws IOException {
        jsonReader.beginArray();
        float f3 = (float)jsonReader.nextDouble();
        float f4 = (float)jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(f3 * f2, f4 * f2);
    }

    private static PointF e(JsonReader jsonReader, float f2) throws IOException {
        jsonReader.beginObject();
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            int n2 = -1;
            int n3 = string2.hashCode();
            if (n3 != 120) {
                if (n3 == 121 && string2.equals((Object)"y")) {
                    n2 = 1;
                }
            } else if (string2.equals((Object)"x")) {
                n2 = 0;
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    jsonReader.skipValue();
                    continue;
                }
                f4 = p.b(jsonReader);
                continue;
            }
            f3 = p.b(jsonReader);
        }
        jsonReader.endObject();
        return new PointF(f3 * f2, f4 * f2);
    }

}

