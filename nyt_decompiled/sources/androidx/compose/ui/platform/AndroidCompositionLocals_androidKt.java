package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aa7;
import defpackage.cc7;
import defpackage.d44;
import defpackage.dh3;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.m76;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.o76;
import defpackage.os1;
import defpackage.py1;
import defpackage.qs2;
import defpackage.sg;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zr0;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public abstract class AndroidCompositionLocals_androidKt {
    private static final m76 a = CompositionLocalKt.d(null, new qs2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Configuration mo865invoke() {
            AndroidCompositionLocals_androidKt.l("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }, 1, null);
    private static final m76 b = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Context mo865invoke() {
            AndroidCompositionLocals_androidKt.l("LocalContext");
            throw new KotlinNothingValueException();
        }
    });
    private static final m76 c = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final dh3 mo865invoke() {
            AndroidCompositionLocals_androidKt.l("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    });
    private static final m76 d = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d44 mo865invoke() {
            AndroidCompositionLocals_androidKt.l("LocalLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    });
    private static final m76 e = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final aa7 mo865invoke() {
            AndroidCompositionLocals_androidKt.l("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    });
    private static final m76 f = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View mo865invoke() {
            AndroidCompositionLocals_androidKt.l("LocalView");
            throw new KotlinNothingValueException();
        }
    });

    public static final class a implements ComponentCallbacks2 {
        final /* synthetic */ Configuration a;
        final /* synthetic */ dh3 b;

        a(Configuration configuration, dh3 dh3Var) {
            this.a = configuration;
            this.b = dh3Var;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.b.c(this.a.updateFrom(configuration));
            this.a.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.b.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            this.b.a();
        }
    }

    public static final void a(final AndroidComposeView androidComposeView, final gt2 gt2Var, Composer composer, final int i) {
        Composer h = composer.h(1396852028);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1396852028, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        Context context = androidComposeView.getContext();
        h.z(-492369756);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(new Configuration(context.getResources().getConfiguration()), null, 2, null);
            h.q(A);
        }
        h.R();
        final sy4 sy4Var = (sy4) A;
        h.z(-797338989);
        boolean S = h.S(sy4Var);
        Object A2 = h.A();
        if (S || A2 == aVar.a()) {
            A2 = new ss2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1
                {
                    super(1);
                }

                public final void b(Configuration configuration) {
                    AndroidCompositionLocals_androidKt.c(sy4.this, new Configuration(configuration));
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Configuration) obj);
                    return ww8.a;
                }
            };
            h.q(A2);
        }
        h.R();
        androidComposeView.setConfigurationChangeObserver((ss2) A2);
        h.z(-492369756);
        Object A3 = h.A();
        if (A3 == aVar.a()) {
            A3 = new sg(context);
            h.q(A3);
        }
        h.R();
        final sg sgVar = (sg) A3;
        AndroidComposeView.c viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        h.z(-492369756);
        Object A4 = h.A();
        if (A4 == aVar.a()) {
            A4 = DisposableSaveableStateRegistry_androidKt.b(androidComposeView, viewTreeOwners.b());
            h.q(A4);
        }
        h.R();
        final os1 os1Var = (os1) A4;
        py1.a(ww8.a, new ss2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2

            public static final class a implements ms1 {
                final /* synthetic */ os1 a;

                public a(os1 os1Var) {
                    this.a = os1Var;
                }

                @Override // defpackage.ms1
                public void dispose() {
                    this.a.c();
                }
            }

            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ms1 invoke(ns1 ns1Var) {
                return new a(os1.this);
            }
        }, h, 6);
        CompositionLocalKt.b(new o76[]{a.c(b(sy4Var)), b.c(context), d.c(viewTreeOwners.a()), e.c(viewTreeOwners.b()), SaveableStateRegistryKt.b().c(os1Var), f.c(androidComposeView.getView()), c.c(m(context, b(sy4Var), h, 72))}, zr0.b(h, 1471621628, true, new gt2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1471621628, i2, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:118)");
                }
                CompositionLocalsKt.a(AndroidComposeView.this, sgVar, gt2Var, composer2, 72);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), h, 56);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    AndroidCompositionLocals_androidKt.a(AndroidComposeView.this, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final Configuration b(sy4 sy4Var) {
        return (Configuration) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, Configuration configuration) {
        sy4Var.setValue(configuration);
    }

    public static final m76 f() {
        return a;
    }

    public static final m76 g() {
        return b;
    }

    public static final m76 h() {
        return c;
    }

    public static final m76 i() {
        return d;
    }

    public static final m76 j() {
        return e;
    }

    public static final m76 k() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final dh3 m(final Context context, Configuration configuration, Composer composer, int i) {
        composer.z(-485908294);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-485908294, i, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:131)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = new dh3();
            composer.q(A);
        }
        composer.R();
        dh3 dh3Var = (dh3) A;
        composer.z(-492369756);
        Object A2 = composer.A();
        Object obj = A2;
        if (A2 == aVar.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            composer.q(configuration2);
            obj = configuration2;
        }
        composer.R();
        Configuration configuration3 = (Configuration) obj;
        composer.z(-492369756);
        Object A3 = composer.A();
        if (A3 == aVar.a()) {
            A3 = new a(configuration3, dh3Var);
            composer.q(A3);
        }
        composer.R();
        final a aVar2 = (a) A3;
        py1.a(dh3Var, new ss2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1

            public static final class a implements ms1 {
                final /* synthetic */ Context a;
                final /* synthetic */ AndroidCompositionLocals_androidKt.a b;

                public a(Context context, AndroidCompositionLocals_androidKt.a aVar) {
                    this.a = context;
                    this.b = aVar;
                }

                @Override // defpackage.ms1
                public void dispose() {
                    this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ms1 invoke(ns1 ns1Var) {
                context.getApplicationContext().registerComponentCallbacks(aVar2);
                return new a(context, aVar2);
            }
        }, composer, 8);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return dh3Var;
    }
}
