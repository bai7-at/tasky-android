package com.datadog.android.core.internal.persistence.file.advanced;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.du8;
import defpackage.o91;
import defpackage.oe2;
import defpackage.p91;
import defpackage.qs2;
import defpackage.u65;
import defpackage.zq3;
import kotlin.Pair;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public final class ConsentAwareFileMigrator implements p91 {
    private final FileMover a;
    private final InternalLogger b;

    public ConsentAwareFileMigrator(FileMover fileMover, InternalLogger internalLogger) {
        zq3.h(fileMover, "fileMover");
        zq3.h(internalLogger, "internalLogger");
        this.a = fileMover;
        this.b = internalLogger;
    }

    private final o91 c(final TrackingConsent trackingConsent, final TrackingConsent trackingConsent2, oe2 oe2Var, oe2 oe2Var2) {
        boolean c;
        Pair a = du8.a(trackingConsent, trackingConsent2);
        TrackingConsent trackingConsent3 = TrackingConsent.PENDING;
        if (zq3.c(a, du8.a(null, trackingConsent3)) ? true : zq3.c(a, du8.a(null, TrackingConsent.GRANTED)) ? true : zq3.c(a, du8.a(null, TrackingConsent.NOT_GRANTED)) ? true : zq3.c(a, du8.a(trackingConsent3, TrackingConsent.NOT_GRANTED))) {
            return new WipeDataMigrationOperation(oe2Var.d(), this.a, this.b);
        }
        TrackingConsent trackingConsent4 = TrackingConsent.GRANTED;
        if (zq3.c(a, du8.a(trackingConsent4, trackingConsent3)) ? true : zq3.c(a, du8.a(TrackingConsent.NOT_GRANTED, trackingConsent3))) {
            return new WipeDataMigrationOperation(oe2Var2.d(), this.a, this.b);
        }
        if (zq3.c(a, du8.a(trackingConsent3, trackingConsent4))) {
            return new MoveDataMigrationOperation(oe2Var.d(), oe2Var2.d(), this.a, this.b);
        }
        if (zq3.c(a, du8.a(trackingConsent3, trackingConsent3)) ? true : zq3.c(a, du8.a(trackingConsent4, trackingConsent4)) ? true : zq3.c(a, du8.a(trackingConsent4, TrackingConsent.NOT_GRANTED))) {
            c = true;
        } else {
            TrackingConsent trackingConsent5 = TrackingConsent.NOT_GRANTED;
            c = zq3.c(a, du8.a(trackingConsent5, trackingConsent5));
        }
        if (c ? true : zq3.c(a, du8.a(TrackingConsent.NOT_GRANTED, trackingConsent4))) {
            return new u65();
        }
        InternalLogger.b.b(this.b, InternalLogger.Level.WARN, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileMigrator$resolveMigrationOperation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return "Unexpected consent migration from " + TrackingConsent.this + " to " + trackingConsent2;
            }
        }, null, false, null, 56, null);
        return new u65();
    }

    @Override // defpackage.p91
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(TrackingConsent trackingConsent, oe2 oe2Var, TrackingConsent trackingConsent2, oe2 oe2Var2) {
        zq3.h(oe2Var, "previousFileOrchestrator");
        zq3.h(trackingConsent2, "newState");
        zq3.h(oe2Var2, "newFileOrchestrator");
        c(trackingConsent, trackingConsent2, oe2Var, oe2Var2).run();
    }
}
