package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final class j51 {
    private final Object a = new Object();
    private final be3 b;
    private final ae3 c;
    private final ComponentName d;
    private final PendingIntent e;

    j51(be3 be3Var, ae3 ae3Var, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = be3Var;
        this.c = ae3Var;
        this.d = componentName;
        this.e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    IBinder c() {
        return this.c.asBinder();
    }

    ComponentName d() {
        return this.d;
    }

    PendingIntent e() {
        return this.e;
    }

    public boolean f(Uri uri, Bundle bundle, List list) {
        try {
            return this.b.t5(this.c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int g(String str, Bundle bundle) {
        int a4;
        Bundle b = b(bundle);
        synchronized (this.a) {
            try {
                try {
                    a4 = this.b.a4(this.c, str, b);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a4;
    }

    public boolean h(Uri uri) {
        try {
            return this.e != null ? this.b.K3(this.c, uri, b(null)) : this.b.o5(this.c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
