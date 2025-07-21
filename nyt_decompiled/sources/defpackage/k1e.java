package defpackage;

/* loaded from: classes3.dex */
public final class k1e {
    private long[] a;

    public k1e(int i) {
        int i2 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i2 = highestOneBit + highestOneBit;
        }
        this.a = new long[i2];
    }
}
