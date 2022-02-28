/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package com.airbnb.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.c.a;
import com.airbnb.lottie.c.b.l;
import com.airbnb.lottie.e.aj;
import com.airbnb.lottie.e.p;
import com.airbnb.lottie.f.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ad
implements aj<l> {
    public static final ad a = new ad();

    private ad() {
    }

    public l a(JsonReader jsonReader, float f2) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean bl2 = false;
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            int n2 = -1;
            int n3 = string2.hashCode();
            if (n3 != 99) {
                if (n3 != 105) {
                    if (n3 != 111) {
                        if (n3 == 118 && string2.equals((Object)"v")) {
                            n2 = 1;
                        }
                    } else if (string2.equals((Object)"o")) {
                        n2 = 3;
                    }
                } else if (string2.equals((Object)"i")) {
                    n2 = 2;
                }
            } else if (string2.equals((Object)"c")) {
                n2 = 0;
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) continue;
                        list3 = p.a(jsonReader, f2);
                        continue;
                    }
                    list2 = p.a(jsonReader, f2);
                    continue;
                }
                list = p.a(jsonReader, f2);
                continue;
            }
            bl2 = jsonReader.nextBoolean();
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new l(new PointF(), false, (List<a>)Collections.emptyList());
            }
            int n4 = list.size();
            PointF pointF = (PointF)list.get(0);
            ArrayList arrayList = new ArrayList(n4);
            for (int i2 = 1; i2 < n4; ++i2) {
                PointF pointF2 = (PointF)list.get(i2);
                int n5 = i2 - 1;
                PointF pointF3 = (PointF)list.get(n5);
                PointF pointF4 = (PointF)list3.get(n5);
                PointF pointF5 = (PointF)list2.get(i2);
                arrayList.add((Object)new a(e.a(pointF3, pointF4), e.a(pointF2, pointF5), pointF2));
            }
            if (bl2) {
                PointF pointF6 = (PointF)list.get(0);
                int n6 = n4 - 1;
                PointF pointF7 = (PointF)list.get(n6);
                PointF pointF8 = (PointF)list3.get(n6);
                PointF pointF9 = (PointF)list2.get(0);
                arrayList.add((Object)new a(e.a(pointF7, pointF8), e.a(pointF6, pointF9), pointF6));
            }
            return new l(pointF, bl2, (List<a>)arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader, float f2) throws IOException {
        return this.a(jsonReader, f2);
    }
}

