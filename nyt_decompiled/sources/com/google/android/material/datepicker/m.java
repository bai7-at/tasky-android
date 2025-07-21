package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.TimeModel;
import defpackage.xi6;
import java.util.Locale;

/* loaded from: classes3.dex */
class m extends RecyclerView.Adapter {
    private final MaterialCalendar d;

    public static class a extends RecyclerView.d0 {
        final TextView y;

        a(TextView textView) {
            super(textView);
            this.y = textView;
        }
    }

    m(MaterialCalendar materialCalendar) {
        this.d = materialCalendar;
    }

    int K(int i) {
        return i - this.d.k1().l().year;
    }

    int L(int i) {
        return this.d.k1().l().year + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void z(a aVar, int i) {
        int L = L(i);
        aVar.y.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(L)));
        TextView textView = aVar.y;
        textView.setContentDescription(c.e(textView.getContext(), L));
        b l1 = this.d.l1();
        if (l.g().get(1) == L) {
            com.google.android.material.datepicker.a aVar2 = l1.f;
        } else {
            com.google.android.material.datepicker.a aVar3 = l1.d;
        }
        this.d.n1();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public a B(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(xi6.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int m() {
        return this.d.k1().m();
    }
}
