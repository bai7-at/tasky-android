package defpackage;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final class rea implements zbe {
    final /* synthetic */ oae a;

    rea(zea zeaVar, oae oaeVar) {
        this.a = oaeVar;
    }

    @Override // defpackage.zbe
    public final boolean zza(File file) {
        try {
            return this.a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
