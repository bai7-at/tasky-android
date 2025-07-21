package com.google.android.datatransport.cct.internal;

import defpackage.c12;
import defpackage.ku0;
import defpackage.wb5;
import defpackage.xb5;
import defpackage.yd2;

/* loaded from: classes2.dex */
public final class b implements ku0 {
    public static final ku0 a = new b();

    private static final class a implements wb5 {
        static final a a = new a();
        private static final yd2 b = yd2.d("sdkVersion");
        private static final yd2 c = yd2.d("model");
        private static final yd2 d = yd2.d("hardware");
        private static final yd2 e = yd2.d("device");
        private static final yd2 f = yd2.d("product");
        private static final yd2 g = yd2.d("osBuild");
        private static final yd2 h = yd2.d("manufacturer");
        private static final yd2 i = yd2.d("fingerprint");
        private static final yd2 j = yd2.d("locale");
        private static final yd2 k = yd2.d("country");
        private static final yd2 l = yd2.d("mccMnc");
        private static final yd2 m = yd2.d("applicationBuild");

        private a() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.cct.internal.a aVar, xb5 xb5Var) {
            xb5Var.a(b, aVar.m());
            xb5Var.a(c, aVar.j());
            xb5Var.a(d, aVar.f());
            xb5Var.a(e, aVar.d());
            xb5Var.a(f, aVar.l());
            xb5Var.a(g, aVar.k());
            xb5Var.a(h, aVar.h());
            xb5Var.a(i, aVar.e());
            xb5Var.a(j, aVar.g());
            xb5Var.a(k, aVar.c());
            xb5Var.a(l, aVar.i());
            xb5Var.a(m, aVar.b());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$b, reason: collision with other inner class name */
    private static final class C0175b implements wb5 {
        static final C0175b a = new C0175b();
        private static final yd2 b = yd2.d("logRequest");

        private C0175b() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(i iVar, xb5 xb5Var) {
            xb5Var.a(b, iVar.c());
        }
    }

    private static final class c implements wb5 {
        static final c a = new c();
        private static final yd2 b = yd2.d("clientType");
        private static final yd2 c = yd2.d("androidClientInfo");

        private c() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ClientInfo clientInfo, xb5 xb5Var) {
            xb5Var.a(b, clientInfo.c());
            xb5Var.a(c, clientInfo.b());
        }
    }

    private static final class d implements wb5 {
        static final d a = new d();
        private static final yd2 b = yd2.d("eventTimeMs");
        private static final yd2 c = yd2.d("eventCode");
        private static final yd2 d = yd2.d("eventUptimeMs");
        private static final yd2 e = yd2.d("sourceExtension");
        private static final yd2 f = yd2.d("sourceExtensionJsonProto3");
        private static final yd2 g = yd2.d("timezoneOffsetSeconds");
        private static final yd2 h = yd2.d("networkConnectionInfo");

        private d() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, xb5 xb5Var) {
            xb5Var.f(b, jVar.c());
            xb5Var.a(c, jVar.b());
            xb5Var.f(d, jVar.d());
            xb5Var.a(e, jVar.f());
            xb5Var.a(f, jVar.g());
            xb5Var.f(g, jVar.h());
            xb5Var.a(h, jVar.e());
        }
    }

    private static final class e implements wb5 {
        static final e a = new e();
        private static final yd2 b = yd2.d("requestTimeMs");
        private static final yd2 c = yd2.d("requestUptimeMs");
        private static final yd2 d = yd2.d("clientInfo");
        private static final yd2 e = yd2.d("logSource");
        private static final yd2 f = yd2.d("logSourceName");
        private static final yd2 g = yd2.d("logEvent");
        private static final yd2 h = yd2.d("qosTier");

        private e() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(k kVar, xb5 xb5Var) {
            xb5Var.f(b, kVar.g());
            xb5Var.f(c, kVar.h());
            xb5Var.a(d, kVar.b());
            xb5Var.a(e, kVar.d());
            xb5Var.a(f, kVar.e());
            xb5Var.a(g, kVar.c());
            xb5Var.a(h, kVar.f());
        }
    }

    private static final class f implements wb5 {
        static final f a = new f();
        private static final yd2 b = yd2.d("networkType");
        private static final yd2 c = yd2.d("mobileSubtype");

        private f() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(NetworkConnectionInfo networkConnectionInfo, xb5 xb5Var) {
            xb5Var.a(b, networkConnectionInfo.c());
            xb5Var.a(c, networkConnectionInfo.b());
        }
    }

    private b() {
    }

    @Override // defpackage.ku0
    public void a(c12 c12Var) {
        C0175b c0175b = C0175b.a;
        c12Var.a(i.class, c0175b);
        c12Var.a(com.google.android.datatransport.cct.internal.d.class, c0175b);
        e eVar = e.a;
        c12Var.a(k.class, eVar);
        c12Var.a(g.class, eVar);
        c cVar = c.a;
        c12Var.a(ClientInfo.class, cVar);
        c12Var.a(com.google.android.datatransport.cct.internal.e.class, cVar);
        a aVar = a.a;
        c12Var.a(com.google.android.datatransport.cct.internal.a.class, aVar);
        c12Var.a(com.google.android.datatransport.cct.internal.c.class, aVar);
        d dVar = d.a;
        c12Var.a(j.class, dVar);
        c12Var.a(com.google.android.datatransport.cct.internal.f.class, dVar);
        f fVar = f.a;
        c12Var.a(NetworkConnectionInfo.class, fVar);
        c12Var.a(h.class, fVar);
    }
}
