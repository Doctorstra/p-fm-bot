/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.a
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.b.p
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.a.a;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.b.p;
import com.airbnb.lottie.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ah {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static p a(JsonReader var0, d var1_1) throws IOException {
        block43 : {
            block41 : {
                block42 : {
                    var2_2 = new ArrayList();
                    var3_3 = null;
                    var4_4 = null;
                    var5_5 = null;
                    var6_6 = null;
                    var7_7 = null;
                    var8_8 = null;
                    var9_9 = null;
                    var10_10 = 0.0f;
                    var11_11 = false;
                    block11 : do {
                        block38 : {
                            block30 : {
                                block31 : {
                                    block32 : {
                                        block33 : {
                                            block34 : {
                                                block35 : {
                                                    block36 : {
                                                        block37 : {
                                                            if (!var0.hasNext()) {
                                                                return new p(var3_3, var4_4, (List)var2_2, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11);
                                                            }
                                                            var13_12 = var0.nextName();
                                                            var14_13 = var13_12.hashCode();
                                                            if (var14_13 == 99) break block30;
                                                            if (var14_13 == 100) break block31;
                                                            if (var14_13 == 111) break block32;
                                                            if (var14_13 == 119) break block33;
                                                            if (var14_13 == 3324) break block34;
                                                            if (var14_13 == 3447) break block35;
                                                            if (var14_13 == 3454) break block36;
                                                            if (var14_13 == 3487) break block37;
                                                            if (var14_13 != 3519 || !var13_12.equals((Object)"nm")) ** GOTO lbl-1000
                                                            var15_14 = 0;
                                                            break block38;
                                                        }
                                                        if (!var13_12.equals((Object)"ml")) ** GOTO lbl-1000
                                                        var15_14 = 6;
                                                        break block38;
                                                    }
                                                    if (!var13_12.equals((Object)"lj")) ** GOTO lbl-1000
                                                    var15_14 = 5;
                                                    break block38;
                                                }
                                                if (!var13_12.equals((Object)"lc")) ** GOTO lbl-1000
                                                var15_14 = 4;
                                                break block38;
                                            }
                                            if (!var13_12.equals((Object)"hd")) ** GOTO lbl-1000
                                            var15_14 = 7;
                                            break block38;
                                        }
                                        if (!var13_12.equals((Object)"w")) ** GOTO lbl-1000
                                        var15_14 = 2;
                                        break block38;
                                    }
                                    if (!var13_12.equals((Object)"o")) ** GOTO lbl-1000
                                    var15_14 = 3;
                                    break block38;
                                }
                                if (!var13_12.equals((Object)"d")) ** GOTO lbl-1000
                                var15_14 = 8;
                                break block38;
                            }
                            if (var13_12.equals((Object)"c")) {
                                var15_14 = 1;
                            } else lbl-1000: // 9 sources:
                            {
                                var15_14 = -1;
                            }
                        }
                        switch (var15_14) {
                            default: {
                                var0.skipValue();
                                continue block11;
                            }
                            case 8: {
                                var0.beginArray();
lbl67: // 2 sources:
                                do {
                                    if (var0.hasNext()) {
                                        var0.beginObject();
                                        var18_16 = null;
                                        var19_17 = null;
                                        break block11;
                                    }
                                    var16_15 = var4_4;
                                    var0.endArray();
                                    if (var2_2.size() == 1) {
                                        var2_2.add(var2_2.get(0));
                                    }
                                    var4_4 = var16_15;
                                    continue block11;
                                    break;
                                } while (true);
                            }
                            case 7: {
                                var11_11 = var0.nextBoolean();
                                continue block11;
                            }
                            case 6: {
                                var10_10 = (float)var0.nextDouble();
                                continue block11;
                            }
                            case 5: {
                                var9_9 = p.b.values()[var0.nextInt() - 1];
                                continue block11;
                            }
                            case 4: {
                                var8_8 = p.a.values()[var0.nextInt() - 1];
                                continue block11;
                            }
                            case 3: {
                                var6_6 = com.airbnb.lottie.e.d.b(var0, var1_1);
                                continue block11;
                            }
                            case 2: {
                                var7_7 = com.airbnb.lottie.e.d.a(var0, var1_1);
                                continue block11;
                            }
                            case 1: {
                                var5_5 = com.airbnb.lottie.e.d.g(var0, var1_1);
                                continue block11;
                            }
                            case 0: {
                                var3_3 = var0.nextString();
                                continue block11;
                            }
                        }
                        break;
                    } while (true);
                    while (var0.hasNext()) {
                        block40 : {
                            block39 : {
                                var24_21 = var0.nextName();
                                var25_22 = var24_21.hashCode();
                                var26_23 = var4_4;
                                if (var25_22 == 110) break block39;
                                if (var25_22 != 118 || !var24_21.equals((Object)"v")) ** GOTO lbl-1000
                                var27_24 = 1;
                                break block40;
                            }
                            if (var24_21.equals((Object)"n")) {
                                var27_24 = 0;
                            } else lbl-1000: // 2 sources:
                            {
                                var27_24 = -1;
                            }
                        }
                        if (var27_24 != 0) {
                            if (var27_24 != 1) {
                                var0.skipValue();
                            } else {
                                var19_17 = com.airbnb.lottie.e.d.a(var0, var1_1);
                            }
                        } else {
                            var18_16 = var0.nextString();
                        }
                        var4_4 = var26_23;
                    }
                    var20_18 = var4_4;
                    var0.endObject();
                    var21_19 = var18_16.hashCode();
                    if (var21_19 == 100) break block41;
                    if (var21_19 == 103) break block42;
                    if (var21_19 != 111 || !var18_16.equals((Object)"o")) ** GOTO lbl-1000
                    var22_20 = 0;
                    break block43;
                }
                if (!var18_16.equals((Object)"g")) ** GOTO lbl-1000
                var22_20 = 2;
                break block43;
            }
            if (var18_16.equals((Object)"d")) {
                var22_20 = 1;
            } else lbl-1000: // 3 sources:
            {
                var22_20 = -1;
            }
        }
        if (var22_20 != 0) {
            if (var22_20 == 1 || var22_20 == 2) {
                var1_1.a(true);
                var2_2.add((Object)var19_17);
            }
        } else {
            var20_18 = var19_17;
        }
        var4_4 = var20_18;
        ** while (true)
    }
}

