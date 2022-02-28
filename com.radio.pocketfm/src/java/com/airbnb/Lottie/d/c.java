/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.core.g.d
 *  java.io.BufferedReader
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.zip.ZipInputStream
 */
package com.airbnb.lottie.d;

import android.content.Context;
import com.airbnb.lottie.d;
import com.airbnb.lottie.d.a;
import com.airbnb.lottie.d.b;
import com.airbnb.lottie.e;
import com.airbnb.lottie.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipInputStream;

public class c {
    private final Context a;
    private final String b;
    private final b c;

    private c(Context context, String string2) {
        this.a = context.getApplicationContext();
        this.b = string2;
        this.c = new b(this.a, string2);
    }

    public static k<d> a(Context context, String string2) {
        return new c(context, string2).a();
    }

    private d b() {
        androidx.core.g.d<a, InputStream> d2 = this.c.a();
        if (d2 == null) {
            return null;
        }
        a a2 = (a)((Object)d2.a);
        InputStream inputStream = (InputStream)d2.b;
        k<d> k2 = a2 == a.b ? e.a(new ZipInputStream(inputStream), this.b) : e.a(inputStream, this.b);
        if (k2.a() != null) {
            return k2.a();
        }
        return null;
    }

    private k<d> c() {
        try {
            k k2 = this.d();
            return k2;
        }
        catch (IOException iOException) {
            return new k<d>(iOException);
        }
    }

    private k d() throws IOException {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fetching ");
        stringBuilder.append(this.b);
        com.airbnb.lottie.c.a(stringBuilder.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(this.b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
            a a2;
            k<d> k2;
            String string3 = httpURLConnection.getContentType();
            int n2 = -1;
            int n3 = string3.hashCode();
            boolean bl = true;
            if (n3 != -1248325150) {
                if (n3 == -43840953 && string3.equals((Object)"application/json")) {
                    n2 = 1;
                }
            } else if (string3.equals((Object)"application/zip")) {
                n2 = 0;
            }
            if (n2 != 0) {
                com.airbnb.lottie.c.a("Received json response.");
                a2 = a.a;
                k2 = e.a((InputStream)new FileInputStream(new File(this.c.a(httpURLConnection.getInputStream(), a2).getAbsolutePath())), this.b);
            } else {
                com.airbnb.lottie.c.a("Handling zip response.");
                a2 = a.b;
                k2 = e.a(new ZipInputStream((InputStream)new FileInputStream(this.c.a(httpURLConnection.getInputStream(), a2))), this.b);
            }
            if (k2.a() != null) {
                this.c.a(a2);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Completed fetch from network. Success: ");
            if (k2.a() == null) {
                bl = false;
            }
            stringBuilder2.append(bl);
            com.airbnb.lottie.c.a(stringBuilder2.toString());
            return k2;
        }
        BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder stringBuilder3 = new StringBuilder();
        while ((string2 = bufferedReader.readLine()) != null) {
            stringBuilder3.append(string2);
            stringBuilder3.append('\n');
        }
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("Unable to fetch ");
        stringBuilder4.append(this.b);
        stringBuilder4.append(". Failed with ");
        stringBuilder4.append(httpURLConnection.getResponseCode());
        stringBuilder4.append("\n");
        stringBuilder4.append((Object)stringBuilder3);
        return new k(new IllegalArgumentException(stringBuilder4.toString()));
    }

    public k<d> a() {
        d d2 = this.b();
        if (d2 != null) {
            return new k<d>(d2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Animation for ");
        stringBuilder.append(this.b);
        stringBuilder.append(" not found in cache. Fetching from network.");
        com.airbnb.lottie.c.a(stringBuilder.toString());
        return this.c();
    }
}

