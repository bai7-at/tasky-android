package defpackage;

import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.gms.internal.measurement.zzbl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class mqa extends xfa {
    protected mqa() {
        this.a.add(zzbl.FOR_IN);
        this.a.add(zzbl.FOR_IN_CONST);
        this.a.add(zzbl.FOR_IN_LET);
        this.a.add(zzbl.FOR_LET);
        this.a.add(zzbl.FOR_OF);
        this.a.add(zzbl.FOR_OF_CONST);
        this.a.add(zzbl.FOR_OF_LET);
        this.a.add(zzbl.WHILE);
    }

    private static caa c(noa noaVar, Iterator it2, caa caaVar) {
        if (it2 != null) {
            while (it2.hasNext()) {
                caa c = noaVar.a((caa) it2.next()).c((qx9) caaVar);
                if (c instanceof d0a) {
                    d0a d0aVar = (d0a) c;
                    if ("break".equals(d0aVar.c())) {
                        return caa.T;
                    }
                    if ("return".equals(d0aVar.c())) {
                        return d0aVar;
                    }
                }
            }
        }
        return caa.T;
    }

    private static caa d(noa noaVar, caa caaVar, caa caaVar2) {
        return c(noaVar, caaVar.zzl(), caaVar2);
    }

    private static caa e(noa noaVar, caa caaVar, caa caaVar2) {
        if (caaVar instanceof Iterable) {
            return c(noaVar, ((Iterable) caaVar).iterator(), caaVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // defpackage.xfa
    public final caa a(String str, xhe xheVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = s0f.e(str).ordinal();
        if (ordinal == 65) {
            s0f.h(zzbl.WHILE.name(), 4, list);
            caa caaVar = (caa) list.get(0);
            caa caaVar2 = (caa) list.get(1);
            caa caaVar3 = (caa) list.get(2);
            caa b = xheVar.b((caa) list.get(3));
            if (xheVar.b(caaVar3).zzg().booleanValue()) {
                caa c = xheVar.c((qx9) b);
                if (c instanceof d0a) {
                    d0a d0aVar = (d0a) c;
                    if ("break".equals(d0aVar.c())) {
                        return caa.T;
                    }
                    if ("return".equals(d0aVar.c())) {
                        return d0aVar;
                    }
                }
            }
            while (xheVar.b(caaVar).zzg().booleanValue()) {
                caa c2 = xheVar.c((qx9) b);
                if (c2 instanceof d0a) {
                    d0a d0aVar2 = (d0a) c2;
                    if ("break".equals(d0aVar2.c())) {
                        return caa.T;
                    }
                    if ("return".equals(d0aVar2.c())) {
                        return d0aVar2;
                    }
                }
                xheVar.b(caaVar2);
            }
            return caa.T;
        }
        switch (ordinal) {
            case EventType.CDN /* 26 */:
                s0f.h(zzbl.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof eda)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return d(new hpa(xheVar, ((caa) list.get(0)).zzi()), xheVar.b((caa) list.get(1)), xheVar.b((caa) list.get(2)));
            case 27:
                s0f.h(zzbl.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof eda)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return d(new wna(xheVar, ((caa) list.get(0)).zzi()), xheVar.b((caa) list.get(1)), xheVar.b((caa) list.get(2)));
            case 28:
                s0f.h(zzbl.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof eda)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return d(new ioa(xheVar, ((caa) list.get(0)).zzi()), xheVar.b((caa) list.get(1)), xheVar.b((caa) list.get(2)));
            case BuildConfig.VERSION_CODE /* 29 */:
                s0f.h(zzbl.FOR_LET.name(), 4, list);
                caa b2 = xheVar.b((caa) list.get(0));
                if (!(b2 instanceof qx9)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                qx9 qx9Var = (qx9) b2;
                caa caaVar4 = (caa) list.get(1);
                caa caaVar5 = (caa) list.get(2);
                caa b3 = xheVar.b((caa) list.get(3));
                xhe a = xheVar.a();
                for (int i = 0; i < qx9Var.e(); i++) {
                    String zzi = qx9Var.f(i).zzi();
                    a.g(zzi, xheVar.d(zzi));
                }
                while (xheVar.b(caaVar4).zzg().booleanValue()) {
                    caa c3 = xheVar.c((qx9) b3);
                    if (c3 instanceof d0a) {
                        d0a d0aVar3 = (d0a) c3;
                        if ("break".equals(d0aVar3.c())) {
                            return caa.T;
                        }
                        if ("return".equals(d0aVar3.c())) {
                            return d0aVar3;
                        }
                    }
                    xhe a2 = xheVar.a();
                    for (int i2 = 0; i2 < qx9Var.e(); i2++) {
                        String zzi2 = qx9Var.f(i2).zzi();
                        a2.g(zzi2, a.d(zzi2));
                    }
                    a2.b(caaVar5);
                    a = a2;
                }
                return caa.T;
            case 30:
                s0f.h(zzbl.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof eda)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return e(new hpa(xheVar, ((caa) list.get(0)).zzi()), xheVar.b((caa) list.get(1)), xheVar.b((caa) list.get(2)));
            case 31:
                s0f.h(zzbl.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof eda)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return e(new wna(xheVar, ((caa) list.get(0)).zzi()), xheVar.b((caa) list.get(1)), xheVar.b((caa) list.get(2)));
            case 32:
                s0f.h(zzbl.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof eda)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return e(new ioa(xheVar, ((caa) list.get(0)).zzi()), xheVar.b((caa) list.get(1)), xheVar.b((caa) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
