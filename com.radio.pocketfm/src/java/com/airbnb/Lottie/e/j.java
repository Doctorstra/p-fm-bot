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
import com.airbnb.lottie.c.b.n;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class j {
    static com.airbnb.lottie.c.d a(JsonReader jsonReader, d d2) throws IOException {
        double d3;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        String string2 = null;
        String string3 = null;
        double d4 = d3 = 0.0;
        char c2 = '\u0000';
        while (jsonReader.hasNext()) {
            int n2;
            block18 : {
                String string4 = jsonReader.nextName();
                switch (string4.hashCode()) {
                    default: {
                        break;
                    }
                    case 109780401: {
                        if (!string4.equals((Object)"style")) break;
                        n2 = 3;
                        break block18;
                    }
                    case 3530753: {
                        if (!string4.equals((Object)"size")) break;
                        n2 = 1;
                        break block18;
                    }
                    case 3076010: {
                        if (!string4.equals((Object)"data")) break;
                        n2 = 5;
                        break block18;
                    }
                    case 3173: {
                        if (!string4.equals((Object)"ch")) break;
                        n2 = 0;
                        break block18;
                    }
                    case 119: {
                        if (!string4.equals((Object)"w")) break;
                        n2 = 2;
                        break block18;
                    }
                    case -1866931350: {
                        if (!string4.equals((Object)"fFamily")) break;
                        n2 = 4;
                        break block18;
                    }
                }
                n2 = -1;
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                if (n2 != 5) {
                                    jsonReader.skipValue();
                                    continue;
                                }
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    if ("shapes".equals((Object)jsonReader.nextName())) {
                                        jsonReader.beginArray();
                                        while (jsonReader.hasNext()) {
                                            arrayList.add((Object)((n)g.a(jsonReader, d2)));
                                        }
                                        jsonReader.endArray();
                                        continue;
                                    }
                                    jsonReader.skipValue();
                                }
                                jsonReader.endObject();
                                continue;
                            }
                            string3 = jsonReader.nextString();
                            continue;
                        }
                        string2 = jsonReader.nextString();
                        continue;
                    }
                    d4 = jsonReader.nextDouble();
                    continue;
                }
                d3 = jsonReader.nextDouble();
                continue;
            }
            c2 = jsonReader.nextString().charAt(0);
        }
        jsonReader.endObject();
        com.airbnb.lottie.c.d d5 = new com.airbnb.lottie.c.d((List<n>)arrayList, c2, d3, d4, string2, string3);
        return d5;
    }
}

