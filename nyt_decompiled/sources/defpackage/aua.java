package defpackage;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aua extends xfa {
    protected aua() {
        this.a.add(zzbl.ASSIGN);
        this.a.add(zzbl.CONST);
        this.a.add(zzbl.CREATE_ARRAY);
        this.a.add(zzbl.CREATE_OBJECT);
        this.a.add(zzbl.EXPRESSION_LIST);
        this.a.add(zzbl.GET);
        this.a.add(zzbl.GET_INDEX);
        this.a.add(zzbl.GET_PROPERTY);
        this.a.add(zzbl.NULL);
        this.a.add(zzbl.SET_PROPERTY);
        this.a.add(zzbl.TYPEOF);
        this.a.add(zzbl.UNDEFINED);
        this.a.add(zzbl.VAR);
    }

    @Override // defpackage.xfa
    public final caa a(String str, xhe xheVar, List list) {
        String str2;
        zzbl zzblVar = zzbl.ADD;
        int ordinal = s0f.e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            s0f.h(zzbl.ASSIGN.name(), 2, list);
            caa b = xheVar.b((caa) list.get(0));
            if (!(b instanceof eda)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b.getClass().getCanonicalName()));
            }
            if (!xheVar.h(b.zzi())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b.zzi()));
            }
            caa b2 = xheVar.b((caa) list.get(1));
            xheVar.g(b.zzi(), b2);
            return b2;
        }
        if (ordinal == 14) {
            s0f.i(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i < list.size() - 1) {
                caa b3 = xheVar.b((caa) list.get(i));
                if (!(b3 instanceof eda)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b3.getClass().getCanonicalName()));
                }
                xheVar.f(b3.zzi(), xheVar.b((caa) list.get(i + 1)));
                i += 2;
            }
            return caa.T;
        }
        if (ordinal == 24) {
            s0f.i(zzbl.EXPRESSION_LIST.name(), 1, list);
            caa caaVar = caa.T;
            while (i < list.size()) {
                caaVar = xheVar.b((caa) list.get(i));
                if (caaVar instanceof d0a) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i++;
            }
            return caaVar;
        }
        if (ordinal == 33) {
            s0f.h(zzbl.GET.name(), 1, list);
            caa b4 = xheVar.b((caa) list.get(0));
            if (b4 instanceof eda) {
                return xheVar.d(b4.zzi());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b4.getClass().getCanonicalName()));
        }
        if (ordinal == 49) {
            s0f.h(zzbl.NULL.name(), 0, list);
            return caa.U;
        }
        if (ordinal == 58) {
            s0f.h(zzbl.SET_PROPERTY.name(), 3, list);
            caa b5 = xheVar.b((caa) list.get(0));
            caa b6 = xheVar.b((caa) list.get(1));
            caa b7 = xheVar.b((caa) list.get(2));
            if (b5 == caa.T || b5 == caa.U) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", b6.zzi(), b5.zzi()));
            }
            if ((b5 instanceof qx9) && (b6 instanceof q0a)) {
                ((qx9) b5).t(b6.zzh().intValue(), b7);
            } else if (b5 instanceof h5a) {
                ((h5a) b5).Y(b6.zzi(), b7);
            }
            return b7;
        }
        if (ordinal == 17) {
            if (list.isEmpty()) {
                return new qx9();
            }
            qx9 qx9Var = new qx9();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                caa b8 = xheVar.b((caa) it2.next());
                if (b8 instanceof d0a) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                qx9Var.t(i, b8);
                i++;
            }
            return qx9Var;
        }
        if (ordinal == 18) {
            if (list.isEmpty()) {
                return new m6a();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            m6a m6aVar = new m6a();
            while (i < list.size() - 1) {
                caa b9 = xheVar.b((caa) list.get(i));
                caa b10 = xheVar.b((caa) list.get(i + 1));
                if ((b9 instanceof d0a) || (b10 instanceof d0a)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                m6aVar.Y(b9.zzi(), b10);
                i += 2;
            }
            return m6aVar;
        }
        if (ordinal == 35 || ordinal == 36) {
            s0f.h(zzbl.GET_PROPERTY.name(), 2, list);
            caa b11 = xheVar.b((caa) list.get(0));
            caa b12 = xheVar.b((caa) list.get(1));
            if ((b11 instanceof qx9) && s0f.k(b12)) {
                return ((qx9) b11).f(b12.zzh().intValue());
            }
            if (b11 instanceof h5a) {
                return ((h5a) b11).n(b12.zzi());
            }
            if (b11 instanceof eda) {
                if ("length".equals(b12.zzi())) {
                    return new q0a(Double.valueOf(b11.zzi().length()));
                }
                if (s0f.k(b12) && b12.zzh().doubleValue() < b11.zzi().length()) {
                    return new eda(String.valueOf(b11.zzi().charAt(b12.zzh().intValue())));
                }
            }
            return caa.T;
        }
        switch (ordinal) {
            case 62:
                s0f.h(zzbl.TYPEOF.name(), 1, list);
                caa b13 = xheVar.b((caa) list.get(0));
                if (b13 instanceof qda) {
                    str2 = "undefined";
                } else if (b13 instanceof bz9) {
                    str2 = "boolean";
                } else if (b13 instanceof q0a) {
                    str2 = "number";
                } else if (b13 instanceof eda) {
                    str2 = "string";
                } else if (b13 instanceof a9a) {
                    str2 = "function";
                } else {
                    if ((b13 instanceof waa) || (b13 instanceof d0a)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b13));
                    }
                    str2 = "object";
                }
                return new eda(str2);
            case 63:
                s0f.h(zzbl.UNDEFINED.name(), 0, list);
                return caa.T;
            case 64:
                s0f.i(zzbl.VAR.name(), 1, list);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    caa b14 = xheVar.b((caa) it3.next());
                    if (!(b14 instanceof eda)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b14.getClass().getCanonicalName()));
                    }
                    xheVar.e(b14.zzi(), caa.T);
                }
                return caa.T;
            default:
                return super.b(str);
        }
    }
}
