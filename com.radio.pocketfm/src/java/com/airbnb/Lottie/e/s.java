/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.Rect
 *  android.util.JsonReader
 *  android.view.animation.Interpolator
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.a.j
 *  com.airbnb.lottie.c.a.l
 *  java.io.IOException
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package com.airbnb.lottie.e;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import com.airbnb.lottie.c.a.j;
import com.airbnb.lottie.c.a.k;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.c.c.d;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.b;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.e.g;
import com.airbnb.lottie.e.u;
import com.airbnb.lottie.f.f;
import com.airbnb.lottie.g.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class s {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static com.airbnb.lottie.c.c.d a(JsonReader var0, d var1_1) throws IOException {
        block69 : {
            var2_2 = d.b.a;
            var3_3 = new ArrayList();
            var4_4 = new ArrayList();
            var0.beginObject();
            var5_5 = Float.valueOf((float)1.0f);
            var6_6 = Float.valueOf((float)0.0f);
            var7_7 = var2_2;
            var8_8 = null;
            var9_9 = null;
            var10_10 = null;
            var11_11 = null;
            var12_12 = null;
            var13_13 = null;
            var14_14 = 0L;
            var16_15 = -1L;
            var18_16 = 0.0f;
            var19_17 = 0.0f;
            var20_18 = 1.0f;
            var21_19 = 0;
            var22_20 = 0;
            var23_21 = 0;
            var24_22 = 0;
            var25_23 = 0;
            var26_24 = 0.0f;
            var27_25 = false;
            var28_26 = null;
            var29_27 = "UNSET";
            while (var0.hasNext()) {
                block70 : {
                    var56_33 = var0.nextName();
                    switch (var56_33.hashCode()) {
                        default: {
                            break;
                        }
                        case 1441620890: {
                            if (!var56_33.equals((Object)"masksProperties")) break;
                            var57_34 = 10;
                            break block70;
                        }
                        case 108390670: {
                            if (!var56_33.equals((Object)"refId")) break;
                            var57_34 = 2;
                            break block70;
                        }
                        case 104415: {
                            if (!var56_33.equals((Object)"ind")) break;
                            var57_34 = 1;
                            break block70;
                        }
                        case 3717: {
                            if (!var56_33.equals((Object)"ty")) break;
                            var57_34 = 3;
                            break block70;
                        }
                        case 3712: {
                            if (!var56_33.equals((Object)"tt")) break;
                            var57_34 = 9;
                            break block70;
                        }
                        case 3705: {
                            if (!var56_33.equals((Object)"tm")) break;
                            var57_34 = 20;
                            break block70;
                        }
                        case 3684: {
                            if (!var56_33.equals((Object)"sw")) break;
                            var57_34 = 5;
                            break block70;
                        }
                        case 3681: {
                            if (!var56_33.equals((Object)"st")) break;
                            var57_34 = 15;
                            break block70;
                        }
                        case 3679: {
                            if (!var56_33.equals((Object)"sr")) break;
                            var57_34 = 14;
                            break block70;
                        }
                        case 3669: {
                            if (!var56_33.equals((Object)"sh")) break;
                            var57_34 = 6;
                            break block70;
                        }
                        case 3664: {
                            if (!var56_33.equals((Object)"sc")) break;
                            var57_34 = 7;
                            break block70;
                        }
                        case 3553: {
                            if (!var56_33.equals((Object)"op")) break;
                            var57_34 = 19;
                            break block70;
                        }
                        case 3519: {
                            if (!var56_33.equals((Object)"nm")) break;
                            var57_34 = 0;
                            break block70;
                        }
                        case 3432: {
                            if (!var56_33.equals((Object)"ks")) break;
                            var57_34 = 8;
                            break block70;
                        }
                        case 3367: {
                            if (!var56_33.equals((Object)"ip")) break;
                            var57_34 = 18;
                            break block70;
                        }
                        case 3324: {
                            if (!var56_33.equals((Object)"hd")) break;
                            var57_34 = 22;
                            break block70;
                        }
                        case 3233: {
                            if (!var56_33.equals((Object)"ef")) break;
                            var57_34 = 13;
                            break block70;
                        }
                        case 3177: {
                            if (!var56_33.equals((Object)"cl")) break;
                            var57_34 = 21;
                            break block70;
                        }
                        case 119: {
                            if (!var56_33.equals((Object)"w")) break;
                            var57_34 = 16;
                            break block70;
                        }
                        case 116: {
                            if (!var56_33.equals((Object)"t")) break;
                            var57_34 = 12;
                            break block70;
                        }
                        case 104: {
                            if (!var56_33.equals((Object)"h")) break;
                            var57_34 = 17;
                            break block70;
                        }
                        case -903568142: {
                            if (!var56_33.equals((Object)"shapes")) break;
                            var57_34 = 11;
                            break block70;
                        }
                        case -995424086: {
                            if (!var56_33.equals((Object)"parent")) break;
                            var57_34 = 4;
                            break block70;
                        }
                    }
                    var57_34 = -1;
                }
                switch (var57_34) {
                    default: {
                        var0.skipValue();
                        ** break;
                    }
                    case 22: {
                        var27_25 = var0.nextBoolean();
                        ** break;
                    }
                    case 21: {
                        var28_26 = var0.nextString();
                        ** break;
                    }
                    case 20: {
                        var13_13 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                        ** break;
                    }
                    case 19: {
                        var19_17 = (float)var0.nextDouble();
                        ** break;
                    }
                    case 18: {
                        var18_16 = (float)var0.nextDouble();
                        ** break;
                    }
                    case 17: {
                        var25_23 = (int)((float)var0.nextInt() * f.a());
                        ** break;
                    }
                    case 16: {
                        var24_22 = (int)((float)var0.nextInt() * f.a());
                        ** break;
                    }
                    case 15: {
                        var26_24 = (float)var0.nextDouble();
                        ** break;
                    }
                    case 14: {
                        var20_18 = (float)var0.nextDouble();
                        ** break;
                    }
                    case 13: {
                        var0.beginArray();
                        var65_29 = new ArrayList();
lbl161: // 2 sources:
                        do {
                            if (var0.hasNext()) {
                                var0.beginObject();
                                break block69;
                            }
                            var0.endArray();
                            var66_30 = new StringBuilder();
                            var66_30.append("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ");
                            var66_30.append((Object)var65_29);
                            var1_1.a(var66_30.toString());
                            ** break;
                            break;
                        } while (true);
                    }
                    case 12: {
                        var0.beginObject();
                        while (var0.hasNext()) {
                            var62_37 = var0.nextName();
                            var63_38 = var62_37.hashCode();
                            if (var63_38 == 97) ** GOTO lbl180
                            if (var63_38 != 100 || !var62_37.equals((Object)"d")) ** GOTO lbl-1000
                            var64_28 = 0;
                            ** GOTO lbl184
lbl180: // 1 sources:
                            if (var62_37.equals((Object)"a")) {
                                var64_28 = 1;
                            } else lbl-1000: // 2 sources:
                            {
                                var64_28 = -1;
                            }
lbl184: // 3 sources:
                            if (var64_28 != 0) {
                                if (var64_28 != 1) {
                                    var0.skipValue();
                                    continue;
                                }
                                var0.beginArray();
                                if (var0.hasNext()) {
                                    var12_12 = b.a(var0, var1_1);
                                }
                                while (var0.hasNext()) {
                                    var0.skipValue();
                                }
                                var0.endArray();
                                continue;
                            }
                            var11_11 = com.airbnb.lottie.e.d.f(var0, var1_1);
                        }
                        var0.endObject();
                        ** break;
                    }
                    case 11: {
                        var0.beginArray();
                        while (var0.hasNext()) {
                            var60_36 = g.a(var0, var1_1);
                            if (var60_36 == null) continue;
                            var4_4.add((Object)var60_36);
                        }
                        var0.endArray();
                        ** break;
                    }
                    case 10: {
                        var0.beginArray();
                        while (var0.hasNext()) {
                            var3_3.add((Object)u.a(var0, var1_1));
                        }
                        var1_1.a(var3_3.size());
                        var0.endArray();
                        ** break;
                    }
                    case 9: {
                        var7_7 = d.b.values()[var0.nextInt()];
                        var1_1.a(1);
                        ** break;
                    }
                    case 8: {
                        var10_10 = c.a(var0, var1_1);
                        ** break;
                    }
                    case 7: {
                        var23_21 = Color.parseColor((String)var0.nextString());
                        ** break;
                    }
                    case 6: {
                        var22_20 = (int)((float)var0.nextInt() * f.a());
                        ** break;
                    }
                    case 5: {
                        var21_19 = (int)((float)var0.nextInt() * f.a());
                        ** break;
                    }
                    case 4: {
                        var16_15 = var0.nextInt();
                        ** break;
                    }
                    case 3: {
                        var58_35 = var0.nextInt();
                        if (var58_35 < d.a.g.ordinal()) {
                            var8_8 = d.a.values()[var58_35];
                            ** break;
                        }
                        var8_8 = d.a.g;
                        ** break;
                    }
                    case 2: {
                        var9_9 = var0.nextString();
                        ** break;
                    }
                    case 1: {
                        var14_14 = var0.nextInt();
                        ** break;
                    }
                    case 0: {
                        var29_27 = var0.nextString();
lbl251: // 25 sources:
                        break;
                    }
                }
            }
            var0.endObject();
            var30_39 = var18_16 / var20_18;
            var31_40 = var19_17 / var20_18;
            var32_41 = new ArrayList();
            if (var30_39 > 0.0f) {
                var53_42 = Float.valueOf((float)var30_39);
                var33_43 = var20_18;
                var34_44 = var32_41;
                var54_45 = new a<Float>(var1_1, var6_6, var6_6, null, 0.0f, var53_42);
                var34_44.add(var54_45);
            } else {
                var33_43 = var20_18;
                var34_44 = var32_41;
            }
            if (!(var31_40 > 0.0f)) {
                var31_40 = var1_1.g();
            }
            var35_46 = new a<Float>(var1_1, var5_5, var5_5, null, var30_39, Float.valueOf((float)var31_40));
            var34_44.add(var35_46);
            var37_47 = Float.valueOf((float)Float.MAX_VALUE);
            var38_48 = new a<Float>(var1_1, var6_6, var6_6, null, var31_40, var37_47);
            var34_44.add(var38_48);
            if (var29_27.endsWith(".ai") || "ai".equals((Object)var28_26)) {
                var1_1.a("Convert your Illustrator layers to shape layers.");
            }
            var40_49 = var29_27;
            var41_50 = var14_14;
            var43_51 = var8_8;
            var44_52 = var16_15;
            var46_53 = var9_9;
            var47_54 = var10_10;
            var48_55 = var21_19;
            var49_56 = var22_20;
            var50_57 = var23_21;
            var51_58 = var34_44;
            return new com.airbnb.lottie.c.c.d((List<com.airbnb.lottie.c.b.b>)var4_4, var1_1, var40_49, var41_50, var43_51, var44_52, var46_53, (List<com.airbnb.lottie.c.b.g>)var3_3, var47_54, var48_55, var49_56, var50_57, var33_43, var26_24, var24_22, var25_23, var11_11, var12_12, (List<a<Float>>)var51_58, var7_7, var13_13, var27_25);
        }
        while (var0.hasNext()) {
            var69_31 = var0.nextName();
            var70_32 = var69_31.hashCode() == 3519 && var69_31.equals((Object)"nm") != false ? 0 : -1;
            if (var70_32 != 0) {
                var0.skipValue();
                continue;
            }
            var65_29.add((Object)var0.nextString());
        }
        var0.endObject();
        ** while (true)
    }

    public static com.airbnb.lottie.c.c.d a(d d2) {
        Rect rect = d2.d();
        com.airbnb.lottie.c.c.d d3 = new com.airbnb.lottie.c.c.d((List<com.airbnb.lottie.c.b.b>)Collections.emptyList(), d2, "__container", -1L, d.a.a, -1L, null, (List<com.airbnb.lottie.c.b.g>)Collections.emptyList(), new l(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, (List<a<Float>>)Collections.emptyList(), d.b.a, null, false);
        return d3;
    }
}

