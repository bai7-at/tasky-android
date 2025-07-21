package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import defpackage.ro8;
import defpackage.uj3;
import defpackage.vl6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {
    private static volatile a d;
    private static final Object e = new Object();
    public static final /* synthetic */ int f = 0;
    final Context c;
    final Set b = new HashSet();
    final Map a = new HashMap();

    a(Context context) {
        this.c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object obj;
        if (ro8.e()) {
            try {
                ro8.b(cls.getSimpleName());
            } catch (Throwable th) {
                ro8.d();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.a.containsKey(cls)) {
            obj = this.a.get(cls);
        } else {
            set.add(cls);
            try {
                uj3 uj3Var = (uj3) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = uj3Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!this.a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = uj3Var.b(this.c);
                set.remove(cls);
                this.a.put(cls, obj);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        ro8.d();
        return obj;
    }

    public static a e(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    void a() {
        try {
            try {
                ro8.b("Startup");
                b(this.c.getPackageManager().getProviderInfo(new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new StartupException(e2);
            }
        } finally {
            ro8.d();
        }
    }

    void b(Bundle bundle) {
        String string = this.c.getString(vl6.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (uj3.class.isAssignableFrom(cls)) {
                            this.b.add(cls);
                        }
                    }
                }
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    d((Class) it2.next(), hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    Object c(Class cls) {
        Object obj;
        synchronized (e) {
            try {
                obj = this.a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.b.contains(cls);
    }
}
