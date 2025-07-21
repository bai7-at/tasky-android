package com.nytimes.android.saved;

import androidx.fragment.app.Fragment;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.saved.a;
import com.nytimes.android.utils.SaveOrigin;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.c97;
import defpackage.cc0;
import defpackage.cm6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jk;
import defpackage.qs2;
import defpackage.s87;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.SaveHandler$unsave$1", f = "SaveHandler.kt", l = {206, 208}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SaveHandler$unsave$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $allowUndo;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ SaveOrigin $origin;
    final /* synthetic */ s87 $saveable;
    final /* synthetic */ String $sectionName;
    final /* synthetic */ ss2 $uiUpdater;
    int label;
    final /* synthetic */ SaveHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveHandler$unsave$1(String str, SaveHandler saveHandler, s87 s87Var, SaveOrigin saveOrigin, Fragment fragment, boolean z, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.$sectionName = str;
        this.this$0 = saveHandler;
        this.$saveable = s87Var;
        this.$origin = saveOrigin;
        this.$fragment = fragment;
        this.$allowUndo = z;
        this.$uiUpdater = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SaveHandler$unsave$1(this.$sectionName, this.this$0, this.$saveable, this.$origin, this.$fragment, this.$allowUndo, this.$uiUpdater, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SnackbarUtil snackbarUtil;
        SavedManager savedManager;
        SavedManager savedManager2;
        SavedMessageManager savedMessageManager;
        SavedManager savedManager3;
        a aVar;
        jk jkVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
        } catch (Exception e) {
            snackbarUtil = this.this$0.a;
            SnackbarUtil.y(snackbarUtil, cm6.unsave_error, 0, 2, null);
            NYTLogger.g("unsave failed " + this.$saveable.getUri(), e);
        }
        if (i != 0) {
            if (i == 1) {
                f.b(obj);
                savedMessageManager = this.this$0.i;
                boolean z = this.$allowUndo;
                final SaveHandler saveHandler = this.this$0;
                final Fragment fragment = this.$fragment;
                final s87 s87Var = this.$saveable;
                final SaveOrigin saveOrigin = this.$origin;
                final ss2 ss2Var = this.$uiUpdater;
                savedMessageManager.a(z, new qs2() { // from class: com.nytimes.android.saved.SaveHandler$unsave$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m749invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m749invoke() {
                        SaveHandler.this.n(fragment, s87Var, saveOrigin, false, ss2Var);
                    }
                });
                this.$uiUpdater.invoke(cc0.a(false));
                return ww8.a;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            savedManager3 = this.this$0.c;
            savedManager3.syncCache();
            aVar = this.this$0.d;
            SaveOrigin saveOrigin2 = this.$origin;
            s87 s87Var2 = this.$saveable;
            jkVar = this.this$0.j;
            a.C0401a.a(aVar, saveOrigin2, false, s87Var2, jkVar, this.$fragment, null, 32, null);
            savedMessageManager = this.this$0.i;
            boolean z2 = this.$allowUndo;
            final SaveHandler saveHandler2 = this.this$0;
            final Fragment fragment2 = this.$fragment;
            final s87 s87Var3 = this.$saveable;
            final SaveOrigin saveOrigin3 = this.$origin;
            final ss2 ss2Var2 = this.$uiUpdater;
            savedMessageManager.a(z2, new qs2() { // from class: com.nytimes.android.saved.SaveHandler$unsave$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m749invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m749invoke() {
                    SaveHandler.this.n(fragment2, s87Var3, saveOrigin3, false, ss2Var2);
                }
            });
            this.$uiUpdater.invoke(cc0.a(false));
            return ww8.a;
        }
        f.b(obj);
        if (c97.d(this.$sectionName)) {
            savedManager2 = this.this$0.c;
            s87 s87Var4 = this.$saveable;
            this.label = 1;
            if (savedManager2.queueForDeletion(s87Var4, this) == h) {
                return h;
            }
            savedMessageManager = this.this$0.i;
            boolean z22 = this.$allowUndo;
            final SaveHandler saveHandler22 = this.this$0;
            final Fragment fragment22 = this.$fragment;
            final s87 s87Var32 = this.$saveable;
            final SaveOrigin saveOrigin32 = this.$origin;
            final ss2 ss2Var22 = this.$uiUpdater;
            savedMessageManager.a(z22, new qs2() { // from class: com.nytimes.android.saved.SaveHandler$unsave$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m749invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m749invoke() {
                    SaveHandler.this.n(fragment22, s87Var32, saveOrigin32, false, ss2Var22);
                }
            });
            this.$uiUpdater.invoke(cc0.a(false));
            return ww8.a;
        }
        savedManager = this.this$0.c;
        s87 s87Var5 = this.$saveable;
        this.label = 2;
        if (savedManager.delete(s87Var5, this) == h) {
            return h;
        }
        savedManager3 = this.this$0.c;
        savedManager3.syncCache();
        aVar = this.this$0.d;
        SaveOrigin saveOrigin22 = this.$origin;
        s87 s87Var22 = this.$saveable;
        jkVar = this.this$0.j;
        a.C0401a.a(aVar, saveOrigin22, false, s87Var22, jkVar, this.$fragment, null, 32, null);
        savedMessageManager = this.this$0.i;
        boolean z222 = this.$allowUndo;
        final SaveHandler saveHandler222 = this.this$0;
        final Fragment fragment222 = this.$fragment;
        final s87 s87Var322 = this.$saveable;
        final SaveOrigin saveOrigin322 = this.$origin;
        final ss2 ss2Var222 = this.$uiUpdater;
        savedMessageManager.a(z222, new qs2() { // from class: com.nytimes.android.saved.SaveHandler$unsave$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m749invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m749invoke() {
                SaveHandler.this.n(fragment222, s87Var322, saveOrigin322, false, ss2Var222);
            }
        });
        this.$uiUpdater.invoke(cc0.a(false));
        return ww8.a;
        snackbarUtil = this.this$0.a;
        SnackbarUtil.y(snackbarUtil, cm6.unsave_error, 0, 2, null);
        NYTLogger.g("unsave failed " + this.$saveable.getUri(), e);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SaveHandler$unsave$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
