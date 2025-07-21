package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fs4;
import defpackage.gt2;
import defpackage.s16;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import org.threeten.bp.LocalDateTime;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$setLastMessageDateTime$2", f = "MessagePreferencesStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MessagePreferencesStore$setLastMessageDateTime$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ LocalDateTime $dateTime;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessagePreferencesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessagePreferencesStore$setLastMessageDateTime$2(MessagePreferencesStore messagePreferencesStore, LocalDateTime localDateTime, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = messagePreferencesStore;
        this.$dateTime = localDateTime;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        MessagePreferencesStore$setLastMessageDateTime$2 messagePreferencesStore$setLastMessageDateTime$2 = new MessagePreferencesStore$setLastMessageDateTime$2(this.this$0, this.$dateTime, by0Var);
        messagePreferencesStore$setLastMessageDateTime$2.L$0 = obj;
        return messagePreferencesStore$setLastMessageDateTime$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((MessagePreferencesStore$setLastMessageDateTime$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s16.a aVar;
        fs4 fs4Var;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        aVar = this.this$0.c;
        fs4Var = this.this$0.a;
        String a = fs4Var.a(this.$dateTime);
        zq3.e(a);
        mutablePreferences.j(aVar, a);
        return ww8.a;
    }
}
