/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.b.n
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.c.b.n;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class af {
    static n a(JsonReader jsonReader, d d2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String string2 = null;
        boolean bl = false;
        while (jsonReader.hasNext()) {
            String string3 = jsonReader.nextName();
            int n2 = -1;
            int n3 = string3.hashCode();
            if (n3 != 3324) {
                if (n3 != 3371) {
                    if (n3 == 3519 && string3.equals((Object)"nm")) {
                        n2 = 0;
                    }
                } else if (string3.equals((Object)"it")) {
                    n2 = 2;
                }
            } else if (string3.equals((Object)"hd")) {
                n2 = 1;
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        jsonReader.skipValue();
                        continue;
                    }
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        b b2 = g.a(jsonReader, d2);
                        if (b2 == null) continue;
                        arrayList.add((Object)b2);
                    }
                    jsonReader.endArray();
                    continue;
                }
                bl = jsonReader.nextBoolean();
                continue;
            }
            string2 = jsonReader.nextString();
        }
        return new n(string2, (List)arrayList, bl);
    }
}

