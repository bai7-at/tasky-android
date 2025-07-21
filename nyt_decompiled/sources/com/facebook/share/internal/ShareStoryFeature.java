package com.facebook.share.internal;

import defpackage.zp1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public enum ShareStoryFeature implements zp1 {
    SHARE_STORY_ASSET(20170417);

    private final int minVersion;

    ShareStoryFeature(int i) {
        this.minVersion = i;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ShareStoryFeature[] valuesCustom() {
        ShareStoryFeature[] valuesCustom = values();
        return (ShareStoryFeature[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // defpackage.zp1
    public String getAction() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    @Override // defpackage.zp1
    public int getMinVersion() {
        return this.minVersion;
    }
}
