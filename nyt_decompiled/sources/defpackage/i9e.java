package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i9e implements g9e {
    private final g9e a;

    public i9e(g9e g9eVar) {
        this.a = g9eVar;
    }

    @Override // defpackage.g9e
    public final void a(View view, JSONObject jSONObject, f9e f9eVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        v8e a = v8e.a();
        if (a != null) {
            Collection b = a.b();
            int size = b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it2 = b.iterator();
            while (it2.hasNext()) {
                View f = ((n8e) it2.next()).f();
                if (f != null && f.isAttachedToWindow() && f.isShown()) {
                    View view2 = f;
                    while (true) {
                        if (view2 == null) {
                            View rootView = f.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z3) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            f9eVar.a((View) arrayList.get(i2), this.a, jSONObject, z2);
        }
    }

    @Override // defpackage.g9e
    public final JSONObject zza(View view) {
        JSONObject a = q9e.a(0, 0, 0, 0);
        int b = t9e.b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        }
        try {
            a.put("noOutputDevice", i == 0);
        } catch (JSONException e) {
            r9e.a("Error with setting output device status", e);
        }
        return a;
    }
}
