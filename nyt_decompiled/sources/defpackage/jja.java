package defpackage;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class jja extends xfa {
    protected jja() {
        this.a.add(zzbl.APPLY);
        this.a.add(zzbl.BLOCK);
        this.a.add(zzbl.BREAK);
        this.a.add(zzbl.CASE);
        this.a.add(zzbl.DEFAULT);
        this.a.add(zzbl.CONTINUE);
        this.a.add(zzbl.DEFINE_FUNCTION);
        this.a.add(zzbl.FN);
        this.a.add(zzbl.IF);
        this.a.add(zzbl.QUOTE);
        this.a.add(zzbl.RETURN);
        this.a.add(zzbl.SWITCH);
        this.a.add(zzbl.TERNARY);
    }

    private static caa c(xhe xheVar, List list) {
        s0f.i(zzbl.FN.name(), 2, list);
        caa b = xheVar.b((caa) list.get(0));
        caa b2 = xheVar.b((caa) list.get(1));
        if (!(b2 instanceof qx9)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b2.getClass().getCanonicalName()));
        }
        List k = ((qx9) b2).k();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new a9a(b.zzi(), k, arrayList, xheVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        if (r7.equals("continue") == false) goto L64;
     */
    @Override // defpackage.xfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.caa a(java.lang.String r8, defpackage.xhe r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jja.a(java.lang.String, xhe, java.util.List):caa");
    }
}
