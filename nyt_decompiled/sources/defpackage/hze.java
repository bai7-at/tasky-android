package defpackage;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
public final class hze implements kze {
    @Override // defpackage.kze
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
