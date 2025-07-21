package defpackage;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes3.dex */
public final class ize implements kze {
    @Override // defpackage.kze
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
