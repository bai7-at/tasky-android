package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.d44;
import defpackage.gr5;
import defpackage.gt2;
import defpackage.j4;
import defpackage.ly4;
import defpackage.ms1;
import defpackage.mx0;
import defpackage.ns1;
import defpackage.py1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes2.dex */
public abstract class PermissionsUtilKt {
    public static final void a(final ly4 ly4Var, final Lifecycle.Event event, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(ly4Var, "permissionState");
        Composer h = composer.h(-1770945943);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(ly4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(event) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                event = Lifecycle.Event.ON_RESUME;
            }
            if (b.G()) {
                b.S(-1770945943, i3, -1, "com.google.accompanist.permissions.PermissionLifecycleCheckerEffect (PermissionsUtil.kt:72)");
            }
            h.z(1157296644);
            boolean S = h.S(ly4Var);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new g() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$permissionCheckerObserver$1$1
                    @Override // androidx.lifecycle.g
                    public final void h(d44 d44Var, Lifecycle.Event event2) {
                        zq3.h(d44Var, "<anonymous parameter 0>");
                        zq3.h(event2, "event");
                        if (event2 != Lifecycle.Event.this || zq3.c(ly4Var.getStatus(), gr5.b.a)) {
                            return;
                        }
                        ly4Var.c();
                    }
                };
                h.q(A);
            }
            h.R();
            final g gVar = (g) A;
            final Lifecycle lifecycle = ((d44) h.m(AndroidCompositionLocals_androidKt.i())).getLifecycle();
            zq3.g(lifecycle, "LocalLifecycleOwner.current.lifecycle");
            py1.b(lifecycle, gVar, new ss2() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1

                public static final class a implements ms1 {
                    final /* synthetic */ Lifecycle a;
                    final /* synthetic */ g b;

                    public a(Lifecycle lifecycle, g gVar) {
                        this.a = lifecycle;
                        this.b = gVar;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.d(this.b);
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
                    Lifecycle.this.a(gVar);
                    return new a(Lifecycle.this, gVar);
                }
            }, h, 72);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i5) {
                PermissionsUtilKt.a(ly4.this, event, composer2, i | 1, i2);
            }
        });
    }

    public static final boolean b(Context context, String str) {
        zq3.h(context, "<this>");
        zq3.h(str, "permission");
        return mx0.a(context, str) == 0;
    }

    public static final Activity c(Context context) {
        zq3.h(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            zq3.g(context, "context.baseContext");
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    public static final boolean d(gr5 gr5Var) {
        zq3.h(gr5Var, "<this>");
        return zq3.c(gr5Var, gr5.b.a);
    }

    public static final boolean e(Activity activity, String str) {
        zq3.h(activity, "<this>");
        zq3.h(str, "permission");
        return j4.v(activity, str);
    }
}
