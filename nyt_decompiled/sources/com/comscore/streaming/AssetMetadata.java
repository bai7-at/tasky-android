package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;

/* loaded from: classes2.dex */
public abstract class AssetMetadata extends CppJavaBinder {
    private long b;

    AssetMetadata(long j) {
        this.b = j;
    }

    long a() {
        return this.b;
    }
}
