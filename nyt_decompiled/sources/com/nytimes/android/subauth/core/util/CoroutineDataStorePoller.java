package com.nytimes.android.subauth.core.util;

import androidx.datastore.preferences.core.PreferencesKt;
import defpackage.ba1;
import defpackage.by0;
import defpackage.o01;
import defpackage.s16;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class CoroutineDataStorePoller extends o01 {
    public static final a Companion = new a(null);
    private final ba1 d;
    private final s16.a e;
    private final boolean f;
    private final CoroutineDispatcher g;
    private final ss2 h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineDataStorePoller(ba1 ba1Var, s16.a aVar, boolean z, CoroutineDispatcher coroutineDispatcher, ss2 ss2Var) {
        super(coroutineDispatcher, ss2Var);
        zq3.h(aVar, "pollTimeKey");
        zq3.h(coroutineDispatcher, "dispatcher");
        zq3.h(ss2Var, "lambda");
        this.d = ba1Var;
        this.e = aVar;
        this.f = z;
        this.g = coroutineDispatcher;
        this.h = ss2Var;
    }

    public Flow f(long j) {
        return FlowKt.flowOn(FlowKt.channelFlow(new CoroutineDataStorePoller$poll$1(this, j, null)), this.g);
    }

    public final Object g(by0 by0Var) {
        Object a2;
        ul8.a.z("SUBAUTH").a("Resetting poll time for " + this.e, new Object[0]);
        ba1 ba1Var = this.d;
        return (ba1Var == null || (a2 = PreferencesKt.a(ba1Var, new CoroutineDataStorePoller$resetPollTime$2(this, null), by0Var)) != kotlin.coroutines.intrinsics.a.h()) ? ww8.a : a2;
    }
}
