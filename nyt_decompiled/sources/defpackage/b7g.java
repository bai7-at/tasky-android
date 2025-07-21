package defpackage;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
final class b7g extends ThreadLocal {
    b7g() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
