package com.nytimes.android.libs.messagingarchitecture.core;

import com.nytimes.android.libs.messagingarchitecture.hardcoded.HardcodedMessageProvider;
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import defpackage.cb2;
import defpackage.xr4;
import defpackage.zq3;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class MessageStateFactory {
    private final xr4 a;
    private final MessageActionHandler b;
    private final cb2 c;
    private final HardcodedMessageProvider d;
    private final MutableStateFlow e;
    private final boolean f;

    public MessageStateFactory(xr4 xr4Var, MessageActionHandler messageActionHandler, cb2 cb2Var, HardcodedMessageProvider hardcodedMessageProvider) {
        zq3.h(xr4Var, "messageQueue");
        zq3.h(messageActionHandler, "messageActionHandler");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(hardcodedMessageProvider, "hardcodedMessageProvider");
        this.a = xr4Var;
        this.b = messageActionHandler;
        this.c = cb2Var;
        this.d = hardcodedMessageProvider;
        this.e = StateFlowKt.MutableStateFlow(0);
        this.f = cb2Var.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(CoroutineScope coroutineScope, Message message) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MessageStateFactory$markMessageAsSeen$1(this, message, null), 3, null);
    }

    public final Flow g(String str, Map map, CoroutineScope coroutineScope) {
        zq3.h(str, "unit");
        zq3.h(map, "composablePositionMap");
        zq3.h(coroutineScope, "coroutineScope");
        return FlowKt.flow(new MessageStateFactory$getFirstMessageForUnit$1(this, str, coroutineScope, map, null));
    }

    public final void i(int i) {
        this.e.setValue(Integer.valueOf(i));
    }
}
