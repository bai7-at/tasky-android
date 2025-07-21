package com.datadog.android.core.internal.persistence.file.advanced;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileMover;
import defpackage.o91;
import defpackage.ou4;
import defpackage.qs2;
import defpackage.zq3;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class MoveDataMigrationOperation implements o91 {
    public static final a e = new a(null);
    private static final long f = TimeUnit.MILLISECONDS.toNanos(500);
    private final File a;
    private final File b;
    private final FileMover c;
    private final InternalLogger d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public MoveDataMigrationOperation(File file, File file2, FileMover fileMover, InternalLogger internalLogger) {
        zq3.h(fileMover, "fileMover");
        zq3.h(internalLogger, "internalLogger");
        this.a = file;
        this.b = file2;
        this.c = fileMover;
        this.d = internalLogger;
    }

    public final FileMover a() {
        return this.c;
    }

    public final File b() {
        return this.a;
    }

    public final File c() {
        return this.b;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a == null) {
            InternalLogger.b.a(this.d, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Can't move data from a null directory";
                }
            }, null, false, null, 56, null);
        } else if (this.b == null) {
            InternalLogger.b.a(this.d, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Can't move data to a null directory";
                }
            }, null, false, null, 56, null);
        } else {
            ou4.a(3, f, this.d, new qs2() { // from class: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$3
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    return Boolean.valueOf(MoveDataMigrationOperation.this.a().c(MoveDataMigrationOperation.this.b(), MoveDataMigrationOperation.this.c()));
                }
            });
        }
    }
}
