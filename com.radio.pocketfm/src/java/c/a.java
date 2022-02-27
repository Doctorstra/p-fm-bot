/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.TimeUnit
 */
package c;

import c.c;
import c.p;
import c.s;
import c.t;
import c.u;
import c.v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class a
extends u {
    private static final long a = TimeUnit.SECONDS.toMillis(60L);
    static a b;
    private static final long d;
    private boolean e;
    private a f;
    private long g;

    static {
        d = TimeUnit.MILLISECONDS.toNanos(a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(a a2, long l2, boolean bl2) {
        Class<a> class_ = a.class;
        synchronized (a.class) {
            if (b == null) {
                b = new a();
                new Thread(){
                    {
                        this.setDaemon(true);
                    }

                    /*
                     * Exception decompiling
                     */
                    public void run() {
                        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
                        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
                        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
                        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
                        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
                        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                        // org.benf.cfr.reader.entities.g.p(Method.java:396)
                        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                        // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                        // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
                        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
                        // org.benf.cfr.reader.b.a(Driver.java:128)
                        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
                        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
                        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
                        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
                        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
                        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
                        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
                        // java.lang.Thread.run(Thread.java:919)
                        throw new IllegalStateException("Decompilation failed");
                    }
                }.start();
            }
            long l3 = System.nanoTime();
            if (l2 != 0L && bl2) {
                a2.g = l3 + Math.min((long)l2, (long)(a2.d() - l3));
            } else if (l2 != 0L) {
                a2.g = l2 + l3;
            } else {
                if (!bl2) {
                    throw new AssertionError();
                }
                a2.g = a2.d();
            }
            long l4 = a2.b(l3);
            a a3 = b;
            while (a3.f != null && l4 >= a3.f.b(l3)) {
                a3 = a3.f;
            }
            a2.f = a3.f;
            a3.f = a2;
            if (a3 == b) {
                a.class.notify();
            }
            // ** MonitorExit[var10_3] (shouldn't be in output)
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean a(a a2) {
        Class<a> class_ = a.class;
        synchronized (a.class) {
            a a3 = b;
            do {
                if (a3 == null) {
                    // ** MonitorExit[var3_1] (shouldn't be in output)
                    return true;
                }
                if (a3.f == a2) {
                    a3.f = a2.f;
                    a2.f = null;
                    // ** MonitorExit[var3_1] (shouldn't be in output)
                    return false;
                }
                a3 = a3.f;
            } while (true);
        }
    }

    private long b(long l2) {
        return this.g - l2;
    }

    static a e() throws InterruptedException {
        a a2 = a.b.f;
        if (a2 == null) {
            long l2 = System.nanoTime();
            a.class.wait(a);
            a a3 = a.b.f;
            a a4 = null;
            if (a3 == null) {
                long l3 = System.nanoTime() - l2 LCMP d;
                a4 = null;
                if (l3 >= 0) {
                    a4 = b;
                }
            }
            return a4;
        }
        long l4 = a2.b(System.nanoTime());
        if (l4 > 0L) {
            long l5 = l4 / 1000000L;
            a.class.wait(l5, (int)(l4 - 1000000L * l5));
            return null;
        }
        a.b.f = a2.f;
        a2.f = null;
        return a2;
    }

    public final s a(final s s2) {
        return new s(){

            @Override
            public u a() {
                return a.this;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            @Override
            public void a_(c c2, long l2) throws IOException {
                long l3;
                Throwable throwable2222;
                v.a(c2.b, 0L, l2);
                while (l2 > (l3 = 0L)) {
                    p p2 = c2.a;
                    while (l3 < 65536L) {
                        if ((l3 += (long)(p2.c - p2.b)) >= l2) {
                            l3 = l2;
                            break;
                        }
                        p2 = p2.f;
                    }
                    a.this.c();
                    s2.a_(c2, l3);
                    l2 -= l3;
                    a.this.a(true);
                }
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.b(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            @Override
            public void close() throws IOException {
                Throwable throwable2222;
                a.this.c();
                s2.close();
                a.this.a(true);
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.b(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            @Override
            public void flush() throws IOException {
                Throwable throwable2222;
                a.this.c();
                s2.flush();
                a.this.a(true);
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.b(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AsyncTimeout.sink(");
                stringBuilder.append((Object)s2);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        };
    }

    public final t a(final t t2) {
        return new t(){

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            @Override
            public long a(c c2, long l2) throws IOException {
                Throwable throwable2222;
                a.this.c();
                long l3 = t2.a(c2, l2);
                a.this.a(true);
                return l3;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.b(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            @Override
            public u a() {
                return a.this;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            @Override
            public void close() throws IOException {
                Throwable throwable2222;
                t2.close();
                a.this.a(true);
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.b(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AsyncTimeout.source(");
                stringBuilder.append((Object)t2);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        };
    }

    protected IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause((Throwable)iOException);
        }
        return interruptedIOException;
    }

    protected void a() {
    }

    final void a(boolean bl2) throws IOException {
        if (this.r_()) {
            if (!bl2) {
                return;
            }
            throw this.a((IOException)null);
        }
    }

    final IOException b(IOException iOException) throws IOException {
        if (!this.r_()) {
            return iOException;
        }
        return this.a(iOException);
    }

    public final void c() {
        if (!this.e) {
            long l2 = this.s_();
            boolean bl2 = this.t_();
            if (l2 == 0L && !bl2) {
                return;
            }
            this.e = true;
            a.a(this, l2, bl2);
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean r_() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a.a(this);
    }

}

