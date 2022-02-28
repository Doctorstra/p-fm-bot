/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.e
 *  com.airbnb.lottie.c.a.i
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.e;
import com.airbnb.lottie.c.a.i;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.p;
import com.airbnb.lottie.e.r;
import com.airbnb.lottie.e.w;
import com.airbnb.lottie.f.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class a {
    public static e a(JsonReader jsonReader, d d2) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add((Object)w.a(jsonReader, d2));
            }
            jsonReader.endArray();
            r.a(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.g.a<PointF>(p.b(jsonReader, f.a())));
        }
        return new e((List)arrayList);
    }

    static m<PointF, PointF> b(JsonReader jsonReader, d d2) throws IOException {
        jsonReader.beginObject();
        e e2 = null;
        b b2 = null;
        b b3 = null;
        boolean bl = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            block15 : {
                block19 : {
                    block18 : {
                        block16 : {
                            block17 : {
                                String string2 = jsonReader.nextName();
                                int n2 = -1;
                                int n3 = string2.hashCode();
                                if (n3 != 107) {
                                    if (n3 != 120) {
                                        if (n3 == 121 && string2.equals((Object)"y")) {
                                            n2 = 2;
                                        }
                                    } else if (string2.equals((Object)"x")) {
                                        n2 = 1;
                                    }
                                } else if (string2.equals((Object)"k")) {
                                    n2 = 0;
                                }
                                if (n2 == 0) break block15;
                                if (n2 == 1) break block16;
                                if (n2 != 2) {
                                    jsonReader.skipValue();
                                    continue;
                                }
                                if (jsonReader.peek() != JsonToken.STRING) break block17;
                                jsonReader.skipValue();
                                break block18;
                            }
                            b3 = com.airbnb.lottie.e.d.a(jsonReader, d2);
                            continue;
                        }
                        if (jsonReader.peek() != JsonToken.STRING) break block19;
                        jsonReader.skipValue();
                    }
                    bl = true;
                    continue;
                }
                b2 = com.airbnb.lottie.e.d.a(jsonReader, d2);
                continue;
            }
            e2 = a.a(jsonReader, d2);
        }
        jsonReader.endObject();
        if (bl) {
            d2.a("Lottie doesn't support expressions.");
        }
        if (e2 != null) {
            return e2;
        }
        return new i(b2, b3);
    }
}
