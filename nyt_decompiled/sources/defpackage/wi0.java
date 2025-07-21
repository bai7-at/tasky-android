package defpackage;

/* loaded from: classes3.dex */
class wi0 extends xi0 {
    wi0(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.xi0
    int[] d(int[] iArr, int i) {
        if (iArr.length != g() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        xi0.k(iArr2, this.a);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // defpackage.xi0
    int g() {
        return 12;
    }
}
