package io.opentelemetry.sdk.trace;

import defpackage.bp8;
import defpackage.fy7;
import java.util.Random;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
enum RandomIdGenerator implements c {
    INSTANCE;

    private static final long INVALID_ID = 0;
    private static final Supplier<Random> randomSupplier = io.opentelemetry.sdk.internal.a.a();

    @Override // io.opentelemetry.sdk.trace.c
    public String generateSpanId() {
        long nextLong;
        Random random = randomSupplier.get();
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        return fy7.a(nextLong);
    }

    @Override // io.opentelemetry.sdk.trace.c
    public String generateTraceId() {
        long nextLong;
        Random random = randomSupplier.get();
        long nextLong2 = random.nextLong();
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        return bp8.a(nextLong2, nextLong);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "RandomIdGenerator{}";
    }
}
