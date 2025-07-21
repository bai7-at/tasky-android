package com.nytimes.xwords.hybrid;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class HybridSavedState extends View.BaseSavedState {
    public static final int $stable = 8;
    private float percentScrolled;

    public HybridSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public final float a() {
        return this.percentScrolled;
    }

    public final void b(float f) {
        this.percentScrolled = f;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.percentScrolled);
    }
}
