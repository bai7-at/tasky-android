package defpackage;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes3.dex */
public final class z5g implements l6g {
    @Override // defpackage.l6g
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
