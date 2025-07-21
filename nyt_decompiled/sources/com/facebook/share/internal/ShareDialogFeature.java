package com.facebook.share.internal;

import defpackage.zp1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public enum ShareDialogFeature implements zp1 {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);

    private final int minVersion;

    ShareDialogFeature(int i) {
        this.minVersion = i;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ShareDialogFeature[] valuesCustom() {
        ShareDialogFeature[] valuesCustom = values();
        return (ShareDialogFeature[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // defpackage.zp1
    public String getAction() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    @Override // defpackage.zp1
    public int getMinVersion() {
        return this.minVersion;
    }
}
