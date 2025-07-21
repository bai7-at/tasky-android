package com.nytimes.subauth.ui.accountdelete;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.lifecycle.t;
import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import com.nytimes.subauth.ui.models.SubauthUiParams;
import com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt;
import defpackage.e44;
import defpackage.f68;
import defpackage.gt2;
import defpackage.jk;
import defpackage.pc6;
import defpackage.qs2;
import defpackage.r98;
import defpackage.ss2;
import defpackage.tq0;
import defpackage.v98;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class AccountDeleteActivity extends jk {
    public static final a c = new a(null);
    public static final int d = 8;
    private SubauthUiParams a;
    private AccountDeleteViewModel b;
    public f68 subauthConfig;
    public t.b viewModelFactory;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState) {
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new AccountDeleteActivity$exitScreen$1(this, accountDeleteDialogState, null), 3, null);
    }

    private final void Q() {
        if (getResources().getBoolean(pc6.subauth_isPortraitOnly)) {
            setRequestedOrientation(1);
        }
    }

    public final f68 O() {
        f68 f68Var = this.subauthConfig;
        if (f68Var != null) {
            return f68Var;
        }
        zq3.z("subauthConfig");
        return null;
    }

    public final t.b P() {
        t.b bVar = this.viewModelFactory;
        if (bVar != null) {
            return bVar;
        }
        zq3.z("viewModelFactory");
        return null;
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v98 a2 = r98.b.a();
        if (a2 != null) {
            a2.b(this);
        }
        this.b = (AccountDeleteViewModel) new t(this, P()).a(AccountDeleteViewModel.class);
        SubauthUiParams subauthUiParams = (SubauthUiParams) getIntent().getParcelableExtra("subauth_ui_params");
        if (subauthUiParams == null) {
            subauthUiParams = new SubauthUiParams(false, false, false, false, null, false, false, null, null, null, 1023, null);
        }
        this.a = subauthUiParams;
        Q();
        AccountDeleteViewModel accountDeleteViewModel = this.b;
        if (accountDeleteViewModel == null) {
            zq3.z("viewModel");
            accountDeleteViewModel = null;
        }
        SubauthUiParams subauthUiParams2 = this.a;
        if (subauthUiParams2 == null) {
            zq3.z("subauthUiParams");
            subauthUiParams2 = null;
        }
        accountDeleteViewModel.u(subauthUiParams2.c());
        AccountDeleteViewModel accountDeleteViewModel2 = this.b;
        if (accountDeleteViewModel2 == null) {
            zq3.z("viewModel");
            accountDeleteViewModel2 = null;
        }
        accountDeleteViewModel2.p();
        AccountDeleteViewModel accountDeleteViewModel3 = this.b;
        if (accountDeleteViewModel3 == null) {
            zq3.z("viewModel");
            accountDeleteViewModel3 = null;
        }
        accountDeleteViewModel3.j();
        tq0.b(this, null, zr0.c(-1940916740, true, new gt2() { // from class: com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity$onCreate$1

            /* renamed from: com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity$onCreate$1$7, reason: invalid class name */
            /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements ss2 {
                AnonymousClass7(Object obj) {
                    super(1, obj, AccountDeleteViewModel.class, "onDialogVisible", "onDialogVisible(Lcom/nytimes/subauth/ui/accountdelete/AccountDeleteViewModel$AccountDeleteDialogState;)V", 0);
                }

                public final void g(AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState) {
                    zq3.h(accountDeleteDialogState, "p0");
                    ((AccountDeleteViewModel) this.receiver).s(accountDeleteDialogState);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    g((AccountDeleteViewModel.AccountDeleteDialogState) obj);
                    return ww8.a;
                }
            }

            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                AccountDeleteViewModel accountDeleteViewModel4;
                AccountDeleteViewModel accountDeleteViewModel5;
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1940916740, i, -1, "com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity.onCreate.<anonymous> (AccountDeleteActivity.kt:43)");
                }
                accountDeleteViewModel4 = AccountDeleteActivity.this.b;
                AccountDeleteViewModel accountDeleteViewModel6 = null;
                if (accountDeleteViewModel4 == null) {
                    zq3.z("viewModel");
                    accountDeleteViewModel4 = null;
                }
                AccountDeleteViewModel.a aVar = (AccountDeleteViewModel.a) y.b(accountDeleteViewModel4.n(), null, composer, 8, 1).getValue();
                f68 O = AccountDeleteActivity.this.O();
                String f = aVar.f();
                AccountDeleteViewModel.AccountDeleteDialogState d2 = aVar.d();
                boolean g = aVar.g();
                boolean e = aVar.e();
                final AccountDeleteActivity accountDeleteActivity = AccountDeleteActivity.this;
                qs2 qs2Var = new qs2() { // from class: com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity$onCreate$1.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m782invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m782invoke() {
                        AccountDeleteViewModel accountDeleteViewModel7;
                        accountDeleteViewModel7 = AccountDeleteActivity.this.b;
                        if (accountDeleteViewModel7 == null) {
                            zq3.z("viewModel");
                            accountDeleteViewModel7 = null;
                        }
                        accountDeleteViewModel7.q();
                    }
                };
                final AccountDeleteActivity accountDeleteActivity2 = AccountDeleteActivity.this;
                qs2 qs2Var2 = new qs2() { // from class: com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity$onCreate$1.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m783invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m783invoke() {
                        AccountDeleteViewModel accountDeleteViewModel7;
                        accountDeleteViewModel7 = AccountDeleteActivity.this.b;
                        if (accountDeleteViewModel7 == null) {
                            zq3.z("viewModel");
                            accountDeleteViewModel7 = null;
                        }
                        accountDeleteViewModel7.v();
                    }
                };
                final AccountDeleteActivity accountDeleteActivity3 = AccountDeleteActivity.this;
                qs2 qs2Var3 = new qs2() { // from class: com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity$onCreate$1.3
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m784invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m784invoke() {
                        AccountDeleteViewModel accountDeleteViewModel7;
                        accountDeleteViewModel7 = AccountDeleteActivity.this.b;
                        if (accountDeleteViewModel7 == null) {
                            zq3.z("viewModel");
                            accountDeleteViewModel7 = null;
                        }
                        accountDeleteViewModel7.t();
                    }
                };
                final AccountDeleteActivity accountDeleteActivity4 = AccountDeleteActivity.this;
                ss2 ss2Var = new ss2() { // from class: com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity$onCreate$1.4
                    {
                        super(1);
                    }

                    public final void b(AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState) {
                        AccountDeleteViewModel accountDeleteViewModel7;
                        zq3.h(accountDeleteDialogState, "dialogState");
                        accountDeleteViewModel7 = AccountDeleteActivity.this.b;
                        if (accountDeleteViewModel7 == null) {
                            zq3.z("viewModel");
                            accountDeleteViewModel7 = null;
                        }
                        accountDeleteViewModel7.k(accountDeleteDialogState);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((AccountDeleteViewModel.AccountDeleteDialogState) obj);
                        return ww8.a;
                    }
                };
                final AccountDeleteActivity accountDeleteActivity5 = AccountDeleteActivity.this;
                qs2 qs2Var4 = new qs2() { // from class: com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity$onCreate$1.5
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m785invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m785invoke() {
                        AccountDeleteViewModel accountDeleteViewModel7;
                        accountDeleteViewModel7 = AccountDeleteActivity.this.b;
                        if (accountDeleteViewModel7 == null) {
                            zq3.z("viewModel");
                            accountDeleteViewModel7 = null;
                        }
                        accountDeleteViewModel7.l();
                    }
                };
                final AccountDeleteActivity accountDeleteActivity6 = AccountDeleteActivity.this;
                ss2 ss2Var2 = new ss2() { // from class: com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity$onCreate$1.6
                    {
                        super(1);
                    }

                    public final void b(AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState) {
                        zq3.h(accountDeleteDialogState, "dialogState");
                        AccountDeleteActivity.this.N(accountDeleteDialogState);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((AccountDeleteViewModel.AccountDeleteDialogState) obj);
                        return ww8.a;
                    }
                };
                accountDeleteViewModel5 = AccountDeleteActivity.this.b;
                if (accountDeleteViewModel5 == null) {
                    zq3.z("viewModel");
                } else {
                    accountDeleteViewModel6 = accountDeleteViewModel5;
                }
                DeleteMyAccountScreenKt.d(O, f, d2, g, e, qs2Var, qs2Var2, qs2Var3, ss2Var, qs2Var4, ss2Var2, new AnonymousClass7(accountDeleteViewModel6), composer, 8, 0);
                if (b.G()) {
                    b.R();
                }
            }
        }), 1, null);
    }
}
