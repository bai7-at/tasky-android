package com.nytimes.android.resourcedownloader.model;

import com.nytimes.android.hybrid.model.HybridImage;
import com.nytimes.android.hybrid.model.HybridSubResource;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public final class HybridProperties {
    private final List<HybridImage> hybridImages;
    private final List<HybridSubResource> hybridResources;

    public HybridProperties(List<HybridSubResource> list, List<HybridImage> list2) {
        zq3.h(list, "hybridResources");
        zq3.h(list2, "hybridImages");
        this.hybridResources = list;
        this.hybridImages = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HybridProperties copy$default(HybridProperties hybridProperties, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hybridProperties.hybridResources;
        }
        if ((i & 2) != 0) {
            list2 = hybridProperties.hybridImages;
        }
        return hybridProperties.copy(list, list2);
    }

    public final List<HybridSubResource> component1() {
        return this.hybridResources;
    }

    public final List<HybridImage> component2() {
        return this.hybridImages;
    }

    public final HybridProperties copy(List<HybridSubResource> list, List<HybridImage> list2) {
        zq3.h(list, "hybridResources");
        zq3.h(list2, "hybridImages");
        return new HybridProperties(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridProperties)) {
            return false;
        }
        HybridProperties hybridProperties = (HybridProperties) obj;
        return zq3.c(this.hybridResources, hybridProperties.hybridResources) && zq3.c(this.hybridImages, hybridProperties.hybridImages);
    }

    public final List<HybridImage> getHybridImages() {
        return this.hybridImages;
    }

    public final List<HybridSubResource> getHybridResources() {
        return this.hybridResources;
    }

    public int hashCode() {
        return (this.hybridResources.hashCode() * 31) + this.hybridImages.hashCode();
    }

    public String toString() {
        return "HybridProperties(hybridResources=" + this.hybridResources + ", hybridImages=" + this.hybridImages + ")";
    }
}
