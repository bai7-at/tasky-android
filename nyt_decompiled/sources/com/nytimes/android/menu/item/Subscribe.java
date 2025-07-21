package com.nytimes.android.menu.item;

import android.app.Activity;
import android.view.MenuItem;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.menu.MenuData;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource;
import defpackage.by0;
import defpackage.cc0;
import defpackage.eg6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jc;
import defpackage.kq4;
import defpackage.lh6;
import defpackage.ss2;
import defpackage.uy3;
import defpackage.wj6;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

/* loaded from: classes4.dex */
public final class Subscribe extends MenuData {
    private final Activity a;
    private final a b;
    private final jc c;
    private final uy3 d;

    @fc1(c = "com.nytimes.android.menu.item.Subscribe$2", f = "Subscribe.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.menu.item.Subscribe$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass2(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return Subscribe.this.new AnonymousClass2(by0Var);
        }

        @Override // defpackage.gt2
        public final Object invoke(MenuItem menuItem, by0 by0Var) {
            return ((AnonymousClass2) create(menuItem, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            Subscribe.this.a().B(-1);
            uy3.a.c(Subscribe.this.c(), CampaignCodeSource.SUBSCRIBE, RegiInterface.LinkOverflow, "Section Front Overflow", null, 8, null);
            return cc0.a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Subscribe(Activity activity, a aVar, jc jcVar, uy3 uy3Var) {
        super(wj6.interests_not_subscribed_content, eg6.subscribe, 1, Integer.valueOf(lh6.main_menu_order_subscribe), Boolean.FALSE, 0, null, null, false, null, null, 1984, null);
        zq3.h(activity, "activity");
        zq3.h(aVar, "ecommClient");
        zq3.h(jcVar, "analyticsClient");
        zq3.h(uy3Var, "launchProductLandingHelper");
        this.a = activity;
        this.b = aVar;
        this.c = jcVar;
        this.d = uy3Var;
        setPreparer(new ss2() { // from class: com.nytimes.android.menu.item.Subscribe.1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((kq4) obj);
                return ww8.a;
            }

            public final void invoke(kq4 kq4Var) {
                zq3.h(kq4Var, "param");
                MenuItem findItem = kq4Var.c().findItem(eg6.subscribe);
                if (findItem == null) {
                    return;
                }
                findItem.setVisible(!Subscribe.this.b().a());
            }
        });
        setHandler(new AnonymousClass2(null));
    }

    public final jc a() {
        return this.c;
    }

    public final a b() {
        return this.b;
    }

    public final uy3 c() {
        return this.d;
    }
}
