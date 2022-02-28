/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.util.Log
 *  android.view.View
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 */
package com.airbnb.lottie.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.g;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class b {
    private static final Object a = new Object();
    private final Context b;
    private String c;
    private com.airbnb.lottie.b d;
    private final Map<String, g> e;

    public b(Drawable.Callback callback, String string2, com.airbnb.lottie.b b2, Map<String, g> map) {
        String string3;
        this.c = string2;
        if (!TextUtils.isEmpty((CharSequence)string2) && (string3 = this.c).charAt(-1 + string3.length()) != '/') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append('/');
            this.c = stringBuilder.toString();
        }
        if (!(callback instanceof View)) {
            Log.w((String)"LOTTIE", (String)"LottieDrawable must be inside of a view for images to work.");
            this.e = new HashMap();
            this.b = null;
            return;
        }
        this.b = ((View)callback).getContext();
        this.e = map;
        this.a(b2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Bitmap a(String string2, Bitmap bitmap) {
        Object object;
        Object object2 = object = a;
        synchronized (object2) {
            ((g)this.e.get((Object)string2)).a(bitmap);
            return bitmap;
        }
    }

    public Bitmap a(String string2) {
        block10 : {
            InputStream inputStream;
            g g2 = (g)this.e.get((Object)string2);
            if (g2 == null) {
                return null;
            }
            Bitmap bitmap = g2.c();
            if (bitmap != null) {
                return bitmap;
            }
            com.airbnb.lottie.b b2 = this.d;
            if (b2 != null) {
                Bitmap bitmap2 = b2.a(g2);
                if (bitmap2 != null) {
                    this.a(string2, bitmap2);
                }
                return bitmap2;
            }
            String string3 = g2.b();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            if (string3.startsWith("data:") && string3.indexOf("base64,") > 0) {
                byte[] arrby;
                try {
                    arrby = Base64.decode((String)string3.substring(1 + string3.indexOf(44)), (int)0);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    Log.w((String)"LOTTIE", (String)"data URL did not have correct base64 format.", (Throwable)illegalArgumentException);
                    return null;
                }
                return this.a(string2, BitmapFactory.decodeByteArray((byte[])arrby, (int)0, (int)arrby.length, (BitmapFactory.Options)options));
            }
            try {
                if (TextUtils.isEmpty((CharSequence)this.c)) break block10;
                AssetManager assetManager = this.b.getAssets();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.c);
                stringBuilder.append(string3);
                inputStream = assetManager.open(stringBuilder.toString());
            }
            catch (IOException iOException) {
                Log.w((String)"LOTTIE", (String)"Unable to open asset.", (Throwable)iOException);
                return null;
            }
            return this.a(string2, BitmapFactory.decodeStream((InputStream)inputStream, null, (BitmapFactory.Options)options));
        }
        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
    }

    public void a(com.airbnb.lottie.b b2) {
        this.d = b2;
    }

    public boolean a(Context context) {
        return context == null && this.b == null || this.b.equals((Object)context);
    }
}

