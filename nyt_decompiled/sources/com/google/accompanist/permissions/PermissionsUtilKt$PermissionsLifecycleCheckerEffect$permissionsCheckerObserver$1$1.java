package com.google.accompanist.permissions;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import defpackage.d44;
import defpackage.gr5;
import defpackage.ly4;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes2.dex */
final class PermissionsUtilKt$PermissionsLifecycleCheckerEffect$permissionsCheckerObserver$1$1 implements g {
    final /* synthetic */ Lifecycle.Event a;
    final /* synthetic */ List b;

    @Override // androidx.lifecycle.g
    public final void h(d44 d44Var, Lifecycle.Event event) {
        zq3.h(d44Var, "<anonymous parameter 0>");
        zq3.h(event, "event");
        if (event == this.a) {
            for (ly4 ly4Var : this.b) {
                if (!zq3.c(ly4Var.getStatus(), gr5.b.a)) {
                    ly4Var.c();
                }
            }
        }
    }
}
