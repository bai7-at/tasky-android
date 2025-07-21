package com.nytimes.android.subauth.core.util;

import defpackage.zq3;

/* loaded from: classes4.dex */
public class SubauthException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubauthException(String str) {
        super(str);
        zq3.h(str, "errorMessage");
    }
}
