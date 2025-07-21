package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class FragmentStrictMode {
    public static final FragmentStrictMode a = new FragmentStrictMode();
    private static b b = b.d;

    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface a {
    }

    public static final class b {
        public static final a c = new a(null);
        public static final b d = new b(b0.e(), null, t.i());
        private final Set a;
        private final Map b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(Set set, a aVar, Map map) {
            zq3.h(set, "flags");
            zq3.h(map, "allowedViolations");
            this.a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.b = linkedHashMap;
        }

        public final Set a() {
            return this.a;
        }

        public final a b() {
            return null;
        }

        public final Map c() {
            return this.b;
        }
    }

    private FragmentStrictMode() {
    }

    private final b b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                zq3.g(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.E0() != null) {
                    b E0 = parentFragmentManager.E0();
                    zq3.e(E0);
                    return E0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return b;
    }

    private final void c(b bVar, final Violation violation) {
        Fragment a2 = violation.a();
        final String name = a2.getClass().getName();
        if (bVar.a().contains(Flag.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        bVar.b();
        if (bVar.a().contains(Flag.PENALTY_DEATH)) {
            p(a2, new Runnable() { // from class: jq2
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.d(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, Violation violation) {
        zq3.h(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(Violation violation) {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.a().getClass().getName(), violation);
        }
    }

    public static final void f(Fragment fragment, String str) {
        zq3.h(fragment, "fragment");
        zq3.h(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        FragmentStrictMode fragmentStrictMode = a;
        fragmentStrictMode.e(fragmentReuseViolation);
        b b2 = fragmentStrictMode.b(fragment);
        if (b2.a().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.q(b2, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.c(b2, fragmentReuseViolation);
        }
    }

    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        zq3.h(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = a;
        fragmentStrictMode.e(fragmentTagUsageViolation);
        b b2 = fragmentStrictMode.b(fragment);
        if (b2.a().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.q(b2, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.c(b2, fragmentTagUsageViolation);
        }
    }

    public static final void h(Fragment fragment) {
        zq3.h(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = a;
        fragmentStrictMode.e(getRetainInstanceUsageViolation);
        b b2 = fragmentStrictMode.b(fragment);
        if (b2.a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.q(b2, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.c(b2, getRetainInstanceUsageViolation);
        }
    }

    public static final void i(Fragment fragment) {
        zq3.h(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = a;
        fragmentStrictMode.e(getTargetFragmentRequestCodeUsageViolation);
        b b2 = fragmentStrictMode.b(fragment);
        if (b2.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.q(b2, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.c(b2, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    public static final void j(Fragment fragment) {
        zq3.h(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = a;
        fragmentStrictMode.e(getTargetFragmentUsageViolation);
        b b2 = fragmentStrictMode.b(fragment);
        if (b2.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.q(b2, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.c(b2, getTargetFragmentUsageViolation);
        }
    }

    public static final void k(Fragment fragment) {
        zq3.h(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = a;
        fragmentStrictMode.e(setRetainInstanceUsageViolation);
        b b2 = fragmentStrictMode.b(fragment);
        if (b2.a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.q(b2, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.c(b2, setRetainInstanceUsageViolation);
        }
    }

    public static final void l(Fragment fragment, Fragment fragment2, int i) {
        zq3.h(fragment, "violatingFragment");
        zq3.h(fragment2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, fragment2, i);
        FragmentStrictMode fragmentStrictMode = a;
        fragmentStrictMode.e(setTargetFragmentUsageViolation);
        b b2 = fragmentStrictMode.b(fragment);
        if (b2.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.q(b2, fragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.c(b2, setTargetFragmentUsageViolation);
        }
    }

    public static final void m(Fragment fragment, boolean z) {
        zq3.h(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z);
        FragmentStrictMode fragmentStrictMode = a;
        fragmentStrictMode.e(setUserVisibleHintViolation);
        b b2 = fragmentStrictMode.b(fragment);
        if (b2.a().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.q(b2, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.c(b2, setUserVisibleHintViolation);
        }
    }

    public static final void n(Fragment fragment, ViewGroup viewGroup) {
        zq3.h(fragment, "fragment");
        zq3.h(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = a;
        fragmentStrictMode.e(wrongFragmentContainerViolation);
        b b2 = fragmentStrictMode.b(fragment);
        if (b2.a().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.q(b2, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.c(b2, wrongFragmentContainerViolation);
        }
    }

    public static final void o(Fragment fragment, Fragment fragment2, int i) {
        zq3.h(fragment, "fragment");
        zq3.h(fragment2, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, fragment2, i);
        FragmentStrictMode fragmentStrictMode = a;
        fragmentStrictMode.e(wrongNestedHierarchyViolation);
        b b2 = fragmentStrictMode.b(fragment);
        if (b2.a().contains(Flag.DETECT_WRONG_NESTED_HIERARCHY) && fragmentStrictMode.q(b2, fragment.getClass(), wrongNestedHierarchyViolation.getClass())) {
            fragmentStrictMode.c(b2, wrongNestedHierarchyViolation);
        }
    }

    private final void p(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler g = fragment.getParentFragmentManager().y0().g();
        zq3.g(g, "fragment.parentFragmentManager.host.handler");
        if (zq3.c(g.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            g.post(runnable);
        }
    }

    private final boolean q(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (zq3.c(cls2.getSuperclass(), Violation.class) || !i.c0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
