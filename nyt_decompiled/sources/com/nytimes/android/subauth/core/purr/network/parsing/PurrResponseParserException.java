package com.nytimes.android.subauth.core.purr.network.parsing;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class PurrResponseParserException extends Throwable {
    private final String message;

    public PurrResponseParserException(String str) {
        zq3.h(str, "message");
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
