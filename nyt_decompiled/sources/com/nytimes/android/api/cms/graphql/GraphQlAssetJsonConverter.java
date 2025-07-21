package com.nytimes.android.api.cms.graphql;

import com.nytimes.android.api.cms.Asset;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.squareup.moshi.i;
import defpackage.zq3;

/* loaded from: classes3.dex */
public final class GraphQlAssetJsonConverter {
    private final i moshi = new i.b().a(PolymorphicJsonAdapterFactory.a(Asset.class, "_json_type_").b(GraphQlPromoAsset.class, "GraphQlPromoAsset").b(GraphQlImageAsset.class, "GraphQlImageAsset").b(GraphQlVideoAsset.class, "GraphQlVideoAsset").b(GraphQlInteractiveAsset.class, "GraphQlInteractiveAsset").b(GraphQlLegacyCollectionAsset.class, "GraphQlLegacyCollectionAsset").b(GraphQlSlideshowAsset.class, "GraphQlSlideshowAsset").b(GraphQlArticleAsset.class, "GraphQlArticleAsset").b(GraphQlAudioAsset.class, "GraphQlAudioAsset")).d();

    public final Asset fromJson(String str) {
        zq3.h(str, "json");
        return (Asset) this.moshi.c(Asset.class).fromJson(str);
    }

    public final String toJson(Asset asset) {
        return this.moshi.c(Asset.class).toJson(asset);
    }
}
