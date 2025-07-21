package com.nytimes.android.feedback.workmanager;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.nytimes.android.feedback.zendesk.ZendeskSdk;
import defpackage.d94;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class FeedbackUploadJob extends CoroutineWorker {
    public static final a Companion = new a(null);
    private final WorkerParameters g;
    private final ZendeskSdk h;
    private final d94 i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackUploadJob(Context context, WorkerParameters workerParameters, ZendeskSdk zendeskSdk, d94 d94Var) {
        super(context, workerParameters);
        zq3.h(context, "appContext");
        zq3.h(workerParameters, "workerParams");
        zq3.h(zendeskSdk, "zendesk");
        zq3.h(d94Var, "logUploader");
        this.g = workerParameters;
        this.h = zendeskSdk;
        this.i = d94Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(6:(2:3|(12:5|6|7|(4:(1:(1:(6:12|13|14|15|16|17)(2:38|39))(7:40|41|42|43|44|45|(2:47|(1:49)(3:50|16|17))(2:52|17)))(4:59|60|61|62)|25|(1:27)(1:30)|28)(7:83|(1:85)|101|87|88|89|(2:91|(1:93)(1:94))(6:96|66|67|(1:69)(1:74)|70|(1:72)(4:73|44|45|(0)(0))))|63|64|65|66|67|(0)(0)|70|(0)(0)))|66|67|(0)(0)|70|(0)(0))|104|6|7|(0)(0)|63|64|65|(2:(0)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|(4:(1:(1:(6:12|13|14|15|16|17)(2:38|39))(7:40|41|42|43|44|45|(2:47|(1:49)(3:50|16|17))(2:52|17)))(4:59|60|61|62)|25|(1:27)(1:30)|28)(7:83|(1:85)|101|87|88|89|(2:91|(1:93)(1:94))(6:96|66|67|(1:69)(1:74)|70|(1:72)(4:73|44|45|(0)(0))))|63|64|65|66|67|(0)(0)|70|(0)(0)))|104|6|7|(0)(0)|63|64|65|66|67|(0)(0)|70|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0061, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0062, code lost:
    
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x019f, code lost:
    
        if (r15 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01a1, code lost:
    
        defpackage.cc0.a(r15.delete());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01e6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0152, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e3, code lost:
    
        if (r15 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012c, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012d, code lost:
    
        r0 = r15;
        r15 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e7, code lost:
    
        if (r6.exists() != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cb A[Catch: all -> 0x014c, TryCatch #8 {all -> 0x014c, blocks: (B:16:0x018a, B:17:0x0192, B:25:0x01a9, B:27:0x01cb, B:30:0x01d9, B:45:0x0171, B:47:0x0177, B:67:0x013e, B:69:0x0146, B:70:0x0155), top: B:66:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d9 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #8 {all -> 0x014c, blocks: (B:16:0x018a, B:17:0x0192, B:25:0x01a9, B:27:0x01cb, B:30:0x01d9, B:45:0x0171, B:47:0x0177, B:67:0x013e, B:69:0x0146, B:70:0x0155), top: B:66:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177 A[Catch: all -> 0x014c, Exception -> 0x018d, TRY_LEAVE, TryCatch #3 {Exception -> 0x018d, blocks: (B:45:0x0171, B:47:0x0177), top: B:44:0x0171 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146 A[Catch: all -> 0x014c, Exception -> 0x0152, TryCatch #8 {all -> 0x014c, blocks: (B:16:0x018a, B:17:0x0192, B:25:0x01a9, B:27:0x01cb, B:30:0x01d9, B:45:0x0171, B:47:0x0177, B:67:0x013e, B:69:0x0146, B:70:0x0155), top: B:66:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.workmanager.FeedbackUploadJob.b(by0):java.lang.Object");
    }
}
