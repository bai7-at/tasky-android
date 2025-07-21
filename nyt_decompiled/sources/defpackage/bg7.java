package defpackage;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher;

/* loaded from: classes4.dex */
public abstract class bg7 implements ba2 {
    public static GraphQlSectionFrontFetcher a(ApolloClient apolloClient, ml0 ml0Var, AssetRetriever assetRetriever, e23 e23Var, b05 b05Var) {
        return (GraphQlSectionFrontFetcher) g16.e(ag7.a.a(apolloClient, ml0Var, assetRetriever, e23Var, b05Var));
    }
}
