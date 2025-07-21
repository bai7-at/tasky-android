package defpackage;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes3.dex */
public final class gze implements kze {
    @Override // defpackage.kze
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
