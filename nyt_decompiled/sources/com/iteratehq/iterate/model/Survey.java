package com.iteratehq.iterate.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class Survey implements Parcelable {
    public static final Parcelable.Creator<Survey> CREATOR = new a();
    private final String color;

    @SerializedName("color_dark")
    private final String colorDark;

    @SerializedName("company_id")
    private final String companyId;
    private final String id;
    private final Prompt prompt;
    private final String title;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Survey createFromParcel(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return new Survey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Prompt.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Survey[] newArray(int i) {
            return new Survey[i];
        }
    }

    public Survey(String str, String str2, String str3, Prompt prompt, String str4, String str5) {
        zq3.h(str, "id");
        zq3.h(str2, "companyId");
        zq3.h(str3, "title");
        this.id = str;
        this.companyId = str2;
        this.title = str3;
        this.prompt = prompt;
        this.color = str4;
        this.colorDark = str5;
    }

    public static /* synthetic */ Survey copy$default(Survey survey, String str, String str2, String str3, Prompt prompt, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = survey.id;
        }
        if ((i & 2) != 0) {
            str2 = survey.companyId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = survey.title;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            prompt = survey.prompt;
        }
        Prompt prompt2 = prompt;
        if ((i & 16) != 0) {
            str4 = survey.color;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = survey.colorDark;
        }
        return survey.copy(str, str6, str7, prompt2, str8, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.companyId;
    }

    public final String component3() {
        return this.title;
    }

    public final Prompt component4() {
        return this.prompt;
    }

    public final String component5() {
        return this.color;
    }

    public final String component6() {
        return this.colorDark;
    }

    public final Survey copy(String str, String str2, String str3, Prompt prompt, String str4, String str5) {
        zq3.h(str, "id");
        zq3.h(str2, "companyId");
        zq3.h(str3, "title");
        return new Survey(str, str2, str3, prompt, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Survey)) {
            return false;
        }
        Survey survey = (Survey) obj;
        return zq3.c(this.id, survey.id) && zq3.c(this.companyId, survey.companyId) && zq3.c(this.title, survey.title) && zq3.c(this.prompt, survey.prompt) && zq3.c(this.color, survey.color) && zq3.c(this.colorDark, survey.colorDark);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorDark() {
        return this.colorDark;
    }

    public final String getCompanyId() {
        return this.companyId;
    }

    public final String getId() {
        return this.id;
    }

    public final Prompt getPrompt() {
        return this.prompt;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.companyId.hashCode()) * 31) + this.title.hashCode()) * 31;
        Prompt prompt = this.prompt;
        int hashCode2 = (hashCode + (prompt == null ? 0 : prompt.hashCode())) * 31;
        String str = this.color;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.colorDark;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Survey(id=" + this.id + ", companyId=" + this.companyId + ", title=" + this.title + ", prompt=" + this.prompt + ", color=" + this.color + ", colorDark=" + this.colorDark + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.companyId);
        parcel.writeString(this.title);
        Prompt prompt = this.prompt;
        if (prompt == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            prompt.writeToParcel(parcel, i);
        }
        parcel.writeString(this.color);
        parcel.writeString(this.colorDark);
    }
}
