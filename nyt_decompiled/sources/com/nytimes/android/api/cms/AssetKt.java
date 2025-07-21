package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.graphql.GraphQlArticleAsset;
import com.nytimes.android.api.cms.graphql.GraphQlAudioAsset;
import com.nytimes.android.api.cms.graphql.GraphQlImageAsset;
import com.nytimes.android.api.cms.graphql.GraphQlInteractiveAsset;
import com.nytimes.android.api.cms.graphql.GraphQlLegacyCollectionAsset;
import com.nytimes.android.api.cms.graphql.GraphQlPromoAsset;
import com.nytimes.android.api.cms.graphql.GraphQlSlideshowAsset;
import com.nytimes.android.api.cms.graphql.GraphQlVideoAsset;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.squareup.moshi.i;
import defpackage.zq3;

/* loaded from: classes3.dex */
public final class AssetKt {
    public static final i.b configureAssetAdapter(i.b bVar) {
        zq3.h(bVar, "<this>");
        PolymorphicJsonAdapterFactory a = PolymorphicJsonAdapterFactory.a(Asset.class, "_json_type_");
        zq3.g(a, "of(...)");
        PolymorphicJsonAdapterFactory b = a.b(GraphQlPromoAsset.class, "GraphQlPromoAsset");
        zq3.g(b, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b2 = b.b(GraphQlImageAsset.class, "GraphQlImageAsset");
        zq3.g(b2, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b3 = b2.b(GraphQlVideoAsset.class, "GraphQlVideoAsset");
        zq3.g(b3, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b4 = b3.b(GraphQlInteractiveAsset.class, "GraphQlInteractiveAsset");
        zq3.g(b4, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b5 = b4.b(GraphQlLegacyCollectionAsset.class, "GraphQlLegacyCollectionAsset");
        zq3.g(b5, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b6 = b5.b(GraphQlSlideshowAsset.class, "GraphQlSlideshowAsset");
        zq3.g(b6, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b7 = b6.b(GraphQlArticleAsset.class, "GraphQlArticleAsset");
        zq3.g(b7, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b8 = b7.b(GraphQlAudioAsset.class, "GraphQlAudioAsset");
        zq3.g(b8, "withSubtype(...)");
        bVar.a(b8);
        return bVar;
    }
}
