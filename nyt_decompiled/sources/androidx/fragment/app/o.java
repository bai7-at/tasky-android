package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.gh6;
import defpackage.k99;
import defpackage.sa9;

/* loaded from: classes.dex */
class o {
    private final l a;
    private final q b;
    private final Fragment c;
    private boolean d = false;
    private int e = -1;

    class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            k99.i0(this.a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    o(l lVar, q qVar, Fragment fragment) {
        this.a = lVar;
        this.b = qVar;
        this.c = fragment;
    }

    private boolean l(View view) {
        if (view == this.c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.mView) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.c);
        }
        Bundle bundle = this.c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.c.performActivityCreated(bundle2);
        this.a.a(this.c, bundle2, false);
    }

    void b() {
        Fragment n0 = FragmentManager.n0(this.c.mContainer);
        Fragment parentFragment = this.c.getParentFragment();
        if (n0 != null && !n0.equals(parentFragment)) {
            Fragment fragment = this.c;
            FragmentStrictMode.o(fragment, n0, fragment.mContainerId);
        }
        int j = this.b.j(this.c);
        Fragment fragment2 = this.c;
        fragment2.mContainer.addView(fragment2.mView, j);
    }

    void c() {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.c);
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.mTarget;
        o oVar = null;
        if (fragment2 != null) {
            o n = this.b.n(fragment2.mWho);
            if (n == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            oVar = n;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (oVar = this.b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (oVar != null) {
            oVar.m();
        }
        Fragment fragment4 = this.c;
        fragment4.mHost = fragment4.mFragmentManager.y0();
        Fragment fragment5 = this.c;
        fragment5.mParentFragment = fragment5.mFragmentManager.B0();
        this.a.g(this.c, false);
        this.c.performAttach();
        this.a.b(this.c, false);
    }

    int d() {
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.e;
        int i2 = b.a[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        Fragment fragment2 = this.c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i = Math.max(this.e, 2);
                View view = this.c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, fragment2.mState) : Math.min(i, 1);
            }
        }
        if (!this.c.mAdded) {
            i = Math.min(i, 1);
        }
        Fragment fragment3 = this.c;
        ViewGroup viewGroup = fragment3.mContainer;
        SpecialEffectsController.Operation.LifecycleImpact p = viewGroup != null ? SpecialEffectsController.r(viewGroup, fragment3.getParentFragmentManager()).p(this) : null;
        if (p == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i = Math.min(i, 6);
        } else if (p == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.c;
            if (fragment4.mRemoving) {
                i = fragment4.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        Fragment fragment5 = this.c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.c);
        }
        return i;
    }

    void e() {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.c);
        }
        Bundle bundle = this.c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.c;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.a.h(fragment, bundle2, false);
            this.c.performCreate(bundle2);
            this.a.c(this.c, bundle2, false);
        }
    }

    void f() {
        String str;
        if (this.c.mFromLayout) {
            return;
        }
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
        }
        Bundle bundle = this.c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = this.c.performGetLayoutInflater(bundle2);
        Fragment fragment = this.c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.t0().c(this.c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.c;
                    if (!fragment2.mRestored) {
                        try {
                            str = fragment2.getResources().getResourceName(this.c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = DatasetUtils.UNKNOWN_IDENTITY_ID;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.mContainerId) + " (" + str + ") for fragment " + this.c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.n(this.c, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (this.c.mView != null) {
            if (FragmentManager.L0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.c);
            }
            this.c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.c;
            fragment4.mView.setTag(gh6.fragment_container_view_tag, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (k99.O(this.c.mView)) {
                k99.i0(this.c.mView);
            } else {
                View view = this.c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.c.performViewCreated();
            l lVar = this.a;
            Fragment fragment6 = this.c;
            lVar.m(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.c.mView.getVisibility();
            this.c.setPostOnViewCreatedAlpha(this.c.mView.getAlpha());
            Fragment fragment7 = this.c;
            if (fragment7.mContainer != null && visibility == 0) {
                View findFocus = fragment7.mView.findFocus();
                if (findFocus != null) {
                    this.c.setFocusedView(findFocus);
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.c);
                    }
                }
                this.c.mView.setAlpha(0.0f);
            }
        }
        this.c.mState = 2;
    }

    void g() {
        Fragment f;
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2) {
            Fragment fragment2 = this.c;
            if (!fragment2.mBeingSaved) {
                this.b.B(fragment2.mWho, null);
            }
        }
        if (!z2 && !this.b.p().r(this.c)) {
            String str = this.c.mTargetWho;
            if (str != null && (f = this.b.f(str)) != null && f.mRetainInstance) {
                this.c.mTarget = f;
            }
            this.c.mState = 0;
            return;
        }
        j jVar = this.c.mHost;
        if (jVar instanceof sa9) {
            z = this.b.p().o();
        } else if (jVar.f() instanceof Activity) {
            z = true ^ ((Activity) jVar.f()).isChangingConfigurations();
        }
        if ((z2 && !this.c.mBeingSaved) || z) {
            this.b.p().f(this.c, false);
        }
        this.c.performDestroy();
        this.a.d(this.c, false);
        for (o oVar : this.b.k()) {
            if (oVar != null) {
                Fragment k = oVar.k();
                if (this.c.mWho.equals(k.mTargetWho)) {
                    k.mTarget = this.c;
                    k.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.b.f(str2);
        }
        this.b.s(this);
    }

    void h() {
        View view;
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.c);
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.c.performDestroyView();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.p(null);
        this.c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.c);
        }
        this.c.performDetach();
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.b.p().r(this.c)) {
            return;
        }
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.c);
        }
        this.c.initState();
    }

    void j() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.L0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
            }
            Bundle bundle = this.c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.mView.setTag(gh6.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                l lVar = this.a;
                Fragment fragment5 = this.c;
                lVar.m(fragment5, fragment5.mView, bundle2, false);
                this.c.mState = 2;
            }
        }
    }

    Fragment k() {
        return this.c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.d) {
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z = false;
            while (true) {
                int d = d();
                Fragment fragment = this.c;
                int i = fragment.mState;
                if (d == i) {
                    if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.c.mBeingSaved) {
                        if (FragmentManager.L0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.c);
                        }
                        this.b.p().f(this.c, true);
                        this.b.s(this);
                        if (FragmentManager.L0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.c);
                        }
                        this.c.initState();
                    }
                    Fragment fragment2 = this.c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            SpecialEffectsController r = SpecialEffectsController.r(viewGroup, fragment2.getParentFragmentManager());
                            if (this.c.mHidden) {
                                r.g(this);
                            } else {
                                r.i(this);
                            }
                        }
                        Fragment fragment3 = this.c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.J0(fragment3);
                        }
                        Fragment fragment4 = this.c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.c.mChildFragmentManager.J();
                    }
                    this.d = false;
                    return;
                }
                if (d <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.b.q(fragment.mWho) == null) {
                                this.b.B(this.c.mWho, r());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.L0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                            }
                            Fragment fragment5 = this.c;
                            if (fragment5.mBeingSaved) {
                                this.b.B(fragment5.mWho, r());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment6 = this.c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                SpecialEffectsController.r(viewGroup2, fragment6.getParentFragmentManager()).h(this);
                            }
                            this.c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                SpecialEffectsController.r(viewGroup3, fragment.getParentFragmentManager()).f(SpecialEffectsController.Operation.State.from(this.c.mView.getVisibility()), this);
                            }
                            this.c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    void n() {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.c);
        }
        this.c.performPause();
        this.a.f(this.c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        Fragment fragment = this.c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        Fragment fragment2 = this.c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) this.c.mSavedFragmentState.getParcelable(TransferTable.COLUMN_STATE);
        if (fragmentState != null) {
            Fragment fragment3 = this.c;
            fragment3.mTargetWho = fragmentState.mTargetWho;
            fragment3.mTargetRequestCode = fragmentState.mTargetRequestCode;
            Boolean bool = fragment3.mSavedUserVisibleHint;
            if (bool != null) {
                fragment3.mUserVisibleHint = bool.booleanValue();
                this.c.mSavedUserVisibleHint = null;
            } else {
                fragment3.mUserVisibleHint = fragmentState.mUserVisibleHint;
            }
        }
        Fragment fragment4 = this.c;
        if (fragment4.mUserVisibleHint) {
            return;
        }
        fragment4.mDeferStart = true;
    }

    void p() {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.c);
        }
        View focusedView = this.c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.L0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.c);
                sb.append(" resulting in focused view ");
                sb.append(this.c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.c.setFocusedView(null);
        this.c.performResume();
        this.a.i(this.c, false);
        this.b.B(this.c.mWho, null);
        Fragment fragment = this.c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    Fragment.SavedState q() {
        if (this.c.mState > -1) {
            return new Fragment.SavedState(r());
        }
        return null;
    }

    Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(TransferTable.COLUMN_STATE, new FragmentState(this.c));
        if (this.c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.j(this.c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle T0 = this.c.mChildFragmentManager.T0();
            if (!T0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", T0);
            }
            if (this.c.mView != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void s() {
        if (this.c.mView == null) {
            return;
        }
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.c + " with view " + this.c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.mSavedViewRegistryState = bundle;
    }

    void t(int i) {
        this.e = i;
    }

    void u() {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.c);
        }
        this.c.performStart();
        this.a.k(this.c, false);
    }

    void v() {
        if (FragmentManager.L0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.c);
        }
        this.c.performStop();
        this.a.l(this.c, false);
    }

    o(l lVar, q qVar, ClassLoader classLoader, i iVar, Bundle bundle) {
        this.a = lVar;
        this.b = qVar;
        Fragment a2 = ((FragmentState) bundle.getParcelable(TransferTable.COLUMN_STATE)).a(iVar, classLoader);
        this.c = a2;
        a2.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.setArguments(bundle2);
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    o(l lVar, q qVar, Fragment fragment, Bundle bundle) {
        this.a = lVar;
        this.b = qVar;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
