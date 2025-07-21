package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.cy0;
import defpackage.og8;

/* loaded from: classes2.dex */
final class o0 implements cy0 {
    o0() {
    }

    @Override // defpackage.cy0
    public final /* bridge */ /* synthetic */ Object then(og8 og8Var) {
        if (((Boolean) og8Var.m()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
