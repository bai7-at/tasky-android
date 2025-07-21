package com.nytimes.android.side.effects;

import android.view.View;
import androidx.activity.ComponentActivity;
import com.google.android.material.bottomappbar.BottomAppBar;
import defpackage.c04;
import defpackage.md3;
import defpackage.ng6;
import defpackage.qs2;
import defpackage.sr7;
import defpackage.vn8;
import defpackage.zq3;
import kotlin.c;

/* loaded from: classes4.dex */
public final class HideShowSideEffect implements sr7 {
    private final vn8 a;
    private final md3 b;
    private final boolean c;
    private final c04 d;

    public HideShowSideEffect(final ComponentActivity componentActivity, vn8 vn8Var, md3 md3Var, boolean z) {
        zq3.h(componentActivity, "activity");
        zq3.h(vn8Var, "tooltipManager");
        zq3.h(md3Var, "hybridScrollEventManager");
        this.a = vn8Var;
        this.b = md3Var;
        this.c = z;
        this.d = c.a(new qs2() { // from class: com.nytimes.android.side.effects.HideShowSideEffect$bottomAppBar$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BottomAppBar mo865invoke() {
                View findViewById = ComponentActivity.this.findViewById(ng6.toolbar);
                if (findViewById instanceof BottomAppBar) {
                    return (BottomAppBar) findViewById;
                }
                return null;
            }
        });
    }

    private final BottomAppBar c() {
        return (BottomAppBar) this.d.getValue();
    }

    @Override // defpackage.sr7
    public void a() {
        if (this.a.c()) {
            BottomAppBar c = c();
            if (c != null) {
                c.m0();
            }
            if (this.c) {
                this.b.a();
            }
        }
    }

    @Override // defpackage.sr7
    public void b() {
        BottomAppBar c;
        if (!this.a.c() || (c = c()) == null) {
            return;
        }
        c.k0();
    }
}
