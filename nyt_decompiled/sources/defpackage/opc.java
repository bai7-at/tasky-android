package defpackage;

import android.os.RemoteException;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.Map;

/* loaded from: classes3.dex */
public final class opc implements uxa {
    private final tua a;
    private final cqc b;
    private final l3f c;

    public opc(clc clcVar, rkc rkcVar, cqc cqcVar, l3f l3fVar) {
        this.a = clcVar.c(rkcVar.a());
        this.b = cqcVar;
        this.c = l3fVar;
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.a.E1((jua) this.c.zzb(), str);
        } catch (RemoteException e) {
            fgb.h("Failed to call onCustomClick for asset " + str + InstructionFileId.DOT, e);
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        this.b.i("/nativeAdCustomClick", this);
    }
}
