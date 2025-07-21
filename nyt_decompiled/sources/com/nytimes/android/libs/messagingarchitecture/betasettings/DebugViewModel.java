package com.nytimes.android.libs.messagingarchitecture.betasettings;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater;
import defpackage.at3;
import defpackage.dt3;
import defpackage.ec1;
import defpackage.qg0;
import defpackage.qo;
import defpackage.ss2;
import defpackage.tt3;
import defpackage.u14;
import defpackage.ww8;
import defpackage.yc8;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class DebugViewModel extends q {
    private final ec1 a;
    private final qg0 b;
    private final MessageHistoryUpdater c;
    private final yc8 d;
    private final MutableStateFlow e;
    private final StateFlow f;
    private final at3 g;
    private final StateFlow h;
    private final StateFlow i;
    private final StateFlow j;
    private final StateFlow k;
    private final StateFlow l;
    private final StateFlow m;

    public DebugViewModel(ec1 ec1Var, qg0 qg0Var, MessageHistoryUpdater messageHistoryUpdater, yc8 yc8Var) {
        zq3.h(ec1Var, "messageQueue");
        zq3.h(qg0Var, "cachedMessageHistoryDao");
        zq3.h(messageHistoryUpdater, "messageHistoryUpdater");
        zq3.h(yc8Var, "supportedMessagingUnits");
        this.a = ec1Var;
        this.b = qg0Var;
        this.c = messageHistoryUpdater;
        this.d = yc8Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(i.j0(yc8Var.a()));
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
        this.g = tt3.b(null, new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel$json$1
            public final void b(dt3 dt3Var) {
                zq3.h(dt3Var, "$this$Json");
                dt3Var.g(true);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((dt3) obj);
                return ww8.a;
            }
        }, 1, null);
        Flow flow = FlowKt.flow(new DebugViewModel$messageHistory$1(this, null));
        CoroutineScope a = r.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharingStarted eagerly = companion.getEagerly();
        u14.b bVar = u14.b.b;
        this.h = FlowKt.stateIn(flow, a, eagerly, bVar);
        this.i = FlowKt.stateIn(FlowKt.flow(new DebugViewModel$omaMessageHistory$1(this, null)), r.a(this), companion.getEagerly(), bVar);
        this.j = FlowKt.stateIn(FlowKt.transformLatest(MutableStateFlow, new DebugViewModel$special$$inlined$flatMapLatest$1(null, this)), r.a(this), companion.getEagerly(), bVar);
        this.k = FlowKt.stateIn(FlowKt.flow(new DebugViewModel$actions$1(this, null)), r.a(this), companion.getEagerly(), bVar);
        this.l = FlowKt.stateIn(FlowKt.flow(new DebugViewModel$sampleMessagesJson$1(this, null)), r.a(this), companion.getEagerly(), bVar);
        this.m = FlowKt.stateIn(FlowKt.flow(new DebugViewModel$overrideMessagesJson$1(this, null)), r.a(this), companion.getEagerly(), bVar);
    }

    public final void j() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new DebugViewModel$clearActionsHistory$1(this, null), 3, null);
    }

    public final void k() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new DebugViewModel$clearMessageHistory$1(this, null), 3, null);
    }

    public final void l() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new DebugViewModel$clearOmaMessageHistory$1(this, null), 3, null);
    }

    public final void m(String str) {
        zq3.h(str, "jsonMessage");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new DebugViewModel$convertJson$1(this, (Message) at3.d.c(Message.Companion.serializer(), str), null), 3, null);
    }

    public final StateFlow n() {
        return this.k;
    }

    public final StateFlow o() {
        return this.h;
    }

    public final StateFlow p() {
        return this.i;
    }

    public final StateFlow q() {
        return this.m;
    }

    public final StateFlow r() {
        return this.j;
    }

    public final StateFlow s() {
        return this.l;
    }

    public final yc8 t() {
        return this.d;
    }

    public final void u(String str) {
        zq3.h(str, "newUnit");
        this.e.setValue(str);
    }

    public final void v(String str) {
        zq3.h(str, "jsonMessageOverrides");
        at3 at3Var = this.g;
        at3Var.a();
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new DebugViewModel$updateQueueWithOverrides$1(this, (List) at3Var.c(new qo(Message.Companion.serializer()), str), null), 3, null);
    }
}
