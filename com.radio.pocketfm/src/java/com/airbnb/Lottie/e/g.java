/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  android.util.Log
 *  com.airbnb.lottie.c.b.h
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import android.util.Log;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.c.b.h;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.aa;
import com.airbnb.lottie.e.ab;
import com.airbnb.lottie.e.ae;
import com.airbnb.lottie.e.af;
import com.airbnb.lottie.e.ag;
import com.airbnb.lottie.e.ah;
import com.airbnb.lottie.e.ai;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.e.m;
import com.airbnb.lottie.e.n;
import com.airbnb.lottie.e.v;
import com.airbnb.lottie.e.z;
import java.io.IOException;

class g {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static b a(JsonReader var0, d var1_1) throws IOException {
        block41 : {
            block38 : {
                var0.beginObject();
                var2_2 = 2;
                var3_3 = 2;
                while (var0.hasNext() != false) {
                    block40 : {
                        block39 : {
                            var10_4 = var0.nextName();
                            var11_5 = var10_4.hashCode();
                            if (var11_5 == 100) break block39;
                            if (var11_5 != 3717 || !var10_4.equals((Object)"ty")) ** GOTO lbl-1000
                            var12_6 = 0;
                            break block40;
                        }
                        if (var10_4.equals((Object)"d")) {
                            var12_6 = 1;
                        } else lbl-1000: // 2 sources:
                        {
                            var12_6 = -1;
                        }
                    }
                    if (var12_6 != 0) {
                        if (var12_6 != 1) {
                            var0.skipValue();
                            continue;
                        }
                        var3_3 = var0.nextInt();
                        continue;
                    }
                    break block38;
                }
                return null;
            }
            var4_7 = var0.nextString();
            if (var4_7 == null) {
                return null;
            }
            switch (var4_7.hashCode()) {
                default: {
                    break;
                }
                case 3710: {
                    if (!var4_7.equals((Object)"tr")) break;
                    var2_2 = 5;
                    break block41;
                }
                case 3705: {
                    if (!var4_7.equals((Object)"tm")) break;
                    var2_2 = 9;
                    break block41;
                }
                case 3681: {
                    if (!var4_7.equals((Object)"st")) break;
                    var2_2 = 1;
                    break block41;
                }
                case 3679: {
                    if (!var4_7.equals((Object)"sr")) break;
                    var2_2 = 10;
                    break block41;
                }
                case 3669: {
                    if (!var4_7.equals((Object)"sh")) break;
                    var2_2 = 6;
                    break block41;
                }
                case 3646: {
                    if (!var4_7.equals((Object)"rp")) break;
                    var2_2 = 12;
                    break block41;
                }
                case 3633: {
                    if (!var4_7.equals((Object)"rc")) break;
                    var2_2 = 8;
                    break block41;
                }
                case 3488: {
                    if (!var4_7.equals((Object)"mm")) break;
                    var2_2 = 11;
                    break block41;
                }
                case 3308: {
                    if (!var4_7.equals((Object)"gs")) break;
                    break block41;
                }
                case 3307: {
                    if (!var4_7.equals((Object)"gr")) break;
                    var2_2 = 0;
                    break block41;
                }
                case 3295: {
                    if (!var4_7.equals((Object)"gf")) break;
                    var2_2 = 4;
                    break block41;
                }
                case 3270: {
                    if (!var4_7.equals((Object)"fl")) break;
                    var2_2 = 3;
                    break block41;
                }
                case 3239: {
                    if (!var4_7.equals((Object)"el")) break;
                    var2_2 = 7;
                    break block41;
                }
            }
            var2_2 = -1;
        }
        switch (var2_2) {
            default: {
                var6_8 = new StringBuilder();
                var6_8.append("Unknown shape type ");
                var6_8.append(var4_7);
                Log.w((String)"LOTTIE", (String)var6_8.toString());
                var5_9 = null;
                ** break;
            }
            case 12: {
                var5_9 = ab.a(var0, var1_1);
                ** break;
            }
            case 11: {
                var5_9 = v.a(var0);
                var1_1.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                ** break;
            }
            case 10: {
                var5_9 = z.a(var0, var1_1);
                ** break;
            }
            case 9: {
                var5_9 = ai.a(var0, var1_1);
                ** break;
            }
            case 8: {
                var5_9 = aa.a(var0, var1_1);
                ** break;
            }
            case 7: {
                var5_9 = e.a(var0, var1_1, var3_3);
                ** break;
            }
            case 6: {
                var5_9 = ag.a(var0, var1_1);
                ** break;
            }
            case 5: {
                var5_9 = c.a(var0, var1_1);
                ** break;
            }
            case 4: {
                var5_9 = m.a(var0, var1_1);
                ** break;
            }
            case 3: {
                var5_9 = ae.a(var0, var1_1);
                ** break;
            }
            case 2: {
                var5_9 = n.a(var0, var1_1);
                ** break;
            }
            case 1: {
                var5_9 = ah.a(var0, var1_1);
                ** break;
            }
            case 0: 
        }
        var5_9 = af.a(var0, var1_1);
lbl132: // 14 sources:
        do {
            if (!var0.hasNext()) {
                var0.endObject();
                return var5_9;
            }
            var0.skipValue();
        } while (true);
    }
}

