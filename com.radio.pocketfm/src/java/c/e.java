/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.channels.ReadableByteChannel
 *  java.nio.charset.Charset
 */
package c;

import c.c;
import c.f;
import c.s;
import c.t;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface e
extends t,
ReadableByteChannel {
    public long a(byte var1) throws IOException;

    public long a(s var1) throws IOException;

    public String a(Charset var1) throws IOException;

    public void a(long var1) throws IOException;

    public void a(byte[] var1) throws IOException;

    public boolean a(long var1, f var3) throws IOException;

    public c c();

    public f c(long var1) throws IOException;

    public String e(long var1) throws IOException;

    public boolean g() throws IOException;

    public byte[] g(long var1) throws IOException;

    public InputStream h();

    public void h(long var1) throws IOException;

    public byte j() throws IOException;

    public short k() throws IOException;

    public int l() throws IOException;

    public short m() throws IOException;

    public int n() throws IOException;

    public long o() throws IOException;

    public long p() throws IOException;

    public String s() throws IOException;
}

