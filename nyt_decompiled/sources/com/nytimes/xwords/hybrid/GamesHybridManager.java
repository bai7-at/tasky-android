package com.nytimes.xwords.hybrid;

import defpackage.bd;
import defpackage.wu2;
import defpackage.zq3;
import defpackage.zu2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class GamesHybridManager {
    public static final GamesHybridManager a = new GamesHybridManager();
    private static final MutableSharedFlow b;
    private static final MutableSharedFlow c;
    private static final MutableSharedFlow d;
    public static final int e;

    static {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        b = SharedFlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2, null);
        c = SharedFlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2, null);
        d = SharedFlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2, null);
        e = 8;
    }

    private GamesHybridManager() {
    }

    public final bd c() {
        return null;
    }

    public final Flow d() {
        return c;
    }

    public final Flow e() {
        return d;
    }

    public final Flow f() {
        return b;
    }

    public final void g(wu2 wu2Var) {
        zq3.h(wu2Var, "hybridConfig");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new GamesHybridManager$updateHybridConfig$1(wu2Var, null), 3, null);
    }

    public final void h(zu2 zu2Var) {
        zq3.h(zu2Var, "userConfig");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new GamesHybridManager$updateUserConfigs$1(zu2Var, null), 3, null);
    }
}
