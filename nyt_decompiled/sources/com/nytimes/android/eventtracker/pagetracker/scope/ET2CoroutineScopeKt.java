package com.nytimes.android.eventtracker.pagetracker.scope;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient;
import defpackage.d44;
import defpackage.e44;
import defpackage.gt2;
import defpackage.lx1;
import defpackage.mx1;
import defpackage.py1;
import defpackage.sq0;
import defpackage.ww8;
import defpackage.x08;
import defpackage.z12;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class ET2CoroutineScopeKt {
    public static final ET2CoroutineScope b(sq0 sq0Var, gt2 gt2Var) {
        zq3.h(sq0Var, "<this>");
        zq3.h(gt2Var, "block");
        return c(sq0Var, e44.a(sq0Var), gt2Var);
    }

    private static final ET2CoroutineScope c(Context context, LifecycleCoroutineScope lifecycleCoroutineScope, gt2 gt2Var) {
        ET2CoroutineScope g = g(lifecycleCoroutineScope, context);
        lifecycleCoroutineScope.b(new ET2CoroutineScopeKt$et2CoroutineScope$1$1(gt2Var, g, null));
        return g;
    }

    public static final ET2CoroutineScope d(Fragment fragment, gt2 gt2Var) {
        zq3.h(fragment, "<this>");
        zq3.h(gt2Var, "block");
        Context requireContext = fragment.requireContext();
        zq3.g(requireContext, "requireContext(...)");
        d44 viewLifecycleOwner = fragment.getViewLifecycleOwner();
        zq3.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return c(requireContext, e44.a(viewLifecycleOwner), gt2Var);
    }

    public static final ET2SimpleScope e(Object obj, gt2 gt2Var, Composer composer, int i, int i2) {
        zq3.h(gt2Var, "block");
        composer.z(-1035781132);
        if ((i2 & 1) != 0) {
            obj = ww8.a;
        }
        if (b.G()) {
            b.S(-1035781132, i, -1, "com.nytimes.android.eventtracker.pagetracker.scope.et2CoroutineScope (ET2CoroutineScope.kt:91)");
        }
        composer.z(-1105785022);
        Context applicationContext = ((Context) composer.m(AndroidCompositionLocals_androidKt.g())).getApplicationContext();
        composer.z(570230120);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            try {
                zq3.e(applicationContext);
                A = z12.b(applicationContext, lx1.class);
            } catch (Exception unused) {
                A = null;
            }
            composer.q(A);
        }
        composer.R();
        composer.R();
        lx1 lx1Var = (lx1) A;
        ET2SinglePageClient p = lx1Var != null ? lx1Var.p() : null;
        composer.z(-867777311);
        if (p != null) {
            py1.e(obj, p, new ET2CoroutineScopeKt$et2CoroutineScope$2(p, y.o(gt2Var, composer, 8), null), composer, 584);
        }
        composer.R();
        composer.z(-867768277);
        boolean S = composer.S(p);
        Object A2 = composer.A();
        if (S || A2 == Composer.a.a()) {
            Object eT2SimpleScope = p != null ? new ET2SimpleScope(p) : null;
            composer.q(eT2SimpleScope);
            A2 = eT2SimpleScope;
        }
        ET2SimpleScope eT2SimpleScope2 = (ET2SimpleScope) A2;
        composer.R();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return eT2SimpleScope2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gt2 f(x08 x08Var) {
        return (gt2) x08Var.getValue();
    }

    public static final ET2CoroutineScope g(CoroutineScope coroutineScope, Context context) {
        zq3.h(coroutineScope, "<this>");
        zq3.h(context, "context");
        return new ET2CoroutineScope(mx1.a(context).p(), coroutineScope);
    }
}
