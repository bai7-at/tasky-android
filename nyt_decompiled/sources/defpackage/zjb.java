package defpackage;

/* loaded from: classes3.dex */
final class zjb extends kca {
    static final zjb c = new zjb();

    zjb() {
    }

    @Override // defpackage.kca
    public final oca b(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new qca() : "mvhd".equals(str) ? new rca() : new sca(str);
    }
}
