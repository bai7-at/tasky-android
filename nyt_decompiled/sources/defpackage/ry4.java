package defpackage;

import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class ry4 {
    private long a;
    private long b;
    private o c;
    private l d;
    private m e;
    private e f;
    private String g;
    private long h;
    private m60 i;
    private li8 j;
    private l74 k;
    private long l;
    private ph8 m;
    private jo7 n;

    public /* synthetic */ ry4(long j, long j2, o oVar, l lVar, m mVar, e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, oVar, lVar, mVar, eVar, str, j3, m60Var, li8Var, l74Var, j4, ph8Var, jo7Var);
    }

    public final void a(long j) {
        this.l = j;
    }

    public final void b(m60 m60Var) {
        this.i = m60Var;
    }

    public final void c(long j) {
        this.a = j;
    }

    public final void d(String str) {
        this.g = str;
    }

    public final void e(long j) {
        this.b = j;
    }

    public final void f(l lVar) {
        this.d = lVar;
    }

    public final void g(m mVar) {
        this.e = mVar;
    }

    public final void h(o oVar) {
        this.c = oVar;
    }

    public final void i(long j) {
        this.h = j;
    }

    public final void j(jo7 jo7Var) {
        this.n = jo7Var;
    }

    public final void k(ph8 ph8Var) {
        this.m = ph8Var;
    }

    public final void l(li8 li8Var) {
        this.j = li8Var;
    }

    public final jy7 m() {
        return new jy7(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (f) null, (gv1) null, 49152, (DefaultConstructorMarker) null);
    }

    private ry4(long j, long j2, o oVar, l lVar, m mVar, e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var) {
        this.a = j;
        this.b = j2;
        this.c = oVar;
        this.d = lVar;
        this.e = mVar;
        this.f = eVar;
        this.g = str;
        this.h = j3;
        this.i = m60Var;
        this.j = li8Var;
        this.k = l74Var;
        this.l = j4;
        this.m = ph8Var;
        this.n = jo7Var;
    }

    public /* synthetic */ ry4(long j, long j2, o oVar, l lVar, m mVar, e eVar, String str, long j3, m60 m60Var, li8 li8Var, l74 l74Var, long j4, ph8 ph8Var, jo7 jo7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nn0.b.g() : j, (i & 2) != 0 ? dk8.b.a() : j2, (i & 4) != 0 ? null : oVar, (i & 8) != 0 ? null : lVar, (i & 16) != 0 ? null : mVar, (i & 32) != 0 ? null : eVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? dk8.b.a() : j3, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : m60Var, (i & 512) != 0 ? null : li8Var, (i & 1024) != 0 ? null : l74Var, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.g() : j4, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : ph8Var, (i & 8192) != 0 ? null : jo7Var, null);
    }
}
