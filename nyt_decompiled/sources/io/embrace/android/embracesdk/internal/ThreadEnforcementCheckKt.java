package io.embrace.android.embracesdk.internal;

import defpackage.zq3;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ThreadEnforcementCheckKt {
    public static final void enforceThread(AtomicReference<Thread> atomicReference) {
        zq3.h(atomicReference, "expectedThreadReference");
    }
}
