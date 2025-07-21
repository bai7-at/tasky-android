package io.embrace.android.embracesdk.registry;

import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.io.Closeable;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class ServiceRegistry$close$1 extends FunctionReferenceImpl implements ss2 {
    public static final ServiceRegistry$close$1 INSTANCE = new ServiceRegistry$close$1();

    ServiceRegistry$close$1() {
        super(1, Closeable.class, "close", "close()V", 0);
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Closeable) obj);
        return ww8.a;
    }

    public final void invoke(Closeable closeable) {
        zq3.h(closeable, "p1");
        closeable.close();
    }
}
