package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.o;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k {
    public final List a(List list, o oVar, int i) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            d dVar = (d) obj;
            if (zq3.c(dVar.a(), oVar) && l.f(dVar.c(), i)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj2 = list.get(i4);
            if (l.f(((d) obj2).c(), i)) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            list = arrayList3;
        }
        List list2 = list;
        o.a aVar = o.b;
        o oVar2 = null;
        if (oVar.compareTo(aVar.i()) < 0) {
            int size3 = list2.size();
            o oVar3 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    break;
                }
                o a = ((d) list2.get(i5)).a();
                if (a.compareTo(oVar) >= 0) {
                    if (a.compareTo(oVar) <= 0) {
                        oVar3 = a;
                        oVar2 = oVar3;
                        break;
                    }
                    if (oVar3 == null || a.compareTo(oVar3) < 0) {
                        oVar3 = a;
                    }
                } else if (oVar2 == null || a.compareTo(oVar2) > 0) {
                    oVar2 = a;
                }
                i5++;
            }
            if (oVar2 != null) {
                oVar3 = oVar2;
            }
            arrayList = new ArrayList(list2.size());
            int size4 = list2.size();
            while (i2 < size4) {
                Object obj3 = list2.get(i2);
                if (zq3.c(((d) obj3).a(), oVar3)) {
                    arrayList.add(obj3);
                }
                i2++;
            }
        } else if (oVar.compareTo(aVar.j()) > 0) {
            int size5 = list2.size();
            o oVar4 = null;
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    break;
                }
                o a2 = ((d) list2.get(i6)).a();
                if (a2.compareTo(oVar) >= 0) {
                    if (a2.compareTo(oVar) <= 0) {
                        oVar4 = a2;
                        oVar2 = oVar4;
                        break;
                    }
                    if (oVar4 == null || a2.compareTo(oVar4) < 0) {
                        oVar4 = a2;
                    }
                } else if (oVar2 == null || a2.compareTo(oVar2) > 0) {
                    oVar2 = a2;
                }
                i6++;
            }
            if (oVar4 == null) {
                oVar4 = oVar2;
            }
            arrayList = new ArrayList(list2.size());
            int size6 = list2.size();
            while (i2 < size6) {
                Object obj4 = list2.get(i2);
                if (zq3.c(((d) obj4).a(), oVar4)) {
                    arrayList.add(obj4);
                }
                i2++;
            }
        } else {
            o j = aVar.j();
            int size7 = list2.size();
            o oVar5 = null;
            o oVar6 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size7) {
                    break;
                }
                o a3 = ((d) list2.get(i7)).a();
                if (j == null || a3.compareTo(j) <= 0) {
                    if (a3.compareTo(oVar) >= 0) {
                        if (a3.compareTo(oVar) <= 0) {
                            oVar5 = a3;
                            oVar6 = oVar5;
                            break;
                        }
                        if (oVar6 == null || a3.compareTo(oVar6) < 0) {
                            oVar6 = a3;
                        }
                    } else if (oVar5 == null || a3.compareTo(oVar5) > 0) {
                        oVar5 = a3;
                    }
                }
                i7++;
            }
            if (oVar6 != null) {
                oVar5 = oVar6;
            }
            arrayList = new ArrayList(list2.size());
            int size8 = list2.size();
            for (int i8 = 0; i8 < size8; i8++) {
                Object obj5 = list2.get(i8);
                if (zq3.c(((d) obj5).a(), oVar5)) {
                    arrayList.add(obj5);
                }
            }
            if (arrayList.isEmpty()) {
                o j2 = o.b.j();
                int size9 = list2.size();
                o oVar7 = null;
                int i9 = 0;
                while (true) {
                    if (i9 >= size9) {
                        break;
                    }
                    o a4 = ((d) list2.get(i9)).a();
                    if (j2 == null || a4.compareTo(j2) >= 0) {
                        if (a4.compareTo(oVar) >= 0) {
                            if (a4.compareTo(oVar) <= 0) {
                                oVar2 = a4;
                                oVar7 = oVar2;
                                break;
                            }
                            if (oVar7 == null || a4.compareTo(oVar7) < 0) {
                                oVar7 = a4;
                            }
                        } else if (oVar2 == null || a4.compareTo(oVar2) > 0) {
                            oVar2 = a4;
                        }
                    }
                    i9++;
                }
                if (oVar7 != null) {
                    oVar2 = oVar7;
                }
                arrayList = new ArrayList(list2.size());
                int size10 = list2.size();
                while (i2 < size10) {
                    Object obj6 = list2.get(i2);
                    if (zq3.c(((d) obj6).a(), oVar2)) {
                        arrayList.add(obj6);
                    }
                    i2++;
                }
            }
        }
        return arrayList;
    }
}
