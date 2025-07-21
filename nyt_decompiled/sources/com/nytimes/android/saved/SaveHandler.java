package com.nytimes.android.saved;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.comscore.streaming.ContentType;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.SaveOrigin;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.b22;
import defpackage.by0;
import defpackage.cc0;
import defpackage.cm6;
import defpackage.d87;
import defpackage.em6;
import defpackage.fc1;
import defpackage.g87;
import defpackage.gt2;
import defpackage.i87;
import defpackage.jk;
import defpackage.qs2;
import defpackage.s87;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes4.dex */
public final class SaveHandler {
    public static final int l = 8;
    private final SnackbarUtil a;
    private final com.nytimes.android.entitlements.a b;
    private final SavedManager c;
    private final a d;
    private final g87 e;
    private final NetworkStatus f;
    private final CoroutineDispatcher g;
    private final CoroutineDispatcher h;
    private final SavedMessageManager i;
    private final jk j;
    private final CoroutineScope k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SaveResult {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ SaveResult[] $VALUES;
        public static final SaveResult Success = new SaveResult("Success", 0);
        public static final SaveResult NotLogged = new SaveResult("NotLogged", 1);

        private static final /* synthetic */ SaveResult[] $values() {
            return new SaveResult[]{Success, NotLogged};
        }

        static {
            SaveResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SaveResult(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static SaveResult valueOf(String str) {
            return (SaveResult) Enum.valueOf(SaveResult.class, str);
        }

        public static SaveResult[] values() {
            return (SaveResult[]) $VALUES.clone();
        }
    }

    public SaveHandler(Activity activity, SnackbarUtil snackbarUtil, com.nytimes.android.entitlements.a aVar, SavedManager savedManager, a aVar2, g87 g87Var, NetworkStatus networkStatus, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, SavedMessageManager savedMessageManager) {
        zq3.h(activity, "activity");
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(aVar, "eCommClient");
        zq3.h(savedManager, "savedManager");
        zq3.h(aVar2, "analyticsEventReporter");
        zq3.h(g87Var, "saveDialogCreator");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(coroutineDispatcher2, "mainDispatcher");
        zq3.h(savedMessageManager, "savedMessageManager");
        this.a = snackbarUtil;
        this.b = aVar;
        this.c = savedManager;
        this.d = aVar2;
        this.e = g87Var;
        this.f = networkStatus;
        this.g = coroutineDispatcher;
        this.h = coroutineDispatcher2;
        this.i = savedMessageManager;
        this.j = (jk) activity;
        this.k = CoroutineScopeKt.CoroutineScope(coroutineDispatcher2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(androidx.fragment.app.Fragment r11, defpackage.s87 r12, com.nytimes.android.utils.SaveOrigin r13, defpackage.by0 r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.SaveHandler.l(androidx.fragment.app.Fragment, s87, com.nytimes.android.utils.SaveOrigin, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(final Fragment fragment, final s87 s87Var, final SaveOrigin saveOrigin, final boolean z, final ss2 ss2Var) {
        if (this.b.q()) {
            BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new SaveHandler$handleSave$1(this, fragment, s87Var, saveOrigin, z, ss2Var, null), 3, null);
        } else {
            this.e.c(this.j, new qs2() { // from class: com.nytimes.android.saved.SaveHandler$handleSave$2

                @fc1(c = "com.nytimes.android.saved.SaveHandler$handleSave$2$1", f = "SaveHandler.kt", l = {ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.saved.SaveHandler$handleSave$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                    final /* synthetic */ boolean $allowUndo;
                    final /* synthetic */ Fragment $fragment;
                    final /* synthetic */ SaveOrigin $saveOrigin;
                    final /* synthetic */ s87 $saveable;
                    final /* synthetic */ ss2 $uiUpdater;
                    int label;
                    final /* synthetic */ SaveHandler this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SaveHandler saveHandler, Fragment fragment, s87 s87Var, SaveOrigin saveOrigin, boolean z, ss2 ss2Var, by0 by0Var) {
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
                        return new AnonymousClass1(this.this$0, this.$fragment, this.$saveable, this.$saveOrigin, this.$allowUndo, this.$uiUpdater, by0Var);
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
                                obj = saveHandler.r(fragment, s87Var, saveOrigin, this);
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
                                savedMessageManager.b(true, z, new qs2() { // from class: com.nytimes.android.saved.SaveHandler.handleSave.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m748invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m748invoke() {
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
                        return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m747invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m747invoke() {
                    NetworkStatus networkStatus;
                    CoroutineScope coroutineScope;
                    SnackbarUtil snackbarUtil;
                    networkStatus = SaveHandler.this.f;
                    if (networkStatus.g()) {
                        coroutineScope = SaveHandler.this.k;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SaveHandler.this, fragment, s87Var, saveOrigin, z, ss2Var, null), 3, null);
                    } else {
                        snackbarUtil = SaveHandler.this.a;
                        SnackbarUtil.y(snackbarUtil, em6.no_network_message, 0, 2, null);
                    }
                }
            });
        }
    }

    public static /* synthetic */ Object s(SaveHandler saveHandler, Fragment fragment, s87 s87Var, SaveOrigin saveOrigin, by0 by0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            fragment = null;
        }
        return saveHandler.r(fragment, s87Var, saveOrigin, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(Fragment fragment, s87 s87Var, SaveOrigin saveOrigin, boolean z, ss2 ss2Var) {
        BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new SaveHandler$unsave$1(this.d.b(), this, s87Var, saveOrigin, fragment, z, ss2Var, null), 3, null);
    }

    public final void m(Fragment fragment, s87 s87Var, SaveOrigin saveOrigin, ss2 ss2Var) {
        zq3.h(s87Var, "saveable");
        zq3.h(saveOrigin, "saveOrigin");
        zq3.h(ss2Var, "uiUpdater");
        n(fragment, s87Var, saveOrigin, true, ss2Var);
    }

    public final void o(Asset asset, SaveOrigin saveOrigin, ss2 ss2Var) {
        zq3.h(asset, "asset");
        zq3.h(saveOrigin, "saveOrigin");
        zq3.h(ss2Var, "uiUpdater");
        n(null, d87.a(asset), saveOrigin, true, ss2Var);
    }

    public final boolean p(s87 s87Var) {
        zq3.h(s87Var, "card");
        List b = i87.b(s87Var);
        if ((b instanceof Collection) && b.isEmpty()) {
            return false;
        }
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            if (this.c.isSaved((String) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean q(String str) {
        zq3.h(str, "url");
        return this.c.isSaved(str);
    }

    public final Object r(Fragment fragment, s87 s87Var, SaveOrigin saveOrigin, by0 by0Var) {
        this.c.setSaveAfterLogin(s87Var.getUri());
        return BuildersKt.withContext(this.g, new SaveHandler$saveAfterLogin$2(this, fragment, s87Var, saveOrigin, null), by0Var);
    }

    public final void t(Fragment fragment, s87 s87Var, SaveOrigin saveOrigin, ss2 ss2Var) {
        zq3.h(s87Var, "saveable");
        zq3.h(saveOrigin, "origin");
        zq3.h(ss2Var, "uiUpdater");
        u(fragment, s87Var, saveOrigin, true, ss2Var);
    }

    public final void v(Asset asset, SaveOrigin saveOrigin, ss2 ss2Var) {
        zq3.h(asset, "asset");
        zq3.h(saveOrigin, "origin");
        zq3.h(ss2Var, "uiUpdater");
        u(null, d87.a(asset), saveOrigin, true, ss2Var);
    }
}
