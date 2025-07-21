package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import defpackage.dk9;
import defpackage.ej9;
import defpackage.h94;
import defpackage.n62;
import defpackage.q08;
import defpackage.r08;
import defpackage.zl0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements n62 {
    private static final String f = h94.i("CommandHandler");
    private final Context a;
    private final Map b = new HashMap();
    private final Object c = new Object();
    private final zl0 d;
    private final r08 e;

    b(Context context, zl0 zl0Var, r08 r08Var) {
        this.a = context;
        this.d = zl0Var;
        this.e = r08Var;
    }

    static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, ej9 ej9Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, ej9Var);
    }

    static Intent d(Context context, ej9 ej9Var, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return q(intent, ej9Var);
    }

    static Intent e(Context context, ej9 ej9Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, ej9Var);
    }

    static Intent f(Context context, ej9 ej9Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, ej9Var);
    }

    private void g(Intent intent, int i, e eVar) {
        h94.e().a(f, "Handling constraints changed " + intent);
        new c(this.a, this.d, i, eVar).a();
    }

    private void h(Intent intent, int i, e eVar) {
        synchronized (this.c) {
            try {
                ej9 p = p(intent);
                h94 e = h94.e();
                String str = f;
                e.a(str, "Handing delay met for " + p);
                if (this.b.containsKey(p)) {
                    h94.e().a(str, "WorkSpec " + p + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    d dVar = new d(this.a, i, eVar, this.e.f(p));
                    this.b.put(p, dVar);
                    dVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i(Intent intent, int i) {
        ej9 p = p(intent);
        boolean z = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        h94.e().a(f, "Handling onExecutionCompleted " + intent + ", " + i);
        a(p, z);
    }

    private void j(Intent intent, int i, e eVar) {
        h94.e().a(f, "Handling reschedule " + intent + ", " + i);
        eVar.g().y();
    }

    private void k(Intent intent, int i, e eVar) {
        ej9 p = p(intent);
        h94 e = h94.e();
        String str = f;
        e.a(str, "Handling schedule work for " + p);
        WorkDatabase u = eVar.g().u();
        u.beginTransaction();
        try {
            dk9 h = u.i().h(p.b());
            if (h == null) {
                h94.e().k(str, "Skipping scheduling " + p + " because it's no longer in the DB");
                return;
            }
            if (h.b.isFinished()) {
                h94.e().k(str, "Skipping scheduling " + p + "because it is finished.");
                return;
            }
            long c = h.c();
            if (h.l()) {
                h94.e().a(str, "Opportunistically setting an alarm for " + p + "at " + c);
                a.c(this.a, u, p, c);
                eVar.f().a().execute(new e.b(eVar, b(this.a), i));
            } else {
                h94.e().a(str, "Setting up Alarms for " + p + "at " + c);
                a.c(this.a, u, p, c);
            }
            u.setTransactionSuccessful();
        } finally {
            u.endTransaction();
        }
    }

    private void l(Intent intent, e eVar) {
        List<q08> remove;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i = extras.getInt("KEY_WORKSPEC_GENERATION");
            remove = new ArrayList(1);
            q08 c = this.e.c(new ej9(string, i));
            if (c != null) {
                remove.add(c);
            }
        } else {
            remove = this.e.remove(string);
        }
        for (q08 q08Var : remove) {
            h94.e().a(f, "Handing stopWork work for " + string);
            eVar.i().a(q08Var);
            a.a(this.a, eVar.g().u(), q08Var.a());
            eVar.a(q08Var.a(), false);
        }
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static ej9 p(Intent intent) {
        return new ej9(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, ej9 ej9Var) {
        intent.putExtra("KEY_WORKSPEC_ID", ej9Var.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", ej9Var.a());
        return intent;
    }

    @Override // defpackage.n62
    public void a(ej9 ej9Var, boolean z) {
        synchronized (this.c) {
            try {
                d dVar = (d) this.b.remove(ej9Var);
                this.e.c(ej9Var);
                if (dVar != null) {
                    dVar.g(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean n() {
        boolean z;
        synchronized (this.c) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    void o(Intent intent, int i, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i, eVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            h94.e().c(f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, eVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i);
            return;
        }
        h94.e().k(f, "Ignoring intent " + intent);
    }
}
