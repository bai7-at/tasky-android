package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
final class yta extends gca {
    final /* synthetic */ byte[] r;
    final /* synthetic */ Map s;
    final /* synthetic */ egb t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    yta(yza yzaVar, int i, String str, cba cbaVar, bba bbaVar, byte[] bArr, Map map, egb egbVar) {
        super(i, str, cbaVar, bbaVar);
        this.r = bArr;
        this.s = map;
        this.t = egbVar;
    }

    @Override // defpackage.gca
    protected final void B(String str) {
        this.t.g(str);
        super.B(str);
    }

    @Override // defpackage.zaa
    public final Map l() {
        Map map = this.s;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // defpackage.zaa
    protected final /* bridge */ /* synthetic */ void p(Object obj) {
        B((String) obj);
    }

    @Override // defpackage.zaa
    public final byte[] z() {
        byte[] bArr = this.r;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
