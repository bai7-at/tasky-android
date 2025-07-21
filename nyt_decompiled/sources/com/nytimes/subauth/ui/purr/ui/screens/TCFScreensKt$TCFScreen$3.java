package com.nytimes.subauth.ui.purr.ui.screens;

import com.nytimes.subauth.ui.purr.tcf.TCFViewModel;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
/* synthetic */ class TCFScreensKt$TCFScreen$3 extends FunctionReferenceImpl implements qs2 {
    TCFScreensKt$TCFScreen$3(Object obj) {
        super(0, obj, TCFViewModel.class, "handleBack", "handleBack()V", 0);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        m808invoke();
        return ww8.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m808invoke() {
        ((TCFViewModel) this.receiver).p();
    }
}
