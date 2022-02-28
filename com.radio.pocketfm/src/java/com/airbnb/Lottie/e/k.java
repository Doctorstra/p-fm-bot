/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.c;
import java.io.IOException;

class k {
    static c a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String string2 = null;
        String string3 = null;
        String string4 = null;
        float f2 = 0.0f;
        while (jsonReader.hasNext()) {
            String string5 = jsonReader.nextName();
            int n2 = -1;
            switch (string5.hashCode()) {
                default: {
                    break;
                }
                case 96619537: {
                    if (!string5.equals((Object)"fName")) break;
                    n2 = 1;
                    break;
                }
                case -1294566165: {
                    if (!string5.equals((Object)"fStyle")) break;
                    n2 = 2;
                    break;
                }
                case -1408684838: {
                    if (!string5.equals((Object)"ascent")) break;
                    n2 = 3;
                    break;
                }
                case -1866931350: {
                    if (!string5.equals((Object)"fFamily")) break;
                    n2 = 0;
                }
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            jsonReader.skipValue();
                            continue;
                        }
                        f2 = (float)jsonReader.nextDouble();
                        continue;
                    }
                    string4 = jsonReader.nextString();
                    continue;
                }
                string3 = jsonReader.nextString();
                continue;
            }
            string2 = jsonReader.nextString();
        }
        jsonReader.endObject();
        return new c(string2, string3, string4, f2);
    }
}

