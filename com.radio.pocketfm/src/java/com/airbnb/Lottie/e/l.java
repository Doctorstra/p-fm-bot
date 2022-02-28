/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  java.io.IOException
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package com.airbnb.lottie.e;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.c.b.c;
import com.airbnb.lottie.e.aj;
import com.airbnb.lottie.f.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class l
implements aj<c> {
    private int a;

    public l(int n2) {
        this.a = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(double d2, double[] arrd, double[] arrd2) {
        double d3;
        for (int i2 = 1; i2 < arrd.length; ++i2) {
            int n2 = i2 - 1;
            double d4 = arrd[n2];
            double d5 = arrd[i2];
            if (!(arrd[i2] >= d2)) continue;
            double d6 = (d2 - d4) / (d5 - d4);
            d3 = e.a(arrd2[n2], arrd2[i2], d6);
            do {
                return (int)(d3 * 255.0);
                break;
            } while (true);
        }
        d3 = arrd2[arrd2.length - 1];
        return (int)(d3 * 255.0);
    }

    private void a(c c2, List<Float> list) {
        int n2 = 4 * this.a;
        if (list.size() <= n2) {
            return;
        }
        int n3 = (list.size() - n2) / 2;
        double[] arrd = new double[n3];
        double[] arrd2 = new double[n3];
        int n4 = 0;
        do {
            int n5 = list.size();
            if (n2 >= n5) break;
            if (n2 % 2 == 0) {
                arrd[n4] = ((Float)list.get(n2)).floatValue();
            } else {
                arrd2[n4] = ((Float)list.get(n2)).floatValue();
                ++n4;
            }
            ++n2;
        } while (true);
        for (int i2 = 0; i2 < c2.c(); ++i2) {
            int n6;
            int n7 = c2.b()[i2];
            c2.b()[i2] = n6 = Color.argb((int)this.a(c2.a()[i2], arrd, arrd2), (int)Color.red((int)n7), (int)Color.green((int)n7), (int)Color.blue((int)n7));
        }
    }

    public c a(JsonReader jsonReader, float f2) throws IOException {
        ArrayList arrayList = new ArrayList();
        JsonToken jsonToken = jsonReader.peek();
        JsonToken jsonToken2 = JsonToken.BEGIN_ARRAY;
        int n2 = 0;
        boolean bl2 = jsonToken == jsonToken2;
        if (bl2) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add((Object)Float.valueOf((float)((float)jsonReader.nextDouble())));
        }
        if (bl2) {
            jsonReader.endArray();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int n3 = this.a;
        float[] arrf = new float[n3];
        int[] arrn = new int[n3];
        int n4 = 0;
        int n5 = 0;
        while (n2 < 4 * this.a) {
            int n6 = n2 / 4;
            double d2 = ((Float)arrayList.get(n2)).floatValue();
            int n7 = n2 % 4;
            if (n7 != 0) {
                if (n7 != 1) {
                    if (n7 != 2) {
                        if (n7 == 3) {
                            Double.isNaN((double)d2);
                            arrn[n6] = Color.argb((int)255, (int)n4, (int)n5, (int)((int)(d2 * 255.0)));
                        }
                    } else {
                        Double.isNaN((double)d2);
                        n5 = (int)(d2 * 255.0);
                    }
                } else {
                    Double.isNaN((double)d2);
                    n4 = (int)(d2 * 255.0);
                }
            } else {
                arrf[n6] = (float)d2;
            }
            ++n2;
        }
        c c2 = new c(arrf, arrn);
        this.a(c2, (List<Float>)arrayList);
        return c2;
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader, float f2) throws IOException {
        return this.a(jsonReader, f2);
    }
}

