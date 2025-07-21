package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class a extends r implements FragmentManager.l {
    final FragmentManager t;
    boolean u;
    int v;
    boolean w;

    a(FragmentManager fragmentManager) {
        super(fragmentManager.w0(), fragmentManager.y0() != null ? fragmentManager.y0().f().getClassLoader() : null);
        this.v = -1;
        this.w = false;
        this.t = fragmentManager;
    }

    void A() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            r.a aVar = (r.a) this.c.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.mBeingSaved = this.w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.h);
                fragment.setSharedElementNames(this.p, this.q);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(fragment, false);
                    this.t.j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.n1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.I0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(fragment, false);
                    this.t.B1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.x(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(fragment, false);
                    this.t.o(fragment);
                    break;
                case 8:
                    this.t.z1(fragment);
                    break;
                case 9:
                    this.t.z1(null);
                    break;
                case 10:
                    this.t.y1(fragment, aVar.i);
                    break;
            }
        }
    }

    void B() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            r.a aVar = (r.a) this.c.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.mBeingSaved = this.w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.s1(this.h));
                fragment.setSharedElementNames(this.q, this.p);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(fragment, true);
                    this.t.n1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.B1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(fragment, true);
                    this.t.I0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.o(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.w1(fragment, true);
                    this.t.x(fragment);
                    break;
                case 8:
                    this.t.z1(null);
                    break;
                case 9:
                    this.t.z1(fragment);
                    break;
                case 10:
                    this.t.y1(fragment, aVar.h);
                    break;
            }
        }
    }

    Fragment C(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.c.size()) {
            r.a aVar = (r.a) this.c.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.c.add(i, new r.a(9, fragment4, true));
                                    i++;
                                    fragment2 = null;
                                }
                                r.a aVar2 = new r.a(3, fragment4, true);
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                aVar2.e = aVar.e;
                                aVar2.g = aVar.g;
                                this.c.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.c.remove(i);
                        i--;
                    } else {
                        aVar.a = 1;
                        aVar.c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.b);
                    Fragment fragment5 = aVar.b;
                    if (fragment5 == fragment2) {
                        this.c.add(i, new r.a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.c.add(i, new r.a(9, fragment2, true));
                        aVar.c = true;
                        i++;
                        fragment2 = aVar.b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.b);
            i++;
        }
        return fragment2;
    }

    public String D() {
        return this.k;
    }

    public void E() {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                ((Runnable) this.s.get(i)).run();
            }
            this.s = null;
        }
    }

    Fragment F(ArrayList arrayList, Fragment fragment) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            r.a aVar = (r.a) this.c.get(size);
            int i = aVar.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.i = aVar.h;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.r
    public int h() {
        return x(false);
    }

    @Override // androidx.fragment.app.r
    public int i() {
        return x(true);
    }

    @Override // androidx.fragment.app.r
    public void j() {
        m();
        this.t.c0(this, false);
    }

    @Override // androidx.fragment.app.r
    public void k() {
        m();
        this.t.c0(this, true);
    }

    @Override // androidx.fragment.app.r
    void n(int i, Fragment fragment, String str, int i2) {
        super.n(i, fragment, str, i2);
        fragment.mFragmentManager = this.t;
    }

    @Override // androidx.fragment.app.r
    public boolean o() {
        return this.c.isEmpty();
    }

    @Override // androidx.fragment.app.r
    public r p(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.p(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.r
    public r u(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.t);
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            return super.u(fragment, state);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    void w(int i) {
        if (this.i) {
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                r.a aVar = (r.a) this.c.get(i2);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    int x(boolean z) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new w("FragmentManager"));
            y("  ", printWriter);
            printWriter.close();
        }
        this.u = true;
        if (this.i) {
            this.v = this.t.m();
        } else {
            this.v = -1;
        }
        this.t.Z(this, z);
        return this.v;
    }

    public void y(String str, PrintWriter printWriter) {
        z(str, printWriter, true);
    }

    public void z(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (this.c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            r.a aVar = (r.a) this.c.get(i);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.d != 0 || aVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.e));
                }
                if (aVar.f != 0 || aVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.g));
                }
            }
        }
    }
}
