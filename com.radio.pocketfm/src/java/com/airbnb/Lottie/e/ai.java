/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  com.airbnb.lottie.c.a.b
 *  com.airbnb.lottie.c.b.q
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.d;
import java.io.IOException;

class ai {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static q a(JsonReader var0, d var1_1) throws IOException {
        var2_2 = null;
        var3_3 = null;
        var4_4 = null;
        var5_5 = null;
        var6_6 = null;
        var7_7 = false;
        do {
            block15 : {
                block10 : {
                    block11 : {
                        block12 : {
                            block13 : {
                                block14 : {
                                    if (!var0.hasNext()) {
                                        return new q(var2_2, var3_3, var4_4, var5_5, var6_6, var7_7);
                                    }
                                    var9_8 = var0.nextName();
                                    var10_9 = var9_8.hashCode();
                                    if (var10_9 == 101) break block10;
                                    if (var10_9 == 109) break block11;
                                    if (var10_9 == 111) break block12;
                                    if (var10_9 == 115) break block13;
                                    if (var10_9 == 3324) break block14;
                                    if (var10_9 != 3519 || !var9_8.equals((Object)"nm")) ** GOTO lbl-1000
                                    var11_10 = 3;
                                    break block15;
                                }
                                if (!var9_8.equals((Object)"hd")) ** GOTO lbl-1000
                                var11_10 = 5;
                                break block15;
                            }
                            if (!var9_8.equals((Object)"s")) ** GOTO lbl-1000
                            var11_10 = 0;
                            break block15;
                        }
                        if (!var9_8.equals((Object)"o")) ** GOTO lbl-1000
                        var11_10 = 2;
                        break block15;
                    }
                    if (!var9_8.equals((Object)"m")) ** GOTO lbl-1000
                    var11_10 = 4;
                    break block15;
                }
                if (var9_8.equals((Object)"e")) {
                    var11_10 = 1;
                } else lbl-1000: // 6 sources:
                {
                    var11_10 = -1;
                }
            }
            if (var11_10 != 0) {
                if (var11_10 != 1) {
                    if (var11_10 != 2) {
                        if (var11_10 != 3) {
                            if (var11_10 != 4) {
                                if (var11_10 != 5) {
                                    var0.skipValue();
                                    continue;
                                }
                                var7_7 = var0.nextBoolean();
                                continue;
                            }
                            var3_3 = q.a.a(var0.nextInt());
                            continue;
                        }
                        var2_2 = var0.nextString();
                        continue;
                    }
                    var6_6 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                    continue;
                }
                var5_5 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
                continue;
            }
            var4_4 = com.airbnb.lottie.e.d.a(var0, var1_1, false);
        } while (true);
    }
}

