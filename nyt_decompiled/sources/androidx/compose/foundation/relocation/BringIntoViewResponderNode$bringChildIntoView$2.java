package androidx.compose.foundation.relocation;

import defpackage.by0;
import defpackage.cz3;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kt6;
import defpackage.pc0;
import defpackage.qs2;
import defpackage.rc0;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@fc1(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BringIntoViewResponderNode$bringChildIntoView$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $boundsProvider;
    final /* synthetic */ cz3 $childCoordinates;
    final /* synthetic */ qs2 $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BringIntoViewResponderNode this$0;

    @fc1(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", l = {176}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ qs2 $boundsProvider;
        final /* synthetic */ cz3 $childCoordinates;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* synthetic */ class C00321 extends FunctionReferenceImpl implements qs2 {
            final /* synthetic */ qs2 $boundsProvider;
            final /* synthetic */ cz3 $childCoordinates;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00321(BringIntoViewResponderNode bringIntoViewResponderNode, cz3 cz3Var, qs2 qs2Var) {
                super(0, zq3.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = bringIntoViewResponderNode;
                this.$childCoordinates = cz3Var;
                this.$boundsProvider = qs2Var;
            }

            @Override // defpackage.qs2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final kt6 mo865invoke() {
                kt6 i2;
                i2 = BringIntoViewResponderNode.i2(this.this$0, this.$childCoordinates, this.$boundsProvider);
                return i2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BringIntoViewResponderNode bringIntoViewResponderNode, cz3 cz3Var, qs2 qs2Var, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = bringIntoViewResponderNode;
            this.$childCoordinates = cz3Var;
            this.$boundsProvider = qs2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                rc0 j2 = this.this$0.j2();
                C00321 c00321 = new C00321(this.this$0, this.$childCoordinates, this.$boundsProvider);
                this.label = 1;
                if (j2.I(c00321, this) == h) {
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
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", l = {185}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ qs2 $parentRect;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BringIntoViewResponderNode bringIntoViewResponderNode, qs2 qs2Var, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = bringIntoViewResponderNode;
            this.$parentRect = qs2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass2(this.this$0, this.$parentRect, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                pc0 g2 = this.this$0.g2();
                cz3 e2 = this.this$0.e2();
                if (e2 == null) {
                    return ww8.a;
                }
                qs2 qs2Var = this.$parentRect;
                this.label = 1;
                if (g2.Y(e2, qs2Var, this) == h) {
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
            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BringIntoViewResponderNode$bringChildIntoView$2(BringIntoViewResponderNode bringIntoViewResponderNode, cz3 cz3Var, qs2 qs2Var, qs2 qs2Var2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = bringIntoViewResponderNode;
        this.$childCoordinates = cz3Var;
        this.$boundsProvider = qs2Var;
        this.$parentRect = qs2Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        BringIntoViewResponderNode$bringChildIntoView$2 bringIntoViewResponderNode$bringChildIntoView$2 = new BringIntoViewResponderNode$bringChildIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, by0Var);
        bringIntoViewResponderNode$bringChildIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringChildIntoView$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3, null);
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, this.$parentRect, null), 3, null);
        return launch$default;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BringIntoViewResponderNode$bringChildIntoView$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
