package com.nytimes.android.saved;

import android.content.Context;
import android.widget.Toast;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.saved.SavedManagerModule$Companion$provideDevSettingItem$1", f = "SavedManagerModule.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedManagerModule$Companion$provideDevSettingItem$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ SavedManager $savedManager;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedManagerModule$Companion$provideDevSettingItem$1(SavedManager savedManager, by0 by0Var) {
        super(2, by0Var);
        this.$savedManager = savedManager;
    }

    private static final void c(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((SavedManagerModule$Companion$provideDevSettingItem$1) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SavedManagerModule$Companion$provideDevSettingItem$1 savedManagerModule$Companion$provideDevSettingItem$1 = new SavedManagerModule$Companion$provideDevSettingItem$1(this.$savedManager, by0Var);
        savedManagerModule$Companion$provideDevSettingItem$1.L$0 = obj;
        return savedManagerModule$Companion$provideDevSettingItem$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r4 = r4.L$0
            android.content.Context r4 = (android.content.Context) r4
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L13
            goto L32
        L13:
            r5 = move-exception
            goto L3c
        L15:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L1d:
            kotlin.f.b(r5)
            java.lang.Object r5 = r4.L$0
            android.content.Context r5 = (android.content.Context) r5
            com.nytimes.android.saved.SavedManager r1 = r4.$savedManager     // Catch: java.lang.Exception -> L38
            r4.L$0 = r5     // Catch: java.lang.Exception -> L38
            r4.label = r2     // Catch: java.lang.Exception -> L38
            java.lang.Object r4 = r1.deleteAllTheAssets(r4)     // Catch: java.lang.Exception -> L38
            if (r4 != r0) goto L31
            return r0
        L31:
            r4 = r5
        L32:
            java.lang.String r5 = "Saved for Later entries have been cleared"
            c(r4, r5)     // Catch: java.lang.Exception -> L13
            goto L47
        L38:
            r4 = move-exception
            r3 = r5
            r5 = r4
            r4 = r3
        L3c:
            java.lang.String r5 = r5.getMessage()
            if (r5 != 0) goto L44
            java.lang.String r5 = "No stack trace available"
        L44:
            c(r4, r5)
        L47:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.SavedManagerModule$Companion$provideDevSettingItem$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
