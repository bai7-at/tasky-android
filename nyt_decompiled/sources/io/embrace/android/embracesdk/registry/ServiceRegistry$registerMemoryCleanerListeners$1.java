package io.embrace.android.embracesdk.registry;

import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.session.MemoryCleanerListener;
import io.embrace.android.embracesdk.session.MemoryCleanerService;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class ServiceRegistry$registerMemoryCleanerListeners$1 extends FunctionReferenceImpl implements ss2 {
    ServiceRegistry$registerMemoryCleanerListeners$1(MemoryCleanerService memoryCleanerService) {
        super(1, memoryCleanerService, MemoryCleanerService.class, "addListener", "addListener(Lio/embrace/android/embracesdk/session/MemoryCleanerListener;)V", 0);
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MemoryCleanerListener) obj);
        return ww8.a;
    }

    public final void invoke(MemoryCleanerListener memoryCleanerListener) {
        zq3.h(memoryCleanerListener, "p1");
        ((MemoryCleanerService) this.receiver).addListener(memoryCleanerListener);
    }
}
