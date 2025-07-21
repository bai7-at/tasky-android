package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nytimes.android.analytics.event.GatewayEvent;
import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import defpackage.fx1;
import defpackage.oa4;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class dd implements cd, fx1.a {
    private final jc a;
    private final Set b;

    private final class a implements j1 {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
        
            if (defpackage.zq3.c(r0, r3.getTitle()) != false) goto L18;
         */
        @Override // defpackage.j1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(defpackage.oa4 r6) {
            /*
                r5 = this;
                java.lang.String r0 = "status"
                defpackage.zq3.h(r6, r0)
                dd r0 = defpackage.dd.this
                jc r0 = r0.e()
                r1 = -1
                r0.B(r1)
                com.nytimes.android.subauth.core.auth.models.LoginMethod r0 = defpackage.pa4.b(r6)
                java.lang.String r0 = defpackage.p98.a(r0)
                dd$b r1 = dd.b.a
                boolean r1 = r1.a(r6)
                if (r1 == 0) goto L4f
                boolean r1 = r6 instanceof oa4.c
                dd r2 = defpackage.dd.this
                jc r2 = r2.e()
                java.lang.String r3 = r5.a
                r2.t(r3, r1, r0)
                boolean r1 = r6 instanceof oa4.b
                if (r1 == 0) goto L4f
                dd r1 = defpackage.dd.this
                java.util.Set r1 = defpackage.dd.d(r1)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L3c:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L4f
                java.lang.Object r2 = r1.next()
                fx1 r2 = (defpackage.fx1) r2
                r3 = r6
                oa4$b r3 = (oa4.b) r3
                r2.b(r3)
                goto L3c
            L4f:
                dd$b r1 = dd.b.a
                boolean r1 = r1.b(r6)
                if (r1 == 0) goto L90
                dd r1 = defpackage.dd.this
                jc r1 = r1.e()
                com.nytimes.android.analytics.event.values.RegiMethod r2 = com.nytimes.android.analytics.event.values.RegiMethod.EMAIL     // Catch: java.lang.IllegalArgumentException -> L85
                java.lang.String r3 = r2.getTitle()     // Catch: java.lang.IllegalArgumentException -> L85
                boolean r3 = defpackage.zq3.c(r0, r3)     // Catch: java.lang.IllegalArgumentException -> L85
                if (r3 == 0) goto L6a
                goto L8b
            L6a:
                com.nytimes.android.analytics.event.values.RegiMethod r3 = com.nytimes.android.analytics.event.values.RegiMethod.FACEBOOK     // Catch: java.lang.IllegalArgumentException -> L85
                java.lang.String r4 = r3.getTitle()     // Catch: java.lang.IllegalArgumentException -> L85
                boolean r4 = defpackage.zq3.c(r0, r4)     // Catch: java.lang.IllegalArgumentException -> L85
                if (r4 == 0) goto L78
            L76:
                r2 = r3
                goto L8b
            L78:
                com.nytimes.android.analytics.event.values.RegiMethod r3 = com.nytimes.android.analytics.event.values.RegiMethod.GOOGLE     // Catch: java.lang.IllegalArgumentException -> L85
                java.lang.String r4 = r3.getTitle()     // Catch: java.lang.IllegalArgumentException -> L85
                boolean r0 = defpackage.zq3.c(r0, r4)     // Catch: java.lang.IllegalArgumentException -> L85
                if (r0 == 0) goto L8b
                goto L76
            L85:
                r0 = move-exception
                com.nytimes.android.logging.NYTLogger.m(r0)
                com.nytimes.android.analytics.event.values.RegiMethod r2 = com.nytimes.android.analytics.event.values.RegiMethod.EMAIL
            L8b:
                java.lang.String r0 = r5.a
                r1.p(r2, r0)
            L90:
                dd$b r0 = dd.b.a
                boolean r0 = r0.c(r6)
                if (r0 == 0) goto Lbb
                boolean r0 = r6 instanceof oa4.b
                if (r0 == 0) goto Lbb
                dd r5 = defpackage.dd.this
                java.util.Set r5 = defpackage.dd.d(r5)
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            La8:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto Lbb
                java.lang.Object r0 = r5.next()
                fx1 r0 = (defpackage.fx1) r0
                r1 = r6
                oa4$b r1 = (oa4.b) r1
                r0.c(r1)
                goto La8
            Lbb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.a.a(oa4):void");
        }
    }

    private static final class b {
        public static final b a = new b();
        private static final Set b = b0.j(LoginMethod.LoginCredentials, LoginMethod.LoginMagicLink, LoginMethod.GoogleOneTap);
        private static final Set c = b0.j(LoginMethod.GoogleSSO, LoginMethod.FacebookSSO, LoginMethod.WebSSO);

        private b() {
        }

        public final boolean a(oa4 oa4Var) {
            LoginResponse d;
            zq3.h(oa4Var, "response");
            if (!b.contains(pa4.b(oa4Var))) {
                if (c.contains(pa4.b(oa4Var))) {
                    String str = null;
                    oa4.c cVar = oa4Var instanceof oa4.c ? (oa4.c) oa4Var : null;
                    if (cVar != null && (d = cVar.d()) != null) {
                        str = d.b();
                    }
                    if (zq3.c(str, "LOGIN")) {
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean b(oa4 oa4Var) {
            LoginResponse d;
            zq3.h(oa4Var, "response");
            if (oa4Var instanceof oa4.c) {
                if (pa4.b(oa4Var) != LoginMethod.RegisterCredentials) {
                    oa4.c cVar = (oa4.c) oa4Var;
                    if (c.contains(cVar.c())) {
                        boolean z = oa4Var instanceof oa4.c;
                        String str = null;
                        if (!z) {
                            cVar = null;
                        }
                        if (cVar != null && (d = cVar.d()) != null) {
                            str = d.b();
                        }
                        if (zq3.c(str, "REGISTER")) {
                        }
                    }
                }
                return true;
            }
            return false;
        }

        public final boolean c(oa4 oa4Var) {
            zq3.h(oa4Var, "response");
            if (oa4Var instanceof oa4.b) {
                if (pa4.b(oa4Var) != LoginMethod.RegisterCredentials) {
                    oa4.b bVar = (oa4.b) oa4Var;
                    if (!c.contains(bVar.b()) || bVar.e() == null) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    public dd(jc jcVar) {
        zq3.h(jcVar, "analyticsClient");
        this.a = jcVar;
        this.b = new HashSet();
    }

    @Override // fx1.a
    public void a(fx1 fx1Var) {
        zq3.h(fx1Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.add(fx1Var);
    }

    @Override // defpackage.cd
    public void b() {
        if (this.a.l()) {
            jc jcVar = this.a;
            jcVar.m(GatewayEvent.ActionTaken.LogIn, jcVar.e(), this.a.f(), null);
        }
    }

    @Override // defpackage.cd
    public j1 c(String str) {
        zq3.h(str, "referrer");
        return new a(str);
    }

    public final jc e() {
        return this.a;
    }
}
