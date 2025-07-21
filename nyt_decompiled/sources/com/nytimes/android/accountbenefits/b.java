package com.nytimes.android.accountbenefits;

import android.content.Context;
import defpackage.ry3;
import defpackage.zq3;

/* loaded from: classes2.dex */
public final class b implements ry3 {
    @Override // defpackage.ry3
    public void a(Context context) {
        zq3.h(context, "context");
        context.startActivity(AccountBenefitsActivity.Companion.a(context));
    }
}
