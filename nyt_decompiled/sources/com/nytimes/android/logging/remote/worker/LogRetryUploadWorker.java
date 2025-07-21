package com.nytimes.android.logging.remote.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.d94;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class LogRetryUploadWorker extends CoroutineWorker {
    private final Context g;
    private final d94 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogRetryUploadWorker(Context context, WorkerParameters workerParameters, d94 d94Var) {
        super(context, workerParameters);
        zq3.h(context, "context");
        zq3.h(workerParameters, "params");
        zq3.h(d94Var, "logUploader");
        this.g = context;
        this.h = d94Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.work.b$a] */
    /* JADX WARN: Type inference failed for: r11v7, types: [androidx.work.b$a] */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.work.b$a] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.logging.remote.worker.LogRetryUploadWorker.b(by0):java.lang.Object");
    }
}
