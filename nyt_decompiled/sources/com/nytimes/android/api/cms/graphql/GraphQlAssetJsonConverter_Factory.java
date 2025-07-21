package com.nytimes.android.api.cms.graphql;

import defpackage.ba2;

/* loaded from: classes3.dex */
public final class GraphQlAssetJsonConverter_Factory implements ba2 {

    private static final class InstanceHolder {
        private static final GraphQlAssetJsonConverter_Factory INSTANCE = new GraphQlAssetJsonConverter_Factory();

        private InstanceHolder() {
        }
    }

    public static GraphQlAssetJsonConverter_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GraphQlAssetJsonConverter newInstance() {
        return new GraphQlAssetJsonConverter();
    }

    @Override // defpackage.p76
    public GraphQlAssetJsonConverter get() {
        return newInstance();
    }
}
