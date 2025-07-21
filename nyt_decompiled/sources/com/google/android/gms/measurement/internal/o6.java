package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class o6 implements w9 {
    final /* synthetic */ z6 a;

    o6(z6 z6Var) {
        this.a = z6Var;
    }

    @Override // com.google.android.gms.measurement.internal.w9
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.r(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle);
        } else {
            this.a.t(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle, str);
        }
    }
}
