package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.navigation.NavBackStackEntry;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.aa7;
import defpackage.c04;
import defpackage.d44;
import defpackage.qs2;
import defpackage.r25;
import defpackage.sa9;
import defpackage.t21;
import defpackage.xx4;
import defpackage.z97;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class NavBackStackEntry implements d44, sa9, androidx.lifecycle.d, aa7 {
    public static final a r = new a(null);
    private final Context a;
    private NavDestination b;
    private final Bundle c;
    private Lifecycle.State d;
    private final r25 e;
    private final String f;
    private final Bundle g;
    private androidx.lifecycle.h h;
    private final z97 i;
    private boolean j;
    private final c04 k;
    private final c04 l;
    private Lifecycle.State m;
    private final t.b n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ NavBackStackEntry b(a aVar, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, r25 r25Var, String str, Bundle bundle2, int i, Object obj) {
            String str2;
            Bundle bundle3 = (i & 4) != 0 ? null : bundle;
            Lifecycle.State state2 = (i & 8) != 0 ? Lifecycle.State.CREATED : state;
            r25 r25Var2 = (i & 16) != 0 ? null : r25Var;
            if ((i & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                zq3.g(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            return aVar.a(context, navDestination, bundle3, state2, r25Var2, str2, (i & 64) != 0 ? null : bundle2);
        }

        public final NavBackStackEntry a(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, r25 r25Var, String str, Bundle bundle2) {
            zq3.h(navDestination, "destination");
            zq3.h(state, "hostLifecycleState");
            zq3.h(str, "id");
            return new NavBackStackEntry(context, navDestination, bundle, state, r25Var, str, bundle2, null);
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends androidx.lifecycle.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(aa7 aa7Var) {
            super(aa7Var, null);
            zq3.h(aa7Var, "owner");
        }

        @Override // androidx.lifecycle.a
        protected q e(String str, Class cls, n nVar) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(cls, "modelClass");
            zq3.h(nVar, "handle");
            return new c(nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends q {
        private final n a;

        public c(n nVar) {
            zq3.h(nVar, "handle");
            this.a = nVar;
        }

        public final n e() {
            return this.a;
        }
    }

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, r25 r25Var, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, navDestination, bundle, state, r25Var, str, bundle2);
    }

    private final o d() {
        return (o) this.k.getValue();
    }

    public final Bundle c() {
        if (this.c == null) {
            return null;
        }
        return new Bundle(this.c);
    }

    public final NavDestination e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof NavBackStackEntry)) {
            return false;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (!zq3.c(this.f, navBackStackEntry.f) || !zq3.c(this.b, navBackStackEntry.b) || !zq3.c(getLifecycle(), navBackStackEntry.getLifecycle()) || !zq3.c(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
            return false;
        }
        if (!zq3.c(this.c, navBackStackEntry.c)) {
            Bundle bundle = this.c;
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    Object obj2 = this.c.get(str);
                    Bundle bundle2 = navBackStackEntry.c;
                    if (!zq3.c(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final String f() {
        return this.f;
    }

    public final Lifecycle.State g() {
        return this.m;
    }

    @Override // androidx.lifecycle.d
    public t21 getDefaultViewModelCreationExtras() {
        xx4 xx4Var = new xx4(null, 1, null);
        Context context = this.a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            xx4Var.c(t.a.h, application);
        }
        xx4Var.c(SavedStateHandleSupport.a, this);
        xx4Var.c(SavedStateHandleSupport.b, this);
        Bundle c2 = c();
        if (c2 != null) {
            xx4Var.c(SavedStateHandleSupport.c, c2);
        }
        return xx4Var;
    }

    @Override // androidx.lifecycle.d
    public t.b getDefaultViewModelProviderFactory() {
        return this.n;
    }

    @Override // defpackage.d44
    public Lifecycle getLifecycle() {
        return this.h;
    }

    @Override // defpackage.aa7
    public androidx.savedstate.a getSavedStateRegistry() {
        return this.i.b();
    }

    @Override // defpackage.sa9
    public u getViewModelStore() {
        if (!this.j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (getLifecycle().b() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        r25 r25Var = this.e;
        if (r25Var != null) {
            return r25Var.b(this.f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final void h(Lifecycle.Event event) {
        zq3.h(event, "event");
        this.d = event.getTargetState();
        l();
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = (this.f.hashCode() * 31) + this.b.hashCode();
        Bundle bundle = this.c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it2 = keySet.iterator();
            while (it2.hasNext()) {
                int i = hashCode * 31;
                Object obj = this.c.get((String) it2.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((hashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final void i(Bundle bundle) {
        zq3.h(bundle, "outBundle");
        this.i.e(bundle);
    }

    public final void j(NavDestination navDestination) {
        zq3.h(navDestination, "<set-?>");
        this.b = navDestination;
    }

    public final void k(Lifecycle.State state) {
        zq3.h(state, "maxState");
        this.m = state;
        l();
    }

    public final void l() {
        if (!this.j) {
            this.i.c();
            this.j = true;
            if (this.e != null) {
                SavedStateHandleSupport.c(this);
            }
            this.i.d(this.g);
        }
        if (this.d.ordinal() < this.m.ordinal()) {
            this.h.n(this.d);
        } else {
            this.h.n(this.m);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavBackStackEntry.class.getSimpleName());
        sb.append('(' + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        String sb2 = sb.toString();
        zq3.g(sb2, "sb.toString()");
        return sb2;
    }

    private NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, r25 r25Var, String str, Bundle bundle2) {
        this.a = context;
        this.b = navDestination;
        this.c = bundle;
        this.d = state;
        this.e = r25Var;
        this.f = str;
        this.g = bundle2;
        this.h = new androidx.lifecycle.h(this);
        this.i = z97.d.a(this);
        this.k = kotlin.c.a(new qs2() { // from class: androidx.navigation.NavBackStackEntry$defaultFactory$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o mo865invoke() {
                Context context2;
                context2 = NavBackStackEntry.this.a;
                Context applicationContext = context2 != null ? context2.getApplicationContext() : null;
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                NavBackStackEntry navBackStackEntry = NavBackStackEntry.this;
                return new o(application, navBackStackEntry, navBackStackEntry.c());
            }
        });
        this.l = kotlin.c.a(new qs2() { // from class: androidx.navigation.NavBackStackEntry$savedStateHandle$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n mo865invoke() {
                boolean z;
                z = NavBackStackEntry.this.j;
                if (!z) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (NavBackStackEntry.this.getLifecycle().b() != Lifecycle.State.DESTROYED) {
                    return ((NavBackStackEntry.c) new t(NavBackStackEntry.this, new NavBackStackEntry.b(NavBackStackEntry.this)).a(NavBackStackEntry.c.class)).e();
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            }
        });
        this.m = Lifecycle.State.INITIALIZED;
        this.n = d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle) {
        this(navBackStackEntry.a, navBackStackEntry.b, bundle, navBackStackEntry.d, navBackStackEntry.e, navBackStackEntry.f, navBackStackEntry.g);
        zq3.h(navBackStackEntry, "entry");
        this.d = navBackStackEntry.d;
        k(navBackStackEntry.m);
    }
}
