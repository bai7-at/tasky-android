package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import defpackage.ek7;
import defpackage.gb7;
import defpackage.k33;
import defpackage.kq8;
import defpackage.lj9;
import defpackage.nt2;
import defpackage.pj9;
import defpackage.rc6;
import defpackage.rg8;
import defpackage.rj9;
import defpackage.zq3;
import java.util.List;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public abstract class WorkManagerImplExtKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(Context context, androidx.work.a aVar, rg8 rg8Var, WorkDatabase workDatabase, kq8 kq8Var, a aVar2) {
        gb7 c = b.c(context, workDatabase, aVar);
        zq3.g(c, "createBestAvailableBackg…kDatabase, configuration)");
        return kotlin.collections.i.o(c, new k33(context, aVar, kq8Var, aVar2, new lj9(aVar2, rg8Var), rg8Var));
    }

    public static final pj9 c(Context context, androidx.work.a aVar) {
        zq3.h(context, "context");
        zq3.h(aVar, "configuration");
        return e(context, aVar, null, null, null, null, null, 124, null);
    }

    public static final pj9 d(Context context, androidx.work.a aVar, rg8 rg8Var, WorkDatabase workDatabase, kq8 kq8Var, a aVar2, nt2 nt2Var) {
        zq3.h(context, "context");
        zq3.h(aVar, "configuration");
        zq3.h(rg8Var, "workTaskExecutor");
        zq3.h(workDatabase, "workDatabase");
        zq3.h(kq8Var, "trackers");
        zq3.h(aVar2, "processor");
        zq3.h(nt2Var, "schedulersCreator");
        return new pj9(context.getApplicationContext(), aVar, rg8Var, workDatabase, (List) nt2Var.a(context, aVar, rg8Var, workDatabase, kq8Var, aVar2), aVar2, kq8Var);
    }

    public static /* synthetic */ pj9 e(Context context, androidx.work.a aVar, rg8 rg8Var, WorkDatabase workDatabase, kq8 kq8Var, a aVar2, nt2 nt2Var, int i, Object obj) {
        WorkDatabase workDatabase2;
        kq8 kq8Var2;
        rg8 rj9Var = (i & 4) != 0 ? new rj9(aVar.m()) : rg8Var;
        if ((i & 8) != 0) {
            WorkDatabase.a aVar3 = WorkDatabase.a;
            Context applicationContext = context.getApplicationContext();
            zq3.g(applicationContext, "context.applicationContext");
            ek7 c = rj9Var.c();
            zq3.g(c, "workTaskExecutor.serialTaskExecutor");
            workDatabase2 = aVar3.b(applicationContext, c, aVar.a(), context.getResources().getBoolean(rc6.workmanager_test_configuration));
        } else {
            workDatabase2 = workDatabase;
        }
        if ((i & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            zq3.g(applicationContext2, "context.applicationContext");
            kq8Var2 = new kq8(applicationContext2, rj9Var, null, null, null, null, 60, null);
        } else {
            kq8Var2 = kq8Var;
        }
        return d(context, aVar, rj9Var, workDatabase2, kq8Var2, (i & 32) != 0 ? new a(context.getApplicationContext(), aVar, rj9Var, workDatabase2) : aVar2, (i & 64) != 0 ? WorkManagerImplExtKt$WorkManagerImpl$1.a : nt2Var);
    }

    public static final CoroutineScope f(rg8 rg8Var) {
        zq3.h(rg8Var, "taskExecutor");
        CoroutineDispatcher b = rg8Var.b();
        zq3.g(b, "taskExecutor.taskCoroutineDispatcher");
        return CoroutineScopeKt.CoroutineScope(b);
    }
}
