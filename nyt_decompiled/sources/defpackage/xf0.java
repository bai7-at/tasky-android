package defpackage;

/* loaded from: classes2.dex */
public class xf0 implements cz6 {
    private final byte[] a;

    public xf0(byte[] bArr) {
        this.a = (byte[]) z06.d(bArr);
    }

    @Override // defpackage.cz6
    public int a() {
        return this.a.length;
    }

    @Override // defpackage.cz6
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.a;
    }

    @Override // defpackage.cz6
    public void c() {
    }

    @Override // defpackage.cz6
    public Class d() {
        return byte[].class;
    }
}
