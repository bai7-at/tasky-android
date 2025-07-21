package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
abstract class c6a {
    public static d6a a(d6a d6aVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (d6aVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (d6a) map.get(strArr[0]);
            }
            if (length2 > 1) {
                d6a d6aVar2 = new d6a();
                while (i < length2) {
                    d6aVar2.v((d6a) map.get(strArr[i]));
                    i++;
                }
                return d6aVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                d6aVar.v((d6a) map.get(strArr[0]));
                return d6aVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    d6aVar.v((d6a) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return d6aVar;
    }
}
