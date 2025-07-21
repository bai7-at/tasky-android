package com.nytimes.android.menu;

import android.app.Activity;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.menu.MenuManager;
import defpackage.by0;
import defpackage.d44;
import defpackage.ei1;
import defpackage.fc1;
import defpackage.g05;
import defpackage.gt2;
import defpackage.it2;
import defpackage.j74;
import defpackage.kq4;
import defpackage.qq;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zs5;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class MenuManager implements ei1 {
    public static final a Companion = new a(null);
    private final Activity a;
    private final Resources b;
    private final com.nytimes.android.entitlements.a c;
    private final Map d;
    private final qq e;
    private final StateFlow f;
    private Asset g;
    private boolean h;
    private final CompositeDisposable i;
    private CoroutineScope j;

    @fc1(c = "com.nytimes.android.menu.MenuManager$4", f = "MenuManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.menu.MenuManager$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass4(by0 by0Var) {
            super(2, by0Var);
        }

        public final Object b(boolean z, by0 by0Var) {
            return ((AnonymousClass4) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return MenuManager.this.new AnonymousClass4(by0Var);
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (by0) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            MenuManager.this.a.invalidateOptionsMenu();
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.menu.MenuManager$5", f = "MenuManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.menu.MenuManager$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements it2 {
        int label;

        AnonymousClass5(by0 by0Var) {
            super(3, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            MenuManager.this.a.invalidateOptionsMenu();
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            return MenuManager.this.new AnonymousClass5(by0Var).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.nytimes.android.menu.MenuManager$7", f = "MenuManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.menu.MenuManager$7, reason: invalid class name */
    static final class AnonymousClass7 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass7(by0 by0Var) {
            super(2, by0Var);
        }

        public final Object b(boolean z, by0 by0Var) {
            return ((AnonymousClass7) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return MenuManager.this.new AnonymousClass7(by0Var);
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (by0) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            MenuManager.this.a.invalidateOptionsMenu();
            return ww8.a;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MenuManager(Activity activity, Resources resources, com.nytimes.android.entitlements.a aVar, Map map, qq qqVar, PublishSubject publishSubject, StateFlow stateFlow) {
        zq3.h(activity, "activity");
        zq3.h(resources, "resources");
        zq3.h(aVar, "ecommClient");
        zq3.h(map, "menuItems");
        zq3.h(qqVar, "chooser");
        zq3.h(publishSubject, "localChangeListener");
        zq3.h(stateFlow, "isPaywallShowing");
        this.a = activity;
        this.b = resources;
        this.c = aVar;
        this.d = map;
        this.e = qqVar;
        this.f = stateFlow;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.i = compositeDisposable;
        if (activity instanceof d44) {
            ((d44) activity).getLifecycle().a(this);
        }
        Observable subscribeOn = aVar.t().observeOn(Schedulers.io()).subscribeOn(AndroidSchedulers.mainThread());
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.menu.MenuManager.1
            {
                super(1);
            }

            public final void b(Boolean bool) {
                MenuManager.this.a.invalidateOptionsMenu();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Boolean) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: fq4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MenuManager.d(ss2.this, obj);
            }
        };
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.menu.MenuManager.2
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                MenuManager.this.a.invalidateOptionsMenu();
            }
        };
        Disposable subscribe = subscribeOn.subscribe(consumer, new Consumer() { // from class: gq4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MenuManager.e(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
        final Flow c = aVar.c();
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.flowOn(FlowKt.onEach(FlowKt.flowOn(new Flow() { // from class: com.nytimes.android.menu.MenuManager$special$$inlined$map$1

            /* renamed from: com.nytimes.android.menu.MenuManager$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ MenuManager b;

                @fc1(c = "com.nytimes.android.menu.MenuManager$special$$inlined$map$1$2", f = "MenuManager.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.menu.MenuManager$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, MenuManager menuManager) {
                    this.a = flowCollector;
                    this.b = menuManager;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.android.menu.MenuManager$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.menu.MenuManager$special$$inlined$map$1$2$1 r0 = (com.nytimes.android.menu.MenuManager$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.menu.MenuManager$special$$inlined$map$1$2$1 r0 = new com.nytimes.android.menu.MenuManager$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        r5.booleanValue()
                        com.nytimes.android.menu.MenuManager r4 = r4.b
                        com.nytimes.android.entitlements.a r4 = com.nytimes.android.menu.MenuManager.i(r4)
                        boolean r4 = r4.a()
                        java.lang.Boolean r4 = defpackage.cc0.a(r4)
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r4, r0)
                        if (r4 != r1) goto L52
                        return r1
                    L52:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.menu.MenuManager$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        }, Dispatchers.getIO()), new AnonymousClass4(null)), Dispatchers.getMain()), new AnonymousClass5(null)), l());
        Observable<T> observeOn = publishSubject.observeOn(AndroidSchedulers.mainThread());
        final ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.menu.MenuManager.6
            {
                super(1);
            }

            public final void b(j74 j74Var) {
                MenuManager.this.a.invalidateOptionsMenu();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((j74) obj);
                return ww8.a;
            }
        };
        Disposable subscribe2 = observeOn.subscribe(new Consumer() { // from class: hq4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MenuManager.f(ss2.this, obj);
            }
        }, new g05(MenuManager.class));
        zq3.g(subscribe2, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe2);
        FlowKt.launchIn(FlowKt.flowOn(FlowKt.onEach(stateFlow, new AnonymousClass7(null)), Dispatchers.getMain()), l());
        activity.invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    private final void j(MenuData menuData, Menu menu) {
        int i;
        int grpId = menuData.getGrpId();
        int id = menuData.getId();
        Integer orderInGrp = menuData.getOrderInGrp();
        if (orderInGrp != null) {
            i = this.b.getInteger(orderInGrp.intValue());
        } else {
            i = 0;
        }
        MenuItem add = menu.add(grpId, id, i, zs5.a(this.a).getString(menuData.getTitle()));
        Boolean isVisible = menuData.isVisible();
        if (isVisible != null) {
            add.setVisible(isVisible.booleanValue());
        }
        Integer showAsAction = menuData.getShowAsAction();
        if (showAsAction != null) {
            add.setShowAsAction(showAsAction.intValue());
        }
        Integer actionLayout = menuData.getActionLayout();
        if (actionLayout != null) {
            add.setActionView(actionLayout.intValue());
        }
        Integer icon = menuData.getIcon();
        if (icon != null) {
            add.setIcon(this.a.getDrawable(icon.intValue()));
        }
    }

    private final CoroutineScope l() {
        CoroutineScope coroutineScope = this.j;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.j = CoroutineScope;
        return CoroutineScope;
    }

    public final Asset k() {
        return this.g;
    }

    public final void m(Menu menu) {
        zq3.h(menu, "menu");
        Iterator it2 = this.d.values().iterator();
        while (it2.hasNext()) {
            j((MenuData) it2.next(), menu);
        }
    }

    public final boolean n(MenuItem menuItem) {
        gt2 handler;
        zq3.h(menuItem, "menuitem");
        MenuData menuData = (MenuData) this.d.get(Integer.valueOf(menuItem.getItemId()));
        if (menuData == null || (handler = menuData.getHandler()) == null) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(l(), null, null, new MenuManager$onOptionsItemsSelected$1$1(handler, menuItem, null), 3, null);
        return true;
    }

    public final void o(Menu menu) {
        zq3.h(menu, "menu");
        for (MenuData menuData : this.d.values()) {
            ss2 preparer = menuData.getPreparer();
            if (preparer != null) {
                preparer.invoke(new kq4(menu, this.e.a(this.g), this.g, this.h));
            }
            MenuItem findItem = menu.findItem(menuData.getId());
            if (findItem != null) {
                findItem.setEnabled((menuData.isPaywallAffected() && ((Boolean) this.f.getValue()).booleanValue()) ? false : true);
            }
        }
    }

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.i.clear();
        CoroutineScope coroutineScope = this.j;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.j = null;
    }

    public final void p(Asset asset) {
        this.g = asset;
    }

    public final void q(boolean z) {
        this.h = z;
    }
}
