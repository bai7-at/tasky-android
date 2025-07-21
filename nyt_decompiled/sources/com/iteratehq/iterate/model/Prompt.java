package com.iteratehq.iterate.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class Prompt implements Parcelable {
    public static final Parcelable.Creator<Prompt> CREATOR = new a();

    @SerializedName("button_text")
    private final String buttonText;
    private final String message;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Prompt createFromParcel(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return new Prompt(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Prompt[] newArray(int i) {
            return new Prompt[i];
        }
    }

    public Prompt(String str, String str2) {
        zq3.h(str, "message");
        zq3.h(str2, "buttonText");
        this.message = str;
        this.buttonText = str2;
    }

    public static /* synthetic */ Prompt copy$default(Prompt prompt, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prompt.message;
        }
        if ((i & 2) != 0) {
            str2 = prompt.buttonText;
        }
        return prompt.copy(str, str2);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.buttonText;
    }

    public final Prompt copy(String str, String str2) {
        zq3.h(str, "message");
        zq3.h(str2, "buttonText");
        return new Prompt(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prompt)) {
            return false;
        }
        Prompt prompt = (Prompt) obj;
        return zq3.c(this.message, prompt.message) && zq3.c(this.buttonText, prompt.buttonText);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.buttonText.hashCode();
    }

    public String toString() {
        return "Prompt(message=" + this.message + ", buttonText=" + this.buttonText + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        parcel.writeString(this.message);
        parcel.writeString(this.buttonText);
    }
}
