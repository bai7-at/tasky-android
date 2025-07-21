package com.datadog.android.core.internal.persistence.file;

import com.datadog.android.api.InternalLogger;
import defpackage.lf2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.yj0;
import defpackage.zq3;
import java.io.File;
import java.io.FileFilter;
import java.nio.charset.Charset;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public abstract class FileExtKt {
    public static final boolean a(File file, InternalLogger internalLogger) {
        zq3.h(file, "<this>");
        zq3.h(internalLogger, "internalLogger");
        return ((Boolean) m(file, Boolean.FALSE, internalLogger, new ss2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$canReadSafe$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file2) {
                zq3.h(file2, "$this$safeCall");
                return Boolean.valueOf(file2.canRead());
            }
        })).booleanValue();
    }

    public static final boolean b(File file, InternalLogger internalLogger) {
        zq3.h(file, "<this>");
        zq3.h(internalLogger, "internalLogger");
        return ((Boolean) m(file, Boolean.FALSE, internalLogger, new ss2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$canWriteSafe$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file2) {
                zq3.h(file2, "$this$safeCall");
                return Boolean.valueOf(file2.canWrite());
            }
        })).booleanValue();
    }

    public static final boolean c(File file, InternalLogger internalLogger) {
        zq3.h(file, "<this>");
        zq3.h(internalLogger, "internalLogger");
        return ((Boolean) m(file, Boolean.FALSE, internalLogger, new ss2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$deleteSafe$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file2) {
                zq3.h(file2, "$this$safeCall");
                return Boolean.valueOf(file2.delete());
            }
        })).booleanValue();
    }

    public static final boolean d(File file, InternalLogger internalLogger) {
        zq3.h(file, "<this>");
        zq3.h(internalLogger, "internalLogger");
        return ((Boolean) m(file, Boolean.FALSE, internalLogger, new ss2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$existsSafe$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file2) {
                zq3.h(file2, "$this$safeCall");
                return Boolean.valueOf(file2.exists());
            }
        })).booleanValue();
    }

    public static final boolean e(File file, InternalLogger internalLogger) {
        zq3.h(file, "<this>");
        zq3.h(internalLogger, "internalLogger");
        return ((Boolean) m(file, Boolean.FALSE, internalLogger, new ss2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$isDirectorySafe$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file2) {
                zq3.h(file2, "$this$safeCall");
                return Boolean.valueOf(file2.isDirectory());
            }
        })).booleanValue();
    }

    public static final long f(File file, InternalLogger internalLogger) {
        zq3.h(file, "<this>");
        zq3.h(internalLogger, "internalLogger");
        return ((Number) m(file, 0L, internalLogger, new ss2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$lengthSafe$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Long invoke(File file2) {
                zq3.h(file2, "$this$safeCall");
                return Long.valueOf(file2.length());
            }
        })).longValue();
    }

    public static final File[] g(File file, InternalLogger internalLogger) {
        zq3.h(file, "<this>");
        zq3.h(internalLogger, "internalLogger");
        return (File[]) m(file, null, internalLogger, new ss2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final File[] invoke(File file2) {
                zq3.h(file2, "$this$safeCall");
                return file2.listFiles();
            }
        });
    }

    public static final File[] h(File file, final FileFilter fileFilter, InternalLogger internalLogger) {
        zq3.h(file, "<this>");
        zq3.h(fileFilter, "filter");
        zq3.h(internalLogger, "internalLogger");
        return (File[]) m(file, null, internalLogger, new ss2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final File[] invoke(File file2) {
                zq3.h(file2, "$this$safeCall");
                return file2.listFiles(fileFilter);
            }
        });
    }

    public static final boolean i(File file, InternalLogger internalLogger) {
        zq3.h(file, "<this>");
        zq3.h(internalLogger, "internalLogger");
        return ((Boolean) m(file, Boolean.FALSE, internalLogger, new ss2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$mkdirsSafe$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file2) {
                zq3.h(file2, "$this$safeCall");
                return Boolean.valueOf(file2.mkdirs());
            }
        })).booleanValue();
    }

    public static final String j(File file, final Charset charset, InternalLogger internalLogger) {
        zq3.h(file, "<this>");
        zq3.h(charset, "charset");
        zq3.h(internalLogger, "internalLogger");
        if (d(file, internalLogger) && a(file, internalLogger)) {
            return (String) m(file, null, internalLogger, new ss2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$readTextSafe$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke(File file2) {
                    zq3.h(file2, "$this$safeCall");
                    return lf2.f(file2, charset);
                }
            });
        }
        return null;
    }

    public static /* synthetic */ String k(File file, Charset charset, InternalLogger internalLogger, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = yj0.b;
        }
        return j(file, charset, internalLogger);
    }

    public static final boolean l(File file, final File file2, InternalLogger internalLogger) {
        zq3.h(file, "<this>");
        zq3.h(file2, "dest");
        zq3.h(internalLogger, "internalLogger");
        return ((Boolean) m(file, Boolean.FALSE, internalLogger, new ss2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$renameToSafe$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file3) {
                zq3.h(file3, "$this$safeCall");
                return Boolean.valueOf(file3.renameTo(file2));
            }
        })).booleanValue();
    }

    private static final Object m(final File file, Object obj, InternalLogger internalLogger, ss2 ss2Var) {
        try {
            return ss2Var.invoke(file);
        } catch (SecurityException e) {
            InternalLogger.b.b(internalLogger, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$safeCall$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Security exception was thrown for file " + file.getPath();
                }
            }, e, false, null, 48, null);
            return obj;
        } catch (Exception e2) {
            InternalLogger.b.b(internalLogger, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$safeCall$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Unexpected exception was thrown for file " + file.getPath();
                }
            }, e2, false, null, 48, null);
            return obj;
        }
    }
}
