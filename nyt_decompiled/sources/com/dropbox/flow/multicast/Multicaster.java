package com.dropbox.flow.multicast;

import defpackage.by0;
import defpackage.c04;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class Multicaster {
    private final CoroutineScope a;
    private final Flow b;
    private final boolean c;
    private final boolean d;
    private final gt2 e;
    private final c04 f;

    public Multicaster(CoroutineScope coroutineScope, final int i, Flow flow, boolean z, boolean z2, gt2 gt2Var) {
        zq3.h(coroutineScope, "scope");
        zq3.h(flow, "source");
        zq3.h(gt2Var, "onEach");
        this.a = coroutineScope;
        this.b = flow;
        this.c = z;
        this.d = z2;
        this.e = gt2Var;
        this.f = kotlin.c.b(LazyThreadSafetyMode.SYNCHRONIZED, new qs2() { // from class: com.dropbox.flow.multicast.Multicaster$channelManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChannelManager mo865invoke() {
                CoroutineScope coroutineScope2;
                Flow flow2;
                boolean z3;
                boolean z4;
                gt2 gt2Var2;
                coroutineScope2 = Multicaster.this.a;
                flow2 = Multicaster.this.b;
                z3 = Multicaster.this.c;
                z4 = Multicaster.this.d;
                gt2Var2 = Multicaster.this.e;
                return new ChannelManager(coroutineScope2, i, z3, z4, gt2Var2, flow2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelManager h() {
        return (ChannelManager) this.f.getValue();
    }

    public final Object g(by0 by0Var) {
        Object h = h().h(by0Var);
        return h == kotlin.coroutines.intrinsics.a.h() ? h : ww8.a;
    }

    public final Flow i(boolean z) {
        if (!z || this.c) {
            return FlowKt.flow(new Multicaster$newDownstream$2(this, z, null));
        }
        throw new IllegalStateException("cannot create a piggyback only flow when piggybackDownstream is disabled");
    }

    public /* synthetic */ Multicaster(CoroutineScope coroutineScope, int i, Flow flow, boolean z, boolean z2, gt2 gt2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i2 & 2) != 0 ? 0 : i, flow, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, gt2Var);
    }
}
