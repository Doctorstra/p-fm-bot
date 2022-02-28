/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package com.airbnb.lottie.f;

public class b {
    private static float a(float f2) {
        if (f2 <= 0.0031308f) {
            return f2 * 12.92f;
        }
        return (float)(1.0549999475479126 * Math.pow((double)f2, (double)0.4166666567325592) - 0.054999999701976776);
    }

    public static int a(float f2, int n2, int n3) {
        float f3 = (float)(255 & n2 >> 24) / 255.0f;
        float f4 = (float)(255 & n2 >> 16) / 255.0f;
        float f5 = (float)(255 & n2 >> 8) / 255.0f;
        float f6 = (float)(n2 & 255) / 255.0f;
        float f7 = (float)(255 & n3 >> 24) / 255.0f;
        float f8 = (float)(255 & n3 >> 16) / 255.0f;
        float f9 = (float)(255 & n3 >> 8) / 255.0f;
        float f10 = (float)(n3 & 255) / 255.0f;
        float f11 = b.b(f4);
        float f12 = b.b(f5);
        float f13 = b.b(f6);
        float f14 = b.b(f8);
        float f15 = b.b(f9);
        float f16 = b.b(f10);
        float f17 = f3 + f2 * (f7 - f3);
        float f18 = f11 + f2 * (f14 - f11);
        float f19 = f12 + f2 * (f15 - f12);
        float f20 = f13 + f2 * (f16 - f13);
        float f21 = f17 * 255.0f;
        float f22 = 255.0f * b.a(f18);
        float f23 = 255.0f * b.a(f19);
        float f24 = 255.0f * b.a(f20);
        return Math.round((float)f21) << 24 | Math.round((float)f22) << 16 | Math.round((float)f23) << 8 | Math.round((float)f24);
    }

    private static float b(float f2) {
        if (f2 <= 0.04045f) {
            return f2 / 12.92f;
        }
        return (float)Math.pow((double)((f2 + 0.055f) / 1.055f), (double)2.4000000953674316);
    }
}

