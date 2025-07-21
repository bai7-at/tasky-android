package defpackage;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
public final class dze implements kze {
    @Override // defpackage.kze
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
