package com.nytimes.android.analytics.api.exception;

import defpackage.zq3;

/* loaded from: classes2.dex */
public final class EventRoutingException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventRoutingException(String str) {
        super(str);
        zq3.h(str, "msg");
    }
}
