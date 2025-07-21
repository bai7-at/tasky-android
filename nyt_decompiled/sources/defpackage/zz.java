package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.s11;
import io.embrace.android.embracesdk.payload.Session;

/* loaded from: classes3.dex */
public final class zz implements ku0 {
    public static final ku0 a = new zz();

    private static final class a implements wb5 {
        static final a a = new a();
        private static final yd2 b = yd2.d("pid");
        private static final yd2 c = yd2.d("processName");
        private static final yd2 d = yd2.d("reasonCode");
        private static final yd2 e = yd2.d("importance");
        private static final yd2 f = yd2.d("pss");
        private static final yd2 g = yd2.d("rss");
        private static final yd2 h = yd2.d("timestamp");
        private static final yd2 i = yd2.d("traceFile");

        private a() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.a aVar, xb5 xb5Var) {
            xb5Var.e(b, aVar.c());
            xb5Var.a(c, aVar.d());
            xb5Var.e(d, aVar.f());
            xb5Var.e(e, aVar.b());
            xb5Var.f(f, aVar.e());
            xb5Var.f(g, aVar.g());
            xb5Var.f(h, aVar.h());
            xb5Var.a(i, aVar.i());
        }
    }

    private static final class b implements wb5 {
        static final b a = new b();
        private static final yd2 b = yd2.d(TransferTable.COLUMN_KEY);
        private static final yd2 c = yd2.d("value");

        private b() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.c cVar, xb5 xb5Var) {
            xb5Var.a(b, cVar.b());
            xb5Var.a(c, cVar.c());
        }
    }

    private static final class c implements wb5 {
        static final c a = new c();
        private static final yd2 b = yd2.d("sdkVersion");
        private static final yd2 c = yd2.d("gmpAppId");
        private static final yd2 d = yd2.d("platform");
        private static final yd2 e = yd2.d("installationUuid");
        private static final yd2 f = yd2.d("buildVersion");
        private static final yd2 g = yd2.d("displayVersion");
        private static final yd2 h = yd2.d("session");
        private static final yd2 i = yd2.d("ndkPayload");

        private c() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11 s11Var, xb5 xb5Var) {
            xb5Var.a(b, s11Var.i());
            xb5Var.a(c, s11Var.e());
            xb5Var.e(d, s11Var.h());
            xb5Var.a(e, s11Var.f());
            xb5Var.a(f, s11Var.c());
            xb5Var.a(g, s11Var.d());
            xb5Var.a(h, s11Var.j());
            xb5Var.a(i, s11Var.g());
        }
    }

    private static final class d implements wb5 {
        static final d a = new d();
        private static final yd2 b = yd2.d("files");
        private static final yd2 c = yd2.d("orgId");

        private d() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.d dVar, xb5 xb5Var) {
            xb5Var.a(b, dVar.b());
            xb5Var.a(c, dVar.c());
        }
    }

    private static final class e implements wb5 {
        static final e a = new e();
        private static final yd2 b = yd2.d("filename");
        private static final yd2 c = yd2.d("contents");

        private e() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.d.b bVar, xb5 xb5Var) {
            xb5Var.a(b, bVar.c());
            xb5Var.a(c, bVar.b());
        }
    }

    private static final class f implements wb5 {
        static final f a = new f();
        private static final yd2 b = yd2.d("identifier");
        private static final yd2 c = yd2.d("version");
        private static final yd2 d = yd2.d("displayVersion");
        private static final yd2 e = yd2.d("organization");
        private static final yd2 f = yd2.d("installationUuid");
        private static final yd2 g = yd2.d("developmentPlatform");
        private static final yd2 h = yd2.d("developmentPlatformVersion");

        private f() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.a aVar, xb5 xb5Var) {
            xb5Var.a(b, aVar.e());
            xb5Var.a(c, aVar.h());
            xb5Var.a(d, aVar.d());
            yd2 yd2Var = e;
            aVar.g();
            xb5Var.a(yd2Var, null);
            xb5Var.a(f, aVar.f());
            xb5Var.a(g, aVar.b());
            xb5Var.a(h, aVar.c());
        }
    }

    private static final class g implements wb5 {
        static final g a = new g();
        private static final yd2 b = yd2.d("clsId");

        private g() {
        }

        @Override // defpackage.wb5
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            lh4.a(obj);
            b(null, (xb5) obj2);
        }

        public void b(s11.e.a.b bVar, xb5 xb5Var) {
            throw null;
        }
    }

    private static final class h implements wb5 {
        static final h a = new h();
        private static final yd2 b = yd2.d("arch");
        private static final yd2 c = yd2.d("model");
        private static final yd2 d = yd2.d("cores");
        private static final yd2 e = yd2.d("ram");
        private static final yd2 f = yd2.d("diskSpace");
        private static final yd2 g = yd2.d("simulator");
        private static final yd2 h = yd2.d(TransferTable.COLUMN_STATE);
        private static final yd2 i = yd2.d("manufacturer");
        private static final yd2 j = yd2.d("modelClass");

        private h() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.c cVar, xb5 xb5Var) {
            xb5Var.e(b, cVar.b());
            xb5Var.a(c, cVar.f());
            xb5Var.e(d, cVar.c());
            xb5Var.f(e, cVar.h());
            xb5Var.f(f, cVar.d());
            xb5Var.d(g, cVar.j());
            xb5Var.e(h, cVar.i());
            xb5Var.a(i, cVar.e());
            xb5Var.a(j, cVar.g());
        }
    }

    private static final class i implements wb5 {
        static final i a = new i();
        private static final yd2 b = yd2.d("generator");
        private static final yd2 c = yd2.d("identifier");
        private static final yd2 d = yd2.d("startedAt");
        private static final yd2 e = yd2.d("endedAt");
        private static final yd2 f = yd2.d("crashed");
        private static final yd2 g = yd2.d("app");
        private static final yd2 h = yd2.d("user");
        private static final yd2 i = yd2.d("os");
        private static final yd2 j = yd2.d("device");
        private static final yd2 k = yd2.d("events");
        private static final yd2 l = yd2.d("generatorType");

        private i() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e eVar, xb5 xb5Var) {
            xb5Var.a(b, eVar.f());
            xb5Var.a(c, eVar.i());
            xb5Var.f(d, eVar.k());
            xb5Var.a(e, eVar.d());
            xb5Var.d(f, eVar.m());
            xb5Var.a(g, eVar.b());
            xb5Var.a(h, eVar.l());
            xb5Var.a(i, eVar.j());
            xb5Var.a(j, eVar.c());
            xb5Var.a(k, eVar.e());
            xb5Var.e(l, eVar.g());
        }
    }

    private static final class j implements wb5 {
        static final j a = new j();
        private static final yd2 b = yd2.d("execution");
        private static final yd2 c = yd2.d("customAttributes");
        private static final yd2 d = yd2.d("internalKeys");
        private static final yd2 e = yd2.d(Session.APPLICATION_STATE_BACKGROUND);
        private static final yd2 f = yd2.d("uiOrientation");

        private j() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.d.a aVar, xb5 xb5Var) {
            xb5Var.a(b, aVar.d());
            xb5Var.a(c, aVar.c());
            xb5Var.a(d, aVar.e());
            xb5Var.a(e, aVar.b());
            xb5Var.e(f, aVar.f());
        }
    }

    private static final class k implements wb5 {
        static final k a = new k();
        private static final yd2 b = yd2.d("baseAddress");
        private static final yd2 c = yd2.d("size");
        private static final yd2 d = yd2.d(AuthenticationTokenClaims.JSON_KEY_NAME);
        private static final yd2 e = yd2.d("uuid");

        private k() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.d.a.b.AbstractC0524a abstractC0524a, xb5 xb5Var) {
            xb5Var.f(b, abstractC0524a.b());
            xb5Var.f(c, abstractC0524a.d());
            xb5Var.a(d, abstractC0524a.c());
            xb5Var.a(e, abstractC0524a.f());
        }
    }

    private static final class l implements wb5 {
        static final l a = new l();
        private static final yd2 b = yd2.d("threads");
        private static final yd2 c = yd2.d("exception");
        private static final yd2 d = yd2.d("appExitInfo");
        private static final yd2 e = yd2.d("signal");
        private static final yd2 f = yd2.d("binaries");

        private l() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.d.a.b bVar, xb5 xb5Var) {
            xb5Var.a(b, bVar.f());
            xb5Var.a(c, bVar.d());
            xb5Var.a(d, bVar.b());
            xb5Var.a(e, bVar.e());
            xb5Var.a(f, bVar.c());
        }
    }

    private static final class m implements wb5 {
        static final m a = new m();
        private static final yd2 b = yd2.d(TransferTable.COLUMN_TYPE);
        private static final yd2 c = yd2.d("reason");
        private static final yd2 d = yd2.d("frames");
        private static final yd2 e = yd2.d("causedBy");
        private static final yd2 f = yd2.d("overflowCount");

        private m() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.d.a.b.c cVar, xb5 xb5Var) {
            xb5Var.a(b, cVar.f());
            xb5Var.a(c, cVar.e());
            xb5Var.a(d, cVar.c());
            xb5Var.a(e, cVar.b());
            xb5Var.e(f, cVar.d());
        }
    }

    private static final class n implements wb5 {
        static final n a = new n();
        private static final yd2 b = yd2.d(AuthenticationTokenClaims.JSON_KEY_NAME);
        private static final yd2 c = yd2.d("code");
        private static final yd2 d = yd2.d("address");

        private n() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.d.a.b.AbstractC0528d abstractC0528d, xb5 xb5Var) {
            xb5Var.a(b, abstractC0528d.d());
            xb5Var.a(c, abstractC0528d.c());
            xb5Var.f(d, abstractC0528d.b());
        }
    }

    private static final class o implements wb5 {
        static final o a = new o();
        private static final yd2 b = yd2.d(AuthenticationTokenClaims.JSON_KEY_NAME);
        private static final yd2 c = yd2.d("importance");
        private static final yd2 d = yd2.d("frames");

        private o() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.d.a.b.AbstractC0530e abstractC0530e, xb5 xb5Var) {
            xb5Var.a(b, abstractC0530e.d());
            xb5Var.e(c, abstractC0530e.c());
            xb5Var.a(d, abstractC0530e.b());
        }
    }

    private static final class p implements wb5 {
        static final p a = new p();
        private static final yd2 b = yd2.d("pc");
        private static final yd2 c = yd2.d("symbol");
        private static final yd2 d = yd2.d(TransferTable.COLUMN_FILE);
        private static final yd2 e = yd2.d("offset");
        private static final yd2 f = yd2.d("importance");

        private p() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.d.a.b.AbstractC0530e.AbstractC0532b abstractC0532b, xb5 xb5Var) {
            xb5Var.f(b, abstractC0532b.e());
            xb5Var.a(c, abstractC0532b.f());
            xb5Var.a(d, abstractC0532b.b());
            xb5Var.f(e, abstractC0532b.d());
            xb5Var.e(f, abstractC0532b.c());
        }
    }

    private static final class q implements wb5 {
        static final q a = new q();
        private static final yd2 b = yd2.d("batteryLevel");
        private static final yd2 c = yd2.d("batteryVelocity");
        private static final yd2 d = yd2.d("proximityOn");
        private static final yd2 e = yd2.d("orientation");
        private static final yd2 f = yd2.d("ramUsed");
        private static final yd2 g = yd2.d("diskUsed");

        private q() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.d.c cVar, xb5 xb5Var) {
            xb5Var.a(b, cVar.b());
            xb5Var.e(c, cVar.c());
            xb5Var.d(d, cVar.g());
            xb5Var.e(e, cVar.e());
            xb5Var.f(f, cVar.f());
            xb5Var.f(g, cVar.d());
        }
    }

    private static final class r implements wb5 {
        static final r a = new r();
        private static final yd2 b = yd2.d("timestamp");
        private static final yd2 c = yd2.d(TransferTable.COLUMN_TYPE);
        private static final yd2 d = yd2.d("app");
        private static final yd2 e = yd2.d("device");
        private static final yd2 f = yd2.d("log");

        private r() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.d dVar, xb5 xb5Var) {
            xb5Var.f(b, dVar.e());
            xb5Var.a(c, dVar.f());
            xb5Var.a(d, dVar.b());
            xb5Var.a(e, dVar.c());
            xb5Var.a(f, dVar.d());
        }
    }

    private static final class s implements wb5 {
        static final s a = new s();
        private static final yd2 b = yd2.d("content");

        private s() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.d.AbstractC0534d abstractC0534d, xb5 xb5Var) {
            xb5Var.a(b, abstractC0534d.b());
        }
    }

    private static final class t implements wb5 {
        static final t a = new t();
        private static final yd2 b = yd2.d("platform");
        private static final yd2 c = yd2.d("version");
        private static final yd2 d = yd2.d("buildVersion");
        private static final yd2 e = yd2.d("jailbroken");

        private t() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.AbstractC0535e abstractC0535e, xb5 xb5Var) {
            xb5Var.e(b, abstractC0535e.c());
            xb5Var.a(c, abstractC0535e.d());
            xb5Var.a(d, abstractC0535e.b());
            xb5Var.d(e, abstractC0535e.e());
        }
    }

    private static final class u implements wb5 {
        static final u a = new u();
        private static final yd2 b = yd2.d("identifier");

        private u() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s11.e.f fVar, xb5 xb5Var) {
            xb5Var.a(b, fVar.b());
        }
    }

    private zz() {
    }

    @Override // defpackage.ku0
    public void a(c12 c12Var) {
        c cVar = c.a;
        c12Var.a(s11.class, cVar);
        c12Var.a(p00.class, cVar);
        i iVar = i.a;
        c12Var.a(s11.e.class, iVar);
        c12Var.a(v00.class, iVar);
        f fVar = f.a;
        c12Var.a(s11.e.a.class, fVar);
        c12Var.a(w00.class, fVar);
        g gVar = g.a;
        c12Var.a(s11.e.a.b.class, gVar);
        c12Var.a(x00.class, gVar);
        u uVar = u.a;
        c12Var.a(s11.e.f.class, uVar);
        c12Var.a(k10.class, uVar);
        t tVar = t.a;
        c12Var.a(s11.e.AbstractC0535e.class, tVar);
        c12Var.a(j10.class, tVar);
        h hVar = h.a;
        c12Var.a(s11.e.c.class, hVar);
        c12Var.a(y00.class, hVar);
        r rVar = r.a;
        c12Var.a(s11.e.d.class, rVar);
        c12Var.a(z00.class, rVar);
        j jVar = j.a;
        c12Var.a(s11.e.d.a.class, jVar);
        c12Var.a(a10.class, jVar);
        l lVar = l.a;
        c12Var.a(s11.e.d.a.b.class, lVar);
        c12Var.a(b10.class, lVar);
        o oVar = o.a;
        c12Var.a(s11.e.d.a.b.AbstractC0530e.class, oVar);
        c12Var.a(f10.class, oVar);
        p pVar = p.a;
        c12Var.a(s11.e.d.a.b.AbstractC0530e.AbstractC0532b.class, pVar);
        c12Var.a(g10.class, pVar);
        m mVar = m.a;
        c12Var.a(s11.e.d.a.b.c.class, mVar);
        c12Var.a(d10.class, mVar);
        a aVar = a.a;
        c12Var.a(s11.a.class, aVar);
        c12Var.a(r00.class, aVar);
        n nVar = n.a;
        c12Var.a(s11.e.d.a.b.AbstractC0528d.class, nVar);
        c12Var.a(e10.class, nVar);
        k kVar = k.a;
        c12Var.a(s11.e.d.a.b.AbstractC0524a.class, kVar);
        c12Var.a(c10.class, kVar);
        b bVar = b.a;
        c12Var.a(s11.c.class, bVar);
        c12Var.a(s00.class, bVar);
        q qVar = q.a;
        c12Var.a(s11.e.d.c.class, qVar);
        c12Var.a(h10.class, qVar);
        s sVar = s.a;
        c12Var.a(s11.e.d.AbstractC0534d.class, sVar);
        c12Var.a(i10.class, sVar);
        d dVar = d.a;
        c12Var.a(s11.d.class, dVar);
        c12Var.a(t00.class, dVar);
        e eVar = e.a;
        c12Var.a(s11.d.b.class, eVar);
        c12Var.a(u00.class, eVar);
    }
}
