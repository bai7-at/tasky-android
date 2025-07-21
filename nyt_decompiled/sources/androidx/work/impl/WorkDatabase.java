package androidx.work.impl;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import defpackage.ar2;
import defpackage.au4;
import defpackage.bu4;
import defpackage.cu4;
import defpackage.du4;
import defpackage.ek9;
import defpackage.el0;
import defpackage.eu4;
import defpackage.fu4;
import defpackage.gu4;
import defpackage.kk9;
import defpackage.l16;
import defpackage.le8;
import defpackage.mm1;
import defpackage.sj9;
import defpackage.tc8;
import defpackage.uj9;
import defpackage.xj9;
import defpackage.xt4;
import defpackage.xy6;
import defpackage.yt4;
import defpackage.zl0;
import defpackage.zq3;
import defpackage.zt4;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends RoomDatabase {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tc8 c(Context context, tc8.b bVar) {
            zq3.h(bVar, "configuration");
            tc8.b.a a = tc8.b.f.a(context);
            a.d(bVar.b).c(bVar.c).e(true).a(true);
            return new ar2().a(a.b());
        }

        public final WorkDatabase b(final Context context, Executor executor, zl0 zl0Var, boolean z) {
            zq3.h(context, "context");
            zq3.h(executor, "queryExecutor");
            zq3.h(zl0Var, "clock");
            return (WorkDatabase) (z ? androidx.room.f.c(context, WorkDatabase.class).c() : androidx.room.f.a(context, WorkDatabase.class, "androidx.work.workdb").h(new tc8.c() { // from class: yi9
                @Override // tc8.c
                public final tc8 a(tc8.b bVar) {
                    tc8 c;
                    c = WorkDatabase.a.c(context, bVar);
                    return c;
                }
            })).i(executor).a(new el0(zl0Var)).b(bu4.a).b(new xy6(context, 2, 3)).b(cu4.a).b(du4.a).b(new xy6(context, 5, 6)).b(eu4.a).b(fu4.a).b(gu4.a).b(new sj9(context)).b(new xy6(context, 10, 11)).b(xt4.a).b(yt4.a).b(zt4.a).b(au4.a).b(new xy6(context, 21, 22)).e().d();
        }

        private a() {
        }
    }

    public abstract mm1 d();

    public abstract l16 e();

    public abstract le8 f();

    public abstract uj9 g();

    public abstract xj9 h();

    public abstract ek9 i();

    public abstract kk9 j();
}
