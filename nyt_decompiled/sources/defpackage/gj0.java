package defpackage;

import com.appsflyer.AppsFlyerProperties;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class gj0 implements FlowCollector {
    private final SendChannel a;

    public gj0(SendChannel sendChannel) {
        zq3.h(sendChannel, AppsFlyerProperties.CHANNEL);
        this.a = sendChannel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, by0 by0Var) {
        Object send = this.a.send(obj, by0Var);
        return send == a.h() ? send : ww8.a;
    }
}
