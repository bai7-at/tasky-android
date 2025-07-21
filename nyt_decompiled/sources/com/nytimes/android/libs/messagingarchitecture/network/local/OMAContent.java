package com.nytimes.android.libs.messagingarchitecture.network.local;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;
import java.util.List;

@Keep
/* loaded from: classes4.dex */
public final class OMAContent {
    public static final int $stable = 8;

    @SerializedName("MobileNewsArticle")
    private final List<Object> mobileNewsArticle;

    @SerializedName("MobileNewsHome")
    private final List<Object> mobileNewsHome;

    public OMAContent(List<Object> list, List<Object> list2) {
        this.mobileNewsHome = list;
        this.mobileNewsArticle = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OMAContent copy$default(OMAContent oMAContent, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oMAContent.mobileNewsHome;
        }
        if ((i & 2) != 0) {
            list2 = oMAContent.mobileNewsArticle;
        }
        return oMAContent.copy(list, list2);
    }

    public final List<Object> component1() {
        return this.mobileNewsHome;
    }

    public final List<Object> component2() {
        return this.mobileNewsArticle;
    }

    public final OMAContent copy(List<Object> list, List<Object> list2) {
        return new OMAContent(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OMAContent)) {
            return false;
        }
        OMAContent oMAContent = (OMAContent) obj;
        return zq3.c(this.mobileNewsHome, oMAContent.mobileNewsHome) && zq3.c(this.mobileNewsArticle, oMAContent.mobileNewsArticle);
    }

    public final List<Object> getMobileNewsArticle() {
        return this.mobileNewsArticle;
    }

    public final List<Object> getMobileNewsHome() {
        return this.mobileNewsHome;
    }

    public int hashCode() {
        List<Object> list = this.mobileNewsHome;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Object> list2 = this.mobileNewsArticle;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "OMAContent(mobileNewsHome=" + this.mobileNewsHome + ", mobileNewsArticle=" + this.mobileNewsArticle + ")";
    }
}
