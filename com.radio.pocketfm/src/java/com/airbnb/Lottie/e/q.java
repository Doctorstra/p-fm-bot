/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.JsonReader
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 *  androidx.a.h
 *  androidx.core.h.b.b
 *  java.io.IOException
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
package com.airbnb.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.a.h;
import androidx.core.h.b.b;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.aj;
import com.airbnb.lottie.e.p;
import com.airbnb.lottie.f.e;
import com.airbnb.lottie.f.f;
import com.airbnb.lottie.g.a;
import java.io.IOException;
import java.lang.ref.WeakReference;

class q {
    private static final Interpolator a = new LinearInterpolator();
    private static h<WeakReference<Interpolator>> b;

    q() {
    }

    private static h<WeakReference<Interpolator>> a() {
        if (b == null) {
            b = new h();
        }
        return b;
    }

    private static <T> a<T> a(JsonReader jsonReader, float f2, aj<T> aj2) throws IOException {
        return new a<T>(aj2.b(jsonReader, f2));
    }

    static <T> a<T> a(JsonReader jsonReader, d d2, float f2, aj<T> aj2, boolean bl) throws IOException {
        if (bl) {
            return q.a(d2, jsonReader, f2, aj2);
        }
        return q.a(jsonReader, f2, aj2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static <T> a<T> a(d var0, JsonReader var1_1, float var2_2, aj<T> var3_3) throws IOException {
        var1_1.beginObject();
        var4_4 = 0;
        var5_5 = null;
        var6_6 = null;
        var7_7 = null;
        var8_8 = null;
        var9_9 = 0.0f;
        var10_10 = null;
        var11_11 = null;
        block12 : while (var1_1.hasNext()) {
            block29 : {
                block22 : {
                    block23 : {
                        block24 : {
                            block25 : {
                                block26 : {
                                    block27 : {
                                        block28 : {
                                            var22_12 = var1_1.nextName();
                                            var23_13 = var22_12.hashCode();
                                            var24_14 = 1;
                                            if (var23_13 == 101) break block22;
                                            if (var23_13 == 111) break block23;
                                            if (var23_13 == 3701) break block24;
                                            if (var23_13 == 3707) break block25;
                                            if (var23_13 == 104) break block26;
                                            if (var23_13 == 105) break block27;
                                            if (var23_13 == 115) break block28;
                                            if (var23_13 != 116 || !var22_12.equals((Object)"t")) ** GOTO lbl-1000
                                            var25_15 = 0;
                                            break block29;
                                        }
                                        if (!var22_12.equals((Object)"s")) ** GOTO lbl-1000
                                        var25_15 = 1;
                                        break block29;
                                    }
                                    if (!var22_12.equals((Object)"i")) ** GOTO lbl-1000
                                    var25_15 = 4;
                                    break block29;
                                }
                                if (!var22_12.equals((Object)"h")) ** GOTO lbl-1000
                                var25_15 = 5;
                                break block29;
                            }
                            if (!var22_12.equals((Object)"to")) ** GOTO lbl-1000
                            var25_15 = 6;
                            break block29;
                        }
                        if (!var22_12.equals((Object)"ti")) ** GOTO lbl-1000
                        var25_15 = 7;
                        break block29;
                    }
                    if (!var22_12.equals((Object)"o")) ** GOTO lbl-1000
                    var25_15 = 3;
                    break block29;
                }
                if (var22_12.equals((Object)"e")) {
                    var25_15 = 2;
                } else lbl-1000: // 8 sources:
                {
                    var25_15 = -1;
                }
            }
            switch (var25_15) {
                default: {
                    var1_1.skipValue();
                    continue block12;
                }
                case 7: {
                    var11_11 = p.b(var1_1, var2_2);
                    continue block12;
                }
                case 6: {
                    var10_10 = p.b(var1_1, var2_2);
                    continue block12;
                }
                case 5: {
                    if (var1_1.nextInt() != var24_14) {
                        var24_14 = 0;
                    }
                    var4_4 = var24_14;
                    continue block12;
                }
                case 4: {
                    var6_6 = p.b(var1_1, var2_2);
                    continue block12;
                }
                case 3: {
                    var5_5 = p.b(var1_1, var2_2);
                    continue block12;
                }
                case 2: {
                    var7_7 = var3_3.b(var1_1, var2_2);
                    continue block12;
                }
                case 1: {
                    var8_8 = var3_3.b(var1_1, var2_2);
                    continue block12;
                }
                case 0: 
            }
            var9_9 = (float)var1_1.nextDouble();
        }
        var1_1.endObject();
        if (var4_4 != 0) {
            var12_16 = q.a;
            var13_17 = var8_8;
        } else if (var5_5 != null && var6_6 != null) {
            var15_18 = var5_5.x;
            var16_19 = -var2_2;
            var5_5.x = e.b(var15_18, var16_19, var2_2);
            var5_5.y = e.b(var5_5.y, -100.0f, 100.0f);
            var6_6.x = e.b(var6_6.x, var16_19, var2_2);
            var6_6.y = e.b(var6_6.y, -100.0f, 100.0f);
            var17_20 = f.a(var5_5.x, var5_5.y, var6_6.x, var6_6.y);
            var18_21 = q.a(var17_20);
            var19_22 = var18_21 != null ? (Interpolator)var18_21.get() : null;
            if (var18_21 == null || var19_22 == null) {
                var20_23 = b.a((float)(var5_5.x / var2_2), (float)(var5_5.y / var2_2), (float)(var6_6.x / var2_2), (float)(var6_6.y / var2_2));
                try {
                    q.a(var17_20, (WeakReference<Interpolator>)new WeakReference((Object)var20_23));
                }
                catch (ArrayIndexOutOfBoundsException v0) {}
                var19_22 = var20_23;
            }
            var13_17 = var7_7;
            var12_16 = var19_22;
        } else {
            var12_16 = q.a;
            var13_17 = var7_7;
        }
        var14_24 = new a<Object>(var0, var8_8, var13_17, var12_16, var9_9, null);
        var14_24.f = var10_10;
        var14_24.g = var11_11;
        return var14_24;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static WeakReference<Interpolator> a(int n2) {
        Class<q> class_ = q.class;
        synchronized (q.class) {
            return (WeakReference)q.a().a(n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(int n2, WeakReference<Interpolator> weakReference) {
        Class<q> class_ = q.class;
        synchronized (q.class) {
            b.b(n2, weakReference);
            // ** MonitorExit[var3_2] (shouldn't be in output)
            return;
        }
    }
}

