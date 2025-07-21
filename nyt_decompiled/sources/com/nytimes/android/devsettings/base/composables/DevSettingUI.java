package com.nytimes.android.devsettings.base.composables;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.ch3;
import defpackage.gt2;
import defpackage.ki8;
import defpackage.oe3;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface DevSettingUI {
    public static final a Companion = a.a;

    public static final class ComposableWrapper implements DevSettingUI {
        public static final Companion Companion = new Companion(null);
        private final gt2 a;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ComposableWrapper a(final ch3 ch3Var, final String str, final ym5 ym5Var, final Modifier modifier) {
                zq3.h(ch3Var, "imageVector");
                zq3.h(ym5Var, "padding");
                zq3.h(modifier, "modifier");
                return new ComposableWrapper(zr0.c(-1059279867, true, new gt2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingUI$ComposableWrapper$Companion$icon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 11) == 2 && composer.i()) {
                            composer.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1059279867, i, -1, "com.nytimes.android.devsettings.base.composables.DevSettingUI.ComposableWrapper.Companion.icon.<anonymous> (DevSettingUI.kt:30)");
                        }
                        IconKt.a(ch3.this, str, PaddingKt.h(modifier, ym5Var), 0L, composer, 0, 8);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
            }

            private Companion() {
            }
        }

        public ComposableWrapper(gt2 gt2Var) {
            zq3.h(gt2Var, "content");
            this.a = gt2Var;
        }

        @Override // com.nytimes.android.devsettings.base.composables.DevSettingUI
        public gt2 a() {
            return b.a(this);
        }

        public final gt2 b() {
            return this.a;
        }
    }

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public static /* synthetic */ ComposableWrapper b(a aVar, ch3 ch3Var, String str, float f, Modifier modifier, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                f = bu1.g(12);
            }
            if ((i & 8) != 0) {
                modifier = Modifier.a;
            }
            return aVar.a(ch3Var, str, f, modifier);
        }

        public final ComposableWrapper a(ch3 ch3Var, String str, float f, Modifier modifier) {
            zq3.h(ch3Var, "imageVector");
            zq3.h(modifier, "modifier");
            return ComposableWrapper.Companion.a(ch3Var, str, PaddingKt.e(0.0f, 0.0f, f, 0.0f, 11, null), modifier);
        }

        public final ComposableWrapper c() {
            return b(this, ki8.a(oe3.a.a()), null, 0.0f, null, 14, null);
        }
    }

    public static final class b {
        public static gt2 a(DevSettingUI devSettingUI) {
            ComposableWrapper composableWrapper = devSettingUI instanceof ComposableWrapper ? (ComposableWrapper) devSettingUI : null;
            if (composableWrapper != null) {
                return composableWrapper.b();
            }
            return null;
        }
    }

    public static final class c implements DevSettingUI {
        public static final c a = new c();

        private c() {
        }

        @Override // com.nytimes.android.devsettings.base.composables.DevSettingUI
        public gt2 a() {
            return b.a(this);
        }
    }

    gt2 a();
}
