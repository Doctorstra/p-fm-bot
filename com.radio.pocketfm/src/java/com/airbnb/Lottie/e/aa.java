/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.f
 *  com.airbnb.lottie.c.b.j
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.f;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.c.b.j;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.a;
import java.io.IOException;

class aa {
    static j a(JsonReader jsonReader, d d2) throws IOException {
        String string2 = null;
        m<PointF, PointF> m2 = null;
        f f2 = null;
        b b2 = null;
        boolean bl = false;
        while (jsonReader.hasNext()) {
            String string3 = jsonReader.nextName();
            int n2 = -1;
            int n3 = string3.hashCode();
            if (n3 != 112) {
                if (n3 != 3324) {
                    if (n3 != 3519) {
                        if (n3 != 114) {
                            if (n3 == 115 && string3.equals((Object)"s")) {
                                n2 = 2;
                            }
                        } else if (string3.equals((Object)"r")) {
                            n2 = 3;
                        }
                    } else if (string3.equals((Object)"nm")) {
                        n2 = 0;
                    }
                } else if (string3.equals((Object)"hd")) {
                    n2 = 4;
                }
            } else if (string3.equals((Object)"p")) {
                n2 = 1;
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                jsonReader.skipValue();
                                continue;
                            }
                            bl = jsonReader.nextBoolean();
                            continue;
                        }
                        b2 = com.airbnb.lottie.e.d.a(jsonReader, d2);
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
        j j2 = new j(string2, m2, f2, b2, bl);
        return j2;
    }
}

