package com.datadog.android.core.internal.persistence.file.batch;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter;
import defpackage.bp6;
import defpackage.gm0;
import defpackage.qs2;
import defpackage.u60;
import defpackage.ww8;
import defpackage.zq3;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class PlainBatchFileReaderWriter implements u60 {
    public static final b d = new b(null);
    private final InternalLogger c;

    /* JADX INFO: Access modifiers changed from: private */
    enum BlockType {
        EVENT(0),
        META(1);

        private final short identifier;

        BlockType(short s) {
            this.identifier = s;
        }

        public final short getIdentifier() {
            return this.identifier;
        }
    }

    private static final class a {
        private final byte[] a;
        private final int b;

        public a(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final byte[] b() {
            return this.a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public PlainBatchFileReaderWriter(InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        this.c = internalLogger;
    }

    private final boolean c(final int i, final int i2, final String str) {
        if (i == i2) {
            return true;
        }
        if (i2 != -1) {
            InternalLogger.b.a(this.c, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$checkReadExpected$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Number of bytes read for operation='" + str + "' doesn't match with expected: expected=" + i + ", actual=" + i2;
                }
            }, null, false, null, 56, null);
        } else {
            InternalLogger.b.a(this.c, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$checkReadExpected$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Unexpected EOF at the operation=" + str;
                }
            }, null, false, null, 56, null);
        }
        return false;
    }

    private final void d(File file, boolean z, bp6 bp6Var) {
        FileOutputStream fileOutputStream = new FileOutputStream(file, z);
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            zq3.g(lock, "outputStream.channel.lock()");
            try {
                byte[] b2 = bp6Var.b();
                ByteBuffer allocate = ByteBuffer.allocate(b2.length + 6 + bp6Var.a().length + 6);
                zq3.g(allocate, "allocate(metaBlockSize + dataBlockSize)");
                fileOutputStream.write(e(e(allocate, BlockType.META, b2), BlockType.EVENT, bp6Var.a()).array());
                ww8 ww8Var = ww8.a;
                gm0.a(fileOutputStream, null);
            } finally {
                lock.release();
            }
        } finally {
        }
    }

    private final ByteBuffer e(ByteBuffer byteBuffer, BlockType blockType, byte[] bArr) {
        ByteBuffer put = byteBuffer.putShort(blockType.getIdentifier()).putInt(bArr.length).put(bArr);
        zq3.g(put, "this\n            .putSho…e)\n            .put(data)");
        return put;
    }

    private final a f(InputStream inputStream, final BlockType blockType) {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        int read = inputStream.read(allocate.array());
        if (!c(6, read, "Block(" + blockType.name() + "): Header read")) {
            return new a(null, Math.max(0, read));
        }
        final short s = allocate.getShort();
        if (s != blockType.getIdentifier()) {
            InternalLogger.b.a(this.c, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    short s2 = s;
                    PlainBatchFileReaderWriter.BlockType blockType2 = blockType;
                    return "Unexpected block type identifier=" + ((int) s2) + " met, was expecting " + blockType2 + "(" + ((int) blockType2.getIdentifier()) + ")";
                }
            }, null, false, null, 56, null);
            return new a(null, read);
        }
        int i = allocate.getInt();
        byte[] bArr = new byte[i];
        int read2 = inputStream.read(bArr);
        String name = blockType.name();
        StringBuilder sb = new StringBuilder();
        sb.append("Block(");
        sb.append(name);
        sb.append("):Data read");
        return c(i, read2, sb.toString()) ? new a(bArr, read + read2) : new a(null, read + Math.max(0, read2));
    }

    private final List g(final File file) {
        int f = (int) FileExtKt.f(file, this.c);
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
        int i = f;
        while (true) {
            if (i <= 0) {
                break;
            }
            try {
                a f2 = f(bufferedInputStream, BlockType.META);
                if (f2.b() != null) {
                    a f3 = f(bufferedInputStream, BlockType.EVENT);
                    i -= f2.a() + f3.a();
                    if (f3.b() == null) {
                        break;
                    }
                    arrayList.add(new bp6(f3.b(), f2.b()));
                } else {
                    i -= f2.a();
                    break;
                }
            } finally {
            }
        }
        ww8 ww8Var = ww8.a;
        gm0.a(bufferedInputStream, null);
        if (i != 0 || (f > 0 && arrayList.isEmpty())) {
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readFileData$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "File %s is probably corrupted, not all content was read.", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
        }
        return arrayList;
    }

    @Override // defpackage.t60
    public List a(final File file) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        try {
            return g(file);
        } catch (IOException e) {
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readData$1
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
            }, e, false, null, 48, null);
            return i.l();
        } catch (SecurityException e2) {
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readData$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "ERROR_READ.format(Locale.US, file.path)";
                }
            }, e2, false, null, 48, null);
            return i.l();
        }
    }

    @Override // defpackage.kf2
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(final File file, bp6 bp6Var, boolean z) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        zq3.h(bp6Var, "data");
        try {
            d(file, z, bp6Var);
            return true;
        } catch (IOException e) {
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$writeData$1
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
            }, e, false, null, 48, null);
            return false;
        } catch (SecurityException e2) {
            InternalLogger.b.b(this.c, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$writeData$2
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
        }
    }
}
