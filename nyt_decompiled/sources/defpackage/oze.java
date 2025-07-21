package defpackage;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
final class oze extends ThreadLocal {
    final /* synthetic */ pze a;

    oze(pze pzeVar) {
        this.a = pzeVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            bze bzeVar = bze.c;
            str = this.a.b;
            Mac mac = (Mac) bzeVar.a(str);
            key = this.a.c;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
