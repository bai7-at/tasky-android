package defpackage;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public class ak9 implements x46 {
    static final String c = h94.i("WorkProgressUpdater");
    final WorkDatabase a;
    final rg8 b;

    public ak9(WorkDatabase workDatabase, rg8 rg8Var) {
        this.a = workDatabase;
        this.b = rg8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void c(UUID uuid, Data data) {
        String uuid2 = uuid.toString();
        h94 e = h94.e();
        String str = c;
        e.a(str, "Updating progress for " + uuid + " (" + data + ")");
        this.a.beginTransaction();
        try {
            dk9 h = this.a.i().h(uuid2);
            if (h == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (h.b == WorkInfo.State.RUNNING) {
                this.a.h().b(new wj9(uuid2, data));
            } else {
                h94.e().k(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
            }
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
            return null;
        } catch (Throwable th) {
            try {
                h94.e().d(c, "Error updating Worker progress", th);
                throw th;
            } catch (Throwable th2) {
                this.a.endTransaction();
                throw th2;
            }
        }
    }

    @Override // defpackage.x46
    public j64 a(Context context, final UUID uuid, final Data data) {
        return ListenableFutureKt.f(this.b.c(), "updateProgress", new qs2() { // from class: zj9
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                Void c2;
                c2 = ak9.this.c(uuid, data);
                return c2;
            }
        });
    }
}
