package com.nytimes.android.utils;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX WARN: Incorrect field signature: TV; */
@fc1(c = "com.nytimes.android.utils.AudioIndicatorDismissBehavior$balloonHeightState$1$1$1", f = "AudioIndicatorDismissBehavior.kt", l = {AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AudioIndicatorDismissBehavior$balloonHeightState$1$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ View $child;
    final /* synthetic */ CoordinatorLayout $parent;
    final /* synthetic */ MutableStateFlow<Integer> $state;
    int label;
    final /* synthetic */ AudioIndicatorDismissBehavior<V> this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ AudioIndicatorDismissBehavior a;
        final /* synthetic */ CoordinatorLayout b;
        final /* synthetic */ View c;

        a(AudioIndicatorDismissBehavior audioIndicatorDismissBehavior, CoordinatorLayout coordinatorLayout, View view) {
            this.a = audioIndicatorDismissBehavior;
            this.b = coordinatorLayout;
            this.c = view;
        }

        public final Object a(int i, by0 by0Var) {
            this.a.r(this.b, this.c, i);
            return ww8.a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, by0 by0Var) {
            return a(((Number) obj).intValue(), by0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioIndicatorDismissBehavior$balloonHeightState$1$1$1(MutableStateFlow mutableStateFlow, AudioIndicatorDismissBehavior audioIndicatorDismissBehavior, CoordinatorLayout coordinatorLayout, View view, by0 by0Var) {
        super(2, by0Var);
        this.$state = mutableStateFlow;
        this.this$0 = audioIndicatorDismissBehavior;
        this.$parent = coordinatorLayout;
        this.$child = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AudioIndicatorDismissBehavior$balloonHeightState$1$1$1(this.$state, this.this$0, this.$parent, this.$child, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            MutableStateFlow<Integer> mutableStateFlow = this.$state;
            a aVar = new a(this.this$0, this.$parent, this.$child);
            this.label = 1;
            if (mutableStateFlow.collect(aVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AudioIndicatorDismissBehavior$balloonHeightState$1$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
