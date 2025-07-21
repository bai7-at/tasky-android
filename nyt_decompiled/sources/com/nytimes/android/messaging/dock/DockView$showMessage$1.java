package com.nytimes.android.messaging.dock;

import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
/* synthetic */ class DockView$showMessage$1 extends FunctionReferenceImpl implements ss2 {
    DockView$showMessage$1(Object obj) {
        super(1, obj, DockView.class, "update", "update(Lcom/nytimes/android/messaging/dock/Dock;)V", 0);
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Dock) obj);
        return ww8.a;
    }

    public final void invoke(Dock dock) {
        zq3.h(dock, "p0");
        ((DockView) this.receiver).update(dock);
    }
}
