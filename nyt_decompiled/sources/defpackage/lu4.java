package defpackage;

import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class lu4 {
    public static final a h = new a(null);
    public static final int i = 8;
    private static lu4 j;
    private final LayoutDirection a;
    private final j b;
    private final fm1 c;
    private final e.b d;
    private final j e;
    private float f;
    private float g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final lu4 a(lu4 lu4Var, LayoutDirection layoutDirection, j jVar, fm1 fm1Var, e.b bVar) {
            if (lu4Var != null && layoutDirection == lu4Var.g() && zq3.c(jVar, lu4Var.f()) && fm1Var.getDensity() == lu4Var.d().getDensity() && bVar == lu4Var.e()) {
                return lu4Var;
            }
            lu4 lu4Var2 = lu4.j;
            if (lu4Var2 != null && layoutDirection == lu4Var2.g() && zq3.c(jVar, lu4Var2.f()) && fm1Var.getDensity() == lu4Var2.d().getDensity() && bVar == lu4Var2.e()) {
                return lu4Var2;
            }
            lu4 lu4Var3 = new lu4(layoutDirection, ak8.d(jVar, layoutDirection), fm1Var, bVar, null);
            lu4.j = lu4Var3;
            return lu4Var3;
        }

        private a() {
        }
    }

    public /* synthetic */ lu4(LayoutDirection layoutDirection, j jVar, fm1 fm1Var, e.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutDirection, jVar, fm1Var, bVar);
    }

    public final long c(long j2, int i2) {
        String str;
        io5 a2;
        String str2;
        io5 a3;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            str = mu4.a;
            a2 = androidx.compose.ui.text.e.a(str, this.e, iv0.b(0, 0, 0, 0, 15, null), this.c, this.d, (r22 & 32) != 0 ? i.l() : null, (r22 & 64) != 0 ? i.l() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : 1, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : false);
            f = a2.getHeight();
            str2 = mu4.b;
            a3 = androidx.compose.ui.text.e.a(str2, this.e, iv0.b(0, 0, 0, 0, 15, null), this.c, this.d, (r22 & 32) != 0 ? i.l() : null, (r22 & 64) != 0 ? i.l() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : 2, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : false);
            f2 = a3.getHeight() - f;
            this.g = f;
            this.f = f2;
        }
        return iv0.a(fv0.p(j2), fv0.n(j2), i2 != 1 ? uo6.i(uo6.d(dg4.d(f + (f2 * (i2 - 1))), 0), fv0.m(j2)) : fv0.o(j2), fv0.m(j2));
    }

    public final fm1 d() {
        return this.c;
    }

    public final e.b e() {
        return this.d;
    }

    public final j f() {
        return this.b;
    }

    public final LayoutDirection g() {
        return this.a;
    }

    private lu4(LayoutDirection layoutDirection, j jVar, fm1 fm1Var, e.b bVar) {
        this.a = layoutDirection;
        this.b = jVar;
        this.c = fm1Var;
        this.d = bVar;
        this.e = ak8.d(jVar, layoutDirection);
        this.f = Float.NaN;
        this.g = Float.NaN;
    }
}
