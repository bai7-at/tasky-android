package io.embrace.android.embracesdk.internal;

import defpackage.bp8;
import defpackage.fy7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;

/* loaded from: classes5.dex */
public final class IdGenerator {
    public static final Companion Companion = new Companion(null);
    private static final IdGenerator INSTANCE = new IdGenerator(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
    private final Random random;

    public static final class Companion {
        private Companion() {
        }

        public final String generateLaunchInstanceId() {
            return IdGenerator.INSTANCE.generateUUID();
        }

        public final String generateW3CTraceparent() {
            return IdGenerator.INSTANCE.generateTraceparent();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdGenerator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final String generateW3CTraceparent() {
        return Companion.generateW3CTraceparent();
    }

    private final long validRandomLong() {
        long g;
        do {
            g = this.random.g();
        } while (g == 0);
        return g;
    }

    public final String generateTraceparent() {
        return "00-" + bp8.a(validRandomLong(), validRandomLong()) + "-" + fy7.a(validRandomLong()) + "-01";
    }

    public final String generateUUID() {
        String a = fy7.a(validRandomLong());
        zq3.g(a, "SpanId.fromLong(validRandomLong())");
        return a;
    }

    public IdGenerator(Random random) {
        zq3.h(random, "random");
        this.random = random;
    }

    public /* synthetic */ IdGenerator(Random random, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Random.a : random);
    }
}
