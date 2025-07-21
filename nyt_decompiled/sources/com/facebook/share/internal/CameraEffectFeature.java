package com.facebook.share.internal;

import defpackage.zp1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public enum CameraEffectFeature implements zp1 {
    SHARE_CAMERA_EFFECT(20170417);

    private final int minVersion;

    CameraEffectFeature(int i) {
        this.minVersion = i;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static CameraEffectFeature[] valuesCustom() {
        CameraEffectFeature[] valuesCustom = values();
        return (CameraEffectFeature[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // defpackage.zp1
    public String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    @Override // defpackage.zp1
    public int getMinVersion() {
        return this.minVersion;
    }
}
