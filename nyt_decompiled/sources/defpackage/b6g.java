package defpackage;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes3.dex */
public final class b6g implements l6g {
    @Override // defpackage.l6g
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
