package com.nytimes.android.subauth.core.purchase.network.response;

import defpackage.bt3;
import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LinkResponseData {
    private String a;

    @bt3(name = "subscription_id")
    public static /* synthetic */ void getSubscriptionId$annotations() {
    }

    public final String a() {
        return this.a;
    }

    public final void b(String str) {
        this.a = str;
    }
}
