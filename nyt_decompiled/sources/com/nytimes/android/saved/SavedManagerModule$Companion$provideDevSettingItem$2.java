package com.nytimes.android.saved;

import android.content.Context;
import android.widget.Toast;
import com.nytimes.android.saved.synchronization.SavedExperimentOption;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.saved.SavedManagerModule$Companion$provideDevSettingItem$2", f = "SavedManagerModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedManagerModule$Companion$provideDevSettingItem$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    SavedManagerModule$Companion$provideDevSettingItem$2(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((SavedManagerModule$Companion$provideDevSettingItem$2) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SavedManagerModule$Companion$provideDevSettingItem$2 savedManagerModule$Companion$provideDevSettingItem$2 = new SavedManagerModule$Companion$provideDevSettingItem$2(by0Var);
        savedManagerModule$Companion$provideDevSettingItem$2.L$0 = obj;
        return savedManagerModule$Companion$provideDevSettingItem$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Context context = (Context) this.L$0;
        Toast.makeText(context, "Current value: " + SavedExperimentOption.Modals.isEnabled(context), 0).show();
        return ww8.a;
    }
}
