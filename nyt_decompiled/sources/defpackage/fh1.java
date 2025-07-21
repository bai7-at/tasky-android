package defpackage;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.c;
import com.nytimes.android.eventtracker.worker.FlushEventBufferWorker;
import defpackage.gv0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class fh1 implements z32 {
    private final Context a;
    private final long b;
    private final TimeUnit c;

    public fh1(Context context, long j, TimeUnit timeUnit) {
        zq3.h(context, "context");
        zq3.h(timeUnit, "intervalUnit");
        this.a = context;
        this.b = j;
        this.c = timeUnit;
    }

    private final c d() {
        return (c) ((c.a) ((c.a) ((c.a) new c.a(FlushEventBufferWorker.class).l(this.b, this.c)).m(new Data.a().e("com.nytimes.android.eventtracker.worker.ET-RESCHEDULE", true).a())).j(new gv0.a().b(NetworkType.CONNECTED).a())).b();
    }

    @Override // defpackage.z32
    public void a() {
        mj9.a.a(this.a).e("com.nytimes.android.eventtracker.worker.ET-WORKER-FLUSH", ExistingWorkPolicy.REPLACE, d());
        ul8.a.z("ET2").t("Upload Job rescheduled in " + this.b + " " + this.c.name(), new Object[0]);
    }

    @Override // defpackage.z32
    public void b() {
        ul8.a.z("ET2").t("Stopping Upload Job, will execute once more", new Object[0]);
        mj9.a.a(this.a).e("com.nytimes.android.eventtracker.worker.ET-WORKER-FLUSH", ExistingWorkPolicy.REPLACE, (c) ((c.a) ((c.a) new c.a(FlushEventBufferWorker.class).l(this.b, this.c)).m(new Data.a().e("com.nytimes.android.eventtracker.worker.ET-RESCHEDULE", false).a())).b());
    }

    @Override // defpackage.z32
    public void c() {
        ul8.a.z("ET2").t("Removing Upload Job", new Object[0]);
        mj9.a.a(this.a).b("com.nytimes.android.eventtracker.worker.ET-WORKER-FLUSH");
    }
}
