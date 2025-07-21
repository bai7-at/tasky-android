package com.nytimes.android.growthui.postauth;

import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.postauth.b;
import com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthConfigRepository;
import defpackage.by0;
import defpackage.j06;
import defpackage.m06;
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
public final class PostAuthViewModel extends q {
    private final String a;
    private final DataConfigId b;
    private final Flow c;
    private final StateFlow d;
    private final StateFlow e;

    public PostAuthViewModel(n nVar, SharedFlow sharedFlow, PostAuthConfigRepository postAuthConfigRepository) {
        zq3.h(nVar, "savedStateHandle");
        zq3.h(sharedFlow, "userAuthType");
        zq3.h(postAuthConfigRepository, "repository");
        String str = (String) nVar.d("VARIANT_NAME");
        this.a = str;
        this.b = (DataConfigId) nVar.d("CONFIG_ID");
        Flow e = postAuthConfigRepository.e(str);
        this.c = e;
        CoroutineScope a = r.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow stateIn = FlowKt.stateIn(sharedFlow, a, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), u43.a.b);
        this.d = stateIn;
        this.e = FlowKt.stateIn(FlowKt.combine(e, stateIn, new PostAuthViewModel$configState$1(this)), r.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), b.C0325b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object f(PostAuthViewModel postAuthViewModel, j06 j06Var, u43 u43Var, by0 by0Var) {
        return postAuthViewModel.j(j06Var, u43Var);
    }

    private final j06 i(j06 j06Var, String str) {
        return !zq3.c(j06Var.c().f(), str) ? j06.b(j06Var, m06.b(j06Var.c(), null, null, str, null, null, 27, null), null, null, null, 14, null) : j06Var;
    }

    private final b j(j06 j06Var, u43 u43Var) {
        if (u43Var instanceof u43.a) {
            return b.C0325b.a;
        }
        if (!(u43Var instanceof u43.b)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean a = v43.a(u43Var, this.b);
        u43.b bVar = (u43.b) u43Var;
        return (bVar.b() == null || a) ? new b.a(a) : new b.c(i(j06Var, bVar.b()));
    }

    public final StateFlow g() {
        return this.e;
    }
}
