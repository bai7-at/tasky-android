package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.hd4;

/* loaded from: classes3.dex */
final class r4 extends hd4 {
    final /* synthetic */ u4 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r4(u4 u4Var, int i) {
        super(20);
        this.j = u4Var;
    }

    @Override // defpackage.hd4
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return u4.r(this.j, str);
    }
}
