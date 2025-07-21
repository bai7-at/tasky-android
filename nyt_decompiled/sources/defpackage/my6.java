package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.e;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class my6 extends Fragment {
    private final n4 a;
    private final oy6 b;
    private final Set c;
    private e d;
    private my6 e;
    private Fragment f;

    private class a implements oy6 {
        a() {
        }

        @Override // defpackage.oy6
        public Set a() {
            Set<my6> b = my6.this.b();
            HashSet hashSet = new HashSet(b.size());
            for (my6 my6Var : b) {
                if (my6Var.e() != null) {
                    hashSet.add(my6Var.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + my6.this + "}";
        }
    }

    public my6() {
        this(new n4());
    }

    private void a(my6 my6Var) {
        this.c.add(my6Var);
    }

    private Fragment d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f;
    }

    private boolean g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(Activity activity) {
        l();
        my6 i = com.bumptech.glide.a.c(activity).k().i(activity);
        this.e = i;
        if (equals(i)) {
            return;
        }
        this.e.a(this);
    }

    private void i(my6 my6Var) {
        this.c.remove(my6Var);
    }

    private void l() {
        my6 my6Var = this.e;
        if (my6Var != null) {
            my6Var.i(this);
            this.e = null;
        }
    }

    Set b() {
        if (equals(this.e)) {
            return Collections.unmodifiableSet(this.c);
        }
        if (this.e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (my6 my6Var : this.e.b()) {
            if (g(my6Var.getParentFragment())) {
                hashSet.add(my6Var);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    n4 c() {
        return this.a;
    }

    public e e() {
        return this.d;
    }

    public oy6 f() {
        return this.b;
    }

    void j(Fragment fragment) {
        this.f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        h(fragment.getActivity());
    }

    public void k(e eVar) {
        this.d = eVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.c();
        l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.a.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }

    my6(n4 n4Var) {
        this.b = new a();
        this.c = new HashSet();
        this.a = n4Var;
    }
}
