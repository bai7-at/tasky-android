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
public final class WipeDataMigrationOperation implements o91 {
    public static final a d = new a(null);
    private static final long e = TimeUnit.MILLISECONDS.toNanos(500);
    private final File a;
    private final FileMover b;
    private final InternalLogger c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public WipeDataMigrationOperation(File file, FileMover fileMover, InternalLogger internalLogger) {
        zq3.h(fileMover, "fileMover");
        zq3.h(internalLogger, "internalLogger");
        this.a = file;
        this.b = fileMover;
        this.c = internalLogger;
    }

    public final FileMover a() {
        return this.b;
    }

    public final File b() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a == null) {
            InternalLogger.b.a(this.c, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation$run$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Can't wipe data from a null directory";
                }
            }, null, false, null, 56, null);
        } else {
            ou4.a(3, e, this.c, new qs2() { // from class: com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation$run$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    return Boolean.valueOf(WipeDataMigrationOperation.this.a().a(WipeDataMigrationOperation.this.b()));
                }
            });
        }
    }
}
