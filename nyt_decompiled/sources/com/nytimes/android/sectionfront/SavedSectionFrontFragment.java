package com.nytimes.android.sectionfront;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.saved.SavedManager;
import com.nytimes.android.saved.SavedSectionHelper;
import com.nytimes.android.sectionfront.SavedSectionFrontFragment;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.a49;
import defpackage.cm6;
import defpackage.fp2;
import defpackage.gf7;
import defpackage.hi6;
import defpackage.lk6;
import defpackage.oa4;
import defpackage.oe6;
import defpackage.p97;
import defpackage.pg6;
import defpackage.pj3;
import defpackage.qf7;
import defpackage.um6;
import defpackage.vg7;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;

/* loaded from: classes4.dex */
public class SavedSectionFrontFragment extends a implements pj3.a {
    private ProgressBar H;
    private View L;
    private TextView M;
    private TextView N;
    private TextView Q;
    private Button S;
    private LinearLayout X;
    com.nytimes.android.entitlements.a eCommClient;
    protected p97 presenter;
    protected SavedManager savedManager;
    protected SavedSectionHelper savedSectionHelper;

    private SpannableStringBuilder L1(Context context, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) context.getString(i));
        fp2.c(context, spannableStringBuilder, um6.SaveEmptyViewButton, 0, spannableStringBuilder.length());
        return spannableStringBuilder;
    }

    private void M1() {
        this.m.add(this.savedManager.getPctSyncComplete().doOnSubscribe(new Consumer() { // from class: m97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionFrontFragment.this.P1((Disposable) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: n97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionFrontFragment.this.g2((Float) obj);
            }
        }, new Consumer() { // from class: e97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionFrontFragment.Q1((Throwable) obj);
            }
        }));
    }

    private void N1(View view) {
        this.M = (TextView) view.findViewById(pg6.save_empty_title);
        this.N = (TextView) view.findViewById(pg6.save_empty_desc);
        this.S = (Button) view.findViewById(pg6.save_empty_login_button);
        this.Q = (TextView) view.findViewById(pg6.create_account_title);
        this.X = (LinearLayout) view.findViewById(pg6.ecommLayout);
    }

    private void O1(boolean z) {
        this.h.setVisibility(z ? 8 : 0);
        this.L.setVisibility(z ? 0 : 8);
        if (z) {
            N1(this.L);
            if (this.eCommClient.q()) {
                d2();
            } else {
                e2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P1(Disposable disposable) {
        this.H.setMax(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q1(Throwable th) {
        NYTLogger.i(th, "Problem getting pctComplete", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R1(Boolean bool) {
        f2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S1(Throwable th) {
        NYTLogger.i(th, "Problem handling login change in saved section", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T1(oa4 oa4Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U1(Throwable th) {
        NYTLogger.i(th, "Problem logging in from saved section", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V1(View view) {
        this.m.add(this.eCommClient.w(requireActivity(), RegiInterface.RegiSaveSection, "Saved Section Front").observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: g97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionFrontFragment.T1((oa4) obj);
            }
        }, new Consumer() { // from class: h97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionFrontFragment.U1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W1(oa4 oa4Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X1(Throwable th) {
        NYTLogger.i(th, "Problem registering from saved section", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y1(View view) {
        this.m.add(this.eCommClient.w(requireActivity(), RegiInterface.RegiSaveSection, "Saved Section Front").observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: i97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionFrontFragment.W1((oa4) obj);
            }
        }, new Consumer() { // from class: j97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionFrontFragment.X1((Throwable) obj);
            }
        }));
    }

    private void Z1() {
        this.m.add(this.eCommClient.r().observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: k97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionFrontFragment.this.R1((Boolean) obj);
            }
        }, new Consumer() { // from class: l97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionFrontFragment.S1((Throwable) obj);
            }
        }));
    }

    private void a2() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(cm6.save_empty_desc_part1));
        fp2.b(spannableStringBuilder, a49.b(getResources(), oe6.ic_save_14dp, getContext().getTheme()));
        spannableStringBuilder.append((CharSequence) getString(cm6.save_empty_desc_part2));
        this.N.setText(spannableStringBuilder);
        this.N.setGravity(17);
    }

    private void b2() {
        this.S.setText(L1(getContext(), lk6.login));
        this.S.setOnClickListener(new View.OnClickListener() { // from class: d97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SavedSectionFrontFragment.this.V1(view);
            }
        });
    }

    private void c2() {
        this.Q.setOnClickListener(new View.OnClickListener() { // from class: f97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SavedSectionFrontFragment.this.Y1(view);
            }
        });
    }

    private void d2() {
        this.X.setVisibility(8);
        this.Q.setVisibility(8);
        this.M.setText(getString(cm6.savedForLater_empty_msg_tail));
        a2();
    }

    private void e2() {
        this.M.setText(getString(cm6.savedForLater_empty_msg_tail_non_logged));
        this.M.setGravity(17);
        this.X.setVisibility(0);
        this.Q.setVisibility(0);
        this.H.setVisibility(8);
        a2();
        b2();
        c2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g2(Float f) {
        if (f.floatValue() >= 1.0f || this.X.getVisibility() == 0) {
            return;
        }
        this.H.setVisibility(0);
        this.H.setProgress((int) Math.round(Math.floor(f.floatValue() * 100.0f)));
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment, defpackage.zh7
    public void L0(List list) {
        gf7 gf7Var = this.j;
        if (gf7Var != null) {
            gf7Var.a0(list);
            u1();
        }
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment, defpackage.if5
    public void N(RecyclerView.d0 d0Var) {
        if (this.j.P(d0Var.w()).a == SectionAdapterItemType.SAVED_GET_MORE) {
            R();
        } else {
            super.N(d0Var);
        }
    }

    @Override // pj3.a
    public void R() {
        w1();
        this.savedSectionHelper.loadMore();
    }

    @Override // pj3.a
    public boolean b() {
        return this.savedSectionHelper.isLoading();
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment, defpackage.zh7
    public void e() {
        if (this.eCommClient.q()) {
            super.e();
        }
    }

    void f2() {
        if (this.L == null || this.h == null || this.j == null) {
            return;
        }
        O1(!this.eCommClient.q() || this.i.getAssets().size() <= 0);
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment
    protected vg7 j1() {
        return this.presenter;
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment, defpackage.zh7
    public void l(SectionFront sectionFront) {
        super.l(sectionFront);
        f2();
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (DeviceUtils.C(getContext())) {
            this.h.addOnScrollListener(new pj3(this));
        }
        Z1();
        M1();
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        View findViewById = layoutInflater.inflate(hi6.saved_empty_view, viewGroup, true).findViewById(pg6.saveEmptyView);
        this.L = findViewById;
        this.H = (ProgressBar) findViewById.findViewById(pg6.emptyProgressBar);
        if (bundle != null) {
            t1(bundle);
        }
        return onCreateView;
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.savedSectionHelper.onDestroy();
        super.onDestroy();
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        w1();
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        u1();
    }

    @Override // com.nytimes.android.sectionfront.SectionFrontFragment
    protected void p1(qf7 qf7Var) {
        super.p1(qf7Var);
        qf7Var.d = false;
    }
}
