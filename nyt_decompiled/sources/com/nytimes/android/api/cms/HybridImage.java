package com.nytimes.android.api.cms;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class HybridImage {
    private final List<HybridCrop> crops;

    /* JADX WARN: Multi-variable type inference failed */
    public HybridImage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HybridImage copy$default(HybridImage hybridImage, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hybridImage.crops;
        }
        return hybridImage.copy(list);
    }

    public final List<HybridCrop> component1() {
        return this.crops;
    }

    public final HybridImage copy(List<HybridCrop> list) {
        return new HybridImage(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HybridImage) && zq3.c(this.crops, ((HybridImage) obj).crops);
    }

    public final List<HybridCrop> getCrops() {
        return this.crops;
    }

    public int hashCode() {
        List<HybridCrop> list = this.crops;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "HybridImage(crops=" + this.crops + ")";
    }

    public HybridImage(List<HybridCrop> list) {
        this.crops = list;
    }

    public /* synthetic */ HybridImage(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
