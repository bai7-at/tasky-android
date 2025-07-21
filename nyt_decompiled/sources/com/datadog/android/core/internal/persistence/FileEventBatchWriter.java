package com.datadog.android.core.internal.persistence;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventType;
import defpackage.bp6;
import defpackage.f32;
import defpackage.kf2;
import defpackage.pe2;
import defpackage.qs2;
import defpackage.re2;
import defpackage.zq3;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class FileEventBatchWriter implements f32 {
    public static final a g = new a(null);
    private final File a;
    private final File b;
    private final kf2 c;
    private final re2 d;
    private final pe2 e;
    private final InternalLogger f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public FileEventBatchWriter(File file, File file2, kf2 kf2Var, re2 re2Var, pe2 pe2Var, InternalLogger internalLogger) {
        zq3.h(file, "batchFile");
        zq3.h(kf2Var, "eventsWriter");
        zq3.h(re2Var, "metadataReaderWriter");
        zq3.h(pe2Var, "filePersistenceConfig");
        zq3.h(internalLogger, "internalLogger");
        this.a = file;
        this.b = file2;
        this.c = kf2Var;
        this.d = re2Var;
        this.e = pe2Var;
        this.f = internalLogger;
    }

    private final boolean c(final int i) {
        if (i <= this.e.f()) {
            return true;
        }
        InternalLogger.b.a(this.f, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.persistence.FileEventBatchWriter$checkEventSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                pe2 pe2Var;
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(i);
                pe2Var = this.e;
                String format = String.format(locale, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{valueOf, Long.valueOf(pe2Var.f())}, 2));
                zq3.g(format, "format(...)");
                return format;
            }
        }, null, false, null, 56, null);
        return false;
    }

    private final void d(final File file, byte[] bArr) {
        if (this.d.b(file, bArr, false)) {
            return;
        }
        InternalLogger.b.a(this.f, InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.persistence.FileEventBatchWriter$writeBatchMetadata$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String format = String.format(Locale.US, "Unable to write metadata file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                zq3.g(format, "format(...)");
                return format;
            }
        }, null, false, null, 56, null);
    }

    @Override // defpackage.f32
    public boolean a(bp6 bp6Var, byte[] bArr, EventType eventType) {
        File file;
        zq3.h(bp6Var, "event");
        zq3.h(eventType, "eventType");
        if (bp6Var.a().length == 0) {
            return true;
        }
        if (!c(bp6Var.a().length) || !this.c.b(this.a, bp6Var, true)) {
            return false;
        }
        if (bArr == null) {
            return true;
        }
        if (!(!(bArr.length == 0)) || (file = this.b) == null) {
            return true;
        }
        d(file, bArr);
        return true;
    }
}
