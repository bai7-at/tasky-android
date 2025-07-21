package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class v9d {
    private static v9d h;
    private jrb f;
    private final Object a = new Object();
    private boolean c = false;
    private boolean d = false;
    private final Object e = new Object();
    private RequestConfiguration g = new RequestConfiguration.a().a();
    private final ArrayList b = new ArrayList();

    private v9d() {
    }

    public static v9d b() {
        v9d v9dVar;
        synchronized (v9d.class) {
            try {
                if (h == null) {
                    h = new v9d();
                }
                v9dVar = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v9dVar;
    }

    public final RequestConfiguration a() {
        return this.g;
    }

    public final void c(String str) {
        synchronized (this.e) {
            Preconditions.checkState(this.f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f.W(str);
            } catch (RemoteException e) {
                fgb.e("Unable to set plugin.", e);
            }
        }
    }
}
