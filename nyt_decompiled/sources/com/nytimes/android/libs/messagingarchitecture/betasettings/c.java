package com.nytimes.android.libs.messagingarchitecture.betasettings;

import android.content.Context;
import defpackage.zm8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class c {
    public static final void a(Context context, b bVar) {
        zq3.h(context, "<this>");
        zq3.h(bVar, "screen");
        context.startActivity(MessagingBetaSettingsActivity.Companion.a(context, bVar));
    }

    public static final void b(Context context, String str) {
        zq3.h(context, "<this>");
        zq3.h(str, "message");
        zm8.g(context, str);
    }
}
