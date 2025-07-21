package com.nytimes.android.saved;

import androidx.fragment.app.Fragment;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.utils.SaveOrigin;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.cc0;
import defpackage.cm6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.s87;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.SaveHandler$handleSave$1", f = "SaveHandler.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SaveHandler$handleSave$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $allowUndo;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ SaveOrigin $saveOrigin;
    final /* synthetic */ s87 $saveable;
    final /* synthetic */ ss2 $uiUpdater;
    int label;
    final /* synthetic */ SaveHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveHandler$handleSave$1(SaveHandler saveHandler, Fragment fragment, s87 s87Var, SaveOrigin saveOrigin, boolean z, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = saveHandler;
        this.$fragment = fragment;
        this.$saveable = s87Var;
        this.$saveOrigin = saveOrigin;
        this.$allowUndo = z;
        this.$uiUpdater = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SaveHandler$handleSave$1(this.this$0, this.$fragment, this.$saveable, this.$saveOrigin, this.$allowUndo, this.$uiUpdater, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SnackbarUtil snackbarUtil;
        SavedMessageManager savedMessageManager;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                SaveHandler saveHandler = this.this$0;
                Fragment fragment = this.$fragment;
                s87 s87Var = this.$saveable;
                SaveOrigin saveOrigin = this.$saveOrigin;
                this.label = 1;
                obj = saveHandler.l(fragment, s87Var, saveOrigin, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            if (((SaveHandler.SaveResult) obj) == SaveHandler.SaveResult.Success) {
                savedMessageManager = this.this$0.i;
                boolean z = this.$allowUndo;
                final SaveHandler saveHandler2 = this.this$0;
                final Fragment fragment2 = this.$fragment;
                final s87 s87Var2 = this.$saveable;
                final SaveOrigin saveOrigin2 = this.$saveOrigin;
                final ss2 ss2Var = this.$uiUpdater;
                savedMessageManager.b(true, z, new qs2() { // from class: com.nytimes.android.saved.SaveHandler$handleSave$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m746invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m746invoke() {
                        SaveHandler.this.u(fragment2, s87Var2, saveOrigin2, false, ss2Var);
                    }
                });
                this.$uiUpdater.invoke(cc0.a(true));
            }
        } catch (Exception e) {
            snackbarUtil = this.this$0.a;
            SnackbarUtil.y(snackbarUtil, cm6.save_error, 0, 2, null);
            NYTLogger.g("save failed " + this.$saveable.getUri(), e);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SaveHandler$handleSave$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
