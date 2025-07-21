package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.al;
import defpackage.co6;
import defpackage.k99;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class e extends RecyclerView.Adapter implements Preference.b, PreferenceGroup.c {
    private final PreferenceGroup d;
    private List e;
    private List f;
    private final List g;
    private final Runnable i = new a();
    private final Handler h = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.R();
        }
    }

    class b implements Preference.d {
        final /* synthetic */ PreferenceGroup a;

        b(PreferenceGroup preferenceGroup) {
            this.a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference) {
            this.a.W0(Integer.MAX_VALUE);
            e.this.e(preference);
            this.a.P0();
            return true;
        }
    }

    private static class c {
        int a;
        int b;
        String c;

        c(Preference preference) {
            this.c = preference.getClass().getName();
            this.a = preference.s();
            this.b = preference.F();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && TextUtils.equals(this.c, cVar.c);
        }

        public int hashCode() {
            return ((((527 + this.a) * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public e(PreferenceGroup preferenceGroup) {
        this.d = preferenceGroup;
        preferenceGroup.w0(this);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            I(((PreferenceScreen) preferenceGroup).Z0());
        } else {
            I(true);
        }
        R();
    }

    private androidx.preference.b K(PreferenceGroup preferenceGroup, List list) {
        androidx.preference.b bVar = new androidx.preference.b(preferenceGroup.j(), list, preferenceGroup.o());
        bVar.y0(new b(preferenceGroup));
        return bVar;
    }

    private List L(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int R0 = preferenceGroup.R0();
        int i = 0;
        for (int i2 = 0; i2 < R0; i2++) {
            Preference Q0 = preferenceGroup.Q0(i2);
            if (Q0.L()) {
                if (!O(preferenceGroup) || i < preferenceGroup.O0()) {
                    arrayList.add(Q0);
                } else {
                    arrayList2.add(Q0);
                }
                if (Q0 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) Q0;
                    if (!preferenceGroup2.S0()) {
                        continue;
                    } else {
                        if (O(preferenceGroup) && O(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : L(preferenceGroup2)) {
                            if (!O(preferenceGroup) || i < preferenceGroup.O0()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (O(preferenceGroup) && i > preferenceGroup.O0()) {
            arrayList.add(K(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void M(List list, PreferenceGroup preferenceGroup) {
        preferenceGroup.Y0();
        int R0 = preferenceGroup.R0();
        for (int i = 0; i < R0; i++) {
            Preference Q0 = preferenceGroup.Q0(i);
            list.add(Q0);
            c cVar = new c(Q0);
            if (!this.g.contains(cVar)) {
                this.g.add(cVar);
            }
            if (Q0 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) Q0;
                if (preferenceGroup2.S0()) {
                    M(list, preferenceGroup2);
                }
            }
            Q0.w0(this);
        }
    }

    private boolean O(PreferenceGroup preferenceGroup) {
        return preferenceGroup.O0() != Integer.MAX_VALUE;
    }

    public Preference N(int i) {
        if (i < 0 || i >= m()) {
            return null;
        }
        return (Preference) this.f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void z(h hVar, int i) {
        Preference N = N(i);
        hVar.Z();
        N.S(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public h B(ViewGroup viewGroup, int i) {
        c cVar = (c) this.g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, co6.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(co6.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = al.b(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(cVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            k99.p0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = cVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new h(inflate);
    }

    void R() {
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).w0(null);
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        this.e = arrayList;
        M(arrayList, this.d);
        this.f = L(this.d);
        g A = this.d.A();
        if (A != null) {
            A.i();
        }
        r();
        Iterator it3 = this.e.iterator();
        while (it3.hasNext()) {
            ((Preference) it3.next()).c();
        }
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int b(Preference preference) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = (Preference) this.f.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.b
    public void d(Preference preference) {
        int indexOf = this.f.indexOf(preference);
        if (indexOf != -1) {
            t(indexOf, preference);
        }
    }

    @Override // androidx.preference.Preference.b
    public void e(Preference preference) {
        this.h.removeCallbacks(this.i);
        this.h.post(this.i);
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int h(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((Preference) this.f.get(i)).q())) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int m() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long n(int i) {
        if (q()) {
            return N(i).o();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int o(int i) {
        c cVar = new c(N(i));
        int indexOf = this.g.indexOf(cVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.g.size();
        this.g.add(cVar);
        return size;
    }
}
