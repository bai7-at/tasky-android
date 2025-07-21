package com.nytimes.android.subauth.core.devsettings.purr;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class MockPurrGraphQLFactoryException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MockPurrGraphQLFactoryException(String str) {
        super(str);
        zq3.h(str, "errorMessage");
    }
}
