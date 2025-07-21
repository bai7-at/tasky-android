package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import defpackage.fa9;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class fa9 {
    public static final a e = new a(null);
    private static final String f;
    private static fa9 g;
    private final Handler a;
    private final WeakReference b;
    private Timer c;
    private String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(m23 m23Var) {
            zq3.h(m23Var, "it");
            k94.e.b(LoggingBehavior.APP_EVENTS, fa9.d(), "App index sent to FB!");
        }

        public final GraphRequest b(String str, AccessToken accessToken, String str2, String str3) {
            zq3.h(str3, "requestType");
            if (str == null) {
                return null;
            }
            GraphRequest.c cVar = GraphRequest.n;
            z38 z38Var = z38.a;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            GraphRequest A = cVar.A(accessToken, format, null, null);
            Bundle u = A.u();
            if (u == null) {
                u = new Bundle();
            }
            u.putString("tree", str);
            u.putString("app_version", sl.d());
            u.putString("platform", "android");
            u.putString("request_type", str3);
            if (zq3.c(str3, "app_indexing")) {
                u.putString("device_session_id", bn0.g());
            }
            A.H(u);
            A.D(new GraphRequest.b() { // from class: ea9
                @Override // com.facebook.GraphRequest.b
                public final void a(m23 m23Var) {
                    fa9.a.c(m23Var);
                }
            });
            return A;
        }

        private a() {
        }
    }

    private static final class b implements Callable {
        private final WeakReference a;

        public b(View view) {
            zq3.h(view, "rootView");
            this.a = new WeakReference(view);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = (View) this.a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            zq3.g(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    public static final class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) fa9.c(fa9.this).get();
                View e = sl.e(activity);
                if (activity != null && e != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    zq3.g(simpleName, "activity.javaClass.simpleName");
                    if (bn0.h()) {
                        if (sq3.b()) {
                            dx8.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(e));
                        fa9.e(fa9.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e2) {
                            Log.e(fa9.d(), "Failed to take screenshot.", e2);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(ba9.d(e));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(fa9.d(), "Failed to create JSONObject");
                        }
                        String jSONObject2 = jSONObject.toString();
                        zq3.g(jSONObject2, "viewTree.toString()");
                        fa9.f(fa9.this, jSONObject2);
                    }
                }
            } catch (Exception e3) {
                Log.e(fa9.d(), "UI Component tree indexing failure!", e3);
            }
        }
    }

    static {
        String canonicalName = fa9.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f = canonicalName;
    }

    public fa9(Activity activity) {
        zq3.h(activity, "activity");
        this.b = new WeakReference(activity);
        this.d = null;
        this.a = new Handler(Looper.getMainLooper());
        g = this;
    }

    public static final /* synthetic */ WeakReference c(fa9 fa9Var) {
        if (c11.d(fa9.class)) {
            return null;
        }
        try {
            return fa9Var.b;
        } catch (Throwable th) {
            c11.b(th, fa9.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (c11.d(fa9.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            c11.b(th, fa9.class);
            return null;
        }
    }

    public static final /* synthetic */ Handler e(fa9 fa9Var) {
        if (c11.d(fa9.class)) {
            return null;
        }
        try {
            return fa9Var.a;
        } catch (Throwable th) {
            c11.b(th, fa9.class);
            return null;
        }
    }

    public static final /* synthetic */ void f(fa9 fa9Var, String str) {
        if (c11.d(fa9.class)) {
            return;
        }
        try {
            fa9Var.j(str);
        } catch (Throwable th) {
            c11.b(th, fa9.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(fa9 fa9Var, TimerTask timerTask) {
        if (c11.d(fa9.class)) {
            return;
        }
        try {
            zq3.h(fa9Var, "this$0");
            zq3.h(timerTask, "$indexingTask");
            try {
                Timer timer = fa9Var.c;
                if (timer != null) {
                    timer.cancel();
                }
                fa9Var.d = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
                fa9Var.c = timer2;
            } catch (Exception e2) {
                Log.e(f, "Error scheduling indexing job", e2);
            }
        } catch (Throwable th) {
            c11.b(th, fa9.class);
        }
    }

    private final void j(final String str) {
        if (c11.d(this)) {
            return;
        }
        try {
            w92.t().execute(new Runnable() { // from class: da9
                @Override // java.lang.Runnable
                public final void run() {
                    fa9.k(str, this);
                }
            });
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(String str, fa9 fa9Var) {
        if (c11.d(fa9.class)) {
            return;
        }
        try {
            zq3.h(str, "$tree");
            zq3.h(fa9Var, "this$0");
            String i0 = g29.i0(str);
            AccessToken e2 = AccessToken.Companion.e();
            if (i0 == null || !zq3.c(i0, fa9Var.d)) {
                fa9Var.g(e.b(str, e2, w92.m(), "app_indexing"), i0);
            }
        } catch (Throwable th) {
            c11.b(th, fa9.class);
        }
    }

    public final void g(GraphRequest graphRequest, String str) {
        if (c11.d(this) || graphRequest == null) {
            return;
        }
        try {
            m23 k = graphRequest.k();
            try {
                JSONObject c2 = k.c();
                if (c2 == null) {
                    Log.e(f, zq3.q("Error sending UI component tree to Facebook: ", k.b()));
                    return;
                }
                if (zq3.c("true", c2.optString("success"))) {
                    k94.e.b(LoggingBehavior.APP_EVENTS, f, "Successfully send UI component tree to server");
                    this.d = str;
                }
                if (c2.has("is_app_indexing_enabled")) {
                    bn0.n(c2.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e2) {
                Log.e(f, "Error decoding server response.", e2);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void h() {
        if (c11.d(this)) {
            return;
        }
        try {
            final c cVar = new c();
            try {
                w92.t().execute(new Runnable() { // from class: ca9
                    @Override // java.lang.Runnable
                    public final void run() {
                        fa9.i(fa9.this, cVar);
                    }
                });
            } catch (RejectedExecutionException e2) {
                Log.e(f, "Error scheduling indexing job", e2);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void l() {
        if (c11.d(this)) {
            return;
        }
        try {
            if (((Activity) this.b.get()) == null) {
                return;
            }
            try {
                Timer timer = this.c;
                if (timer != null) {
                    timer.cancel();
                }
                this.c = null;
            } catch (Exception e2) {
                Log.e(f, "Error unscheduling indexing job", e2);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }
}
