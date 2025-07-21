package com.nytimes.android;

import com.nytimes.android.saved.SavedManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.NYTApplication$initSavedManager$1", f = "NYTApplication.kt", l = {364}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NYTApplication$initSavedManager$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ NYTApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NYTApplication$initSavedManager$1(NYTApplication nYTApplication, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = nYTApplication;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Boolean bool, by0 by0Var) {
        return ((NYTApplication$initSavedManager$1) create(bool, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NYTApplication$initSavedManager$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            SavedManager savedManager = (SavedManager) this.this$0.M().get();
            this.label = 1;
            if (savedManager.syncCacheSuspending(this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
