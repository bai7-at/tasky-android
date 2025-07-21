package com.nytimes.android.subauth.core.devsettings;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class MockSubauthGraphQLFactoryException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MockSubauthGraphQLFactoryException(String str) {
        super(str);
        zq3.h(str, "errorMessage");
    }
}
