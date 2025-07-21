package defpackage;

import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import defpackage.fm;

/* loaded from: classes2.dex */
public final class fm {
    public static final fm a = new fm();

    public static final class a implements FetchedAppSettingsManager.a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(boolean z) {
            if (z) {
                ss4.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(boolean z) {
            if (z) {
                x07.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(boolean z) {
            if (z) {
                ModelManager.f();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(boolean z) {
            if (z) {
                x32.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(boolean z) {
            if (z) {
                qi3.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(boolean z) {
            if (z) {
                ul.b();
            }
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.a
        public void a() {
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.a
        public void b(rd2 rd2Var) {
            FeatureManager featureManager = FeatureManager.a;
            FeatureManager.a(FeatureManager.Feature.AAM, new FeatureManager.a() { // from class: zl
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    fm.a.i(z);
                }
            });
            FeatureManager.a(FeatureManager.Feature.RestrictiveDataFiltering, new FeatureManager.a() { // from class: am
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    fm.a.j(z);
                }
            });
            FeatureManager.a(FeatureManager.Feature.PrivacyProtection, new FeatureManager.a() { // from class: bm
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    fm.a.k(z);
                }
            });
            FeatureManager.a(FeatureManager.Feature.EventDeactivation, new FeatureManager.a() { // from class: cm
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    fm.a.l(z);
                }
            });
            FeatureManager.a(FeatureManager.Feature.IapLogging, new FeatureManager.a() { // from class: dm
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    fm.a.m(z);
                }
            });
            FeatureManager.a(FeatureManager.Feature.CloudBridge, new FeatureManager.a() { // from class: em
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    fm.a.n(z);
                }
            });
        }
    }

    private fm() {
    }

    public static final void a() {
        if (c11.d(fm.class)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.a;
            FetchedAppSettingsManager.d(new a());
        } catch (Throwable th) {
            c11.b(th, fm.class);
        }
    }
}
