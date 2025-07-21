package com.nytimes.android.dailyfive.ui.feed;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class DailyFiveParsingException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyFiveParsingException(String str) {
        super(str);
        zq3.h(str, "message");
    }
}
