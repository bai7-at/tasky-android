package defpackage;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes3.dex */
public final class h6g implements l6g {
    @Override // defpackage.l6g
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
