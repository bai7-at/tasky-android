package defpackage;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;

/* loaded from: classes2.dex */
public final class j00 implements ku0 {
    public static final ku0 a = new j00();

    private static final class a implements wb5 {
        static final a a = new a();
        private static final yd2 b = yd2.a("window").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();
        private static final yd2 c = yd2.a("logSourceMetrics").b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();
        private static final yd2 d = yd2.a("globalMetrics").b(com.google.firebase.encoders.proto.a.b().c(3).a()).a();
        private static final yd2 e = yd2.a("appNamespace").b(com.google.firebase.encoders.proto.a.b().c(4).a()).a();

        private a() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ol0 ol0Var, xb5 xb5Var) {
            xb5Var.a(b, ol0Var.d());
            xb5Var.a(c, ol0Var.c());
            xb5Var.a(d, ol0Var.b());
            xb5Var.a(e, ol0Var.a());
        }
    }

    private static final class b implements wb5 {
        static final b a = new b();
        private static final yd2 b = yd2.a("storageMetrics").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();

        private b() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(e13 e13Var, xb5 xb5Var) {
            xb5Var.a(b, e13Var.a());
        }
    }

    private static final class c implements wb5 {
        static final c a = new c();
        private static final yd2 b = yd2.a("eventsDroppedCount").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();
        private static final yd2 c = yd2.a("reason").b(com.google.firebase.encoders.proto.a.b().c(3).a()).a();

        private c() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(LogEventDropped logEventDropped, xb5 xb5Var) {
            xb5Var.f(b, logEventDropped.a());
            xb5Var.a(c, logEventDropped.b());
        }
    }

    private static final class d implements wb5 {
        static final d a = new d();
        private static final yd2 b = yd2.a("logSource").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();
        private static final yd2 c = yd2.a("logEventDropped").b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();

        private d() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(a94 a94Var, xb5 xb5Var) {
            xb5Var.a(b, a94Var.b());
            xb5Var.a(c, a94Var.a());
        }
    }

    private static final class e implements wb5 {
        static final e a = new e();
        private static final yd2 b = yd2.d("clientMetrics");

        private e() {
        }

        @Override // defpackage.wb5
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            lh4.a(obj);
            b(null, (xb5) obj2);
        }

        public void b(j76 j76Var, xb5 xb5Var) {
            throw null;
        }
    }

    private static final class f implements wb5 {
        static final f a = new f();
        private static final yd2 b = yd2.a("currentCacheSizeBytes").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();
        private static final yd2 c = yd2.a("maxCacheSizeBytes").b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();

        private f() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h28 h28Var, xb5 xb5Var) {
            xb5Var.f(b, h28Var.a());
            xb5Var.f(c, h28Var.b());
        }
    }

    private static final class g implements wb5 {
        static final g a = new g();
        private static final yd2 b = yd2.a("startMs").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();
        private static final yd2 c = yd2.a("endMs").b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();

        private g() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(km8 km8Var, xb5 xb5Var) {
            xb5Var.f(b, km8Var.b());
            xb5Var.f(c, km8Var.a());
        }
    }

    private j00() {
    }

    @Override // defpackage.ku0
    public void a(c12 c12Var) {
        c12Var.a(j76.class, e.a);
        c12Var.a(ol0.class, a.a);
        c12Var.a(km8.class, g.a);
        c12Var.a(a94.class, d.a);
        c12Var.a(LogEventDropped.class, c.a);
        c12Var.a(e13.class, b.a);
        c12Var.a(h28.class, f.a);
    }
}
