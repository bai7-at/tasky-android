package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.external.store3.base.RecordState;
import com.nytimes.android.logging.NYTLogger;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class ef2 implements js5, jt6, jl0 {
    private final ve2 a;
    private final bq5 b;
    private final long c;
    private final TimeUnit d;
    private final y82 e;
    private final a92 f;

    public ef2(ve2 ve2Var, bq5 bq5Var, long j, TimeUnit timeUnit) {
        zq3.h(ve2Var, "fileSystem");
        zq3.h(bq5Var, "pathResolver");
        zq3.h(timeUnit, "expirationUnit");
        this.a = ve2Var;
        this.b = bq5Var;
        this.c = j;
        this.d = timeUnit;
        this.e = new y82(ve2Var, bq5Var);
        this.f = new a92(ve2Var, bq5Var);
    }

    @Override // defpackage.jl0
    public void clear(Object obj) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        try {
            String a = this.b.a(obj);
            zq3.g(a, "resolve(...)");
            if (this.a.d(a)) {
                this.a.a(a);
            }
        } catch (IOException e) {
            NYTLogger.i(e, "Error deleting item with key: " + obj, new Object[0]);
        }
    }

    @Override // defpackage.js5
    public Maybe d(Object obj) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        Maybe c = this.e.c(obj);
        zq3.g(c, "read(...)");
        return c;
    }

    @Override // defpackage.jt6
    public RecordState e(Object obj) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        RecordState f = this.a.f(this.d, this.c, this.b.a(obj));
        zq3.g(f, "getRecordState(...)");
        return f;
    }

    @Override // defpackage.js5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Single b(Object obj, sd0 sd0Var) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        zq3.h(sd0Var, "bufferedSource");
        Single c = this.f.c(obj, sd0Var);
        zq3.g(c, "write(...)");
        return c;
    }
}
