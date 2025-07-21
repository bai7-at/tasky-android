package androidx.navigation.compose;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.x08;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DialogHostKt$DialogHost$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ c $dialogNavigator;
    final /* synthetic */ SnapshotStateList $dialogsToDispose;
    final /* synthetic */ x08 $transitionInProgress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogHostKt$DialogHost$2$1(x08 x08Var, c cVar, SnapshotStateList snapshotStateList, by0 by0Var) {
        super(2, by0Var);
        this.$transitionInProgress$delegate = x08Var;
        this.$dialogNavigator = cVar;
        this.$dialogsToDispose = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DialogHostKt$DialogHost$2$1(this.$transitionInProgress$delegate, this.$dialogNavigator, this.$dialogsToDispose, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set<NavBackStackEntry> c;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        c = DialogHostKt.c(this.$transitionInProgress$delegate);
        c cVar = this.$dialogNavigator;
        SnapshotStateList snapshotStateList = this.$dialogsToDispose;
        for (NavBackStackEntry navBackStackEntry : c) {
            if (!((List) cVar.n().getValue()).contains(navBackStackEntry) && !snapshotStateList.contains(navBackStackEntry)) {
                cVar.p(navBackStackEntry);
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DialogHostKt$DialogHost$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
