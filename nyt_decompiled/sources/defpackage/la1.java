package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.internal.data.upload.UploadStatus;
import com.datadog.android.core.internal.system.SystemInfo;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import defpackage.jw6;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class la1 implements Runnable {
    public static final a k = new a(null);
    private final String a;
    private final ScheduledThreadPoolExecutor b;
    private final f28 c;
    private final na1 d;
    private final tx0 e;
    private final v35 f;
    private final oe8 g;
    private final cy8 h;
    private final int i;
    private final InternalLogger j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public la1(String str, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, f28 f28Var, na1 na1Var, tx0 tx0Var, v35 v35Var, oe8 oe8Var, cy8 cy8Var, int i, InternalLogger internalLogger) {
        zq3.h(str, "featureName");
        zq3.h(scheduledThreadPoolExecutor, "threadPoolExecutor");
        zq3.h(f28Var, "storage");
        zq3.h(na1Var, "dataUploader");
        zq3.h(tx0Var, "contextProvider");
        zq3.h(v35Var, "networkInfoProvider");
        zq3.h(oe8Var, "systemInfoProvider");
        zq3.h(cy8Var, "uploadSchedulerStrategy");
        zq3.h(internalLogger, "internalLogger");
        this.a = str;
        this.b = scheduledThreadPoolExecutor;
        this.c = f28Var;
        this.d = na1Var;
        this.e = tx0Var;
        this.f = v35Var;
        this.g = oe8Var;
        this.h = cy8Var;
        this.i = i;
        this.j = internalLogger;
    }

    private final UploadStatus a(ua1 ua1Var, com.datadog.android.core.internal.persistence.a aVar, List list, byte[] bArr) {
        UploadStatus a2 = this.d.a(ua1Var, list, bArr, aVar);
        this.c.a(aVar, a2 instanceof UploadStatus.h ? jw6.b.a : new jw6.a(a2.c()), !a2.d());
        return a2;
    }

    private final UploadStatus b(ua1 ua1Var) {
        s60 c = this.c.c();
        if (c != null) {
            return a(ua1Var, c.b(), c.a(), c.c());
        }
        return null;
    }

    private final boolean c() {
        return this.f.c().c() != NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED;
    }

    private final boolean d() {
        SystemInfo c = this.g.c();
        return (c.c() || c.e() || c.d() > 10) && !c.f();
    }

    private final void e(long j) {
        this.b.remove(this);
        ConcurrencyExtKt.b(this.b, this.a + ": data upload", j, TimeUnit.MILLISECONDS, this.j, this);
    }

    @Override // java.lang.Runnable
    public void run() {
        UploadStatus uploadStatus;
        int i = 0;
        if (c() && d()) {
            ua1 context = this.e.getContext();
            int i2 = this.i;
            do {
                i2--;
                uploadStatus = b(context);
                if (uploadStatus != null) {
                    i++;
                }
                if (i2 <= 0) {
                    break;
                }
            } while (uploadStatus instanceof UploadStatus.i);
        } else {
            uploadStatus = null;
        }
        e(this.h.a(this.a, i, uploadStatus != null ? Integer.valueOf(uploadStatus.c()) : null, uploadStatus != null ? uploadStatus.e() : null));
    }
}
