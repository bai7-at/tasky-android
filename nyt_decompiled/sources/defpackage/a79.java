package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class a79 {
    private final Object a = new Object();
    private znc b;
    private a c;

    public static abstract class a {
        public abstract void a();

        public void b(boolean z) {
        }

        public abstract void c();

        public void d() {
        }

        public abstract void e();
    }

    public void a(a aVar) {
        o3e o3eVar;
        synchronized (this.a) {
            this.c = aVar;
            znc zncVar = this.b;
            if (zncVar == null) {
                return;
            }
            if (aVar == null) {
                o3eVar = null;
            } else {
                try {
                    o3eVar = new o3e(aVar);
                } catch (RemoteException e) {
                    fgb.e("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
            zncVar.W5(o3eVar);
        }
    }

    public final znc b() {
        znc zncVar;
        synchronized (this.a) {
            zncVar = this.b;
        }
        return zncVar;
    }

    public final void c(znc zncVar) {
        synchronized (this.a) {
            try {
                this.b = zncVar;
                a aVar = this.c;
                if (aVar != null) {
                    a(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
