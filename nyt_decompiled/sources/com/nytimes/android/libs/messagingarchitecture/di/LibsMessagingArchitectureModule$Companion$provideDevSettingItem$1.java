package com.nytimes.android.libs.messagingarchitecture.di;

import android.content.Context;
import com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore;
import com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.di.LibsMessagingArchitectureModule$Companion$provideDevSettingItem$1", f = "LibsMessagingArchitectureModule.kt", l = {180, 181}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LibsMessagingArchitectureModule$Companion$provideDevSettingItem$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ MessagePreferencesStore $messagePreferences;
    final /* synthetic */ MessageQueueUpdater $messageQueueUpdater;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LibsMessagingArchitectureModule$Companion$provideDevSettingItem$1(MessagePreferencesStore messagePreferencesStore, MessageQueueUpdater messageQueueUpdater, by0 by0Var) {
        super(2, by0Var);
        this.$messagePreferences = messagePreferencesStore;
        this.$messageQueueUpdater = messageQueueUpdater;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((LibsMessagingArchitectureModule$Companion$provideDevSettingItem$1) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LibsMessagingArchitectureModule$Companion$provideDevSettingItem$1(this.$messagePreferences, this.$messageQueueUpdater, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            MessagePreferencesStore messagePreferencesStore = this.$messagePreferences;
            this.label = 1;
            if (messagePreferencesStore.e(this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
                return ww8.a;
            }
            kotlin.f.b(obj);
        }
        MessageQueueUpdater messageQueueUpdater = this.$messageQueueUpdater;
        this.label = 2;
        if (messageQueueUpdater.c(this) == h) {
            return h;
        }
        return ww8.a;
    }
}
