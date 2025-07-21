package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import defpackage.pj9;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.UUID;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class CancelWorkRunnable$forId$1 extends Lambda implements qs2 {
    final /* synthetic */ UUID $id;
    final /* synthetic */ pj9 $workManagerImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelWorkRunnable$forId$1(pj9 pj9Var, UUID uuid) {
        super(0);
        this.$workManagerImpl = pj9Var;
        this.$id = uuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(pj9 pj9Var, UUID uuid) {
        String uuid2 = uuid.toString();
        zq3.g(uuid2, "id.toString()");
        CancelWorkRunnable.d(pj9Var, uuid2);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        m132invoke();
        return ww8.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m132invoke() {
        WorkDatabase u = this.$workManagerImpl.u();
        zq3.g(u, "workManagerImpl.workDatabase");
        final pj9 pj9Var = this.$workManagerImpl;
        final UUID uuid = this.$id;
        u.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.a
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable$forId$1.c(pj9.this, uuid);
            }
        });
        CancelWorkRunnable.k(this.$workManagerImpl);
    }
}
