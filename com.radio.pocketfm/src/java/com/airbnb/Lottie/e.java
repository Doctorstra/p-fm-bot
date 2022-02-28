/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.util.JsonReader
 *  com.airbnb.lottie.e$2
 *  com.airbnb.lottie.e$3
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Callable
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipInputStream
 */
package com.airbnb.lottie;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import com.airbnb.lottie.d;
import com.airbnb.lottie.d.c;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.t;
import com.airbnb.lottie.f.f;
import com.airbnb.lottie.g;
import com.airbnb.lottie.h;
import com.airbnb.lottie.k;
import com.airbnb.lottie.l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class e {
    private static final Map<String, l<d>> a = new HashMap();

    private static g a(d d2, String string2) {
        for (g g2 : d2.l().values()) {
            if (!g2.b().equals((Object)string2)) continue;
            return g2;
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static k<d> a(JsonReader jsonReader, String string2, boolean bl) {
        Throwable throwable2222;
        d d2 = t.a(jsonReader);
        com.airbnb.lottie.c.g.a().a(string2, d2);
        k<d> k2 = new k<d>(d2);
        if (!bl) return k2;
        f.a((Closeable)jsonReader);
        return k2;
        {
            k<d> k3;
            catch (Throwable throwable2222) {
            }
            catch (Exception exception) {}
            {
                k3 = new k<d>(exception);
                if (!bl) return k3;
            }
            f.a((Closeable)jsonReader);
            return k3;
        }
        if (!bl) throw throwable2222;
        f.a((Closeable)jsonReader);
        throw throwable2222;
    }

    public static k<d> a(InputStream inputStream, String string2) {
        return e.a(inputStream, string2, true);
    }

    private static k<d> a(InputStream inputStream, String string2, boolean bl) {
        try {
            k<d> k2 = e.b(new JsonReader((Reader)new InputStreamReader(inputStream)), string2);
            return k2;
        }
        finally {
            if (bl) {
                f.a((Closeable)inputStream);
            }
        }
    }

    public static k<d> a(ZipInputStream zipInputStream, String string2) {
        try {
            k<d> k2 = e.b(zipInputStream, string2);
            return k2;
        }
        finally {
            f.a((Closeable)zipInputStream);
        }
    }

    public static l<d> a(Context context, final int n2) {
        final Context context2 = context.getApplicationContext();
        return e.a(e.a(n2), new Callable<k<d>>(){

            public k<d> a() {
                return e.b(context2, n2);
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
    }

    public static l<d> a(final Context context, final String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("url_");
        stringBuilder.append(string2);
        return e.a(stringBuilder.toString(), new Callable<k<d>>(){

            public k<d> a() {
                return c.a(context, string2);
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
    }

    public static l<d> a(final JsonReader jsonReader, final String string2) {
        return e.a(string2, new Callable<k<d>>(){

            public k<d> a() {
                return e.b(jsonReader, string2);
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
    }

    private static l<d> a(String string2, Callable<k<d>> callable) {
        final d d2 = string2 == null ? null : com.airbnb.lottie.c.g.a().a(string2);
        if (d2 != null) {
            return new l<d>(new Callable<k<d>>(){

                public k<d> a() {
                    return new k<d>(d2);
                }

                public /* synthetic */ Object call() throws Exception {
                    return this.a();
                }
            });
        }
        if (string2 != null && a.containsKey((Object)string2)) {
            return (l)a.get((Object)string2);
        }
        l<d> l2 = new l<d>(callable);
        l2.a((h<d>)new 2(string2));
        l2.c((h<Throwable>)new 3(string2));
        a.put((Object)string2, l2);
        return l2;
    }

    private static String a(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rawRes_");
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    static /* synthetic */ Map a() {
        return a;
    }

    public static k<d> b(Context context, int n2) {
        try {
            k<d> k2 = e.a(context.getResources().openRawResource(n2), e.a(n2));
            return k2;
        }
        catch (Resources.NotFoundException notFoundException) {
            return new k<d>(notFoundException);
        }
    }

    public static k<d> b(JsonReader jsonReader, String string2) {
        return e.a(jsonReader, string2, true);
    }

    private static k<d> b(ZipInputStream zipInputStream, String string2) {
        d d2;
        ZipEntry zipEntry;
        HashMap hashMap = new HashMap();
        try {
            zipEntry = zipInputStream.getNextEntry();
            d2 = null;
        }
        catch (IOException iOException) {
            return new k<d>(iOException);
        }
        while (zipEntry != null) {
            if (zipEntry.getName().contains((CharSequence)"__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (zipEntry.getName().contains((CharSequence)".json")) {
                d2 = e.a(new JsonReader((Reader)new InputStreamReader((InputStream)zipInputStream)), null, false).a();
            } else if (zipEntry.getName().contains((CharSequence)".png")) {
                String[] arrstring = zipEntry.getName().split("/");
                hashMap.put((Object)arrstring[-1 + arrstring.length], (Object)BitmapFactory.decodeStream((InputStream)zipInputStream));
            } else {
                zipInputStream.closeEntry();
            }
            zipEntry = zipInputStream.getNextEntry();
        }
        if (d2 == null) {
            return new k<d>(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            g g2 = e.a(d2, (String)entry.getKey());
            if (g2 == null) continue;
            g2.a((Bitmap)entry.getValue());
        }
        for (Map.Entry entry : d2.l().entrySet()) {
            if (((g)entry.getValue()).c() != null) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("There is no image for ");
            stringBuilder.append(((g)entry.getValue()).b());
            return new k<d>((Throwable)new IllegalStateException(stringBuilder.toString()));
        }
        com.airbnb.lottie.c.g.a().a(string2, d2);
        return new k<d>(d2);
    }

    public static l<d> b(Context context, String string2) {
        return e.a(string2, new Callable<k<d>>(context.getApplicationContext(), string2){
            final /* synthetic */ Context a;
            final /* synthetic */ String b;
            {
                this.a = context;
                this.b = string2;
            }

            public k<d> a() {
                return e.c(this.a, this.b);
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
    }

    public static k<d> c(Context context, String string2) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("asset_");
            stringBuilder.append(string2);
            String string3 = stringBuilder.toString();
            if (string2.endsWith(".zip")) {
                return e.a(new ZipInputStream(context.getAssets().open(string2)), string3);
            }
            k<d> k2 = e.a(context.getAssets().open(string2), string3);
            return k2;
        }
        catch (IOException iOException) {
            return new k<d>(iOException);
        }
    }

}

