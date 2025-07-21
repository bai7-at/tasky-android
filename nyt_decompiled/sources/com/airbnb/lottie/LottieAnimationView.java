package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.al;
import defpackage.cd4;
import defpackage.gw3;
import defpackage.im2;
import defpackage.j94;
import defpackage.jc4;
import defpackage.jn6;
import defpackage.js7;
import defpackage.kc6;
import defpackage.l29;
import defpackage.lf3;
import defpackage.lh4;
import defpackage.sc4;
import defpackage.sh8;
import defpackage.wc4;
import defpackage.xc4;
import defpackage.yx3;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final String t = "LottieAnimationView";
    private static final sc4 u = new sc4() { // from class: zb4
        @Override // defpackage.sc4
        public final void onResult(Object obj) {
            LottieAnimationView.t((Throwable) obj);
        }
    };
    private final sc4 d;
    private final sc4 e;
    private sc4 f;
    private int g;
    private final LottieDrawable h;
    private String i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final Set n;
    private final Set r;
    private o s;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String animationName;
        int animationResId;
        String imageAssetsFolder;
        boolean isAnimating;
        float progress;
        int repeatCount;
        int repeatMode;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, com.airbnb.lottie.a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating ? 1 : 0);
            parcel.writeString(this.imageAssetsFolder);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            this.isAnimating = parcel.readInt() == 1;
            this.imageAssetsFolder = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }
    }

    private enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private static class a implements sc4 {
        private final WeakReference a;

        public a(LottieAnimationView lottieAnimationView) {
            this.a = new WeakReference(lottieAnimationView);
        }

        @Override // defpackage.sc4
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.g != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.g);
            }
            (lottieAnimationView.f == null ? LottieAnimationView.u : lottieAnimationView.f).onResult(th);
        }
    }

    private static class b implements sc4 {
        private final WeakReference a;

        public b(LottieAnimationView lottieAnimationView) {
            this.a = new WeakReference(lottieAnimationView);
        }

        @Override // defpackage.sc4
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(LottieComposition lottieComposition) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(lottieComposition);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new b(this);
        this.e = new a(this);
        this.g = 0;
        this.h = new LottieDrawable();
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = new HashSet();
        this.r = new HashSet();
        p(attributeSet, kc6.lottieAnimationViewStyle);
    }

    private void A(float f, boolean z) {
        if (z) {
            this.n.add(UserActionTaken.SET_PROGRESS);
        }
        this.h.a1(f);
    }

    private void k() {
        o oVar = this.s;
        if (oVar != null) {
            oVar.k(this.d);
            this.s.j(this.e);
        }
    }

    private void l() {
        this.h.u();
    }

    private o n(final String str) {
        return isInEditMode() ? new o(new Callable() { // from class: yb4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xc4 r;
                r = LottieAnimationView.this.r(str);
                return r;
            }
        }, true) : this.m ? jc4.j(getContext(), str) : jc4.k(getContext(), str, null);
    }

    private o o(final int i) {
        return isInEditMode() ? new o(new Callable() { // from class: ac4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xc4 s;
                s = LottieAnimationView.this.s(i);
                return s;
            }
        }, true) : this.m ? jc4.s(getContext(), i) : jc4.t(getContext(), i, null);
    }

    private void p(AttributeSet attributeSet, int i) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jn6.LottieAnimationView, i, 0);
        this.m = obtainStyledAttributes.getBoolean(jn6.LottieAnimationView_lottie_cacheComposition, true);
        boolean hasValue = obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_rawRes);
        boolean hasValue2 = obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_fileName);
        boolean hasValue3 = obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_url);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(jn6.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(jn6.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(jn6.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(jn6.LottieAnimationView_lottie_fallbackRes, 0));
        if (obtainStyledAttributes.getBoolean(jn6.LottieAnimationView_lottie_autoPlay, false)) {
            this.l = true;
        }
        if (obtainStyledAttributes.getBoolean(jn6.LottieAnimationView_lottie_loop, false)) {
            this.h.c1(-1);
        }
        if (obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(jn6.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(jn6.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_speed)) {
            setSpeed(obtainStyledAttributes.getFloat(jn6.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(jn6.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_clipTextToBoundingBox)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(jn6.LottieAnimationView_lottie_clipTextToBoundingBox, false));
        }
        if (obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(jn6.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(jn6.LottieAnimationView_lottie_imageAssetsFolder));
        A(obtainStyledAttributes.getFloat(jn6.LottieAnimationView_lottie_progress, 0.0f), obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_progress));
        m(obtainStyledAttributes.getBoolean(jn6.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_colorFilter)) {
            i(new gw3("**"), wc4.K, new cd4(new js7(al.a(getContext(), obtainStyledAttributes.getResourceId(jn6.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_renderMode)) {
            int i2 = jn6.LottieAnimationView_lottie_renderMode;
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i3 = obtainStyledAttributes.getInt(i2, renderMode.ordinal());
            if (i3 >= RenderMode.values().length) {
                i3 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i3]);
        }
        if (obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_asyncUpdates)) {
            int i4 = jn6.LottieAnimationView_lottie_asyncUpdates;
            AsyncUpdates asyncUpdates = AsyncUpdates.AUTOMATIC;
            int i5 = obtainStyledAttributes.getInt(i4, asyncUpdates.ordinal());
            if (i5 >= RenderMode.values().length) {
                i5 = asyncUpdates.ordinal();
            }
            setAsyncUpdates(AsyncUpdates.values()[i5]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(jn6.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (obtainStyledAttributes.hasValue(jn6.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(jn6.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        obtainStyledAttributes.recycle();
        this.h.g1(Boolean.valueOf(l29.f(getContext()) != 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xc4 r(String str) {
        return this.m ? jc4.l(getContext(), str) : jc4.m(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xc4 s(int i) {
        return this.m ? jc4.u(getContext(), i) : jc4.v(getContext(), i, null);
    }

    private void setCompositionTask(o oVar) {
        xc4 e = oVar.e();
        LottieDrawable lottieDrawable = this.h;
        if (e != null && lottieDrawable == getDrawable() && lottieDrawable.K() == e.b()) {
            return;
        }
        this.n.add(UserActionTaken.SET_ANIMATION);
        l();
        k();
        this.s = oVar.d(this.d).c(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Throwable th) {
        if (!l29.k(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        j94.d("Unable to load composition.", th);
    }

    private void z() {
        boolean q = q();
        setImageDrawable(null);
        setImageDrawable(this.h);
        if (q) {
            this.h.B0();
        }
    }

    public AsyncUpdates getAsyncUpdates() {
        return this.h.F();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.h.G();
    }

    public boolean getClipTextToBoundingBox() {
        return this.h.I();
    }

    public boolean getClipToCompositionBounds() {
        return this.h.J();
    }

    public LottieComposition getComposition() {
        Drawable drawable = getDrawable();
        LottieDrawable lottieDrawable = this.h;
        if (drawable == lottieDrawable) {
            return lottieDrawable.K();
        }
        return null;
    }

    public long getDuration() {
        LottieComposition composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.h.N();
    }

    public String getImageAssetsFolder() {
        return this.h.P();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.h.R();
    }

    public float getMaxFrame() {
        return this.h.T();
    }

    public float getMinFrame() {
        return this.h.U();
    }

    public p getPerformanceTracker() {
        return this.h.V();
    }

    public float getProgress() {
        return this.h.W();
    }

    public RenderMode getRenderMode() {
        return this.h.X();
    }

    public int getRepeatCount() {
        return this.h.Y();
    }

    public int getRepeatMode() {
        return this.h.Z();
    }

    public float getSpeed() {
        return this.h.a0();
    }

    public void i(gw3 gw3Var, Object obj, cd4 cd4Var) {
        this.h.q(gw3Var, obj, cd4Var);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).X() == RenderMode.SOFTWARE) {
            this.h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.h;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void j() {
        this.l = false;
        this.n.add(UserActionTaken.PLAY_OPTION);
        this.h.t();
    }

    public void m(boolean z) {
        this.h.A(z);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.l) {
            return;
        }
        this.h.y0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.i = savedState.animationName;
        Set set = this.n;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.i)) {
            setAnimation(this.i);
        }
        this.j = savedState.animationResId;
        if (!this.n.contains(userActionTaken) && (i = this.j) != 0) {
            setAnimation(i);
        }
        if (!this.n.contains(UserActionTaken.SET_PROGRESS)) {
            A(savedState.progress, false);
        }
        if (!this.n.contains(UserActionTaken.PLAY_OPTION) && savedState.isAnimating) {
            v();
        }
        if (!this.n.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.imageAssetsFolder);
        }
        if (!this.n.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.repeatMode);
        }
        if (this.n.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.repeatCount);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.i;
        savedState.animationResId = this.j;
        savedState.progress = this.h.W();
        savedState.isAnimating = this.h.f0();
        savedState.imageAssetsFolder = this.h.P();
        savedState.repeatMode = this.h.Z();
        savedState.repeatCount = this.h.Y();
        return savedState;
    }

    public boolean q() {
        return this.h.e0();
    }

    public void setAnimation(int i) {
        this.j = i;
        this.i = null;
        setCompositionTask(o(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        y(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.m ? jc4.w(getContext(), str) : jc4.x(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.h.D0(z);
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.h.E0(asyncUpdates);
    }

    public void setCacheComposition(boolean z) {
        this.m = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        this.h.F0(z);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.h.G0(z);
    }

    public void setComposition(LottieComposition lottieComposition) {
        if (yx3.a) {
            Log.v(t, "Set Composition \n" + lottieComposition);
        }
        this.h.setCallback(this);
        this.k = true;
        boolean H0 = this.h.H0(lottieComposition);
        if (this.l) {
            this.h.y0();
        }
        this.k = false;
        if (getDrawable() != this.h || H0) {
            if (!H0) {
                z();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.r.iterator();
            if (it2.hasNext()) {
                lh4.a(it2.next());
                throw null;
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.h.I0(str);
    }

    public void setFailureListener(sc4 sc4Var) {
        this.f = sc4Var;
    }

    public void setFallbackResource(int i) {
        this.g = i;
    }

    public void setFontAssetDelegate(im2 im2Var) {
        this.h.J0(im2Var);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.h.K0(map);
    }

    public void setFrame(int i) {
        this.h.L0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.h.M0(z);
    }

    public void setImageAssetDelegate(lf3 lf3Var) {
        this.h.N0(lf3Var);
    }

    public void setImageAssetsFolder(String str) {
        this.h.O0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.j = 0;
        this.i = null;
        k();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.j = 0;
        this.i = null;
        k();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.j = 0;
        this.i = null;
        k();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.h.P0(z);
    }

    public void setMaxFrame(int i) {
        this.h.Q0(i);
    }

    public void setMaxProgress(float f) {
        this.h.S0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.h.U0(str);
    }

    public void setMinFrame(int i) {
        this.h.V0(i);
    }

    public void setMinProgress(float f) {
        this.h.X0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.h.Y0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.h.Z0(z);
    }

    public void setProgress(float f) {
        A(f, true);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.h.b1(renderMode);
    }

    public void setRepeatCount(int i) {
        this.n.add(UserActionTaken.SET_REPEAT_COUNT);
        this.h.c1(i);
    }

    public void setRepeatMode(int i) {
        this.n.add(UserActionTaken.SET_REPEAT_MODE);
        this.h.d1(i);
    }

    public void setSafeMode(boolean z) {
        this.h.e1(z);
    }

    public void setSpeed(float f) {
        this.h.f1(f);
    }

    public void setTextDelegate(sh8 sh8Var) {
        this.h.h1(sh8Var);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.h.i1(z);
    }

    public void u() {
        this.l = false;
        this.h.x0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.k && drawable == (lottieDrawable = this.h) && lottieDrawable.e0()) {
            u();
        } else if (!this.k && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.e0()) {
                lottieDrawable2.x0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.n.add(UserActionTaken.PLAY_OPTION);
        this.h.y0();
    }

    public void w() {
        this.n.add(UserActionTaken.PLAY_OPTION);
        this.h.B0();
    }

    public void x(InputStream inputStream, String str) {
        setCompositionTask(jc4.n(inputStream, str));
    }

    public void y(String str, String str2) {
        x(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.h.R0(str);
    }

    public void setMinFrame(String str) {
        this.h.W0(str);
    }

    public void setAnimation(String str) {
        this.i = str;
        this.j = 0;
        setCompositionTask(n(str));
    }
}
