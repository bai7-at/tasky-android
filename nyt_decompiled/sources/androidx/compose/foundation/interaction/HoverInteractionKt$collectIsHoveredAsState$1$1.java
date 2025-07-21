package androidx.compose.foundation.interaction;

import defpackage.bo3;
import defpackage.by0;
import defpackage.cc0;
import defpackage.eo3;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ka3;
import defpackage.la3;
import defpackage.sy4;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", f = "HoverInteraction.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class HoverInteractionKt$collectIsHoveredAsState$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ sy4 $isHovered;
    final /* synthetic */ eo3 $this_collectIsHoveredAsState;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ List a;
        final /* synthetic */ sy4 b;

        a(List list, sy4 sy4Var) {
            this.a = list;
            this.b = sy4Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(bo3 bo3Var, by0 by0Var) {
            if (bo3Var instanceof ka3) {
                this.a.add(bo3Var);
            } else if (bo3Var instanceof la3) {
                this.a.remove(((la3) bo3Var).a());
            }
            this.b.setValue(cc0.a(!this.a.isEmpty()));
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoverInteractionKt$collectIsHoveredAsState$1$1(eo3 eo3Var, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$this_collectIsHoveredAsState = eo3Var;
        this.$isHovered = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HoverInteractionKt$collectIsHoveredAsState$1$1(this.$this_collectIsHoveredAsState, this.$isHovered, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ArrayList arrayList = new ArrayList();
            Flow b = this.$this_collectIsHoveredAsState.b();
            a aVar = new a(arrayList, this.$isHovered);
            this.label = 1;
            if (b.collect(aVar, this) == h) {
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
        return ((HoverInteractionKt$collectIsHoveredAsState$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
