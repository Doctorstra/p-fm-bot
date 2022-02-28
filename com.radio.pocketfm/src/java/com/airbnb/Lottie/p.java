/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.airbnb.lottie;

import java.util.Map;

public class p {
    private final Map<String, String> a;
    private boolean b;

    private String b(String string2) {
        return string2;
    }

    public final String a(String string2) {
        if (this.b && this.a.containsKey((Object)string2)) {
            return (String)this.a.get((Object)string2);
        }
        String string3 = this.b(string2);
        if (this.b) {
            this.a.put((Object)string2, (Object)string3);
        }
        return string3;
    }
}

