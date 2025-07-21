package defpackage;

import com.apollographql.apollo.api.http.HttpMethod;
import defpackage.ab3;
import defpackage.xh1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okio.ByteString;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class xh1 implements bb3 {
    public static final a b = new a(null);
    private static final String c = "X-APOLLO-OPERATION-ID";
    private static final String d = "X-APOLLO-OPERATION-NAME";
    private static final String e = "Apollo-Require-Preflight";
    private static final String f = "Accept";
    private static final String g = "multipart/mixed;deferSpec=20220824, application/graphql-response+json, application/json";
    private static final String h = "multipart/mixed;subscriptionSpec=1.0, application/graphql-response+json, application/json";
    private final String a;

    public static final class a {

        /* renamed from: xh1$a$a, reason: collision with other inner class name */
        public static final class C0554a implements pa3 {
            private final String a = Constants.APPLICATION_JSON;
            private final long b;
            final /* synthetic */ ByteString c;

            C0554a(ByteString byteString) {
                this.c = byteString;
                this.b = byteString.E();
            }

            @Override // defpackage.pa3
            public void a(qd0 qd0Var) {
                zq3.h(qd0Var, "bufferedSink");
                qd0Var.m1(this.c);
            }

            @Override // defpackage.pa3
            public long getContentLength() {
                return this.b;
            }

            @Override // defpackage.pa3
            public String getContentType() {
                return this.a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ss2 f(final String str, final boolean z) {
            return new ss2() { // from class: wh1
                @Override // defpackage.ss2
                public final Object invoke(Object obj) {
                    ww8 g;
                    g = xh1.a.g(z, str, (lu3) obj);
                    return g;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ww8 g(boolean z, String str, lu3 lu3Var) {
            zq3.h(lu3Var, "<this>");
            if (z) {
                lu3Var.name("extensions");
                lu3Var.beginObject();
                lu3Var.name("persistedQuery");
                lu3Var.beginObject();
                lu3Var.name("version").D(1);
                lu3Var.name("sha256Hash").value(str);
                lu3Var.endObject();
                lu3Var.endObject();
            }
            return ww8.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String h(String str, ii5 ii5Var, w41 w41Var, boolean z, boolean z2) {
            return e(str, k(ii5Var, w41Var, z, z2));
        }

        private final Map k(ii5 ii5Var, w41 w41Var, boolean z, boolean z2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operationName", ii5Var.name());
            ad0 ad0Var = new ad0();
            hf2 hf2Var = new hf2(new rd0(ad0Var, null));
            hf2Var.beginObject();
            ii5Var.c(hf2Var, w41Var, false);
            hf2Var.endObject();
            if (!hf2Var.d().isEmpty()) {
                throw new IllegalStateException("FileUpload and Http GET are not supported at the same time");
            }
            linkedHashMap.put("variables", ad0Var.i1());
            if (z2) {
                linkedHashMap.put("query", ii5Var.b());
            }
            if (z) {
                ad0 ad0Var2 = new ad0();
                rd0 rd0Var = new rd0(ad0Var2, null);
                rd0Var.beginObject();
                rd0Var.name("persistedQuery");
                rd0Var.beginObject();
                rd0Var.name("version").D(1);
                rd0Var.name("sha256Hash").value(ii5Var.id());
                rd0Var.endObject();
                rd0Var.endObject();
                linkedHashMap.put("extensions", ad0Var2.i1());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map m(lu3 lu3Var, ii5 ii5Var, w41 w41Var, String str, ss2 ss2Var) {
            lu3Var.beginObject();
            lu3Var.name("operationName");
            lu3Var.value(ii5Var.name());
            lu3Var.name("variables");
            hf2 hf2Var = new hf2(lu3Var);
            hf2Var.beginObject();
            ii5Var.c(hf2Var, w41Var, false);
            hf2Var.endObject();
            Map d = hf2Var.d();
            if (str != null) {
                lu3Var.name("query");
                lu3Var.value(str);
            }
            ss2Var.invoke(lu3Var);
            lu3Var.endObject();
            return d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map n(lu3 lu3Var, ii5 ii5Var, w41 w41Var, boolean z, String str) {
            return m(lu3Var, ii5Var, w41Var, str, f(ii5Var.id(), z));
        }

        public final String e(String str, Map map) {
            zq3.h(str, "<this>");
            zq3.h(map, "parameters");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            boolean P = h.P(str, "?", false, 2, null);
            for (Map.Entry entry : map.entrySet()) {
                if (P) {
                    sb.append('&');
                } else {
                    sb.append('?');
                    P = true;
                }
                sb.append(az8.c((String) entry.getKey()));
                sb.append('=');
                sb.append(az8.c((String) entry.getValue()));
            }
            String sb2 = sb.toString();
            zq3.g(sb2, "toString(...)");
            return sb2;
        }

        public final pa3 i(ii5 ii5Var, w41 w41Var, String str, ss2 ss2Var) {
            zq3.h(ii5Var, "operation");
            zq3.h(w41Var, "customScalarAdapters");
            zq3.h(ss2Var, "extensionsWriter");
            ad0 ad0Var = new ad0();
            Map m = xh1.b.m(new rd0(ad0Var, null), ii5Var, w41Var, str, ss2Var);
            ByteString a1 = ad0Var.a1();
            return m.isEmpty() ? new C0554a(a1) : new sy8(m, a1);
        }

        public final pa3 j(ii5 ii5Var, w41 w41Var, boolean z, String str) {
            zq3.h(ii5Var, "operation");
            zq3.h(w41Var, "customScalarAdapters");
            return i(ii5Var, w41Var, str, f(ii5Var.id(), z));
        }

        public final Map l(xj xjVar) {
            zq3.h(xjVar, "apolloRequest");
            ii5 g = xjVar.g();
            Boolean j = xjVar.j();
            boolean booleanValue = j != null ? j.booleanValue() : false;
            Boolean k = xjVar.k();
            boolean booleanValue2 = k != null ? k.booleanValue() : true;
            w41 w41Var = (w41) xjVar.c().b(w41.h);
            if (w41Var == null) {
                w41Var = w41.i;
            }
            w41 w41Var2 = w41Var;
            String b = booleanValue2 ? g.b() : null;
            qe4 qe4Var = new qe4();
            xh1.b.n(qe4Var, g, w41Var2, booleanValue, b);
            Object d = qe4Var.d();
            zq3.f(d, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return (Map) d;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            try {
                iArr[HttpMethod.Get.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpMethod.Post.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public xh1(String str) {
        zq3.h(str, "serverUrl");
        this.a = str;
    }

    @Override // defpackage.bb3
    public ab3 a(xj xjVar) {
        ab3.a b2;
        zq3.h(xjVar, "apolloRequest");
        ii5 g2 = xjVar.g();
        w41 w41Var = (w41) xjVar.c().b(w41.h);
        if (w41Var == null) {
            w41Var = w41.i;
        }
        w41 w41Var2 = w41Var;
        ArrayList arrayList = new ArrayList();
        xjVar.g();
        arrayList.add(new va3(f, g));
        if (xjVar.e() != null) {
            arrayList.addAll(xjVar.e());
        }
        Boolean j = xjVar.j();
        boolean booleanValue = j != null ? j.booleanValue() : false;
        Boolean k = xjVar.k();
        boolean booleanValue2 = k != null ? k.booleanValue() : true;
        HttpMethod f2 = xjVar.f();
        if (f2 == null) {
            f2 = HttpMethod.Post;
        }
        int i = b.a[f2.ordinal()];
        if (i == 1) {
            b2 = new ab3.a(HttpMethod.Get, b.h(this.a, g2, w41Var2, booleanValue, booleanValue2)).b(e, "true");
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pa3 j2 = b.j(g2, w41Var2, booleanValue, booleanValue2 ? g2.b() : null);
            b2 = new ab3.a(HttpMethod.Post, this.a).d(j2);
            if (h.K(j2.getContentType(), "multipart/form-data", false, 2, null)) {
                b2 = b2.b(e, "true");
            }
        }
        return b2.c(arrayList).a(xjVar.c()).e();
    }
}
