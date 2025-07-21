package com.dropbox.android.external.store4;

/* loaded from: classes2.dex */
public enum CacheType {
    MEMORY(1),
    DISK(2);

    private final int flag;

    CacheType(int i) {
        this.flag = i;
    }

    public final int getFlag$store() {
        return this.flag;
    }
}
