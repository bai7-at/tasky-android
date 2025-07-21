package com.nytimes.android.fragment;

import androidx.compose.animation.core.Animatable;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.kt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.nytimes.android.fragment.VerticalScrollStateKt$animateToolbarHeightAlways$2", f = "VerticalScrollState.kt", l = {ContentType.USER_GENERATED_LIVE, 124}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class VerticalScrollStateKt$animateToolbarHeightAlways$2 extends SuspendLambda implements kt2 {
    /* synthetic */ float F$0;
    /* synthetic */ Object L$0;
    int label;

    VerticalScrollStateKt$animateToolbarHeightAlways$2(by0 by0Var) {
        super(4, by0Var);
    }

    public final Object b(b bVar, Animatable animatable, float f, by0 by0Var) {
        VerticalScrollStateKt$animateToolbarHeightAlways$2 verticalScrollStateKt$animateToolbarHeightAlways$2 = new VerticalScrollStateKt$animateToolbarHeightAlways$2(by0Var);
        verticalScrollStateKt$animateToolbarHeightAlways$2.L$0 = animatable;
        verticalScrollStateKt$animateToolbarHeightAlways$2.F$0 = f;
        return verticalScrollStateKt$animateToolbarHeightAlways$2.invokeSuspend(ww8.a);
    }

    @Override // defpackage.kt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return b((b) obj, (Animatable) obj2, ((Number) obj3).floatValue(), (by0) obj4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        Animatable animatable;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Animatable animatable2 = (Animatable) this.L$0;
            f = this.F$0;
            this.L$0 = animatable2;
            this.F$0 = f;
            this.label = 1;
            if (DelayKt.delay(150L, this) == h) {
                return h;
            }
            animatable = animatable2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            f = this.F$0;
            animatable = (Animatable) this.L$0;
            f.b(obj);
        }
        Float b = cc0.b(f);
        this.L$0 = null;
        this.label = 2;
        if (Animatable.f(animatable, b, null, null, null, this, 14, null) == h) {
            return h;
        }
        return ww8.a;
    }
}
