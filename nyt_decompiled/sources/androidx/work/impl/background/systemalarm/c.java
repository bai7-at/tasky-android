package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import defpackage.dk9;
import defpackage.h94;
import defpackage.ik9;
import defpackage.zl0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class c {
    private static final String f = h94.i("ConstraintsCmdHandler");
    private final Context a;
    private final zl0 b;
    private final int c;
    private final e d;
    private final WorkConstraintsTracker e;

    c(Context context, zl0 zl0Var, int i, e eVar) {
        this.a = context;
        this.b = zl0Var;
        this.c = i;
        this.d = eVar;
        this.e = new WorkConstraintsTracker(eVar.g().t());
    }

    void a() {
        List<dk9> e = this.d.g().u().i().e();
        ConstraintProxy.a(this.a, e);
        ArrayList<dk9> arrayList = new ArrayList(e.size());
        long currentTimeMillis = this.b.currentTimeMillis();
        for (dk9 dk9Var : e) {
            if (currentTimeMillis >= dk9Var.c() && (!dk9Var.l() || this.e.a(dk9Var))) {
                arrayList.add(dk9Var);
            }
        }
        for (dk9 dk9Var2 : arrayList) {
            String str = dk9Var2.a;
            Intent c = b.c(this.a, ik9.a(dk9Var2));
            h94.e().a(f, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.d.f().a().execute(new e.b(this.d, c, this.c));
        }
    }
}
