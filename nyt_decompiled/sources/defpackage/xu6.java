package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import defpackage.uu6;
import defpackage.vm4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
final class xu6 {
    private final Context a;
    final c b;
    private final PackageManager d;
    private boolean f;
    private final ArrayList e = new ArrayList();
    private final BroadcastReceiver g = new a();
    private final Runnable h = new b();
    private final Handler c = new Handler();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            xu6.this.h();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xu6.this.h();
        }
    }

    public interface c {
        void a(vm4 vm4Var);

        void b(vm4 vm4Var);

        void d(uu6 uu6Var, vm4.e eVar);
    }

    xu6(Context context, c cVar) {
        this.a = context;
        this.b = cVar;
        this.d = context.getPackageManager();
    }

    private int c(String str, String str2) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (((uu6) this.e.get(i)).G(str, str2)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(uu6 uu6Var, vm4.e eVar) {
        this.b.d(uu6Var, eVar);
    }

    static boolean g(List list, ServiceInfo serviceInfo) {
        if (serviceInfo != null && list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ServiceInfo serviceInfo2 = (ServiceInfo) it2.next();
                if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    List d() {
        return (List) this.d.queryIntentServices(new Intent("android.media.MediaRoute2ProviderService"), 0).stream().map(new Function() { // from class: wu6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ServiceInfo serviceInfo;
                serviceInfo = ((ResolveInfo) obj).serviceInfo;
                return serviceInfo;
            }
        }).collect(Collectors.toList());
    }

    void h() {
        int i;
        if (this.f) {
            List arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                arrayList = d();
            }
            int i2 = 0;
            Iterator<ResolveInfo> it2 = this.d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            while (it2.hasNext()) {
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null && (!zm4.l() || !g(arrayList, serviceInfo))) {
                    int c2 = c(serviceInfo.packageName, serviceInfo.name);
                    if (c2 < 0) {
                        final uu6 uu6Var = new uu6(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        uu6Var.P(new uu6.b() { // from class: vu6
                            @Override // uu6.b
                            public final void a(vm4.e eVar) {
                                xu6.this.f(uu6Var, eVar);
                            }
                        });
                        uu6Var.R();
                        i = i2 + 1;
                        this.e.add(i2, uu6Var);
                        this.b.a(uu6Var);
                    } else if (c2 >= i2) {
                        uu6 uu6Var2 = (uu6) this.e.get(c2);
                        uu6Var2.R();
                        uu6Var2.O();
                        i = i2 + 1;
                        Collections.swap(this.e, c2, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < this.e.size()) {
                for (int size = this.e.size() - 1; size >= i2; size--) {
                    uu6 uu6Var3 = (uu6) this.e.get(size);
                    this.b.b(uu6Var3);
                    this.e.remove(uu6Var3);
                    uu6Var3.P(null);
                    uu6Var3.S();
                }
            }
        }
    }

    public void i() {
        if (this.f) {
            return;
        }
        this.f = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        this.a.registerReceiver(this.g, intentFilter, null, this.c);
        this.c.post(this.h);
    }
}
