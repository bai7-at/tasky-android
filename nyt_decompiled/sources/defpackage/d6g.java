package defpackage;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes3.dex */
public final class d6g implements l6g {
    @Override // defpackage.l6g
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
