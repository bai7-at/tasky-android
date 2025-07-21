package defpackage;

import com.nytimes.android.features.settings.legal.Artifact;
import com.nytimes.android.features.settings.legal.License;
import com.nytimes.android.features.settings.legal.UnknownLicense;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class o34 {
    private final at3 a;

    public o34(at3 at3Var) {
        zq3.h(at3Var, "json");
        this.a = at3Var;
    }

    private final Triple a(Artifact artifact) {
        if (artifact.c() != null) {
            License license = (License) d.a0(artifact.c());
            return new Triple(license.b(), license.a(), license.c());
        }
        if (artifact.e() == null) {
            return new Triple("", "", "");
        }
        UnknownLicense unknownLicense = (UnknownLicense) d.a0(artifact.e());
        return new Triple(unknownLicense.a(), unknownLicense.a(), unknownLicense.b());
    }

    private final Map b(List list) {
        List<Artifact> list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        for (Artifact artifact : list2) {
            Triple a = a(artifact);
            arrayList.add(new gw8(artifact.d(), artifact.b(), artifact.f(), (String) a.e(), (String) a.d(), (String) a.f()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (d((gw8) obj)) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList2) {
            String a2 = ((gw8) obj2).a();
            Object obj3 = linkedHashMap.get(a2);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(a2, obj3);
            }
            ((List) obj3).add(obj2);
        }
        return linkedHashMap;
    }

    private final boolean d(gw8 gw8Var) {
        return (h.d0(gw8Var.b()) || h.d0(gw8Var.c()) || h.d0(gw8Var.d())) ? false : true;
    }

    public final Map c(String str) {
        zq3.h(str, "jsonData");
        at3 at3Var = this.a;
        at3Var.a();
        List list = (List) at3Var.c(new qo(Artifact.Companion.serializer()), str);
        return list.isEmpty() ? t.i() : b(list);
    }
}
