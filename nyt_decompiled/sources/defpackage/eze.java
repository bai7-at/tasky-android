package defpackage;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes3.dex */
public final class eze implements kze {
    @Override // defpackage.kze
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
