package defpackage;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.api.cms.AssetKt;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher;
import com.nytimes.android.section.sectionfront.SectionFrontPersister;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter;
import com.squareup.moshi.i;
import java.util.Date;

/* loaded from: classes4.dex */
public final class ag7 {
    public static final ag7 a = new ag7();

    private ag7() {
    }

    public final GraphQlSectionFrontFetcher a(ApolloClient apolloClient, ml0 ml0Var, AssetRetriever assetRetriever, e23 e23Var, b05 b05Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(ml0Var, "adParams");
        zq3.h(assetRetriever, "assetRetriever");
        zq3.h(e23Var, "assetParser");
        zq3.h(b05Var, "nytClock");
        return new GraphQlSectionFrontFetcher(apolloClient, ml0Var, assetRetriever, e23Var, b05Var, 0, 32, null);
    }

    public final i b(boolean z) {
        if (z) {
            try {
                Class.forName("com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory");
                throw new IllegalStateException("moshi-kotlin shouldn't be used in the app because it uses reflection and includes kotlin-reflect. Please use moshi instead.");
            } catch (ClassNotFoundException unused) {
                NYTLogger.d("moshi-kotlin is not included (good!)", new Object[0]);
            }
        }
        i.b c = new i.b().c(Date.class, new Rfc3339DateJsonAdapter());
        zq3.g(c, "add(...)");
        i d = AssetKt.configureAssetAdapter(c).d();
        zq3.g(d, "build(...)");
        return d;
    }

    public final JsonAdapter c(i iVar) {
        zq3.h(iVar, "moshi");
        JsonAdapter c = iVar.c(SectionFront.class);
        zq3.g(c, "adapter(...)");
        return c;
    }

    public final eh7 d(GraphQlSectionFrontFetcher graphQlSectionFrontFetcher, SectionFrontPersister sectionFrontPersister) {
        zq3.h(graphQlSectionFrontFetcher, "graphQLFetcher");
        zq3.h(sectionFrontPersister, "persister");
        return new g23(graphQlSectionFrontFetcher, sectionFrontPersister);
    }
}
