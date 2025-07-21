package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import defpackage.d5;
import defpackage.e5;
import defpackage.k5;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.ss2;
import defpackage.x08;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1 extends Lambda implements ss2 {
    final /* synthetic */ ActivityResultRegistry $activityResultRegistry;
    final /* synthetic */ e5 $contract;
    final /* synthetic */ x08 $currentOnResult;
    final /* synthetic */ String $key;
    final /* synthetic */ k5 $realLauncher;

    public static final class a implements ms1 {
        final /* synthetic */ k5 a;

        public a(k5 k5Var) {
            this.a = k5Var;
        }

        @Override // defpackage.ms1
        public void dispose() {
            this.a.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityResultRegistryKt$rememberLauncherForActivityResult$1(k5 k5Var, ActivityResultRegistry activityResultRegistry, String str, e5 e5Var, x08 x08Var) {
        super(1);
        this.$realLauncher = k5Var;
        this.$activityResultRegistry = activityResultRegistry;
        this.$key = str;
        this.$contract = e5Var;
        this.$currentOnResult = x08Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(x08 x08Var, Object obj) {
        ((ss2) x08Var.getValue()).invoke(obj);
    }

    @Override // defpackage.ss2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ms1 invoke(ns1 ns1Var) {
        k5 k5Var = this.$realLauncher;
        ActivityResultRegistry activityResultRegistry = this.$activityResultRegistry;
        String str = this.$key;
        e5 e5Var = this.$contract;
        final x08 x08Var = this.$currentOnResult;
        k5Var.b(activityResultRegistry.i(str, e5Var, new d5() { // from class: androidx.activity.compose.a
            @Override // defpackage.d5
            public final void a(Object obj) {
                ActivityResultRegistryKt$rememberLauncherForActivityResult$1.d(x08.this, obj);
            }
        }));
        return new a(this.$realLauncher);
    }
}
