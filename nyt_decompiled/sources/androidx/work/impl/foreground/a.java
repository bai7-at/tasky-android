package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.a;
import defpackage.dk9;
import defpackage.ej9;
import defpackage.h94;
import defpackage.ik9;
import defpackage.n62;
import defpackage.oe5;
import defpackage.pj9;
import defpackage.rg8;
import defpackage.wo2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public class a implements oe5, n62 {
    static final String k = h94.i("SystemFgDispatcher");
    private Context a;
    private pj9 b;
    private final rg8 c;
    final Object d = new Object();
    ej9 e;
    final Map f;
    final Map g;
    final Map h;
    final WorkConstraintsTracker i;
    private b j;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC0125a implements Runnable {
        final /* synthetic */ String a;

        RunnableC0125a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            dk9 g = a.this.b.r().g(this.a);
            if (g == null || !g.l()) {
                return;
            }
            synchronized (a.this.d) {
                a.this.g.put(ik9.a(g), g);
                a aVar = a.this;
                a.this.h.put(ik9.a(g), WorkConstraintsTrackerKt.d(aVar.i, g, aVar.c.b(), a.this));
            }
        }
    }

    interface b {
        void a(int i, Notification notification);

        void c(int i, int i2, Notification notification);

        void d(int i);

        void stop();
    }

    a(Context context) {
        this.a = context;
        pj9 p = pj9.p(context);
        this.b = p;
        this.c = p.v();
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashMap();
        this.g = new HashMap();
        this.i = new WorkConstraintsTracker(this.b.t());
        this.b.r().e(this);
    }

    public static Intent d(Context context, ej9 ej9Var, wo2 wo2Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", wo2Var.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", wo2Var.a());
        intent.putExtra("KEY_NOTIFICATION", wo2Var.b());
        intent.putExtra("KEY_WORKSPEC_ID", ej9Var.b());
        intent.putExtra("KEY_GENERATION", ej9Var.a());
        return intent;
    }

    public static Intent f(Context context, ej9 ej9Var, wo2 wo2Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", ej9Var.b());
        intent.putExtra("KEY_GENERATION", ej9Var.a());
        intent.putExtra("KEY_NOTIFICATION_ID", wo2Var.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", wo2Var.a());
        intent.putExtra("KEY_NOTIFICATION", wo2Var.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        h94.e().f(k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.b.l(UUID.fromString(stringExtra));
    }

    private void i(Intent intent) {
        if (this.j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        ej9 ej9Var = new ej9(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        h94.e().a(k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        wo2 wo2Var = new wo2(intExtra, notification, intExtra2);
        this.f.put(ej9Var, wo2Var);
        wo2 wo2Var2 = (wo2) this.f.get(this.e);
        if (wo2Var2 == null) {
            this.e = ej9Var;
        } else {
            this.j.a(intExtra, notification);
            Iterator it2 = this.f.entrySet().iterator();
            while (it2.hasNext()) {
                i |= ((wo2) ((Map.Entry) it2.next()).getValue()).a();
            }
            wo2Var = new wo2(wo2Var2.c(), wo2Var2.b(), i);
        }
        this.j.c(wo2Var.c(), wo2Var.a(), wo2Var.b());
    }

    private void j(Intent intent) {
        h94.e().f(k, "Started foreground service " + intent);
        this.c.d(new RunnableC0125a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // defpackage.n62
    public void a(ej9 ej9Var, boolean z) {
        Map.Entry entry;
        synchronized (this.d) {
            try {
                Job job = ((dk9) this.g.remove(ej9Var)) != null ? (Job) this.h.remove(ej9Var) : null;
                if (job != null) {
                    job.cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wo2 wo2Var = (wo2) this.f.remove(ej9Var);
        if (ej9Var.equals(this.e)) {
            if (this.f.size() > 0) {
                Iterator it2 = this.f.entrySet().iterator();
                Object next = it2.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        next = it2.next();
                    }
                }
                this.e = (ej9) entry.getKey();
                if (this.j != null) {
                    wo2 wo2Var2 = (wo2) entry.getValue();
                    this.j.c(wo2Var2.c(), wo2Var2.a(), wo2Var2.b());
                    this.j.d(wo2Var2.c());
                }
            } else {
                this.e = null;
            }
        }
        b bVar = this.j;
        if (wo2Var == null || bVar == null) {
            return;
        }
        h94.e().a(k, "Removing Notification (id: " + wo2Var.c() + ", workSpecId: " + ej9Var + ", notificationType: " + wo2Var.a());
        bVar.d(wo2Var.c());
    }

    @Override // defpackage.oe5
    public void e(dk9 dk9Var, androidx.work.impl.constraints.a aVar) {
        if (aVar instanceof a.b) {
            String str = dk9Var.a;
            h94.e().a(k, "Constraints unmet for WorkSpec " + str);
            this.b.A(ik9.a(dk9Var), ((a.b) aVar).a());
        }
    }

    void k(Intent intent) {
        h94.e().f(k, "Stopping foreground service");
        b bVar = this.j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void l() {
        this.j = null;
        synchronized (this.d) {
            try {
                Iterator it2 = this.h.values().iterator();
                while (it2.hasNext()) {
                    ((Job) it2.next()).cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.r().p(this);
    }

    void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    void n(int i, int i2) {
        h94.e().f(k, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.f.entrySet()) {
            if (((wo2) entry.getValue()).a() == i2) {
                this.b.A((ej9) entry.getKey(), -128);
            }
        }
        b bVar = this.j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void o(b bVar) {
        if (this.j != null) {
            h94.e().c(k, "A callback already exists.");
        } else {
            this.j = bVar;
        }
    }
}
