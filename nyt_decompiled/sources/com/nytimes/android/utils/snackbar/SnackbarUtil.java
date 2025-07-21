package com.nytimes.android.utils.snackbar;

import android.app.Activity;
import android.app.Application;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.material.SnackbarDuration;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.snackbar.Snackbar;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.utils.snackbar.b;
import defpackage.c04;
import defpackage.em6;
import defpackage.lf6;
import defpackage.m07;
import defpackage.qs2;
import defpackage.t21;
import defpackage.vv7;
import defpackage.ww8;
import defpackage.z12;
import defpackage.zq3;
import defpackage.zt6;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SnackbarUtil {
    public static final a Companion = new a(null);
    public static final int f = 8;
    public static final int g = (int) TimeUnit.SECONDS.toMillis(5);
    private final Activity a;
    private final c04 b;
    private final NetworkStatus c;
    private final Typeface d;
    private final Typeface e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SnackbarUtil a(Activity activity) {
            zq3.h(activity, "activity");
            return ((vv7) z12.a(activity, vv7.class)).o0();
        }

        private a() {
        }
    }

    public SnackbarUtil(Activity activity) {
        zq3.h(activity, "activity");
        this.a = activity;
        zq3.f(activity, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        final ComponentActivity componentActivity = (ComponentActivity) activity;
        final qs2 qs2Var = null;
        this.b = new s(zt6.b(SnackbarViewModel.class), new qs2() { // from class: com.nytimes.android.utils.snackbar.SnackbarUtil$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                u viewModelStore = ComponentActivity.this.getViewModelStore();
                zq3.g(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new qs2() { // from class: com.nytimes.android.utils.snackbar.SnackbarUtil$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                t.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                zq3.g(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new qs2() { // from class: com.nytimes.android.utils.snackbar.SnackbarUtil$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                if (qs2Var2 != null && (t21Var = (t21) qs2Var2.mo865invoke()) != null) {
                    return t21Var;
                }
                t21 defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                zq3.g(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        Application application = activity.getApplication();
        zq3.g(application, "getApplication(...)");
        this.c = new NetworkStatus(application);
        Typeface g2 = m07.g(activity, lf6.font_franklin_bold);
        this.d = g2;
        this.e = Typeface.create(g2, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(qs2 qs2Var, View view) {
        zq3.h(qs2Var, "$actionListener");
        qs2Var.mo865invoke();
    }

    private final SnackbarViewModel b() {
        return (SnackbarViewModel) this.b.getValue();
    }

    private final boolean c() {
        return com.nytimes.android.utils.snackbar.a.Companion.a(this.a);
    }

    private final SnackbarDuration d(int i) {
        return i == -2 ? SnackbarDuration.Indefinite : SnackbarDuration.Short;
    }

    private final qs2 e(final Snackbar snackbar) {
        zq3.e(snackbar);
        snackbar.Z();
        return new qs2() { // from class: com.nytimes.android.utils.snackbar.SnackbarUtil$showAndReturnDismisser$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m778invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m778invoke() {
                Snackbar.this.z();
            }
        };
    }

    public static /* synthetic */ qs2 g(SnackbarUtil snackbarUtil, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        return snackbarUtil.f(i, i2, i3);
    }

    private final qs2 h(b bVar) {
        b().i(bVar);
        return new SnackbarUtil$showComposeSnackbarAndReturnDismisser$1(b());
    }

    public static /* synthetic */ qs2 j(SnackbarUtil snackbarUtil, boolean z, boolean z2, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return snackbarUtil.i(z, z2, qs2Var);
    }

    public static /* synthetic */ qs2 l(SnackbarUtil snackbarUtil, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return snackbarUtil.k(z);
    }

    public static /* synthetic */ qs2 p(SnackbarUtil snackbarUtil, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return snackbarUtil.o(z);
    }

    public static /* synthetic */ qs2 s(SnackbarUtil snackbarUtil, boolean z, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return snackbarUtil.r(z, qs2Var);
    }

    public static /* synthetic */ qs2 y(SnackbarUtil snackbarUtil, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return snackbarUtil.u(i, i2);
    }

    public static /* synthetic */ qs2 z(SnackbarUtil snackbarUtil, CharSequence charSequence, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = snackbarUtil.c();
        }
        return snackbarUtil.x(charSequence, i, z);
    }

    public final qs2 A(int i, int i2, int i3, qs2 qs2Var) {
        zq3.h(qs2Var, "actionListener");
        String string = this.a.getString(i);
        zq3.g(string, "getString(...)");
        String string2 = this.a.getString(i3);
        zq3.g(string2, "getString(...)");
        return B(string, i2, string2, qs2Var);
    }

    public final qs2 B(String str, int i, String str2, final qs2 qs2Var) {
        zq3.h(str, "message");
        zq3.h(str2, "actionText");
        zq3.h(qs2Var, "actionListener");
        return c() ? h(new b.C0444b(str, d(i), str2, qs2Var, null, 16, null)) : e(Snackbars.a.e(this.a, str, i, str2, new View.OnClickListener() { // from class: wv7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnackbarUtil.C(qs2.this, view);
            }
        }));
    }

    public final qs2 f(int i, int i2, int i3) {
        String string = this.a.getString(i);
        zq3.g(string, "getString(...)");
        String string2 = this.a.getString(i2);
        zq3.g(string2, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.setSpan(new StyleSpan(this.e.getStyle()), 0, string.length(), 0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) string2);
        return x(spannableStringBuilder, i3, false);
    }

    public final qs2 i(boolean z, boolean z2, qs2 qs2Var) {
        zq3.h(qs2Var, "onRefresh");
        return !this.c.g() ? z2 ? r(z, qs2Var) : o(z) : k(z);
    }

    public final qs2 k(boolean z) {
        NYTLogger.s(new Exception("An unknown error occurred"));
        return u(em6.generic_error_message, z ? -2 : g);
    }

    public final qs2 m(final qs2 qs2Var) {
        zq3.h(qs2Var, "onRetryAfterAnError");
        return A(em6.retry_text_error, -2, em6.retry, new qs2() { // from class: com.nytimes.android.utils.snackbar.SnackbarUtil$showIndefiniteLoadingError$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m780invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m780invoke() {
                qs2.this.mo865invoke();
            }
        });
    }

    public final qs2 n() {
        return p(this, false, 1, null);
    }

    public final qs2 o(boolean z) {
        return u(em6.no_network_message, z ? -2 : g);
    }

    public final qs2 q(qs2 qs2Var) {
        zq3.h(qs2Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return s(this, false, qs2Var, 1, null);
    }

    public final qs2 r(boolean z, qs2 qs2Var) {
        zq3.h(qs2Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return A(em6.no_network_message, z ? -2 : g, em6.retry, qs2Var);
    }

    public final qs2 t(int i) {
        return y(this, i, 0, 2, null);
    }

    public final qs2 u(int i, int i2) {
        String string = this.a.getString(i);
        zq3.g(string, "getString(...)");
        return z(this, string, i2, false, 4, null);
    }

    public final qs2 v(CharSequence charSequence) {
        zq3.h(charSequence, "message");
        return z(this, charSequence, 0, false, 6, null);
    }

    public final qs2 w(CharSequence charSequence, int i) {
        zq3.h(charSequence, "message");
        return z(this, charSequence, i, false, 4, null);
    }

    public final qs2 x(CharSequence charSequence, int i, boolean z) {
        zq3.h(charSequence, "message");
        return z ? h(new b.a(charSequence, d(i), null, 4, null)) : e(Snackbars.a.c(this.a, charSequence, i));
    }
}
