package androidx.navigation.compose;

import androidx.compose.animation.core.Transition;
import androidx.navigation.NavBackStackEntry;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.navigation.compose.NavHostKt$NavHost$15", f = "NavHost.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NavHostKt$NavHost$15 extends SuspendLambda implements gt2 {
    final /* synthetic */ b $composeNavigator;
    final /* synthetic */ Transition $transition;
    final /* synthetic */ x08 $visibleEntries$delegate;
    final /* synthetic */ Map<String, Float> $zIndices;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavHostKt$NavHost$15(Transition transition, Map map, x08 x08Var, b bVar, by0 by0Var) {
        super(2, by0Var);
        this.$transition = transition;
        this.$zIndices = map;
        this.$visibleEntries$delegate = x08Var;
        this.$composeNavigator = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NavHostKt$NavHost$15(this.$transition, this.$zIndices, this.$visibleEntries$delegate, this.$composeNavigator, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List f;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        if (zq3.c(this.$transition.h(), this.$transition.n())) {
            f = NavHostKt.f(this.$visibleEntries$delegate);
            b bVar = this.$composeNavigator;
            Iterator it2 = f.iterator();
            while (it2.hasNext()) {
                bVar.o((NavBackStackEntry) it2.next());
            }
            Map<String, Float> map = this.$zIndices;
            Transition transition = this.$transition;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                if (!zq3.c(entry.getKey(), ((NavBackStackEntry) transition.n()).f())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Map<String, Float> map2 = this.$zIndices;
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (it3.hasNext()) {
                map2.remove(((Map.Entry) it3.next()).getKey());
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NavHostKt$NavHost$15) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
