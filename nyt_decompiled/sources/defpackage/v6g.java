package defpackage;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
final class v6g extends ThreadLocal {
    final /* synthetic */ x6g a;

    v6g(x6g x6gVar) {
        this.a = x6gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            l5g l5gVar = l5g.f;
            str = this.a.b;
            Mac mac = (Mac) l5gVar.a(str);
            key = this.a.c;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
