/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.Serializable
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Comparable
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.reflect.Field
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.Arrays
 */
package c;

import c.b;
import c.c;
import c.v;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class f
implements Serializable,
Comparable<f> {
    static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final f b = f.a(new byte[0]);
    private static final long serialVersionUID = 1L;
    final byte[] c;
    transient int d;
    transient String e;

    f(byte[] arrby) {
        this.c = arrby;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int a(char n2) {
        if (n2 >= 48 && n2 <= 57) {
            return n2 - 48;
        }
        int n3 = 97;
        if (n2 >= n3 && n2 <= 102) {
            return 10 + (n2 - n3);
        }
        n3 = 65;
        if (n2 >= n3 && n2 <= 70) {
            return 10 + (n2 - n3);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected hex digit: ");
        stringBuilder.append((char)n2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static int a(String string2, int n2) {
        int n3;
        int n4 = string2.length();
        int n5 = 0;
        for (int i2 = 0; i2 < n4; i2 += Character.charCount((int)n3)) {
            if (n5 == n2) {
                return i2;
            }
            n3 = string2.codePointAt(i2);
            if (Character.isISOControl((int)n3) && n3 != 10 && n3 != 13 || n3 == 65533) {
                return -1;
            }
            ++n5;
        }
        return string2.length();
    }

    public static f a(InputStream inputStream, int n2) throws IOException {
        if (inputStream != null) {
            if (n2 >= 0) {
                int n3;
                byte[] arrby = new byte[n2];
                for (int i2 = 0; i2 < n2; i2 += n3) {
                    n3 = inputStream.read(arrby, i2, n2 - i2);
                    if (n3 != -1) {
                        continue;
                    }
                    throw new EOFException();
                }
                return new f(arrby);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("in == null");
    }

    public static f a(String string2) {
        if (string2 != null) {
            f f2 = new f(string2.getBytes(v.a));
            f2.e = string2;
            return f2;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static /* varargs */ f a(byte ... arrby) {
        if (arrby != null) {
            return new f((byte[])arrby.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static f b(String string2) {
        if (string2 != null) {
            byte[] arrby = b.a(string2);
            if (arrby != null) {
                return new f(arrby);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static f c(String string2) {
        if (string2 != null) {
            if (string2.length() % 2 == 0) {
                byte[] arrby = new byte[string2.length() / 2];
                for (int i2 = 0; i2 < arrby.length; ++i2) {
                    int n2 = i2 * 2;
                    arrby[i2] = (byte)((f.a(string2.charAt(n2)) << 4) + f.a(string2.charAt(n2 + 1)));
                }
                return f.a(arrby);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected hex string: ");
            stringBuilder.append(string2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("hex == null");
    }

    private f d(String string2) {
        try {
            f f2 = f.a(MessageDigest.getInstance((String)string2).digest(this.c));
            return f2;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new AssertionError((Object)noSuchAlgorithmException);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        f f2 = f.a((InputStream)objectInputStream, objectInputStream.readInt());
        try {
            Field field = f.class.getDeclaredField("c");
            field.setAccessible(true);
            field.set((Object)this, (Object)f2.c);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError();
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }

    public byte a(int n2) {
        return this.c[n2];
    }

    public f a(int n2, int n3) {
        if (n2 >= 0) {
            byte[] arrby = this.c;
            if (n3 <= arrby.length) {
                int n4 = n3 - n2;
                if (n4 >= 0) {
                    if (n2 == 0 && n3 == arrby.length) {
                        return this;
                    }
                    byte[] arrby2 = new byte[n4];
                    System.arraycopy((Object)this.c, (int)n2, (Object)arrby2, (int)0, (int)n4);
                    return new f(arrby2);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex > length(");
            stringBuilder.append(this.c.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public String a() {
        String string2;
        String string3 = this.e;
        if (string3 != null) {
            return string3;
        }
        this.e = string2 = new String(this.c, v.a);
        return string2;
    }

    void a(c c2) {
        byte[] arrby = this.c;
        c2.b(arrby, 0, arrby.length);
    }

    public boolean a(int n2, f f2, int n3, int n4) {
        return f2.a(n3, this.c, n2, n4);
    }

    public boolean a(int n2, byte[] arrby, int n3, int n4) {
        byte[] arrby2;
        return n2 >= 0 && n2 <= (arrby2 = this.c).length - n4 && n3 >= 0 && n3 <= arrby.length - n4 && v.a(arrby2, n2, arrby, n3, n4);
    }

    public final boolean a(f f2) {
        return this.a(0, f2, 0, f2.h());
    }

    public int b(f f2) {
        int n2 = this.h();
        int n3 = f2.h();
        int n4 = Math.min((int)n2, (int)n3);
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5;
            int n6 = 255 & this.a(i2);
            if (n6 == (n5 = 255 & f2.a(i2))) {
                continue;
            }
            if (n6 < n5) {
                return -1;
            }
            return 1;
        }
        if (n2 == n3) {
            return 0;
        }
        if (n2 < n3) {
            return -1;
        }
        return 1;
    }

    public String b() {
        return b.a(this.c);
    }

    public f c() {
        return this.d("MD5");
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.b((f)object);
    }

    public f d() {
        return this.d("SHA-1");
    }

    public f e() {
        return this.d("SHA-256");
    }

    public boolean equals(Object object) {
        int n2;
        byte[] arrby;
        f f2;
        if (object == this) {
            return true;
        }
        return object instanceof f && (n2 = (f2 = (f)object).h()) == (arrby = this.c).length && f2.a(0, arrby, 0, arrby.length);
    }

    public String f() {
        byte[] arrby = this.c;
        char[] arrc = new char[2 * arrby.length];
        int n2 = arrby.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = arrby[i2];
            int n4 = n3 + 1;
            char[] arrc2 = a;
            arrc[n3] = arrc2[15 & by >> 4];
            n3 = n4 + 1;
            arrc[n4] = arrc2[by & 15];
        }
        return new String(arrc);
    }

    public f g() {
        byte[] arrby;
        for (int i2 = 0; i2 < (arrby = this.c).length; ++i2) {
            byte by = arrby[i2];
            if (by < 65 || by > 90) continue;
            byte[] arrby2 = (byte[])arrby.clone();
            arrby2[i2] = (byte)(by + 32);
            for (int i3 = i2 + 1; i3 < arrby2.length; ++i3) {
                byte by2 = arrby2[i3];
                if (by2 < 65 || by2 > 90) continue;
                arrby2[i3] = (byte)(by2 + 32);
            }
            return new f(arrby2);
        }
        return this;
    }

    public int h() {
        return this.c.length;
    }

    public int hashCode() {
        int n2;
        int n3 = this.d;
        if (n3 != 0) {
            return n3;
        }
        this.d = n2 = Arrays.hashCode((byte[])this.c);
        return n2;
    }

    public byte[] i() {
        return (byte[])this.c.clone();
    }

    public String toString() {
        if (this.c.length == 0) {
            return "[size=0]";
        }
        String string2 = this.a();
        int n2 = f.a(string2, 64);
        if (n2 == -1) {
            if (this.c.length <= 64) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[hex=");
                stringBuilder.append(this.f());
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[size=");
            stringBuilder.append(this.c.length);
            stringBuilder.append(" hex=");
            stringBuilder.append(this.a(0, 64).f());
            stringBuilder.append("\u2026]");
            return stringBuilder.toString();
        }
        String string3 = string2.substring(0, n2).replace((CharSequence)"\\", (CharSequence)"\\\\").replace((CharSequence)"\n", (CharSequence)"\\n").replace((CharSequence)"\r", (CharSequence)"\\r");
        if (n2 < string2.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[size=");
            stringBuilder.append(this.c.length);
            stringBuilder.append(" text=");
            stringBuilder.append(string3);
            stringBuilder.append("\u2026]");
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[text=");
        stringBuilder.append(string3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

