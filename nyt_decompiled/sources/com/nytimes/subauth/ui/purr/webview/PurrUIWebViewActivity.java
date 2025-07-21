package com.nytimes.subauth.ui.purr.webview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.composeui.webview.WebviewScreenKt;
import com.nytimes.subauth.ui.purr.ui.theme.ThemeKt;
import defpackage.gt2;
import defpackage.h55;
import defpackage.qs2;
import defpackage.tq0;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrUIWebViewActivity extends com.nytimes.subauth.ui.purr.webview.a {
    public static final a e = new a(null);
    public static final int f = 8;
    public h55 networkStatus;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, String str) {
            zq3.h(context, "context");
            zq3.h(str, "url");
            Intent intent = new Intent(context, (Class<?>) PurrUIWebViewActivity.class);
            intent.putExtra("url", str);
            return intent;
        }

        private a() {
        }
    }

    public final h55 L() {
        h55 h55Var = this.networkStatus;
        if (h55Var != null) {
            return h55Var;
        }
        zq3.z("networkStatus");
        return null;
    }

    @Override // com.nytimes.subauth.ui.purr.webview.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        final String string = extras != null ? extras.getString("url") : null;
        zq3.e(string);
        tq0.b(this, null, zr0.c(711235728, true, new gt2() { // from class: com.nytimes.subauth.ui.purr.webview.PurrUIWebViewActivity$onCreate$1
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
                    b.S(711235728, i, -1, "com.nytimes.subauth.ui.purr.webview.PurrUIWebViewActivity.onCreate.<anonymous> (PurrUIWebViewActivity.kt:31)");
                }
                final String str = string;
                final PurrUIWebViewActivity purrUIWebViewActivity = this;
                ThemeKt.a(false, zr0.b(composer, -845230076, true, new gt2() { // from class: com.nytimes.subauth.ui.purr.webview.PurrUIWebViewActivity$onCreate$1.1
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
                        if (b.G()) {
                            b.S(-845230076, i2, -1, "com.nytimes.subauth.ui.purr.webview.PurrUIWebViewActivity.onCreate.<anonymous>.<anonymous> (PurrUIWebViewActivity.kt:32)");
                        }
                        String str2 = str;
                        final PurrUIWebViewActivity purrUIWebViewActivity2 = purrUIWebViewActivity;
                        WebviewScreenKt.a(str2, new qs2() { // from class: com.nytimes.subauth.ui.purr.webview.PurrUIWebViewActivity.onCreate.1.1.1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public final Boolean mo865invoke() {
                                return Boolean.valueOf(PurrUIWebViewActivity.this.L().a());
                            }
                        }, null, null, false, null, null, null, null, composer2, 0, 508);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer, 48, 1);
                if (b.G()) {
                    b.R();
                }
            }
        }), 1, null);
    }
}
