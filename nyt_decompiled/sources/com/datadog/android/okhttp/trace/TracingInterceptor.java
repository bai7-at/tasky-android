package com.datadog.android.okhttp.trace;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.HostsSanitizer;
import com.datadog.android.core.sampling.RateBasedSampler;
import com.datadog.android.okhttp.TraceContextInjection;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.trace.AndroidTracer;
import com.datadog.android.trace.TracingHeaderType;
import com.datadog.opentracing.b;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import defpackage.a87;
import defpackage.ag8;
import defpackage.dp2;
import defpackage.du8;
import defpackage.ej8;
import defpackage.fj8;
import defpackage.fp8;
import defpackage.gt2;
import defpackage.hp8;
import defpackage.jb2;
import defpackage.kl8;
import defpackage.kz4;
import defpackage.lh1;
import defpackage.lh4;
import defpackage.md7;
import defpackage.qs2;
import defpackage.qy4;
import defpackage.rq3;
import defpackage.s75;
import defpackage.ss2;
import defpackage.tx7;
import defpackage.vc7;
import defpackage.ww8;
import defpackage.wx7;
import defpackage.zo8;
import defpackage.zq3;
import defpackage.zx7;
import io.opentracing.util.GlobalTracer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public abstract class TracingInterceptor implements Interceptor {
    public static final a Companion = new a(null);
    private final String a;
    private final Map b;
    private final fp8 c;
    private final String d;
    private final a87 e;
    private final TraceContextInjection f;
    private final gt2 g;
    private final AtomicReference h;
    private final List i;
    private final lh1 j;
    private final md7 k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TracingHeaderType.values().length];
            try {
                iArr[TracingHeaderType.DATADOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TracingHeaderType.B3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TracingHeaderType.B3MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TracingHeaderType.TRACECONTEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public TracingInterceptor(String str, Map map, fp8 fp8Var, String str2, a87 a87Var, TraceContextInjection traceContextInjection, gt2 gt2Var) {
        zq3.h(map, "tracedHosts");
        zq3.h(fp8Var, "tracedRequestListener");
        zq3.h(a87Var, "traceSampler");
        zq3.h(traceContextInjection, "traceContextInjection");
        zq3.h(gt2Var, "localTracerFactory");
        this.a = str;
        this.b = map;
        this.c = fp8Var;
        this.d = str2;
        this.e = a87Var;
        this.f = traceContextInjection;
        this.g = gt2Var;
        this.h = new AtomicReference();
        this.i = new HostsSanitizer().a(i.X0(map.keySet()), "Network Requests");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (this.i.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.j = new lh1(linkedHashMap);
        this.k = new md7(this.a, new ss2() { // from class: com.datadog.android.okhttp.trace.TracingInterceptor$sdkCoreReference$1
            {
                super(1);
            }

            public final void b(vc7 vc7Var) {
                zq3.h(vc7Var, "it");
                TracingInterceptor.this.r((rq3) vc7Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((vc7) obj);
                return ww8.a;
            }
        });
    }

    private final tx7 c(hp8 hp8Var, Request request) {
        wx7 e = e(hp8Var, request);
        String httpUrl = request.url().toString();
        hp8.a I = hp8Var.I("okhttp.request");
        b.C0161b c0161b = I instanceof b.C0161b ? (b.C0161b) I : null;
        if (c0161b != null) {
            c0161b.j(this.d);
        }
        tx7 start = I.b(e).start();
        qy4 qy4Var = start instanceof qy4 ? (qy4) start : null;
        if (qy4Var != null) {
            qy4Var.h(h.X0(httpUrl, '?', null, 2, null));
        }
        start.e(ag8.a.getKey(), httpUrl);
        start.e(ag8.c.getKey(), request.method());
        start.c(ag8.j, "client");
        zq3.g(start, "span");
        return start;
    }

    private final wx7 e(hp8 hp8Var, Request request) {
        wx7 wx7Var;
        tx7 tx7Var = (tx7) request.tag(tx7.class);
        if (tx7Var == null || (wx7Var = tx7Var.f()) == null) {
            lh4.a(request.tag(zo8.class));
            wx7Var = null;
        }
        dp2 dp2Var = dp2.a.d;
        Map<String, List<String>> multimap = request.headers().toMultimap();
        ArrayList arrayList = new ArrayList(multimap.size());
        for (Map.Entry<String, List<String>> entry : multimap.entrySet()) {
            arrayList.add(du8.a(entry.getKey(), i.u0(entry.getValue(), ";", null, null, 0, null, null, 62, null)));
        }
        wx7 R0 = hp8Var.R0(dp2Var, new ej8(t.t(arrayList)));
        return R0 == null ? wx7Var : R0;
    }

    private final Boolean f(Request request) {
        String header = request.header("x-datadog-sampling-priority");
        Integer l = header != null ? h.l(header) : null;
        boolean z = true;
        if (l != null) {
            if (l.intValue() == Integer.MIN_VALUE) {
                return null;
            }
            if (l.intValue() != 2 && l.intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        String header2 = request.header("X-B3-Sampled");
        if (header2 != null) {
            if (zq3.c(header2, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                return Boolean.TRUE;
            }
            if (zq3.c(header2, "0")) {
                return Boolean.FALSE;
            }
            return null;
        }
        String header3 = request.header("b3");
        if (header3 != null) {
            if (zq3.c(header3, "0")) {
                return Boolean.FALSE;
            }
            List F0 = h.F0(header3, new String[]{"-"}, false, 0, 6, null);
            if (F0.size() >= 3) {
                String str = (String) F0.get(2);
                int hashCode = str.hashCode();
                if (hashCode == 48) {
                    if (str.equals("0")) {
                        return Boolean.FALSE;
                    }
                    return null;
                }
                if (hashCode != 49) {
                    if (hashCode != 100 || !str.equals(QueryKeys.SUBDOMAIN)) {
                        return null;
                    }
                } else if (!str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    return null;
                }
                return Boolean.TRUE;
            }
        }
        String header4 = request.header("traceparent");
        if (header4 == null) {
            return null;
        }
        List F02 = h.F0(header4, new String[]{"-"}, false, 0, 6, null);
        if (F02.size() < 4) {
            return null;
        }
        Integer l2 = h.l((String) F02.get(3));
        if (l2 != null && l2.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (l2 != null && l2.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    private final void g(Request.Builder builder) {
        if (this.f == TraceContextInjection.All) {
            builder.addHeader("X-B3-Sampled", "0");
        }
    }

    private final void h(Request.Builder builder) {
        if (this.f == TraceContextInjection.All) {
            builder.addHeader("b3", "0");
        }
    }

    private final void i(final Request.Builder builder, tx7 tx7Var, hp8 hp8Var) {
        if (this.f == TraceContextInjection.All) {
            hp8Var.n1(tx7Var.f(), dp2.a.c, new fj8() { // from class: pp8
                @Override // defpackage.fj8
                public final void put(String str, String str2) {
                    TracingInterceptor.j(Request.Builder.this, str, str2);
                }
            });
            builder.addHeader("x-datadog-sampling-priority", "0");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Request.Builder builder, String str, String str2) {
        zq3.h(builder, "$requestBuilder");
        zq3.g(str, TransferTable.COLUMN_KEY);
        builder.removeHeader(str);
        switch (str.hashCode()) {
            case -1682961930:
                if (!str.equals("x-datadog-origin")) {
                    return;
                }
                break;
            case 304080974:
                if (!str.equals("x-datadog-parent-id")) {
                    return;
                }
                break;
            case 1316815593:
                if (!str.equals("x-datadog-tags")) {
                    return;
                }
                break;
            case 1767467379:
                if (!str.equals("x-datadog-trace-id")) {
                    return;
                }
                break;
            default:
                return;
        }
        zq3.g(str2, "value");
        builder.addHeader(str, str2);
    }

    private final void k(jb2 jb2Var, Request request, Response response, tx7 tx7Var, boolean z) {
        if (!z || tx7Var == null) {
            q(jb2Var, request, null, response, null);
            return;
        }
        int code = response.code();
        tx7Var.b(ag8.b.getKey(), Integer.valueOf(code));
        if (400 <= code && code < 500) {
            qy4 qy4Var = tx7Var instanceof qy4 ? (qy4) tx7Var : null;
            if (qy4Var != null) {
                qy4Var.g(true);
            }
        }
        if (code == 404) {
            qy4 qy4Var2 = tx7Var instanceof qy4 ? (qy4) tx7Var : null;
            if (qy4Var2 != null) {
                qy4Var2.h("404");
            }
        }
        q(jb2Var, request, tx7Var, response, null);
        if (d()) {
            tx7Var.a();
            return;
        }
        qy4 qy4Var3 = tx7Var instanceof qy4 ? (qy4) tx7Var : null;
        if (qy4Var3 != null) {
            qy4Var3.drop();
        }
    }

    private final void l(jb2 jb2Var, Request request, Throwable th, tx7 tx7Var, boolean z) {
        if (!z || tx7Var == null) {
            q(jb2Var, request, null, null, th);
            return;
        }
        boolean z2 = tx7Var instanceof qy4;
        qy4 qy4Var = z2 ? (qy4) tx7Var : null;
        if (qy4Var != null) {
            qy4Var.g(true);
        }
        tx7Var.e("error.msg", th.getMessage());
        tx7Var.e("error.type", th.getClass().getName());
        tx7Var.e("error.stack", kl8.a(th));
        q(jb2Var, request, tx7Var, null, th);
        if (d()) {
            tx7Var.a();
            return;
        }
        qy4 qy4Var2 = z2 ? (qy4) tx7Var : null;
        if (qy4Var2 != null) {
            qy4Var2.drop();
        }
    }

    private final void m(tx7 tx7Var, Request.Builder builder) {
        if (this.f == TraceContextInjection.All) {
            wx7 f = tx7Var.f();
            zq3.g(f, "span.context()");
            String a2 = zx7.a(f);
            String a3 = tx7Var.f().a();
            String p0 = h.p0(a2, 32, '0');
            zq3.g(a3, "spanId");
            String format = String.format("00-%s-%s-00", Arrays.copyOf(new Object[]{p0, h.p0(a3, 16, '0')}, 2));
            zq3.g(format, "format(...)");
            builder.addHeader("traceparent", format);
            String format2 = String.format("dd=p:%s;s:0", Arrays.copyOf(new Object[]{h.p0(a3, 16, '0')}, 1));
            zq3.g(format2, "format(...)");
            String str = this.d;
            if (str != null) {
                format2 = format2 + ";o:" + str;
            }
            builder.addHeader("tracestate", format2);
        }
    }

    private final Response n(jb2 jb2Var, Interceptor.Chain chain, Request request) {
        try {
            Response proceed = chain.proceed(request);
            q(jb2Var, request, null, proceed, null);
            return proceed;
        } catch (Throwable th) {
            q(jb2Var, request, null, null, th);
            throw th;
        }
    }

    private final Response o(rq3 rq3Var, Interceptor.Chain chain, Request request, hp8 hp8Var) {
        Interceptor.Chain chain2;
        Request request2;
        Boolean f = f(request);
        boolean booleanValue = f != null ? f.booleanValue() : this.e.a();
        tx7 c = c(hp8Var, request);
        try {
            request2 = y(rq3Var, request, hp8Var, c, booleanValue).build();
            chain2 = chain;
        } catch (IllegalStateException e) {
            InternalLogger.b.b(rq3Var.f(), InternalLogger.Level.WARN, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.okhttp.trace.TracingInterceptor$interceptAndTrace$updatedRequest$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Failed to update intercepted OkHttp request";
                }
            }, e, false, null, 48, null);
            chain2 = chain;
            request2 = request;
        }
        try {
            Response proceed = chain2.proceed(request2);
            k(rq3Var, request, proceed, c, booleanValue);
            return proceed;
        } catch (Throwable th) {
            l(rq3Var, request, th, c, booleanValue);
            throw th;
        }
    }

    private final boolean p(rq3 rq3Var, Request request) {
        HttpUrl url = request.url();
        return rq3Var.g().b(url) || this.j.b(url);
    }

    private final void s(Request.Builder builder) {
        Iterator it2 = i.o("X-B3-TraceId", "X-B3-SpanId", "X-B3-Sampled").iterator();
        while (it2.hasNext()) {
            builder.removeHeader((String) it2.next());
        }
    }

    private final void t(Request.Builder builder) {
        Iterator it2 = i.o("x-datadog-sampling-priority", "x-datadog-trace-id", "x-datadog-tags", "x-datadog-parent-id", "x-datadog-origin").iterator();
        while (it2.hasNext()) {
            builder.removeHeader((String) it2.next());
        }
    }

    private final void u(Request.Builder builder) {
        builder.removeHeader("traceparent");
        builder.removeHeader("tracestate");
    }

    private final hp8 v(rq3 rq3Var) {
        if (this.h.get() == null) {
            kz4.a(this.h, null, this.g.invoke(rq3Var, b0.m(this.j.c(), rq3Var.g().c())));
            InternalLogger.b.a(rq3Var.f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.okhttp.trace.TracingInterceptor$resolveLocalTracer$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "You added a TracingInterceptor to your OkHttpClient, but you didn't register any Tracer. We automatically created a local tracer for you.";
                }
            }, null, false, null, 56, null);
        }
        Object obj = this.h.get();
        zq3.g(obj, "localTracerReference.get()");
        return (hp8) obj;
    }

    private final synchronized hp8 w(rq3 rq3Var) {
        hp8 hp8Var;
        try {
            hp8Var = null;
            if (rq3Var.d("tracing") == null) {
                InternalLogger.b.a(rq3Var.f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.okhttp.trace.TracingInterceptor$resolveTracer$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "You added a TracingInterceptor to your OkHttpClient, but you did not enable the TracingFeature. Your requests won't be traced.";
                    }
                }, null, true, null, 40, null);
            } else if (GlobalTracer.isRegistered()) {
                this.h.set(null);
                hp8Var = GlobalTracer.a();
            } else {
                hp8Var = v(rq3Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return hp8Var;
    }

    private final void x(Request.Builder builder, Set set, tx7 tx7Var, hp8 hp8Var) {
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            int i = b.a[((TracingHeaderType) it2.next()).ordinal()];
            if (i == 1) {
                t(builder);
                i(builder, tx7Var, hp8Var);
            } else if (i == 2) {
                builder.removeHeader("b3");
                h(builder);
            } else if (i == 3) {
                s(builder);
                g(builder);
            } else if (i == 4) {
                u(builder);
                m(tx7Var, builder);
            }
        }
    }

    private final Request.Builder y(rq3 rq3Var, Request request, hp8 hp8Var, tx7 tx7Var, boolean z) {
        final Request.Builder newBuilder = request.newBuilder();
        Set a2 = this.j.a(request.url());
        if (a2.isEmpty()) {
            a2 = rq3Var.g().a(request.url());
        }
        final Set set = a2;
        if (z) {
            hp8Var.n1(tx7Var.f(), dp2.a.c, new fj8() { // from class: op8
                @Override // defpackage.fj8
                public final void put(String str, String str2) {
                    TracingInterceptor.z(Request.Builder.this, set, str, str2);
                }
            });
        } else {
            x(newBuilder, set, tx7Var, hp8Var);
        }
        return newBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r4.equals("x-datadog-trace-id") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00be, code lost:
    
        if (r3.contains(com.datadog.android.trace.TracingHeaderType.DATADOG) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c0, code lost:
    
        defpackage.zq3.g(r5, "value");
        r2.addHeader(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r4.equals("x-datadog-tags") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r4.equals("traceparent") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r3.contains(com.datadog.android.trace.TracingHeaderType.TRACECONTEXT) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        defpackage.zq3.g(r5, "value");
        r2.addHeader(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r4.equals("tracestate") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        if (r4.equals("x-datadog-sampling-priority") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (r4.equals("x-datadog-parent-id") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r4.equals("X-B3-SpanId") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        if (r4.equals("X-B3-TraceId") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r4.equals("x-datadog-origin") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r4.equals("X-B3-Sampled") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a0, code lost:
    
        if (r3.contains(com.datadog.android.trace.TracingHeaderType.B3MULTI) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a2, code lost:
    
        defpackage.zq3.g(r5, "value");
        r2.addHeader(r4, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(okhttp3.Request.Builder r2, java.util.Set r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "$tracedRequestBuilder"
            defpackage.zq3.h(r2, r0)
            java.lang.String r0 = "$tracingHeaderTypes"
            defpackage.zq3.h(r3, r0)
            java.lang.String r0 = "key"
            defpackage.zq3.g(r4, r0)
            r2.removeHeader(r4)
            int r0 = r4.hashCode()
            java.lang.String r1 = "value"
            switch(r0) {
                case -1682961930: goto La9;
                case -1140603879: goto L91;
                case -344354804: goto L88;
                case 3089: goto L70;
                case 304080974: goto L67;
                case 762897402: goto L5e;
                case 1006622316: goto L45;
                case 1037578799: goto L3b;
                case 1316815593: goto L31;
                case 1767467379: goto L27;
                case 1791641299: goto L1d;
                default: goto L1b;
            }
        L1b:
            goto Lb1
        L1d:
            java.lang.String r0 = "X-B3-Sampled"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9a
            goto Lb1
        L27:
            java.lang.String r0 = "x-datadog-trace-id"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lb8
            goto Lb1
        L31:
            java.lang.String r0 = "x-datadog-tags"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lb8
            goto Lb1
        L3b:
            java.lang.String r0 = "traceparent"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L4e
            goto Lb1
        L45:
            java.lang.String r0 = "tracestate"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L4e
            goto Lb1
        L4e:
            com.datadog.android.trace.TracingHeaderType r0 = com.datadog.android.trace.TracingHeaderType.TRACECONTEXT
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto Lc6
            defpackage.zq3.g(r5, r1)
            r2.addHeader(r4, r5)
            goto Lc6
        L5e:
            java.lang.String r0 = "x-datadog-sampling-priority"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lb8
            goto Lb1
        L67:
            java.lang.String r0 = "x-datadog-parent-id"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lb8
            goto Lb1
        L70:
            java.lang.String r0 = "b3"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L79
            goto Lb1
        L79:
            com.datadog.android.trace.TracingHeaderType r0 = com.datadog.android.trace.TracingHeaderType.B3
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto Lc6
            defpackage.zq3.g(r5, r1)
            r2.addHeader(r4, r5)
            goto Lc6
        L88:
            java.lang.String r0 = "X-B3-SpanId"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9a
            goto Lb1
        L91:
            java.lang.String r0 = "X-B3-TraceId"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9a
            goto Lb1
        L9a:
            com.datadog.android.trace.TracingHeaderType r0 = com.datadog.android.trace.TracingHeaderType.B3MULTI
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto Lc6
            defpackage.zq3.g(r5, r1)
            r2.addHeader(r4, r5)
            goto Lc6
        La9:
            java.lang.String r0 = "x-datadog-origin"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lb8
        Lb1:
            defpackage.zq3.g(r5, r1)
            r2.addHeader(r4, r5)
            goto Lc6
        Lb8:
            com.datadog.android.trace.TracingHeaderType r0 = com.datadog.android.trace.TracingHeaderType.DATADOG
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto Lc6
            defpackage.zq3.g(r5, r1)
            r2.addHeader(r4, r5)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.okhttp.trace.TracingInterceptor.z(okhttp3.Request$Builder, java.util.Set, java.lang.String, java.lang.String):void");
    }

    public boolean d() {
        return true;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(final Interceptor.Chain chain) {
        final String str;
        zq3.h(chain, "chain");
        vc7 a2 = this.k.a();
        if (a2 != null) {
            rq3 rq3Var = (rq3) a2;
            hp8 w = w(rq3Var);
            Request request = chain.request();
            return (w == null || !p(rq3Var, request)) ? n(rq3Var, chain, request) : o(rq3Var, chain, request, w);
        }
        String str2 = this.a;
        if (str2 == null) {
            str = "Default SDK instance";
        } else {
            str = "SDK instance with name=" + str2;
        }
        InternalLogger.b.a(InternalLogger.a.a(), InternalLogger.Level.INFO, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.okhttp.trace.TracingInterceptor$intercept$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return str + " for OkHttp instrumentation is not found, skipping tracking of request with url=" + chain.request().url();
            }
        }, null, false, null, 56, null);
        return chain.proceed(chain.request());
    }

    protected void q(jb2 jb2Var, Request request, tx7 tx7Var, Response response, Throwable th) {
        zq3.h(jb2Var, "sdkCore");
        zq3.h(request, "request");
        if (tx7Var != null) {
            this.c.a(request, tx7Var, response, th);
        }
    }

    public void r(rq3 rq3Var) {
        zq3.h(rq3Var, "sdkCore");
        if (this.j.isEmpty() && rq3Var.g().isEmpty()) {
            InternalLogger.b.a(rq3Var.f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.okhttp.trace.TracingInterceptor$onSdkInstanceReady$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "You added a TracingInterceptor to your OkHttpClient, but you did not specify any first party hosts. Your requests won't be traced.\nTo set a list of known hosts, you can use the Configuration.Builder::setFirstPartyHosts() method.";
                }
            }, null, true, null, 40, null);
        }
    }

    public /* synthetic */ TracingInterceptor(String str, Map map, fp8 fp8Var, a87 a87Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, map, (i & 4) != 0 ? new s75() : fp8Var, (i & 8) != 0 ? new RateBasedSampler(20.0f) : a87Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TracingInterceptor(String str, Map map, fp8 fp8Var, a87 a87Var) {
        this(str, map, fp8Var, null, a87Var, TraceContextInjection.All, new gt2() { // from class: com.datadog.android.okhttp.trace.TracingInterceptor.3
            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final hp8 invoke(vc7 vc7Var, Set set) {
                zq3.h(vc7Var, "sdkCore");
                zq3.h(set, "tracingHeaderTypes");
                return new AndroidTracer.Builder(vc7Var).g(set).b();
            }
        });
        zq3.h(map, "tracedHostsWithHeaderType");
        zq3.h(fp8Var, "tracedRequestListener");
        zq3.h(a87Var, "traceSampler");
    }
}
