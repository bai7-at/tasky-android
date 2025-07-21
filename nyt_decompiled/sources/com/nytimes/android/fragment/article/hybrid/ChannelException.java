package com.nytimes.android.fragment.article.hybrid;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class ChannelException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelException(String str) {
        super(str);
        zq3.h(str, "message");
    }
}
