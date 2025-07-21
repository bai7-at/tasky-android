package androidx.navigation;

import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import defpackage.r25;
import defpackage.zq3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c extends q implements r25 {
    public static final b b = new b(null);
    private static final t.b c = new a();
    private final Map a = new LinkedHashMap();

    public static final class a implements t.b {
        a() {
        }

        @Override // androidx.lifecycle.t.b
        public q a(Class cls) {
            zq3.h(cls, "modelClass");
            return new c();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(u uVar) {
            zq3.h(uVar, "viewModelStore");
            return (c) new t(uVar, c.c, null, 4, null).a(c.class);
        }

        private b() {
        }
    }

    @Override // defpackage.r25
    public u b(String str) {
        zq3.h(str, "backStackEntryId");
        u uVar = (u) this.a.get(str);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        this.a.put(str, uVar2);
        return uVar2;
    }

    public final void f(String str) {
        zq3.h(str, "backStackEntryId");
        u uVar = (u) this.a.remove(str);
        if (uVar != null) {
            uVar.a();
        }
    }

    @Override // androidx.lifecycle.q
    protected void onCleared() {
        Iterator it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            ((u) it2.next()).a();
        }
        this.a.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it2 = this.a.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "sb.toString()");
        return sb2;
    }
}
