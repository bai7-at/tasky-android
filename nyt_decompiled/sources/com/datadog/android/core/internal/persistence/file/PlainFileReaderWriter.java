package com.datadog.android.core.internal.persistence.file;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import defpackage.gm0;
import defpackage.lf2;
import defpackage.qs2;
import defpackage.re2;
import defpackage.ww8;
import defpackage.zq3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class PlainFileReaderWriter implements re2 {
    public static final a d = new a(null);
    private static final byte[] e = new byte[0];
    private final InternalLogger c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public PlainFileReaderWriter(InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        this.c = internalLogger;
    }

    private final void c(File file, boolean z, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file, z);
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            zq3.g(lock, "outputStream.channel.lock()");
            try {
                fileOutputStream.write(bArr);
                ww8 ww8Var = ww8.a;
                gm0.a(fileOutputStream, null);
            } finally {
                lock.release();
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    @Override // defpackage.qe2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] a(final File file) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        try {
            if (!file.exists()) {
                InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        String format = String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                        zq3.g(format, "format(...)");
                        return format;
                    }
                }, null, false, null, 56, null);
                this = e;
            } else if (file.isDirectory()) {
                InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        String format = String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                        zq3.g(format, "format(...)");
                        return format;
                    }
                }, null, false, null, 56, null);
                this = e;
            } else {
                this = lf2.e(file);
            }
            return this;
        } catch (IOException e2) {
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, e2, false, null, 48, null);
            return e;
        } catch (SecurityException e3) {
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, e3, false, null, 48, null);
            return e;
        }
    }

    @Override // defpackage.kf2
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(final File file, byte[] bArr, boolean z) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        zq3.h(bArr, "data");
        try {
            c(file, z, bArr);
            return true;
        } catch (IOException e2) {
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, e2, false, null, 48, null);
            return false;
        } catch (SecurityException e3) {
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, e3, false, null, 48, null);
            return false;
        }
    }
}
