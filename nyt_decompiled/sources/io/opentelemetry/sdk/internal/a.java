package io.opentelemetry.sdk.internal;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public abstract class a {
    public static Supplier a() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? AndroidFriendlyRandomHolder.INSTANCE : new Supplier() { // from class: so6
            @Override // java.util.function.Supplier
            public final Object get() {
                return ThreadLocalRandom.current();
            }
        };
    }
}
