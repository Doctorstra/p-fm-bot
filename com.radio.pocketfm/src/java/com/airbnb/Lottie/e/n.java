/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.c
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.a.f
 *  com.airbnb.lottie.c.b.e
 *  com.airbnb.lottie.c.b.p
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.c;
import com.airbnb.lottie.c.b.e;
import com.airbnb.lottie.c.b.f;
import com.airbnb.lottie.c.b.p;
import com.airbnb.lottie.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class n {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static e a(JsonReader var0, d var1_1) throws IOException {
        var2_2 = new ArrayList();
        var3_3 = null;
        var4_4 = null;
        var5_5 = null;
        var6_6 = null;
        var7_7 = null;
        var8_8 = null;
        var9_9 = null;
        var10_10 = null;
        var11_11 = null;
        var12_12 = 0.0f;
        var13_13 = null;
        var14_14 = false;
        block14 : do {
            block51 : {
                block50 : {
                    block49 : {
                        block48 : {
                            block47 : {
                                block36 : {
                                    block37 : {
                                        block38 : {
                                            block39 : {
                                                block40 : {
                                                    block41 : {
                                                        block42 : {
                                                            block43 : {
                                                                block44 : {
                                                                    block45 : {
                                                                        block46 : {
                                                                            if (!var0.hasNext()) {
                                                                                var15_40 = var9_9;
                                                                                var16_41 = var10_10;
                                                                                var17_42 = var11_11;
                                                                                var18_43 = var12_12;
                                                                                var19_44 = var13_13;
                                                                                var20_45 = var14_14;
                                                                                return new e(var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var15_40, var16_41, var17_42, var18_43, (List)var2_2, var19_44, var20_45);
                                                                            }
                                                                            var22_15 = var0.nextName();
                                                                            var23_16 = var22_15.hashCode();
                                                                            var24_17 = var14_14;
                                                                            var25_18 = var13_13;
                                                                            var26_19 = var12_12;
                                                                            var27_20 = var11_11;
                                                                            if (var23_16 == 100) break block36;
                                                                            if (var23_16 == 101) break block37;
                                                                            if (var23_16 == 103) break block38;
                                                                            if (var23_16 == 111) break block39;
                                                                            if (var23_16 == 119) break block40;
                                                                            if (var23_16 == 3324) break block41;
                                                                            if (var23_16 == 3447) break block42;
                                                                            if (var23_16 == 3454) break block43;
                                                                            if (var23_16 == 3487) break block44;
                                                                            if (var23_16 == 3519) break block45;
                                                                            if (var23_16 == 115) break block46;
                                                                            if (var23_16 != 116 || !var22_15.equals((Object)"t")) ** GOTO lbl-1000
                                                                            var28_21 = 3;
                                                                            break block47;
                                                                        }
                                                                        if (!var22_15.equals((Object)"s")) ** GOTO lbl-1000
                                                                        var28_21 = 4;
                                                                        break block47;
                                                                    }
                                                                    if (!var22_15.equals((Object)"nm")) ** GOTO lbl-1000
                                                                    var28_21 = 0;
                                                                    break block47;
                                                                }
                                                                if (!var22_15.equals((Object)"ml")) ** GOTO lbl-1000
                                                                var28_21 = 9;
                                                                break block47;
                                                            }
                                                            if (!var22_15.equals((Object)"lj")) ** GOTO lbl-1000
                                                            var28_21 = 8;
                                                            break block47;
                                                        }
                                                        if (!var22_15.equals((Object)"lc")) ** GOTO lbl-1000
                                                        var28_21 = 7;
                                                        break block47;
                                                    }
                                                    if (!var22_15.equals((Object)"hd")) ** GOTO lbl-1000
                                                    var28_21 = 10;
                                                    break block47;
                                                }
                                                if (!var22_15.equals((Object)"w")) ** GOTO lbl-1000
                                                var28_21 = 6;
                                                break block47;
                                            }
                                            if (!var22_15.equals((Object)"o")) ** GOTO lbl-1000
                                            var28_21 = 2;
                                            break block47;
                                        }
                                        if (!var22_15.equals((Object)"g")) ** GOTO lbl-1000
                                        var28_21 = 1;
                                        break block47;
                                    }
                                    if (!var22_15.equals((Object)"e")) ** GOTO lbl-1000
                                    var28_21 = 5;
                                    break block47;
                                }
                                if (var22_15.equals((Object)"d")) {
                                    var28_21 = 11;
                                } else lbl-1000: // 12 sources:
                                {
                                    var28_21 = -1;
                                }
                            }
                            switch (var28_21) {
                                default: {
                                    var29_22 = var9_9;
                                    var0.skipValue();
                                    break block48;
                                }
                                case 11: {
                                    var0.beginArray();
lbl96: // 2 sources:
                                    do {
                                        if (var0.hasNext()) {
                                            var0.beginObject();
                                            var45_31 = null;
                                            var46_32 = null;
                                            break block14;
                                        }
                                        var29_22 = var9_9;
                                        var31_23 = var10_10;
                                        var0.endArray();
                                        if (var2_2.size() == 1) {
                                            var2_2.add(var2_2.get(0));
                                        }
                                        ** GOTO lbl183
                                        break;
                                    } while (true);
                                }
                                case 10: {
                                    var29_22 = var9_9;
                                    var14_14 = var0.nextBoolean();
                                    break block49;
                                }
                                case 9: {
                                    var29_22 = var9_9;
                                    var42_30 = var10_10;
                                    var12_12 = (float)var0.nextDouble();
                                    var14_14 = var24_17;
                                    var10_10 = var42_30;
                                    var13_13 = var25_18;
                                    break block50;
                                }
                                case 8: {
                                    var29_22 = var9_9;
                                    var41_29 = var10_10;
                                    var11_11 = p.b.values()[var0.nextInt() - 1];
                                    var14_14 = var24_17;
                                    var10_10 = var41_29;
                                    var13_13 = var25_18;
                                    var12_12 = var26_19;
                                    break block51;
                                }
                                case 7: {
                                    var29_22 = var9_9;
                                    var10_10 = p.a.values()[var0.nextInt() - 1];
                                    break block48;
                                }
                                case 6: {
                                    var29_22 = com.airbnb.lottie.e.d.a(var0, var1_1);
                                    var14_14 = var24_17;
                                    var13_13 = var25_18;
                                    var12_12 = var26_19;
                                    var11_11 = var27_20;
                                    break block51;
                                }
                                case 5: {
                                    var29_22 = var9_9;
                                    var8_8 = com.airbnb.lottie.e.d.c(var0, var1_1);
                                    break block48;
                                }
                                case 4: {
                                    var29_22 = var9_9;
                                    var7_7 = com.airbnb.lottie.e.d.c(var0, var1_1);
                                    break block48;
                                }
                                case 3: {
                                    var29_22 = var9_9;
                                    var31_23 = var10_10;
                                    var37_28 = var0.nextInt() == 1 ? f.a : f.b;
                                    var4_4 = var37_28;
                                    ** GOTO lbl183
                                }
                                case 2: {
                                    var29_22 = var9_9;
                                    var6_6 = com.airbnb.lottie.e.d.b(var0, var1_1);
                                    break block48;
                                }
                                case 1: {
                                    var29_22 = var9_9;
                                    var31_23 = var10_10;
                                    var0.beginObject();
                                    var32_24 = -1;
                                    while (var0.hasNext()) {
                                        var33_25 = var0.nextName();
                                        var34_26 = var33_25.hashCode();
                                        if (var34_26 == 107) ** GOTO lbl170
                                        if (var34_26 != 112 || !var33_25.equals((Object)"p")) ** GOTO lbl-1000
                                        var35_27 = 0;
                                        ** GOTO lbl174
lbl170: // 1 sources:
                                        if (var33_25.equals((Object)"k")) {
                                            var35_27 = 1;
                                        } else lbl-1000: // 2 sources:
                                        {
                                            var35_27 = -1;
                                        }
lbl174: // 3 sources:
                                        if (var35_27 != 0) {
                                            if (var35_27 != 1) {
                                                var0.skipValue();
                                                continue;
                                            }
                                            var5_5 = com.airbnb.lottie.e.d.a(var0, var1_1, var32_24);
                                            continue;
                                        }
                                        var32_24 = var0.nextInt();
                                    }
                                    var0.endObject();
lbl183: // 3 sources:
                                    var14_14 = var24_17;
                                    var10_10 = var31_23;
                                    break block49;
                                }
                                case 0: 
                            }
                            var29_22 = var9_9;
                            var3_3 = var0.nextString();
                        }
                        var14_14 = var24_17;
                    }
                    var13_13 = var25_18;
                    var12_12 = var26_19;
                }
                var11_11 = var27_20;
            }
            var9_9 = var29_22;
        } while (true);
        while (var0.hasNext()) {
            block53 : {
                block52 : {
                    var50_35 = var0.nextName();
                    var51_36 = var10_10;
                    var52_37 = var50_35.hashCode();
                    var53_38 = var9_9;
                    if (var52_37 == 110) break block52;
                    if (var52_37 != 118 || !var50_35.equals((Object)"v")) ** GOTO lbl-1000
                    var54_39 = 1;
                    break block53;
                }
                if (var50_35.equals((Object)"n")) {
                    var54_39 = 0;
                } else lbl-1000: // 2 sources:
                {
                    var54_39 = -1;
                }
            }
            if (var54_39 != 0) {
                if (var54_39 != 1) {
                    var0.skipValue();
                } else {
                    var46_32 = com.airbnb.lottie.e.d.a(var0, var1_1);
                }
            } else {
                var45_31 = var0.nextString();
            }
            var10_10 = var51_36;
            var9_9 = var53_38;
        }
        var47_33 = var9_9;
        var48_34 = var10_10;
        var0.endObject();
        if (var45_31.equals((Object)"o")) {
            var25_18 = var46_32;
        } else if (var45_31.equals((Object)"d") || var45_31.equals((Object)"g")) {
            var1_1.a(true);
            var2_2.add(var46_32);
        }
        var10_10 = var48_34;
        var9_9 = var47_33;
        ** while (true)
    }
}

