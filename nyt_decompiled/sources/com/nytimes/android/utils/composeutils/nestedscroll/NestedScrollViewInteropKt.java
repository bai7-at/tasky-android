package com.nytimes.android.utils.composeutils.nestedscroll;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.recyclerview.widget.RecyclerView;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.extensions.ViewExtensions;
import defpackage.d35;
import defpackage.hd5;
import defpackage.it2;
import defpackage.ms1;
import defpackage.mt2;
import defpackage.ns1;
import defpackage.py1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class NestedScrollViewInteropKt {
    public static final Modifier a(Modifier modifier, final View view) {
        zq3.h(modifier, "<this>");
        zq3.h(view, "view");
        return ComposedModifierKt.b(modifier, null, new it2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollViewInteropKt$nestedScrollForAndroidView$1

            public static final class a implements d35 {
                a() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                zq3.h(modifier2, "$this$composed");
                composer.z(1257968943);
                if (b.G()) {
                    b.S(1257968943, i, -1, "com.nytimes.android.utils.composeutils.nestedscroll.nestedScrollForAndroidView.<anonymous> (NestedScrollViewInterop.kt:22)");
                }
                composer.z(-509979413);
                Object A = composer.A();
                Composer.a aVar = Composer.a;
                if (A == aVar.a()) {
                    A = new a();
                    composer.q(A);
                }
                a aVar2 = (a) A;
                composer.R();
                composer.z(-509979332);
                Object A2 = composer.A();
                if (A2 == aVar.a()) {
                    A2 = new NestedScrollDispatcher();
                    composer.q(A2);
                }
                final NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) A2;
                composer.R();
                final View view2 = view;
                py1.a(view2, new ss2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollViewInteropKt$nestedScrollForAndroidView$1.1

                    /* renamed from: com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollViewInteropKt$nestedScrollForAndroidView$1$1$a */
                    public static final class a implements ms1 {
                        final /* synthetic */ View a;
                        final /* synthetic */ mt2 b;

                        public a(View view, mt2 mt2Var) {
                            this.a = view;
                            this.b = mt2Var;
                        }

                        @Override // defpackage.ms1
                        public void dispose() {
                            ViewExtensions.m(this.a, this.b);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ms1 invoke(ns1 ns1Var) {
                        zq3.h(ns1Var, "$this$DisposableEffect");
                        final NestedScrollDispatcher nestedScrollDispatcher2 = nestedScrollDispatcher;
                        mt2 mt2Var = new mt2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollViewInteropKt$nestedScrollForAndroidView$1$1$onScroll$1
                            {
                                super(5);
                            }

                            public final void b(View view3, int i2, int i3, int i4, int i5) {
                                zq3.h(view3, QueryKeys.INTERNAL_REFERRER);
                                if (ViewExtensions.d(view3)) {
                                    NestedScrollUtilsKt.b(NestedScrollDispatcher.this, hd5.a(i4 - i2, i5 - i3), 0, null, 6, null);
                                }
                            }

                            @Override // defpackage.mt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                b((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
                                return ww8.a;
                            }
                        };
                        ViewExtensions.a(view2, mt2Var);
                        return new a(view2, mt2Var);
                    }
                }, composer, 8);
                Modifier a2 = androidx.compose.ui.input.nestedscroll.a.a(modifier2, aVar2, nestedScrollDispatcher);
                if (b.G()) {
                    b.R();
                }
                composer.R();
                return a2;
            }
        }, 1, null);
    }

    public static final Modifier b(Modifier modifier, final RecyclerView recyclerView) {
        zq3.h(modifier, "<this>");
        zq3.h(recyclerView, "view");
        return ComposedModifierKt.b(modifier, null, new it2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollViewInteropKt$nestedScrollForRecyclerView$1

            public static final class a implements d35 {
                a() {
                }
            }

            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                zq3.h(modifier2, "$this$composed");
                composer.z(-2051318136);
                if (b.G()) {
                    b.S(-2051318136, i, -1, "com.nytimes.android.utils.composeutils.nestedscroll.nestedScrollForRecyclerView.<anonymous> (NestedScrollViewInterop.kt:42)");
                }
                composer.z(-1760852399);
                Object A = composer.A();
                Composer.a aVar = Composer.a;
                if (A == aVar.a()) {
                    A = new a();
                    composer.q(A);
                }
                a aVar2 = (a) A;
                composer.R();
                composer.z(-1760852318);
                Object A2 = composer.A();
                if (A2 == aVar.a()) {
                    A2 = new NestedScrollDispatcher();
                    composer.q(A2);
                }
                final NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) A2;
                composer.R();
                final RecyclerView recyclerView2 = RecyclerView.this;
                py1.a(recyclerView2, new ss2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollViewInteropKt$nestedScrollForRecyclerView$1.1

                    /* renamed from: com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollViewInteropKt$nestedScrollForRecyclerView$1$1$a */
                    public static final class a implements ms1 {
                        final /* synthetic */ RecyclerView a;
                        final /* synthetic */ b b;

                        public a(RecyclerView recyclerView, b bVar) {
                            this.a = recyclerView;
                            this.b = bVar;
                        }

                        @Override // defpackage.ms1
                        public void dispose() {
                            this.a.removeOnScrollListener(this.b);
                        }
                    }

                    /* renamed from: com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollViewInteropKt$nestedScrollForRecyclerView$1$1$b */
                    public static final class b extends RecyclerView.t {
                        final /* synthetic */ NestedScrollDispatcher a;

                        b(NestedScrollDispatcher nestedScrollDispatcher) {
                            this.a = nestedScrollDispatcher;
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.t
                        public void b(RecyclerView recyclerView, int i, int i2) {
                            zq3.h(recyclerView, "recyclerView");
                            NestedScrollUtilsKt.b(this.a, hd5.a(-i, -i2), 0, null, 6, null);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ms1 invoke(ns1 ns1Var) {
                        zq3.h(ns1Var, "$this$DisposableEffect");
                        b bVar = new b(nestedScrollDispatcher);
                        RecyclerView.this.addOnScrollListener(bVar);
                        return new a(RecyclerView.this, bVar);
                    }
                }, composer, 8);
                Modifier a2 = androidx.compose.ui.input.nestedscroll.a.a(modifier2, aVar2, nestedScrollDispatcher);
                if (b.G()) {
                    b.R();
                }
                composer.R();
                return a2;
            }
        }, 1, null);
    }
}
