package defpackage;

import com.facebook.internal.FeatureManager;

/* loaded from: classes2.dex */
public final class em3 {
    public static final em3 a = new em3();

    private em3() {
    }

    public static final void d() {
        if (w92.p()) {
            FeatureManager featureManager = FeatureManager.a;
            FeatureManager.a(FeatureManager.Feature.CrashReport, new FeatureManager.a() { // from class: bm3
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    em3.e(z);
                }
            });
            FeatureManager.a(FeatureManager.Feature.ErrorReport, new FeatureManager.a() { // from class: cm3
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    em3.f(z);
                }
            });
            FeatureManager.a(FeatureManager.Feature.AnrReport, new FeatureManager.a() { // from class: dm3
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    em3.g(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z) {
        if (z) {
            a11.b.c();
            FeatureManager featureManager = FeatureManager.a;
            if (FeatureManager.g(FeatureManager.Feature.CrashShield)) {
                b62.b();
                c11.a();
            }
            if (FeatureManager.g(FeatureManager.Feature.ThreadCheck)) {
                al8.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(boolean z) {
        if (z) {
            x22.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z) {
        if (z) {
            b0.c();
        }
    }
}
