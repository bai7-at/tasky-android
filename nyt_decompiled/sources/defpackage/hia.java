package defpackage;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* loaded from: classes3.dex */
public final class hia extends xfa {
    public hia() {
        this.a.add(zzbl.EQUALS);
        this.a.add(zzbl.GREATER_THAN);
        this.a.add(zzbl.GREATER_THAN_EQUALS);
        this.a.add(zzbl.IDENTITY_EQUALS);
        this.a.add(zzbl.IDENTITY_NOT_EQUALS);
        this.a.add(zzbl.LESS_THAN);
        this.a.add(zzbl.LESS_THAN_EQUALS);
        this.a.add(zzbl.NOT_EQUALS);
    }

    private static boolean c(caa caaVar, caa caaVar2) {
        if (caaVar.getClass().equals(caaVar2.getClass())) {
            if ((caaVar instanceof qda) || (caaVar instanceof s7a)) {
                return true;
            }
            return caaVar instanceof q0a ? (Double.isNaN(caaVar.zzh().doubleValue()) || Double.isNaN(caaVar2.zzh().doubleValue()) || caaVar.zzh().doubleValue() != caaVar2.zzh().doubleValue()) ? false : true : caaVar instanceof eda ? caaVar.zzi().equals(caaVar2.zzi()) : caaVar instanceof bz9 ? caaVar.zzg().equals(caaVar2.zzg()) : caaVar == caaVar2;
        }
        if (((caaVar instanceof qda) || (caaVar instanceof s7a)) && ((caaVar2 instanceof qda) || (caaVar2 instanceof s7a))) {
            return true;
        }
        boolean z = caaVar instanceof q0a;
        if (z && (caaVar2 instanceof eda)) {
            return c(caaVar, new q0a(caaVar2.zzh()));
        }
        boolean z2 = caaVar instanceof eda;
        if ((!z2 || !(caaVar2 instanceof q0a)) && !(caaVar instanceof bz9)) {
            if (caaVar2 instanceof bz9) {
                return c(caaVar, new q0a(caaVar2.zzh()));
            }
            if ((z2 || z) && (caaVar2 instanceof h5a)) {
                return c(caaVar, new eda(caaVar2.zzi()));
            }
            if ((caaVar instanceof h5a) && ((caaVar2 instanceof eda) || (caaVar2 instanceof q0a))) {
                return c(new eda(caaVar.zzi()), caaVar2);
            }
            return false;
        }
        return c(new q0a(caaVar.zzh()), caaVar2);
    }

    private static boolean d(caa caaVar, caa caaVar2) {
        if (caaVar instanceof h5a) {
            caaVar = new eda(caaVar.zzi());
        }
        if (caaVar2 instanceof h5a) {
            caaVar2 = new eda(caaVar2.zzi());
        }
        if ((caaVar instanceof eda) && (caaVar2 instanceof eda)) {
            return caaVar.zzi().compareTo(caaVar2.zzi()) < 0;
        }
        double doubleValue = caaVar.zzh().doubleValue();
        double doubleValue2 = caaVar2.zzh().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(caa caaVar, caa caaVar2) {
        if (caaVar instanceof h5a) {
            caaVar = new eda(caaVar.zzi());
        }
        if (caaVar2 instanceof h5a) {
            caaVar2 = new eda(caaVar2.zzi());
        }
        return (((caaVar instanceof eda) && (caaVar2 instanceof eda)) || !(Double.isNaN(caaVar.zzh().doubleValue()) || Double.isNaN(caaVar2.zzh().doubleValue()))) && !d(caaVar2, caaVar);
    }

    @Override // defpackage.xfa
    public final caa a(String str, xhe xheVar, List list) {
        boolean c;
        boolean c2;
        s0f.h(s0f.e(str).name(), 2, list);
        caa b = xheVar.b((caa) list.get(0));
        caa b2 = xheVar.b((caa) list.get(1));
        int ordinal = s0f.e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c2 = c(b, b2);
            } else if (ordinal == 42) {
                c = d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        c = d(b2, b);
                        break;
                    case 38:
                        c = e(b2, b);
                        break;
                    case 39:
                        c = s0f.l(b, b2);
                        break;
                    case 40:
                        c2 = s0f.l(b, b2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                c = e(b, b2);
            }
            c = !c2;
        } else {
            c = c(b, b2);
        }
        return c ? caa.b0 : caa.c0;
    }
}
