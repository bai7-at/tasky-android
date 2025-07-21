package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
final class o9 implements w9 {
    final /* synthetic */ r9 a;

    o9(r9 r9Var) {
        this.a = r9Var;
    }

    @Override // com.google.android.gms.measurement.internal.w9
    public final void a(String str, String str2, Bundle bundle) {
        a5 a5Var;
        a5 a5Var2;
        if (!TextUtils.isEmpty(str)) {
            this.a.e().y(new n9(this, str, "_err", bundle));
            return;
        }
        r9 r9Var = this.a;
        a5Var = r9Var.l;
        if (a5Var != null) {
            a5Var2 = r9Var.l;
            a5Var2.o().n().b("AppId not known when logging event", "_err");
        }
    }
}
