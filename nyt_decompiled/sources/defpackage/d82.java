package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
public interface d82 {
    public static final d82 a = new d82() { // from class: c82
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] a2;
            a2 = d82.a();
            return a2;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ y72[] a() {
        return new y72[0];
    }

    default y72[] b(Uri uri, Map map) {
        return c();
    }

    y72[] c();
}
