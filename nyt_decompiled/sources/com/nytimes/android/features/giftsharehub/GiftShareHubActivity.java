package com.nytimes.android.features.giftsharehub;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.nytimes.android.features.giftsharehub.GiftShareHubActivity;
import com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt;
import defpackage.c04;
import defpackage.ce5;
import defpackage.gt2;
import defpackage.h03;
import defpackage.i03;
import defpackage.k03;
import defpackage.nk6;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.t21;
import defpackage.tq0;
import defpackage.tr3;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import java.util.List;

/* loaded from: classes4.dex */
public final class GiftShareHubActivity extends com.nytimes.android.features.giftsharehub.a {
    private final c04 e;
    public tr3 itemToDetailNavigator;

    public static final class a extends ce5 {
        a() {
            super(true);
        }

        @Override // defpackage.ce5
        public void handleOnBackPressed() {
            if (isEnabled()) {
                setEnabled(false);
                GiftShareHubActivity.this.getOnBackPressedDispatcher().l();
            }
        }
    }

    public GiftShareHubActivity() {
        final qs2 qs2Var = null;
        this.e = new s(zt6.b(GiftShareHubViewModel.class), new qs2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GiftShareHubViewModel S() {
        return (GiftShareHubViewModel) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final void registerBackButtonCallback() {
        getOnBackPressedDispatcher().h(this, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAlertDialog(int i, int i2) {
        new AlertDialog.Builder(this).setTitle(i).setMessage(i2).setNegativeButton(nk6.dialog_btn_ok, new DialogInterface.OnClickListener() { // from class: e03
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                GiftShareHubActivity.T(dialogInterface, i3);
            }
        }).show();
    }

    public final tr3 R() {
        tr3 tr3Var = this.itemToDetailNavigator;
        if (tr3Var != null) {
            return tr3Var;
        }
        zq3.z("itemToDetailNavigator");
        return null;
    }

    @Override // com.nytimes.android.features.giftsharehub.a, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerBackButtonCallback();
        final boolean r = S().r();
        tq0.b(this, null, zr0.c(414344262, true, new gt2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubActivity$onCreate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            private static final k03 b(x08 x08Var) {
                return (k03) x08Var.getValue();
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                GiftShareHubViewModel S;
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(414344262, i, -1, "com.nytimes.android.features.giftsharehub.GiftShareHubActivity.onCreate.<anonymous> (GiftShareHubActivity.kt:36)");
                }
                S = GiftShareHubActivity.this.S();
                x08 b = y.b(S.q(), null, composer, 8, 1);
                List d = b(b).d();
                int e = b(b).e();
                List c = b(b).c();
                int indexOf = d.indexOf(b(b).f());
                boolean z = r;
                final GiftShareHubActivity giftShareHubActivity = GiftShareHubActivity.this;
                ss2 ss2Var = new ss2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubActivity$onCreate$1.1
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).intValue());
                        return ww8.a;
                    }

                    public final void invoke(int i2) {
                        GiftShareHubViewModel S2;
                        S2 = GiftShareHubActivity.this.S();
                        S2.x(i2);
                    }
                };
                final GiftShareHubActivity giftShareHubActivity2 = GiftShareHubActivity.this;
                ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubActivity$onCreate$1.2
                    {
                        super(1);
                    }

                    public final void b(h03.a aVar) {
                        zq3.h(aVar, "giftData");
                        GiftShareHubActivity.this.R().a(GiftShareHubActivity.this, i03.a(aVar, "gift-hub"));
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((h03.a) obj);
                        return ww8.a;
                    }
                };
                final GiftShareHubActivity giftShareHubActivity3 = GiftShareHubActivity.this;
                ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubActivity$onCreate$1.3
                    {
                        super(1);
                    }

                    public final void b(h03.a aVar) {
                        GiftShareHubViewModel S2;
                        zq3.h(aVar, "giftData");
                        S2 = GiftShareHubActivity.this.S();
                        String i2 = aVar.i();
                        String h = aVar.h();
                        String a2 = aVar.a();
                        final GiftShareHubActivity giftShareHubActivity4 = GiftShareHubActivity.this;
                        S2.l(i2, h, a2, new ss2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubActivity.onCreate.1.3.1
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke(((Boolean) obj).booleanValue());
                                return ww8.a;
                            }

                            public final void invoke(boolean z2) {
                                if (z2) {
                                    GiftShareHubActivity.this.showAlertDialog(nk6.sub_link_share_err_dialog_title, nk6.sub_link_share_err_dialog_message);
                                } else {
                                    GiftShareHubActivity.this.showAlertDialog(nk6.sub_link_share_err_dialog_generic_title, nk6.sub_link_share_err_dialog_generic_message);
                                }
                            }
                        });
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((h03.a) obj);
                        return ww8.a;
                    }
                };
                final GiftShareHubActivity giftShareHubActivity4 = GiftShareHubActivity.this;
                GiftShareHubScreenKt.e(e, c, d, indexOf, z, ss2Var, ss2Var2, ss2Var3, new qs2() { // from class: com.nytimes.android.features.giftsharehub.GiftShareHubActivity$onCreate$1.4
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m399invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m399invoke() {
                        GiftShareHubActivity.this.getOnBackPressedDispatcher().l();
                    }
                }, composer, 576);
                if (b.G()) {
                    b.R();
                }
            }
        }), 1, null);
    }

    @Override // com.nytimes.android.BaseAppCompatActivity, defpackage.jk, androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        S().u();
    }
}
