package defpackage;

import android.util.Log;
import com.amazonaws.services.s3.Headers;
import com.nytimes.android.internal.graphql.interceptor.OldResponseException;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class z13 implements Interceptor {
    public static final a Companion;
    private static final String e;
    private final x13 a;
    private final Set b;
    private final boolean c;
    private final JsonAdapter d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        e = aVar.getClass().getSimpleName();
    }

    public z13(x13 x13Var, Set set, boolean z) {
        zq3.h(set, "optInToConditionalGetOperations");
        this.a = x13Var;
        this.b = set;
        this.c = z;
        this.d = new i.b().d().c(Map.class);
    }

    private final String a(RequestBody requestBody) {
        ad0 ad0Var = new ad0();
        requestBody.writeTo(ad0Var);
        return ad0Var.i1();
    }

    private final void b(String str, String str2, String str3, int i) {
        if (str2 == null || str3 == null || i == 304) {
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        try {
            if (simpleDateFormat.parse(str2).compareTo(simpleDateFormat.parse(str3)) <= 0) {
            } else {
                throw new OldResponseException(str, str2, str3);
            }
        } catch (ParseException e2) {
            Log.e(e, "Exception parsing last modification date.", e2);
        }
    }

    private final String c(RequestBody requestBody) {
        Object obj;
        Map map = (Map) this.d.fromJson(a(requestBody));
        if (map == null || (obj = map.get("variables")) == null) {
            return null;
        }
        return obj.toString();
    }

    private final Response d(Interceptor.Chain chain, x13 x13Var, String str) {
        String str2;
        RequestBody body = chain.request().body();
        if (body == null || (str2 = c(body)) == null) {
            str2 = "";
        }
        String b = x13Var.b(str, str2);
        long currentTimeMillis = System.currentTimeMillis();
        if (this.c) {
            Log.d(e, "----> " + str + "(" + str2 + ") [" + b + "]");
        }
        Request.Builder newBuilder = chain.request().newBuilder();
        zo3.a(newBuilder, Headers.GET_OBJECT_IF_MODIFIED_SINCE, b);
        Response proceed = chain.proceed(newBuilder.build());
        String header$default = Response.header$default(proceed, Headers.LAST_MODIFIED, null, 2, null);
        b(str, b, header$default, proceed.code());
        if (this.c) {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            Log.d(e, "<---- " + proceed.code() + " " + currentTimeMillis2 + "ms " + str + "(" + str2 + ") [" + header$default + "]");
        }
        if (proceed.code() != 304 || header$default != null) {
            x13Var.a(str, str2, header$default);
        }
        return proceed;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        zq3.h(chain, "chain");
        if (this.a == null) {
            return chain.proceed(chain.request());
        }
        String header = chain.request().header("X-APOLLO-OPERATION-NAME");
        return (header == null || !this.b.contains(header)) ? chain.proceed(chain.request()) : d(chain, this.a, header);
    }
}
