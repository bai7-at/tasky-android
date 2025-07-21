package com.nytimes.android.media.audio.views;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes4.dex */
class AudioIndicatorSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<AudioIndicatorSavedState> CREATOR = new a();
    private long currentPlayTime;
    private boolean hasColorFilter;
    private String imageUrl;
    private boolean isEnabled;
    private float translationY;
    private int visibility;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AudioIndicatorSavedState createFromParcel(Parcel parcel) {
            return new AudioIndicatorSavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AudioIndicatorSavedState[] newArray(int i) {
            return new AudioIndicatorSavedState[i];
        }
    }

    AudioIndicatorSavedState(Parcelable parcelable) {
        super(parcelable);
        this.currentPlayTime = 0L;
    }

    private void g(Parcel parcel) {
        this.isEnabled = parcel.readInt() == 1;
        this.translationY = parcel.readFloat();
        this.visibility = parcel.readInt();
        this.currentPlayTime = parcel.readLong();
        this.hasColorFilter = parcel.readInt() == 1;
        this.imageUrl = parcel.readString();
    }

    long a() {
        return this.currentPlayTime;
    }

    boolean b() {
        return this.hasColorFilter;
    }

    String c() {
        return this.imageUrl;
    }

    boolean d() {
        return this.isEnabled;
    }

    float e() {
        return this.translationY;
    }

    int f() {
        return this.visibility;
    }

    void h(long j) {
        this.currentPlayTime = j;
    }

    void i(boolean z) {
        this.isEnabled = z;
    }

    void k(boolean z) {
        this.hasColorFilter = z;
    }

    void l(Object obj) {
        this.imageUrl = obj instanceof String ? (String) obj : null;
    }

    void m(float f) {
        this.translationY = f;
    }

    void n(int i) {
        this.visibility = i;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeFloat(this.translationY);
        parcel.writeInt(this.visibility);
        parcel.writeLong(this.currentPlayTime);
        parcel.writeInt(this.hasColorFilter ? 1 : 0);
        parcel.writeString(this.imageUrl);
    }

    AudioIndicatorSavedState(Parcel parcel) {
        super(parcel);
        this.currentPlayTime = 0L;
        g(parcel);
    }
}
