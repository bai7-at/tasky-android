package defpackage;

import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.style.TextForegroundStyle;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class jy7 {
    private final TextForegroundStyle a;
    private final long b;
    private final o c;
    private final l d;
    private final m e;
    private final e f;
    private final String g;
    private final long h;
    private final m60 i;
    private final li8 j;
    private final l74 k;
    private final long l;
    private final ph8 m;
    private final jo7 n;
    private final f o;
    private final gv1 p;

    public /* synthetic */ jy7(long j, long j2, o oVar, l lVar, m mVar, e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, f fVar, gv1 gv1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, fVar, gv1Var);
    }

    public final jy7 A(jy7 jy7Var) {
        return jy7Var == null ? this : SpanStyleKt.b(this, jy7Var.a.b(), jy7Var.a.e(), jy7Var.a.a(), jy7Var.b, jy7Var.c, jy7Var.d, jy7Var.e, jy7Var.f, jy7Var.g, jy7Var.h, jy7Var.i, jy7Var.j, jy7Var.k, jy7Var.l, jy7Var.m, jy7Var.n, jy7Var.o, jy7Var.p);
    }

    public final jy7 a(long j, long j2, o oVar, l lVar, m mVar, e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, f fVar, gv1 gv1Var) {
        return new jy7(nn0.t(j, i()) ? this.a : TextForegroundStyle.a.b(j), j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, fVar, gv1Var, (DefaultConstructorMarker) null);
    }

    public final /* synthetic */ jy7 c(long j, long j2, o oVar, l lVar, m mVar, e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var) {
        return new jy7(nn0.t(j, i()) ? this.a : TextForegroundStyle.a.b(j), j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, this.o, this.p, (DefaultConstructorMarker) null);
    }

    public final float e() {
        return this.a.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy7)) {
            return false;
        }
        jy7 jy7Var = (jy7) obj;
        return x(jy7Var) && y(jy7Var);
    }

    public final long f() {
        return this.l;
    }

    public final m60 g() {
        return this.i;
    }

    public final yc0 h() {
        return this.a.e();
    }

    public int hashCode() {
        int z = nn0.z(i()) * 31;
        yc0 h = h();
        int hashCode = (((((z + (h != null ? h.hashCode() : 0)) * 31) + Float.hashCode(e())) * 31) + dk8.i(this.b)) * 31;
        o oVar = this.c;
        int hashCode2 = (hashCode + (oVar != null ? oVar.hashCode() : 0)) * 31;
        l lVar = this.d;
        int g = (hashCode2 + (lVar != null ? l.g(lVar.i()) : 0)) * 31;
        m mVar = this.e;
        int i = (g + (mVar != null ? m.i(mVar.m()) : 0)) * 31;
        e eVar = this.f;
        int hashCode3 = (i + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str = this.g;
        int hashCode4 = (((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + dk8.i(this.h)) * 31;
        m60 m60Var = this.i;
        int f = (hashCode4 + (m60Var != null ? m60.f(m60Var.h()) : 0)) * 31;
        li8 li8Var = this.j;
        int hashCode5 = (f + (li8Var != null ? li8Var.hashCode() : 0)) * 31;
        l74 l74Var = this.k;
        int hashCode6 = (((hashCode5 + (l74Var != null ? l74Var.hashCode() : 0)) * 31) + nn0.z(this.l)) * 31;
        ph8 ph8Var = this.m;
        int hashCode7 = (hashCode6 + (ph8Var != null ? ph8Var.hashCode() : 0)) * 31;
        jo7 jo7Var = this.n;
        int hashCode8 = (hashCode7 + (jo7Var != null ? jo7Var.hashCode() : 0)) * 31;
        f fVar = this.o;
        int hashCode9 = (hashCode8 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        gv1 gv1Var = this.p;
        return hashCode9 + (gv1Var != null ? gv1Var.hashCode() : 0);
    }

    public final long i() {
        return this.a.b();
    }

    public final gv1 j() {
        return this.p;
    }

    public final e k() {
        return this.f;
    }

    public final String l() {
        return this.g;
    }

    public final long m() {
        return this.b;
    }

    public final l n() {
        return this.d;
    }

    public final m o() {
        return this.e;
    }

    public final o p() {
        return this.c;
    }

    public final long q() {
        return this.h;
    }

    public final l74 r() {
        return this.k;
    }

    public final f s() {
        return this.o;
    }

    public final jo7 t() {
        return this.n;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) nn0.A(i())) + ", brush=" + h() + ", alpha=" + e() + ", fontSize=" + ((Object) dk8.j(this.b)) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + ((Object) dk8.j(this.h)) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + ((Object) nn0.A(this.l)) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=" + this.o + ", drawStyle=" + this.p + ')';
    }

    public final ph8 u() {
        return this.m;
    }

    public final TextForegroundStyle v() {
        return this.a;
    }

    public final li8 w() {
        return this.j;
    }

    public final boolean x(jy7 jy7Var) {
        if (this == jy7Var) {
            return true;
        }
        return dk8.e(this.b, jy7Var.b) && zq3.c(this.c, jy7Var.c) && zq3.c(this.d, jy7Var.d) && zq3.c(this.e, jy7Var.e) && zq3.c(this.f, jy7Var.f) && zq3.c(this.g, jy7Var.g) && dk8.e(this.h, jy7Var.h) && zq3.c(this.i, jy7Var.i) && zq3.c(this.j, jy7Var.j) && zq3.c(this.k, jy7Var.k) && nn0.t(this.l, jy7Var.l) && zq3.c(this.o, jy7Var.o);
    }

    public final boolean y(jy7 jy7Var) {
        return zq3.c(this.a, jy7Var.a) && zq3.c(this.m, jy7Var.m) && zq3.c(this.n, jy7Var.n) && zq3.c(this.p, jy7Var.p);
    }

    public final int z() {
        int i = dk8.i(this.b) * 31;
        o oVar = this.c;
        int hashCode = (i + (oVar != null ? oVar.hashCode() : 0)) * 31;
        l lVar = this.d;
        int g = (hashCode + (lVar != null ? l.g(lVar.i()) : 0)) * 31;
        m mVar = this.e;
        int i2 = (g + (mVar != null ? m.i(mVar.m()) : 0)) * 31;
        e eVar = this.f;
        int hashCode2 = (i2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str = this.g;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + dk8.i(this.h)) * 31;
        m60 m60Var = this.i;
        int f = (hashCode3 + (m60Var != null ? m60.f(m60Var.h()) : 0)) * 31;
        li8 li8Var = this.j;
        int hashCode4 = (f + (li8Var != null ? li8Var.hashCode() : 0)) * 31;
        l74 l74Var = this.k;
        int hashCode5 = (((hashCode4 + (l74Var != null ? l74Var.hashCode() : 0)) * 31) + nn0.z(this.l)) * 31;
        f fVar = this.o;
        return hashCode5 + (fVar != null ? fVar.hashCode() : 0);
    }

    public /* synthetic */ jy7(long j, long j2, o oVar, l lVar, m mVar, e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var);
    }

    public /* synthetic */ jy7(TextForegroundStyle textForegroundStyle, long j, o oVar, l lVar, m mVar, e eVar, String str, long j2, m60 m60Var, li8 li8Var, l74 l74Var, long j3, ph8 ph8Var, jo7 jo7Var, f fVar, gv1 gv1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, j, oVar, lVar, mVar, eVar, str, j2, m60Var, li8Var, l74Var, j3, ph8Var, jo7Var, fVar, gv1Var);
    }

    private jy7(TextForegroundStyle textForegroundStyle, long j, o oVar, l lVar, m mVar, e eVar, String str, long j2, m60 m60Var, li8 li8Var, l74 l74Var, long j3, ph8 ph8Var, jo7 jo7Var, f fVar, gv1 gv1Var) {
        this.a = textForegroundStyle;
        this.b = j;
        this.c = oVar;
        this.d = lVar;
        this.e = mVar;
        this.f = eVar;
        this.g = str;
        this.h = j2;
        this.i = m60Var;
        this.j = li8Var;
        this.k = l74Var;
        this.l = j3;
        this.m = ph8Var;
        this.n = jo7Var;
        this.o = fVar;
        this.p = gv1Var;
    }

    public /* synthetic */ jy7(TextForegroundStyle textForegroundStyle, long j, o oVar, l lVar, m mVar, e eVar, String str, long j2, m60 m60Var, li8 li8Var, l74 l74Var, long j3, ph8 ph8Var, jo7 jo7Var, f fVar, gv1 gv1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, (i & 2) != 0 ? dk8.b.a() : j, (i & 4) != 0 ? null : oVar, (i & 8) != 0 ? null : lVar, (i & 16) != 0 ? null : mVar, (i & 32) != 0 ? null : eVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? dk8.b.a() : j2, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : m60Var, (i & 512) != 0 ? null : li8Var, (i & 1024) != 0 ? null : l74Var, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.g() : j3, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : ph8Var, (i & 8192) != 0 ? null : jo7Var, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : fVar, (i & 32768) != 0 ? null : gv1Var, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ jy7(long j, long j2, o oVar, l lVar, m mVar, e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nn0.b.g() : j, (i & 2) != 0 ? dk8.b.a() : j2, (i & 4) != 0 ? null : oVar, (i & 8) != 0 ? null : lVar, (i & 16) != 0 ? null : mVar, (i & 32) != 0 ? null : eVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? dk8.b.a() : j3, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : m60Var, (i & 512) != 0 ? null : li8Var, (i & 1024) != 0 ? null : l74Var, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.g() : j4, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : ph8Var, (i & 8192) != 0 ? null : jo7Var, null);
    }

    private jy7(long j, long j2, o oVar, l lVar, m mVar, e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var) {
        this(TextForegroundStyle.a.b(j), j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, (f) null, (gv1) null, 32768, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ jy7(long j, long j2, o oVar, l lVar, m mVar, e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, f fVar, gv1 gv1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nn0.b.g() : j, (i & 2) != 0 ? dk8.b.a() : j2, (i & 4) != 0 ? null : oVar, (i & 8) != 0 ? null : lVar, (i & 16) != 0 ? null : mVar, (i & 32) != 0 ? null : eVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? dk8.b.a() : j3, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : m60Var, (i & 512) != 0 ? null : li8Var, (i & 1024) != 0 ? null : l74Var, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.g() : j4, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : ph8Var, (i & 8192) != 0 ? null : jo7Var, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : fVar, (i & 32768) != 0 ? null : gv1Var, (DefaultConstructorMarker) null);
    }

    private jy7(long j, long j2, o oVar, l lVar, m mVar, e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, f fVar, gv1 gv1Var) {
        this(TextForegroundStyle.a.b(j), j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, fVar, gv1Var, (DefaultConstructorMarker) null);
    }
}
