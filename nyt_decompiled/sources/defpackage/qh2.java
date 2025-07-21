package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class qh2 implements ic {
    public static final a Companion = new a(null);
    private final t a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public qh2(t tVar) {
        zq3.h(tVar, "abTestReporter");
        this.a = tVar;
    }

    @Override // defpackage.ic
    public void a(Bundle bundle) {
        zq3.h(bundle, "bundle");
        Map a2 = this.a.a();
        if (a2.isEmpty()) {
            return;
        }
        Collection values = a2.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!h.d0((String) obj)) {
                arrayList.add(obj);
            }
        }
        bundle.putString("variants", i.u0(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    @Override // defpackage.ic
    public void b(Map map) {
        zq3.h(map, "builder");
        Map a2 = this.a.a();
        if (a2.isEmpty()) {
            return;
        }
        Collection values = a2.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!h.d0((String) obj)) {
                arrayList.add(obj);
            }
        }
        map.put("variants", i.u0(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    @Override // defpackage.ic
    public boolean c(uc ucVar) {
        zq3.h(ucVar, "event");
        return true;
    }
}
