package defpackage;

import androidx.paging.d;
import androidx.paging.e;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class dp0 {
    private final d a;
    private final d b;
    private final d c;
    private final e d;
    private final e e;
    private final boolean f;
    private final boolean g;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if ((r6 != null ? r6.g() : false) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dp0(androidx.paging.d r2, androidx.paging.d r3, androidx.paging.d r4, androidx.paging.e r5, androidx.paging.e r6) {
        /*
            r1 = this;
            java.lang.String r0 = "refresh"
            defpackage.zq3.h(r2, r0)
            java.lang.String r0 = "prepend"
            defpackage.zq3.h(r3, r0)
            java.lang.String r0 = "append"
            defpackage.zq3.h(r4, r0)
            java.lang.String r0 = "source"
            defpackage.zq3.h(r5, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            boolean r2 = r5.h()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r6 == 0) goto L30
            boolean r2 = r6.h()
            goto L31
        L30:
            r2 = r4
        L31:
            if (r2 == 0) goto L35
            r2 = r4
            goto L36
        L35:
            r2 = r3
        L36:
            r1.f = r2
            boolean r2 = r5.g()
            if (r2 != 0) goto L48
            if (r6 == 0) goto L45
            boolean r2 = r6.g()
            goto L46
        L45:
            r2 = r3
        L46:
            if (r2 == 0) goto L49
        L48:
            r3 = r4
        L49:
            r1.g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp0.<init>(androidx.paging.d, androidx.paging.d, androidx.paging.d, androidx.paging.e, androidx.paging.e):void");
    }

    public final d a() {
        return this.c;
    }

    public final e b() {
        return this.e;
    }

    public final d c() {
        return this.b;
    }

    public final d d() {
        return this.a;
    }

    public final e e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dp0.class != obj.getClass()) {
            return false;
        }
        dp0 dp0Var = (dp0) obj;
        return zq3.c(this.a, dp0Var.a) && zq3.c(this.b, dp0Var.b) && zq3.c(this.c, dp0Var.c) && zq3.c(this.d, dp0Var.d) && zq3.c(this.e, dp0Var.e);
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        e eVar = this.e;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }

    public /* synthetic */ dp0(d dVar, d dVar2, d dVar3, e eVar, e eVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, dVar2, dVar3, eVar, (i & 16) != 0 ? null : eVar2);
    }
}
