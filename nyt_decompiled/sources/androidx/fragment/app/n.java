package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class n extends androidx.lifecycle.q {
    private static final t.b h = new a();
    private final boolean d;
    private final HashMap a = new HashMap();
    private final HashMap b = new HashMap();
    private final HashMap c = new HashMap();
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;

    class a implements t.b {
        a() {
        }

        @Override // androidx.lifecycle.t.b
        public androidx.lifecycle.q a(Class cls) {
            return new n(true);
        }
    }

    n(boolean z) {
        this.d = z;
    }

    private void i(String str, boolean z) {
        n nVar = (n) this.b.get(str);
        if (nVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(nVar.b.keySet());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    nVar.g((String) it2.next(), true);
                }
            }
            nVar.onCleared();
            this.b.remove(str);
        }
        androidx.lifecycle.u uVar = (androidx.lifecycle.u) this.c.get(str);
        if (uVar != null) {
            uVar.a();
            this.c.remove(str);
        }
    }

    static n l(androidx.lifecycle.u uVar) {
        return (n) new androidx.lifecycle.t(uVar, h).a(n.class);
    }

    void e(Fragment fragment) {
        if (this.g) {
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.a.containsKey(fragment.mWho)) {
                return;
            }
            this.a.put(fragment.mWho, fragment);
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.a.equals(nVar.a) && this.b.equals(nVar.b) && this.c.equals(nVar.c);
    }

    void f(Fragment fragment, boolean z) {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        i(fragment.mWho, z);
    }

    void g(String str, boolean z) {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str, z);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    Fragment j(String str) {
        return (Fragment) this.a.get(str);
    }

    n k(Fragment fragment) {
        n nVar = (n) this.b.get(fragment.mWho);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this.d);
        this.b.put(fragment.mWho, nVar2);
        return nVar2;
    }

    Collection m() {
        return new ArrayList(this.a.values());
    }

    androidx.lifecycle.u n(Fragment fragment) {
        androidx.lifecycle.u uVar = (androidx.lifecycle.u) this.c.get(fragment.mWho);
        if (uVar != null) {
            return uVar;
        }
        androidx.lifecycle.u uVar2 = new androidx.lifecycle.u();
        this.c.put(fragment.mWho, uVar2);
        return uVar2;
    }

    boolean o() {
        return this.e;
    }

    @Override // androidx.lifecycle.q
    protected void onCleared() {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.e = true;
    }

    void p(Fragment fragment) {
        if (this.g) {
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.a.remove(fragment.mWho) == null || !FragmentManager.L0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void q(boolean z) {
        this.g = z;
    }

    boolean r(Fragment fragment) {
        if (this.a.containsKey(fragment.mWho)) {
            return this.d ? this.e : !this.f;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it3 = this.b.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it4 = this.c.keySet().iterator();
        while (it4.hasNext()) {
            sb.append((String) it4.next());
            if (it4.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
