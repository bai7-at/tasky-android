package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.preference.g;
import defpackage.al;
import defpackage.co6;
import defpackage.h3;
import defpackage.ic6;
import defpackage.kl6;
import defpackage.n16;
import defpackage.nu8;
import defpackage.qi6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    private Object B;
    private boolean H;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean Q;
    private boolean S;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private final Context a;
    private g b;
    private long c;
    private boolean d;
    private c e;
    private boolean e0;
    private d f;
    private int f0;
    private int g;
    private int g0;
    private int h;
    private b h0;
    private CharSequence i;
    private List i0;
    private CharSequence j;
    private PreferenceGroup j0;
    private int k;
    private boolean k0;
    private Drawable l;
    private boolean l0;
    private String m;
    private e m0;
    private Intent n;
    private f n0;
    private final View.OnClickListener o0;
    private String r;
    private Bundle s;
    private boolean t;
    private boolean u;
    private boolean w;
    private boolean x;
    private String y;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new a();

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            Preference.this.f0(view);
        }
    }

    interface b {
        void d(Preference preference);

        void e(Preference preference);
    }

    public interface c {
        boolean a(Preference preference, Object obj);
    }

    public interface d {
        boolean a(Preference preference);
    }

    private static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        private final Preference a;

        e(Preference preference) {
            this.a = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence C = this.a.C();
            if (!this.a.H() || TextUtils.isEmpty(C)) {
                return;
            }
            contextMenu.setHeaderTitle(C);
            contextMenu.add(0, 0, 0, kl6.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.a.j().getSystemService("clipboard");
            CharSequence C = this.a.C();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", C));
            Toast.makeText(this.a.j(), this.a.j().getString(kl6.preference_copied, C), 0).show();
            return true;
        }
    }

    public interface f {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.g = Integer.MAX_VALUE;
        this.h = 0;
        this.t = true;
        this.u = true;
        this.x = true;
        this.H = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.Q = true;
        this.X = true;
        this.e0 = true;
        this.f0 = qi6.preference;
        this.o0 = new a();
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co6.Preference, i, i2);
        this.k = nu8.l(obtainStyledAttributes, co6.Preference_icon, co6.Preference_android_icon, 0);
        this.m = nu8.m(obtainStyledAttributes, co6.Preference_key, co6.Preference_android_key);
        this.i = nu8.n(obtainStyledAttributes, co6.Preference_title, co6.Preference_android_title);
        this.j = nu8.n(obtainStyledAttributes, co6.Preference_summary, co6.Preference_android_summary);
        this.g = nu8.d(obtainStyledAttributes, co6.Preference_order, co6.Preference_android_order, Integer.MAX_VALUE);
        this.r = nu8.m(obtainStyledAttributes, co6.Preference_fragment, co6.Preference_android_fragment);
        this.f0 = nu8.l(obtainStyledAttributes, co6.Preference_layout, co6.Preference_android_layout, qi6.preference);
        this.g0 = nu8.l(obtainStyledAttributes, co6.Preference_widgetLayout, co6.Preference_android_widgetLayout, 0);
        this.t = nu8.b(obtainStyledAttributes, co6.Preference_enabled, co6.Preference_android_enabled, true);
        this.u = nu8.b(obtainStyledAttributes, co6.Preference_selectable, co6.Preference_android_selectable, true);
        this.x = nu8.b(obtainStyledAttributes, co6.Preference_persistent, co6.Preference_android_persistent, true);
        this.y = nu8.m(obtainStyledAttributes, co6.Preference_dependency, co6.Preference_android_dependency);
        int i3 = co6.Preference_allowDividerAbove;
        this.N = nu8.b(obtainStyledAttributes, i3, i3, this.u);
        int i4 = co6.Preference_allowDividerBelow;
        this.Q = nu8.b(obtainStyledAttributes, i4, i4, this.u);
        if (obtainStyledAttributes.hasValue(co6.Preference_defaultValue)) {
            this.B = W(obtainStyledAttributes, co6.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(co6.Preference_android_defaultValue)) {
            this.B = W(obtainStyledAttributes, co6.Preference_android_defaultValue);
        }
        this.e0 = nu8.b(obtainStyledAttributes, co6.Preference_shouldDisableView, co6.Preference_android_shouldDisableView, true);
        boolean hasValue = obtainStyledAttributes.hasValue(co6.Preference_singleLineTitle);
        this.S = hasValue;
        if (hasValue) {
            this.X = nu8.b(obtainStyledAttributes, co6.Preference_singleLineTitle, co6.Preference_android_singleLineTitle, true);
        }
        this.Y = nu8.b(obtainStyledAttributes, co6.Preference_iconSpaceReserved, co6.Preference_android_iconSpaceReserved, false);
        int i5 = co6.Preference_isPreferenceVisible;
        this.M = nu8.b(obtainStyledAttributes, i5, i5, true);
        int i6 = co6.Preference_enableCopying;
        this.Z = nu8.b(obtainStyledAttributes, i6, i6, false);
        obtainStyledAttributes.recycle();
    }

    private void I0(SharedPreferences.Editor editor) {
        if (this.b.t()) {
            editor.apply();
        }
    }

    private void J0() {
        Preference i;
        String str = this.y;
        if (str == null || (i = i(str)) == null) {
            return;
        }
        i.K0(this);
    }

    private void K0(Preference preference) {
        List list = this.i0;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void g() {
        z();
        if (H0() && B().contains(this.m)) {
            d0(true, null);
            return;
        }
        Object obj = this.B;
        if (obj != null) {
            d0(false, obj);
        }
    }

    private void k0() {
        if (TextUtils.isEmpty(this.y)) {
            return;
        }
        Preference i = i(this.y);
        if (i != null) {
            i.l0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.y + "\" not found for preference \"" + this.m + "\" (title: \"" + ((Object) this.i) + "\"");
    }

    private void l0(Preference preference) {
        if (this.i0 == null) {
            this.i0 = new ArrayList();
        }
        this.i0.add(preference);
        preference.U(this, G0());
    }

    private void q0(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                q0(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public g A() {
        return this.b;
    }

    public void A0(boolean z) {
        if (this.u != z) {
            this.u = z;
            M();
        }
    }

    public SharedPreferences B() {
        if (this.b == null) {
            return null;
        }
        z();
        return this.b.l();
    }

    public void B0(int i) {
        C0(this.a.getString(i));
    }

    public CharSequence C() {
        return D() != null ? D().a(this) : this.j;
    }

    public void C0(CharSequence charSequence) {
        if (D() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.j, charSequence)) {
            return;
        }
        this.j = charSequence;
        M();
    }

    public final f D() {
        return this.n0;
    }

    public final void D0(f fVar) {
        this.n0 = fVar;
        M();
    }

    public CharSequence E() {
        return this.i;
    }

    public void E0(int i) {
        F0(this.a.getString(i));
    }

    public final int F() {
        return this.g0;
    }

    public void F0(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.i)) {
            return;
        }
        this.i = charSequence;
        M();
    }

    public boolean G() {
        return !TextUtils.isEmpty(this.m);
    }

    public boolean G0() {
        return !I();
    }

    public boolean H() {
        return this.Z;
    }

    protected boolean H0() {
        return this.b != null && J() && G();
    }

    public boolean I() {
        return this.t && this.H && this.L;
    }

    public boolean J() {
        return this.x;
    }

    public boolean K() {
        return this.u;
    }

    public final boolean L() {
        return this.M;
    }

    protected void M() {
        b bVar = this.h0;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    public void N(boolean z) {
        List list = this.i0;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).U(this, z);
        }
    }

    protected void O() {
        b bVar = this.h0;
        if (bVar != null) {
            bVar.e(this);
        }
    }

    public void P() {
        k0();
    }

    protected void Q(g gVar) {
        this.b = gVar;
        if (!this.d) {
            this.c = gVar.f();
        }
        g();
    }

    protected void R(g gVar, long j) {
        this.c = j;
        this.d = true;
        try {
            Q(gVar);
        } finally {
            this.d = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S(androidx.preference.h r9) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.S(androidx.preference.h):void");
    }

    protected void T() {
    }

    public void U(Preference preference, boolean z) {
        if (this.H == z) {
            this.H = !z;
            N(G0());
            M();
        }
    }

    public void V() {
        J0();
        this.k0 = true;
    }

    protected Object W(TypedArray typedArray, int i) {
        return null;
    }

    public void X(h3 h3Var) {
    }

    public void Y(Preference preference, boolean z) {
        if (this.L == z) {
            this.L = !z;
            N(G0());
            M();
        }
    }

    protected void Z() {
        J0();
    }

    void a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.j0 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.j0 = preferenceGroup;
    }

    protected void a0(Parcelable parcelable) {
        this.l0 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public boolean b(Object obj) {
        c cVar = this.e;
        return cVar == null || cVar.a(this, obj);
    }

    protected Parcelable b0() {
        this.l0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    final void c() {
        this.k0 = false;
    }

    protected void c0(Object obj) {
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i = this.g;
        int i2 = preference.g;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.i;
        CharSequence charSequence2 = preference.i;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.i.toString());
    }

    protected void d0(boolean z, Object obj) {
        c0(obj);
    }

    void e(Bundle bundle) {
        Parcelable parcelable;
        if (!G() || (parcelable = bundle.getParcelable(this.m)) == null) {
            return;
        }
        this.l0 = false;
        a0(parcelable);
        if (!this.l0) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void e0() {
        g.c h;
        if (I() && K()) {
            T();
            d dVar = this.f;
            if (dVar == null || !dVar.a(this)) {
                g A = A();
                if ((A == null || (h = A.h()) == null || !h.onPreferenceTreeClick(this)) && this.n != null) {
                    j().startActivity(this.n);
                }
            }
        }
    }

    void f(Bundle bundle) {
        if (G()) {
            this.l0 = false;
            Parcelable b0 = b0();
            if (!this.l0) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (b0 != null) {
                bundle.putParcelable(this.m, b0);
            }
        }
    }

    protected void f0(View view) {
        e0();
    }

    protected boolean g0(boolean z) {
        if (!H0()) {
            return false;
        }
        if (z == v(!z)) {
            return true;
        }
        z();
        SharedPreferences.Editor e2 = this.b.e();
        e2.putBoolean(this.m, z);
        I0(e2);
        return true;
    }

    protected boolean h0(int i) {
        if (!H0()) {
            return false;
        }
        if (i == w(~i)) {
            return true;
        }
        z();
        SharedPreferences.Editor e2 = this.b.e();
        e2.putInt(this.m, i);
        I0(e2);
        return true;
    }

    protected Preference i(String str) {
        g gVar = this.b;
        if (gVar == null) {
            return null;
        }
        return gVar.a(str);
    }

    protected boolean i0(String str) {
        if (!H0()) {
            return false;
        }
        if (TextUtils.equals(str, x(null))) {
            return true;
        }
        z();
        SharedPreferences.Editor e2 = this.b.e();
        e2.putString(this.m, str);
        I0(e2);
        return true;
    }

    public Context j() {
        return this.a;
    }

    public boolean j0(Set set) {
        if (!H0()) {
            return false;
        }
        if (set.equals(y(null))) {
            return true;
        }
        z();
        SharedPreferences.Editor e2 = this.b.e();
        e2.putStringSet(this.m, set);
        I0(e2);
        return true;
    }

    public Bundle k() {
        if (this.s == null) {
            this.s = new Bundle();
        }
        return this.s;
    }

    StringBuilder l() {
        StringBuilder sb = new StringBuilder();
        CharSequence E = E();
        if (!TextUtils.isEmpty(E)) {
            sb.append(E);
            sb.append(' ');
        }
        CharSequence C = C();
        if (!TextUtils.isEmpty(C)) {
            sb.append(C);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    void m0() {
        if (TextUtils.isEmpty(this.m)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.w = true;
    }

    public String n() {
        return this.r;
    }

    public void n0(Bundle bundle) {
        e(bundle);
    }

    long o() {
        return this.c;
    }

    public void o0(Bundle bundle) {
        f(bundle);
    }

    public Intent p() {
        return this.n;
    }

    public void p0(boolean z) {
        if (this.t != z) {
            this.t = z;
            N(G0());
            M();
        }
    }

    public String q() {
        return this.m;
    }

    public void r0(int i) {
        s0(al.b(this.a, i));
        this.k = i;
    }

    public final int s() {
        return this.f0;
    }

    public void s0(Drawable drawable) {
        if (this.l != drawable) {
            this.l = drawable;
            this.k = 0;
            M();
        }
    }

    public int t() {
        return this.g;
    }

    public void t0(Intent intent) {
        this.n = intent;
    }

    public String toString() {
        return l().toString();
    }

    public PreferenceGroup u() {
        return this.j0;
    }

    public void u0(String str) {
        this.m = str;
        if (!this.w || G()) {
            return;
        }
        m0();
    }

    protected boolean v(boolean z) {
        if (!H0()) {
            return z;
        }
        z();
        return this.b.l().getBoolean(this.m, z);
    }

    public void v0(int i) {
        this.f0 = i;
    }

    protected int w(int i) {
        if (!H0()) {
            return i;
        }
        z();
        return this.b.l().getInt(this.m, i);
    }

    final void w0(b bVar) {
        this.h0 = bVar;
    }

    protected String x(String str) {
        if (!H0()) {
            return str;
        }
        z();
        return this.b.l().getString(this.m, str);
    }

    public void x0(c cVar) {
        this.e = cVar;
    }

    public Set y(Set set) {
        if (!H0()) {
            return set;
        }
        z();
        return this.b.l().getStringSet(this.m, set);
    }

    public void y0(d dVar) {
        this.f = dVar;
    }

    public n16 z() {
        g gVar = this.b;
        if (gVar != null) {
            gVar.j();
        }
        return null;
    }

    public void z0(int i) {
        if (i != this.g) {
            this.g = i;
            O();
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nu8.a(context, ic6.preferenceStyle, R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
