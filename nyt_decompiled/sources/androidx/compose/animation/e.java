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
public abstract class e {
    public static final a a = new a(null);
    private static final e b = new f(new lr8(null, null, null, null, false, null, 63, null));
    private static final e c = new f(new lr8(null, null, null, null, true, null, 47, null));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.b;
        }

        private a() {
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract lr8 b();

    public final e c(e eVar) {
        fa2 c2 = b().c();
        if (c2 == null) {
            c2 = eVar.b().c();
        }
        fa2 fa2Var = c2;
        qu7 f = b().f();
        if (f == null) {
            f = eVar.b().f();
        }
        qu7 qu7Var = f;
        fj0 a2 = b().a();
        if (a2 == null) {
            a2 = eVar.b().a();
        }
        fj0 fj0Var = a2;
        la7 e = b().e();
        if (e == null) {
            e = eVar.b().e();
        }
        return new f(new lr8(fa2Var, qu7Var, fj0Var, e, b().d() || eVar.b().d(), t.p(b().b(), eVar.b().b())));
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && zq3.c(((e) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (zq3.c(this, b)) {
            return "ExitTransition.None";
        }
        if (zq3.c(this, c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        lr8 b2 = b();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
        fa2 c2 = b2.c();
        sb.append(c2 != null ? c2.toString() : null);
        sb.append(",\nSlide - ");
        qu7 f = b2.f();
        sb.append(f != null ? f.toString() : null);
        sb.append(",\nShrink - ");
        fj0 a2 = b2.a();
        sb.append(a2 != null ? a2.toString() : null);
        sb.append(",\nScale - ");
        la7 e = b2.e();
        sb.append(e != null ? e.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(b2.d());
        return sb.toString();
    }

    private e() {
    }
}
