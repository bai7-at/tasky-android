package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s16;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$activateLocalMessageOverride$2", f = "MessagePreferencesStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MessagePreferencesStore$activateLocalMessageOverride$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessagePreferencesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessagePreferencesStore$activateLocalMessageOverride$2(MessagePreferencesStore messagePreferencesStore, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = messagePreferencesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        MessagePreferencesStore$activateLocalMessageOverride$2 messagePreferencesStore$activateLocalMessageOverride$2 = new MessagePreferencesStore$activateLocalMessageOverride$2(this.this$0, by0Var);
        messagePreferencesStore$activateLocalMessageOverride$2.L$0 = obj;
        return messagePreferencesStore$activateLocalMessageOverride$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((MessagePreferencesStore$activateLocalMessageOverride$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s16.a aVar;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        aVar = this.this$0.d;
        mutablePreferences.j(aVar, cc0.a(true));
        return ww8.a;
    }
}
