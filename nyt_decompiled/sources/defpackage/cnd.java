package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public final class cnd implements gqd {
    private final kke a;
    private final ViewGroup b;
    private final Context c;
    private final Set d;

    public cnd(kke kkeVar, ViewGroup viewGroup, Context context, Set set) {
        this.a = kkeVar;
        this.d = set;
        this.b = viewGroup;
        this.c = context;
    }

    final /* synthetic */ dnd a() {
        if (((Boolean) pla.c().a(mpa.T5)).booleanValue() && this.b != null && this.d.contains("banner")) {
            return new dnd(Boolean.valueOf(this.b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) pla.c().a(mpa.U5)).booleanValue() && this.d.contains("native")) {
            Context context = this.c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0) {
                    try {
                        bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new dnd(bool);
            }
        }
        return new dnd(null);
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 22;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: bnd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cnd.this.a();
            }
        });
    }
}
