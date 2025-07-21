package com.nytimes.android.features.you.youtab.composable.interests.filter;

import androidx.compose.runtime.y;
import com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.saved.SaveHandler;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$1", f = "FilterInterestImageWithHeadline.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ InterestAsset $asset;
    final /* synthetic */ SaveHandler $saveHandler;
    final /* synthetic */ sy4 $saved;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ sy4 a;

        a(sy4 sy4Var) {
            this.a = sy4Var;
        }

        public final Object a(boolean z, by0 by0Var) {
            this.a.setValue(cc0.a(z));
            return ww8.a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, by0 by0Var) {
            return a(((Boolean) obj).booleanValue(), by0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$1(SaveHandler saveHandler, InterestAsset interestAsset, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$saveHandler = saveHandler;
        this.$asset = interestAsset;
        this.$saved = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$1(this.$saveHandler, this.$asset, this.$saved, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final SaveHandler saveHandler = this.$saveHandler;
            final InterestAsset interestAsset = this.$asset;
            Flow p = y.p(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    return Boolean.valueOf(SaveHandler.this.p(ShuffleInterestKt.h(interestAsset)));
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
        return ((FilterInterestImageWithHeadlineKt$FilterInterestImageWithHeadline$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
