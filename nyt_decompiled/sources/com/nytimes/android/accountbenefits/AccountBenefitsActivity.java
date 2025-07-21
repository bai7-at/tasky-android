package com.nytimes.android.accountbenefits;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.nytimes.android.accountbenefits.AccountBenefitsActivity;
import com.nytimes.android.databinding.AccountBenefitsLayoutBinding;
import com.nytimes.android.features.settings.push.NotificationsFragment;
import defpackage.eg6;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class AccountBenefitsActivity extends com.nytimes.android.accountbenefits.a {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private AccountBenefitsLayoutBinding e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context) {
            zq3.h(context, "context");
            Intent intent = new Intent(context, (Class<?>) AccountBenefitsActivity.class);
            intent.setFlags(268435456);
            return intent;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(AccountBenefitsActivity accountBenefitsActivity, View view) {
        zq3.h(accountBenefitsActivity, "this$0");
        accountBenefitsActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(AccountBenefitsActivity accountBenefitsActivity, View view) {
        zq3.h(accountBenefitsActivity, "this$0");
        accountBenefitsActivity.finish();
    }

    @Override // com.nytimes.android.accountbenefits.a, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AccountBenefitsLayoutBinding inflate = AccountBenefitsLayoutBinding.inflate(getLayoutInflater());
        zq3.g(inflate, "inflate(...)");
        this.e = inflate;
        AccountBenefitsLayoutBinding accountBenefitsLayoutBinding = null;
        if (inflate == null) {
            zq3.z("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        AccountBenefitsLayoutBinding accountBenefitsLayoutBinding2 = this.e;
        if (accountBenefitsLayoutBinding2 == null) {
            zq3.z("binding");
            accountBenefitsLayoutBinding2 = null;
        }
        accountBenefitsLayoutBinding2.accountBenefitsToolbarId.setNavigationOnClickListener(new View.OnClickListener() { // from class: l3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountBenefitsActivity.Q(AccountBenefitsActivity.this, view);
            }
        });
        if (bundle == null) {
            getSupportFragmentManager().p().b(eg6.notifications_container, new NotificationsFragment()).h();
        }
        AccountBenefitsLayoutBinding accountBenefitsLayoutBinding3 = this.e;
        if (accountBenefitsLayoutBinding3 == null) {
            zq3.z("binding");
        } else {
            accountBenefitsLayoutBinding = accountBenefitsLayoutBinding3;
        }
        accountBenefitsLayoutBinding.saveAndContinue.setOnClickListener(new View.OnClickListener() { // from class: m3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountBenefitsActivity.R(AccountBenefitsActivity.this, view);
            }
        });
    }
}
