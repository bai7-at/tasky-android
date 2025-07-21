package androidx.compose.ui.text;

import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.style.TextForegroundStyle;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.dh8;
import defpackage.dk8;
import defpackage.gv1;
import defpackage.ij8;
import defpackage.jo7;
import defpackage.jy7;
import defpackage.l74;
import defpackage.li8;
import defpackage.m60;
import defpackage.ni8;
import defpackage.nn0;
import defpackage.no5;
import defpackage.oo5;
import defpackage.ph8;
import defpackage.q44;
import defpackage.u44;
import defpackage.uh8;
import defpackage.yc0;
import defpackage.yd3;
import defpackage.zq3;
import defpackage.zu5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class j {
    public static final a d = new a(null);
    private static final j e = new j(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777215, null);
    private final jy7 a;
    private final no5 b;
    private final zu5 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.e;
        }

        private a() {
        }
    }

    public /* synthetic */ j(long j, long j2, o oVar, l lVar, m mVar, androidx.compose.ui.text.font.e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, gv1 gv1Var, int i, int i2, long j5, ni8 ni8Var, zu5 zu5Var, u44 u44Var, int i3, int i4, ij8 ij8Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, gv1Var, i, i2, j5, ni8Var, zu5Var, u44Var, i3, i4, ij8Var);
    }

    public final zu5 A() {
        return this.c;
    }

    public final jo7 B() {
        return this.a.t();
    }

    public final jy7 C() {
        return this.a;
    }

    public final int D() {
        return this.b.h();
    }

    public final ph8 E() {
        return this.a.u();
    }

    public final int F() {
        return this.b.i();
    }

    public final li8 G() {
        return this.a.w();
    }

    public final ni8 H() {
        return this.b.j();
    }

    public final ij8 I() {
        return this.b.k();
    }

    public final boolean J(j jVar) {
        return this == jVar || this.a.y(jVar.a);
    }

    public final boolean K(j jVar) {
        return this == jVar || (zq3.c(this.b, jVar.b) && this.a.x(jVar.a));
    }

    public final int L() {
        int z = ((this.a.z() * 31) + this.b.hashCode()) * 31;
        zu5 zu5Var = this.c;
        return z + (zu5Var != null ? zu5Var.hashCode() : 0);
    }

    public final j M(no5 no5Var) {
        return new j(R(), Q().l(no5Var));
    }

    public final j N(j jVar) {
        return (jVar == null || zq3.c(jVar, e)) ? this : new j(R().A(jVar.R()), Q().l(jVar.Q()));
    }

    public final j O(long j, long j2, o oVar, l lVar, m mVar, androidx.compose.ui.text.font.e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, gv1 gv1Var, int i, int i2, long j5, ni8 ni8Var, u44 u44Var, int i3, int i4, zu5 zu5Var, ij8 ij8Var) {
        jy7 b = SpanStyleKt.b(this.a, j, null, Float.NaN, j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, zu5Var != null ? zu5Var.b() : null, gv1Var);
        no5 a2 = oo5.a(this.b, i, i2, j5, ni8Var, zu5Var != null ? zu5Var.a() : null, u44Var, i3, i4, ij8Var);
        return (this.a == b && this.b == a2) ? this : new j(b, a2);
    }

    public final no5 Q() {
        return this.b;
    }

    public final jy7 R() {
        return this.a;
    }

    public final /* synthetic */ j b(long j, long j2, o oVar, l lVar, m mVar, androidx.compose.ui.text.font.e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, dh8 dh8Var, uh8 uh8Var, long j5, ni8 ni8Var) {
        return new j(new jy7(nn0.t(j, this.a.i()) ? this.a.v() : TextForegroundStyle.a.b(j), j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, this.a.s(), this.a.j(), (DefaultConstructorMarker) null), new no5(dh8Var != null ? dh8Var.n() : dh8.b.g(), uh8Var != null ? uh8Var.m() : uh8.b.f(), j5, ni8Var, this.b.g(), x(), v(), t(), I(), null), this.c);
    }

    public final /* synthetic */ j d(long j, long j2, o oVar, l lVar, m mVar, androidx.compose.ui.text.font.e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, dh8 dh8Var, uh8 uh8Var, long j5, ni8 ni8Var, zu5 zu5Var, u44 u44Var) {
        return new j(new jy7(nn0.t(j, this.a.i()) ? this.a.v() : TextForegroundStyle.a.b(j), j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, zu5Var != null ? zu5Var.b() : null, this.a.j(), (DefaultConstructorMarker) null), new no5(dh8Var != null ? dh8Var.n() : dh8.b.g(), uh8Var != null ? uh8Var.m() : uh8.b.f(), j5, ni8Var, zu5Var != null ? zu5Var.a() : null, u44Var, v(), t(), I(), null), zu5Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return zq3.c(this.a, jVar.a) && zq3.c(this.b, jVar.b) && zq3.c(this.c, jVar.c);
    }

    public final j f(long j, long j2, o oVar, l lVar, m mVar, androidx.compose.ui.text.font.e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, gv1 gv1Var, int i, int i2, long j5, ni8 ni8Var, zu5 zu5Var, u44 u44Var, int i3, int i4, ij8 ij8Var) {
        return new j(new jy7(nn0.t(j, this.a.i()) ? this.a.v() : TextForegroundStyle.a.b(j), j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, zu5Var != null ? zu5Var.b() : null, gv1Var, (DefaultConstructorMarker) null), new no5(i, i2, j5, ni8Var, zu5Var != null ? zu5Var.a() : null, u44Var, i3, i4, ij8Var, null), zu5Var);
    }

    public final float h() {
        return this.a.e();
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        zu5 zu5Var = this.c;
        return hashCode + (zu5Var != null ? zu5Var.hashCode() : 0);
    }

    public final long i() {
        return this.a.f();
    }

    public final m60 j() {
        return this.a.g();
    }

    public final yc0 k() {
        return this.a.h();
    }

    public final long l() {
        return this.a.i();
    }

    public final gv1 m() {
        return this.a.j();
    }

    public final androidx.compose.ui.text.font.e n() {
        return this.a.k();
    }

    public final String o() {
        return this.a.l();
    }

    public final long p() {
        return this.a.m();
    }

    public final l q() {
        return this.a.n();
    }

    public final m r() {
        return this.a.o();
    }

    public final o s() {
        return this.a.p();
    }

    public final int t() {
        return this.b.c();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) nn0.A(l())) + ", brush=" + k() + ", alpha=" + h() + ", fontSize=" + ((Object) dk8.j(p())) + ", fontWeight=" + s() + ", fontStyle=" + q() + ", fontSynthesis=" + r() + ", fontFamily=" + n() + ", fontFeatureSettings=" + o() + ", letterSpacing=" + ((Object) dk8.j(u())) + ", baselineShift=" + j() + ", textGeometricTransform=" + G() + ", localeList=" + y() + ", background=" + ((Object) nn0.A(i())) + ", textDecoration=" + E() + ", shadow=" + B() + ", drawStyle=" + m() + ", textAlign=" + ((Object) dh8.m(D())) + ", textDirection=" + ((Object) uh8.l(F())) + ", lineHeight=" + ((Object) dk8.j(w())) + ", textIndent=" + H() + ", platformStyle=" + this.c + ", lineHeightStyle=" + x() + ", lineBreak=" + ((Object) q44.k(v())) + ", hyphens=" + ((Object) yd3.i(t())) + ", textMotion=" + I() + ')';
    }

    public final long u() {
        return this.a.q();
    }

    public final int v() {
        return this.b.d();
    }

    public final long w() {
        return this.b.e();
    }

    public final u44 x() {
        return this.b.f();
    }

    public final l74 y() {
        return this.a.r();
    }

    public final no5 z() {
        return this.b;
    }

    public /* synthetic */ j(long j, long j2, o oVar, l lVar, m mVar, androidx.compose.ui.text.font.e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, dh8 dh8Var, uh8 uh8Var, long j5, ni8 ni8Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, dh8Var, uh8Var, j5, ni8Var);
    }

    public j(jy7 jy7Var, no5 no5Var, zu5 zu5Var) {
        this.a = jy7Var;
        this.b = no5Var;
        this.c = zu5Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(defpackage.jy7 r3, defpackage.no5 r4) {
        /*
            r2 = this;
            androidx.compose.ui.text.f r0 = r3.s()
            uu5 r1 = r4.g()
            zu5 r0 = defpackage.ak8.a(r0, r1)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.j.<init>(jy7, no5):void");
    }

    public /* synthetic */ j(long j, long j2, o oVar, l lVar, m mVar, androidx.compose.ui.text.font.e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, dh8 dh8Var, uh8 uh8Var, long j5, ni8 ni8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nn0.b.g() : j, (i & 2) != 0 ? dk8.b.a() : j2, (i & 4) != 0 ? null : oVar, (i & 8) != 0 ? null : lVar, (i & 16) != 0 ? null : mVar, (i & 32) != 0 ? null : eVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? dk8.b.a() : j3, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : m60Var, (i & 512) != 0 ? null : li8Var, (i & 1024) != 0 ? null : l74Var, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.g() : j4, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : ph8Var, (i & 8192) != 0 ? null : jo7Var, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : dh8Var, (i & 32768) != 0 ? null : uh8Var, (i & 65536) != 0 ? dk8.b.a() : j5, (i & 131072) != 0 ? null : ni8Var, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private j(long r23, long r25, androidx.compose.ui.text.font.o r27, androidx.compose.ui.text.font.l r28, androidx.compose.ui.text.font.m r29, androidx.compose.ui.text.font.e r30, java.lang.String r31, long r32, defpackage.m60 r34, defpackage.li8 r35, defpackage.l74 r36, long r37, defpackage.ph8 r39, defpackage.jo7 r40, defpackage.dh8 r41, defpackage.uh8 r42, long r43, defpackage.ni8 r45) {
        /*
            r22 = this;
            r1 = r23
            r3 = r25
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r17 = r39
            r18 = r40
            jy7 r0 = new jy7
            r23 = r0
            r20 = 0
            r21 = 0
            r19 = 0
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            no5 r0 = new no5
            if (r41 == 0) goto L32
            int r1 = r41.n()
            goto L38
        L32:
            dh8$a r1 = defpackage.dh8.b
            int r1 = r1.g()
        L38:
            if (r42 == 0) goto L3f
            int r2 = r42.m()
            goto L45
        L3f:
            uh8$a r2 = defpackage.uh8.b
            int r2 = r2.f()
        L45:
            q44$a r3 = defpackage.q44.b
            int r3 = r3.b()
            yd3$a r4 = defpackage.yd3.b
            int r4 = r4.c()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r24 = r0
            r25 = r1
            r26 = r2
            r27 = r43
            r29 = r45
            r30 = r7
            r31 = r8
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r24.<init>(r25, r26, r27, r29, r30, r31, r32, r33, r34, r35)
            r1 = 0
            r2 = r22
            r3 = r23
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.j.<init>(long, long, androidx.compose.ui.text.font.o, androidx.compose.ui.text.font.l, androidx.compose.ui.text.font.m, androidx.compose.ui.text.font.e, java.lang.String, long, m60, li8, l74, long, ph8, jo7, dh8, uh8, long, ni8):void");
    }

    public /* synthetic */ j(long j, long j2, o oVar, l lVar, m mVar, androidx.compose.ui.text.font.e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, gv1 gv1Var, int i, int i2, long j5, ni8 ni8Var, zu5 zu5Var, u44 u44Var, int i3, int i4, ij8 ij8Var, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? nn0.b.g() : j, (i5 & 2) != 0 ? dk8.b.a() : j2, (i5 & 4) != 0 ? null : oVar, (i5 & 8) != 0 ? null : lVar, (i5 & 16) != 0 ? null : mVar, (i5 & 32) != 0 ? null : eVar, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? dk8.b.a() : j3, (i5 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : m60Var, (i5 & 512) != 0 ? null : li8Var, (i5 & 1024) != 0 ? null : l74Var, (i5 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.g() : j4, (i5 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : ph8Var, (i5 & 8192) != 0 ? null : jo7Var, (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : gv1Var, (i5 & 32768) != 0 ? dh8.b.g() : i, (i5 & 65536) != 0 ? uh8.b.f() : i2, (i5 & 131072) != 0 ? dk8.b.a() : j5, (i5 & 262144) != 0 ? null : ni8Var, (i5 & 524288) != 0 ? null : zu5Var, (i5 & Constants.MB) != 0 ? null : u44Var, (i5 & 2097152) != 0 ? q44.b.b() : i3, (i5 & 4194304) != 0 ? yd3.b.c() : i4, (i5 & 8388608) != 0 ? null : ij8Var, null);
    }

    private j(long j, long j2, o oVar, l lVar, m mVar, androidx.compose.ui.text.font.e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, gv1 gv1Var, int i, int i2, long j5, ni8 ni8Var, zu5 zu5Var, u44 u44Var, int i3, int i4, ij8 ij8Var) {
        this(new jy7(j, j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var, zu5Var != null ? zu5Var.b() : null, gv1Var, (DefaultConstructorMarker) null), new no5(i, i2, j5, ni8Var, zu5Var != null ? zu5Var.a() : null, u44Var, i3, i4, ij8Var, null), zu5Var);
    }
}
