package com.nytimes.android.readerhybrid;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes4.dex */
class HybridSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<HybridSavedState> CREATOR = new a();
    private float percentScrolled;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HybridSavedState createFromParcel(Parcel parcel) {
            return new HybridSavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public HybridSavedState[] newArray(int i) {
            return new HybridSavedState[i];
        }
    }

    HybridSavedState(Parcel parcel) {
        super(parcel);
        this.percentScrolled = parcel.readFloat();
    }

    float a() {
        return this.percentScrolled;
    }

    void b(float f) {
        this.percentScrolled = f;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.percentScrolled);
    }

    HybridSavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
