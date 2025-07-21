package io.embrace.android.embracesdk.comms.delivery;

import defpackage.qs2;
import defpackage.ww8;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes5.dex */
final /* synthetic */ class EmbracePendingApiCallsSender$executeDelivery$1$1$1 extends AdaptedFunctionReference implements qs2 {
    EmbracePendingApiCallsSender$executeDelivery$1$1$1(EmbracePendingApiCallsSender embracePendingApiCallsSender) {
        super(0, embracePendingApiCallsSender, EmbracePendingApiCallsSender.class, "scheduleApiCallsDelivery", "scheduleApiCallsDelivery(J)V", 0);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        invoke();
        return ww8.a;
    }

    public final void invoke() {
        EmbracePendingApiCallsSender.scheduleApiCallsDelivery$default((EmbracePendingApiCallsSender) this.receiver, 0L, 1, null);
    }
}
