package androidx.compose.material;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.bo3;
import defpackage.by0;
import defpackage.d26;
import defpackage.e26;
import defpackage.eo3;
import defpackage.f26;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ka3;
import defpackage.la3;
import defpackage.sl2;
import defpackage.tl2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", f = "Button.kt", l = {508}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DefaultButtonElevation$elevation$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ eo3 $interactionSource;
    final /* synthetic */ SnapshotStateList $interactions;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ SnapshotStateList a;

        a(SnapshotStateList snapshotStateList) {
            this.a = snapshotStateList;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(bo3 bo3Var, by0 by0Var) {
            if (bo3Var instanceof ka3) {
                this.a.add(bo3Var);
            } else if (bo3Var instanceof la3) {
                this.a.remove(((la3) bo3Var).a());
            } else if (bo3Var instanceof sl2) {
                this.a.add(bo3Var);
            } else if (bo3Var instanceof tl2) {
                this.a.remove(((tl2) bo3Var).a());
            } else if (bo3Var instanceof e26) {
                this.a.add(bo3Var);
            } else if (bo3Var instanceof f26) {
                this.a.remove(((f26) bo3Var).a());
            } else if (bo3Var instanceof d26) {
                this.a.remove(((d26) bo3Var).a());
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultButtonElevation$elevation$1$1(eo3 eo3Var, SnapshotStateList snapshotStateList, by0 by0Var) {
        super(2, by0Var);
        this.$interactionSource = eo3Var;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DefaultButtonElevation$elevation$1$1(this.$interactionSource, this.$interactions, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            Flow b = this.$interactionSource.b();
            a aVar = new a(this.$interactions);
            this.label = 1;
            if (b.collect(aVar, this) == h) {
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
        return ((DefaultButtonElevation$elevation$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
