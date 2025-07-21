package com.nytimes.android.abra.io;

import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
/* synthetic */ class AbraFileSystem$copyResourcesToFS$2 extends FunctionReferenceImpl implements ss2 {
    AbraFileSystem$copyResourcesToFS$2(Object obj) {
        super(1, obj, AbraFileSystem.class, "updateBundle", "updateBundle([B)V", 0);
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((byte[]) obj);
        return ww8.a;
    }

    public final void invoke(byte[] bArr) {
        zq3.h(bArr, "p0");
        ((AbraFileSystem) this.receiver).updateBundle(bArr);
    }
}
