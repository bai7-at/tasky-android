package defpackage;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* loaded from: classes3.dex */
public final class uea extends xfa {
    public uea() {
        this.a.add(zzbl.BITWISE_AND);
        this.a.add(zzbl.BITWISE_LEFT_SHIFT);
        this.a.add(zzbl.BITWISE_NOT);
        this.a.add(zzbl.BITWISE_OR);
        this.a.add(zzbl.BITWISE_RIGHT_SHIFT);
        this.a.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(zzbl.BITWISE_XOR);
    }

    @Override // defpackage.xfa
    public final caa a(String str, xhe xheVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        switch (s0f.e(str).ordinal()) {
            case 4:
                s0f.h(zzbl.BITWISE_AND.name(), 2, list);
                return new q0a(Double.valueOf(s0f.b(xheVar.b((caa) list.get(0)).zzh().doubleValue()) & s0f.b(xheVar.b((caa) list.get(1)).zzh().doubleValue())));
            case 5:
                s0f.h(zzbl.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new q0a(Double.valueOf(s0f.b(xheVar.b((caa) list.get(0)).zzh().doubleValue()) << ((int) (s0f.d(xheVar.b((caa) list.get(1)).zzh().doubleValue()) & 31))));
            case 6:
                s0f.h(zzbl.BITWISE_NOT.name(), 1, list);
                return new q0a(Double.valueOf(~s0f.b(xheVar.b((caa) list.get(0)).zzh().doubleValue())));
            case 7:
                s0f.h(zzbl.BITWISE_OR.name(), 2, list);
                return new q0a(Double.valueOf(s0f.b(xheVar.b((caa) list.get(0)).zzh().doubleValue()) | s0f.b(xheVar.b((caa) list.get(1)).zzh().doubleValue())));
            case 8:
                s0f.h(zzbl.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new q0a(Double.valueOf(s0f.b(xheVar.b((caa) list.get(0)).zzh().doubleValue()) >> ((int) (s0f.d(xheVar.b((caa) list.get(1)).zzh().doubleValue()) & 31))));
            case 9:
                s0f.h(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new q0a(Double.valueOf(s0f.d(xheVar.b((caa) list.get(0)).zzh().doubleValue()) >>> ((int) (s0f.d(xheVar.b((caa) list.get(1)).zzh().doubleValue()) & 31))));
            case 10:
                s0f.h(zzbl.BITWISE_XOR.name(), 2, list);
                return new q0a(Double.valueOf(s0f.b(xheVar.b((caa) list.get(0)).zzh().doubleValue()) ^ s0f.b(xheVar.b((caa) list.get(1)).zzh().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
