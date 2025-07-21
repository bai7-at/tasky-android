package com.datadog.android.core.internal.persistence;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.ConsentAwareStorage;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.core.metrics.MethodCallSamplingRate;
import com.datadog.android.core.metrics.TelemetryMetricType;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.ar5;
import defpackage.du8;
import defpackage.f28;
import defpackage.jw6;
import defpackage.oe2;
import defpackage.pe2;
import defpackage.qs2;
import defpackage.re2;
import defpackage.s60;
import defpackage.ss2;
import defpackage.su0;
import defpackage.tt4;
import defpackage.u60;
import defpackage.ua1;
import defpackage.ww8;
import defpackage.z65;
import defpackage.zq3;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ConsentAwareStorage implements f28 {
    public static final b n = new b(null);
    private final ExecutorService a;
    private final oe2 b;
    private final oe2 c;
    private final u60 d;
    private final re2 e;
    private final FileMover f;
    private final InternalLogger g;
    private final pe2 h;
    private final tt4 i;
    private final su0 j;
    private final String k;
    private final Set l;
    private final Object m;

    private static final class a {
        private final File a;
        private final File b;

        public a(File file, File file2) {
            zq3.h(file, TransferTable.COLUMN_FILE);
            this.a = file;
            this.b = file2;
        }

        public final File a() {
            return this.a;
        }

        public final File b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            File file = this.b;
            return hashCode + (file == null ? 0 : file.hashCode());
        }

        public String toString() {
            return "Batch(file=" + this.a + ", metaFile=" + this.b + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TrackingConsent.values().length];
            try {
                iArr[TrackingConsent.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingConsent.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingConsent.NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public ConsentAwareStorage(ExecutorService executorService, oe2 oe2Var, oe2 oe2Var2, u60 u60Var, re2 re2Var, FileMover fileMover, InternalLogger internalLogger, pe2 pe2Var, tt4 tt4Var, su0 su0Var, String str) {
        zq3.h(executorService, "executorService");
        zq3.h(oe2Var, "grantedOrchestrator");
        zq3.h(oe2Var2, "pendingOrchestrator");
        zq3.h(u60Var, "batchEventsReaderWriter");
        zq3.h(re2Var, "batchMetadataReaderWriter");
        zq3.h(fileMover, "fileMover");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(pe2Var, "filePersistenceConfig");
        zq3.h(tt4Var, "metricsDispatcher");
        zq3.h(su0Var, "consentProvider");
        zq3.h(str, "featureName");
        this.a = executorService;
        this.b = oe2Var;
        this.c = oe2Var2;
        this.d = u60Var;
        this.e = re2Var;
        this.f = fileMover;
        this.g = internalLogger;
        this.h = pe2Var;
        this.i = tt4Var;
        this.j = su0Var;
        this.k = str;
        this.l = new LinkedHashSet();
        this.m = new Object();
    }

    private final void e(a aVar, jw6 jw6Var) {
        f(aVar.a(), aVar.b(), jw6Var);
    }

    private final void f(File file, File file2, jw6 jw6Var) {
        g(file, jw6Var);
        if (file2 == null || !FileExtKt.d(file2, this.g)) {
            return;
        }
        h(file2);
    }

    private final void g(final File file, jw6 jw6Var) {
        if (this.f.a(file)) {
            this.i.e(file, jw6Var);
        } else {
            InternalLogger.b.a(this.g, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.persistence.ConsentAwareStorage$deleteBatchFile$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
        }
    }

    private final void h(final File file) {
        if (this.f.a(file)) {
            return;
        }
        InternalLogger.b.a(this.g, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.persistence.ConsentAwareStorage$deleteBatchMetadataFile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String format = String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                zq3.g(format, "format(...)");
                return format;
            }
        }, null, false, null, 56, null);
    }

    private final oe2 i() {
        int i = c.a[this.j.c().ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ConsentAwareStorage consentAwareStorage, ss2 ss2Var, ar5 ar5Var, boolean z) {
        zq3.h(consentAwareStorage, "this$0");
        zq3.h(ss2Var, "$callback");
        oe2 i = consentAwareStorage.i();
        if (i == null) {
            ss2Var.invoke(new z65());
            if (ar5Var != null) {
                ar5Var.a(false);
                return;
            }
            return;
        }
        synchronized (consentAwareStorage.m) {
            try {
                File c2 = i.c(z);
                ss2Var.invoke(c2 == null ? new z65() : new FileEventBatchWriter(c2, c2 != null ? i.a(c2) : null, consentAwareStorage.d, consentAwareStorage.e, consentAwareStorage.h, consentAwareStorage.g));
                if (ar5Var != null) {
                    ar5Var.a(!(r9 instanceof z65));
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.f28
    public void a(com.datadog.android.core.internal.persistence.a aVar, jw6 jw6Var, boolean z) {
        Object obj;
        a aVar2;
        zq3.h(aVar, "batchId");
        zq3.h(jw6Var, "removalReason");
        synchronized (this.l) {
            try {
                Iterator it2 = this.l.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (aVar.b(((a) obj).a())) {
                            break;
                        }
                    }
                }
                aVar2 = (a) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar2 == null) {
            return;
        }
        if (z) {
            e(aVar2, jw6Var);
        }
        synchronized (this.l) {
            this.l.remove(aVar2);
        }
    }

    @Override // defpackage.f28
    public s60 c() {
        synchronized (this.l) {
            try {
                oe2 oe2Var = this.b;
                Set set = this.l;
                ArrayList arrayList = new ArrayList(i.w(set, 10));
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((a) it2.next()).a());
                }
                File e = oe2Var.e(i.c1(arrayList));
                byte[] bArr = null;
                if (e == null) {
                    return null;
                }
                File a2 = this.b.a(e);
                this.l.add(new a(e, a2));
                Pair a3 = du8.a(e, a2);
                File file = (File) a3.a();
                File file2 = (File) a3.b();
                com.datadog.android.core.internal.persistence.a c2 = com.datadog.android.core.internal.persistence.a.b.c(file);
                if (file2 != null && FileExtKt.d(file2, this.g)) {
                    bArr = (byte[]) this.e.a(file2);
                }
                return new s60(c2, this.d.a(file), bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.f28
    public void d(ua1 ua1Var, final boolean z, final ss2 ss2Var) {
        zq3.h(ua1Var, "datadogContext");
        zq3.h(ss2Var, "callback");
        InternalLogger internalLogger = this.g;
        String name = ConsentAwareStorage.class.getName();
        zq3.g(name, "ConsentAwareStorage::class.java.name");
        final ar5 d = internalLogger.d(name, TelemetryMetricType.MethodCalled, MethodCallSamplingRate.RARE.getRate(), "writeCurrentBatch[" + this.k + "]");
        ConcurrencyExtKt.c(this.a, "Data write", this.g, new Runnable() { // from class: ru0
            @Override // java.lang.Runnable
            public final void run() {
                ConsentAwareStorage.j(ConsentAwareStorage.this, ss2Var, d, z);
            }
        });
    }
}
