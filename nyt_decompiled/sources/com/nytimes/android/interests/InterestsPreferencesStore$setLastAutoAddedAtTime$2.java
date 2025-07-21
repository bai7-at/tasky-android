package com.nytimes.android.interests;

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

@fc1(c = "com.nytimes.android.interests.InterestsPreferencesStore$setLastAutoAddedAtTime$2", f = "InterestsPreferencesStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsPreferencesStore$setLastAutoAddedAtTime$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $dateTimeEpochSeconds;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InterestsPreferencesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsPreferencesStore$setLastAutoAddedAtTime$2(InterestsPreferencesStore interestsPreferencesStore, long j, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = interestsPreferencesStore;
        this.$dateTimeEpochSeconds = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        InterestsPreferencesStore$setLastAutoAddedAtTime$2 interestsPreferencesStore$setLastAutoAddedAtTime$2 = new InterestsPreferencesStore$setLastAutoAddedAtTime$2(this.this$0, this.$dateTimeEpochSeconds, by0Var);
        interestsPreferencesStore$setLastAutoAddedAtTime$2.L$0 = obj;
        return interestsPreferencesStore$setLastAutoAddedAtTime$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((InterestsPreferencesStore$setLastAutoAddedAtTime$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
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
        aVar = this.this$0.c;
        mutablePreferences.j(aVar, cc0.d(this.$dateTimeEpochSeconds));
        return ww8.a;
    }
}
