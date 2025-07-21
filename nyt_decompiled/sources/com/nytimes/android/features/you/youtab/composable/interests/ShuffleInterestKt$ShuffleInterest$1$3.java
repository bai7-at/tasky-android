package com.nytimes.android.features.you.youtab.composable.interests;

import androidx.compose.runtime.y;
import com.comscore.streaming.AdvertisementType;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.saved.SaveHandler;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$3", f = "ShuffleInterest.kt", l = {AdvertisementType.ON_DEMAND_PRE_ROLL}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShuffleInterestKt$ShuffleInterest$1$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ x08 $currentItem$delegate;
    final /* synthetic */ SaveHandler $saveHandler;
    final /* synthetic */ sy4 $saved;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ sy4 a;

        a(sy4 sy4Var) {
            this.a = sy4Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Boolean bool, by0 by0Var) {
            this.a.setValue(cc0.a(bool != null ? bool.booleanValue() : false));
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShuffleInterestKt$ShuffleInterest$1$3(x08 x08Var, SaveHandler saveHandler, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$currentItem$delegate = x08Var;
        this.$saveHandler = saveHandler;
        this.$saved = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ShuffleInterestKt$ShuffleInterest$1$3(this.$currentItem$delegate, this.$saveHandler, this.$saved, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final x08 x08Var = this.$currentItem$delegate;
            final SaveHandler saveHandler = this.$saveHandler;
            Flow p = y.p(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$3.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    Interest.PersonalizedItem b;
                    InterestAsset b2;
                    b = ShuffleInterestKt.b(x08.this);
                    if (b == null || (b2 = b.b()) == null) {
                        return null;
                    }
                    return Boolean.valueOf(saveHandler.p(ShuffleInterestKt.h(b2)));
                }
            });
            a aVar = new a(this.$saved);
            this.label = 1;
            if (p.collect(aVar, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ShuffleInterestKt$ShuffleInterest$1$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
