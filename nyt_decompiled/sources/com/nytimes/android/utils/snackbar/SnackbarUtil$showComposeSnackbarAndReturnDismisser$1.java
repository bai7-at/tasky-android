package com.nytimes.android.utils.snackbar;

import defpackage.qs2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
/* synthetic */ class SnackbarUtil$showComposeSnackbarAndReturnDismisser$1 extends FunctionReferenceImpl implements qs2 {
    SnackbarUtil$showComposeSnackbarAndReturnDismisser$1(Object obj) {
        super(0, obj, SnackbarViewModel.class, "dismiss", "dismiss()V", 0);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        m779invoke();
        return ww8.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m779invoke() {
        ((SnackbarViewModel) this.receiver).e();
    }
}
