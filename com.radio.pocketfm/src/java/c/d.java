/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.channels.WritableByteChannel
 */
package c;

import c.c;
import c.f;
import c.s;
import c.t;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;

public interface d
extends s,
WritableByteChannel {
    public long a(t var1) throws IOException;

    public d b(f var1) throws IOException;

    public d b(String var1) throws IOException;

    public c c();

    public d c(byte[] var1) throws IOException;

    public d c(byte[] var1, int var2, int var3) throws IOException;

    public d f() throws IOException;

    @Override
    public void flush() throws IOException;

    public d g(int var1) throws IOException;

    public d h(int var1) throws IOException;

    public d i(int var1) throws IOException;

    public d k(long var1) throws IOException;

    public d l(long var1) throws IOException;

    public d x() throws IOException;
}

