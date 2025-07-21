package com.nytimes.android.resourcedownloader.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class BlockResourceSource extends ResourceSource {
    private final String dataId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockResourceSource(String str) {
        super(null);
        zq3.h(str, "dataId");
        this.dataId = str;
    }

    public static /* synthetic */ BlockResourceSource copy$default(BlockResourceSource blockResourceSource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blockResourceSource.dataId;
        }
        return blockResourceSource.copy(str);
    }

    public final String component1() {
        return this.dataId;
    }

    public final BlockResourceSource copy(String str) {
        zq3.h(str, "dataId");
        return new BlockResourceSource(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockResourceSource) && zq3.c(this.dataId, ((BlockResourceSource) obj).dataId);
    }

    public final String getDataId() {
        return this.dataId;
    }

    public int hashCode() {
        return this.dataId.hashCode();
    }

    public String toString() {
        return "BlockResourceSource(dataId=" + this.dataId + ")";
    }
}
