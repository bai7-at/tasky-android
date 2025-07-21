package defpackage;

/* loaded from: classes3.dex */
public final class jnf {
    private final haf a;
    private final kaf b;

    public jnf(haf hafVar) {
        this.a = hafVar;
        this.b = null;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        haf hafVar = this.a;
        return hafVar != null ? hafVar.zza(bArr, bArr2) : this.b.zza(bArr, bArr2);
    }

    public jnf(kaf kafVar) {
        this.a = null;
        this.b = kafVar;
    }
}
