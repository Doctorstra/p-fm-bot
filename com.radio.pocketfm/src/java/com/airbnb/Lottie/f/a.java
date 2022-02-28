/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArraySet
 */
package com.airbnb.lottie.f;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class a
extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> a = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> b = new CopyOnWriteArraySet();

    void a() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((Animator.AnimatorListener)iterator.next()).onAnimationRepeat((Animator)this);
        }
    }

    void a(boolean bl) {
        for (Animator.AnimatorListener animatorListener : this.b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart((Animator)this, bl);
                continue;
            }
            animatorListener.onAnimationStart((Animator)this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.b.add((Object)animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.add((Object)animatorUpdateListener);
    }

    void b() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((Animator.AnimatorListener)iterator.next()).onAnimationCancel((Animator)this);
        }
    }

    void b(boolean bl) {
        for (Animator.AnimatorListener animatorListener : this.b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd((Animator)this, bl);
                continue;
            }
            animatorListener.onAnimationEnd((Animator)this);
        }
    }

    void c() {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener)iterator.next()).onAnimationUpdate((ValueAnimator)this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.b.clear();
    }

    public void removeAllUpdateListeners() {
        this.a.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.b.remove((Object)animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.remove((Object)animatorUpdateListener);
    }

    public ValueAnimator setDuration(long l2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long l2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
