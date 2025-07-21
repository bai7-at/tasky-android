package defpackage;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes3.dex */
public final class fze implements kze {
    @Override // defpackage.kze
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
