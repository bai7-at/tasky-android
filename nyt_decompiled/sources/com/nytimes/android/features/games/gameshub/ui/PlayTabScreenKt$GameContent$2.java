package com.nytimes.android.features.games.gameshub.ui;

import androidx.compose.runtime.y;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import com.comscore.streaming.AdvertisementType;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabSection;
import defpackage.by0;
import defpackage.cc0;
import defpackage.dv5;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jv5;
import defpackage.p14;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$2", f = "PlayTabScreen.kt", l = {AdvertisementType.ON_DEMAND_PRE_ROLL}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PlayTabScreenKt$GameContent$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ f $activity;
    final /* synthetic */ dv5 $entryPoint;
    final /* synthetic */ List<PlayTabSection> $playTabSections;
    final /* synthetic */ jv5 $playTabState;
    int label;

    @fc1(c = "com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$2$2", f = "PlayTabScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass2(by0 by0Var) {
            super(2, by0Var);
        }

        public final Object b(boolean z, by0 by0Var) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (by0) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            return cc0.a(this.Z$0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayTabScreenKt$GameContent$2(f fVar, dv5 dv5Var, jv5 jv5Var, List list, by0 by0Var) {
        super(2, by0Var);
        this.$activity = fVar;
        this.$entryPoint = dv5Var;
        this.$playTabState = jv5Var;
        this.$playTabSections = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PlayTabScreenKt$GameContent$2(this.$activity, this.$entryPoint, this.$playTabState, this.$playTabSections, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            final jv5 jv5Var = this.$playTabState;
            final List<PlayTabSection> list = this.$playTabSections;
            final dv5 dv5Var = this.$entryPoint;
            Flow p = y.p(new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt$GameContent$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    return Boolean.valueOf(p14.a(jv5.this.d(), list.size()) >= dv5Var.b0().y());
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 1;
            if (FlowKt.first(p, anonymousClass2, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        FragmentManager supportFragmentManager = this.$activity.getSupportFragmentManager();
        zq3.g(supportFragmentManager, "getSupportFragmentManager(...)");
        this.$entryPoint.M().g(supportFragmentManager);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PlayTabScreenKt$GameContent$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
