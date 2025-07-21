package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.ug8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d {
    private final Context a;
    private final Intent b;
    private NavGraph c;
    private final List d;
    private Bundle e;

    private static final class a {
        private final int a;
        private final Bundle b;

        public a(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }

        public final Bundle a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }
    }

    public d(Context context) {
        Intent launchIntentForPackage;
        zq3.h(context, "context");
        this.a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.b = launchIntentForPackage;
        this.d = new ArrayList();
    }

    private final void c() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        NavDestination navDestination = null;
        for (a aVar : this.d) {
            int b = aVar.b();
            Bundle a2 = aVar.a();
            NavDestination d = d(b);
            if (d == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.j.b(this.a, b) + " cannot be found in the navigation graph " + this.c);
            }
            for (int i : d.n(navDestination)) {
                arrayList.add(Integer.valueOf(i));
                arrayList2.add(a2);
            }
            navDestination = d;
        }
        this.b.putExtra("android-support-nav:controller:deepLinkIds", kotlin.collections.i.W0(arrayList));
        this.b.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    private final NavDestination d(int i) {
        kotlin.collections.c cVar = new kotlin.collections.c();
        NavGraph navGraph = this.c;
        zq3.e(navGraph);
        cVar.add(navGraph);
        while (!cVar.isEmpty()) {
            NavDestination navDestination = (NavDestination) cVar.removeFirst();
            if (navDestination.q() == i) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator it2 = ((NavGraph) navDestination).iterator();
                while (it2.hasNext()) {
                    cVar.add((NavDestination) it2.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ d g(d dVar, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return dVar.f(i, bundle);
    }

    private final void h() {
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            int b = ((a) it2.next()).b();
            if (d(b) == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.j.b(this.a, b) + " cannot be found in the navigation graph " + this.c);
            }
        }
    }

    public final d a(int i, Bundle bundle) {
        this.d.add(new a(i, bundle));
        if (this.c != null) {
            h();
        }
        return this;
    }

    public final ug8 b() {
        if (this.c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (this.d.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        c();
        ug8 c = ug8.j(this.a).c(new Intent(this.b));
        zq3.g(c, "create(context)\n        …rentStack(Intent(intent))");
        int n = c.n();
        for (int i = 0; i < n; i++) {
            Intent k = c.k(i);
            if (k != null) {
                k.putExtra("android-support-nav:controller:deepLinkIntent", this.b);
            }
        }
        return c;
    }

    public final d e(Bundle bundle) {
        this.e = bundle;
        this.b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public final d f(int i, Bundle bundle) {
        this.d.clear();
        this.d.add(new a(i, bundle));
        if (this.c != null) {
            h();
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(NavController navController) {
        this(navController.B());
        zq3.h(navController, "navController");
        this.c = navController.G();
    }
}
