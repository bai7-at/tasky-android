package com.nytimes.android.logging.remote;

import android.app.Application;
import com.amazonaws.services.s3.AmazonS3Client;
import defpackage.by0;
import defpackage.d94;
import defpackage.g17;
import defpackage.i84;
import defpackage.ie2;
import defpackage.v84;
import defpackage.ww8;
import defpackage.zq3;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class LogUploaderImpl implements d94 {
    public static final a Companion = new a(null);
    private final Application a;
    private final v84 b;
    private final ie2 c;
    private final AmazonS3Client d;
    private final String e;
    private final String f;
    private final g17 g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LogUploaderImpl(Application application, v84 v84Var, ie2 ie2Var, AmazonS3Client amazonS3Client, String str, String str2, g17 g17Var) {
        zq3.h(v84Var, "logRecorder");
        zq3.h(ie2Var, "fileIoWrapper");
        zq3.h(amazonS3Client, "s3Client");
        zq3.h(str, "logFolderName");
        zq3.h(str2, "storagePrefix");
        zq3.h(g17Var, "retryTrigger");
        this.a = application;
        this.b = v84Var;
        this.c = ie2Var;
        this.d = amazonS3Client;
        this.e = str;
        this.f = str2;
        this.g = g17Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(i84 i84Var, File file, by0 by0Var) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new LogUploaderImpl$sendToS3$2(this, i84Var, file, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    @Override // defpackage.d94
    public Object a(i84 i84Var, by0 by0Var) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new LogUploaderImpl$deleteZippedLog$2(this, i84Var, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    @Override // defpackage.d94
    public Object b(i84 i84Var, by0 by0Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new LogUploaderImpl$uploadLogs$2(this, i84Var, null), by0Var);
    }

    @Override // defpackage.d94
    public Object c(i84 i84Var, by0 by0Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new LogUploaderImpl$retryUploadZippedLogs$2(this, i84Var, null), by0Var);
    }
}
