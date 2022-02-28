/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  com.airbnb.lottie.a.b.h
 *  java.io.IOException
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.a.b.h;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.aj;
import com.airbnb.lottie.e.q;
import com.airbnb.lottie.g.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class r {
    static <T> List<a<T>> a(JsonReader jsonReader, d d2, float f2, aj<T> aj2) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            d2.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            int n2 = -1;
            if (string2.hashCode() == 107 && string2.equals((Object)"k")) {
                n2 = 0;
            }
            if (n2 != 0) {
                jsonReader.skipValue();
                continue;
            }
            if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(q.a(jsonReader, d2, f2, aj2, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(q.a(jsonReader, d2, f2, aj2, true));
                    }
                }
                jsonReader.endArray();
                continue;
            }
            arrayList.add(q.a(jsonReader, d2, f2, aj2, false));
        }
        jsonReader.endObject();
        r.a(arrayList);
        return arrayList;
    }

    public static <T> void a(List<? extends a<T>> list) {
        int n2;
        int n3 = list.size();
        int n4 = 0;
        while (n4 < (n2 = n3 - 1)) {
            a a2 = (a)list.get(n4);
            a a3 = (a)list.get(++n4);
            a2.e = Float.valueOf((float)a3.d);
            if (a2.b != null || a3.a == null) continue;
            a2.b = a3.a;
            if (!(a2 instanceof h)) continue;
            ((h)a2).a();
        }
        a a4 = (a)list.get(n2);
        if ((a4.a == null || a4.b == null) && list.size() > 1) {
            list.remove((Object)a4);
        }
    }
}

