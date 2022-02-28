/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.JsonReader
 *  java.io.IOException
 *  java.lang.Object
 */
package com.airbnb.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.e.aj;
import com.airbnb.lottie.e.p;
import java.io.IOException;

public class x
implements aj<PointF> {
    public static final x a = new x();

    private x() {
    }

    public PointF a(JsonReader jsonReader, float f2) throws IOException {
        return p.b(jsonReader, f2);
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader, float f2) throws IOException {
        return this.a(jsonReader, f2);
    }
}

