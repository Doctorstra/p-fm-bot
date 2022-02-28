/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Bitmap
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.JsonReader
 *  android.util.Log
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  androidx.appcompat.widget.AppCompatImageView
 *  java.io.Reader
 *  java.io.StringReader
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.R;
import com.airbnb.lottie.a;
import com.airbnb.lottie.b;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e;
import com.airbnb.lottie.f;
import com.airbnb.lottie.h;
import com.airbnb.lottie.i;
import com.airbnb.lottie.j;
import com.airbnb.lottie.l;
import com.airbnb.lottie.m;
import com.airbnb.lottie.n;
import com.airbnb.lottie.o;
import com.airbnb.lottie.p;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LottieAnimationView
extends AppCompatImageView {
    private static final String a = "LottieAnimationView";
    private final h<d> b = new h<d>(this){
        final /* synthetic */ LottieAnimationView a;
        {
            this.a = lottieAnimationView;
        }

        public void a(d d2) {
            this.a.setComposition(d2);
        }
    };
    private final h<Throwable> c = new h<Throwable>(this){
        final /* synthetic */ LottieAnimationView a;
        {
            this.a = lottieAnimationView;
        }

        public void a(Throwable throwable) {
            throw new java.lang.IllegalStateException("Unable to parse composition", throwable);
        }
    };
    private final f d = new f();
    private String e;
    private int f;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private n j = n.a;
    private Set<i> k = new HashSet();
    private l<d> l;
    private d m;

    public LottieAnimationView(Context context) {
        super(context);
        this.a((AttributeSet)null);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        TypedArray typedArray = this.getContext().obtainStyledAttributes(attributeSet, R.styleable.LottieAnimationView);
        if (!this.isInEditMode()) {
            String string;
            boolean bl = typedArray.hasValue(R.styleable.LottieAnimationView_lottie_rawRes);
            boolean bl2 = typedArray.hasValue(R.styleable.LottieAnimationView_lottie_fileName);
            boolean bl3 = typedArray.hasValue(R.styleable.LottieAnimationView_lottie_url);
            if (bl && bl2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
            if (bl) {
                int n2 = typedArray.getResourceId(R.styleable.LottieAnimationView_lottie_rawRes, 0);
                if (n2 != 0) {
                    this.setAnimation(n2);
                }
            } else if (bl2) {
                String string2 = typedArray.getString(R.styleable.LottieAnimationView_lottie_fileName);
                if (string2 != null) {
                    this.setAnimation(string2);
                }
            } else if (bl3 && (string = typedArray.getString(R.styleable.LottieAnimationView_lottie_url)) != null) {
                this.setAnimationFromUrl(string);
            }
        }
        if (typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.h = true;
            this.i = true;
        }
        if (typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false)) {
            this.d.e(-1);
        }
        if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_repeatMode)) {
            this.setRepeatMode(typedArray.getInt(R.styleable.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_repeatCount)) {
            this.setRepeatCount(typedArray.getInt(R.styleable.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_speed)) {
            this.setSpeed(typedArray.getFloat(R.styleable.LottieAnimationView_lottie_speed, 1.0f));
        }
        this.setImageAssetsFolder(typedArray.getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
        this.setProgress(typedArray.getFloat(R.styleable.LottieAnimationView_lottie_progress, 0.0f));
        this.a(typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_colorFilter)) {
            o o2 = new o(typedArray.getColor(R.styleable.LottieAnimationView_lottie_colorFilter, 0));
            com.airbnb.lottie.c.e e2 = new com.airbnb.lottie.c.e("**");
            com.airbnb.lottie.g.c<o> c2 = new com.airbnb.lottie.g.c<o>(o2);
            this.a(e2, (T)j.z, c2);
        }
        if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_scale)) {
            this.d.e(typedArray.getFloat(R.styleable.LottieAnimationView_lottie_scale, 1.0f));
        }
        typedArray.recycle();
        this.i();
    }

    private void g() {
        l<d> l2 = this.l;
        if (l2 != null) {
            l2.b(this.b);
            this.l.d(this.c);
        }
    }

    private void h() {
        this.m = null;
        this.d.d();
    }

    private void i() {
        int n2 = 3.a[this.j.ordinal()];
        int n3 = 2;
        if (n2 != 1) {
            if (n2 != n3) {
                d d2;
                if (n2 != 3) {
                    return;
                }
                d d3 = this.m;
                boolean bl = d3 != null && d3.a() && Build.VERSION.SDK_INT < 28 ? false : (d2 = this.m) == null || d2.b() <= 4;
                if (!bl) {
                    n3 = 1;
                }
                this.setLayerType(n3, null);
                return;
            }
            this.setLayerType(1, null);
            return;
        }
        this.setLayerType(n3, null);
    }

    private void setCompositionTask(l<d> l2) {
        this.h();
        this.g();
        this.l = l2.a(this.b).c(this.c);
    }

    public void a() {
        this.d.e();
        this.i();
    }

    public void a(Animator.AnimatorListener animatorListener) {
        this.d.a(animatorListener);
    }

    public void a(JsonReader jsonReader, String string) {
        this.setCompositionTask(e.a(jsonReader, string));
    }

    public <T> void a(com.airbnb.lottie.c.e e2, T t2, com.airbnb.lottie.g.c<T> c2) {
        this.d.a(e2, t2, c2);
    }

    public void a(String string, String string2) {
        this.a(new JsonReader((Reader)new StringReader(string)), string2);
    }

    public void a(boolean bl) {
        this.d.a(bl);
    }

    public void b() {
        this.d.g();
        this.i();
    }

    public void c() {
        this.d.k();
    }

    public boolean d() {
        return this.d.o();
    }

    public void e() {
        this.d.t();
        this.i();
    }

    public void f() {
        this.d.u();
        this.i();
    }

    public d getComposition() {
        return this.m;
    }

    public long getDuration() {
        d d2 = this.m;
        if (d2 != null) {
            return (long)d2.e();
        }
        return 0L;
    }

    public int getFrame() {
        return this.d.l();
    }

    public String getImageAssetsFolder() {
        return this.d.b();
    }

    public float getMaxFrame() {
        return this.d.i();
    }

    public float getMinFrame() {
        return this.d.h();
    }

    public m getPerformanceTracker() {
        return this.d.c();
    }

    public float getProgress() {
        return this.d.v();
    }

    public int getRepeatCount() {
        return this.d.n();
    }

    public int getRepeatMode() {
        return this.d.m();
    }

    public float getScale() {
        return this.d.r();
    }

    public float getSpeed() {
        return this.d.j();
    }

    public void invalidateDrawable(Drawable drawable) {
        f f2;
        Drawable drawable2 = this.getDrawable();
        if (drawable2 == (f2 = this.d)) {
            super.invalidateDrawable((Drawable)f2);
            return;
        }
        super.invalidateDrawable(drawable);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i && this.h) {
            this.a();
        }
    }

    protected void onDetachedFromWindow() {
        if (this.d()) {
            this.e();
            this.h = true;
        }
        super.onDetachedFromWindow();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        int n2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.e = savedState.a;
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            this.setAnimation(this.e);
        }
        if ((n2 = (this.f = savedState.b)) != 0) {
            this.setAnimation(n2);
        }
        this.setProgress(savedState.c);
        if (savedState.d) {
            this.a();
        }
        this.d.a(savedState.e);
        this.setRepeatMode(savedState.f);
        this.setRepeatCount(savedState.g);
    }

    protected Parcelable onSaveInstanceState() {
        View.BaseSavedState baseSavedState = new View.BaseSavedState(super.onSaveInstanceState()){
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>(){

                public SavedState a(Parcel parcel) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                public SavedState[] a(int n2) {
                    return new SavedState[n2];
                }

                public /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return this.a(parcel);
                }

                public /* synthetic */ Object[] newArray(int n2) {
                    return this.a(n2);
                }
            };
            String a;
            int b;
            float c;
            boolean d;
            String e;
            int f;
            int g;
            {
                this.a = parcel.readString();
                this.c = parcel.readFloat();
                int n2 = parcel.readInt();
                int n3 = 1;
                if (n2 != n3) {
                    n3 = 0;
                }
                this.d = n3;
                this.e = parcel.readString();
                this.f = parcel.readInt();
                this.g = parcel.readInt();
            }

            public void writeToParcel(Parcel parcel, int n2) {
                super.writeToParcel(parcel, n2);
                parcel.writeString(this.a);
                parcel.writeFloat(this.c);
                parcel.writeInt((int)this.d);
                parcel.writeString(this.e);
                parcel.writeInt(this.f);
                parcel.writeInt(this.g);
            }

        };
        baseSavedState.a = this.e;
        baseSavedState.b = this.f;
        baseSavedState.c = this.d.v();
        baseSavedState.d = this.d.o();
        baseSavedState.e = this.d.b();
        baseSavedState.f = this.d.m();
        baseSavedState.g = this.d.n();
        return baseSavedState;
    }

    protected void onVisibilityChanged(View view, int n2) {
        if (n2 == 0) {
            if (this.g) {
                this.b();
                return;
            }
        } else {
            this.g = this.d();
            if (this.d()) {
                this.f();
            }
        }
    }

    public void setAnimation(int n2) {
        this.f = n2;
        this.e = null;
        this.setCompositionTask(e.a(this.getContext(), n2));
    }

    public void setAnimation(String string) {
        this.e = string;
        this.f = 0;
        this.setCompositionTask(e.b(this.getContext(), string));
    }

    @Deprecated
    public void setAnimationFromJson(String string) {
        this.a(string, null);
    }

    public void setAnimationFromUrl(String string) {
        this.setCompositionTask(e.a(this.getContext(), string));
    }

    public void setComposition(d d2) {
        if (c.a) {
            String string = a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Set Composition \n");
            stringBuilder.append((Object)d2);
            Log.v((String)string, (String)stringBuilder.toString());
        }
        this.d.setCallback((Drawable.Callback)this);
        this.m = d2;
        boolean bl = this.d.a(d2);
        this.i();
        if (this.getDrawable() == this.d && !bl) {
            return;
        }
        this.setImageDrawable(null);
        this.setImageDrawable(this.d);
        this.requestLayout();
        Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            ((i)iterator.next()).a(d2);
        }
    }

    public void setFontAssetDelegate(a a2) {
        this.d.a(a2);
    }

    public void setFrame(int n2) {
        this.d.c(n2);
    }

    public void setImageAssetDelegate(b b2) {
        this.d.a(b2);
    }

    public void setImageAssetsFolder(String string) {
        this.d.a(string);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.g();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        this.g();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int n2) {
        this.g();
        super.setImageResource(n2);
    }

    public void setMaxFrame(int n2) {
        this.d.b(n2);
    }

    public void setMaxFrame(String string) {
        this.d.c(string);
    }

    public void setMaxProgress(float f2) {
        this.d.b(f2);
    }

    public void setMinAndMaxFrame(String string) {
        this.d.d(string);
    }

    public void setMinFrame(int n2) {
        this.d.a(n2);
    }

    public void setMinFrame(String string) {
        this.d.b(string);
    }

    public void setMinProgress(float f2) {
        this.d.a(f2);
    }

    public void setPerformanceTrackingEnabled(boolean bl) {
        this.d.b(bl);
    }

    public void setProgress(float f2) {
        this.d.d(f2);
    }

    public void setRenderMode(n n2) {
        this.j = n2;
        this.i();
    }

    public void setRepeatCount(int n2) {
        this.d.e(n2);
    }

    public void setRepeatMode(int n2) {
        this.d.d(n2);
    }

    public void setScale(float f2) {
        this.d.e(f2);
        if (this.getDrawable() == this.d) {
            this.setImageDrawable(null);
            this.setImageDrawable(this.d);
        }
    }

    public void setSpeed(float f2) {
        this.d.c(f2);
    }

    public void setTextDelegate(p p2) {
        this.d.a(p2);
    }

}

