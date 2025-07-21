package defpackage;

import com.datadog.android.api.InternalLogger;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class bb2 extends qu0 {
    public static final a i = new a(null);
    private static final Regex j = new Regex("([a-z]+-)+v[0-9]+");
    private static final Regex k = new Regex("([a-z]+-)+pending-v[0-9]+");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Regex a() {
            return bb2.j;
        }

        public final Regex b() {
            return bb2.k;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb2(su0 su0Var, oe2 oe2Var, oe2 oe2Var2, p91 p91Var, ExecutorService executorService, InternalLogger internalLogger) {
        super(su0Var, oe2Var, oe2Var2, p91Var, executorService, internalLogger);
        zq3.h(su0Var, "consentProvider");
        zq3.h(oe2Var, "pendingOrchestrator");
        zq3.h(oe2Var2, "grantedOrchestrator");
        zq3.h(p91Var, "dataMigrator");
        zq3.h(executorService, "executorService");
        zq3.h(internalLogger, "internalLogger");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bb2(defpackage.su0 r9, java.io.File r10, java.lang.String r11, java.util.concurrent.ExecutorService r12, defpackage.pe2 r13, com.datadog.android.api.InternalLogger r14, defpackage.tt4 r15) {
        /*
            r8 = this;
            java.lang.String r0 = "consentProvider"
            defpackage.zq3.h(r9, r0)
            java.lang.String r0 = "storageDir"
            defpackage.zq3.h(r10, r0)
            java.lang.String r0 = "featureName"
            defpackage.zq3.h(r11, r0)
            java.lang.String r0 = "executorService"
            defpackage.zq3.h(r12, r0)
            java.lang.String r0 = "filePersistenceConfig"
            defpackage.zq3.h(r13, r0)
            java.lang.String r0 = "internalLogger"
            defpackage.zq3.h(r14, r0)
            java.lang.String r0 = "metricsDispatcher"
            defpackage.zq3.h(r15, r0)
            com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator r3 = new com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator
            java.io.File r0 = new java.io.File
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[]{r11}
            r4 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            java.lang.String r5 = "%s-pending-v2"
            java.lang.String r2 = java.lang.String.format(r1, r5, r2)
            java.lang.String r5 = "format(...)"
            defpackage.zq3.g(r2, r5)
            r0.<init>(r10, r2)
            r3.<init>(r0, r13, r14, r15)
            com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator r0 = new com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator
            java.io.File r2 = new java.io.File
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r4)
            java.lang.String r4 = "%s-v2"
            java.lang.String r11 = java.lang.String.format(r1, r4, r11)
            defpackage.zq3.g(r11, r5)
            r2.<init>(r10, r11)
            r0.<init>(r2, r13, r14, r15)
            com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileMigrator r5 = new com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileMigrator
            com.datadog.android.core.internal.persistence.file.FileMover r10 = new com.datadog.android.core.internal.persistence.file.FileMover
            r10.<init>(r14)
            r5.<init>(r10, r14)
            r1 = r8
            r2 = r9
            r4 = r0
            r6 = r12
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb2.<init>(su0, java.io.File, java.lang.String, java.util.concurrent.ExecutorService, pe2, com.datadog.android.api.InternalLogger, tt4):void");
    }
}
