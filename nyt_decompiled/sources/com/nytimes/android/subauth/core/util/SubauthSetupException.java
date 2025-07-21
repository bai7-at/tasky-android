package com.nytimes.android.subauth.core.util;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SubauthSetupException extends SubauthException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubauthSetupException(String str) {
        super(str);
        zq3.h(str, "errorMessage");
    }
}
