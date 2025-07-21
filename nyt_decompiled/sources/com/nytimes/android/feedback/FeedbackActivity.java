package com.nytimes.android.feedback;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.google.android.material.textfield.TextInputEditText;
import com.nytimes.android.feedback.FeedbackActivity;
import com.nytimes.android.feedback.FeedbackProvider;
import com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel;
import com.nytimes.android.feedback.ui.tooltip.FeedbackTooltipHelper;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.aj6;
import defpackage.al6;
import defpackage.c04;
import defpackage.cd6;
import defpackage.ce5;
import defpackage.d5;
import defpackage.du8;
import defpackage.ee5;
import defpackage.em6;
import defpackage.f5;
import defpackage.ie6;
import defpackage.j5;
import defpackage.ky1;
import defpackage.lt2;
import defpackage.mx0;
import defpackage.or8;
import defpackage.p4;
import defpackage.pl6;
import defpackage.qc2;
import defpackage.qd6;
import defpackage.qs2;
import defpackage.rg6;
import defpackage.ss2;
import defpackage.st2;
import defpackage.t21;
import defpackage.tc2;
import defpackage.u14;
import defpackage.vc5;
import defpackage.ww8;
import defpackage.x3;
import defpackage.xc2;
import defpackage.yh8;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class FeedbackActivity extends com.nytimes.android.feedback.f implements ky1.a {
    public static final a Companion = new a(null);
    private final c04 e;
    private final c04 f;
    public tc2 feedbackAppDependencies;
    private List g;
    private View h;
    private final c04 i = kotlin.c.a(new qs2() { // from class: com.nytimes.android.feedback.FeedbackActivity$binding$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final qc2 mo865invoke() {
            qc2 c2 = qc2.c(FeedbackActivity.this.getLayoutInflater());
            FeedbackActivity.this.setContentView(c2.getRoot());
            zq3.g(c2, "also(...)");
            return c2;
        }
    });
    private final qs2 j;
    public FeedbackTooltipHelper tooltipHelper;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, List list) {
            zq3.h(context, "context");
            Intent intent = new Intent(context, (Class<?>) FeedbackActivity.class);
            if (list != null) {
                intent.putExtra("extraFeedbackData", (String[]) list.toArray(new String[0]));
            }
            return intent;
        }

        private a() {
        }
    }

    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = FeedbackActivity.this.h;
            if (view == null) {
                return;
            }
            view.setEnabled(true);
        }
    }

    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FeedbackActivity.this.finish();
        }
    }

    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CharSequence text = FeedbackActivity.this.c0().g.getText();
            if (text == null || text.length() == 0) {
                return;
            }
            or8.a(FeedbackActivity.this.c0().getRoot());
            FeedbackActivity.this.c0().g.setText("");
            FeedbackActivity.this.c0().g.setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CharSequence error = FeedbackActivity.this.c0().c.getError();
            if (error != null && error.length() != 0) {
                or8.a(FeedbackActivity.this.c0().getRoot());
                FeedbackActivity.this.c0().c.setErrorEnabled(false);
            }
            if ((editable != null ? editable.length() : 0) > 0) {
                FeedbackActivity.this.h0().e();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class f extends ClickableSpan {
        final /* synthetic */ Pair a;

        f(Pair pair) {
            this.a = pair;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            zq3.h(view, "widget");
            ((qs2) this.a.d()).mo865invoke();
        }
    }

    static final class g implements vc5, st2 {
        private final /* synthetic */ ss2 a;

        g(ss2 ss2Var) {
            zq3.h(ss2Var, "function");
            this.a = ss2Var;
        }

        @Override // defpackage.vc5
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        @Override // defpackage.st2
        public final lt2 b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof vc5) && (obj instanceof st2)) {
                return zq3.c(b(), ((st2) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public FeedbackActivity() {
        final qs2 qs2Var = null;
        this.e = new s(zt6.b(FeedbackViewModel.class), new qs2() { // from class: com.nytimes.android.feedback.FeedbackActivity$special$$inlined$viewModels$default$2
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
        }, new qs2() { // from class: com.nytimes.android.feedback.FeedbackActivity$special$$inlined$viewModels$default$1
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
        }, new qs2() { // from class: com.nytimes.android.feedback.FeedbackActivity$special$$inlined$viewModels$default$3
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
                t21 defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                zq3.g(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f = new s(zt6.b(FeedbackScreenshotViewModel.class), new qs2() { // from class: com.nytimes.android.feedback.FeedbackActivity$special$$inlined$viewModels$default$5
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
        }, new qs2() { // from class: com.nytimes.android.feedback.FeedbackActivity$special$$inlined$viewModels$default$4
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
        }, new qs2() { // from class: com.nytimes.android.feedback.FeedbackActivity$special$$inlined$viewModels$default$6
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
                t21 defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                zq3.g(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        final j5 registerForActivityResult = registerForActivityResult(new f5(), new d5() { // from class: lc2
            @Override // defpackage.d5
            public final void a(Object obj) {
                FeedbackActivity.m0(FeedbackActivity.this, (Uri) obj);
            }
        });
        zq3.g(registerForActivityResult, "registerForActivityResult(...)");
        this.j = new qs2() { // from class: com.nytimes.android.feedback.FeedbackActivity$special$$inlined$registerUriForActivityResultInvokable$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m548invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m548invoke() {
                j5.this.a("image/*");
            }
        };
    }

    private final void M() {
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        zq3.g(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        ee5.a(onBackPressedDispatcher, this, true, new ss2() { // from class: com.nytimes.android.feedback.FeedbackActivity$handleBackPressed$1
            {
                super(1);
            }

            public final void b(ce5 ce5Var) {
                FeedbackScreenshotViewModel e0;
                Pair pair;
                File file;
                zq3.h(ce5Var, "$this$addCallback");
                ce5Var.remove();
                FeedbackActivity.this.getOnBackPressedDispatcher().l();
                e0 = FeedbackActivity.this.e0();
                u14 u14Var = (u14) e0.n().f();
                if (u14Var == null || (pair = (Pair) u14Var.a()) == null || (file = (File) pair.d()) == null) {
                    return;
                }
                file.delete();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ce5) obj);
                return ww8.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qc2 c0() {
        return (qc2) this.i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedbackScreenshotViewModel e0() {
        return (FeedbackScreenshotViewModel) this.f.getValue();
    }

    private final InputMethodManager g0() {
        Object systemService = getSystemService("input_method");
        zq3.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(Throwable th) {
        LinearLayout root = c0().getRoot();
        zq3.g(root, "getRoot(...)");
        root.postDelayed(new b(), 500L);
        if (th instanceof FeedbackProvider.InvalidEmailException) {
            or8.a(c0().getRoot());
            c0().g.setText(getString(al6.feedback_email_error));
            c0().g.setVisibility(0);
        } else if (!(th instanceof FeedbackProvider.InvalidSummaryException)) {
            getSnackbarUtil().A(al6.feedback_send_error, 0, em6.retry, new qs2() { // from class: com.nytimes.android.feedback.FeedbackActivity$handleError$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m549invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m549invoke() {
                    FeedbackActivity.this.v0();
                }
            });
        } else {
            or8.a(c0().getRoot());
            c0().c.setError(getString(al6.feedback_body_error));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        View view = this.h;
        if (view == null) {
            return;
        }
        view.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        Toast.makeText(this, getString(al6.feedback_toast_sent), 0).show();
        LinearLayout root = c0().getRoot();
        zq3.g(root, "getRoot(...)");
        root.postDelayed(new c(), 500L);
    }

    private final void l0() {
        setSupportActionBar(c0().k);
        x3 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(getString(al6.feedback_toolbar_title));
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            Drawable e2 = mx0.e(this, ie6.ic_close);
            if (e2 != null) {
                e2.setTint(mx0.c(this, qd6.ds_times_black));
            } else {
                e2 = null;
            }
            supportActionBar.setHomeAsUpIndicator(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(FeedbackActivity feedbackActivity, Uri uri) {
        zq3.h(feedbackActivity, "this$0");
        if (uri != null) {
            feedbackActivity.e0().j(uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(FeedbackActivity feedbackActivity, View view) {
        zq3.h(feedbackActivity, "this$0");
        feedbackActivity.c0().b.requestFocus();
        feedbackActivity.g0().showSoftInput(feedbackActivity.c0().b, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(FeedbackActivity feedbackActivity, View view) {
        ww8 ww8Var;
        Pair pair;
        zq3.h(feedbackActivity, "this$0");
        u14 u14Var = (u14) feedbackActivity.e0().n().f();
        if (u14Var == null || (pair = (Pair) u14Var.a()) == null || ((File) pair.d()) == null) {
            ww8Var = null;
        } else {
            ky1 ky1Var = new ky1();
            FragmentManager supportFragmentManager = feedbackActivity.getSupportFragmentManager();
            zq3.g(supportFragmentManager, "getSupportFragmentManager(...)");
            ky1Var.F(supportFragmentManager);
            ww8Var = ww8.a;
        }
        if (ww8Var == null) {
            feedbackActivity.h0().e();
            feedbackActivity.j.mo865invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(FeedbackActivity feedbackActivity) {
        zq3.h(feedbackActivity, "this$0");
        FeedbackTooltipHelper h0 = feedbackActivity.h0();
        LinearLayout root = feedbackActivity.c0().getRoot();
        zq3.g(root, "getRoot(...)");
        ImageView imageView = feedbackActivity.c0().j;
        zq3.g(imageView, "feedbackScreenshot");
        h0.h(root, imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(FeedbackActivity feedbackActivity, View view) {
        zq3.h(feedbackActivity, "this$0");
        feedbackActivity.v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r0() {
        boolean b2 = d0().b(this);
        boolean z = !b2;
        if (!b2) {
            SnackbarUtil.y(getSnackbarUtil(), pl6.feedback_browser_launch_failed, 0, 2, null);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s0() {
        boolean f2 = d0().f(this);
        boolean z = !f2;
        if (!f2) {
            SnackbarUtil.y(getSnackbarUtil(), pl6.feedback_browser_launch_failed, 0, 2, null);
        }
        return z;
    }

    private final void t0() {
        String string = getString(al6.feedback_disclaimer_arg_priv);
        zq3.g(string, "getString(...)");
        String string2 = getString(al6.feedback_disclaimer_arg_tos);
        zq3.g(string2, "getString(...)");
        String string3 = getString(al6.feedback_disclaimer, string, string2);
        zq3.g(string3, "getString(...)");
        c0().e.setMovementMethod(new LinkMovementMethod());
        c0().e.setText(u0(string3, du8.a(string, new qs2() { // from class: com.nytimes.android.feedback.FeedbackActivity$populateDisclaimer$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                boolean r0;
                r0 = FeedbackActivity.this.r0();
                return Boolean.valueOf(r0);
            }
        }), du8.a(string2, new qs2() { // from class: com.nytimes.android.feedback.FeedbackActivity$populateDisclaimer$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                boolean s0;
                s0 = FeedbackActivity.this.s0();
                return Boolean.valueOf(s0);
            }
        })));
    }

    private final SpannableStringBuilder u0(String str, Pair... pairArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (Pair pair : pairArr) {
            f fVar = new f(pair);
            int b0 = h.b0(str, (String) pair.c(), 0, false, 6, null);
            spannableStringBuilder.setSpan(fVar, b0, ((String) pair.c()).length() + b0, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        Pair pair;
        File file;
        g0().hideSoftInputFromWindow(c0().getRoot().getWindowToken(), 0);
        FeedbackViewModel f0 = f0();
        String valueOf = String.valueOf(c0().f.getText());
        String valueOf2 = String.valueOf(c0().b.getText());
        u14 u14Var = (u14) e0().n().f();
        List list = null;
        String path = (u14Var == null || (pair = (Pair) u14Var.a()) == null || (file = (File) pair.d()) == null) ? null : file.getPath();
        List list2 = this.g;
        if (list2 == null) {
            zq3.z("extraFeedbackData");
        } else {
            list = list2;
        }
        f0.m(valueOf, valueOf2, path, list);
    }

    public final tc2 d0() {
        tc2 tc2Var = this.feedbackAppDependencies;
        if (tc2Var != null) {
            return tc2Var;
        }
        zq3.z("feedbackAppDependencies");
        return null;
    }

    public final FeedbackViewModel f0() {
        return (FeedbackViewModel) this.e.getValue();
    }

    public final FeedbackTooltipHelper h0() {
        FeedbackTooltipHelper feedbackTooltipHelper = this.tooltipHelper;
        if (feedbackTooltipHelper != null) {
            return feedbackTooltipHelper;
        }
        zq3.z("tooltipHelper");
        return null;
    }

    @Override // ky1.a
    public void i() {
        e0().l();
    }

    @Override // com.nytimes.android.feedback.f, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        List l;
        super.onCreate(bundle);
        p4.a.b(this, c0().d.getId());
        f0().l();
        l0();
        t0();
        AppCompatEditText appCompatEditText = c0().f;
        zq3.g(appCompatEditText, "feedbackEmail");
        appCompatEditText.addTextChangedListener(new d());
        TextInputEditText textInputEditText = c0().b;
        zq3.g(textInputEditText, "feedbackBody");
        textInputEditText.addTextChangedListener(new e());
        c0().c.setOnClickListener(new View.OnClickListener() { // from class: mc2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackActivity.n0(FeedbackActivity.this, view);
            }
        });
        f0().j().j(this, new g(new ss2() { // from class: com.nytimes.android.feedback.FeedbackActivity$onCreate$4
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Pair) obj);
                return ww8.a;
            }

            public final void invoke(Pair pair) {
                if (((CharSequence) pair.c()).length() > 0) {
                    FeedbackActivity.this.c0().f.setText((CharSequence) pair.c());
                }
                FeedbackActivity.this.c0().i.removeAllViews();
                Map map = (Map) pair.d();
                FeedbackActivity feedbackActivity = FeedbackActivity.this;
                for (Map.Entry entry : map.entrySet()) {
                    xc2 c2 = xc2.c(feedbackActivity.getLayoutInflater());
                    if (DeviceUtils.G(feedbackActivity)) {
                        int c3 = mx0.c(feedbackActivity, cd6.feedback_text_color);
                        TextView textView = c2.b;
                        TextPaint paint = c2.b.getPaint();
                        zq3.g(paint, "getPaint(...)");
                        textView.setCompoundDrawablesRelative(new yh8(paint, c3, (CharSequence) entry.getKey()), null, null, null);
                        c2.b.setText((CharSequence) entry.getValue());
                        c2.b.setGravity(8388613);
                    } else {
                        c2.b.setText(entry.getKey() + " " + entry.getValue());
                    }
                    zq3.g(c2, "apply(...)");
                    feedbackActivity.c0().i.addView(c2.getRoot());
                }
            }
        }));
        f0().k().j(this, new g(new ss2() { // from class: com.nytimes.android.feedback.FeedbackActivity$onCreate$5
            {
                super(1);
            }

            public final void b(u14 u14Var) {
                if (u14Var instanceof u14.c) {
                    FeedbackActivity.this.k0();
                } else if (u14Var instanceof u14.a) {
                    FeedbackActivity.this.i0(((u14.a) u14Var).b());
                } else if (u14Var instanceof u14.b) {
                    FeedbackActivity.this.j0();
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((u14) obj);
                return ww8.a;
            }
        }));
        e0().n().j(this, new g(new FeedbackActivity$onCreate$6(this)));
        c0().j.setClipToOutline(true);
        c0().j.setOnClickListener(new View.OnClickListener() { // from class: nc2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackActivity.o0(FeedbackActivity.this, view);
            }
        });
        c0().j.post(new Runnable() { // from class: oc2
            @Override // java.lang.Runnable
            public final void run() {
                FeedbackActivity.p0(FeedbackActivity.this);
            }
        });
        String[] stringArrayExtra = getIntent().getStringArrayExtra("extraFeedbackData");
        if (stringArrayExtra == null || (l = kotlin.collections.d.C0(stringArrayExtra)) == null) {
            l = i.l();
        }
        this.g = l;
        M();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        View view;
        zq3.h(menu, "menu");
        getMenuInflater().inflate(aj6.feedback, menu);
        MenuItem findItem = menu.findItem(rg6.menu_send);
        if (findItem == null || (view = findItem.getActionView()) == null) {
            view = null;
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: pc2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FeedbackActivity.q0(FeedbackActivity.this, view2);
                }
            });
        }
        this.h = view;
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        zq3.h(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().l();
        return true;
    }

    @Override // ky1.a
    public void p() {
        this.j.mo865invoke();
    }
}
