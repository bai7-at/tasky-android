package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.privacy.TrackingConsent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class qu0 implements oe2, mq8 {
    public static final a g = new a(null);
    private static final oe2 h = new b75();
    private final oe2 a;
    private final oe2 b;
    private final p91 c;
    private final ExecutorService d;
    private final InternalLogger e;
    private volatile oe2 f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TrackingConsent.values().length];
            try {
                iArr[TrackingConsent.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingConsent.GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingConsent.NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public qu0(su0 su0Var, oe2 oe2Var, oe2 oe2Var2, p91 p91Var, ExecutorService executorService, InternalLogger internalLogger) {
        zq3.h(su0Var, "consentProvider");
        zq3.h(oe2Var, "pendingOrchestrator");
        zq3.h(oe2Var2, "grantedOrchestrator");
        zq3.h(p91Var, "dataMigrator");
        zq3.h(executorService, "executorService");
        zq3.h(internalLogger, "internalLogger");
        this.a = oe2Var;
        this.b = oe2Var2;
        this.c = p91Var;
        this.d = executorService;
        this.e = internalLogger;
        i(null, su0Var.c());
        su0Var.e(this);
    }

    private final void i(final TrackingConsent trackingConsent, final TrackingConsent trackingConsent2) {
        final oe2 k = k(trackingConsent);
        final oe2 k2 = k(trackingConsent2);
        ConcurrencyExtKt.c(this.d, "Data migration", this.e, new Runnable() { // from class: pu0
            @Override // java.lang.Runnable
            public final void run() {
                qu0.j(qu0.this, trackingConsent, k, trackingConsent2, k2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(qu0 qu0Var, TrackingConsent trackingConsent, oe2 oe2Var, TrackingConsent trackingConsent2, oe2 oe2Var2) {
        zq3.h(qu0Var, "this$0");
        zq3.h(oe2Var, "$previousOrchestrator");
        zq3.h(trackingConsent2, "$newConsent");
        zq3.h(oe2Var2, "$newOrchestrator");
        qu0Var.c.a(trackingConsent, oe2Var, trackingConsent2, oe2Var2);
        qu0Var.f = oe2Var2;
    }

    private final oe2 k(TrackingConsent trackingConsent) {
        int i = trackingConsent == null ? -1 : b.a[trackingConsent.ordinal()];
        if (i == -1 || i == 1) {
            return this.a;
        }
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return h;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.oe2
    public File a(File file) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        oe2 oe2Var = this.f;
        if (oe2Var == null) {
            zq3.z("delegateOrchestrator");
            oe2Var = null;
        }
        return oe2Var.a(file);
    }

    @Override // defpackage.mq8
    public void b(TrackingConsent trackingConsent, TrackingConsent trackingConsent2) {
        zq3.h(trackingConsent, "previousConsent");
        zq3.h(trackingConsent2, "newConsent");
        i(trackingConsent, trackingConsent2);
    }

    @Override // defpackage.oe2
    public File c(boolean z) {
        oe2 oe2Var = this.f;
        if (oe2Var == null) {
            zq3.z("delegateOrchestrator");
            oe2Var = null;
        }
        return oe2Var.c(z);
    }

    @Override // defpackage.oe2
    public File d() {
        return null;
    }

    @Override // defpackage.oe2
    public File e(Set set) {
        zq3.h(set, "excludeFiles");
        return this.b.e(set);
    }

    public final oe2 g() {
        return this.b;
    }

    public final oe2 h() {
        return this.a;
    }
}
