package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tcf extends m6a {
    private final vs9 b;

    public tcf(vs9 vs9Var) {
        this.b = vs9Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.m6a, defpackage.caa
    public final caa a(String str, xhe xheVar, List list) {
        char c;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            s0f.h("getEventName", 0, list);
            return new eda(this.b.b().d());
        }
        if (c == 1) {
            s0f.h("getParamValue", 1, list);
            return k6f.b(this.b.b().c(xheVar.b((caa) list.get(0)).zzi()));
        }
        if (c == 2) {
            s0f.h("getParams", 0, list);
            Map e = this.b.b().e();
            m6a m6aVar = new m6a();
            for (String str2 : e.keySet()) {
                m6aVar.Y(str2, k6f.b(e.get(str2)));
            }
            return m6aVar;
        }
        if (c == 3) {
            s0f.h("getTimestamp", 0, list);
            return new q0a(Double.valueOf(this.b.b().a()));
        }
        if (c != 4) {
            if (c != 5) {
                return super.a(str, xheVar, list);
            }
            s0f.h("setParamValue", 2, list);
            String zzi = xheVar.b((caa) list.get(0)).zzi();
            caa b = xheVar.b((caa) list.get(1));
            this.b.b().g(zzi, s0f.f(b));
            return b;
        }
        s0f.h("setEventName", 1, list);
        caa b2 = xheVar.b((caa) list.get(0));
        if (caa.T.equals(b2) || caa.U.equals(b2)) {
            throw new IllegalArgumentException("Illegal event name");
        }
        this.b.b().f(b2.zzi());
        return new eda(b2.zzi());
    }
}
