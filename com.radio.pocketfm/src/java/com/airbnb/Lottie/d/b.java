/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.core.g.d
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.airbnb.lottie.d;

import android.content.Context;
import androidx.core.g.d;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

class b {
    private final Context a;
    private final String b;

    b(Context context, String string2) {
        this.a = context.getApplicationContext();
        this.b = string2;
    }

    private File a(String string2) throws FileNotFoundException {
        File file = new File(this.a.getCacheDir(), b.a(string2, a.a, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(this.a.getCacheDir(), b.a(string2, a.b, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private static String a(String string2, a a2, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lottie_cache_");
        stringBuilder.append(string2.replaceAll("\\W+", ""));
        String string3 = bl ? a2.a() : a2.c;
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    d<a, InputStream> a() {
        File file;
        block3 : {
            try {
                file = this.a(this.b);
                if (file != null) break block3;
                return null;
            }
            catch (FileNotFoundException fileNotFoundException) {
                return null;
            }
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        a a2 = file.getAbsolutePath().endsWith(".zip") ? a.b : a.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cache hit for ");
        stringBuilder.append(this.b);
        stringBuilder.append(" at ");
        stringBuilder.append(file.getAbsolutePath());
        c.a(stringBuilder.toString());
        return new d((Object)a2, (Object)fileInputStream);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    File a(InputStream inputStream, a a2) throws IOException {
        String string2 = b.a(this.b, a2, true);
        File file = new File(this.a.getCacheDir(), string2);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            int n2;
            byte[] arrby = new byte[1024];
            while ((n2 = inputStream.read(arrby)) != -1) {
                fileOutputStream.write(arrby, 0, n2);
            }
            fileOutputStream.flush();
        }
        catch (Throwable throwable) {
            fileOutputStream.close();
            throw throwable;
        }
        try {
            fileOutputStream.close();
            return file;
        }
        finally {
            inputStream.close();
        }
    }

    void a(a a2) {
        String string2 = b.a(this.b, a2, true);
        File file = new File(this.a.getCacheDir(), string2);
        File file2 = new File(file.getAbsolutePath().replace((CharSequence)".temp", (CharSequence)""));
        boolean bl = file.renameTo(file2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Copying temp file to real file (");
        stringBuilder.append((Object)file2);
        stringBuilder.append(")");
        c.a(stringBuilder.toString());
        if (!bl) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unable to rename cache file ");
            stringBuilder2.append(file.getAbsolutePath());
            stringBuilder2.append(" to ");
            stringBuilder2.append(file2.getAbsolutePath());
            stringBuilder2.append(".");
            c.b(stringBuilder2.toString());
        }
    }
}

