package defpackage;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.section.SectionModule;
import com.nytimes.android.section.asset.GraphQlAssetFetcher;

/* loaded from: classes4.dex */
public abstract class ph7 implements ba2 {
    public static GraphQlAssetFetcher a(ApolloClient apolloClient, ml0 ml0Var, e23 e23Var, ls lsVar, h07 h07Var) {
        return (GraphQlAssetFetcher) g16.e(SectionModule.a.a(apolloClient, ml0Var, e23Var, lsVar, h07Var));
    }
}
