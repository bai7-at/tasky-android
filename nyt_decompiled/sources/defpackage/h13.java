package defpackage;

import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class h13 extends kp9 {
    private static List h = new ArrayList();
    private boolean e;
    private Set f;
    private boolean g;

    public h13(zzbv zzbvVar) {
        super(zzbvVar);
        this.f = new HashSet();
    }

    public static void c() {
        synchronized (h13.class) {
            try {
                List list = h;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                    h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(boolean z) {
        this.g = z;
    }

    public final void d() {
        zzft zzq = a().zzq();
        zzq.zzf();
        if (zzq.zze()) {
            b(zzq.zzc());
        }
        zzq.zzf();
        this.e = true;
    }
}
