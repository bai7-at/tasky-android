package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class apa {
    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final List c = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            String str = (String) pla.c().a((zoa) it2.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(qpa.a());
        return arrayList;
    }

    public final List b() {
        List a = a();
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            String str = (String) pla.c().a((zoa) it2.next());
            if (!TextUtils.isEmpty(str)) {
                a.add(str);
            }
        }
        a.addAll(qpa.b());
        return a;
    }

    public final void c(zoa zoaVar) {
        this.b.add(zoaVar);
    }

    public final void d(zoa zoaVar) {
        this.a.add(zoaVar);
    }

    public final void e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zoa zoaVar : this.a) {
            if (zoaVar.e() == 1) {
                zoaVar.d(editor, zoaVar.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            fgb.d("Flag Json is null.");
        }
    }
}
