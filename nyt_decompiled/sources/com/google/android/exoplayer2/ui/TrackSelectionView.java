package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import defpackage.dq8;
import defpackage.qm6;
import defpackage.ui6;
import defpackage.up8;
import defpackage.ur;
import defpackage.xp8;
import defpackage.zj1;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class TrackSelectionView extends LinearLayout {
    private final int a;
    private final LayoutInflater b;
    private final CheckedTextView c;
    private final CheckedTextView d;
    private final b e;
    private final List f;
    private final Map g;
    private boolean h;
    private boolean i;
    private xp8 j;
    private CheckedTextView[][] k;
    private boolean l;
    private Comparator m;

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            TrackSelectionView.this.c(view);
        }
    }

    private static final class c {
        public final h2.a a;
        public final int b;

        public c(h2.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }

        public t0 a() {
            return this.a.d(this.b);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map b(Map map, List list, boolean z) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            dq8 dq8Var = (dq8) map.get(((h2.a) list.get(i)).c());
            if (dq8Var != null && (z || hashMap.isEmpty())) {
                hashMap.put(dq8Var.a, dq8Var);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void c(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        if (view == this.c) {
            e();
        } else if (view == this.d) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private void d() {
        this.l = false;
        this.g.clear();
    }

    private void e() {
        this.l = true;
        this.g.clear();
    }

    private void f(View view) {
        this.l = false;
        c cVar = (c) ur.e(view.getTag());
        up8 c2 = cVar.a.c();
        int i = cVar.b;
        dq8 dq8Var = (dq8) this.g.get(c2);
        if (dq8Var == null) {
            if (!this.i && this.g.size() > 0) {
                this.g.clear();
            }
            this.g.put(c2, new dq8(c2, ImmutableList.y(Integer.valueOf(i))));
            return;
        }
        ArrayList arrayList = new ArrayList(dq8Var.b);
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean g = g(cVar.a);
        boolean z = g || h();
        if (isChecked && z) {
            arrayList.remove(Integer.valueOf(i));
            if (arrayList.isEmpty()) {
                this.g.remove(c2);
                return;
            } else {
                this.g.put(c2, new dq8(c2, arrayList));
                return;
            }
        }
        if (isChecked) {
            return;
        }
        if (!g) {
            this.g.put(c2, new dq8(c2, ImmutableList.y(Integer.valueOf(i))));
        } else {
            arrayList.add(Integer.valueOf(i));
            this.g.put(c2, new dq8(c2, arrayList));
        }
    }

    private boolean g(h2.a aVar) {
        return this.h && aVar.f();
    }

    private boolean h() {
        return this.i && this.f.size() > 1;
    }

    private void i() {
        this.c.setChecked(this.l);
        this.d.setChecked(!this.l && this.g.size() == 0);
        for (int i = 0; i < this.k.length; i++) {
            dq8 dq8Var = (dq8) this.g.get(((h2.a) this.f.get(i)).c());
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.k[i];
                if (i2 < checkedTextViewArr.length) {
                    if (dq8Var != null) {
                        this.k[i][i2].setChecked(dq8Var.b.contains(Integer.valueOf(((c) ur.e(checkedTextViewArr[i2].getTag())).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    private void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f.isEmpty()) {
            this.c.setEnabled(false);
            this.d.setEnabled(false);
            return;
        }
        this.c.setEnabled(true);
        this.d.setEnabled(true);
        this.k = new CheckedTextView[this.f.size()][];
        boolean h = h();
        for (int i = 0; i < this.f.size(); i++) {
            h2.a aVar = (h2.a) this.f.get(i);
            boolean g = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.k;
            int i2 = aVar.a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            c[] cVarArr = new c[i2];
            for (int i3 = 0; i3 < aVar.a; i3++) {
                cVarArr[i3] = new c(aVar, i3);
            }
            Comparator comparator = this.m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == 0) {
                    addView(this.b.inflate(ui6.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.b.inflate((g || h) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.a);
                checkedTextView.setText(this.j.a(cVarArr[i4].a()));
                checkedTextView.setTag(cVarArr[i4]);
                if (aVar.i(i4)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.k[i][i4] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.l;
    }

    public Map<up8, dq8> getOverrides() {
        return this.g;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.h != z) {
            this.h = z;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (!z && this.g.size() > 1) {
                Map b2 = b(this.g, this.f, false);
                this.g.clear();
                this.g.putAll(b2);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(xp8 xp8Var) {
        this.j = (xp8) ur.e(xp8Var);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.b = from;
        b bVar = new b();
        this.e = bVar;
        this.j = new zj1(getResources());
        this.f = new ArrayList();
        this.g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(qm6.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(ui6.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(qm6.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
