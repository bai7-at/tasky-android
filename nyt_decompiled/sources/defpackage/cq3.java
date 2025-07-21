package defpackage;

import com.nytimes.android.interests.db.InterestArticleAsset;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.interests.db.InterestInteractiveAsset;
import com.nytimes.android.interests.db.PromotionalMedia;
import defpackage.ap3;
import defpackage.ip3;
import defpackage.og2;
import defpackage.tf2;
import org.threeten.bp.Instant;
import type.Tone;

/* loaded from: classes4.dex */
public final class cq3 {
    private final InterestArticleAsset b(tf2 tf2Var) {
        String b;
        Instant f;
        xg2 a;
        String m = tf2Var.m();
        String n = tf2Var.n();
        tf2.a b2 = tf2Var.b();
        if (b2 == null || (b = b2.a()) == null) {
            tf2.a b3 = tf2Var.b();
            if (b3 == null) {
                return null;
            }
            b = b3.b();
        }
        String str = b;
        String j = tf2Var.j();
        String l = tf2Var.l();
        tf2.c g = tf2Var.g();
        PromotionalMedia f2 = (g == null || (a = g.a()) == null) ? null : dq3.f(a);
        boolean z = tf2Var.k() == Tone.OPINION;
        tf2.b c = tf2Var.c();
        long epochSecond = ((c == null || (f = c.a()) == null) && (f = tf2Var.f()) == null) ? 0L : f.getEpochSecond();
        Instant e = tf2Var.e();
        return new InterestArticleAsset(m, n, str, j, l, f2, epochSecond, e != null ? e.getEpochSecond() : 0L, z);
    }

    private final InterestArticleAsset c(ap3 ap3Var) {
        String b;
        Instant f;
        r56 a;
        String m = ap3Var.m();
        String n = ap3Var.n();
        ap3.a b2 = ap3Var.b();
        if (b2 == null || (b = b2.a()) == null) {
            ap3.a b3 = ap3Var.b();
            if (b3 == null) {
                return null;
            }
            b = b3.b();
        }
        String str = b;
        String j = ap3Var.j();
        String l = ap3Var.l();
        ap3.c g = ap3Var.g();
        PromotionalMedia h = (g == null || (a = g.a()) == null) ? null : dq3.h(a);
        boolean z = ap3Var.k() == Tone.OPINION;
        ap3.b c = ap3Var.c();
        long epochSecond = ((c == null || (f = c.a()) == null) && (f = ap3Var.f()) == null) ? 0L : f.getEpochSecond();
        Instant e = ap3Var.e();
        return new InterestArticleAsset(m, n, str, j, l, h, epochSecond, e != null ? e.getEpochSecond() : 0L, z);
    }

    private final InterestInteractiveAsset d(og2 og2Var) {
        String b;
        xg2 a;
        String m = og2Var.m();
        String n = og2Var.n();
        og2.a c = og2Var.c();
        if (c == null || (b = c.a()) == null) {
            og2.a c2 = og2Var.c();
            if (c2 == null) {
                return null;
            }
            b = c2.b();
        }
        String str = b;
        String j = og2Var.j();
        String l = og2Var.l();
        og2.b g = og2Var.g();
        PromotionalMedia f = (g == null || (a = g.a()) == null) ? null : dq3.f(a);
        boolean z = og2Var.k() == Tone.OPINION;
        Instant f2 = og2Var.f();
        long epochSecond = f2 != null ? f2.getEpochSecond() : 0L;
        Instant e = og2Var.e();
        return new InterestInteractiveAsset(m, n, str, j, l, f, epochSecond, e != null ? e.getEpochSecond() : 0L, z);
    }

    private final InterestInteractiveAsset e(ip3 ip3Var) {
        String b;
        r56 a;
        String m = ip3Var.m();
        String n = ip3Var.n();
        ip3.a c = ip3Var.c();
        if (c == null || (b = c.a()) == null) {
            ip3.a c2 = ip3Var.c();
            if (c2 == null) {
                return null;
            }
            b = c2.b();
        }
        String str = b;
        String j = ip3Var.j();
        String l = ip3Var.l();
        ip3.b g = ip3Var.g();
        PromotionalMedia h = (g == null || (a = g.a()) == null) ? null : dq3.h(a);
        boolean z = ip3Var.k() == Tone.OPINION;
        Instant f = ip3Var.f();
        long epochSecond = f != null ? f.getEpochSecond() : 0L;
        Instant e = ip3Var.e();
        return new InterestInteractiveAsset(m, n, str, j, l, h, epochSecond, e != null ? e.getEpochSecond() : 0L, z);
    }

    public final InterestAsset a(rp2 rp2Var) {
        zq3.h(rp2Var, "fragment");
        if (rp2Var instanceof ap3) {
            return c((ap3) rp2Var);
        }
        if (rp2Var instanceof ip3) {
            return e((ip3) rp2Var);
        }
        if (rp2Var instanceof tf2) {
            return b((tf2) rp2Var);
        }
        if (rp2Var instanceof og2) {
            return d((og2) rp2Var);
        }
        return null;
    }
}
