package com.google.accompanist.permissions;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.h5;
import defpackage.le4;
import defpackage.ly4;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.py1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes2.dex */
public abstract class MutablePermissionStateKt {
    public static final ly4 a(String str, final ss2 ss2Var, Composer composer, int i, int i2) {
        zq3.h(str, "permission");
        composer.z(1424240517);
        if ((i2 & 2) != 0) {
            ss2Var = new ss2() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$1
                public final void invoke(boolean z) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return ww8.a;
                }
            };
        }
        if (b.G()) {
            b.S(1424240517, i, -1, "com.google.accompanist.permissions.rememberMutablePermissionState (MutablePermissionState.kt:44)");
        }
        Context context = (Context) composer.m(AndroidCompositionLocals_androidKt.g());
        composer.z(1157296644);
        boolean S = composer.S(str);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new ly4(str, context, PermissionsUtilKt.c(context));
            composer.q(A);
        }
        composer.R();
        final ly4 ly4Var = (ly4) A;
        PermissionsUtilKt.a(ly4Var, null, composer, 0, 2);
        h5 h5Var = new h5();
        composer.z(511388516);
        boolean S2 = composer.S(ly4Var) | composer.S(ss2Var);
        Object A2 = composer.A();
        if (S2 || A2 == Composer.a.a()) {
            A2 = new ss2() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$launcher$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return ww8.a;
                }

                public final void invoke(boolean z) {
                    ly4.this.c();
                    ss2Var.invoke(Boolean.valueOf(z));
                }
            };
            composer.q(A2);
        }
        composer.R();
        final le4 a = ActivityResultRegistryKt.a(h5Var, (ss2) A2, composer, 8);
        py1.b(ly4Var, a, new ss2() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$2

            public static final class a implements ms1 {
                final /* synthetic */ ly4 a;

                public a(ly4 ly4Var) {
                    this.a = ly4Var;
                }

                @Override // defpackage.ms1
                public void dispose() {
                    this.a.d(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ms1 invoke(ns1 ns1Var) {
                zq3.h(ns1Var, "$this$DisposableEffect");
                ly4.this.d(a);
                return new a(ly4.this);
            }
        }, composer, le4.c << 3);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return ly4Var;
    }
}
