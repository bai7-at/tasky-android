package com.airbnb.android.showkase.exceptions;

import defpackage.zq3;

/* loaded from: classes.dex */
public final class ShowkaseException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowkaseException(String str) {
        super(str);
        zq3.h(str, "message");
    }
}
