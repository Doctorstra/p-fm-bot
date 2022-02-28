/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.b.i
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.c.b.i;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.a;
import java.io.IOException;

class z {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static i a(JsonReader var0, d var1_1) throws IOException {
        var2_2 = null;
        var3_3 = null;
        var4_4 = null;
        var5_5 = null;
        var6_6 = null;
        var7_7 = null;
        var8_8 = null;
        var9_9 = null;
        var10_10 = null;
        var11_11 = false;
        block12 : do {
            block25 : {
                block16 : {
                    block17 : {
                        block18 : {
                            block19 : {
                                block20 : {
                                    block21 : {
                                        block22 : {
                                            block23 : {
                                                block24 : {
                                                    if (!var0.hasNext()) {
                                                        return new i(var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11);
                                                    }
                                                    var13_12 = var0.nextName();
                                                    var14_13 = var13_12.hashCode();
                                                    if (var14_13 == 112) break block16;
                                                    if (var14_13 == 114) break block17;
                                                    if (var14_13 == 3324) break block18;
                                                    if (var14_13 == 3519) break block19;
                                                    if (var14_13 == 3588) break block20;
                                                    if (var14_13 == 3686) break block21;
                                                    if (var14_13 == 3369) break block22;
                                                    if (var14_13 == 3370) break block23;
                                                    if (var14_13 == 3555) break block24;
                                                    if (var14_13 != 3556 || !var13_12.equals((Object)"os")) ** GOTO lbl-1000
                                                    var15_14 = 6;
                                                    break block25;
                                                }
                                                if (!var13_12.equals((Object)"or")) ** GOTO lbl-1000
                                                var15_14 = 5;
                                                break block25;
                                            }
                                            if (!var13_12.equals((Object)"is")) ** GOTO lbl-1000
                                            var15_14 = 8;
                                            break block25;
                                        }
                                        if (!var13_12.equals((Object)"ir")) ** GOTO lbl-1000
                                        var15_14 = 7;
                                        break block25;
                                    }
                                    if (!var13_12.equals((Object)"sy")) ** GOTO lbl-1000
                                    var15_14 = 1;
                                    break block25;
                                }
                                if (!var13_12.equals((Object)"pt")) ** GOTO lbl-1000
                                var15_14 = 2;
                                break block25;
                            }
                            if (!var13_12.equals((Object)"nm")) ** GOTO lbl-1000
                            var15_14 = 0;
                            break block25;
                        }
                        if (!var13_12.equals((Object)"hd")) ** GOTO lbl-1000
                        var15_14 = 9;
                        break block25;
                    }
                    if (!var13_12.equals((Object)"r")) ** GOTO lbl-1000
                    var15_14 = 4;
                    break block25;
                }
                if (var13_12.equals((Object)"p")) {
                    var15_14 = 3;
                } else lbl-1000: // 10 sources:
                {
                    var15_14 = -1;
                }
            }
            switch (var15_14) {
                default: {
                    var0.skipValue();
                    continue block12;
                }
                case 9: {
                    var11_11 = var0.nextBoolean();
                    continue block12;
                }
                case 8: {
                    var9_9 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                    continue block12;
                }
                case 7: {
                    var7_7 = com.airbnb.lottie.e.d.a(var0, var1_1);
                    continue block12;
                }
                case 6: {
                    var10_10 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                    continue block12;
                }
                case 5: {
                    var8_8 = com.airbnb.lottie.e.d.a(var0, var1_1);
                    continue block12;
                }
                case 4: {
                    var6_6 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                    continue block12;
                }
                case 3: {
                    var5_5 = a.b(var0, var1_1);
                    continue block12;
                }
                case 2: {
                    var4_4 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                    continue block12;
                }
                case 1: {
                    var3_3 = i.a.a(var0.nextInt());
                    continue block12;
                }
                case 0: 
            }
            var2_2 = var0.nextString();
        } while (true);
    }
}

