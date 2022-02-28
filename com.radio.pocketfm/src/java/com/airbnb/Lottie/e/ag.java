/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.h
 *  com.airbnb.lottie.c.b.o
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.a.h;
import com.airbnb.lottie.c.b.o;
import com.airbnb.lottie.d;
import java.io.IOException;

class ag {
    static o a(JsonReader jsonReader, d d2) throws IOException {
        String string2 = null;
        h h2 = null;
        int n2 = 0;
        boolean bl = false;
        while (jsonReader.hasNext()) {
            String string3 = jsonReader.nextName();
            int n3 = -1;
            int n4 = string3.hashCode();
            if (n4 != 3324) {
                if (n4 != 3432) {
                    if (n4 != 3519) {
                        if (n4 == 104415 && string3.equals((Object)"ind")) {
                            n3 = 1;
                        }
                    } else if (string3.equals((Object)"nm")) {
                        n3 = 0;
                    }
                } else if (string3.equals((Object)"ks")) {
                    n3 = 2;
                }
            } else if (string3.equals((Object)"hd")) {
                n3 = 3;
            }
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            jsonReader.skipValue();
                            continue;
                        }
                        bl = jsonReader.nextBoolean();
                        continue;
                    }
                    h2 = com.airbnb.lottie.e.d.e(jsonReader, d2);
                    continue;
                }
                n2 = jsonReader.nextInt();
                continue;
            }
            string2 = jsonReader.nextString();
        }
        return new o(string2, n2, h2, bl);
    }
}

