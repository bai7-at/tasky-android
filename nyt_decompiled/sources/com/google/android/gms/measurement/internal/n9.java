package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class n9 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b = "_err";
    final /* synthetic */ Bundle c;
    final /* synthetic */ o9 d;

    n9(o9 o9Var, String str, String str2, Bundle bundle) {
        this.d = o9Var;
        this.a = str;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.f((zzaw) Preconditions.checkNotNull(this.d.a.f0().v0(this.a, this.b, this.c, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, this.d.a.p().currentTimeMillis(), false, true)), this.a);
    }
}
