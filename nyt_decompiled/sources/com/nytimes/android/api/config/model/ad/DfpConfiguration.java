package com.nytimes.android.api.config.model.ad;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class DfpConfiguration {
    private final DfpArticleConfiguration article;

    public DfpConfiguration(DfpArticleConfiguration dfpArticleConfiguration) {
        this.article = dfpArticleConfiguration;
    }

    public static /* synthetic */ DfpConfiguration copy$default(DfpConfiguration dfpConfiguration, DfpArticleConfiguration dfpArticleConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            dfpArticleConfiguration = dfpConfiguration.article;
        }
        return dfpConfiguration.copy(dfpArticleConfiguration);
    }

    public final DfpArticleConfiguration component1() {
        return this.article;
    }

    public final DfpConfiguration copy(DfpArticleConfiguration dfpArticleConfiguration) {
        return new DfpConfiguration(dfpArticleConfiguration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DfpConfiguration) && zq3.c(this.article, ((DfpConfiguration) obj).article);
    }

    public final DfpArticleConfiguration getArticle() {
        return this.article;
    }

    public int hashCode() {
        DfpArticleConfiguration dfpArticleConfiguration = this.article;
        if (dfpArticleConfiguration == null) {
            return 0;
        }
        return dfpArticleConfiguration.hashCode();
    }

    public String toString() {
        return "DfpConfiguration(article=" + this.article + ")";
    }
}
