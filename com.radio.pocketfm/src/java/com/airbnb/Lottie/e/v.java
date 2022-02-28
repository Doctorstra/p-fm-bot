/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.b.h
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.b.h;
import java.io.IOException;

class v {
    static h a(JsonReader jsonReader) throws IOException {
        String string2 = null;
        h.a a2 = null;
        boolean bl = false;
        while (jsonReader.hasNext()) {
            String string3 = jsonReader.nextName();
            int n2 = -1;
            int n3 = string3.hashCode();
            if (n3 != 3324) {
                if (n3 != 3488) {
                    if (n3 == 3519 && string3.equals((Object)"nm")) {
                        n2 = 0;
                    }
                } else if (string3.equals((Object)"mm")) {
                    n2 = 1;
                }
            } else if (string3.equals((Object)"hd")) {
                n2 = 2;
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        jsonReader.skipValue();
                        continue;
                    }
                    bl = jsonReader.nextBoolean();
                    continue;
                }
                a2 = h.a.a(jsonReader.nextInt());
                continue;
            }
            string2 = jsonReader.nextString();
        }
        return new h(string2, a2, bl);
    }
}

