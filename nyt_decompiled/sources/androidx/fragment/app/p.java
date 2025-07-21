package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class p extends androidx.viewpager.widget.a {
    private final FragmentManager c;
    private final int d;
    private r e;
    private ArrayList f;
    private ArrayList g;
    private Fragment h;
    private boolean i;

    public p(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.e == null) {
            this.e = this.c.p();
        }
        while (this.f.size() <= i) {
            this.f.add(null);
        }
        this.f.set(i, fragment.isAdded() ? this.c.u1(fragment) : null);
        this.g.set(i, null);
        this.e.p(fragment);
        if (fragment.equals(this.h)) {
            this.h = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup) {
        r rVar = this.e;
        if (rVar != null) {
            if (!this.i) {
                try {
                    this.i = true;
                    rVar.k();
                } finally {
                    this.i = false;
                }
            }
            this.e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object f(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.g.size() > i && (fragment = (Fragment) this.g.get(i)) != null) {
            return fragment;
        }
        if (this.e == null) {
            this.e = this.c.p();
        }
        Fragment m = m(i);
        if (this.f.size() > i && (savedState = (Fragment.SavedState) this.f.get(i)) != null) {
            m.setInitialSavedState(savedState);
        }
        while (this.g.size() <= i) {
            this.g.add(null);
        }
        m.setMenuVisibility(false);
        if (this.d == 0) {
            m.setUserVisibleHint(false);
        }
        this.g.set(i, m);
        this.e.b(viewGroup.getId(), m);
        if (this.d == 1) {
            this.e.u(m, Lifecycle.State.STARTED);
        }
        return m;
    }

    @Override // androidx.viewpager.widget.a
    public boolean g(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void h(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f.clear();
            this.g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(QueryKeys.VISIT_FREQUENCY)) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment u0 = this.c.u0(bundle, str);
                    if (u0 != null) {
                        while (this.g.size() <= parseInt) {
                            this.g.add(null);
                        }
                        u0.setMenuVisibility(false);
                        this.g.set(parseInt, u0);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable i() {
        Bundle bundle;
        if (this.f.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f.size()];
            this.f.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = (Fragment) this.g.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.c.l1(bundle, QueryKeys.VISIT_FREQUENCY + i, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void j(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.d == 1) {
                    if (this.e == null) {
                        this.e = this.c.p();
                    }
                    this.e.u(this.h, Lifecycle.State.STARTED);
                } else {
                    this.h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.d == 1) {
                if (this.e == null) {
                    this.e = this.c.p();
                }
                this.e.u(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.h = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void l(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment m(int i);

    public p(FragmentManager fragmentManager, int i) {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = null;
        this.c = fragmentManager;
        this.d = i;
    }
}
