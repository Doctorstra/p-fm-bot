/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.a
 *  com.airbnb.lottie.c.a.b
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.a.a;
import com.airbnb.lottie.c.a.k;
import com.airbnb.lottie.d;
import java.io.IOException;

public class b {
    public static k a(JsonReader jsonReader, d d2) throws IOException {
        jsonReader.beginObject();
        k k2 = null;
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            int n2 = -1;
            if (string2.hashCode() == 97 && string2.equals((Object)"a")) {
                n2 = 0;
            }
            if (n2 != 0) {
                jsonReader.skipValue();
                continue;
            }
            k2 = b.b(jsonReader, d2);
        }
        jsonReader.endObject();
        if (k2 == null) {
            return new k(null, null, null, null);
        }
        return k2;
    }

    private static k b(JsonReader jsonReader, d d2) throws IOException {
        jsonReader.beginObject();
        a a2 = null;
        a a3 = null;
        com.airbnb.lottie.c.a.b b2 = null;
        com.airbnb.lottie.c.a.b b3 = null;
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            int n2 = -1;
            int n3 = string2.hashCode();
            if (n3 != 116) {
                if (n3 != 3261) {
                    if (n3 != 3664) {
                        if (n3 == 3684 && string2.equals((Object)"sw")) {
                            n2 = 2;
                        }
                    } else if (string2.equals((Object)"sc")) {
                        n2 = 1;
                    }
                } else if (string2.equals((Object)"fc")) {
                    n2 = 0;
                }
            } else if (string2.equals((Object)"t")) {
                n2 = 3;
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            jsonReader.skipValue();
                            continue;
                        }
                        b3 = com.airbnb.lottie.e.d.a(jsonReader, d2);
                        continue;
                    }
                    b2 = com.airbnb.lottie.e.d.a(jsonReader, d2);
                    continue;
                }
                a3 = com.airbnb.lottie.e.d.g(jsonReader, d2);
                continue;
            }
            a2 = com.airbnb.lottie.e.d.g(jsonReader, d2);
        }
        jsonReader.endObject();
        return new k(a2, a3, b2, b3);
    }
}

