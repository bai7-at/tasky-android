package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes3.dex */
public final class d3b extends g3b {
    private static final s5b a = new s5b();

    @Override // defpackage.h3b
    public final boolean I(String str) {
        try {
            return g8.class.isAssignableFrom(Class.forName(str, false, d3b.class.getClassLoader()));
        } catch (Throwable unused) {
            fgb.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // defpackage.h3b
    public final boolean b(String str) {
        try {
            return s41.class.isAssignableFrom(Class.forName(str, false, d3b.class.getClassLoader()));
        } catch (Throwable unused) {
            fgb.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // defpackage.h3b
    public final k3b f(String str) {
        m4b m4bVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, d3b.class.getClassLoader());
                if (ep4.class.isAssignableFrom(cls)) {
                    return new m4b((ep4) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (g8.class.isAssignableFrom(cls)) {
                    return new m4b((g8) cls.getDeclaredConstructor(null).newInstance(null));
                }
                fgb.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                fgb.h("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            fgb.b("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    m4bVar = new m4b(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            m4bVar = new m4b(new AdMobAdapter());
            return m4bVar;
        }
    }

    @Override // defpackage.h3b
    public final o5b s(String str) {
        return new e6b((RtbAdapter) Class.forName(str, false, s5b.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }
}
