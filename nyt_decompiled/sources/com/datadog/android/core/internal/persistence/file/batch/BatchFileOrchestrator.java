package com.datadog.android.core.internal.persistence.file.batch;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.facebook.AuthenticationTokenClaims;
import defpackage.dg4;
import defpackage.jw6;
import defpackage.oe2;
import defpackage.pe2;
import defpackage.qs2;
import defpackage.r60;
import defpackage.tt4;
import defpackage.zq3;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class BatchFileOrchestrator implements oe2 {
    public static final b l = new b(null);
    private final File a;
    private final pe2 b;
    private final InternalLogger c;
    private final tt4 d;
    private final a e;
    private final long f;
    private final long g;
    private File h;
    private long i;
    private long j;
    private long k;

    public final class a implements FileFilter {
        public a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            if (file == null) {
                return false;
            }
            return BatchFileOrchestrator.this.q(file);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public BatchFileOrchestrator(File file, pe2 pe2Var, InternalLogger internalLogger, tt4 tt4Var) {
        zq3.h(file, "rootDir");
        zq3.h(pe2Var, "config");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(tt4Var, "metricsDispatcher");
        this.a = file;
        this.b = pe2Var;
        this.c = internalLogger;
        this.d = tt4Var;
        this.e = new a();
        this.f = dg4.e(pe2Var.i() * 1.05d);
        this.g = dg4.e(pe2Var.i() * 0.95d);
    }

    private final boolean g() {
        return System.currentTimeMillis() - this.k > this.b.c();
    }

    private final File h(boolean z) {
        File file = new File(this.a, String.valueOf(System.currentTimeMillis()));
        File file2 = this.h;
        long j = this.j;
        if (file2 != null) {
            this.d.a(file2, new r60(j, z, this.i));
        }
        this.h = file;
        this.i = 1L;
        this.j = System.currentTimeMillis();
        return file;
    }

    static /* synthetic */ File i(BatchFileOrchestrator batchFileOrchestrator, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return batchFileOrchestrator.h(z);
    }

    private final long j(File file, boolean z) {
        if (!FileExtKt.d(file, this.c)) {
            return 0L;
        }
        long f = FileExtKt.f(file, this.c);
        if (!FileExtKt.c(file, this.c)) {
            return 0L;
        }
        if (z) {
            this.d.e(file, jw6.d.a);
        }
        return f;
    }

    static /* synthetic */ long k(BatchFileOrchestrator batchFileOrchestrator, File file, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return batchFileOrchestrator.j(file, z);
    }

    private final List l(List list) {
        long currentTimeMillis = System.currentTimeMillis() - this.b.h();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            File file = (File) it2.next();
            String name = file.getName();
            zq3.g(name, "it.name");
            Long n = h.n(name);
            if ((n != null ? n.longValue() : 0L) < currentTimeMillis) {
                if (FileExtKt.c(file, this.c)) {
                    this.d.e(file, jw6.c.a);
                }
                if (FileExtKt.d(o(file), this.c)) {
                    FileExtKt.c(o(file), this.c);
                }
                file = null;
            }
            if (file != null) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    private final void m(List list) {
        List list2 = list;
        Iterator it2 = list2.iterator();
        final long j = 0;
        while (it2.hasNext()) {
            j += FileExtKt.f((File) it2.next(), this.c);
        }
        final long e = this.b.e();
        final long j2 = j - e;
        if (j2 > 0) {
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$freeSpaceIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Too much disk space used (%d/%d): cleaning up to free %d bytes…", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(e), Long.valueOf(j2)}, 3));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
            for (File file : i.M0(list2)) {
                if (j2 > 0) {
                    j2 = (j2 - j(file, true)) - k(this, o(file), false, 2, null);
                }
            }
        }
    }

    private final File n(List list) {
        return (File) i.z0(list);
    }

    private final File o(File file) {
        return new File(file.getPath() + "_metadata");
    }

    private final File p() {
        File n = n(t());
        if (n == null) {
            return null;
        }
        File file = this.h;
        long j = this.i;
        if (!zq3.c(file, n)) {
            return null;
        }
        boolean r = r(n, this.g);
        boolean z = FileExtKt.f(n, this.c) < this.b.d();
        boolean z2 = j < ((long) this.b.g());
        if (!r || !z || !z2) {
            return null;
        }
        this.i = j + 1;
        this.j = System.currentTimeMillis();
        return n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(File file) {
        String name = file.getName();
        zq3.g(name, AuthenticationTokenClaims.JSON_KEY_NAME);
        return h.n(name) != null;
    }

    private final boolean r(File file, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        String name = file.getName();
        zq3.g(name, "file.name");
        Long n = h.n(name);
        return (n != null ? n.longValue() : 0L) >= currentTimeMillis - j;
    }

    private final boolean s() {
        if (FileExtKt.d(this.a, this.c)) {
            if (!this.a.isDirectory()) {
                InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        File file;
                        Locale locale = Locale.US;
                        file = BatchFileOrchestrator.this.a;
                        String format = String.format(locale, "The provided root file is not a directory: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                        zq3.g(format, "format(...)");
                        return format;
                    }
                }, null, false, null, 56, null);
                return false;
            }
            if (FileExtKt.b(this.a, this.c)) {
                return true;
            }
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    File file;
                    Locale locale = Locale.US;
                    file = BatchFileOrchestrator.this.a;
                    String format = String.format(locale, "The provided root dir is not writable: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
            return false;
        }
        synchronized (this.a) {
            if (FileExtKt.d(this.a, this.c)) {
                return true;
            }
            if (FileExtKt.i(this.a, this.c)) {
                return true;
            }
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$3$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    File file;
                    Locale locale = Locale.US;
                    file = BatchFileOrchestrator.this.a;
                    String format = String.format(locale, "The provided root dir can't be created: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
            return false;
        }
    }

    private final List t() {
        File[] h = FileExtKt.h(this.a, this.e, this.c);
        if (h == null) {
            h = new File[0];
        }
        return d.C0(h);
    }

    private final List u() {
        return i.M0(t());
    }

    @Override // defpackage.oe2
    public File a(final File file) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        if (!zq3.c(file.getParent(), this.a.getPath())) {
            InternalLogger.b.b(this.c, InternalLogger.Level.DEBUG, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$getMetadataFile$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    File file2;
                    Locale locale = Locale.US;
                    String path = file.getPath();
                    file2 = this.a;
                    String format = String.format(locale, "The file provided (%s) doesn't belong to the current folder (%s)", Arrays.copyOf(new Object[]{path, file2.getPath()}, 2));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
        }
        if (q(file)) {
            return o(file);
        }
        InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$getMetadataFile$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String format = String.format(Locale.US, "The file provided is not a batch file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                zq3.g(format, "format(...)");
                return format;
            }
        }, null, false, null, 56, null);
        return null;
    }

    @Override // defpackage.oe2
    public File c(boolean z) {
        if (!s()) {
            return null;
        }
        if (g()) {
            m(l(t()));
            this.k = System.currentTimeMillis();
        }
        if (z) {
            return h(true);
        }
        File p = p();
        return p == null ? i(this, false, 1, null) : p;
    }

    @Override // defpackage.oe2
    public File d() {
        if (s()) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.oe2
    public File e(Set set) {
        zq3.h(set, "excludeFiles");
        Object obj = null;
        if (!s()) {
            return null;
        }
        List l2 = l(u());
        this.k = System.currentTimeMillis();
        Iterator it2 = l2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            File file = (File) next;
            if (!set.contains(file) && !r(file, this.f)) {
                obj = next;
                break;
            }
        }
        return (File) obj;
    }
}
