package com.nytimes.android.view;

import android.view.View;
import defpackage.d44;
import defpackage.ei1;
import defpackage.pc7;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public final class ScrollListenerList$Companion$from$$inlined$onDestroy$1 implements ei1 {
    final /* synthetic */ Ref$ObjectRef a;
    final /* synthetic */ View b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        List list;
        zq3.h(d44Var, "owner");
        d44Var.getLifecycle().d(this);
        list = ((pc7) this.a.element).a;
        list.clear();
        this.b.setOnClickListener(null);
    }
}
