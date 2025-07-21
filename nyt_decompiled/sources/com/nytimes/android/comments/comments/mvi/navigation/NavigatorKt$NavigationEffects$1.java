package com.nytimes.android.comments.comments.mvi.navigation;

import android.app.Activity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.nytimes.android.comments.comments.mvi.navigation.NavigationIntent;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.n25;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.comments.mvi.navigation.NavigatorKt$NavigationEffects$1", f = "Navigator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NavigatorKt$NavigationEffects$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ NavigationIntent $destination;
    final /* synthetic */ n25 $navController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigatorKt$NavigationEffects$1(Activity activity, n25 n25Var, NavigationIntent navigationIntent, by0<? super NavigatorKt$NavigationEffects$1> by0Var) {
        super(2, by0Var);
        this.$activity = activity;
        this.$navController = n25Var;
        this.$destination = navigationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new NavigatorKt$NavigationEffects$1(this.$activity, this.$navController, this.$destination, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Activity activity = this.$activity;
        if (activity != null && activity.isFinishing()) {
            return ww8.a;
        }
        NavDestination E = this.$navController.E();
        if (!zq3.c(E != null ? E.v() : null, this.$destination.getRoute().getRoute())) {
            NavigationIntent navigationIntent = this.$destination;
            if (navigationIntent instanceof NavigationIntent.NavigateBack) {
                NavigatorKt.popUpTo(this.$navController, navigationIntent.getRoute().getRoute());
            } else if (navigationIntent instanceof NavigationIntent.NavigateTo) {
                NavController.T(this.$navController, navigationIntent.getRoute().getRoute(), null, null, 6, null);
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((NavigatorKt$NavigationEffects$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
