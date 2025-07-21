package defpackage;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* loaded from: classes3.dex */
public final class qna extends xfa {
    protected qna() {
        this.a.add(zzbl.AND);
        this.a.add(zzbl.NOT);
        this.a.add(zzbl.OR);
    }

    @Override // defpackage.xfa
    public final caa a(String str, xhe xheVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = s0f.e(str).ordinal();
        if (ordinal == 1) {
            s0f.h(zzbl.AND.name(), 2, list);
            caa b = xheVar.b((caa) list.get(0));
            return !b.zzg().booleanValue() ? b : xheVar.b((caa) list.get(1));
        }
        if (ordinal == 47) {
            s0f.h(zzbl.NOT.name(), 1, list);
            return new bz9(Boolean.valueOf(!xheVar.b((caa) list.get(0)).zzg().booleanValue()));
        }
        if (ordinal != 50) {
            return super.b(str);
        }
        s0f.h(zzbl.OR.name(), 2, list);
        caa b2 = xheVar.b((caa) list.get(0));
        return b2.zzg().booleanValue() ? b2 : xheVar.b((caa) list.get(1));
    }
}
