package com.nytimes.android.sectionfront;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.nytimes.android.widget.SectionFrontRecyclerView;
import defpackage.bd6;
import defpackage.et5;
import defpackage.ft5;
import defpackage.hf7;
import defpackage.nh6;
import defpackage.qf7;

/* loaded from: classes4.dex */
public class c extends SectionFrontFragment {

    private class a extends GridLayoutManager.c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            hf7 hf7Var = c.this.j;
            if (hf7Var instanceof b) {
                return ((b) hf7Var).f(i);
            }
            return 1;
        }

        private a() {
        }
    }

    public interface b {
        int f(int i);
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment
    protected void e1(SectionFrontRecyclerView sectionFrontRecyclerView, qf7 qf7Var) {
        sectionFrontRecyclerView.addItemDecoration(new ft5(getContext()));
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment
    protected void l1(SectionFrontRecyclerView sectionFrontRecyclerView, qf7 qf7Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) getActivity(), qf7Var.a, 1, false);
        gridLayoutManager.h3(new a());
        et5 et5Var = (et5) this.photoVidAdapterProvider.get();
        et5Var.f0(qf7Var.a, this.l);
        sectionFrontRecyclerView.setLayoutManager(gridLayoutManager);
        sectionFrontRecyclerView.setAdapter(et5Var);
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h.requestLayout();
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setBackgroundColor(getResources().getColor(bd6.sf_card_background));
        return onCreateView;
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment
    protected void p1(qf7 qf7Var) {
        super.p1(qf7Var);
        qf7Var.a = getResources().getInteger(nh6.section_photo_video_grid_columns);
        qf7Var.d = false;
    }
}
