package com.nytimes.android.resourcedownloader.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class AssetResourceSource extends ResourceSource {
    private final String assetUri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetResourceSource(String str) {
        super(null);
        zq3.h(str, "assetUri");
        this.assetUri = str;
    }

    public static /* synthetic */ AssetResourceSource copy$default(AssetResourceSource assetResourceSource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetResourceSource.assetUri;
        }
        return assetResourceSource.copy(str);
    }

    public final String component1() {
        return this.assetUri;
    }

    public final AssetResourceSource copy(String str) {
        zq3.h(str, "assetUri");
        return new AssetResourceSource(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AssetResourceSource) && zq3.c(this.assetUri, ((AssetResourceSource) obj).assetUri);
    }

    public final String getAssetUri() {
        return this.assetUri;
    }

    public int hashCode() {
        return this.assetUri.hashCode();
    }

    public String toString() {
        return "AssetResourceSource(assetUri=" + this.assetUri + ")";
    }
}
