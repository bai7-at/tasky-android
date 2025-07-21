package com.nytimes.android.api.cms;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Addendum {

    @SerializedName("data_id")
    private final String assetId;
    private final String body;

    @SerializedName("is_error_fixed_in_article")
    private final boolean correctionFlag;

    @SerializedName("publication_date")
    private final long publicationDate;

    /* renamed from: type, reason: collision with root package name */
    @SerializedName("addendum_type")
    private final String f54type;

    public Addendum(String str, String str2, long j, boolean z, String str3) {
        zq3.h(str, "assetId");
        zq3.h(str2, TransferTable.COLUMN_TYPE);
        zq3.h(str3, "body");
        this.assetId = str;
        this.f54type = str2;
        this.publicationDate = j;
        this.correctionFlag = z;
        this.body = str3;
    }

    public static /* synthetic */ Addendum copy$default(Addendum addendum, String str, String str2, long j, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addendum.assetId;
        }
        if ((i & 2) != 0) {
            str2 = addendum.f54type;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = addendum.publicationDate;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = addendum.correctionFlag;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = addendum.body;
        }
        return addendum.copy(str, str4, j2, z2, str3);
    }

    public final String component1() {
        return this.assetId;
    }

    public final String component2() {
        return this.f54type;
    }

    public final long component3() {
        return this.publicationDate;
    }

    public final boolean component4() {
        return this.correctionFlag;
    }

    public final String component5() {
        return this.body;
    }

    public final Addendum copy(String str, String str2, long j, boolean z, String str3) {
        zq3.h(str, "assetId");
        zq3.h(str2, TransferTable.COLUMN_TYPE);
        zq3.h(str3, "body");
        return new Addendum(str, str2, j, z, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Addendum)) {
            return false;
        }
        Addendum addendum = (Addendum) obj;
        return zq3.c(this.assetId, addendum.assetId) && zq3.c(this.f54type, addendum.f54type) && this.publicationDate == addendum.publicationDate && this.correctionFlag == addendum.correctionFlag && zq3.c(this.body, addendum.body);
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getBody() {
        return this.body;
    }

    public final boolean getCorrectionFlag() {
        return this.correctionFlag;
    }

    public final long getPublicationDate() {
        return this.publicationDate;
    }

    public final String getType() {
        return this.f54type;
    }

    public int hashCode() {
        return (((((((this.assetId.hashCode() * 31) + this.f54type.hashCode()) * 31) + Long.hashCode(this.publicationDate)) * 31) + Boolean.hashCode(this.correctionFlag)) * 31) + this.body.hashCode();
    }

    public String toString() {
        return "Addendum(assetId=" + this.assetId + ", type=" + this.f54type + ", publicationDate=" + this.publicationDate + ", correctionFlag=" + this.correctionFlag + ", body=" + this.body + ")";
    }
}
