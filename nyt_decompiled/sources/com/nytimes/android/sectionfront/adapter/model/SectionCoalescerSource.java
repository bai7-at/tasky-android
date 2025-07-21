package com.nytimes.android.sectionfront.adapter.model;

import android.app.Application;
import android.util.Pair;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.f;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.util.AudioFileVerifier;
import com.nytimes.android.sectionfront.adapter.model.SectionCoalescerSource;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.cropping.ImageCropper;
import defpackage.dt5;
import defpackage.nj1;
import defpackage.of8;
import defpackage.pk2;
import defpackage.pm0;
import defpackage.r87;
import defpackage.ue7;
import defpackage.wh7;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class SectionCoalescerSource extends pm0 {
    AudioFileVerifier audioFileVerifier;
    private final CompositeDisposable c = new CompositeDisposable();
    Application context;
    private ue7 d;
    private List e;
    private SectionFront f;
    ImageCropper imageCropper;
    boolean isPhone;
    SFSummaryController sfSummaryController;
    TimeStampUtil timeStampUtil;

    private void j() {
        if (this.f == null) {
            return;
        }
        this.c.add(Observable.fromIterable(this.e).flatMap(new Function() { // from class: ve7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource n;
                n = SectionCoalescerSource.n((wh7) obj);
                return n;
            }
        }).filter(new Predicate() { // from class: we7
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean o;
                o = SectionCoalescerSource.o((Pair) obj);
                return o;
            }
        }).firstElement().toObservable().flatMap(new Function() { // from class: xe7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource p;
                p = SectionCoalescerSource.this.p((Pair) obj);
                return p;
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.computation()).subscribe(new Consumer() { // from class: ye7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SectionCoalescerSource.this.q((List) obj);
            }
        }, new Consumer() { // from class: ze7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NYTLogger.h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Pair m(wh7 wh7Var, Boolean bool) {
        return new Pair(wh7Var, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ObservableSource n(final wh7 wh7Var) {
        return wh7Var.b().map(new Function() { // from class: af7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Pair m;
                m = SectionCoalescerSource.m(wh7.this, (Boolean) obj);
                return m;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean o(Pair pair) {
        return ((Boolean) pair.second).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource p(Pair pair) {
        return ((wh7) pair.first).a(ImmutableList.t(f.b(this.f.getAssets(), Predicates.d())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(List list) {
        b(ImmutableList.t(list));
    }

    @Override // defpackage.pm0
    public void c() {
        super.c();
        this.c.clear();
    }

    public void k(ue7 ue7Var) {
        this.d = ue7Var;
    }

    public void l(SectionFront sectionFront) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        arrayList.add(new of8(this.context, sectionFront, this.d, this.audioFileVerifier, this.isPhone, this.timeStampUtil, this.sfSummaryController, this.imageCropper));
        this.e.add(new r87(this.context, sectionFront, this.d, this.audioFileVerifier, this.timeStampUtil, this.sfSummaryController, this.imageCropper));
        this.e.add(new dt5(this.context, sectionFront, this.d, this.audioFileVerifier, this.isPhone, this.timeStampUtil, this.sfSummaryController, this.imageCropper));
        this.e.add(new pk2(this.context, sectionFront, this.d, this.audioFileVerifier, this.isPhone, this.timeStampUtil, this.sfSummaryController, this.imageCropper));
        this.e.add(new nj1(this.context, sectionFront, this.d, this.audioFileVerifier, this.timeStampUtil, this.sfSummaryController, this.imageCropper));
    }

    public void r(SectionFront sectionFront) {
        this.f = sectionFront;
        l(sectionFront);
        j();
    }

    public void s(ue7 ue7Var) {
        ue7 ue7Var2 = this.d;
        boolean z = (ue7Var2.c != ue7Var.c) | (ue7Var2.b != ue7Var.b) | (ue7Var2.a != ue7Var.a) | (ue7Var2.d != ue7Var.d);
        this.d = ue7Var;
        if (z) {
            j();
        }
    }
}
