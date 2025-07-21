package com.facebook.appevents.cloudbridge;

import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import defpackage.an3;
import defpackage.du8;
import defpackage.g29;
import defpackage.k94;
import defpackage.ku8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.UninitializedPropertyAccessException;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.text.h;
import org.json.JSONArray;
import org.json.JSONObject;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class AppEventsConversionsAPITransformerWebRequests {
    public static final AppEventsConversionsAPITransformerWebRequests a = new AppEventsConversionsAPITransformerWebRequests();
    private static final HashSet b = b0.f(200, 202);
    private static final HashSet c = b0.f(503, 504, 429);
    public static a d;
    public static List e;
    private static int f;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
            zq3.h(str, "datasetID");
            zq3.h(str2, "cloudBridgeURL");
            zq3.h(str3, "accessKey");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.a + ", cloudBridgeURL=" + this.b + ", accessKey=" + this.c + ')';
        }
    }

    private AppEventsConversionsAPITransformerWebRequests() {
    }

    public static final void d(String str, String str2, String str3) {
        zq3.h(str, "datasetID");
        zq3.h(str2, "url");
        zq3.h(str3, "accessKey");
        k94.e.c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, str2, str3);
        AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = a;
        appEventsConversionsAPITransformerWebRequests.i(new a(str, str2, str3));
        appEventsConversionsAPITransformerWebRequests.j(new ArrayList());
    }

    private final List k(GraphRequest graphRequest) {
        JSONObject q = graphRequest.q();
        if (q == null) {
            return null;
        }
        Map x = t.x(g29.n(q));
        Object w = graphRequest.w();
        if (w == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        x.put("custom_events", w);
        StringBuilder sb = new StringBuilder();
        for (String str : x.keySet()) {
            sb.append(str);
            sb.append(" : ");
            sb.append(x.get(str));
            sb.append(System.getProperty("line.separator"));
        }
        k94.e.c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb);
        return AppEventsConversionsAPITransformer.a.e(x);
    }

    public static final void l(final GraphRequest graphRequest) {
        zq3.h(graphRequest, "request");
        g29 g29Var = g29.a;
        g29.y0(new Runnable() { // from class: vl
            @Override // java.lang.Runnable
            public final void run() {
                AppEventsConversionsAPITransformerWebRequests.m(GraphRequest.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(GraphRequest graphRequest) {
        zq3.h(graphRequest, "$request");
        String r = graphRequest.r();
        List F0 = r == null ? null : h.F0(r, new String[]{"/"}, false, 0, 6, null);
        if (F0 == null || F0.size() != 2) {
            k94.e.c(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", graphRequest);
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = a;
            String str = appEventsConversionsAPITransformerWebRequests.e().b() + "/capi/" + appEventsConversionsAPITransformerWebRequests.e().c() + "/events";
            List k = appEventsConversionsAPITransformerWebRequests.k(graphRequest);
            if (k == null) {
                return;
            }
            appEventsConversionsAPITransformerWebRequests.c(k);
            int min = Math.min(appEventsConversionsAPITransformerWebRequests.f().size(), 10);
            List L0 = i.L0(appEventsConversionsAPITransformerWebRequests.f(), new an3(0, min - 1));
            appEventsConversionsAPITransformerWebRequests.f().subList(0, min).clear();
            JSONArray jSONArray = new JSONArray((Collection) L0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", appEventsConversionsAPITransformerWebRequests.e().a());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            k94.a aVar = k94.e;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String jSONObject2 = jSONObject.toString(2);
            zq3.g(jSONObject2, "jsonBodyStr.toString(2)");
            aVar.c(loggingBehavior, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, graphRequest, jSONObject2);
            appEventsConversionsAPITransformerWebRequests.h(str, "POST", jSONObject.toString(), t.f(du8.a("Content-Type", Constants.APPLICATION_JSON)), 60000, new AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(L0));
        } catch (UninitializedPropertyAccessException e2) {
            k94.e.c(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e2);
        }
    }

    public final void c(List list) {
        if (list != null) {
            f().addAll(list);
        }
        int max = Math.max(0, f().size() - 1000);
        if (max > 0) {
            j(ku8.c(i.e0(f(), max)));
        }
    }

    public final a e() {
        a aVar = d;
        if (aVar != null) {
            return aVar;
        }
        zq3.z("credentials");
        throw null;
    }

    public final List f() {
        List list = e;
        if (list != null) {
            return list;
        }
        zq3.z("transformedEvents");
        throw null;
    }

    public final void g(Integer num, List list, int i) {
        zq3.h(list, "processedEvents");
        if (i.c0(c, num)) {
            if (f >= i) {
                f().clear();
                f = 0;
            } else {
                f().addAll(0, list);
                f++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1 A[Catch: IOException -> 0x0045, UnknownHostException -> 0x0048, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x0048, IOException -> 0x0045, blocks: (B:3:0x000f, B:5:0x001a, B:8:0x004b, B:10:0x0057, B:14:0x0067, B:16:0x00a1, B:23:0x00bd, B:31:0x00c3, B:32:0x00c6, B:34:0x00c7, B:36:0x00e7, B:40:0x0022, B:43:0x0029, B:44:0x002f, B:46:0x0035, B:48:0x00f3, B:49:0x00fa), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7 A[Catch: IOException -> 0x0045, UnknownHostException -> 0x0048, TryCatch #4 {UnknownHostException -> 0x0048, IOException -> 0x0045, blocks: (B:3:0x000f, B:5:0x001a, B:8:0x004b, B:10:0x0057, B:14:0x0067, B:16:0x00a1, B:23:0x00bd, B:31:0x00c3, B:32:0x00c6, B:34:0x00c7, B:36:0x00e7, B:40:0x0022, B:43:0x0029, B:44:0x002f, B:46:0x0035, B:48:0x00f3, B:49:0x00fa), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map r8, int r9, defpackage.gt2 r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.h(java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, gt2):void");
    }

    public final void i(a aVar) {
        zq3.h(aVar, "<set-?>");
        d = aVar;
    }

    public final void j(List list) {
        zq3.h(list, "<set-?>");
        e = list;
    }
}
