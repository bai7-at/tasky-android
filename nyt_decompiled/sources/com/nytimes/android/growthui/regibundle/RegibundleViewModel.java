package com.nytimes.android.growthui.regibundle;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.regibundle.b;
import defpackage.by0;
import defpackage.du6;
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
public final class RegibundleViewModel extends q {
    private final DataConfigId a;
    private final Flow b;
    private final StateFlow c;
    private final StateFlow d;

    public RegibundleViewModel(SharedFlow sharedFlow, RegibundleConfigRepository regibundleConfigRepository) {
        zq3.h(sharedFlow, "userAuthType");
        zq3.h(regibundleConfigRepository, "repository");
        this.a = DataConfigId.Regibundle;
        Flow d = regibundleConfigRepository.d();
        this.b = d;
        CoroutineScope a = r.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow stateIn = FlowKt.stateIn(sharedFlow, a, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), u43.a.b);
        this.c = stateIn;
        this.d = FlowKt.stateIn(FlowKt.combine(d, stateIn, new RegibundleViewModel$configState$1(this)), r.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), b.C0327b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object f(RegibundleViewModel regibundleViewModel, du6 du6Var, u43 u43Var, by0 by0Var) {
        return regibundleViewModel.i(du6Var, u43Var);
    }

    private final b i(du6 du6Var, u43 u43Var) {
        if (u43Var instanceof u43.a) {
            return b.C0327b.a;
        }
        if (!(u43Var instanceof u43.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (v43.a(u43Var, this.a)) {
            return b.a.a;
        }
        return new b.c(du6Var, ((u43.b) u43Var).b() != null);
    }

    public final StateFlow g() {
        return this.d;
    }
}
