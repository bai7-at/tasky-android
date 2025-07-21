package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes5.dex */
public final class av5 extends s1 {
    @Override // kotlin.random.Random
    public long h(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // defpackage.s1
    public Random i() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        zq3.g(current, "current(...)");
        return current;
    }
}
