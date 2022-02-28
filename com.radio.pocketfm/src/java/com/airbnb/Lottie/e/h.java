/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.b;
import com.airbnb.lottie.e.aj;
import com.airbnb.lottie.e.p;
import java.io.IOException;

public class h
implements aj<b> {
    public static final h a = new h();

    private h() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public b a(JsonReader var1_1, float var2_2) throws IOException {
        var3_3 = b.a.c;
        var1_1.beginObject();
        var4_4 = var3_3;
        var5_5 = null;
        var6_6 = null;
        var13_10 = var11_9 = (var9_8 = (var7_7 = 0.0));
        var15_11 = 0;
        var16_12 = 0;
        var17_13 = 0;
        var18_14 = true;
        block13 : do {
            block27 : {
                block17 : {
                    block18 : {
                        block19 : {
                            block20 : {
                                block21 : {
                                    block22 : {
                                        block23 : {
                                            block24 : {
                                                block25 : {
                                                    block26 : {
                                                        if (!var1_1.hasNext()) {
                                                            var1_1.endObject();
                                                            return new b(var5_5, var6_6, var7_7, var4_4, var15_11, var9_8, var11_9, var16_12, var17_13, var13_10, var18_14);
                                                        }
                                                        var20_15 = var1_1.nextName();
                                                        var21_16 = var20_15.hashCode();
                                                        if (var21_16 == 102) break block17;
                                                        if (var21_16 == 106) break block18;
                                                        if (var21_16 == 3261) break block19;
                                                        if (var21_16 == 3452) break block20;
                                                        if (var21_16 == 3463) break block21;
                                                        if (var21_16 == 3543) break block22;
                                                        if (var21_16 == 3664) break block23;
                                                        if (var21_16 == 3684) break block24;
                                                        if (var21_16 == 3710) break block25;
                                                        if (var21_16 == 115) break block26;
                                                        if (var21_16 != 116 || !var20_15.equals((Object)"t")) ** GOTO lbl-1000
                                                        var22_17 = 0;
                                                        break block27;
                                                    }
                                                    if (!var20_15.equals((Object)"s")) ** GOTO lbl-1000
                                                    var22_17 = 2;
                                                    break block27;
                                                }
                                                if (!var20_15.equals((Object)"tr")) ** GOTO lbl-1000
                                                var22_17 = 4;
                                                break block27;
                                            }
                                            if (!var20_15.equals((Object)"sw")) ** GOTO lbl-1000
                                            var22_17 = 9;
                                            break block27;
                                        }
                                        if (!var20_15.equals((Object)"sc")) ** GOTO lbl-1000
                                        var22_17 = 8;
                                        break block27;
                                    }
                                    if (!var20_15.equals((Object)"of")) ** GOTO lbl-1000
                                    var22_17 = 10;
                                    break block27;
                                }
                                if (!var20_15.equals((Object)"ls")) ** GOTO lbl-1000
                                var22_17 = 6;
                                break block27;
                            }
                            if (!var20_15.equals((Object)"lh")) ** GOTO lbl-1000
                            var22_17 = 5;
                            break block27;
                        }
                        if (!var20_15.equals((Object)"fc")) ** GOTO lbl-1000
                        var22_17 = 7;
                        break block27;
                    }
                    if (!var20_15.equals((Object)"j")) ** GOTO lbl-1000
                    var22_17 = 3;
                    break block27;
                }
                if (var20_15.equals((Object)"f")) {
                    var22_17 = 1;
                } else lbl-1000: // 11 sources:
                {
                    var22_17 = -1;
                }
            }
            switch (var22_17) {
                default: {
                    var1_1.skipValue();
                    continue block13;
                }
                case 10: {
                    var18_14 = var1_1.nextBoolean();
                    continue block13;
                }
                case 9: {
                    var13_10 = var1_1.nextDouble();
                    continue block13;
                }
                case 8: {
                    var17_13 = p.a(var1_1);
                    continue block13;
                }
                case 7: {
                    var16_12 = p.a(var1_1);
                    continue block13;
                }
                case 6: {
                    var11_9 = var1_1.nextDouble();
                    continue block13;
                }
                case 5: {
                    var9_8 = var1_1.nextDouble();
                    continue block13;
                }
                case 4: {
                    var15_11 = var1_1.nextInt();
                    continue block13;
                }
                case 3: {
                    var23_18 = var1_1.nextInt();
                    var24_19 = var23_18 <= b.a.c.ordinal() && var23_18 >= 0 ? b.a.values()[var23_18] : b.a.c;
                    var4_4 = var24_19;
                    continue block13;
                }
                case 2: {
                    var7_7 = var1_1.nextDouble();
                    continue block13;
                }
                case 1: {
                    var6_6 = var1_1.nextString();
                    continue block13;
                }
                case 0: 
            }
            var5_5 = var1_1.nextString();
        } while (true);
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader, float f2) throws IOException {
        return this.a(jsonReader, f2);
    }
}

