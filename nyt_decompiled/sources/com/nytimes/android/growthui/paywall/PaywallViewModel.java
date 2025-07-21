package com.nytimes.android.growthui.paywall;

import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.paywall.b;
import com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository;
import defpackage.by0;
import defpackage.hq5;
import defpackage.u43;
import defpackage.v43;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class PaywallViewModel extends q {
    private final String a;
    private final DataConfigId b;
    private final Flow c;
    private final StateFlow d;
    private final StateFlow e;

    public PaywallViewModel(n nVar, SharedFlow sharedFlow, PaywallConfigRepository paywallConfigRepository) {
        zq3.h(nVar, "savedStateHandle");
        zq3.h(sharedFlow, "userAuthType");
        zq3.h(paywallConfigRepository, "repository");
        String str = (String) nVar.d("VARIANT_NAME");
        this.a = str;
        this.b = (DataConfigId) nVar.d("CONFIG_ID");
        Flow c = paywallConfigRepository.c(str);
        this.c = c;
        CoroutineScope a = r.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow stateIn = FlowKt.stateIn(sharedFlow, a, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), u43.a.b);
        this.d = stateIn;
        this.e = FlowKt.stateIn(FlowKt.combine(c, stateIn, new PaywallViewModel$configState$1(this)), r.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), b.C0322b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object f(PaywallViewModel paywallViewModel, hq5 hq5Var, u43 u43Var, by0 by0Var) {
        return paywallViewModel.i(hq5Var, u43Var);
    }

    private final b i(hq5 hq5Var, u43 u43Var) {
        if (u43Var instanceof u43.a) {
            return b.C0322b.a;
        }
        if (u43Var instanceof u43.b) {
            return v43.a(u43Var, this.b) ? b.a.a : new b.c(hq5Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StateFlow g() {
        return this.e;
    }
}
