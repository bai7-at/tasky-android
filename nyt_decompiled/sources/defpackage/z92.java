package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z92 extends od9 {
    public static final a t = new a(null);
    private static final String u;
    private boolean s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z92 a(Context context, String str, String str2) {
            zq3.h(context, "context");
            zq3.h(str, "url");
            zq3.h(str2, "expectedRedirectUrl");
            od9.s(context);
            return new z92(context, str, str2, null);
        }

        private a() {
        }
    }

    static {
        String name = z92.class.getName();
        zq3.g(name, "FacebookWebFallbackDialog::class.java.name");
        u = name;
    }

    public /* synthetic */ z92(Context context, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(z92 z92Var) {
        zq3.h(z92Var, "this$0");
        super.cancel();
    }

    @Override // defpackage.od9, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView r = r();
        if (!u() || t() || r == null || !r.isShown()) {
            super.cancel();
        } else {
            if (this.s) {
                return;
            }
            this.s = true;
            r.loadUrl(zq3.q("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: y92
                @Override // java.lang.Runnable
                public final void run() {
                    z92.F(z92.this);
                }
            }, 1500L);
        }
    }

    @Override // defpackage.od9
    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        g29 g29Var = g29.a;
        Bundle k0 = g29.k0(parse.getQuery());
        String string = k0.getString("bridge_args");
        k0.remove("bridge_args");
        if (!g29.Y(string)) {
            try {
                k0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", ke0.a(new JSONObject(string)));
            } catch (JSONException e) {
                g29 g29Var2 = g29.a;
                g29.g0(u, "Unable to parse bridge_args JSON", e);
            }
        }
        String string2 = k0.getString("method_results");
        k0.remove("method_results");
        if (!g29.Y(string2)) {
            try {
                k0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", ke0.a(new JSONObject(string2)));
            } catch (JSONException e2) {
                g29 g29Var3 = g29.a;
                g29.g0(u, "Unable to parse bridge_args JSON", e2);
            }
        }
        k0.remove("version");
        k0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", c25.x());
        return k0;
    }

    private z92(Context context, String str, String str2) {
        super(context, str);
        A(str2);
    }
}
