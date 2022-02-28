/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.f
 *  com.airbnb.lottie.c.b.a
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.c.a.f;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.a;
import java.io.IOException;

class e {
    static com.airbnb.lottie.c.b.a a(JsonReader jsonReader, d d2, int n2) throws IOException {
        boolean bl = n2 == 3;
        boolean bl2 = bl;
        String string2 = null;
        m<PointF, PointF> m2 = null;
        f f2 = null;
        boolean bl3 = false;
        while (jsonReader.hasNext()) {
            String string3 = jsonReader.nextName();
            int n3 = -1;
            int n4 = string3.hashCode();
            if (n4 != 100) {
                if (n4 != 112) {
                    if (n4 != 115) {
                        if (n4 != 3324) {
                            if (n4 == 3519 && string3.equals((Object)"nm")) {
                                n3 = 0;
                            }
                        } else if (string3.equals((Object)"hd")) {
                            n3 = 3;
                        }
                    } else if (string3.equals((Object)"s")) {
                        n3 = 2;
                    }
                } else if (string3.equals((Object)"p")) {
                    n3 = 1;
                }
            } else if (string3.equals((Object)"d")) {
                n3 = 4;
            }
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) {
                                jsonReader.skipValue();
                                continue;
                            }
                            boolean bl4 = jsonReader.nextInt() == 3;
                            bl2 = bl4;
                            continue;
                        }
                        bl3 = jsonReader.nextBoolean();
                        continue;
                    }
                    f2 = com.airbnb.lottie.e.d.c(jsonReader, d2);
                    continue;
                }
                m2 = a.b(jsonReader, d2);
                continue;
            }
            string2 = jsonReader.nextString();
        }
        com.airbnb.lottie.c.b.a a2 = new com.airbnb.lottie.c.b.a(string2, m2, f2, bl2, bl3);
        return a2;
    }
}

