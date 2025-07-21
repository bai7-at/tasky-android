package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetSection;
import com.nytimes.android.api.cms.Column;
import com.nytimes.android.api.cms.DfpAssetMetaData;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import type.Sensitivity;

/* loaded from: classes4.dex */
public abstract class dp5 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Sensitivity.values().length];
            try {
                iArr[Sensitivity.TRAGEDY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public static final boolean a(Sensitivity sensitivity) {
        return sensitivity == Sensitivity.SHOW_ADS;
    }

    public static final String b(Sensitivity sensitivity) {
        zq3.h(sensitivity, "<this>");
        if (a.a[sensitivity.ordinal()] == 1) {
            return AssetConstants.TRAGEDY;
        }
        return null;
    }

    public static final Column c(uo0 uo0Var) {
        zq3.h(uo0Var, "<this>");
        return new Column(uo0Var.a(), uo0Var.b(), uo0Var.c());
    }

    public static final AssetSection d(qt qtVar) {
        zq3.h(qtVar, "<this>");
        return new AssetSection(qtVar.a(), qtVar.b(), qtVar.c());
    }

    public static final DfpAssetMetaData e(List list) {
        zq3.h(list, "<this>");
        List<kg8> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(list2, 10)), 16));
        for (kg8 kg8Var : list2) {
            Pair a2 = du8.a(kg8Var.a(), kg8Var.b());
            linkedHashMap.put(a2.c(), a2.d());
        }
        return new DfpAssetMetaData((String) linkedHashMap.get("des"), (String) linkedHashMap.get("org"), (String) linkedHashMap.get("ttl"), (String) linkedHashMap.get("per"), (String) linkedHashMap.get("id"), (String) linkedHashMap.get("typ"), (String) linkedHashMap.get("spon"), (String) linkedHashMap.get("geo"), (String) linkedHashMap.get("col"), (String) linkedHashMap.get("ser"));
    }
}
