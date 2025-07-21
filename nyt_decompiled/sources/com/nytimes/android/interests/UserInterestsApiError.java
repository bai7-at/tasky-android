package com.nytimes.android.interests;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class UserInterestsApiError extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInterestsApiError(String str) {
        super(str);
        zq3.h(str, "message");
    }
}
