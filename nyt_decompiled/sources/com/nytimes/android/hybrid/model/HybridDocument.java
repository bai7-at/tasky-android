package com.nytimes.android.hybrid.model;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class HybridDocument {
    private final List<HybridImage> images;
    private final HybridMain main;
    private final List<HybridSubResource> subResources;

    public HybridDocument(HybridMain hybridMain, List<HybridSubResource> list, List<HybridImage> list2) {
        zq3.h(hybridMain, "main");
        zq3.h(list, "subResources");
        zq3.h(list2, "images");
        this.main = hybridMain;
        this.subResources = list;
        this.images = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HybridDocument copy$default(HybridDocument hybridDocument, HybridMain hybridMain, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            hybridMain = hybridDocument.main;
        }
        if ((i & 2) != 0) {
            list = hybridDocument.subResources;
        }
        if ((i & 4) != 0) {
            list2 = hybridDocument.images;
        }
        return hybridDocument.copy(hybridMain, list, list2);
    }

    public final HybridMain component1() {
        return this.main;
    }

    public final List<HybridSubResource> component2() {
        return this.subResources;
    }

    public final List<HybridImage> component3() {
        return this.images;
    }

    public final HybridDocument copy(HybridMain hybridMain, List<HybridSubResource> list, List<HybridImage> list2) {
        zq3.h(hybridMain, "main");
        zq3.h(list, "subResources");
        zq3.h(list2, "images");
        return new HybridDocument(hybridMain, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridDocument)) {
            return false;
        }
        HybridDocument hybridDocument = (HybridDocument) obj;
        return zq3.c(this.main, hybridDocument.main) && zq3.c(this.subResources, hybridDocument.subResources) && zq3.c(this.images, hybridDocument.images);
    }

    public final List<HybridImage> getImages() {
        return this.images;
    }

    public final HybridMain getMain() {
        return this.main;
    }

    public final List<HybridSubResource> getSubResources() {
        return this.subResources;
    }

    public int hashCode() {
        return (((this.main.hashCode() * 31) + this.subResources.hashCode()) * 31) + this.images.hashCode();
    }

    public String toString() {
        return "HybridDocument(main=" + this.main + ", subResources=" + this.subResources + ", images=" + this.images + ")";
    }
}
