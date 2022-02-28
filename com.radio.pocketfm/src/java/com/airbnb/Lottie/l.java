/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.Set
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Executors
 *  java.util.concurrent.FutureTask
 */
package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.airbnb.lottie.h;
import com.airbnb.lottie.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class l<T> {
    public static Executor a = Executors.newCachedThreadPool();
    private final Set<h<T>> b = new LinkedHashSet(1);
    private final Set<h<Throwable>> c = new LinkedHashSet(1);
    private final Handler d = new Handler(Looper.getMainLooper());
    private volatile k<T> e = null;

    public l(Callable<k<T>> callable) {
        this(callable, false);
    }

    l(Callable<k<T>> callable, boolean bl) {
        if (bl) {
            try {
                this.a((T)((k)callable.call()));
                return;
            }
            catch (Throwable throwable) {
                this.a((T)new k(throwable));
                return;
            }
        }
        a.execute((Runnable)new a(callable));
    }

    private void a() {
        this.d.post(new Runnable(){

            public void run() {
                if (l.this.e == null) {
                    return;
                }
                k k2 = l.this.e;
                if (k2.a() != null) {
                    l.this.a(k2.a());
                    return;
                }
                l.this.a(k2.b());
            }
        });
    }

    private void a(k<T> k2) {
        if (this.e == null) {
            this.e = k2;
            this.a();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    private void a(T t2) {
        l l2 = this;
        synchronized (l2) {
            Iterator iterator = new ArrayList(this.b).iterator();
            while (iterator.hasNext()) {
                ((h)iterator.next()).a(t2);
            }
            return;
        }
    }

    private void a(Throwable throwable) {
        l l2 = this;
        synchronized (l2) {
            ArrayList arrayList = new ArrayList(this.c);
            if (arrayList.isEmpty()) {
                Log.w((String)"LOTTIE", (String)"Lottie encountered an error but no failure listener was added.", (Throwable)throwable);
                return;
            }
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                ((h)iterator.next()).a(throwable);
            }
            return;
        }
    }

    public l<T> a(h<T> h2) {
        l l2 = this;
        synchronized (l2) {
            if (this.e != null && this.e.a() != null) {
                h2.a(this.e.a());
            }
            this.b.add(h2);
            return this;
        }
    }

    public l<T> b(h<T> h2) {
        l l2 = this;
        synchronized (l2) {
            this.b.remove(h2);
            return this;
        }
    }

    public l<T> c(h<Throwable> h2) {
        l l2 = this;
        synchronized (l2) {
            if (this.e != null && this.e.b() != null) {
                h2.a(this.e.b());
            }
            this.c.add(h2);
            return this;
        }
    }

    public l<T> d(h<Throwable> h2) {
        l l2 = this;
        synchronized (l2) {
            this.c.remove(h2);
            return this;
        }
    }

    private class a
    extends FutureTask<k<T>> {
        a(Callable<k<T>> callable) {
            super(callable);
        }

        protected void done() {
            void var1_3;
            if (this.isCancelled()) {
                return;
            }
            try {
                l.this.a((T)((k)this.get()));
                return;
            }
            catch (ExecutionException executionException) {
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            l.this.a((T)new k((Throwable)var1_3));
        }
    }

}

