/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.l
 *  com.airbnb.lottie.c.b.k
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.c.b.k;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.c;
import java.io.IOException;

class ab {
    static k a(JsonReader jsonReader, d d2) throws IOException {
        String string2 = null;
        b b2 = null;
        b b3 = null;
        l l2 = null;
        boolean bl = false;
        while (jsonReader.hasNext()) {
            String string3 = jsonReader.nextName();
            int n2 = -1;
            int n3 = string3.hashCode();
            if (n3 != 99) {
                if (n3 != 111) {
                    if (n3 != 3324) {
                        if (n3 != 3519) {
                            if (n3 == 3710 && string3.equals((Object)"tr")) {
                                n2 = 3;
                            }
                        } else if (string3.equals((Object)"nm")) {
                            n2 = 0;
                        }
                    } else if (string3.equals((Object)"hd")) {
                        n2 = 4;
                    }
                } else if (string3.equals((Object)"o")) {
                    n2 = 2;
                }
            } else if (string3.equals((Object)"c")) {
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
                        l2 = c.a(jsonReader, d2);
                        continue;
                    }
                    b3 = com.airbnb.lottie.e.d.a(jsonReader, d2, false);
                    continue;
                }
                b2 = com.airbnb.lottie.e.d.a(jsonReader, d2, false);
                continue;
            }
            string2 = jsonReader.nextString();
        }
        k k2 = new k(string2, b2, b3, l2, bl);
        return k2;
    }
}

