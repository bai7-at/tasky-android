package defpackage;

import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;

/* loaded from: classes4.dex */
public final class mn1 {
    private final boolean a;
    private final boolean b;

    public mn1(boolean z, GraphQlEnvironment graphQlEnvironment) {
        zq3.h(graphQlEnvironment, "graphQlEnvironment");
        this.a = z;
        this.b = z && (graphQlEnvironment == GraphQlEnvironment.STAGING_DATA || graphQlEnvironment == GraphQlEnvironment.STAGING_PREVIEW_DATA);
    }

    public final boolean a() {
        return this.b;
    }
}
