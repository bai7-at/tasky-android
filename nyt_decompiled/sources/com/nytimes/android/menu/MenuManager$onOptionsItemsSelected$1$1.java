package com.nytimes.android.menu;

import android.view.MenuItem;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.menu.MenuManager$onOptionsItemsSelected$1$1", f = "MenuManager.kt", l = {ContentType.LIVE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MenuManager$onOptionsItemsSelected$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $it;
    final /* synthetic */ MenuItem $menuitem;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MenuManager$onOptionsItemsSelected$1$1(gt2 gt2Var, MenuItem menuItem, by0 by0Var) {
        super(2, by0Var);
        this.$it = gt2Var;
        this.$menuitem = menuItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MenuManager$onOptionsItemsSelected$1$1(this.$it, this.$menuitem, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            gt2 gt2Var = this.$it;
            MenuItem menuItem = this.$menuitem;
            this.label = 1;
            if (gt2Var.invoke(menuItem, this) == h) {
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
        return ((MenuManager$onOptionsItemsSelected$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
