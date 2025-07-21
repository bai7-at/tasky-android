package defpackage;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes3.dex */
public final class j6g implements l6g {
    @Override // defpackage.l6g
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
