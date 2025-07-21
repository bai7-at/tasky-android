package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* loaded from: classes3.dex */
public final class wja {
    private final Object a = new Object();
    private uja b = null;
    private boolean c = false;

    public final Activity a() {
        synchronized (this.a) {
            try {
                uja ujaVar = this.b;
                if (ujaVar == null) {
                    return null;
                }
                return ujaVar.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context b() {
        synchronized (this.a) {
            try {
                uja ujaVar = this.b;
                if (ujaVar == null) {
                    return null;
                }
                return ujaVar.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(vja vjaVar) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new uja();
                }
                this.b.h(vjaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Context context) {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        fgb.g("Can not cast Context to Application");
                        return;
                    }
                    if (this.b == null) {
                        this.b = new uja();
                    }
                    this.b.i(application, context);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(vja vjaVar) {
        synchronized (this.a) {
            try {
                uja ujaVar = this.b;
                if (ujaVar == null) {
                    return;
                }
                ujaVar.j(vjaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
