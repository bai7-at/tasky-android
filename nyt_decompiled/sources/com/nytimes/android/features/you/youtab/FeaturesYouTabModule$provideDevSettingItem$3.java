package com.nytimes.android.features.you.youtab;

import android.content.Context;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.nytimes.android.interests.InterestsManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.you.youtab.FeaturesYouTabModule$provideDevSettingItem$3", f = "FeaturesYouTabModule.kt", l = {MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeaturesYouTabModule$provideDevSettingItem$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ InterestsManager $interestsManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeaturesYouTabModule$provideDevSettingItem$3(InterestsManager interestsManager, by0 by0Var) {
        super(2, by0Var);
        this.$interestsManager = interestsManager;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((FeaturesYouTabModule$provideDevSettingItem$3) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FeaturesYouTabModule$provideDevSettingItem$3(this.$interestsManager, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            InterestsManager interestsManager = this.$interestsManager;
            this.label = 1;
            if (interestsManager.g(this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}
