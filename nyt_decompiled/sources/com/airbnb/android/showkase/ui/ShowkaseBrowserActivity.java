package com.airbnb.android.showkase.ui;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import com.airbnb.android.showkase.exceptions.ShowkaseException;
import defpackage.gt2;
import defpackage.hr7;
import defpackage.jk;
import defpackage.jr7;
import defpackage.lh4;
import defpackage.sy4;
import defpackage.tq0;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ShowkaseBrowserActivity extends jk {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jr7 M(String str) {
        try {
            Object newInstance = Class.forName(str + "Codegen").newInstance();
            zq3.f(newInstance, "null cannot be cast to non-null type com.airbnb.android.showkase.models.ShowkaseProvider");
            lh4.a(newInstance);
            throw null;
        } catch (ClassNotFoundException unused) {
            return new jr7(null, null, null, 7, null);
        }
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        final String string;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("SHOWKASE_ROOT_MODULE")) == null) {
            throw new ShowkaseException("Missing key in bundle. Please start this activity by using the intent returned by the ShowkaseBrowserActivity.getIntent() method.");
        }
        tq0.b(this, null, zr0.c(-695351285, true, new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserActivity$onCreate$1
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
                jr7 M;
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(-695351285, i, -1, "com.airbnb.android.showkase.ui.ShowkaseBrowserActivity.onCreate.<anonymous> (ShowkaseBrowserActivity.kt:25)");
                }
                M = ShowkaseBrowserActivity.this.M(string);
                List a2 = M.a();
                List b = M.b();
                List c = M.c();
                composer.z(-492369756);
                Object A = composer.A();
                if (A == Composer.a.a()) {
                    A = b0.e(new hr7(null, null, null, null, false, null, 63, null), null, 2, null);
                    composer.q(A);
                }
                composer.R();
                sy4 sy4Var = (sy4) A;
                if (a2.isEmpty() && b.isEmpty() && c.isEmpty()) {
                    composer.z(-1589905920);
                    ShowkaseErrorScreenKt.a("There were no elements that were annotated with either @ShowkaseComposable, @ShowkaseTypography or @ShowkaseColor. If you think this is a mistake, file an issue at https://github.com/airbnb/Showkase/issues", composer, 6);
                    composer.R();
                } else {
                    composer.z(-1589906276);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it2 = a2.iterator();
                    if (it2.hasNext()) {
                        lh4.a(it2.next());
                        throw null;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator it3 = b.iterator();
                    if (it3.hasNext()) {
                        lh4.a(it3.next());
                        throw null;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator it4 = c.iterator();
                    if (it4.hasNext()) {
                        lh4.a(it4.next());
                        throw null;
                    }
                    ShowkaseBrowserAppKt.g(linkedHashMap, linkedHashMap2, linkedHashMap3, sy4Var, composer, 3656);
                    composer.R();
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), 1, null);
    }
}
