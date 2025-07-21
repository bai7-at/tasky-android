package com.nytimes.android.features.you.youtab;

import android.content.Context;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.you.youtab.FeaturesYouTabModule$provideDevSettingItem$7", f = "FeaturesYouTabModule.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeaturesYouTabModule$provideDevSettingItem$7 extends SuspendLambda implements it2 {
    final /* synthetic */ YouTabPreferencesStore $youTabPreferencesStore;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeaturesYouTabModule$provideDevSettingItem$7(YouTabPreferencesStore youTabPreferencesStore, by0 by0Var) {
        super(3, by0Var);
        this.$youTabPreferencesStore = youTabPreferencesStore;
    }

    public final Object b(Context context, boolean z, by0 by0Var) {
        FeaturesYouTabModule$provideDevSettingItem$7 featuresYouTabModule$provideDevSettingItem$7 = new FeaturesYouTabModule$provideDevSettingItem$7(this.$youTabPreferencesStore, by0Var);
        featuresYouTabModule$provideDevSettingItem$7.Z$0 = z;
        return featuresYouTabModule$provideDevSettingItem$7.invokeSuspend(ww8.a);
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
            YouTabPreferencesStore youTabPreferencesStore = this.$youTabPreferencesStore;
            this.label = 1;
            obj = youTabPreferencesStore.c(z, this);
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
