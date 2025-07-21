package defpackage;

import android.database.DataSetObserver;
import android.view.View;
import com.google.common.base.Optional;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.comments.comments.data.store.CommentsStore;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.sectionfront.SectionFrontFragment;
import com.nytimes.android.sectionfront.adapter.model.SectionFrontCoalescer;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.view.mvp.BasePresenter;
import com.nytimes.android.widget.SectionFrontRecyclerView;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class vg7 extends BasePresenter {
    SectionFrontCoalescer b;
    final CommentsStore d;
    final r57 e;
    final NetworkStatus f;
    final vb2 g;
    DataSetObserver h;
    final b04 i;
    Scheduler j;
    final CompositeDisposable c = new CompositeDisposable();
    boolean k = false;

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (((zh7) vg7.this.M()).G0()) {
                List e = vg7.this.b.e();
                ((zh7) vg7.this.M()).L0(e);
                ((zh7) vg7.this.M()).g();
                Iterator it2 = e.iterator();
                while (it2.hasNext()) {
                    vg7.this.G0((re7) it2.next());
                }
            }
        }
    }

    class b extends d05 {
        b(Class cls) {
            super(cls);
        }

        @Override // io.reactivex.Observer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(SectionFront sectionFront) {
            vg7.this.I0(sectionFront);
            vg7.this.H0();
            ((zh7) vg7.this.M()).g();
        }

        @Override // defpackage.d05, io.reactivex.Observer
        public void onError(Throwable th) {
            vg7.this.H0();
            vg7.this.z0(th);
            if (vg7.this.O() && !vg7.this.f.g()) {
                if (((zh7) vg7.this.M()).Y()) {
                    ((zh7) vg7.this.M()).v();
                    ((zh7) vg7.this.M()).v();
                    ((zh7) vg7.this.M()).k();
                } else {
                    ((zh7) vg7.this.M()).J0();
                }
            }
            ((zh7) vg7.this.M()).g();
            vg7.this.g.m("Browse Sections Tab", th, vg7.class.getName());
        }
    }

    public vg7(b04 b04Var, r57 r57Var, CommentsStore commentsStore, NetworkStatus networkStatus, Scheduler scheduler, vb2 vb2Var) {
        this.i = b04Var;
        this.e = r57Var;
        this.d = commentsStore;
        this.f = networkStatus;
        this.j = scheduler;
        this.g = vb2Var;
    }

    private void A0() {
        NYTLogger.g("fail to fetch the sectionfront update", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E0(String str) {
        return str.contains(((zh7) M()).u0());
    }

    private void l0() {
        this.h = new a();
    }

    private boolean m0(String str) {
        return ((zh7) M()).u0().equals(str);
    }

    private void n0() {
        this.b.g();
        this.b = null;
    }

    private SectionFrontCoalescer.a q0(qf7 qf7Var) {
        SectionFrontCoalescer.a aVar = new SectionFrontCoalescer.a();
        aVar.a = qf7Var.e;
        aVar.b = qf7Var.f;
        aVar.d = qf7Var.b;
        aVar.e = qf7Var.c;
        aVar.c = qf7Var.g;
        aVar.g = qf7Var.a;
        aVar.f = true;
        return aVar;
    }

    private int t0(qf7 qf7Var) {
        int i = qf7Var.a;
        return i == 3 ? um6.SectionFront_LayoutConfig_TwoColumnLayout : i == 2 ? um6.SectionFront_LayoutConfig_OneColumnLayout : um6.SectionFront_LayoutConfig_Default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(String str) {
        if (m0(str)) {
            NYTLogger.l("refresh sectionfront ui " + ((zh7) M()).u0(), new Object[0]);
            D0();
        }
    }

    private void v0() {
        this.b = (SectionFrontCoalescer) this.i.get();
        l0();
        ((zh7) M()).B(true, Optional.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(re7 re7Var, Integer num) {
        ((zh7) M()).Q0(re7Var, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x0(Throwable th) {
        NYTLogger.i(th, "Failed to fetch comment count", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(Throwable th) {
        A0();
    }

    public void B0(qf7 qf7Var) {
        int i = um6.SectionFront_LayoutConfig_Default;
        ((zh7) M()).m(qf7Var, i);
        int t0 = t0(qf7Var);
        if (t0 != i) {
            ((zh7) M()).m(qf7Var, t0);
        }
    }

    public void C0(qf7 qf7Var) {
        SectionFrontCoalescer.a q0 = q0(qf7Var);
        if (this.b.l()) {
            this.b.p(q0);
            return;
        }
        this.b.k(q0);
        this.b.m(((zh7) M()).l0());
        this.b.j(this.h);
        D0();
    }

    public void D0() {
        if (((zh7) M()).K()) {
            ((zh7) M()).e();
        }
        this.c.add((Disposable) r0().observeOn(this.j).subscribeOn(Schedulers.io()).subscribeWith(new b(SectionFrontFragment.class)));
    }

    public void F0(SectionFront sectionFront) {
        this.b.n(sectionFront);
        this.b.d();
    }

    public void G0(final re7 re7Var) {
        if (re7Var.e() == null || re7Var.e().b()) {
            return;
        }
        this.c.add(this.d.getCommentCountSingle(re7Var.e().a().getUrlOrEmpty()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: qg7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                vg7.this.w0(re7Var, (Integer) obj);
            }
        }, new Consumer() { // from class: rg7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                vg7.x0((Throwable) obj);
            }
        }));
    }

    void H0() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.c.add(this.e.m().observeOn(this.j).subscribeOn(Schedulers.io()).filter(new Predicate() { // from class: sg7
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean E0;
                E0 = vg7.this.E0((String) obj);
                return E0;
            }
        }).subscribe(new Consumer() { // from class: tg7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                vg7.this.u0((String) obj);
            }
        }, new Consumer() { // from class: ug7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                vg7.this.y0((Throwable) obj);
            }
        }));
    }

    void I0(SectionFront sectionFront) {
        ((zh7) M()).y();
        ((zh7) M()).l(sectionFront);
        F0(sectionFront);
        NYTLogger.l("Executing Item Coalescer", new Object[0]);
    }

    @Override // com.nytimes.android.view.mvp.BasePresenter
    public void L() {
        this.c.clear();
        this.h = null;
        ((zh7) M()).S();
        n0();
        super.L();
    }

    public void c0(zh7 zh7Var) {
        super.q(zh7Var);
        v0();
    }

    public boolean d0(SectionFrontRecyclerView sectionFrontRecyclerView) {
        View childAt;
        return sectionFrontRecyclerView == null || (childAt = sectionFrontRecyclerView.getChildAt(0)) == null || sectionFrontRecyclerView.getChildAdapterPosition(childAt) != 0 || childAt.getTop() < 0;
    }

    public qf7 e0() {
        qf7 qf7Var = new qf7();
        B0(qf7Var);
        return qf7Var;
    }

    protected Observable r0() {
        return this.e.f(((zh7) M()).u0());
    }

    public List s0() {
        return this.b.e();
    }

    void z0(Throwable th) {
        NYTLogger.i(th, "skipping %s section due to %s: %s", ((zh7) M()).u0(), th.getClass().getSimpleName(), th.getMessage());
    }
}
