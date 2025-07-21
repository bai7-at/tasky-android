package com.nytimes.android.hybrid.model;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class HybridImage {
    private final List<HybridImageCrop> crops;

    public HybridImage(List<HybridImageCrop> list) {
        zq3.h(list, "crops");
        this.crops = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HybridImage copy$default(HybridImage hybridImage, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hybridImage.crops;
        }
        return hybridImage.copy(list);
    }

    public final List<HybridImageCrop> component1() {
        return this.crops;
    }

    public final HybridImage copy(List<HybridImageCrop> list) {
        zq3.h(list, "crops");
        return new HybridImage(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HybridImage) && zq3.c(this.crops, ((HybridImage) obj).crops);
    }

    public final HybridImageCrop getCropBasedOnViewPort(int i) {
        HybridImageCrop hybridImageCrop = null;
        for (HybridImageCrop hybridImageCrop2 : this.crops) {
            if (hybridImageCrop2.getMinViewportWidth() > i) {
                break;
            }
            hybridImageCrop = hybridImageCrop2;
        }
        return hybridImageCrop;
    }

    public final List<HybridImageCrop> getCrops() {
        return this.crops;
    }

    public int hashCode() {
        return this.crops.hashCode();
    }

    public String toString() {
        return "HybridImage(crops=" + this.crops + ")";
    }
}
