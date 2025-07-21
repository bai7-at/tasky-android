package defpackage;

import androidx.work.BackoffPolicy;
import androidx.work.Data;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class dk9 {
    public static final rt2 A;
    public static final a y = new a(null);
    private static final String z;
    public final String a;
    public WorkInfo.State b;
    public String c;
    public String d;
    public Data e;
    public Data f;
    public long g;
    public long h;
    public long i;
    public gv0 j;
    public int k;
    public BackoffPolicy l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public OutOfQuotaPolicy r;
    private int s;
    private final int t;
    private long u;
    private int v;
    private final int w;
    private String x;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(boolean z, int i, BackoffPolicy backoffPolicy, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
            zq3.h(backoffPolicy, "backoffPolicy");
            if (j6 != Long.MAX_VALUE && z2) {
                return i2 == 0 ? j6 : uo6.e(j6, 900000 + j2);
            }
            if (z) {
                return j2 + uo6.j(backoffPolicy == BackoffPolicy.LINEAR ? i * j : (long) Math.scalb(j, i - 1), 18000000L);
            }
            if (!z2) {
                if (j2 == -1) {
                    return Long.MAX_VALUE;
                }
                return j2 + j3;
            }
            long j7 = i2 == 0 ? j2 + j3 : j2 + j5;
            if (j4 != j5 && i2 == 0) {
                j7 += j5 - j4;
            }
            return j7;
        }

        private a() {
        }
    }

    public static final class b {
        public String a;
        public WorkInfo.State b;

        public b(String str, WorkInfo.State state) {
            zq3.h(str, "id");
            zq3.h(state, TransferTable.COLUMN_STATE);
            this.a = str;
            this.b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
        }
    }

    public static final class c {
        private final String a;
        private final WorkInfo.State b;
        private final Data c;
        private final long d;
        private final long e;
        private final long f;
        private final gv0 g;
        private final int h;
        private BackoffPolicy i;
        private long j;
        private long k;
        private int l;
        private final int m;
        private final long n;
        private final int o;
        private final List p;
        private final List q;

        public c(String str, WorkInfo.State state, Data data, long j, long j2, long j3, gv0 gv0Var, int i, BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
            zq3.h(str, "id");
            zq3.h(state, TransferTable.COLUMN_STATE);
            zq3.h(data, "output");
            zq3.h(gv0Var, "constraints");
            zq3.h(backoffPolicy, "backoffPolicy");
            zq3.h(list, "tags");
            zq3.h(list2, "progress");
            this.a = str;
            this.b = state;
            this.c = data;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = gv0Var;
            this.h = i;
            this.i = backoffPolicy;
            this.j = j4;
            this.k = j5;
            this.l = i2;
            this.m = i3;
            this.n = j6;
            this.o = i4;
            this.p = list;
            this.q = list2;
        }

        private final long a() {
            if (this.b == WorkInfo.State.ENQUEUED) {
                return dk9.y.a(c(), this.h, this.i, this.j, this.k, this.l, d(), this.d, this.f, this.e, this.n);
            }
            return Long.MAX_VALUE;
        }

        private final WorkInfo.b b() {
            long j = this.e;
            if (j != 0) {
                return new WorkInfo.b(j, this.f);
            }
            return null;
        }

        public final boolean c() {
            return this.b == WorkInfo.State.ENQUEUED && this.h > 0;
        }

        public final boolean d() {
            return this.e != 0;
        }

        public final WorkInfo e() {
            Data data = !this.q.isEmpty() ? (Data) this.q.get(0) : Data.c;
            UUID fromString = UUID.fromString(this.a);
            zq3.g(fromString, "fromString(id)");
            return new WorkInfo(fromString, this.b, new HashSet(this.p), this.c, data, this.h, this.m, this.g, this.d, b(), a(), this.o);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && this.b == cVar.b && zq3.c(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && zq3.c(this.g, cVar.g) && this.h == cVar.h && this.i == cVar.i && this.j == cVar.j && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o && zq3.c(this.p, cVar.p) && zq3.c(this.q, cVar.q);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.e)) * 31) + Long.hashCode(this.f)) * 31) + this.g.hashCode()) * 31) + Integer.hashCode(this.h)) * 31) + this.i.hashCode()) * 31) + Long.hashCode(this.j)) * 31) + Long.hashCode(this.k)) * 31) + Integer.hashCode(this.l)) * 31) + Integer.hashCode(this.m)) * 31) + Long.hashCode(this.n)) * 31) + Integer.hashCode(this.o)) * 31) + this.p.hashCode()) * 31) + this.q.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
        }
    }

    static {
        String i = h94.i("WorkSpec");
        zq3.g(i, "tagWithPrefix(\"WorkSpec\")");
        z = i;
        A = new rt2() { // from class: ck9
            @Override // defpackage.rt2
            public final Object apply(Object obj) {
                List b2;
                b2 = dk9.b((List) obj);
                return b2;
            }
        };
    }

    public dk9(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, gv0 gv0Var, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4) {
        zq3.h(str, "id");
        zq3.h(state, TransferTable.COLUMN_STATE);
        zq3.h(str2, "workerClassName");
        zq3.h(str3, "inputMergerClassName");
        zq3.h(data, "input");
        zq3.h(data2, "output");
        zq3.h(gv0Var, "constraints");
        zq3.h(backoffPolicy, "backoffPolicy");
        zq3.h(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.a = str;
        this.b = state;
        this.c = str2;
        this.d = str3;
        this.e = data;
        this.f = data2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = gv0Var;
        this.k = i;
        this.l = backoffPolicy;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = outOfQuotaPolicy;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((c) it2.next()).e());
        }
        return arrayList;
    }

    public static /* synthetic */ dk9 e(dk9 dk9Var, String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, gv0 gv0Var, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4, int i6, Object obj) {
        String str5 = (i6 & 1) != 0 ? dk9Var.a : str;
        WorkInfo.State state2 = (i6 & 2) != 0 ? dk9Var.b : state;
        String str6 = (i6 & 4) != 0 ? dk9Var.c : str2;
        String str7 = (i6 & 8) != 0 ? dk9Var.d : str3;
        Data data3 = (i6 & 16) != 0 ? dk9Var.e : data;
        Data data4 = (i6 & 32) != 0 ? dk9Var.f : data2;
        long j9 = (i6 & 64) != 0 ? dk9Var.g : j;
        long j10 = (i6 & 128) != 0 ? dk9Var.h : j2;
        long j11 = (i6 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? dk9Var.i : j3;
        gv0 gv0Var2 = (i6 & 512) != 0 ? dk9Var.j : gv0Var;
        return dk9Var.d(str5, state2, str6, str7, data3, data4, j9, j10, j11, gv0Var2, (i6 & 1024) != 0 ? dk9Var.k : i, (i6 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? dk9Var.l : backoffPolicy, (i6 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? dk9Var.m : j4, (i6 & 8192) != 0 ? dk9Var.n : j5, (i6 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dk9Var.o : j6, (i6 & 32768) != 0 ? dk9Var.p : j7, (i6 & 65536) != 0 ? dk9Var.q : z2, (131072 & i6) != 0 ? dk9Var.r : outOfQuotaPolicy, (i6 & 262144) != 0 ? dk9Var.s : i2, (i6 & 524288) != 0 ? dk9Var.t : i3, (i6 & Constants.MB) != 0 ? dk9Var.u : j8, (i6 & 2097152) != 0 ? dk9Var.v : i4, (4194304 & i6) != 0 ? dk9Var.w : i5, (i6 & 8388608) != 0 ? dk9Var.x : str4);
    }

    public final long c() {
        return y.a(m(), this.k, this.l, this.m, this.n, this.s, n(), this.g, this.i, this.h, this.u);
    }

    public final dk9 d(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, gv0 gv0Var, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4) {
        zq3.h(str, "id");
        zq3.h(state, TransferTable.COLUMN_STATE);
        zq3.h(str2, "workerClassName");
        zq3.h(str3, "inputMergerClassName");
        zq3.h(data, "input");
        zq3.h(data2, "output");
        zq3.h(gv0Var, "constraints");
        zq3.h(backoffPolicy, "backoffPolicy");
        zq3.h(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new dk9(str, state, str2, str3, data, data2, j, j2, j3, gv0Var, i, backoffPolicy, j4, j5, j6, j7, z2, outOfQuotaPolicy, i2, i3, j8, i4, i5, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk9)) {
            return false;
        }
        dk9 dk9Var = (dk9) obj;
        return zq3.c(this.a, dk9Var.a) && this.b == dk9Var.b && zq3.c(this.c, dk9Var.c) && zq3.c(this.d, dk9Var.d) && zq3.c(this.e, dk9Var.e) && zq3.c(this.f, dk9Var.f) && this.g == dk9Var.g && this.h == dk9Var.h && this.i == dk9Var.i && zq3.c(this.j, dk9Var.j) && this.k == dk9Var.k && this.l == dk9Var.l && this.m == dk9Var.m && this.n == dk9Var.n && this.o == dk9Var.o && this.p == dk9Var.p && this.q == dk9Var.q && this.r == dk9Var.r && this.s == dk9Var.s && this.t == dk9Var.t && this.u == dk9Var.u && this.v == dk9Var.v && this.w == dk9Var.w && zq3.c(this.x, dk9Var.x);
    }

    public final int f() {
        return this.t;
    }

    public final long g() {
        return this.u;
    }

    public final int h() {
        return this.v;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Long.hashCode(this.g)) * 31) + Long.hashCode(this.h)) * 31) + Long.hashCode(this.i)) * 31) + this.j.hashCode()) * 31) + Integer.hashCode(this.k)) * 31) + this.l.hashCode()) * 31) + Long.hashCode(this.m)) * 31) + Long.hashCode(this.n)) * 31) + Long.hashCode(this.o)) * 31) + Long.hashCode(this.p)) * 31) + Boolean.hashCode(this.q)) * 31) + this.r.hashCode()) * 31) + Integer.hashCode(this.s)) * 31) + Integer.hashCode(this.t)) * 31) + Long.hashCode(this.u)) * 31) + Integer.hashCode(this.v)) * 31) + Integer.hashCode(this.w)) * 31;
        String str = this.x;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final int i() {
        return this.s;
    }

    public final int j() {
        return this.w;
    }

    public final String k() {
        return this.x;
    }

    public final boolean l() {
        return !zq3.c(gv0.k, this.j);
    }

    public final boolean m() {
        return this.b == WorkInfo.State.ENQUEUED && this.k > 0;
    }

    public final boolean n() {
        return this.h != 0;
    }

    public final void o(long j) {
        if (j > 18000000) {
            h94.e().k(z, "Backoff delay duration exceeds maximum value");
        }
        if (j < 10000) {
            h94.e().k(z, "Backoff delay duration less than minimum value");
        }
        this.m = uo6.o(j, 10000L, 18000000L);
    }

    public final void p(String str) {
        this.x = str;
    }

    public String toString() {
        return "{WorkSpec: " + this.a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ dk9(java.lang.String r36, androidx.work.WorkInfo.State r37, java.lang.String r38, java.lang.String r39, androidx.work.Data r40, androidx.work.Data r41, long r42, long r44, long r46, defpackage.gv0 r48, int r49, androidx.work.BackoffPolicy r50, long r51, long r53, long r55, long r57, boolean r59, androidx.work.OutOfQuotaPolicy r60, int r61, int r62, long r63, int r65, int r66, java.lang.String r67, int r68, kotlin.jvm.internal.DefaultConstructorMarker r69) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk9.<init>(java.lang.String, androidx.work.WorkInfo$State, java.lang.String, java.lang.String, androidx.work.Data, androidx.work.Data, long, long, long, gv0, int, androidx.work.BackoffPolicy, long, long, long, long, boolean, androidx.work.OutOfQuotaPolicy, int, int, long, int, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dk9(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777210, null);
        zq3.h(str, "id");
        zq3.h(str2, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dk9(String str, dk9 dk9Var) {
        this(str, dk9Var.b, dk9Var.c, dk9Var.d, new Data(dk9Var.e), new Data(dk9Var.f), dk9Var.g, dk9Var.h, dk9Var.i, new gv0(dk9Var.j), dk9Var.k, dk9Var.l, dk9Var.m, dk9Var.n, dk9Var.o, dk9Var.p, dk9Var.q, dk9Var.r, dk9Var.s, 0, dk9Var.u, dk9Var.v, dk9Var.w, dk9Var.x, 524288, null);
        zq3.h(str, "newId");
        zq3.h(dk9Var, "other");
    }
}
