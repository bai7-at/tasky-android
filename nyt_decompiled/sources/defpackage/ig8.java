package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.nytimes.android.subauth.core.auth.network.response.d;
import java.util.ArrayList;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.e;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class ig8 implements Interceptor {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final b04 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ig8(b04 b04Var) {
        zq3.h(b04Var, "subauthClient");
        this.a = b04Var;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        hf4 c;
        gf4 gf4Var;
        String a2;
        hf4 c2;
        gf4 gf4Var2;
        String a3;
        zq3.h(chain, "chain");
        Request request = chain.request();
        if (zq3.c(request.header("X-APOLLO-OPERATION-NAME"), "OneWebViewHomeQuery")) {
            String str = i.u0(((z58) this.a.get()).h().i(), "+", null, null, 0, null, null, 62, null).toString();
            d a4 = ((z58) this.a.get()).a();
            ArrayList arrayList = new ArrayList();
            String a5 = a4 != null ? a4.a() : null;
            e c3 = a5 != null ? Regex.c(new Regex("\"signals\":\\{\"last_seen_segment_label\":(.*?)\\}"), a5, 0, 2, null) : null;
            if (c3 != null && (c2 = c3.c()) != null && (gf4Var2 = c2.get(1)) != null && (a3 = gf4Var2.a()) != null && !zq3.c(a3, Constants.NULL_VERSION_ID)) {
                arrayList.add("last_seen_segment_label=" + a3);
            }
            e c4 = a5 != null ? Regex.c(new Regex("\"news_entitlement_tenure_days\":\\s*([0-9]+)"), a5, 0, 2, null) : null;
            if (c4 != null && (c = c4.c()) != null && (gf4Var = c.get(1)) != null && (a2 = gf4Var.a()) != null) {
                String str2 = zq3.c(a2, Constants.NULL_VERSION_ID) ? null : a2;
                if (str2 != null) {
                    arrayList.add("news_tenure=" + str2);
                }
            }
            String p = ((z58) this.a.get()).h().p();
            if (p != null) {
                arrayList.add("regi_id=" + p);
            }
            String u0 = i.u0(arrayList, ",", null, null, 0, null, null, 62, null);
            Request.Builder newBuilder = request.newBuilder();
            if (str.length() > 0) {
                newBuilder = newBuilder.header("x-nyt-entitlements", str);
            }
            if (u0.length() > 0) {
                newBuilder.header("x-nyt-targeting-dimensions-map", u0);
            }
            request = newBuilder.build();
        }
        return chain.proceed(request);
    }
}
