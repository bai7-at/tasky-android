package com.nytimes.android.internal.auth.graphql;

import android.content.res.Resources;
import defpackage.b22;
import defpackage.dl6;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GraphQlEnvironment {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ GraphQlEnvironment[] $VALUES;
    public static final a Companion;
    private final int label;
    private final Integer urlPreviewBranchResource;
    private final int urlResource;
    public static final GraphQlEnvironment PRODUCTION = new GraphQlEnvironment("PRODUCTION", 0, dl6.graphql_prod_name, dl6.graphql_prod, Integer.valueOf(dl6.graphql_prod_preview_branch));
    public static final GraphQlEnvironment PRE_RELEASE = new GraphQlEnvironment("PRE_RELEASE", 1, dl6.graphql_pre_release_name, dl6.graphql_pre_release, null);
    public static final GraphQlEnvironment DEVELOP = new GraphQlEnvironment("DEVELOP", 2, dl6.graphql_develop_name, dl6.graphql_develop, null);
    public static final GraphQlEnvironment STAGING_DATA = new GraphQlEnvironment("STAGING_DATA", 3, dl6.graphql_staging_data_name, dl6.graphql_staging_data, Integer.valueOf(dl6.graphql_staging_data_preview_branch));
    public static final GraphQlEnvironment STAGING_PREVIEW_DATA = new GraphQlEnvironment("STAGING_PREVIEW_DATA", 4, dl6.graphql_staging_preview_data_name, dl6.graphql_staging_preview_data, null);
    public static final GraphQlEnvironment DEVELOP_DATA = new GraphQlEnvironment("DEVELOP_DATA", 5, dl6.graphql_develop_data_name, dl6.graphql_develop_data, Integer.valueOf(dl6.graphql_develop_data_preview_branch));
    public static final GraphQlEnvironment DEVELOP_PREVIEW_DATA = new GraphQlEnvironment("DEVELOP_PREVIEW_DATA", 6, dl6.graphql_develop_preview_data_name, dl6.graphql_develop_preview_data, null);
    public static final GraphQlEnvironment EXPERIMENT_1 = new GraphQlEnvironment("EXPERIMENT_1", 7, dl6.graphql_experimental_1_name, dl6.graphql_experimental_1, null);
    public static final GraphQlEnvironment EXPERIMENT_2 = new GraphQlEnvironment("EXPERIMENT_2", 8, dl6.graphql_experimental_2_name, dl6.graphql_experimental_2, null);
    public static final GraphQlEnvironment EXPERIMENT_3 = new GraphQlEnvironment("EXPERIMENT_3", 9, dl6.graphql_experimental_3_name, dl6.graphql_experimental_3, null);
    public static final GraphQlEnvironment EXPERIMENT_4 = new GraphQlEnvironment("EXPERIMENT_4", 10, dl6.graphql_experimental_4_name, dl6.graphql_experimental_4, null);
    public static final GraphQlEnvironment EXPERIMENT_5 = new GraphQlEnvironment("EXPERIMENT_5", 11, dl6.graphql_experimental_5_name, dl6.graphql_experimental_5, null);
    public static final GraphQlEnvironment LOCALHOST = new GraphQlEnvironment("LOCALHOST", 12, dl6.graphql_localhost_name, dl6.graphql_localhost, null);
    public static final GraphQlEnvironment LOCAL_HYBRID_PROXY = new GraphQlEnvironment("LOCAL_HYBRID_PROXY", 13, dl6.graphql_hybrid_proxy_name, dl6.graphql_hybrid_proxy, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GraphQlEnvironment a(String str, Resources resources) {
            GraphQlEnvironment graphQlEnvironment;
            zq3.h(str, "label");
            zq3.h(resources, "resources");
            GraphQlEnvironment[] values = GraphQlEnvironment.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    graphQlEnvironment = null;
                    break;
                }
                graphQlEnvironment = values[i];
                if (h.w(resources.getString(graphQlEnvironment.getLabel()), str, true)) {
                    break;
                }
                i++;
            }
            return graphQlEnvironment == null ? GraphQlEnvironment.PRODUCTION : graphQlEnvironment;
        }

        private a() {
        }
    }

    private static final /* synthetic */ GraphQlEnvironment[] $values() {
        return new GraphQlEnvironment[]{PRODUCTION, PRE_RELEASE, DEVELOP, STAGING_DATA, STAGING_PREVIEW_DATA, DEVELOP_DATA, DEVELOP_PREVIEW_DATA, EXPERIMENT_1, EXPERIMENT_2, EXPERIMENT_3, EXPERIMENT_4, EXPERIMENT_5, LOCALHOST, LOCAL_HYBRID_PROXY};
    }

    static {
        GraphQlEnvironment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private GraphQlEnvironment(String str, int i, int i2, int i3, Integer num) {
        this.label = i2;
        this.urlResource = i3;
        this.urlPreviewBranchResource = num;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ int getUrl$default(GraphQlEnvironment graphQlEnvironment, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUrl");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return graphQlEnvironment.getUrl(str);
    }

    public static GraphQlEnvironment valueOf(String str) {
        return (GraphQlEnvironment) Enum.valueOf(GraphQlEnvironment.class, str);
    }

    public static GraphQlEnvironment[] values() {
        return (GraphQlEnvironment[]) $VALUES.clone();
    }

    public final int getLabel() {
        return this.label;
    }

    public final int getUrl(String str) {
        Integer num;
        return (str == null || str.length() == 0 || (num = this.urlPreviewBranchResource) == null) ? this.urlResource : num.intValue();
    }

    public final Integer getUrlPreviewBranchResource() {
        return this.urlPreviewBranchResource;
    }

    public final int getUrlResource() {
        return this.urlResource;
    }
}
