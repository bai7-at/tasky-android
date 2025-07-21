package com.nytimes.android.section;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.network.urlexpander.UrlExpander;
import com.nytimes.android.section.asset.GraphQlAssetFetcher;
import defpackage.e23;
import defpackage.h07;
import defpackage.hb6;
import defpackage.ls;
import defpackage.ml0;
import defpackage.ss2;
import defpackage.vi;
import defpackage.zi;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public final class SectionModule {
    public static final SectionModule a = new SectionModule();

    private SectionModule() {
    }

    public final GraphQlAssetFetcher a(ApolloClient apolloClient, final ml0 ml0Var, e23 e23Var, ls lsVar, h07 h07Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(ml0Var, "adParams");
        zq3.h(e23Var, "parser");
        zq3.h(lsVar, "assetIdentityTransformer");
        zq3.h(h07Var, "resourceRetriever");
        return new GraphQlAssetFetcher(apolloClient, new ss2() { // from class: com.nytimes.android.section.SectionModule$provideAssetFetcher$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final hb6 invoke(String str) {
                zq3.h(str, "uri");
                return new vi(str, ml0.this.c(), ml0.this.a(), ml0.this.b(), ml0.this.d());
            }
        }, new ss2() { // from class: com.nytimes.android.section.SectionModule$provideAssetFetcher$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final hb6 invoke(List list) {
                zq3.h(list, "uris");
                return new zi(list, ml0.this.c(), ml0.this.a(), ml0.this.b(), ml0.this.d());
            }
        }, e23Var, lsVar, h07Var);
    }

    public final ls b(UrlExpander urlExpander) {
        zq3.h(urlExpander, "urlExpander");
        return new ls(urlExpander);
    }
}
