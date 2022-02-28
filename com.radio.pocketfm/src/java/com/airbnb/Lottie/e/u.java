/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  android.util.Log
 *  com.airbnb.lottie.c.a.d
 *  com.airbnb.lottie.c.a.h
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import android.util.Log;
import com.airbnb.lottie.c.a.h;
import com.airbnb.lottie.c.b.g;
import com.airbnb.lottie.d;
import java.io.IOException;

class u {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static g a(JsonReader var0, d var1_1) throws IOException {
        var0.beginObject();
        var2_2 = null;
        var3_3 = null;
        var4_4 = null;
        do {
            block17 : {
                block15 : {
                    block16 : {
                        block14 : {
                            block12 : {
                                block13 : {
                                    if (!var0.hasNext()) {
                                        var0.endObject();
                                        return new g(var2_2, var3_3, var4_4);
                                    }
                                    var5_5 = var0.nextName();
                                    var6_6 = var5_5.hashCode();
                                    if (var6_6 == 111) break block12;
                                    if (var6_6 == 3588) break block13;
                                    if (var6_6 != 3357091 || !var5_5.equals((Object)"mode")) ** GOTO lbl-1000
                                    var7_7 = 0;
                                    break block14;
                                }
                                if (!var5_5.equals((Object)"pt")) ** GOTO lbl-1000
                                var7_7 = 1;
                                break block14;
                            }
                            if (var5_5.equals((Object)"o")) {
                                var7_7 = 2;
                            } else lbl-1000: // 3 sources:
                            {
                                var7_7 = -1;
                            }
                        }
                        if (var7_7 != 0) {
                            if (var7_7 != 1) {
                                if (var7_7 != 2) {
                                    var0.skipValue();
                                    continue;
                                }
                                var4_4 = com.airbnb.lottie.e.d.b(var0, var1_1);
                                continue;
                            }
                            var3_3 = com.airbnb.lottie.e.d.e(var0, var1_1);
                            continue;
                        }
                        var8_8 = var0.nextString();
                        var9_9 = var8_8.hashCode();
                        if (var9_9 == 97) break block15;
                        if (var9_9 == 105) break block16;
                        if (var9_9 != 115 || !var8_8.equals((Object)"s")) ** GOTO lbl-1000
                        var10_10 = 1;
                        break block17;
                    }
                    if (!var8_8.equals((Object)"i")) ** GOTO lbl-1000
                    var10_10 = 2;
                    break block17;
                }
                if (var8_8.equals((Object)"a")) {
                    var10_10 = 0;
                } else lbl-1000: // 3 sources:
                {
                    var10_10 = -1;
                }
            }
            if (var10_10 != 0) {
                if (var10_10 != 1) {
                    if (var10_10 != 2) {
                        var11_11 = new StringBuilder();
                        var11_11.append("Unknown mask mode ");
                        var11_11.append(var5_5);
                        var11_11.append(". Defaulting to Add.");
                        Log.w((String)"LOTTIE", (String)var11_11.toString());
                        var2_2 = g.a.a;
                        continue;
                    }
                    var1_1.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                    var2_2 = g.a.c;
                    continue;
                }
                var2_2 = g.a.b;
                continue;
            }
            var2_2 = g.a.a;
        } while (true);
    }
}

