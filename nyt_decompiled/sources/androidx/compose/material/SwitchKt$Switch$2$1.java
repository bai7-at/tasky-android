package androidx.compose.material;

import androidx.compose.runtime.y;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.internal.ws.WebSocketProtocol;

@fc1(c = "androidx.compose.material.SwitchKt$Switch$2$1", f = "Switch.kt", l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SwitchKt$Switch$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AnchoredDraggableState $anchoredDraggableState;
    final /* synthetic */ x08 $currentChecked$delegate;
    final /* synthetic */ x08 $currentOnCheckedChange$delegate;
    final /* synthetic */ sy4 $forceAnimationCheck$delegate;
    int label;

    @fc1(c = "androidx.compose.material.SwitchKt$Switch$2$1$2", f = "Switch.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SwitchKt$Switch$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ x08 $currentChecked$delegate;
        final /* synthetic */ x08 $currentOnCheckedChange$delegate;
        final /* synthetic */ sy4 $forceAnimationCheck$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(x08 x08Var, x08 x08Var2, sy4 sy4Var, by0 by0Var) {
            super(2, by0Var);
            this.$currentChecked$delegate = x08Var;
            this.$currentOnCheckedChange$delegate = x08Var2;
            this.$forceAnimationCheck$delegate = sy4Var;
        }

        public final Object b(boolean z, by0 by0Var) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, by0Var);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (by0) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean e;
            ss2 d;
            boolean b;
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            boolean z = this.Z$0;
            e = SwitchKt.e(this.$currentChecked$delegate);
            if (e != z) {
                d = SwitchKt.d(this.$currentOnCheckedChange$delegate);
                if (d != null) {
                    d.invoke(cc0.a(z));
                }
                sy4 sy4Var = this.$forceAnimationCheck$delegate;
                b = SwitchKt.b(sy4Var);
                SwitchKt.c(sy4Var, !b);
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchKt$Switch$2$1(AnchoredDraggableState anchoredDraggableState, x08 x08Var, x08 x08Var2, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$currentChecked$delegate = x08Var;
        this.$currentOnCheckedChange$delegate = x08Var2;
        this.$forceAnimationCheck$delegate = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SwitchKt$Switch$2$1(this.$anchoredDraggableState, this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            final AnchoredDraggableState anchoredDraggableState = this.$anchoredDraggableState;
            Flow p = y.p(new qs2() { // from class: androidx.compose.material.SwitchKt$Switch$2$1.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    return (Boolean) AnchoredDraggableState.this.r();
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(p, anonymousClass2, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SwitchKt$Switch$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
