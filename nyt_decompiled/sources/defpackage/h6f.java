package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class h6f implements r4f {
    private static final Map a = new so();

    static h6f a(Context context, String str) {
        if (h1f.a()) {
            throw null;
        }
        synchronized (h6f.class) {
            lh4.a(a.get(null));
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            } finally {
            }
        }
    }

    static synchronized void b() {
        synchronized (h6f.class) {
            Map map = a;
            Iterator it2 = map.values().iterator();
            if (it2.hasNext()) {
                lh4.a(it2.next());
                throw null;
            }
            map.clear();
        }
    }
}
