/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 */
package com.airbnb.lottie.c;

import com.airbnb.lottie.c.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class e {
    private final List<String> a;
    private f b;

    private e(e e2) {
        this.a = new ArrayList(e2.a);
        this.b = e2.b;
    }

    public /* varargs */ e(String ... arrstring) {
        this.a = Arrays.asList((Object[])arrstring);
    }

    private boolean b() {
        List<String> list = this.a;
        return ((String)list.get(-1 + list.size())).equals((Object)"**");
    }

    private boolean b(String string2) {
        return "__container".equals((Object)string2);
    }

    public e a(f f2) {
        e e2 = new e(this);
        e2.b = f2;
        return e2;
    }

    public e a(String string2) {
        e e2 = new e(this);
        e2.a.add((Object)string2);
        return e2;
    }

    public f a() {
        return this.b;
    }

    public boolean a(String string2, int n2) {
        if (this.b(string2)) {
            return true;
        }
        if (n2 >= this.a.size()) {
            return false;
        }
        if (!((String)this.a.get(n2)).equals((Object)string2) && !((String)this.a.get(n2)).equals((Object)"**")) {
            return ((String)this.a.get(n2)).equals((Object)"*");
        }
        return true;
    }

    public int b(String string2, int n2) {
        if (this.b(string2)) {
            return 0;
        }
        if (!((String)this.a.get(n2)).equals((Object)"**")) {
            return 1;
        }
        if (n2 == this.a.size() - 1) {
            return 0;
        }
        if (((String)this.a.get(n2 + 1)).equals((Object)string2)) {
            return 2;
        }
        return 0;
    }

    public boolean c(String string2, int n2) {
        boolean bl;
        block13 : {
            boolean bl2;
            block15 : {
                block14 : {
                    block10 : {
                        boolean bl3;
                        block12 : {
                            boolean bl4;
                            block11 : {
                                if (n2 >= this.a.size()) {
                                    return false;
                                }
                                bl = n2 == this.a.size() - 1;
                                String string3 = (String)this.a.get(n2);
                                if (string3.equals((Object)"**")) break block10;
                                bl4 = string3.equals((Object)string2) || string3.equals((Object)"*");
                                if (bl) break block11;
                                int n3 = -2 + this.a.size();
                                bl3 = false;
                                if (n2 != n3) break block12;
                                boolean bl5 = this.b();
                                bl3 = false;
                                if (!bl5) break block12;
                            }
                            bl3 = false;
                            if (bl4) {
                                bl3 = true;
                            }
                        }
                        return bl3;
                    }
                    boolean bl6 = !bl && ((String)this.a.get(n2 + 1)).equals((Object)string2);
                    if (!bl6) break block13;
                    if (n2 == -2 + this.a.size()) break block14;
                    int n4 = -3 + this.a.size();
                    bl2 = false;
                    if (n2 != n4) break block15;
                    boolean bl7 = this.b();
                    bl2 = false;
                    if (!bl7) break block15;
                }
                bl2 = true;
            }
            return bl2;
        }
        if (bl) {
            return true;
        }
        int n5 = n2 + 1;
        if (n5 < this.a.size() - 1) {
            return false;
        }
        return ((String)this.a.get(n5)).equals((Object)string2);
    }

    public boolean d(String string2, int n2) {
        boolean bl = "__container".equals((Object)string2);
        boolean bl2 = true;
        if (bl) {
            return bl2;
        }
        if (n2 >= this.a.size() - bl2) {
            if (((String)this.a.get(n2)).equals((Object)"**")) {
                return bl2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KeyPath{keys=");
        stringBuilder.append(this.a);
        stringBuilder.append(",resolved=");
        boolean bl = this.b != null;
        stringBuilder.append(bl);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

