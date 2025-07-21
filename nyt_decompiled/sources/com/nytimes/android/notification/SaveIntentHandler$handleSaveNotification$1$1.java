package com.nytimes.android.notification;

import android.content.Context;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@fc1(c = "com.nytimes.android.notification.SaveIntentHandler$handleSaveNotification$1$1", f = "SaveIntentHandler.kt", l = {59, LockFreeTaskQueueCore.FROZEN_SHIFT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SaveIntentHandler$handleSaveNotification$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $assetUri;
    final /* synthetic */ String $assetUrl;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ SaveIntentHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveIntentHandler$handleSaveNotification$1$1(SaveIntentHandler saveIntentHandler, String str, String str2, Context context, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = saveIntentHandler;
        this.$assetUri = str;
        this.$assetUrl = str2;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SaveIntentHandler$handleSaveNotification$1$1(this.this$0, this.$assetUri, this.$assetUrl, this.$context, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0074 A[Catch: Exception -> 0x0013, TRY_LEAVE, TryCatch #0 {Exception -> 0x0013, blocks: (B:6:0x000f, B:7:0x006e, B:9:0x0074, B:16:0x001e, B:17:0x0047, B:21:0x0025), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r13.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.f.b(r14)     // Catch: java.lang.Exception -> L13
            goto L6e
        L13:
            r13 = move-exception
            goto L8f
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L1e:
            kotlin.f.b(r14)     // Catch: java.lang.Exception -> L13
            goto L47
        L22:
            kotlin.f.b(r14)
            com.nytimes.android.notification.SaveIntentHandler r14 = r13.this$0     // Catch: java.lang.Exception -> L13
            b04 r14 = com.nytimes.android.notification.SaveIntentHandler.d(r14)     // Catch: java.lang.Exception -> L13
            java.lang.Object r14 = r14.get()     // Catch: java.lang.Exception -> L13
            com.nytimes.android.assetretriever.AssetRetriever r14 = (com.nytimes.android.assetretriever.AssetRetriever) r14     // Catch: java.lang.Exception -> L13
            com.nytimes.android.assetretriever.e$a r1 = com.nytimes.android.assetretriever.e.Companion     // Catch: java.lang.Exception -> L13
            java.lang.String r5 = r13.$assetUri     // Catch: java.lang.Exception -> L13
            java.lang.String r6 = r13.$assetUrl     // Catch: java.lang.Exception -> L13
            com.nytimes.android.assetretriever.e r1 = r1.c(r5, r6)     // Catch: java.lang.Exception -> L13
            st[] r5 = new defpackage.st[r2]     // Catch: java.lang.Exception -> L13
            r13.label = r4     // Catch: java.lang.Exception -> L13
            r6 = 0
            java.lang.Object r14 = r14.o(r1, r6, r5, r13)     // Catch: java.lang.Exception -> L13
            if (r14 != r0) goto L47
            return r0
        L47:
            com.nytimes.android.api.cms.Asset r14 = (com.nytimes.android.api.cms.Asset) r14     // Catch: java.lang.Exception -> L13
            com.nytimes.android.notification.SaveIntentHandler r1 = r13.this$0     // Catch: java.lang.Exception -> L13
            b04 r1 = com.nytimes.android.notification.SaveIntentHandler.e(r1)     // Catch: java.lang.Exception -> L13
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L13
            java.lang.String r5 = "get(...)"
            defpackage.zq3.g(r1, r5)     // Catch: java.lang.Exception -> L13
            r6 = r1
            com.nytimes.android.saved.SaveHandler r6 = (com.nytimes.android.saved.SaveHandler) r6     // Catch: java.lang.Exception -> L13
            s87 r8 = defpackage.d87.a(r14)     // Catch: java.lang.Exception -> L13
            com.nytimes.android.utils.SaveOrigin r9 = com.nytimes.android.utils.SaveOrigin.ARTICLE_FRONT     // Catch: java.lang.Exception -> L13
            r13.label = r3     // Catch: java.lang.Exception -> L13
            r7 = 0
            r11 = 1
            r12 = 0
            r10 = r13
            java.lang.Object r14 = com.nytimes.android.saved.SaveHandler.s(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L13
            if (r14 != r0) goto L6e
            return r0
        L6e:
            com.nytimes.android.saved.SaveHandler$SaveResult r14 = (com.nytimes.android.saved.SaveHandler.SaveResult) r14     // Catch: java.lang.Exception -> L13
            com.nytimes.android.saved.SaveHandler$SaveResult r0 = com.nytimes.android.saved.SaveHandler.SaveResult.Success     // Catch: java.lang.Exception -> L13
            if (r14 != r0) goto L96
            com.nytimes.android.notification.SaveIntentHandler r14 = r13.this$0     // Catch: java.lang.Exception -> L13
            b04 r14 = com.nytimes.android.notification.SaveIntentHandler.f(r14)     // Catch: java.lang.Exception -> L13
            java.lang.Object r14 = r14.get()     // Catch: java.lang.Exception -> L13
            com.nytimes.android.saved.SavedManager r14 = (com.nytimes.android.saved.SavedManager) r14     // Catch: java.lang.Exception -> L13
            r14.syncCache()     // Catch: java.lang.Exception -> L13
            android.content.Context r13 = r13.$context     // Catch: java.lang.Exception -> L13
            int r14 = defpackage.cm6.save_success     // Catch: java.lang.Exception -> L13
            android.widget.Toast r13 = android.widget.Toast.makeText(r13, r14, r4)     // Catch: java.lang.Exception -> L13
            r13.show()     // Catch: java.lang.Exception -> L13
            goto L96
        L8f:
            java.lang.String r14 = "There was an error saving article"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.nytimes.android.logging.NYTLogger.i(r13, r14, r0)
        L96:
            ww8 r13 = defpackage.ww8.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.notification.SaveIntentHandler$handleSaveNotification$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SaveIntentHandler$handleSaveNotification$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
