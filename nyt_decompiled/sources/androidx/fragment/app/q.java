package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.amazonaws.services.s3.internal.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class q {
    private final ArrayList a = new ArrayList();
    private final HashMap b = new HashMap();
    private final HashMap c = new HashMap();
    private n d;

    q() {
    }

    void A(n nVar) {
        this.d = nVar;
    }

    Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.c.put(str, bundle) : (Bundle) this.c.remove(str);
    }

    void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.b.get(str) != null;
    }

    void d(int i) {
        for (o oVar : this.b.values()) {
            if (oVar != null) {
                oVar.t(i);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (o oVar : this.b.values()) {
                printWriter.print(str);
                if (oVar != null) {
                    Fragment k = oVar.k();
                    printWriter.println(k);
                    k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(Constants.NULL_VERSION_ID);
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        o oVar = (o) this.b.get(str);
        if (oVar != null) {
            return oVar.k();
        }
        return null;
    }

    Fragment g(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (o oVar : this.b.values()) {
            if (oVar != null) {
                Fragment k = oVar.k();
                if (k.mFragmentId == i) {
                    return k;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (o oVar : this.b.values()) {
            if (oVar != null) {
                Fragment k = oVar.k();
                if (str.equals(k.mTag)) {
                    return k;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment findFragmentByWho;
        for (o oVar : this.b.values()) {
            if (oVar != null && (findFragmentByWho = oVar.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = (Fragment) this.a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (o oVar : this.b.values()) {
            if (oVar != null) {
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (o oVar : this.b.values()) {
            if (oVar != null) {
                arrayList.add(oVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    HashMap m() {
        return this.c;
    }

    o n(String str) {
        return (o) this.b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    n p() {
        return this.d;
    }

    Bundle q(String str) {
        return (Bundle) this.c.get(str);
    }

    void r(o oVar) {
        Fragment k = oVar.k();
        if (c(k.mWho)) {
            return;
        }
        this.b.put(k.mWho, oVar);
        if (k.mRetainInstanceChangedWhileDetached) {
            if (k.mRetainInstance) {
                this.d.e(k);
            } else {
                this.d.p(k);
            }
            k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k);
        }
    }

    void s(o oVar) {
        Fragment k = oVar.k();
        if (k.mRetainInstance) {
            this.d.p(k);
        }
        if (this.b.get(k.mWho) == oVar && ((o) this.b.put(k.mWho, null)) != null && FragmentManager.L0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    void t() {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            o oVar = (o) this.b.get(((Fragment) it2.next()).mWho);
            if (oVar != null) {
                oVar.m();
            }
        }
        for (o oVar2 : this.b.values()) {
            if (oVar2 != null) {
                oVar2.m();
                Fragment k = oVar2.k();
                if (k.mRemoving && !k.isInBackStack()) {
                    if (k.mBeingSaved && !this.c.containsKey(k.mWho)) {
                        B(k.mWho, oVar2.r());
                    }
                    s(oVar2);
                }
            }
        }
    }

    void u(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void v() {
        this.b.clear();
    }

    void w(List list) {
        this.a.clear();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                Fragment f = f(str);
                if (f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.L0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f);
                }
                a(f);
            }
        }
    }

    void x(HashMap hashMap) {
        this.c.clear();
        this.c.putAll(hashMap);
    }

    ArrayList y() {
        ArrayList arrayList = new ArrayList(this.b.size());
        for (o oVar : this.b.values()) {
            if (oVar != null) {
                Fragment k = oVar.k();
                B(k.mWho, oVar.r());
                arrayList.add(k.mWho);
                if (FragmentManager.L0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + k.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList z() {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.a.size());
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = (Fragment) it2.next();
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
