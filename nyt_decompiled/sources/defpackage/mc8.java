package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.e;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class mc8 extends Fragment {
    private final n4 a;
    private final oy6 b;
    private final Set c;
    private mc8 d;
    private e e;
    private Fragment f;

    private class a implements oy6 {
        a() {
        }

        @Override // defpackage.oy6
        public Set a() {
            Set<mc8> c1 = mc8.this.c1();
            HashSet hashSet = new HashSet(c1.size());
            for (mc8 mc8Var : c1) {
                if (mc8Var.f1() != null) {
                    hashSet.add(mc8Var.f1());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + mc8.this + "}";
        }
    }

    public mc8() {
        this(new n4());
    }

    private void b1(mc8 mc8Var) {
        this.c.add(mc8Var);
    }

    private Fragment e1() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f;
    }

    private static FragmentManager h1(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private boolean i1(Fragment fragment) {
        Fragment e1 = e1();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(e1)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void j1(Context context, FragmentManager fragmentManager) {
        n1();
        mc8 k = com.bumptech.glide.a.c(context).k().k(context, fragmentManager);
        this.d = k;
        if (equals(k)) {
            return;
        }
        this.d.b1(this);
    }

    private void k1(mc8 mc8Var) {
        this.c.remove(mc8Var);
    }

    private void n1() {
        mc8 mc8Var = this.d;
        if (mc8Var != null) {
            mc8Var.k1(this);
            this.d = null;
        }
    }

    Set c1() {
        mc8 mc8Var = this.d;
        if (mc8Var == null) {
            return Collections.emptySet();
        }
        if (equals(mc8Var)) {
            return Collections.unmodifiableSet(this.c);
        }
        HashSet hashSet = new HashSet();
        for (mc8 mc8Var2 : this.d.c1()) {
            if (i1(mc8Var2.e1())) {
                hashSet.add(mc8Var2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    n4 d1() {
        return this.a;
    }

    public e f1() {
        return this.e;
    }

    public oy6 g1() {
        return this.b;
    }

    void l1(Fragment fragment) {
        FragmentManager h1;
        this.f = fragment;
        if (fragment == null || fragment.getContext() == null || (h1 = h1(fragment)) == null) {
            return;
        }
        j1(fragment.getContext(), h1);
    }

    public void m1(e eVar) {
        this.e = eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager h1 = h1(this);
        if (h1 == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                j1(getContext(), h1);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.c();
        n1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f = null;
        n1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.a.e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + e1() + "}";
    }

    public mc8(n4 n4Var) {
        this.b = new a();
        this.c = new HashSet();
        this.a = n4Var;
    }
}
