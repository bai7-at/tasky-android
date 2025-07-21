package com.nytimes.android.logging.remote.utils;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gm0;
import defpackage.gt2;
import defpackage.lf2;
import defpackage.ww8;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.logging.remote.utils.FileIoWrapperImpl$zipLogs$2", f = "FileIoWrapperImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FileIoWrapperImpl$zipLogs$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ List<File> $filesToZip;
    final /* synthetic */ File $zipFile;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileIoWrapperImpl$zipLogs$2(File file, List list, by0 by0Var) {
        super(2, by0Var);
        this.$zipFile = file;
        this.$filesToZip = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FileIoWrapperImpl$zipLogs$2(this.$zipFile, this.$filesToZip, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(this.$zipFile));
        zipOutputStream.setMethod(8);
        zipOutputStream.setLevel(9);
        try {
            for (File file : this.$filesToZip) {
                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                zipOutputStream.write(lf2.e(file));
                zipOutputStream.closeEntry();
            }
            ww8 ww8Var = ww8.a;
            gm0.a(zipOutputStream, null);
            return ww8.a;
        } finally {
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FileIoWrapperImpl$zipLogs$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
