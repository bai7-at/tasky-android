package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.c64;
import defpackage.co6;
import defpackage.dn6;
import defpackage.ic6;
import defpackage.px4;
import defpackage.q16;
import defpackage.qi6;
import defpackage.rf6;

/* loaded from: classes.dex */
public abstract class d extends Fragment implements g.c, g.a, g.b, DialogPreference.a {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private boolean mHavePrefs;
    private boolean mInitDone;
    RecyclerView mList;
    private g mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private final C0109d mDividerDecoration = new C0109d();
    private int mLayoutResId = qi6.preference_list_fragment;
    private final Handler mHandler = new a(Looper.getMainLooper());
    private final Runnable mRequestFocus = new b();

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            d.this.bindPreferences();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = d.this.mList;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    class c implements Runnable {
        final /* synthetic */ Preference a;
        final /* synthetic */ String b;

        c(Preference preference, String str) {
            this.a = preference;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.Adapter adapter = d.this.mList.getAdapter();
            if (!(adapter instanceof PreferenceGroup.c)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.a;
            int b = preference != null ? ((PreferenceGroup.c) adapter).b(preference) : ((PreferenceGroup.c) adapter).h(this.b);
            if (b != -1) {
                d.this.mList.scrollToPosition(b);
            } else {
                adapter.H(new f(adapter, d.this.mList, this.a, this.b));
            }
        }
    }

    /* renamed from: androidx.preference.d$d, reason: collision with other inner class name */
    private class C0109d extends RecyclerView.n {
        private Drawable a;
        private int b;
        private boolean c = true;

        C0109d() {
        }

        private boolean m(View view, RecyclerView recyclerView) {
            RecyclerView.d0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if (!(childViewHolder instanceof h) || !((h) childViewHolder).Y()) {
                return false;
            }
            boolean z2 = this.c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.d0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
            if ((childViewHolder2 instanceof h) && ((h) childViewHolder2).X()) {
                z = true;
            }
            return z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (m(view, recyclerView)) {
                rect.bottom = this.b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (this.a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (m(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.a.setBounds(0, y, width, this.b + y);
                    this.a.draw(canvas);
                }
            }
        }

        public void j(boolean z) {
            this.c = z;
        }

        public void k(Drawable drawable) {
            if (drawable != null) {
                this.b = drawable.getIntrinsicHeight();
            } else {
                this.b = 0;
            }
            this.a = drawable;
            d.this.mList.invalidateItemDecorations();
        }

        public void l(int i) {
            this.b = i;
            d.this.mList.invalidateItemDecorations();
        }
    }

    public interface e {
        boolean f(d dVar, PreferenceScreen preferenceScreen);
    }

    private static class f extends RecyclerView.i {
        private final RecyclerView.Adapter a;
        private final RecyclerView b;
        private final Preference c;
        private final String d;

        f(RecyclerView.Adapter adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.a = adapter;
            this.b = recyclerView;
            this.c = preference;
            this.d = str;
        }

        private void f() {
            this.a.J(this);
            Preference preference = this.c;
            int b = preference != null ? ((PreferenceGroup.c) this.a).b(preference) : ((PreferenceGroup.c) this.a).h(this.d);
            if (b != -1) {
                this.b.scrollToPosition(b);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void b(int i, int i2, Object obj) {
            f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int i, int i2) {
            f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int i, int i2, int i3) {
            f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int i, int i2) {
            f();
        }
    }

    private void b1() {
        if (this.mHandler.hasMessages(1)) {
            return;
        }
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    private void c1() {
        if (this.mPreferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void d1(Preference preference, String str) {
        c cVar = new c(preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = cVar;
        } else {
            cVar.run();
        }
    }

    private void e1() {
        getListView().setAdapter(null);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.V();
        }
        onUnbindPreferences();
    }

    public void addPreferencesFromResource(int i) {
        c1();
        setPreferenceScreen(this.mPreferenceManager.m(requireContext(), i, getPreferenceScreen()));
    }

    void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.P();
        }
        onBindPreferences();
    }

    @Override // androidx.preference.DialogPreference.a
    public <T extends Preference> T findPreference(CharSequence charSequence) {
        g gVar = this.mPreferenceManager;
        if (gVar == null) {
            return null;
        }
        return (T) gVar.a(charSequence);
    }

    public Fragment getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public g getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.k();
    }

    protected void onBindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(ic6.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = dn6.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        g gVar = new g(requireContext());
        this.mPreferenceManager = gVar;
        gVar.p(this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString(ARG_PREFERENCE_ROOT) : null);
    }

    protected RecyclerView.Adapter onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new androidx.preference.e(preferenceScreen);
    }

    public RecyclerView.o onCreateLayoutManager() {
        return new LinearLayoutManager(requireContext());
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(rf6.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(qi6.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new q16(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, co6.PreferenceFragmentCompat, ic6.preferenceFragmentCompatStyle, 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(co6.PreferenceFragmentCompat_android_layout, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(co6.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(co6.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(co6.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
        if (onCreateRecyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.mList = onCreateRecyclerView;
        onCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.mDividerDecoration.j(z);
        if (this.mList.getParent() == null) {
            viewGroup2.addView(this.mList);
        }
        this.mHandler.post(this.mRequestFocus);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            e1();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.g.a
    public void onDisplayPreferenceDialog(Preference preference) {
        androidx.fragment.app.e m1;
        getCallbackFragment();
        for (Fragment fragment = this; fragment != null; fragment = fragment.getParentFragment()) {
        }
        getContext();
        getActivity();
        if (getParentFragmentManager().k0(DIALOG_FRAGMENT_TAG) != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            m1 = androidx.preference.a.n1(preference.q());
        } else if (preference instanceof ListPreference) {
            m1 = c64.m1(preference.q());
        } else {
            if (!(preference instanceof MultiSelectListPreference)) {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            m1 = px4.m1(preference.q());
        }
        m1.setTargetFragment(this, 0);
        m1.show(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
    }

    @Override // androidx.preference.g.b
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        boolean f2 = getCallbackFragment() instanceof e ? ((e) getCallbackFragment()).f(this, preferenceScreen) : false;
        for (Fragment fragment = this; !f2 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof e) {
                f2 = ((e) fragment).f(this, preferenceScreen);
            }
        }
        if (!f2 && (getContext() instanceof e)) {
            f2 = ((e) getContext()).f(this, preferenceScreen);
        }
        if (f2 || !(getActivity() instanceof e)) {
            return;
        }
        ((e) getActivity()).f(this, preferenceScreen);
    }

    @Override // androidx.preference.g.c
    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.n() == null) {
            return false;
        }
        getCallbackFragment();
        for (Fragment fragment = this; fragment != null; fragment = fragment.getParentFragment()) {
        }
        getContext();
        getActivity();
        Log.w(TAG, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle k = preference.k();
        Fragment a2 = parentFragmentManager.w0().a(requireActivity().getClassLoader(), preference.n());
        a2.setArguments(k);
        a2.setTargetFragment(this, 0);
        parentFragmentManager.p().q(((View) requireView().getParent()).getId(), a2).g(null).h();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.o0(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mPreferenceManager.q(this);
        this.mPreferenceManager.o(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mPreferenceManager.q(null);
        this.mPreferenceManager.o(null);
    }

    protected void onUnbindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(PREFERENCES_TAG)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.n0(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    public void scrollToPreference(String str) {
        d1(null, str);
    }

    public void setDivider(Drawable drawable) {
        this.mDividerDecoration.k(drawable);
    }

    public void setDividerHeight(int i) {
        this.mDividerDecoration.l(i);
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        if (!this.mPreferenceManager.r(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        onUnbindPreferences();
        this.mHavePrefs = true;
        if (this.mInitDone) {
            b1();
        }
    }

    public void setPreferencesFromResource(int i, String str) {
        c1();
        PreferenceScreen m = this.mPreferenceManager.m(requireContext(), i, null);
        PreferenceScreen preferenceScreen = m;
        if (str != null) {
            Preference N0 = m.N0(str);
            boolean z = N0 instanceof PreferenceScreen;
            preferenceScreen = N0;
            if (!z) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        setPreferenceScreen(preferenceScreen);
    }

    public void scrollToPreference(Preference preference) {
        d1(preference, null);
    }
}
