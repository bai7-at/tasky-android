package androidx.work.impl;

import android.content.Context;
import defpackage.kq8;
import defpackage.nt2;
import defpackage.rg8;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
/* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends FunctionReferenceImpl implements nt2 {
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 a = new WorkManagerImplExtKt$WorkManagerImpl$1();

    WorkManagerImplExtKt$WorkManagerImpl$1() {
        super(6, WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // defpackage.nt2
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final List a(Context context, androidx.work.a aVar, rg8 rg8Var, WorkDatabase workDatabase, kq8 kq8Var, a aVar2) {
        List b;
        zq3.h(context, "p0");
        zq3.h(aVar, "p1");
        zq3.h(rg8Var, "p2");
        zq3.h(workDatabase, "p3");
        zq3.h(kq8Var, "p4");
        zq3.h(aVar2, "p5");
        b = WorkManagerImplExtKt.b(context, aVar, rg8Var, workDatabase, kq8Var, aVar2);
        return b;
    }
}
