package com.nytimes.android.menu.item;

import android.app.Activity;
import android.content.res.Resources;
import android.view.MenuItem;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.features.settings.LogOutDialog;
import com.nytimes.android.menu.MenuData;
import com.nytimes.android.messaging.postloginregioffers.PostLoginRegiOfferManager;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.cc0;
import defpackage.dk0;
import defpackage.eg6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jk;
import defpackage.kq4;
import defpackage.lh6;
import defpackage.ss2;
import defpackage.wj6;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zs5;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

/* loaded from: classes4.dex */
public final class Login extends MenuData {
    private final Activity a;
    private final a b;
    private final dk0 c;
    private final PostLoginRegiOfferManager d;

    @fc1(c = "com.nytimes.android.menu.item.Login$2", f = "Login.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.menu.item.Login$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass2(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return Login.this.new AnonymousClass2(by0Var);
        }

        @Override // defpackage.gt2
        public final Object invoke(MenuItem menuItem, by0 by0Var) {
            return ((AnonymousClass2) create(menuItem, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                if (Login.this.c().q()) {
                    LogOutDialog logOutDialog = new LogOutDialog();
                    Activity b = Login.this.b();
                    zq3.f(b, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    logOutDialog.show(((jk) b).getSupportFragmentManager(), "Section Front Overflow");
                } else {
                    PostLoginRegiOfferManager d = Login.this.d();
                    Activity b2 = Login.this.b();
                    RegiInterface regiInterface = RegiInterface.RegiSettings;
                    this.label = 1;
                    if (d.c(b2, regiInterface, this) == h) {
                        return h;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return cc0.a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Login(Activity activity, a aVar, dk0 dk0Var, PostLoginRegiOfferManager postLoginRegiOfferManager) {
        super(wj6.loginOrCreate, eg6.login, 1, Integer.valueOf(lh6.main_menu_order_login), Boolean.FALSE, 0, null, null, false, null, null, 1984, null);
        zq3.h(activity, "activity");
        zq3.h(aVar, "ecommClient");
        zq3.h(dk0Var, "chartbeatAnalyticsReporter");
        zq3.h(postLoginRegiOfferManager, "postLoginRegiOfferManager");
        this.a = activity;
        this.b = aVar;
        this.c = dk0Var;
        this.d = postLoginRegiOfferManager;
        setPreparer(new ss2() { // from class: com.nytimes.android.menu.item.Login.1
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
                Login.this.f(kq4Var);
            }
        });
        setHandler(new AnonymousClass2(null));
    }

    private final boolean e() {
        return this.b.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(kq4 kq4Var) {
        ww8 ww8Var;
        Resources resources = zs5.a(this.a).getResources();
        int integer = resources.getInteger(lh6.main_menu_order_login);
        boolean e = e();
        String g = this.b.g();
        MenuItem findItem = kq4Var.c().findItem(getId());
        if (findItem != null) {
            findItem.setVisible(true);
            findItem.setEnabled(this.b.i());
            if (e) {
                kq4Var.c().removeItem(getId());
                this.c.g();
            } else if (this.b.q()) {
                kq4Var.c().removeItem(getId());
                kq4Var.c().add(getGrpId(), getId(), integer, g);
                this.c.h();
            } else {
                findItem.setTitle(resources.getString(getTitle()));
                this.c.a();
            }
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var != null || e) {
            return;
        }
        kq4Var.c().add(getGrpId(), getId(), integer, getTitle());
    }

    public final Activity b() {
        return this.a;
    }

    public final a c() {
        return this.b;
    }

    public final PostLoginRegiOfferManager d() {
        return this.d;
    }
}
