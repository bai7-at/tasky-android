package com.nytimes.android.features.games.gameshub;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.games.gameshub.PlayTabPreferencesStore$isNew$2", f = "PlayTabPreferences.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PlayTabPreferencesStore$isNew$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $isNew;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayTabPreferencesStore$isNew$2(boolean z, by0 by0Var) {
        super(2, by0Var);
        this.$isNew = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PlayTabPreferencesStore$isNew$2 playTabPreferencesStore$isNew$2 = new PlayTabPreferencesStore$isNew$2(this.$isNew, by0Var);
        playTabPreferencesStore$isNew$2.L$0 = obj;
        return playTabPreferencesStore$isNew$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((PlayTabPreferencesStore$isNew$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ((MutablePreferences) this.L$0).j(PlayTabPreferencesStore.Companion.a(), cc0.a(this.$isNew));
        return ww8.a;
    }
}
