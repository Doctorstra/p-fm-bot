/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.a
 *  c.d
 *  c.e
 *  c.m$1
 *  c.m$2
 *  c.m$3
 *  c.m$4
 *  c.n
 *  c.o
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.util.logging.Logger
 */
package c;

import c.a;
import c.d;
import c.e;
import c.m;
import c.n;
import c.o;
import c.s;
import c.t;
import c.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class m {
    static final Logger a = Logger.getLogger((String)m.class.getName());

    private m() {
    }

    public static d a(s s2) {
        return new n(s2);
    }

    public static e a(t t2) {
        return new o(t2);
    }

    public static s a() {
        return new 3();
    }

    public static s a(OutputStream outputStream) {
        return m.a(outputStream, new u());
    }

    private static s a(OutputStream outputStream, u u2) {
        if (outputStream != null) {
            if (u2 != null) {
                return new 1(u2, outputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("out == null");
    }

    public static s a(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                a a2 = m.c(socket);
                return a2.a(m.a(socket.getOutputStream(), (u)a2));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static t a(File file) throws FileNotFoundException {
        if (file != null) {
            return m.a((InputStream)new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static t a(InputStream inputStream) {
        return m.a(inputStream, new u());
    }

    private static t a(InputStream inputStream, u u2) {
        if (inputStream != null) {
            if (u2 != null) {
                return new 2(u2, inputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("in == null");
    }

    static boolean a(AssertionError assertionError) {
        return assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains((CharSequence)"getsockname failed");
    }

    public static s b(File file) throws FileNotFoundException {
        if (file != null) {
            return m.a((OutputStream)new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static t b(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                a a2 = m.c(socket);
                return a2.a(m.a(socket.getInputStream(), (u)a2));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    private static a c(Socket socket) {
        return new 4(socket);
    }

    public static s c(File file) throws FileNotFoundException {
        if (file != null) {
            return m.a((OutputStream)new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }
}

