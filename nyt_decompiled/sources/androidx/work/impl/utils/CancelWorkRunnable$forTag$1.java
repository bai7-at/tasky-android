package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import defpackage.pj9;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class CancelWorkRunnable$forTag$1 extends Lambda implements qs2 {
    final /* synthetic */ String $tag;
    final /* synthetic */ pj9 $workManagerImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelWorkRunnable$forTag$1(pj9 pj9Var, String str) {
        super(0);
        this.$workManagerImpl = pj9Var;
        this.$tag = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(WorkDatabase workDatabase, String str, pj9 pj9Var) {
        Iterator it2 = workDatabase.i().k(str).iterator();
        while (it2.hasNext()) {
            CancelWorkRunnable.d(pj9Var, (String) it2.next());
        }
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        m134invoke();
        return ww8.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m134invoke() {
        final WorkDatabase u = this.$workManagerImpl.u();
        zq3.g(u, "workManagerImpl.workDatabase");
        final String str = this.$tag;
        final pj9 pj9Var = this.$workManagerImpl;
        u.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.b
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable$forTag$1.c(WorkDatabase.this, str, pj9Var);
            }
        });
        CancelWorkRunnable.k(this.$workManagerImpl);
    }
}
