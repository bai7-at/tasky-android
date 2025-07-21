package com.nytimes.android.api.config.model.ad;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class DfpArticleConfiguration {

    @SerializedName("NYTDefaultsKeyMaxAdsPerArticle")
    private final int maxAdsPerArticle;

    public DfpArticleConfiguration() {
        this(0, 1, null);
    }

    public static /* synthetic */ DfpArticleConfiguration copy$default(DfpArticleConfiguration dfpArticleConfiguration, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dfpArticleConfiguration.maxAdsPerArticle;
        }
        return dfpArticleConfiguration.copy(i);
    }

    public final int component1() {
        return this.maxAdsPerArticle;
    }

    public final DfpArticleConfiguration copy(int i) {
        return new DfpArticleConfiguration(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DfpArticleConfiguration) && this.maxAdsPerArticle == ((DfpArticleConfiguration) obj).maxAdsPerArticle;
    }

    public final int getMaxAdsPerArticle() {
        return this.maxAdsPerArticle;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxAdsPerArticle);
    }

    public String toString() {
        return "DfpArticleConfiguration(maxAdsPerArticle=" + this.maxAdsPerArticle + ")";
    }

    public DfpArticleConfiguration(int i) {
        this.maxAdsPerArticle = i;
    }

    public /* synthetic */ DfpArticleConfiguration(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
