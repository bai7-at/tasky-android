package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginFragment;
import defpackage.d5;
import defpackage.i5;
import defpackage.j5;
import defpackage.ss2;
import defpackage.ti6;
import defpackage.ww8;
import defpackage.xf6;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class LoginFragment extends Fragment {
    public static final a f = new a(null);
    private String a;
    private LoginClient.Request b;
    private LoginClient c;
    private j5 d;
    private View e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements LoginClient.a {
        b() {
        }

        @Override // com.facebook.login.LoginClient.a
        public void a() {
            LoginFragment.this.r1();
        }

        @Override // com.facebook.login.LoginClient.a
        public void b() {
            LoginFragment.this.k1();
        }
    }

    private final ss2 j1(final f fVar) {
        return new ss2() { // from class: com.facebook.login.LoginFragment$getLoginMethodHandlerCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ActivityResult activityResult) {
                zq3.h(activityResult, "result");
                if (activityResult.b() == -1) {
                    LoginFragment.this.i1().v(LoginClient.Companion.b(), activityResult.b(), activityResult.a());
                } else {
                    fVar.finish();
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ActivityResult) obj);
                return ww8.a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1() {
        View view = this.e;
        if (view == null) {
            zq3.z("progressBar");
            throw null;
        }
        view.setVisibility(8);
        p1();
    }

    private final void l1(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.a = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(LoginFragment loginFragment, LoginClient.Result result) {
        zq3.h(loginFragment, "this$0");
        zq3.h(result, "outcome");
        loginFragment.o1(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(ss2 ss2Var, ActivityResult activityResult) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(activityResult);
    }

    private final void o1(LoginClient.Result result) {
        this.b = null;
        int i = result.code == LoginClient.Result.Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        f activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i, intent);
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1() {
        View view = this.e;
        if (view == null) {
            zq3.z("progressBar");
            throw null;
        }
        view.setVisibility(0);
        q1();
    }

    protected LoginClient f1() {
        return new LoginClient(this);
    }

    public final j5 g1() {
        j5 j5Var = this.d;
        if (j5Var != null) {
            return j5Var;
        }
        zq3.z("launcher");
        throw null;
    }

    protected int h1() {
        return ti6.com_facebook_login_fragment;
    }

    public final LoginClient i1() {
        LoginClient loginClient = this.c;
        if (loginClient != null) {
            return loginClient;
        }
        zq3.z("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        i1().v(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        LoginClient loginClient = bundle == null ? null : (LoginClient) bundle.getParcelable("loginClient");
        if (loginClient != null) {
            loginClient.x(this);
        } else {
            loginClient = f1();
        }
        this.c = loginClient;
        i1().y(new LoginClient.d() { // from class: ja4
            @Override // com.facebook.login.LoginClient.d
            public final void a(LoginClient.Result result) {
                LoginFragment.m1(LoginFragment.this, result);
            }
        });
        f activity = getActivity();
        if (activity == null) {
            return;
        }
        l1(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.b = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        i5 i5Var = new i5();
        final ss2 j1 = j1(activity);
        j5 registerForActivityResult = registerForActivityResult(i5Var, new d5() { // from class: ka4
            @Override // defpackage.d5
            public final void a(Object obj) {
                LoginFragment.n1(ss2.this, (ActivityResult) obj);
            }
        });
        zq3.g(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.d = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(h1(), viewGroup, false);
        View findViewById = inflate.findViewById(xf6.com_facebook_login_fragment_progress_bar);
        zq3.g(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.e = findViewById;
        i1().w(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        i1().c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View findViewById = view == null ? null : view.findViewById(xf6.com_facebook_login_fragment_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.a != null) {
            i1().z(this.b);
            return;
        }
        Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
        f activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        zq3.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", i1());
    }

    protected void p1() {
    }

    protected void q1() {
    }
}
