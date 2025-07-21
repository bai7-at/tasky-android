package defpackage;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class ysf extends euf {
    private final ktf a;
    private final p7g b;
    private final Integer c;

    private ysf(ktf ktfVar, p7g p7gVar, Integer num) {
        this.a = ktfVar;
        this.b = p7gVar;
        this.c = num;
    }

    public static ysf b(ktf ktfVar, p7g p7gVar, Integer num) {
        if (p7gVar.a() != 32) {
            throw new GeneralSecurityException("Invalid key size");
        }
        if (ktfVar.c() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        }
        if (ktfVar.c() || num == null) {
            return new ysf(ktfVar, p7gVar, num);
        }
        throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
    }

    @Override // defpackage.cbf
    public final /* synthetic */ hcf a() {
        return this.a;
    }
}
