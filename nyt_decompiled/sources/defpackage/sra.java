package defpackage;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* loaded from: classes3.dex */
public final class sra extends xfa {
    protected sra() {
        this.a.add(zzbl.ADD);
        this.a.add(zzbl.DIVIDE);
        this.a.add(zzbl.MODULUS);
        this.a.add(zzbl.MULTIPLY);
        this.a.add(zzbl.NEGATE);
        this.a.add(zzbl.POST_DECREMENT);
        this.a.add(zzbl.POST_INCREMENT);
        this.a.add(zzbl.PRE_DECREMENT);
        this.a.add(zzbl.PRE_INCREMENT);
        this.a.add(zzbl.SUBTRACT);
    }

    @Override // defpackage.xfa
    public final caa a(String str, xhe xheVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = s0f.e(str).ordinal();
        if (ordinal == 0) {
            s0f.h(zzbl.ADD.name(), 2, list);
            caa b = xheVar.b((caa) list.get(0));
            caa b2 = xheVar.b((caa) list.get(1));
            return ((b instanceof h5a) || (b instanceof eda) || (b2 instanceof h5a) || (b2 instanceof eda)) ? new eda(String.valueOf(b.zzi()).concat(String.valueOf(b2.zzi()))) : new q0a(Double.valueOf(b.zzh().doubleValue() + b2.zzh().doubleValue()));
        }
        if (ordinal == 21) {
            s0f.h(zzbl.DIVIDE.name(), 2, list);
            return new q0a(Double.valueOf(xheVar.b((caa) list.get(0)).zzh().doubleValue() / xheVar.b((caa) list.get(1)).zzh().doubleValue()));
        }
        if (ordinal == 59) {
            s0f.h(zzbl.SUBTRACT.name(), 2, list);
            return new q0a(Double.valueOf(xheVar.b((caa) list.get(0)).zzh().doubleValue() + new q0a(Double.valueOf(-xheVar.b((caa) list.get(1)).zzh().doubleValue())).zzh().doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            s0f.h(str, 2, list);
            caa b3 = xheVar.b((caa) list.get(0));
            xheVar.b((caa) list.get(1));
            return b3;
        }
        if (ordinal == 55 || ordinal == 56) {
            s0f.h(str, 1, list);
            return xheVar.b((caa) list.get(0));
        }
        switch (ordinal) {
            case 44:
                s0f.h(zzbl.MODULUS.name(), 2, list);
                return new q0a(Double.valueOf(xheVar.b((caa) list.get(0)).zzh().doubleValue() % xheVar.b((caa) list.get(1)).zzh().doubleValue()));
            case 45:
                s0f.h(zzbl.MULTIPLY.name(), 2, list);
                return new q0a(Double.valueOf(xheVar.b((caa) list.get(0)).zzh().doubleValue() * xheVar.b((caa) list.get(1)).zzh().doubleValue()));
            case 46:
                s0f.h(zzbl.NEGATE.name(), 1, list);
                return new q0a(Double.valueOf(-xheVar.b((caa) list.get(0)).zzh().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
