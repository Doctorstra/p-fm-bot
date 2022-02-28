/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.a
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.b.m
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.graphics.Path;
import android.util.JsonReader;
import com.airbnb.lottie.c.a.a;
import com.airbnb.lottie.c.b.m;
import com.airbnb.lottie.d;
import java.io.IOException;

class ae {
    static m a(JsonReader jsonReader, d d2) throws IOException {
        String string2 = null;
        a a2 = null;
        com.airbnb.lottie.c.a.d d3 = null;
        int n2 = 1;
        boolean bl = false;
        boolean bl2 = false;
        while (jsonReader.hasNext()) {
            String string3 = jsonReader.nextName();
            int n3 = -1;
            int n4 = string3.hashCode();
            if (n4 != -396065730) {
                if (n4 != 99) {
                    if (n4 != 111) {
                        if (n4 != 114) {
                            if (n4 != 3324) {
                                if (n4 == 3519 && string3.equals((Object)"nm")) {
                                    n3 = 0;
                                }
                            } else if (string3.equals((Object)"hd")) {
                                n3 = 5;
                            }
                        } else if (string3.equals((Object)"r")) {
                            n3 = 4;
                        }
                    } else if (string3.equals((Object)"o")) {
                        n3 = 2;
                    }
                } else if (string3.equals((Object)"c")) {
                    n3 = 1;
                }
            } else if (string3.equals((Object)"fillEnabled")) {
                n3 = 3;
            }
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) {
                                if (n3 != 5) {
                                    jsonReader.skipValue();
                                    continue;
                                }
                                bl2 = jsonReader.nextBoolean();
                                continue;
                            }
                            n2 = jsonReader.nextInt();
                            continue;
                        }
                        bl = jsonReader.nextBoolean();
                        continue;
                    }
                    d3 = com.airbnb.lottie.e.d.b(jsonReader, d2);
                    continue;
                }
                a2 = com.airbnb.lottie.e.d.g(jsonReader, d2);
                continue;
            }
            string2 = jsonReader.nextString();
        }
        Path.FillType fillType = n2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
        Path.FillType fillType2 = fillType;
        m m2 = new m(string2, bl, fillType2, a2, d3, bl2);
        return m2;
    }
}

