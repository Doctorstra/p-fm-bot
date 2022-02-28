/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  androidx.core.os.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.HashSet
 *  java.util.Set
 */
package com.airbnb.lottie;

import android.util.Log;
import androidx.core.os.a;
import java.util.HashSet;
import java.util.Set;

public class c {
    public static boolean a;
    private static final Set<String> b;
    private static boolean c;
    private static String[] d;
    private static long[] e;
    private static int f;
    private static int g;

    static {
        b = new HashSet();
        c = false;
        f = 0;
        g = 0;
    }

    public static void a(String string2) {
        if (a) {
            Log.d((String)"LOTTIE", (String)string2);
        }
    }

    public static void b(String string2) {
        if (b.contains((Object)string2)) {
            return;
        }
        Log.w((String)"LOTTIE", (String)string2);
        b.add((Object)string2);
    }

    public static void c(String string2) {
        if (!c) {
            return;
        }
        int n2 = f;
        if (n2 == 20) {
            g = 1 + g;
            return;
        }
        c.d[n2] = string2;
        c.e[n2] = System.nanoTime();
        a.a((String)string2);
        f = 1 + f;
    }

    public static float d(String string2) {
        int n2 = g;
        if (n2 > 0) {
            g = n2 - 1;
            return 0.0f;
        }
        if (!c) {
            return 0.0f;
        }
        int n3 = f = -1 + f;
        if (n3 != -1) {
            if (string2.equals((Object)d[n3])) {
                a.a();
                return (float)(System.nanoTime() - e[f]) / 1000000.0f;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unbalanced trace call ");
            stringBuilder.append(string2);
            stringBuilder.append(". Expected ");
            stringBuilder.append(d[f]);
            stringBuilder.append(".");
            throw new IllegalStateException(stringBuilder.toString());
        }
        throw new IllegalStateException("Can't end trace section. There are none.");
    }
}

