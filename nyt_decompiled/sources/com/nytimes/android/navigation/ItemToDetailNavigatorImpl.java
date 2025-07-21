package com.nytimes.android.navigation;

import android.content.Context;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.nytimes.games.spellingbee.SpellingBeeHostActivity;
import com.nytimes.navigation.ItemToDetailEventSender;
import defpackage.a44;
import defpackage.cb2;
import defpackage.em6;
import defpackage.gr2;
import defpackage.ld1;
import defpackage.nr3;
import defpackage.pf9;
import defpackage.tr3;
import defpackage.y25;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class ItemToDetailNavigatorImpl implements tr3 {
    private final ld1 a;
    private final nr3 b;
    private final ItemToDetailEventSender c;
    private final pf9 d;
    private final cb2 e;

    public ItemToDetailNavigatorImpl(ld1 ld1Var, nr3 nr3Var, ItemToDetailEventSender itemToDetailEventSender, pf9 pf9Var, cb2 cb2Var) {
        zq3.h(ld1Var, "deepLinkUtils");
        zq3.h(nr3Var, "openingManager");
        zq3.h(itemToDetailEventSender, "itemToDetailEventSender");
        zq3.h(pf9Var, "webWall");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = ld1Var;
        this.b = nr3Var;
        this.c = itemToDetailEventSender;
        this.d = pf9Var;
        this.e = cb2Var;
    }

    private final void e(y25 y25Var, ComponentActivity componentActivity, CoroutineScope coroutineScope) {
        if (y25Var.e()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ItemToDetailNavigatorImpl$manageNavigationOf$1(this, componentActivity, y25Var, null), 3, null);
        } else {
            this.b.c(y25Var, componentActivity);
        }
    }

    @Override // defpackage.tr3
    public void a(ComponentActivity componentActivity, y25 y25Var) {
        zq3.h(y25Var, "item");
        if (componentActivity == null) {
            return;
        }
        Lifecycle lifecycle = componentActivity.getLifecycle();
        zq3.g(lifecycle, "<get-lifecycle>(...)");
        f(y25Var, componentActivity, a44.a(lifecycle));
    }

    @Override // defpackage.tr3
    public void b(y25 y25Var, ComponentActivity componentActivity, Fragment fragment) {
        Lifecycle lifecycle;
        zq3.h(y25Var, "item");
        zq3.h(componentActivity, "activity");
        if (fragment == null || (lifecycle = fragment.getLifecycle()) == null) {
            lifecycle = componentActivity.getLifecycle();
        }
        zq3.e(lifecycle);
        f(y25Var, componentActivity, a44.a(lifecycle));
    }

    public final void f(y25 y25Var, ComponentActivity componentActivity, CoroutineScope coroutineScope) {
        zq3.h(y25Var, "item");
        zq3.h(componentActivity, "activity");
        zq3.h(coroutineScope, "scope");
        this.c.a(y25Var);
        if (y25Var.u() && this.e.s()) {
            SpellingBeeHostActivity.a aVar = SpellingBeeHostActivity.e;
            Context applicationContext = componentActivity.getApplicationContext();
            zq3.g(applicationContext, "getApplicationContext(...)");
            componentActivity.startActivity(SpellingBeeHostActivity.a.b(aVar, applicationContext, null, 2, null));
            return;
        }
        if (!y25Var.t() && !y25Var.s()) {
            if (gr2.a.c(y25Var.o())) {
                this.b.a(y25Var, componentActivity);
                return;
            } else {
                if (this.a.b(componentActivity, y25Var.r())) {
                    return;
                }
                e(y25Var, componentActivity, coroutineScope);
                return;
            }
        }
        if (!this.a.e()) {
            Toast.makeText(componentActivity, em6.no_network_message, 0).show();
            return;
        }
        ld1 ld1Var = this.a;
        String q = y25Var.q();
        if (q == null) {
            q = "";
        }
        ld1Var.c(componentActivity, q);
    }
}
