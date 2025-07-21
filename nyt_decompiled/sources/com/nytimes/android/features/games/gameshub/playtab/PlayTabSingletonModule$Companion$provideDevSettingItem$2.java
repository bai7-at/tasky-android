package com.nytimes.android.features.games.gameshub.playtab;

import android.content.Context;
import com.nytimes.android.features.games.gameshub.PlayTabPreferencesStore;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.games.gameshub.playtab.PlayTabSingletonModule$Companion$provideDevSettingItem$2", f = "PlayTabSingletonModule.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PlayTabSingletonModule$Companion$provideDevSettingItem$2 extends SuspendLambda implements it2 {
    final /* synthetic */ PlayTabPreferencesStore $playTabPreferencesStore;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayTabSingletonModule$Companion$provideDevSettingItem$2(PlayTabPreferencesStore playTabPreferencesStore, by0 by0Var) {
        super(3, by0Var);
        this.$playTabPreferencesStore = playTabPreferencesStore;
    }

    public final Object b(Context context, boolean z, by0 by0Var) {
        PlayTabSingletonModule$Companion$provideDevSettingItem$2 playTabSingletonModule$Companion$provideDevSettingItem$2 = new PlayTabSingletonModule$Companion$provideDevSettingItem$2(this.$playTabPreferencesStore, by0Var);
        playTabSingletonModule$Companion$provideDevSettingItem$2.Z$0 = z;
        return playTabSingletonModule$Companion$provideDevSettingItem$2.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((Context) obj, ((Boolean) obj2).booleanValue(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            boolean z = this.Z$0;
            PlayTabPreferencesStore playTabPreferencesStore = this.$playTabPreferencesStore;
            this.label = 1;
            obj = playTabPreferencesStore.c(z, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }
}
