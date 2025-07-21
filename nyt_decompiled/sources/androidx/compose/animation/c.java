package androidx.compose.animation;

import defpackage.fa2;
import defpackage.fj0;
import defpackage.la7;
import defpackage.lr8;
import defpackage.qu7;
import defpackage.zq3;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class c {
    public static final a a = new a(null);
    private static final c b = new d(new lr8(null, null, null, null, false, null, 63, null));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.b;
        }

        private a() {
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract lr8 b();

    public final c c(c cVar) {
        fa2 c = b().c();
        if (c == null) {
            c = cVar.b().c();
        }
        fa2 fa2Var = c;
        qu7 f = b().f();
        if (f == null) {
            f = cVar.b().f();
        }
        qu7 qu7Var = f;
        fj0 a2 = b().a();
        if (a2 == null) {
            a2 = cVar.b().a();
        }
        fj0 fj0Var = a2;
        la7 e = b().e();
        if (e == null) {
            e = cVar.b().e();
        }
        return new d(new lr8(fa2Var, qu7Var, fj0Var, e, false, t.p(b().b(), cVar.b().b()), 16, null));
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && zq3.c(((c) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (zq3.c(this, b)) {
            return "EnterTransition.None";
        }
        lr8 b2 = b();
        StringBuilder sb = new StringBuilder();
        sb.append("EnterTransition: \nFade - ");
        fa2 c = b2.c();
        sb.append(c != null ? c.toString() : null);
        sb.append(",\nSlide - ");
        qu7 f = b2.f();
        sb.append(f != null ? f.toString() : null);
        sb.append(",\nShrink - ");
        fj0 a2 = b2.a();
        sb.append(a2 != null ? a2.toString() : null);
        sb.append(",\nScale - ");
        la7 e = b2.e();
        sb.append(e != null ? e.toString() : null);
        return sb.toString();
    }

    private c() {
    }
}
