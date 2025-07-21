package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.google.common.base.Optional;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.logging.NYTLogger;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class bh7 {
    private static final int d = (int) TimeUnit.MILLISECONDS.convert(5, TimeUnit.SECONDS);
    private final ch7 a;
    private final CompositeDisposable b = new CompositeDisposable();
    private final Consumer c = new Consumer() { // from class: xg7
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            bh7.f((SectionFront) obj);
        }
    };

    public bh7(ch7 ch7Var) {
        this.a = ch7Var;
    }

    private String e() {
        return this.a.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(SectionFront sectionFront) {
        NYTLogger.l("successfully refresh sectionfront %s", sectionFront.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(SwipeRefreshLayout swipeRefreshLayout, String str, Optional optional, Throwable th) {
        if ((th instanceof ApolloHttpException) && ((ApolloHttpException) th).a() == 304) {
            NYTLogger.C(th, "Failed to reload feed; content not modified", new Object[0]);
            h(swipeRefreshLayout);
            return;
        }
        NYTLogger.C(th, "Failed to refresh section front %s", str);
        if (th instanceof TimeoutException) {
            NYTLogger.h(th);
        }
        swipeRefreshLayout.setRefreshing(false);
        long k = this.a.a().k("SF_LAST_UPDATE", -1L);
        if (k > 0) {
            n(k);
        } else {
            p(swipeRefreshLayout, str, optional);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ww8 i(SwipeRefreshLayout swipeRefreshLayout, String str, Optional optional) {
        k(swipeRefreshLayout, str, Optional.a(), optional);
        return ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void h(SwipeRefreshLayout swipeRefreshLayout) {
        long currentTimeMillis = System.currentTimeMillis();
        this.a.a().c("SF_LAST_UPDATE", currentTimeMillis);
        swipeRefreshLayout.setRefreshing(false);
        o(currentTimeMillis);
    }

    public void j() {
        this.b.clear();
    }

    void k(final SwipeRefreshLayout swipeRefreshLayout, final String str, Optional optional, final Optional optional2) {
        NYTLogger.d("refresh requested from sectionfront %s", str);
        this.a.d().o("Browse Sections Tab");
        if (!this.a.e().g()) {
            p(swipeRefreshLayout, str, optional2);
            return;
        }
        Observable observeOn = this.a.g().l(str).subscribeOn(this.a.f().a()).observeOn(this.a.f().b());
        Consumer<? super Throwable> consumer = new Consumer() { // from class: yg7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                bh7.this.g(swipeRefreshLayout, str, optional2, (Throwable) obj);
            }
        };
        Action action = new Action() { // from class: zg7
            @Override // io.reactivex.functions.Action
            public final void run() {
                bh7.this.h(swipeRefreshLayout);
            }
        };
        if (optional2.d()) {
            this.b.add(observeOn.doAfterTerminate((Action) optional2.c()).subscribe((Consumer) optional.f(this.c), consumer, action));
        } else {
            this.b.add(observeOn.subscribe((Consumer) optional.f(this.c), consumer, action));
        }
    }

    public void l(SwipeRefreshLayout swipeRefreshLayout, String str, Consumer consumer) {
        k(swipeRefreshLayout, str, Optional.b(consumer), Optional.a());
    }

    void n(long j) {
        String str;
        String y = this.a.i().y(j, TimeUnit.MILLISECONDS);
        if (this.a.b()) {
            str = this.a.c() + " " + e() + " " + y;
        } else {
            str = e() + " " + y;
        }
        q(str);
    }

    void o(long j) {
        q(e() + " " + this.a.i().y(j, TimeUnit.MILLISECONDS));
    }

    void p(final SwipeRefreshLayout swipeRefreshLayout, final String str, final Optional optional) {
        this.a.h().q(new qs2() { // from class: ah7
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                ww8 i;
                i = bh7.this.i(swipeRefreshLayout, str, optional);
                return i;
            }
        });
        swipeRefreshLayout.setRefreshing(false);
    }

    void q(String str) {
        this.a.h().w(str, d);
    }
}
