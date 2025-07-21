package defpackage;

import android.os.Bundle;
import android.view.View;
import com.facebook.GraphRequest;
import com.facebook.appevents.ml.ModelManager;
import defpackage.xa9;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class xa9 implements View.OnClickListener {
    public static final a e = new a(null);
    private static final Set f = new HashSet();
    private final View.OnClickListener a;
    private final WeakReference b;
    private final WeakReference c;
    private final String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str, String str2, float[] fArr) {
            if (fc8.f(str)) {
                new kq3(w92.l()).e(str, str2);
            } else if (fc8.e(str)) {
                h(str, str2, fArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean f(String str, final String str2) {
            final String d = j16.d(str);
            if (d == null) {
                return false;
            }
            if (zq3.c(d, "other")) {
                return true;
            }
            g29 g29Var = g29.a;
            g29.y0(new Runnable() { // from class: wa9
                @Override // java.lang.Runnable
                public final void run() {
                    xa9.a.g(d, str2);
                }
            });
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(String str, String str2) {
            zq3.h(str, "$queriedEvent");
            zq3.h(str2, "$buttonText");
            xa9.e.e(str, str2, new float[0]);
        }

        private final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                int length = fArr.length;
                int i = 0;
                while (i < length) {
                    float f = fArr[i];
                    i++;
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.c cVar = GraphRequest.n;
                z38 z38Var = z38.a;
                String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{w92.m()}, 1));
                zq3.g(format, "java.lang.String.format(locale, format, *args)");
                GraphRequest A = cVar.A(null, format, null, null);
                A.H(bundle);
                A.k();
            } catch (JSONException unused) {
            }
        }

        public final void d(View view, View view2, String str) {
            zq3.h(view, "hostView");
            zq3.h(view2, "rootView");
            zq3.h(str, "activityName");
            int hashCode = view.hashCode();
            if (xa9.b().contains(Integer.valueOf(hashCode))) {
                return;
            }
            ba9 ba9Var = ba9.a;
            ba9.r(view, new xa9(view, view2, str, null));
            xa9.b().add(Integer.valueOf(hashCode));
        }

        private a() {
        }
    }

    public /* synthetic */ xa9(View view, View view2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set b() {
        if (c11.d(xa9.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            c11.b(th, xa9.class);
            return null;
        }
    }

    private final void c(final String str, final String str2, final JSONObject jSONObject) {
        if (c11.d(this)) {
            return;
        }
        try {
            g29 g29Var = g29.a;
            g29.y0(new Runnable() { // from class: va9
                @Override // java.lang.Runnable
                public final void run() {
                    xa9.d(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(JSONObject jSONObject, String str, xa9 xa9Var, String str2) {
        if (c11.d(xa9.class)) {
            return;
        }
        try {
            zq3.h(jSONObject, "$viewData");
            zq3.h(str, "$buttonText");
            zq3.h(xa9Var, "this$0");
            zq3.h(str2, "$pathID");
            try {
                g29 g29Var = g29.a;
                String u = g29.u(w92.l());
                if (u == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = u.toLowerCase();
                zq3.g(lowerCase, "(this as java.lang.String).toLowerCase()");
                float[] a2 = ab2.a(jSONObject, lowerCase);
                String c = ab2.c(str, xa9Var.d, lowerCase);
                if (a2 == null) {
                    return;
                }
                ModelManager modelManager = ModelManager.a;
                String[] q = ModelManager.q(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{a2}, new String[]{c});
                if (q == null) {
                    return;
                }
                String str3 = q[0];
                j16.a(str2, str3);
                if (zq3.c(str3, "other")) {
                    return;
                }
                e.e(str3, str, a2);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            c11.b(th, xa9.class);
        }
    }

    private final void e() {
        if (c11.d(this)) {
            return;
        }
        try {
            View view = (View) this.b.get();
            View view2 = (View) this.c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String d = dc8.d(view2);
                String b = j16.b(view2, d);
                if (b == null || e.f(b, d)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("view", dc8.b(view, view2));
                jSONObject.put("screenname", this.d);
                c(b, d, jSONObject);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(view, "view");
            View.OnClickListener onClickListener = this.a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            e();
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private xa9(View view, View view2, String str) {
        this.a = ba9.g(view);
        this.b = new WeakReference(view2);
        this.c = new WeakReference(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        zq3.g(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.d = h.F(lowerCase, "activity", "", false, 4, null);
    }
}
