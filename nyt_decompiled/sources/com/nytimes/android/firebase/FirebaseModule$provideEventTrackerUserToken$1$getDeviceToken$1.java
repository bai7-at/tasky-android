package com.nytimes.android.firebase;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.firebase.FirebaseModule$provideEventTrackerUserToken$1", f = "FirebaseModule.kt", l = {92}, m = "getDeviceToken")
/* loaded from: classes4.dex */
final class FirebaseModule$provideEventTrackerUserToken$1$getDeviceToken$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseModule$provideEventTrackerUserToken$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FirebaseModule$provideEventTrackerUserToken$1$getDeviceToken$1(FirebaseModule$provideEventTrackerUserToken$1 firebaseModule$provideEventTrackerUserToken$1, by0 by0Var) {
        super(by0Var);
        this.this$0 = firebaseModule$provideEventTrackerUserToken$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
