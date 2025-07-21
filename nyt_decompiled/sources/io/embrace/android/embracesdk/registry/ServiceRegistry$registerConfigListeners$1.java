package io.embrace.android.embracesdk.registry;

import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigListener;
import io.embrace.android.embracesdk.config.ConfigService;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class ServiceRegistry$registerConfigListeners$1 extends FunctionReferenceImpl implements ss2 {
    ServiceRegistry$registerConfigListeners$1(ConfigService configService) {
        super(1, configService, ConfigService.class, "addListener", "addListener(Lio/embrace/android/embracesdk/config/ConfigListener;)V", 0);
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConfigListener) obj);
        return ww8.a;
    }

    public final void invoke(ConfigListener configListener) {
        zq3.h(configListener, "p1");
        ((ConfigService) this.receiver).addListener(configListener);
    }
}
