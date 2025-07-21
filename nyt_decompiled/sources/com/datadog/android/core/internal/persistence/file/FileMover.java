package com.datadog.android.core.internal.persistence.file;

import com.datadog.android.api.InternalLogger;
import defpackage.lf2;
import defpackage.qs2;
import defpackage.zq3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class FileMover {
    public static final a b = new a(null);
    private final InternalLogger a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public FileMover(InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        this.a = internalLogger;
    }

    private final boolean b(File file, File file2) {
        return FileExtKt.l(file, new File(file2, file.getName()), this.a);
    }

    public final boolean a(final File file) {
        zq3.h(file, "target");
        try {
            return lf2.m(file);
        } catch (FileNotFoundException e) {
            InternalLogger.b.b(this.a, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$delete$1
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
            }, e, false, null, 48, null);
            return false;
        } catch (SecurityException e2) {
            InternalLogger.b.b(this.a, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$delete$2
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
            }, e2, false, null, 48, null);
            return false;
        }
    }

    public final boolean c(final File file, final File file2) {
        zq3.h(file, "srcDir");
        zq3.h(file2, "destDir");
        if (!FileExtKt.d(file, this.a)) {
            InternalLogger.b.a(this.a, InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Unable to move files; source directory does not exist: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
            return true;
        }
        if (!FileExtKt.e(file, this.a)) {
            InternalLogger.b.b(this.a, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Unable to move files; file is not a directory: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
            return false;
        }
        if (FileExtKt.d(file2, this.a)) {
            if (!FileExtKt.e(file2, this.a)) {
                InternalLogger.b.b(this.a, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        String format = String.format(Locale.US, "Unable to move files; file is not a directory: %s", Arrays.copyOf(new Object[]{file2.getPath()}, 1));
                        zq3.g(format, "format(...)");
                        return format;
                    }
                }, null, false, null, 56, null);
                return false;
            }
        } else if (!FileExtKt.i(file2, this.a)) {
            InternalLogger.b.b(this.a, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Unable to move files; could not create directory: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
            return false;
        }
        File[] g = FileExtKt.g(file, this.a);
        if (g == null) {
            g = new File[0];
        }
        for (File file3 : g) {
            if (!b(file3, file2)) {
                return false;
            }
        }
        return true;
    }
}
