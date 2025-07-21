package com.nytimes.android.onboarding.compose;

import android.app.Activity;
import com.nytimes.android.onboarding.compose.c;
import com.nytimes.android.utils.AppPreferences;
import defpackage.by0;
import defpackage.ww8;
import defpackage.zq3;
import java.util.LinkedHashSet;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class b {
    private final AppPreferences a;
    private final com.nytimes.android.entitlements.a b;
    private final MutableStateFlow c;
    private final StateFlow d;
    private LinkedHashSet e;

    public b(AppPreferences appPreferences, com.nytimes.android.entitlements.a aVar) {
        zq3.h(appPreferences, "appPreferences");
        zq3.h(aVar, "eCommClient");
        this.a = appPreferences;
        this.b = aVar;
        c.e eVar = c.e.b;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(eVar);
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
        this.e = b0.g(eVar, c.d.b, c.f.b, c.C0372c.b, c.b.b);
    }

    private final boolean c(int i) {
        boolean q = this.b.q();
        boolean a = this.b.a();
        c cVar = (c) i.g0(this.e, i);
        if (cVar == null) {
            return false;
        }
        if (zq3.c(cVar, c.d.b)) {
            if (q) {
                return false;
            }
        } else if (zq3.c(cVar, c.f.b) && a) {
            return false;
        }
        return true;
    }

    private final Object f(int i, by0 by0Var) {
        Object emit;
        c cVar = (c) i.g0(this.e, i);
        return (cVar == null || (emit = this.c.emit(cVar, by0Var)) != kotlin.coroutines.intrinsics.a.h()) ? ww8.a : emit;
    }

    public final void a(Activity activity) {
        zq3.h(activity, "activity");
        this.a.f("FreshInstallLaunch", false);
        this.c.setValue(c.e.b);
        activity.finish();
    }

    public final StateFlow b() {
        return this.d;
    }

    public final Object d(c cVar, by0 by0Var) {
        Object f = f(i.o0(this.e, cVar) + 1, by0Var);
        return f == kotlin.coroutines.intrinsics.a.h() ? f : ww8.a;
    }

    public final Object e(by0 by0Var) {
        Object f;
        int o0 = i.o0(this.e, this.d.getValue()) - 1;
        return (c(o0) && (f = f(o0, by0Var)) == kotlin.coroutines.intrinsics.a.h()) ? f : ww8.a;
    }
}
