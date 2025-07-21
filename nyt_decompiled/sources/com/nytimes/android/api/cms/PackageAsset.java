package com.nytimes.android.api.cms;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class PackageAsset {
    private final List<Long> assetIds;
    private final Boolean hasBanner;

    /* JADX WARN: Multi-variable type inference failed */
    public PackageAsset() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PackageAsset copy$default(PackageAsset packageAsset, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = packageAsset.assetIds;
        }
        if ((i & 2) != 0) {
            bool = packageAsset.hasBanner;
        }
        return packageAsset.copy(list, bool);
    }

    public final List<Long> component1() {
        return this.assetIds;
    }

    public final Boolean component2() {
        return this.hasBanner;
    }

    public final PackageAsset copy(List<Long> list, Boolean bool) {
        return new PackageAsset(list, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageAsset)) {
            return false;
        }
        PackageAsset packageAsset = (PackageAsset) obj;
        return zq3.c(this.assetIds, packageAsset.assetIds) && zq3.c(this.hasBanner, packageAsset.hasBanner);
    }

    public final List<Long> getAssetIds() {
        return this.assetIds;
    }

    public final Boolean getHasBanner() {
        return this.hasBanner;
    }

    public final boolean hasBanner() {
        Boolean bool = this.hasBanner;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public int hashCode() {
        List<Long> list = this.assetIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasBanner;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "PackageAsset(assetIds=" + this.assetIds + ", hasBanner=" + this.hasBanner + ")";
    }

    public PackageAsset(List<Long> list, Boolean bool) {
        this.assetIds = list;
        this.hasBanner = bool;
    }

    public /* synthetic */ PackageAsset(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool);
    }
}
