/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.Log
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package com.airbnb.lottie.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.c.i;
import java.util.HashMap;
import java.util.Map;

public class a {
    private final i<String> a = new i();
    private final Map<i<String>, Typeface> b = new HashMap();
    private final Map<String, Typeface> c = new HashMap();
    private final AssetManager d;
    private com.airbnb.lottie.a e;
    private String f = ".ttf";

    public a(Drawable.Callback callback, com.airbnb.lottie.a a2) {
        this.e = a2;
        if (!(callback instanceof View)) {
            Log.w((String)"LOTTIE", (String)"LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View)callback).getContext().getAssets();
    }

    private Typeface a(Typeface typeface, String string2) {
        boolean bl = string2.contains((CharSequence)"Italic");
        boolean bl2 = string2.contains((CharSequence)"Bold");
        int n2 = bl && bl2 ? 3 : (bl ? 2 : (bl2 ? 1 : 0));
        if (typeface.getStyle() == n2) {
            return typeface;
        }
        return Typeface.create((Typeface)typeface, (int)n2);
    }

    private Typeface a(String string2) {
        com.airbnb.lottie.a a2;
        String string3;
        Typeface typeface = (Typeface)this.c.get((Object)string2);
        if (typeface != null) {
            return typeface;
        }
        com.airbnb.lottie.a a3 = this.e;
        Typeface typeface2 = null;
        if (a3 != null) {
            typeface2 = a3.a(string2);
        }
        if ((a2 = this.e) != null && typeface2 == null && (string3 = a2.b(string2)) != null) {
            typeface2 = Typeface.createFromAsset((AssetManager)this.d, (String)string3);
        }
        if (typeface2 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fonts/");
            stringBuilder.append(string2);
            stringBuilder.append(this.f);
            String string4 = stringBuilder.toString();
            typeface2 = Typeface.createFromAsset((AssetManager)this.d, (String)string4);
        }
        this.c.put((Object)string2, (Object)typeface2);
        return typeface2;
    }

    public Typeface a(String string2, String string3) {
        this.a.a(string2, string3);
        Typeface typeface = (Typeface)this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = this.a(this.a(string2), string3);
        this.b.put(this.a, (Object)typeface2);
        return typeface2;
    }

    public void a(com.airbnb.lottie.a a2) {
        this.e = a2;
    }
}

