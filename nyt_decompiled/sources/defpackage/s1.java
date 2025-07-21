package defpackage;

import kotlin.random.Random;

/* loaded from: classes5.dex */
public abstract class s1 extends Random {
    @Override // kotlin.random.Random
    public int b(int i) {
        return ro6.e(i().nextInt(), i);
    }

    @Override // kotlin.random.Random
    public double c() {
        return i().nextDouble();
    }

    @Override // kotlin.random.Random
    public int e() {
        return i().nextInt();
    }

    @Override // kotlin.random.Random
    public int f(int i) {
        return i().nextInt(i);
    }

    @Override // kotlin.random.Random
    public long g() {
        return i().nextLong();
    }

    public abstract java.util.Random i();
}
