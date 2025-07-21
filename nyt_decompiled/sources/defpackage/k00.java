package defpackage;

import com.google.firebase.messaging.reporting.MessagingClientEvent;

/* loaded from: classes3.dex */
public final class k00 implements ku0 {
    public static final ku0 a = new k00();

    private static final class a implements wb5 {
        static final a a = new a();
        private static final yd2 b = yd2.a("projectNumber").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();
        private static final yd2 c = yd2.a("messageId").b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();
        private static final yd2 d = yd2.a("instanceId").b(com.google.firebase.encoders.proto.a.b().c(3).a()).a();
        private static final yd2 e = yd2.a("messageType").b(com.google.firebase.encoders.proto.a.b().c(4).a()).a();
        private static final yd2 f = yd2.a("sdkPlatform").b(com.google.firebase.encoders.proto.a.b().c(5).a()).a();
        private static final yd2 g = yd2.a("packageName").b(com.google.firebase.encoders.proto.a.b().c(6).a()).a();
        private static final yd2 h = yd2.a("collapseKey").b(com.google.firebase.encoders.proto.a.b().c(7).a()).a();
        private static final yd2 i = yd2.a("priority").b(com.google.firebase.encoders.proto.a.b().c(8).a()).a();
        private static final yd2 j = yd2.a("ttl").b(com.google.firebase.encoders.proto.a.b().c(9).a()).a();
        private static final yd2 k = yd2.a("topic").b(com.google.firebase.encoders.proto.a.b().c(10).a()).a();
        private static final yd2 l = yd2.a("bulkId").b(com.google.firebase.encoders.proto.a.b().c(11).a()).a();
        private static final yd2 m = yd2.a("event").b(com.google.firebase.encoders.proto.a.b().c(12).a()).a();
        private static final yd2 n = yd2.a("analyticsLabel").b(com.google.firebase.encoders.proto.a.b().c(13).a()).a();
        private static final yd2 o = yd2.a("campaignId").b(com.google.firebase.encoders.proto.a.b().c(14).a()).a();
        private static final yd2 p = yd2.a("composerLabel").b(com.google.firebase.encoders.proto.a.b().c(15).a()).a();

        private a() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MessagingClientEvent messagingClientEvent, xb5 xb5Var) {
            xb5Var.f(b, messagingClientEvent.l());
            xb5Var.a(c, messagingClientEvent.h());
            xb5Var.a(d, messagingClientEvent.g());
            xb5Var.a(e, messagingClientEvent.i());
            xb5Var.a(f, messagingClientEvent.m());
            xb5Var.a(g, messagingClientEvent.j());
            xb5Var.a(h, messagingClientEvent.d());
            xb5Var.e(i, messagingClientEvent.k());
            xb5Var.e(j, messagingClientEvent.o());
            xb5Var.a(k, messagingClientEvent.n());
            xb5Var.f(l, messagingClientEvent.b());
            xb5Var.a(m, messagingClientEvent.f());
            xb5Var.a(n, messagingClientEvent.a());
            xb5Var.f(o, messagingClientEvent.c());
            xb5Var.a(p, messagingClientEvent.e());
        }
    }

    private static final class b implements wb5 {
        static final b a = new b();
        private static final yd2 b = yd2.a("messagingClientEvent").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();

        private b() {
        }

        @Override // defpackage.wb5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(hs4 hs4Var, xb5 xb5Var) {
            xb5Var.a(b, hs4Var.a());
        }
    }

    private static final class c implements wb5 {
        static final c a = new c();
        private static final yd2 b = yd2.d("messagingClientEventExtension");

        private c() {
        }

        @Override // defpackage.wb5
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            lh4.a(obj);
            b(null, (xb5) obj2);
        }

        public void b(i76 i76Var, xb5 xb5Var) {
            throw null;
        }
    }

    private k00() {
    }

    @Override // defpackage.ku0
    public void a(c12 c12Var) {
        c12Var.a(i76.class, c.a);
        c12Var.a(hs4.class, b.a);
        c12Var.a(MessagingClientEvent.class, a.a);
    }
}
