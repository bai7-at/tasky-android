package defpackage;

/* loaded from: classes3.dex */
public final class sre extends tre {
    public sre(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.tre
    public final int a() {
        return 12;
    }

    @Override // defpackage.tre
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        pre.b(iArr2, this.a);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
