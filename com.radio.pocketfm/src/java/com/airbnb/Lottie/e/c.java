/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  android.util.Log
 *  android.view.animation.Interpolator
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.a.e
 *  com.airbnb.lottie.c.a.g
 *  com.airbnb.lottie.c.a.l
 *  java.io.IOException
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.airbnb.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import android.view.animation.Interpolator;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.e;
import com.airbnb.lottie.c.a.g;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.a;
import java.io.IOException;
import java.util.List;

public class c {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static l a(JsonReader var0, d var1_1) throws IOException {
        var2_2 = var0.peek() == JsonToken.BEGIN_OBJECT;
        if (var2_2) {
            var0.beginObject();
        }
        var3_3 = null;
        var4_4 = null;
        var5_5 = null;
        var6_6 = null;
        var7_7 = null;
        var8_8 = null;
        var9_9 = null;
        var10_10 = null;
        var11_11 = null;
        while (var0.hasNext()) {
            block34 : {
                block25 : {
                    block26 : {
                        block27 : {
                            block28 : {
                                block29 : {
                                    block30 : {
                                        block31 : {
                                            block32 : {
                                                block33 : {
                                                    var17_12 = var0.nextName();
                                                    var18_13 = var17_12.hashCode();
                                                    if (var18_13 == 97) break block25;
                                                    if (var18_13 == 3242) break block26;
                                                    if (var18_13 == 3656) break block27;
                                                    if (var18_13 == 3662) break block28;
                                                    if (var18_13 == 3672) break block29;
                                                    if (var18_13 == 3676) break block30;
                                                    if (var18_13 == 111) break block31;
                                                    if (var18_13 == 112) break block32;
                                                    if (var18_13 == 114) break block33;
                                                    if (var18_13 != 115 || !var17_12.equals((Object)"s")) ** GOTO lbl-1000
                                                    var19_14 = 2;
                                                    break block34;
                                                }
                                                if (!var17_12.equals((Object)"r")) ** GOTO lbl-1000
                                                var19_14 = 4;
                                                break block34;
                                            }
                                            if (!var17_12.equals((Object)"p")) ** GOTO lbl-1000
                                            var19_14 = 1;
                                            break block34;
                                        }
                                        if (!var17_12.equals((Object)"o")) ** GOTO lbl-1000
                                        var19_14 = 5;
                                        break block34;
                                    }
                                    if (!var17_12.equals((Object)"so")) ** GOTO lbl-1000
                                    var19_14 = 6;
                                    break block34;
                                }
                                if (!var17_12.equals((Object)"sk")) ** GOTO lbl-1000
                                var19_14 = 8;
                                break block34;
                            }
                            if (!var17_12.equals((Object)"sa")) ** GOTO lbl-1000
                            var19_14 = 9;
                            break block34;
                        }
                        if (!var17_12.equals((Object)"rz")) ** GOTO lbl-1000
                        var19_14 = 3;
                        break block34;
                    }
                    if (!var17_12.equals((Object)"eo")) ** GOTO lbl-1000
                    var19_14 = 7;
                    break block34;
                }
                if (var17_12.equals((Object)"a")) {
                    var19_14 = 0;
                } else lbl-1000: // 10 sources:
                {
                    var19_14 = -1;
                }
            }
            switch (var19_14) {
                default: {
                    var0.skipValue();
                    ** break;
                }
                case 9: {
                    var11_11 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                    ** break;
                }
                case 8: {
                    var10_10 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                    ** break;
                }
                case 7: {
                    var9_9 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                    ** break;
                }
                case 6: {
                    var8_8 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                    ** break;
                }
                case 5: {
                    var5_5 = com.airbnb.lottie.e.d.b(var0, var1_1);
                    ** break;
                }
                case 3: {
                    var1_1.a("Lottie doesn't support 3D layers.");
                }
                case 4: {
                    var20_15 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                    if (var20_15.c().isEmpty()) {
                        var24_18 = var20_15.c();
                        var25_19 = new com.airbnb.lottie.g.a<Float>(var1_1, Float.valueOf((float)0.0f), Float.valueOf((float)0.0f), null, 0.0f, Float.valueOf((float)var1_1.g()));
                        var24_18.add(var25_19);
                    } else if (((com.airbnb.lottie.g.a)var20_15.c().get((int)0)).a == null) {
                        var21_16 = var20_15.c();
                        var22_17 = new com.airbnb.lottie.g.a<Float>(var1_1, Float.valueOf((float)0.0f), Float.valueOf((float)0.0f), null, 0.0f, Float.valueOf((float)var1_1.g()));
                        var21_16.set(0, var22_17);
                    }
                    var7_7 = var20_15;
                    ** break;
                }
                case 2: {
                    var4_4 = com.airbnb.lottie.e.d.d(var0, var1_1);
                    ** break;
                }
                case 1: {
                    var6_6 = a.b(var0, var1_1);
                    ** break;
                }
                case 0: 
            }
            var0.beginObject();
            while (var0.hasNext()) {
                if (var0.nextName().equals((Object)"k")) {
                    var3_3 = a.a(var0, var1_1);
                    continue;
                }
                var0.skipValue();
            }
            var0.endObject();
lbl115: // 10 sources:
        }
        if (var2_2) {
            var0.endObject();
        }
        if (var3_3 == null) {
            Log.w((String)"LOTTIE", (String)"Layer has no transform property. You may be using an unsupported layer type such as a camera.");
            var3_3 = new e();
        }
        var12_20 = var3_3;
        if (var4_4 == null) {
            var4_4 = new g(new com.airbnb.lottie.g.d(1.0f, 1.0f));
        }
        var13_21 = var4_4;
        if (var5_5 == null) {
            var5_5 = new com.airbnb.lottie.c.a.d();
        }
        var14_22 = var5_5;
        return new l(var12_20, var6_6, var13_21, var7_7, var14_22, var8_8, var9_9, var10_10, var11_11);
    }
}

