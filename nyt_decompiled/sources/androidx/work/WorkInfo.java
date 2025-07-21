package androidx.work;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.gv0;
import defpackage.zq3;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class WorkInfo {
    public static final a m = new a(null);
    private final UUID a;
    private final State b;
    private final Set c;
    private final Data d;
    private final Data e;
    private final int f;
    private final int g;
    private final gv0 h;
    private final long i;
    private final b j;
    private final long k;
    private final int l;

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {
        private final long a;
        private final long b;

        public b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !zq3.c(b.class, obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a == this.a && bVar.b == this.b;
        }

        public int hashCode() {
            return (Long.hashCode(this.a) * 31) + Long.hashCode(this.b);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
        }
    }

    public WorkInfo(UUID uuid, State state, Set set, Data data, Data data2, int i, int i2, gv0 gv0Var, long j, b bVar, long j2, int i3) {
        zq3.h(uuid, "id");
        zq3.h(state, TransferTable.COLUMN_STATE);
        zq3.h(set, "tags");
        zq3.h(data, "outputData");
        zq3.h(data2, "progress");
        zq3.h(gv0Var, "constraints");
        this.a = uuid;
        this.b = state;
        this.c = set;
        this.d = data;
        this.e = data2;
        this.f = i;
        this.g = i2;
        this.h = gv0Var;
        this.i = j;
        this.j = bVar;
        this.k = j2;
        this.l = i3;
    }

    public final State a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zq3.c(WorkInfo.class, obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f == workInfo.f && this.g == workInfo.g && zq3.c(this.a, workInfo.a) && this.b == workInfo.b && zq3.c(this.d, workInfo.d) && zq3.c(this.h, workInfo.h) && this.i == workInfo.i && zq3.c(this.j, workInfo.j) && this.k == workInfo.k && this.l == workInfo.l && zq3.c(this.c, workInfo.c)) {
            return zq3.c(this.e, workInfo.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g) * 31) + this.h.hashCode()) * 31) + Long.hashCode(this.i)) * 31;
        b bVar = this.j;
        return ((((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31) + Long.hashCode(this.k)) * 31) + Integer.hashCode(this.l);
    }

    public String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
