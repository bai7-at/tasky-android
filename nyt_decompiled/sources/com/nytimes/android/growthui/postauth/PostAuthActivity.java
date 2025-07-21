package com.nytimes.android.growthui.postauth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.common.theme.GrowthUIThemeKt;
import com.nytimes.android.growthui.postauth.layouts.PostAuthLayoutKt;
import defpackage.gt2;
import defpackage.i06;
import defpackage.m75;
import defpackage.qs2;
import defpackage.r53;
import defpackage.ss2;
import defpackage.t53;
import defpackage.tq0;
import defpackage.ww8;
import defpackage.zc5;
import defpackage.zq3;
import defpackage.zr0;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class PostAuthActivity extends com.nytimes.android.growthui.postauth.a {
    public static final a Companion = new a(null);
    public static final int e = 8;
    public CoroutineScope applicationScope;
    public Map<DataConfigId, i06> eventsSenderMap;
    public r53 subscription;
    public t53 theme;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Intent a(Context context, DataConfigId dataConfigId, String str) {
            Intent intent = new Intent(context, (Class<?>) PostAuthActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("CONFIG_ID", dataConfigId);
            intent.putExtra("VARIANT_NAME", str);
            return intent;
        }

        public static /* synthetic */ void c(a aVar, Context context, DataConfigId dataConfigId, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            aVar.b(context, dataConfigId, str);
        }

        public final void b(Context context, DataConfigId dataConfigId, String str) {
            zq3.h(context, "context");
            zq3.h(dataConfigId, "configId");
            context.startActivity(a(context, dataConfigId, str));
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(zc5 zc5Var) {
        BuildersKt__Builders_commonKt.launch$default(M(), null, null, new PostAuthActivity$openProductSubscriptions$1(this, zc5Var, null), 3, null);
    }

    public final CoroutineScope M() {
        CoroutineScope coroutineScope = this.applicationScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        zq3.z("applicationScope");
        return null;
    }

    public final Map N() {
        Map<DataConfigId, i06> map = this.eventsSenderMap;
        if (map != null) {
            return map;
        }
        zq3.z("eventsSenderMap");
        return null;
    }

    public final r53 O() {
        r53 r53Var = this.subscription;
        if (r53Var != null) {
            return r53Var;
        }
        zq3.z("subscription");
        return null;
    }

    public final t53 P() {
        t53 t53Var = this.theme;
        if (t53Var != null) {
            return t53Var;
        }
        zq3.z("theme");
        return null;
    }

    @Override // com.nytimes.android.growthui.postauth.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        Serializable serializable = extras != null ? extras.getSerializable("CONFIG_ID") : null;
        final i06 i06Var = (i06) N().get(serializable instanceof DataConfigId ? (DataConfigId) serializable : null);
        if (i06Var == null) {
            i06Var = m75.a;
        }
        i06Var.a(this);
        tq0.b(this, null, zr0.c(-1646992642, true, new gt2() { // from class: com.nytimes.android.growthui.postauth.PostAuthActivity$onCreate$1
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
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1646992642, i, -1, "com.nytimes.android.growthui.postauth.PostAuthActivity.onCreate.<anonymous> (PostAuthActivity.kt:47)");
                }
                t53 P = PostAuthActivity.this.P();
                final i06 i06Var2 = i06Var;
                final PostAuthActivity postAuthActivity = PostAuthActivity.this;
                GrowthUIThemeKt.a(P, zr0.b(composer, -1937721245, true, new gt2() { // from class: com.nytimes.android.growthui.postauth.PostAuthActivity$onCreate$1.1
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
                            androidx.compose.runtime.b.S(-1937721245, i2, -1, "com.nytimes.android.growthui.postauth.PostAuthActivity.onCreate.<anonymous>.<anonymous> (PostAuthActivity.kt:48)");
                        }
                        final i06 i06Var3 = i06.this;
                        ss2 ss2Var = new ss2() { // from class: com.nytimes.android.growthui.postauth.PostAuthActivity.onCreate.1.1.1
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke(((Boolean) obj).booleanValue());
                                return ww8.a;
                            }

                            public final void invoke(boolean z) {
                                i06.this.e(z);
                            }
                        };
                        final i06 i06Var4 = i06.this;
                        final PostAuthActivity postAuthActivity2 = postAuthActivity;
                        ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.growthui.postauth.PostAuthActivity.onCreate.1.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(zc5 zc5Var) {
                                zq3.h(zc5Var, "offer");
                                i06.this.d();
                                postAuthActivity2.Q(zc5Var);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((zc5) obj);
                                return ww8.a;
                            }
                        };
                        final i06 i06Var5 = i06.this;
                        final PostAuthActivity postAuthActivity3 = postAuthActivity;
                        qs2 qs2Var = new qs2() { // from class: com.nytimes.android.growthui.postauth.PostAuthActivity.onCreate.1.1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m561invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m561invoke() {
                                i06.this.c();
                                postAuthActivity3.finish();
                            }
                        };
                        final i06 i06Var6 = i06.this;
                        PostAuthLayoutKt.a(null, ss2Var, ss2Var2, qs2Var, new qs2() { // from class: com.nytimes.android.growthui.postauth.PostAuthActivity.onCreate.1.1.4
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m562invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m562invoke() {
                                i06.this.b();
                            }
                        }, null, composer2, 0, 33);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer, 48, 0);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 1, null);
    }
}
