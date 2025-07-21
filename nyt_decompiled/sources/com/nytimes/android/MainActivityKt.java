package com.nytimes.android;

import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import defpackage.de4;
import defpackage.ss2;
import defpackage.vz5;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes2.dex */
public abstract class MainActivityKt {
    public static final void a(final NavController navController, de4 de4Var) {
        zq3.h(navController, "<this>");
        zq3.h(de4Var, "mainTabFactory");
        navController.R(de4Var.f().c(), new ss2() { // from class: com.nytimes.android.MainActivityKt$navigateToMainTab$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((androidx.navigation.i) obj);
                return ww8.a;
            }

            public final void invoke(androidx.navigation.i iVar) {
                zq3.h(iVar, "$this$navigate");
                iVar.c(NavGraph.s.a(NavController.this.G()).q(), new ss2() { // from class: com.nytimes.android.MainActivityKt$navigateToMainTab$1.1
                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((vz5) obj);
                        return ww8.a;
                    }

                    public final void invoke(vz5 vz5Var) {
                        zq3.h(vz5Var, "$this$popUpTo");
                        vz5Var.d(true);
                    }
                });
                iVar.e(true);
                iVar.h(true);
            }
        });
    }
}
