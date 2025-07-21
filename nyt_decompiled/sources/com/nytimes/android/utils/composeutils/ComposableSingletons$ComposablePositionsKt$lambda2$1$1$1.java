package com.nytimes.android.utils.composeutils;

import defpackage.as0;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sy4;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.nytimes.android.utils.composeutils.ComposableSingletons$ComposablePositionsKt$lambda-2$1$1$1", f = "ComposablePositions.kt", l = {127}, m = "invokeSuspend")
/* renamed from: com.nytimes.android.utils.composeutils.ComposableSingletons$ComposablePositionsKt$lambda-2$1$1$1, reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$ComposablePositionsKt$lambda2$1$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ sy4 $offset$delegate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposableSingletons$ComposablePositionsKt$lambda2$1$1$1(sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$offset$delegate = sy4Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Map map, by0 by0Var) {
        return ((ComposableSingletons$ComposablePositionsKt$lambda2$1$1$1) create(map, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ComposableSingletons$ComposablePositionsKt$lambda2$1$1$1 composableSingletons$ComposablePositionsKt$lambda2$1$1$1 = new ComposableSingletons$ComposablePositionsKt$lambda2$1$1$1(this.$offset$delegate, by0Var);
        composableSingletons$ComposablePositionsKt$lambda2$1$1$1.L$0 = obj;
        return composableSingletons$ComposablePositionsKt$lambda2$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Map map2 = (Map) this.L$0;
            this.L$0 = map2;
            this.label = 1;
            if (DelayKt.delay(100L, this) == h) {
                return h;
            }
            map = map2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) this.L$0;
            f.b(obj);
        }
        as0 as0Var = (as0) map.get("exampleText");
        if (as0Var != null) {
            ComposableSingletons$ComposablePositionsKt$lambda2$1.d(this.$offset$delegate, as0Var.c());
        }
        return ww8.a;
    }
}
