package com.datadog.android.core.internal.persistence.file;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import defpackage.j12;
import defpackage.qs2;
import defpackage.re2;
import defpackage.zq3;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class EncryptedFileReaderWriter implements re2 {
    public static final a e = new a(null);
    private final re2 c;
    private final InternalLogger d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public EncryptedFileReaderWriter(j12 j12Var, re2 re2Var, InternalLogger internalLogger) {
        zq3.h(j12Var, "encryption");
        zq3.h(re2Var, "delegate");
        zq3.h(internalLogger, "internalLogger");
        this.c = re2Var;
        this.d = internalLogger;
    }

    @Override // defpackage.qe2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] a(File file) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        throw null;
    }

    @Override // defpackage.kf2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file, byte[] bArr, boolean z) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        zq3.h(bArr, "data");
        if (!z) {
            throw null;
        }
        InternalLogger.b.a(this.d, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.persistence.file.EncryptedFileReaderWriter$writeData$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return "Append mode is not supported, use EncryptedBatchFileReaderWriter instead.";
            }
        }, null, false, null, 56, null);
        return false;
    }
}
