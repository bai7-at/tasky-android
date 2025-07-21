package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public abstract class jp2 extends we2 {
    private final we2 e;

    public jp2(we2 we2Var) {
        zq3.h(we2Var, "delegate");
        this.e = we2Var;
    }

    @Override // defpackage.we2
    public yt7 b(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        return this.e.b(r(jp5Var, "appendingSink", TransferTable.COLUMN_FILE), z);
    }

    @Override // defpackage.we2
    public void c(jp5 jp5Var, jp5 jp5Var2) {
        zq3.h(jp5Var, "source");
        zq3.h(jp5Var2, "target");
        this.e.c(r(jp5Var, "atomicMove", "source"), r(jp5Var2, "atomicMove", "target"));
    }

    @Override // defpackage.we2
    public void g(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, "dir");
        this.e.g(r(jp5Var, "createDirectory", "dir"), z);
    }

    @Override // defpackage.we2
    public void i(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, "path");
        this.e.i(r(jp5Var, "delete", "path"), z);
    }

    @Override // defpackage.we2
    public List k(jp5 jp5Var) {
        zq3.h(jp5Var, "dir");
        List k = this.e.k(r(jp5Var, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = k.iterator();
        while (it2.hasNext()) {
            arrayList.add(s((jp5) it2.next(), "list"));
        }
        i.z(arrayList);
        return arrayList;
    }

    @Override // defpackage.we2
    public ne2 m(jp5 jp5Var) {
        ne2 a;
        zq3.h(jp5Var, "path");
        ne2 m = this.e.m(r(jp5Var, "metadataOrNull", "path"));
        if (m == null) {
            return null;
        }
        if (m.d() == null) {
            return m;
        }
        a = m.a((r18 & 1) != 0 ? m.a : false, (r18 & 2) != 0 ? m.b : false, (r18 & 4) != 0 ? m.c : s(m.d(), "metadataOrNull"), (r18 & 8) != 0 ? m.d : null, (r18 & 16) != 0 ? m.e : null, (r18 & 32) != 0 ? m.f : null, (r18 & 64) != 0 ? m.g : null, (r18 & 128) != 0 ? m.h : null);
        return a;
    }

    @Override // defpackage.we2
    public fe2 n(jp5 jp5Var) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        return this.e.n(r(jp5Var, "openReadOnly", TransferTable.COLUMN_FILE));
    }

    @Override // defpackage.we2
    public yt7 p(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        return this.e.p(r(jp5Var, "sink", TransferTable.COLUMN_FILE), z);
    }

    @Override // defpackage.we2
    public px7 q(jp5 jp5Var) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        return this.e.q(r(jp5Var, "source", TransferTable.COLUMN_FILE));
    }

    public jp5 r(jp5 jp5Var, String str, String str2) {
        zq3.h(jp5Var, "path");
        zq3.h(str, "functionName");
        zq3.h(str2, "parameterName");
        return jp5Var;
    }

    public jp5 s(jp5 jp5Var, String str) {
        zq3.h(jp5Var, "path");
        zq3.h(str, "functionName");
        return jp5Var;
    }

    public String toString() {
        return zt6.b(getClass()).d() + '(' + this.e + ')';
    }
}
