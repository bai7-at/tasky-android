package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.login.LoginTargetApp;
import defpackage.od9;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class od9 extends Dialog {
    public static final b m = new b(null);
    private static final int n = en6.com_facebook_activity_theme;
    private static volatile int r;
    private String a;
    private String b;
    private d c;
    private WebView d;
    private ProgressDialog e;
    private ImageView f;
    private FrameLayout g;
    private e h;
    private boolean i;
    private boolean j;
    private boolean k;
    private WindowManager.LayoutParams l;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            v29.o();
            return od9.r;
        }

        protected final void b(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && od9.r == 0) {
                    e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public final od9 c(Context context, String str, Bundle bundle, int i, d dVar) {
            zq3.h(context, "context");
            od9.s(context);
            return new od9(context, str, bundle, i, LoginTargetApp.FACEBOOK, dVar, null);
        }

        public final od9 d(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, d dVar) {
            zq3.h(context, "context");
            zq3.h(loginTargetApp, "targetApp");
            od9.s(context);
            return new od9(context, str, bundle, i, loginTargetApp, dVar, null);
        }

        public final void e(int i) {
            if (i == 0) {
                i = od9.n;
            }
            od9.r = i;
        }

        private b() {
        }
    }

    private final class c extends WebViewClient {
        final /* synthetic */ od9 a;

        public c(od9 od9Var) {
            zq3.h(od9Var, "this$0");
            this.a = od9Var;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog;
            zq3.h(webView, "view");
            zq3.h(str, "url");
            super.onPageFinished(webView, str);
            if (!this.a.j && (progressDialog = this.a.e) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.a.g;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView r = this.a.r();
            if (r != null) {
                r.setVisibility(0);
            }
            ImageView imageView = this.a.f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.a.k = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog progressDialog;
            WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
            zq3.h(webView, "view");
            zq3.h(str, "url");
            g29 g29Var = g29.a;
            g29.f0("FacebookSDK.WebDialog", zq3.q("Webview loading URL: ", str));
            super.onPageStarted(webView, str, bitmap);
            if (this.a.j || (progressDialog = this.a.e) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            zq3.h(webView, "view");
            zq3.h(str, "description");
            zq3.h(str2, "failingUrl");
            super.onReceivedError(webView, i, str, str2);
            this.a.y(new FacebookDialogException(str, i, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            zq3.h(webView, "view");
            zq3.h(sslErrorHandler, "handler");
            zq3.h(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            this.a.y(new FacebookDialogException(null, -11, null));
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: od9.c.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    public interface d {
        void a(Bundle bundle, FacebookException facebookException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends AsyncTask {
        private final String a;
        private final Bundle b;
        private Exception[] c;
        final /* synthetic */ od9 d;

        public e(od9 od9Var, String str, Bundle bundle) {
            zq3.h(od9Var, "this$0");
            zq3.h(str, "action");
            zq3.h(bundle, "parameters");
            this.d = od9Var;
            this.a = str;
            this.b = bundle;
            this.c = new Exception[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(String[] strArr, int i, e eVar, CountDownLatch countDownLatch, m23 m23Var) {
            FacebookRequestError b;
            String str;
            zq3.h(strArr, "$results");
            zq3.h(eVar, "this$0");
            zq3.h(countDownLatch, "$latch");
            zq3.h(m23Var, "response");
            try {
                b = m23Var.b();
                str = "Error staging photo.";
            } catch (Exception e) {
                eVar.c[i] = e;
            }
            if (b != null) {
                String c = b.c();
                if (c != null) {
                    str = c;
                }
                throw new FacebookGraphResponseException(m23Var, str);
            }
            JSONObject c2 = m23Var.c();
            if (c2 == null) {
                throw new FacebookException("Error staging photo.");
            }
            String optString = c2.optString("uri");
            if (optString == null) {
                throw new FacebookException("Error staging photo.");
            }
            strArr[i] = optString;
            countDownLatch.countDown();
        }

        protected String[] b(Void... voidArr) {
            if (c11.d(this)) {
                return null;
            }
            try {
                zq3.h(voidArr, "p0");
                String[] stringArray = this.b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                AccessToken e = AccessToken.Companion.e();
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        final int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            if (isCancelled()) {
                                Iterator it2 = concurrentLinkedQueue.iterator();
                                while (it2.hasNext()) {
                                    ((k23) it2.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri parse = Uri.parse(stringArray[i]);
                            if (g29.a0(parse)) {
                                strArr[i] = parse.toString();
                                countDownLatch.countDown();
                            } else {
                                GraphRequest.b bVar = new GraphRequest.b() { // from class: pd9
                                    @Override // com.facebook.GraphRequest.b
                                    public final void a(m23 m23Var) {
                                        od9.e.c(strArr, i, this, countDownLatch, m23Var);
                                    }
                                };
                                bq7 bq7Var = bq7.a;
                                zq3.g(parse, "uri");
                                concurrentLinkedQueue.add(bq7.t(e, parse, bVar).l());
                            }
                            if (i2 > length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it3 = concurrentLinkedQueue.iterator();
                    while (it3.hasNext()) {
                        ((k23) it3.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th) {
                c11.b(th, this);
                return null;
            }
        }

        protected void d(String[] strArr) {
            if (c11.d(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = this.d.e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                Exception[] excArr = this.c;
                int length = excArr.length;
                int i = 0;
                while (i < length) {
                    Exception exc = excArr[i];
                    i++;
                    if (exc != null) {
                        this.d.y(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    this.d.y(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                List e = kotlin.collections.d.e(strArr);
                if (e.contains(null)) {
                    this.d.y(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                g29 g29Var = g29.a;
                g29.l0(this.b, "media", new JSONArray((Collection) e));
                this.d.a = g29.g(yk7.b(), w92.v() + "/dialog/" + this.a, this.b).toString();
                ImageView imageView = this.d.f;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this.d.C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th) {
                c11.b(th, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (c11.d(this)) {
                return null;
            }
            try {
                return b((Void[]) objArr);
            } catch (Throwable th) {
                c11.b(th, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (c11.d(this)) {
                return;
            }
            try {
                d((String[]) obj);
            } catch (Throwable th) {
                c11.b(th, this);
            }
        }
    }

    public /* synthetic */ class f {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoginTargetApp.valuesCustom().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            a = iArr;
        }
    }

    public static final class g extends WebView {
        g(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    public /* synthetic */ od9(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i, loginTargetApp, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        g gVar = new g(getContext());
        this.d = gVar;
        gVar.setVerticalScrollBarEnabled(false);
        WebView webView = this.d;
        if (webView != null) {
            webView.setHorizontalScrollBarEnabled(false);
        }
        WebView webView2 = this.d;
        if (webView2 != null) {
            webView2.setWebViewClient(new c(this));
        }
        WebView webView3 = this.d;
        WebSettings settings = webView3 == null ? null : webView3.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.d;
        if (webView4 != null) {
            String str = this.a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            webView4.loadUrl(str);
        }
        WebView webView5 = this.d;
        if (webView5 != null) {
            webView5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView6 = this.d;
        if (webView6 != null) {
            webView6.setVisibility(4);
        }
        WebView webView7 = this.d;
        WebSettings settings2 = webView7 == null ? null : webView7.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView8 = this.d;
        WebSettings settings3 = webView8 != null ? webView8.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView9 = this.d;
        if (webView9 != null) {
            webView9.setFocusable(true);
        }
        WebView webView10 = this.d;
        if (webView10 != null) {
            webView10.setFocusableInTouchMode(true);
        }
        WebView webView11 = this.d;
        if (webView11 != null) {
            webView11.setOnTouchListener(new View.OnTouchListener() { // from class: ld9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean D;
                    D = od9.D(view, motionEvent);
                    return D;
                }
            });
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    private final void o() {
        ImageView imageView = new ImageView(getContext());
        this.f = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: nd9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                od9.p(od9.this, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(ef6.com_facebook_close);
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(od9 od9Var, View view) {
        zq3.h(od9Var, "this$0");
        od9Var.cancel();
    }

    private final int q(int i, float f2, int i2, int i3) {
        int i4 = (int) (i / f2);
        return (int) (i * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : (((i3 - i4) / (i3 - i2)) * 0.5d) + 0.5d));
    }

    protected static final void s(Context context) {
        m.b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(od9 od9Var, DialogInterface dialogInterface) {
        zq3.h(od9Var, "this$0");
        od9Var.cancel();
    }

    protected final void A(String str) {
        zq3.h(str, "expectedRedirectUrl");
        this.b = str;
    }

    public final void B(d dVar) {
        this.c = dVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.c == null || this.i) {
            return;
        }
        y(new FacebookOperationCanceledException());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.j && (progressDialog = this.e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.j = false;
        g29 g29Var = g29.a;
        Context context = getContext();
        zq3.g(context, "context");
        if (g29.j0(context) && (layoutParams = this.l) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.l;
                g29.f0("FacebookSDK.WebDialog", zq3.q("Set token on onAttachedToWindow(): ", layoutParams2 != null ? layoutParams2.token : null));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(pm6.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: md9
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    od9.v(od9.this, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.g = new FrameLayout(getContext());
        x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        o();
        if (this.a != null) {
            ImageView imageView = this.f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.addView(this.f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.g;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        zq3.h(keyEvent, "event");
        if (i == 4) {
            WebView webView = this.d;
            if (webView != null) {
                if (zq3.c(webView == null ? null : Boolean.valueOf(webView.canGoBack()), Boolean.TRUE)) {
                    WebView webView2 = this.d;
                    if (webView2 == null) {
                        return true;
                    }
                    webView2.goBack();
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        e eVar = this.h;
        if (eVar != null) {
            if ((eVar == null ? null : eVar.getStatus()) == AsyncTask.Status.PENDING) {
                e eVar2 = this.h;
                if (eVar2 != null) {
                    eVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.e;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        x();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        e eVar = this.h;
        if (eVar != null) {
            eVar.cancel(true);
            ProgressDialog progressDialog = this.e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        zq3.h(layoutParams, "params");
        if (layoutParams.token == null) {
            this.l = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    protected final WebView r() {
        return this.d;
    }

    protected final boolean t() {
        return this.i;
    }

    protected final boolean u() {
        return this.k;
    }

    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        g29 g29Var = g29.a;
        Bundle k0 = g29.k0(parse.getQuery());
        k0.putAll(g29.k0(parse.getFragment()));
        return k0;
    }

    public final void x() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int min = Math.min(q(i3, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(q(i, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }

    protected final void y(Throwable th) {
        if (this.c == null || this.i) {
            return;
        }
        this.i = true;
        FacebookException facebookException = th instanceof FacebookException ? (FacebookException) th : new FacebookException(th);
        d dVar = this.c;
        if (dVar != null) {
            dVar.a(null, facebookException);
        }
        dismiss();
    }

    protected final void z(Bundle bundle) {
        d dVar = this.c;
        if (dVar == null || this.i) {
            return;
        }
        this.i = true;
        if (dVar != null) {
            dVar.a(bundle, null);
        }
        dismiss();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected od9(Context context, String str) {
        this(context, str, m.a());
        zq3.h(context, "context");
        zq3.h(str, "url");
    }

    private od9(Context context, String str, int i) {
        super(context, i == 0 ? m.a() : i);
        this.b = "fbconnect://success";
        this.a = str;
    }

    private od9(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, d dVar) {
        super(context, i == 0 ? m.a() : i);
        Uri g2;
        this.b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = g29.S(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", w92.m());
        z38 z38Var = z38.a;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{w92.A()}, 1));
        zq3.g(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.c = dVar;
        if (zq3.c(str, "share") && bundle.containsKey("media")) {
            this.h = new e(this, str, bundle);
            return;
        }
        if (f.a[loginTargetApp.ordinal()] == 1) {
            g2 = g29.g(yk7.j(), "oauth/authorize", bundle);
        } else {
            g2 = g29.g(yk7.b(), w92.v() + "/dialog/" + ((Object) str), bundle);
        }
        this.a = g2.toString();
    }

    public static class a {
        private Context a;
        private String b;
        private String c;
        private int d;
        private d e;
        private Bundle f;
        private AccessToken g;

        public a(Context context, String str, Bundle bundle) {
            zq3.h(context, "context");
            zq3.h(str, "action");
            AccessToken.c cVar = AccessToken.Companion;
            this.g = cVar.e();
            if (!cVar.g()) {
                String F = g29.F(context);
                if (F == null) {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.b = F;
            }
            b(context, str, bundle);
        }

        private final void b(Context context, String str, Bundle bundle) {
            this.a = context;
            this.c = str;
            if (bundle != null) {
                this.f = bundle;
            } else {
                this.f = new Bundle();
            }
        }

        public od9 a() {
            AccessToken accessToken = this.g;
            if (accessToken != null) {
                Bundle bundle = this.f;
                if (bundle != null) {
                    bundle.putString("app_id", accessToken == null ? null : accessToken.c());
                }
                Bundle bundle2 = this.f;
                if (bundle2 != null) {
                    AccessToken accessToken2 = this.g;
                    bundle2.putString(AccessToken.ACCESS_TOKEN_KEY, accessToken2 != null ? accessToken2.m() : null);
                }
            } else {
                Bundle bundle3 = this.f;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.b);
                }
            }
            b bVar = od9.m;
            Context context = this.a;
            if (context != null) {
                return bVar.c(context, this.c, this.f, this.d, this.e);
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final String c() {
            return this.b;
        }

        public final Context d() {
            return this.a;
        }

        public final d e() {
            return this.e;
        }

        public final Bundle f() {
            return this.f;
        }

        public final int g() {
            return this.d;
        }

        public final a h(d dVar) {
            this.e = dVar;
            return this;
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            zq3.h(context, "context");
            zq3.h(str2, "action");
            this.b = v29.n(str == null ? g29.F(context) : str, "applicationId");
            b(context, str2, bundle);
        }
    }
}
