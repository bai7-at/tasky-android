package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import defpackage.n30;
import defpackage.q21;
import defpackage.zr8;

@Keep
/* loaded from: classes2.dex */
public class CctBackendFactory implements n30 {
    @Override // defpackage.n30
    public zr8 create(q21 q21Var) {
        return new d(q21Var.b(), q21Var.e(), q21Var.d());
    }
}
