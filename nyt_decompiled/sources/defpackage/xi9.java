package defpackage;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class xi9 extends vi9 {
    private static final String j = h94.i("WorkContinuationImpl");
    private final pj9 a;
    private final String b;
    private final ExistingWorkPolicy c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private boolean h;
    private hi5 i;

    public xi9(pj9 pj9Var, List list) {
        this(pj9Var, null, ExistingWorkPolicy.KEEP, list, null);
    }

    private static boolean j(xi9 xi9Var, Set set) {
        set.addAll(xi9Var.d());
        Set n = n(xi9Var);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (n.contains((String) it2.next())) {
                return true;
            }
        }
        List f = xi9Var.f();
        if (f != null && !f.isEmpty()) {
            Iterator it3 = f.iterator();
            while (it3.hasNext()) {
                if (j((xi9) it3.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(xi9Var.d());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ww8 l() {
        r12.b(this);
        return ww8.a;
    }

    public static Set n(xi9 xi9Var) {
        HashSet hashSet = new HashSet();
        List f = xi9Var.f();
        if (f != null && !f.isEmpty()) {
            Iterator it2 = f.iterator();
            while (it2.hasNext()) {
                hashSet.addAll(((xi9) it2.next()).d());
            }
        }
        return hashSet;
    }

    public hi5 b() {
        if (this.h) {
            h94.e().k(j, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            this.i = pi5.c(this.a.n().n(), "EnqueueRunnable_" + c().name(), this.a.v().c(), new qs2() { // from class: wi9
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Object mo865invoke() {
                    ww8 l;
                    l = xi9.this.l();
                    return l;
                }
            });
        }
        return this.i;
    }

    public ExistingWorkPolicy c() {
        return this.c;
    }

    public List d() {
        return this.e;
    }

    public String e() {
        return this.b;
    }

    public List f() {
        return this.g;
    }

    public List g() {
        return this.d;
    }

    public pj9 h() {
        return this.a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.h;
    }

    public void m() {
        this.h = true;
    }

    public xi9(pj9 pj9Var, String str, ExistingWorkPolicy existingWorkPolicy, List list) {
        this(pj9Var, str, existingWorkPolicy, list, null);
    }

    public xi9(pj9 pj9Var, String str, ExistingWorkPolicy existingWorkPolicy, List list, List list2) {
        this.a = pj9Var;
        this.b = str;
        this.c = existingWorkPolicy;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                this.f.addAll(((xi9) it2.next()).f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (existingWorkPolicy == ExistingWorkPolicy.REPLACE && ((d) list.get(i)).d().g() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String b = ((d) list.get(i)).b();
            this.e.add(b);
            this.f.add(b);
        }
    }
}
