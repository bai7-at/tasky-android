package com.nytimes.android.features.home.data;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class NyTimesApolloHttpException extends Exception {
    private final int code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NyTimesApolloHttpException(int i, String str) {
        super(str);
        zq3.h(str, "message");
        this.code = i;
    }

    public final int a() {
        return this.code;
    }
}
