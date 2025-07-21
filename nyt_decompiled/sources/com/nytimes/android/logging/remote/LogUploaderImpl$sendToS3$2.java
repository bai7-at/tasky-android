package com.nytimes.android.logging.remote;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i84;
import defpackage.ww8;
import java.io.File;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.logging.remote.LogUploaderImpl$sendToS3$2", f = "LogUploaderImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LogUploaderImpl$sendToS3$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ i84 $logId;
    final /* synthetic */ File $zipFile;
    int label;
    final /* synthetic */ LogUploaderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogUploaderImpl$sendToS3$2(LogUploaderImpl logUploaderImpl, i84 i84Var, File file, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = logUploaderImpl;
        this.$logId = i84Var;
        this.$zipFile = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LogUploaderImpl$sendToS3$2(this.this$0, this.$logId, this.$zipFile, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        AmazonS3Client amazonS3Client;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        str = this.this$0.e;
        String str3 = "mobile-android-logging/" + str + "/internal/logging/app-logs/" + this.$logId.a() + "/" + this.$zipFile.getName();
        str2 = this.this$0.f;
        PutObjectRequest putObjectRequest = new PutObjectRequest(str2, str3, this.$zipFile);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setHeader(Headers.S3_CANNED_ACL, "bucket-owner-full-control");
        PutObjectRequest withMetadata = putObjectRequest.withMetadata(objectMetadata);
        amazonS3Client = this.this$0.d;
        return amazonS3Client.putObject(withMetadata);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LogUploaderImpl$sendToS3$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
