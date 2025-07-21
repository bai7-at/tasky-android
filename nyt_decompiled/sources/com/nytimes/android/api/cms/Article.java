package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Article {

    @SerializedName("main")
    private final HybridContent hybridContent;

    @SerializedName("images")
    private final List<HybridImage> hybridImages;

    @SerializedName("subresources")
    private final List<HybridResource> hybridResources;

    public Article() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Article copy$default(Article article, HybridContent hybridContent, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            hybridContent = article.hybridContent;
        }
        if ((i & 2) != 0) {
            list = article.hybridResources;
        }
        if ((i & 4) != 0) {
            list2 = article.hybridImages;
        }
        return article.copy(hybridContent, list, list2);
    }

    public final HybridContent component1() {
        return this.hybridContent;
    }

    public final List<HybridResource> component2() {
        return this.hybridResources;
    }

    public final List<HybridImage> component3() {
        return this.hybridImages;
    }

    public final Article copy(HybridContent hybridContent, List<HybridResource> list, List<HybridImage> list2) {
        return new Article(hybridContent, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Article)) {
            return false;
        }
        Article article = (Article) obj;
        return zq3.c(this.hybridContent, article.hybridContent) && zq3.c(this.hybridResources, article.hybridResources) && zq3.c(this.hybridImages, article.hybridImages);
    }

    public final HybridContent getHybridContent() {
        return this.hybridContent;
    }

    public final List<HybridImage> getHybridImages() {
        return this.hybridImages;
    }

    public final List<HybridResource> getHybridResources() {
        return this.hybridResources;
    }

    public int hashCode() {
        HybridContent hybridContent = this.hybridContent;
        int hashCode = (hybridContent == null ? 0 : hybridContent.hashCode()) * 31;
        List<HybridResource> list = this.hybridResources;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<HybridImage> list2 = this.hybridImages;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "Article(hybridContent=" + this.hybridContent + ", hybridResources=" + this.hybridResources + ", hybridImages=" + this.hybridImages + ")";
    }

    public Article(HybridContent hybridContent, List<HybridResource> list, List<HybridImage> list2) {
        this.hybridContent = hybridContent;
        this.hybridResources = list;
        this.hybridImages = list2;
    }

    public /* synthetic */ Article(HybridContent hybridContent, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridContent, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
