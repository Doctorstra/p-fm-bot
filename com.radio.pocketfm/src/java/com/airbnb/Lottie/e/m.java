/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.c
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.a.f
 *  com.airbnb.lottie.c.b.d
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.graphics.Path;
import android.util.JsonReader;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.c;
import com.airbnb.lottie.c.b.f;
import com.airbnb.lottie.d;
import java.io.IOException;

class m {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static com.airbnb.lottie.c.b.d a(JsonReader var0, d var1_1) throws IOException {
        var2_2 = Path.FillType.WINDING;
        var3_3 = null;
        var4_4 = null;
        var5_5 = null;
        var6_6 = null;
        var7_7 = null;
        var8_8 = null;
        var9_9 = false;
        block15 : do {
            block32 : {
                block27 : {
                    block28 : {
                        block29 : {
                            block30 : {
                                block31 : {
                                    if (!var0.hasNext()) {
                                        return new com.airbnb.lottie.c.b.d(var3_3, var4_4, var2_2, var5_5, var6_6, var7_7, var8_8, null, null, var9_9);
                                    }
                                    var11_10 = var0.nextName();
                                    var12_11 = var11_10.hashCode();
                                    if (var12_11 == 101) break block27;
                                    if (var12_11 == 103) break block28;
                                    if (var12_11 == 111) break block29;
                                    if (var12_11 == 3324) break block30;
                                    if (var12_11 == 3519) break block31;
                                    switch (var12_11) {
                                        default: {
                                            ** GOTO lbl-1000
                                        }
                                        case 116: {
                                            if (var11_10.equals((Object)"t")) {
                                                var13_12 = 3;
                                                ** break;
                                            }
                                            ** GOTO lbl-1000
                                        }
                                        case 115: {
                                            if (var11_10.equals((Object)"s")) {
                                                var13_12 = 4;
                                                ** break;
                                            }
                                            ** GOTO lbl-1000
                                        }
                                        case 114: {
                                            if (var11_10.equals((Object)"r")) {
                                                var13_12 = 6;
                                                ** break;
                                            }
                                            ** GOTO lbl-1000
lbl37: // 3 sources:
                                            break;
                                        }
                                    }
                                    break block32;
                                }
                                if (!var11_10.equals((Object)"nm")) ** GOTO lbl-1000
                                var13_12 = 0;
                                break block32;
                            }
                            if (!var11_10.equals((Object)"hd")) ** GOTO lbl-1000
                            var13_12 = 7;
                            break block32;
                        }
                        if (!var11_10.equals((Object)"o")) ** GOTO lbl-1000
                        var13_12 = 2;
                        break block32;
                    }
                    if (!var11_10.equals((Object)"g")) ** GOTO lbl-1000
                    var13_12 = 1;
                    break block32;
                }
                if (var11_10.equals((Object)"e")) {
                    var13_12 = 5;
                } else lbl-1000: // 9 sources:
                {
                    var13_12 = -1;
                }
            }
            switch (var13_12) {
                default: {
                    var0.skipValue();
                    continue block15;
                }
                case 7: {
                    var9_9 = var0.nextBoolean();
                    continue block15;
                }
                case 6: {
                    var19_18 = var0.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    var2_2 = var19_18;
                    continue block15;
                }
                case 5: {
                    var8_8 = com.airbnb.lottie.e.d.c(var0, var1_1);
                    continue block15;
                }
                case 4: {
                    var7_7 = com.airbnb.lottie.e.d.c(var0, var1_1);
                    continue block15;
                }
                case 3: {
                    var18_17 = var0.nextInt() == 1 ? f.a : f.b;
                    var4_4 = var18_17;
                    continue block15;
                }
                case 2: {
                    var6_6 = com.airbnb.lottie.e.d.b(var0, var1_1);
                    continue block15;
                }
                case 1: {
                    var0.beginObject();
                    var14_13 = -1;
                    while (var0.hasNext()) {
                        var15_14 = var0.nextName();
                        var16_15 = var15_14.hashCode();
                        if (var16_15 == 107) ** GOTO lbl95
                        if (var16_15 != 112 || !var15_14.equals((Object)"p")) ** GOTO lbl-1000
                        var17_16 = 0;
                        ** GOTO lbl99
lbl95: // 1 sources:
                        if (var15_14.equals((Object)"k")) {
                            var17_16 = 1;
                        } else lbl-1000: // 2 sources:
                        {
                            var17_16 = -1;
                        }
lbl99: // 3 sources:
                        if (var17_16 != 0) {
                            if (var17_16 != 1) {
                                var0.skipValue();
                                continue;
                            }
                            var5_5 = com.airbnb.lottie.e.d.a(var0, var1_1, var14_13);
                            continue;
                        }
                        var14_13 = var0.nextInt();
                    }
                    var0.endObject();
                    continue block15;
                }
                case 0: 
            }
            var3_3 = var0.nextString();
        } while (true);
    }
}

