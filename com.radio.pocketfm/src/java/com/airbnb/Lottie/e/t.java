/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.util.JsonReader
 *  androidx.a.d
 *  androidx.a.h
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package com.airbnb.lottie.e;

import android.graphics.Rect;
import android.util.JsonReader;
import androidx.a.h;
import com.airbnb.lottie.c;
import com.airbnb.lottie.c.c.d;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.j;
import com.airbnb.lottie.e.k;
import com.airbnb.lottie.e.s;
import com.airbnb.lottie.f.f;
import com.airbnb.lottie.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class t {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static d a(JsonReader var0) throws IOException {
        var1_1 = f.a();
        var2_2 = new androidx.a.d();
        var3_3 = new ArrayList();
        var4_4 = new HashMap();
        var5_5 = new HashMap();
        var6_6 = new HashMap();
        var7_7 = new ArrayList();
        var8_8 = new h();
        var9_9 = new d();
        var0.beginObject();
        var10_10 = 0;
        var11_11 = 0;
        var12_12 = 0.0f;
        var13_13 = 0.0f;
        var14_14 = 0.0f;
        do {
            block30 : {
                block29 : {
                    if (!var0.hasNext()) {
                        var16_21 = var14_14;
                        var0.endObject();
                        var9_9.a(new Rect(0, 0, (int)(var1_1 * (float)var10_10), (int)(var1_1 * (float)var11_11)), var12_12, var13_13, var16_21, (List<com.airbnb.lottie.c.c.d>)var3_3, (androidx.a.d<com.airbnb.lottie.c.c.d>)var2_2, (Map<String, List<com.airbnb.lottie.c.c.d>>)var4_4, (Map<String, g>)var5_5, (h<com.airbnb.lottie.c.d>)var8_8, (Map<String, com.airbnb.lottie.c.c>)var6_6, (List<com.airbnb.lottie.c.h>)var7_7);
                        return var9_9;
                    }
                    var18_15 = var0.nextName();
                    switch (var18_15.hashCode()) {
                        default: {
                            var19_16 = var14_14;
                            break;
                        }
                        case 839250809: {
                            var19_16 = var14_14;
                            if (!var18_15.equals((Object)"markers")) break;
                            var20_17 = 10;
                            break block29;
                        }
                        case 97615364: {
                            var19_16 = var14_14;
                            if (!var18_15.equals((Object)"fonts")) break;
                            var20_17 = 8;
                            break block29;
                        }
                        case 94623709: {
                            var19_16 = var14_14;
                            if (!var18_15.equals((Object)"chars")) break;
                            var20_17 = 9;
                            break block29;
                        }
                        case 3553: {
                            var19_16 = var14_14;
                            if (!var18_15.equals((Object)"op")) break;
                            var20_17 = 3;
                            break block29;
                        }
                        case 3367: {
                            var19_16 = var14_14;
                            if (!var18_15.equals((Object)"ip")) break;
                            var20_17 = 2;
                            break block29;
                        }
                        case 3276: {
                            var19_16 = var14_14;
                            if (!var18_15.equals((Object)"fr")) break;
                            var20_17 = 4;
                            break block29;
                        }
                        case 119: {
                            var19_16 = var14_14;
                            if (!var18_15.equals((Object)"w")) break;
                            var20_17 = 0;
                            break block29;
                        }
                        case 118: {
                            var19_16 = var14_14;
                            if (!var18_15.equals((Object)"v")) break;
                            var20_17 = 5;
                            break block29;
                        }
                        case 104: {
                            var19_16 = var14_14;
                            if (!var18_15.equals((Object)"h")) break;
                            var20_17 = 1;
                            break block29;
                        }
                        case -1109732030: {
                            var19_16 = var14_14;
                            if (!var18_15.equals((Object)"layers")) break;
                            var20_17 = 6;
                            break block29;
                        }
                        case -1408207997: {
                            var19_16 = var14_14;
                            if (!var18_15.equals((Object)"assets")) break;
                            var20_17 = 7;
                            break block29;
                        }
                    }
                    var20_17 = -1;
                }
                switch (var20_17) {
                    default: {
                        var21_18 = var6_6;
                        var22_19 = var7_7;
                        var0.skipValue();
                        break block30;
                    }
                    case 10: {
                        t.a(var0, var9_9, (List<com.airbnb.lottie.c.h>)var7_7);
                        ** GOTO lbl109
                    }
                    case 9: {
                        t.a(var0, var9_9, (h<com.airbnb.lottie.c.d>)var8_8);
                        ** GOTO lbl109
                    }
                    case 8: {
                        t.a(var0, (Map<String, com.airbnb.lottie.c.c>)var6_6);
                        ** GOTO lbl109
                    }
                    case 7: {
                        t.a(var0, var9_9, (Map<String, List<com.airbnb.lottie.c.c.d>>)var4_4, (Map<String, g>)var5_5);
                        ** GOTO lbl109
                    }
                    case 6: {
                        t.a(var0, var9_9, (List<com.airbnb.lottie.c.c.d>)var3_3, (androidx.a.d<com.airbnb.lottie.c.c.d>)var2_2);
                        ** GOTO lbl109
                    }
                    case 5: {
                        var23_20 = var0.nextString().split("\\.");
                        if (!f.a(Integer.parseInt((String)var23_20[0]), Integer.parseInt((String)var23_20[1]), Integer.parseInt((String)var23_20[2]), 4, 4, 0)) {
                            var9_9.a("Lottie only supports bodymovin >= 4.4.0");
                        }
lbl109: // 8 sources:
                        var21_18 = var6_6;
                        var22_19 = var7_7;
                        break block30;
                    }
                    case 4: {
                        var21_18 = var6_6;
                        var22_19 = var7_7;
                        var19_16 = (float)var0.nextDouble();
                        break block30;
                    }
                    case 3: {
                        var21_18 = var6_6;
                        var22_19 = var7_7;
                        var13_13 = (float)var0.nextDouble() - 0.01f;
                        break block30;
                    }
                    case 2: {
                        var21_18 = var6_6;
                        var22_19 = var7_7;
                        var12_12 = (float)var0.nextDouble();
                        break block30;
                    }
                    case 1: {
                        var21_18 = var6_6;
                        var22_19 = var7_7;
                        var11_11 = var0.nextInt();
                        break block30;
                    }
                    case 0: 
                }
                var21_18 = var6_6;
                var22_19 = var7_7;
                var10_10 = var0.nextInt();
            }
            var6_6 = var21_18;
            var7_7 = var22_19;
            var14_14 = var19_16;
        } while (true);
    }

    private static void a(JsonReader jsonReader, d d2, h<com.airbnb.lottie.c.d> h2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.airbnb.lottie.c.d d3 = j.a(jsonReader, d2);
            h2.b(d3.hashCode(), (Object)d3);
        }
        jsonReader.endArray();
    }

    private static void a(JsonReader jsonReader, d d2, List<com.airbnb.lottie.c.h> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String string2 = null;
            jsonReader.beginObject();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (jsonReader.hasNext()) {
                String string3 = jsonReader.nextName();
                int n2 = -1;
                int n3 = string3.hashCode();
                if (n3 != 3178) {
                    if (n3 != 3214) {
                        if (n3 == 3705 && string3.equals((Object)"tm")) {
                            n2 = 1;
                        }
                    } else if (string3.equals((Object)"dr")) {
                        n2 = 2;
                    }
                } else if (string3.equals((Object)"cm")) {
                    n2 = 0;
                }
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            jsonReader.skipValue();
                            continue;
                        }
                        f3 = (float)jsonReader.nextDouble();
                        continue;
                    }
                    f2 = (float)jsonReader.nextDouble();
                    continue;
                }
                string2 = jsonReader.nextString();
            }
            jsonReader.endObject();
            list.add((Object)new com.airbnb.lottie.c.h(string2, f2, f3));
        }
        jsonReader.endArray();
    }

    private static void a(JsonReader jsonReader, d d2, List<com.airbnb.lottie.c.c.d> list, androidx.a.d<com.airbnb.lottie.c.c.d> d3) throws IOException {
        jsonReader.beginArray();
        int n2 = 0;
        while (jsonReader.hasNext()) {
            com.airbnb.lottie.c.c.d d4 = s.a(jsonReader, d2);
            if (d4.k() == d.a.c) {
                ++n2;
            }
            list.add((Object)d4);
            d3.b(d4.e(), (Object)d4);
            if (n2 <= 4) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("You have ");
            stringBuilder.append(n2);
            stringBuilder.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            c.b(stringBuilder.toString());
        }
        jsonReader.endArray();
    }

    private static void a(JsonReader jsonReader, d d2, Map<String, List<com.airbnb.lottie.c.c.d>> map, Map<String, g> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            androidx.a.d d3 = new androidx.a.d();
            jsonReader.beginObject();
            String string2 = null;
            String string3 = null;
            String string4 = null;
            int n2 = 0;
            int n3 = 0;
            while (jsonReader.hasNext()) {
                String string5 = jsonReader.nextName();
                int n4 = -1;
                int n5 = string5.hashCode();
                if (n5 != -1109732030) {
                    if (n5 != 104) {
                        if (n5 != 112) {
                            if (n5 != 117) {
                                if (n5 != 119) {
                                    if (n5 == 3355 && string5.equals((Object)"id")) {
                                        n4 = 0;
                                    }
                                } else if (string5.equals((Object)"w")) {
                                    n4 = 2;
                                }
                            } else if (string5.equals((Object)"u")) {
                                n4 = 5;
                            }
                        } else if (string5.equals((Object)"p")) {
                            n4 = 4;
                        }
                    } else if (string5.equals((Object)"h")) {
                        n4 = 3;
                    }
                } else if (string5.equals((Object)"layers")) {
                    n4 = 1;
                }
                if (n4 != 0) {
                    if (n4 != 1) {
                        if (n4 != 2) {
                            if (n4 != 3) {
                                if (n4 != 4) {
                                    if (n4 != 5) {
                                        jsonReader.skipValue();
                                        continue;
                                    }
                                    string4 = jsonReader.nextString();
                                    continue;
                                }
                                string3 = jsonReader.nextString();
                                continue;
                            }
                            n3 = jsonReader.nextInt();
                            continue;
                        }
                        n2 = jsonReader.nextInt();
                        continue;
                    }
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.airbnb.lottie.c.c.d d4 = s.a(jsonReader, d2);
                        d3.b(d4.e(), (Object)d4);
                        arrayList.add((Object)d4);
                    }
                    jsonReader.endArray();
                    continue;
                }
                string2 = jsonReader.nextString();
            }
            jsonReader.endObject();
            if (string3 != null) {
                g g2 = new g(n2, n3, string2, string3, string4);
                map2.put((Object)g2.a(), (Object)g2);
                continue;
            }
            map.put(string2, (Object)arrayList);
        }
        jsonReader.endArray();
    }

    private static void a(JsonReader jsonReader, Map<String, com.airbnb.lottie.c.c> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            int n2 = -1;
            if (string2.hashCode() == 3322014 && string2.equals((Object)"list")) {
                n2 = 0;
            }
            if (n2 != 0) {
                jsonReader.skipValue();
                continue;
            }
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                com.airbnb.lottie.c.c c2 = k.a(jsonReader);
                map.put((Object)c2.b(), (Object)c2);
            }
            jsonReader.endArray();
        }
        jsonReader.endObject();
    }
}

