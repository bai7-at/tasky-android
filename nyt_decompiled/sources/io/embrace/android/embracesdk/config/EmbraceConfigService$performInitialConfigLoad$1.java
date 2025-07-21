package io.embrace.android.embracesdk.config;

import defpackage.qs2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class EmbraceConfigService$performInitialConfigLoad$1 extends FunctionReferenceImpl implements qs2 {
    EmbraceConfigService$performInitialConfigLoad$1(EmbraceConfigService embraceConfigService) {
        super(0, embraceConfigService, EmbraceConfigService.class, "loadConfigFromCache", "loadConfigFromCache()V", 0);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        invoke();
        return ww8.a;
    }

    public final void invoke() {
        ((EmbraceConfigService) this.receiver).loadConfigFromCache();
    }
}
