package com.nytimes.android.growthui.landingpage;

import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.common.models.ProductType;
import com.nytimes.android.growthui.common.models.Subscription;
import com.nytimes.android.growthui.landingpage.b;
import defpackage.by0;
import defpackage.d46;
import defpackage.dy3;
import defpackage.fy3;
import defpackage.gy3;
import defpackage.oh3;
import defpackage.p60;
import defpackage.ph3;
import defpackage.u43;
import defpackage.v43;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class LandingPageViewModel extends q {
    private final p60 a;
    private final String b;
    private final DataConfigId c;
    private final Flow d;
    private final StateFlow e;
    private final StateFlow f;

    public LandingPageViewModel(n nVar, SharedFlow sharedFlow, gy3 gy3Var, p60 p60Var) {
        zq3.h(nVar, "savedStateHandle");
        zq3.h(sharedFlow, "userAuthType");
        zq3.h(gy3Var, "repository");
        zq3.h(p60Var, "networkStatus");
        this.a = p60Var;
        String str = (String) nVar.d("VARIANT_NAME");
        this.b = str;
        this.c = (DataConfigId) nVar.d("CONFIG_ID");
        Flow a = gy3Var.a(str);
        this.d = a;
        CoroutineScope a2 = r.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow stateIn = FlowKt.stateIn(sharedFlow, a2, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), u43.a.b);
        this.e = stateIn;
        this.f = FlowKt.stateIn(FlowKt.combine(a, stateIn, new LandingPageViewModel$configState$1(this)), r.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), b.C0320b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object f(LandingPageViewModel landingPageViewModel, dy3 dy3Var, u43 u43Var, by0 by0Var) {
        return landingPageViewModel.k(dy3Var, u43Var);
    }

    private final b.c g(u43.b bVar, dy3 dy3Var) {
        boolean z = false;
        boolean z2 = this.a.a() && bVar.b() == null;
        if ((dy3Var.c() instanceof fy3.c) && bVar.a().contains(Subscription.News)) {
            z = true;
        }
        oh3 d = dy3Var.d();
        List arrayList = new ArrayList();
        for (Object obj : d) {
            d46 d46Var = (d46) obj;
            if (!z || d46Var.e() != ProductType.AllAccess) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = dy3Var.d();
        }
        return new b.c(j(dy3Var, ph3.a(arrayList), z2));
    }

    private final dy3 j(dy3 dy3Var, oh3 oh3Var, boolean z) {
        if (dy3Var.e() == z && zq3.c(dy3Var.d(), oh3Var)) {
            return dy3Var;
        }
        fy3 c = (oh3Var.size() == 1 && (dy3Var.c() instanceof fy3.c)) ? fy3.b.a : dy3Var.c();
        if (zq3.c(dy3Var.d(), oh3Var)) {
            oh3Var = dy3Var.d();
        }
        return dy3.b(dy3Var, c, oh3Var, z, null, 8, null);
    }

    private final b k(dy3 dy3Var, u43 u43Var) {
        if (u43Var instanceof u43.a) {
            return b.C0320b.a;
        }
        if (u43Var instanceof u43.b) {
            return v43.a(u43Var, this.c) ? new b.a(true) : g((u43.b) u43Var, dy3Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StateFlow i() {
        return this.f;
    }
}
