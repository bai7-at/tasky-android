package com.nytimes.android.subauth.core.purr;

import android.content.SharedPreferences;
import androidx.lifecycle.l;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.purr.a;
import com.nytimes.android.subauth.core.purr.directive.AgentTCFInfo;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyDirective;
import com.nytimes.android.subauth.core.purr.directive.TCFInfo;
import com.nytimes.android.subauth.core.purr.directive.ToggleableDirectiveValue;
import com.nytimes.android.subauth.core.purr.model.CurrentTCFNoticeData;
import com.nytimes.android.subauth.core.purr.model.PrivacyDirectives;
import com.nytimes.android.subauth.core.purr.model.ShowTCFUIDirective;
import com.nytimes.android.subauth.core.purr.model.TcfPreferenceData;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceKind;
import com.nytimes.android.subauth.core.purr.model.UserTCFData;
import com.nytimes.android.subauth.core.util.ControlledRunner;
import defpackage.b22;
import defpackage.by0;
import defpackage.cc0;
import defpackage.d44;
import defpackage.ei1;
import defpackage.o96;
import defpackage.s86;
import defpackage.ss2;
import defpackage.u86;
import defpackage.ul8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.threeten.bp.Duration;

/* loaded from: classes4.dex */
public final class PurrManagerImpl implements com.nytimes.android.subauth.core.purr.a, ei1 {
    public static final a Companion = new a(null);
    private final s86 a;
    private final o96 b;
    private final MutableSharedFlow c;
    private final PurrDirectiveOverrider d;
    private final u86 e;
    private final SharedPreferences f;
    private final boolean g;
    private final SubauthListenerManager h;
    private final CoroutineDispatcher i;
    private final ControlledRunner j;
    private ControlledRunner k;
    private PrivacyConfiguration l;
    private AtomicBoolean m;
    private String n;
    private boolean r;
    private boolean s;
    private final CoroutineScope t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class LegacyGDPRApplyResult {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ LegacyGDPRApplyResult[] $VALUES;
        public static final LegacyGDPRApplyResult SUCCESS = new LegacyGDPRApplyResult("SUCCESS", 0);
        public static final LegacyGDPRApplyResult FAILURE = new LegacyGDPRApplyResult("FAILURE", 1);
        public static final LegacyGDPRApplyResult NO_GDPR_APPLY_NEEDED = new LegacyGDPRApplyResult("NO_GDPR_APPLY_NEEDED", 2);

        private static final /* synthetic */ LegacyGDPRApplyResult[] $values() {
            return new LegacyGDPRApplyResult[]{SUCCESS, FAILURE, NO_GDPR_APPLY_NEEDED};
        }

        static {
            LegacyGDPRApplyResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private LegacyGDPRApplyResult(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static LegacyGDPRApplyResult valueOf(String str) {
            return (LegacyGDPRApplyResult) Enum.valueOf(LegacyGDPRApplyResult.class, str);
        }

        public static LegacyGDPRApplyResult[] values() {
            return (LegacyGDPRApplyResult[]) $VALUES.clone();
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LegacyGDPRApplyResult.values().length];
            try {
                iArr[LegacyGDPRApplyResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyGDPRApplyResult.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegacyGDPRApplyResult.NO_GDPR_APPLY_NEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public PurrManagerImpl(s86 s86Var, o96 o96Var, MutableSharedFlow mutableSharedFlow, PurrDirectiveOverrider purrDirectiveOverrider, u86 u86Var, SharedPreferences sharedPreferences, boolean z, SubauthListenerManager subauthListenerManager, CoroutineDispatcher coroutineDispatcher) {
        CompletableJob Job$default;
        zq3.h(s86Var, "purrClient");
        zq3.h(o96Var, "store");
        zq3.h(mutableSharedFlow, "latestPrivacyConfigSharedFlow");
        zq3.h(purrDirectiveOverrider, "purrDirectiveOverrider");
        zq3.h(u86Var, "purrCookieProvider");
        zq3.h(sharedPreferences, "defaultSharedPrefs");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = s86Var;
        this.b = o96Var;
        this.c = mutableSharedFlow;
        this.d = purrDirectiveOverrider;
        this.e = u86Var;
        this.f = sharedPreferences;
        this.g = z;
        this.h = subauthListenerManager;
        this.i = coroutineDispatcher;
        this.j = new ControlledRunner();
        this.k = new ControlledRunner();
        this.m = new AtomicBoolean(false);
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.t = CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(Job$default));
        l.k().getLifecycle().a(this);
        L();
    }

    private final void L() {
        if (this.f.contains("last_email_opt_in")) {
            BuildersKt__Builders_commonKt.launch$default(this.t, null, null, new PurrManagerImpl$checkLastEmailOptInAttemptFailedRetry$1(this, null), 3, null);
        }
    }

    private final PrivacyConfiguration M(Throwable th, List list) {
        ArrayList arrayList;
        ul8.a.z("PURR").d("returning no purr data " + th, new Object[0]);
        List<PurrPrivacyDirective> default$subauth_core_release = PrivacyDirectives.Companion.default$subauth_core_release();
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(i.w(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((UserPrivacyPreference) it2.next()).toPublic$subauth_core_release());
            }
        } else {
            arrayList = null;
        }
        PrivacyConfiguration privacyConfiguration = new PrivacyConfiguration(default$subauth_core_release, arrayList, 0, 0L, 8, null);
        X(privacyConfiguration);
        this.h.E();
        if (this.s) {
            ul8.a.z("PURR").t("fallbackPrivacyConfiguration: " + privacyConfiguration, new Object[0]);
        }
        return privacyConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(List list, AgentTCFInfo agentTCFInfo, by0 by0Var) {
        return BuildersKt.withContext(this.i, new PurrManagerImpl$fetchDirectivesAsync$2(this, list, agentTCFInfo, null), by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List O(List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((UserPrivacyPreference) obj).getKind() == UserPrivacyPreferenceKind.AGENT) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? i.l() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P(by0 by0Var) {
        List c = this.b.c();
        PrivacyDirectives q = this.b.q();
        if (q == null) {
            return V(by0Var);
        }
        this.r = true;
        this.n = "Fetch Directives Skip: No Fetch error. Using Non-Stale Cached Directives.";
        PrivacyConfiguration Y = Y(new Triple(q, c, cc0.c(1)));
        if (this.s) {
            ul8.a.z("PURR").t("getCurrentDirectivesAsync: Result (w/ cached directives): " + Y, new Object[0]);
        }
        return Y;
    }

    private final PrivacyConfiguration Q(Throwable th, List list) {
        PrivacyDirectives a2 = this.b.a();
        if (a2 == null) {
            if (this.s) {
                ul8.a.z("PURR").t("getStaleCachedPrivacyConfiguration: Unable to pull stale directives. Using fallback.", new Object[0]);
            }
            return M(th, list);
        }
        ul8.b bVar = ul8.a;
        bVar.z("PURR").d("returning stale purr data " + th, new Object[0]);
        PrivacyConfiguration Y = Y(new Triple(a2, list, 3));
        X(Y);
        this.h.e();
        if (!this.s) {
            return Y;
        }
        bVar.z("PURR").t("getStaleCachedPrivacyConfiguration: Result: " + Y, new Object[0]);
        return Y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(boolean r6, boolean r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.android.subauth.core.purr.PurrManagerImpl$handleLegacyGDPR$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.subauth.core.purr.PurrManagerImpl$handleLegacyGDPR$1 r0 = (com.nytimes.android.subauth.core.purr.PurrManagerImpl$handleLegacyGDPR$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.purr.PurrManagerImpl$handleLegacyGDPR$1 r0 = new com.nytimes.android.subauth.core.purr.PurrManagerImpl$handleLegacyGDPR$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L40
            if (r2 == r3) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.core.purr.PurrManagerImpl r5 = (com.nytimes.android.subauth.core.purr.PurrManagerImpl) r5
            kotlin.f.b(r8)
            goto L68
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.core.purr.PurrManagerImpl r5 = (com.nytimes.android.subauth.core.purr.PurrManagerImpl) r5
            kotlin.f.b(r8)
            goto L54
        L40:
            kotlin.f.b(r8)
            if (r6 == 0) goto L57
            com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceName r6 = com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceName.GDPR
            com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceValue r7 = com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceValue.OPT_IN
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = r5.d(r6, r7, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r8 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r8
            goto L6c
        L57:
            if (r7 == 0) goto L6b
            com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceName r6 = com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceName.GDPR
            com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceValue r7 = com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceValue.OPT_OUT
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r5.d(r6, r7, r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r8 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r8
            goto L6c
        L6b:
            r8 = 0
        L6c:
            if (r8 == 0) goto L90
            int r6 = r8.getState()
            if (r6 != r4) goto L77
            com.nytimes.android.subauth.core.purr.PurrManagerImpl$LegacyGDPRApplyResult r5 = com.nytimes.android.subauth.core.purr.PurrManagerImpl.LegacyGDPRApplyResult.SUCCESS
            goto L8e
        L77:
            o96 r5 = r5.b
            r5.h()
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r6 = "PURR"
            ul8$c r5 = r5.z(r6)
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "applyTCF FAILED: Applying legacy GDPR failed."
            r5.d(r7, r6)
            com.nytimes.android.subauth.core.purr.PurrManagerImpl$LegacyGDPRApplyResult r5 = com.nytimes.android.subauth.core.purr.PurrManagerImpl.LegacyGDPRApplyResult.FAILURE
        L8e:
            if (r5 != 0) goto L92
        L90:
            com.nytimes.android.subauth.core.purr.PurrManagerImpl$LegacyGDPRApplyResult r5 = com.nytimes.android.subauth.core.purr.PurrManagerImpl.LegacyGDPRApplyResult.NO_GDPR_APPLY_NEEDED
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.PurrManagerImpl.R(boolean, boolean, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.subauth.core.purr.PurrManagerImpl$handleTCFSaveSuccess$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.subauth.core.purr.PurrManagerImpl$handleTCFSaveSuccess$1 r0 = (com.nytimes.android.subauth.core.purr.PurrManagerImpl$handleTCFSaveSuccess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.purr.PurrManagerImpl$handleTCFSaveSuccess$1 r0 = new com.nytimes.android.subauth.core.purr.PurrManagerImpl$handleTCFSaveSuccess$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.core.purr.PurrManagerImpl r5 = (com.nytimes.android.subauth.core.purr.PurrManagerImpl) r5
            kotlin.f.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            o96 r6 = r5.b
            r6.s()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r5.V(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r6 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r6
            int r0 = r6.getState()
            r1 = 2
            java.lang.String r2 = "PURR"
            r4 = 0
            if (r0 == r1) goto L77
            o96 r5 = r5.b
            r5.h()
            ul8$b r5 = defpackage.ul8.a
            ul8$c r5 = r5.z(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "applyTCF FAILED: Updated privacy config from stale privacy config: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r5.d(r6, r0)
            r3 = r4
            goto L97
        L77:
            boolean r5 = r5.s
            if (r5 == 0) goto L97
            ul8$b r5 = defpackage.ul8.a
            ul8$c r5 = r5.z(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "applyTCF SUCCESS: Updated privacy config: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r5.t(r6, r0)
        L97:
            java.lang.Boolean r5 = defpackage.cc0.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.PurrManagerImpl.S(by0):java.lang.Object");
    }

    private final boolean T() {
        ToggleableDirectiveValue value;
        PrivacyDirectives q = this.b.q();
        String str = null;
        ShowTCFUIDirective showTCFUiDirective = q != null ? q.getShowTCFUiDirective() : null;
        String overriddenValue = showTCFUiDirective != null ? this.d.getOverriddenValue(showTCFUiDirective.toPublic$subauth_core_release()) : null;
        if (overriddenValue != null) {
            str = overriddenValue;
        } else if (showTCFUiDirective != null && (value = showTCFUiDirective.getValue()) != null) {
            str = value.name();
        }
        return zq3.c(str, "SHOW");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U() {
        return this.b.a() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(defpackage.by0 r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.PurrManagerImpl.V(by0):java.lang.Object");
    }

    private final void W(TcfPreferenceData tcfPreferenceData) {
        Map<String, Object> i;
        UserTCFData userTCFData = tcfPreferenceData.getUserTCFData();
        CurrentTCFNoticeData currentNoticeData = tcfPreferenceData.getCurrentNoticeData();
        String tcfString = userTCFData != null ? userTCFData.getTcfString() : null;
        String tcfNoticeVersion = userTCFData != null ? userTCFData.getTcfNoticeVersion() : null;
        if (userTCFData == null || (i = userTCFData.getTcfDecodedData()) == null) {
            i = t.i();
        }
        TCFInfo tCFInfo = new TCFInfo(tcfString, i, tcfNoticeVersion, currentNoticeData.getCurrentNoticeVersionHash());
        this.b.p(tCFInfo);
        this.b.e(currentNoticeData.getAcceptAllTCFString());
        this.b.b(currentNoticeData.getRejectAllTCFString());
        this.h.i(tCFInfo);
    }

    private final void X(PrivacyConfiguration privacyConfiguration) {
        if (zq3.c(privacyConfiguration, this.l)) {
            return;
        }
        this.l = privacyConfiguration;
        this.c.tryEmit(privacyConfiguration);
        this.h.R(privacyConfiguration);
    }

    private final PrivacyConfiguration Y(Triple triple) {
        ArrayList arrayList;
        List<PurrPrivacyDirective> public$subauth_core_release = ((PrivacyDirectives) triple.d()).toPublic$subauth_core_release();
        List list = (List) triple.e();
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(i.w(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((UserPrivacyPreference) it2.next()).toPublic$subauth_core_release());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new PrivacyConfiguration(public$subauth_core_release, arrayList, ((Number) triple.f()).intValue(), 0L, 8, null);
    }

    @Override // com.nytimes.android.subauth.core.purr.a
    public Object a(by0 by0Var) {
        return this.j.b(new PurrManagerImpl$getDirectives$2(this, null), by0Var);
    }

    @Override // com.nytimes.android.subauth.core.purr.a
    public Object b(boolean z, by0 by0Var) {
        if (this.s) {
            ul8.a.z("PURR").t("activeUserHasChanged: isLogout: " + z, new Object[0]);
        }
        if (z) {
            List c = this.b.c();
            if (c != null) {
                this.b.m();
                ArrayList arrayList = new ArrayList();
                for (Object obj : c) {
                    if (((UserPrivacyPreference) obj).getKind() == UserPrivacyPreferenceKind.AGENT) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.b.o((UserPrivacyPreference) it2.next());
                }
            }
            if (this.f.contains("last_email_opt_in")) {
                this.f.edit().remove("last_email_opt_in").apply();
                ul8.a.a("Logged out. Removing last email opt in failed attempt. Will not retry.", new Object[0]);
            }
        }
        this.b.s();
        return a(by0Var);
    }

    @Override // com.nytimes.android.subauth.core.purr.a
    public Object c(String str, by0 by0Var) {
        if (str == null) {
            str = this.b.j();
        }
        return a.C0419a.c(this, str, true, false, by0Var, 4, null);
    }

    @Override // defpackage.e96
    public void clear() {
        this.b.l();
        this.b.m();
        this.b.k();
        this.b.e(null);
        this.b.b(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:12:0x0031, B:13:0x00bb, B:15:0x00c3, B:18:0x00de, B:20:0x00e2, B:26:0x0045, B:27:0x0093, B:29:0x009b, B:30:0x00a0, B:32:0x00a6, B:33:0x00ab, B:39:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:12:0x0031, B:13:0x00bb, B:15:0x00c3, B:18:0x00de, B:20:0x00e2, B:26:0x0045, B:27:0x0093, B:29:0x009b, B:30:0x00a0, B:32:0x00a6, B:33:0x00ab, B:39:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:12:0x0031, B:13:0x00bb, B:15:0x00c3, B:18:0x00de, B:20:0x00e2, B:26:0x0045, B:27:0x0093, B:29:0x009b, B:30:0x00a0, B:32:0x00a6, B:33:0x00ab, B:39:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:12:0x0031, B:13:0x00bb, B:15:0x00c3, B:18:0x00de, B:20:0x00e2, B:26:0x0045, B:27:0x0093, B:29:0x009b, B:30:0x00a0, B:32:0x00a6, B:33:0x00ab, B:39:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.nytimes.android.subauth.core.purr.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceName r10, com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceValue r11, defpackage.by0 r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.PurrManagerImpl.d(com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceName, com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceValue, by0):java.lang.Object");
    }

    @Override // defpackage.e96
    public boolean e() {
        return this.r;
    }

    @Override // defpackage.e96
    public void f(String str) {
        this.b.e(str);
    }

    @Override // defpackage.e96
    public AgentTCFInfo g() {
        return this.b.f();
    }

    @Override // defpackage.e96
    public void i(String str) {
        this.b.b(str);
    }

    @Override // defpackage.e96
    public String j() {
        return this.n;
    }

    @Override // com.nytimes.android.subauth.core.purr.a
    public Object k(String str, by0 by0Var) {
        if (str == null) {
            str = this.b.u();
        }
        return a.C0419a.c(this, str, false, true, by0Var, 2, null);
    }

    @Override // com.nytimes.android.subauth.core.purr.a
    public Flow l() {
        return FlowKt.distinctUntilChangedBy(this.c, new ss2() { // from class: com.nytimes.android.subauth.core.purr.PurrManagerImpl$streamDirectives$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Long invoke(PrivacyConfiguration privacyConfiguration) {
                zq3.h(privacyConfiguration, "it");
                return Long.valueOf(privacyConfiguration.getTimestamp_milli());
            }
        });
    }

    @Override // defpackage.e96
    public String m() {
        return this.b.u();
    }

    @Override // com.nytimes.android.subauth.core.purr.a
    public PrivacyConfiguration n() {
        List c = this.b.c();
        PrivacyDirectives q = this.b.q();
        if (q == null) {
            if (this.s) {
                ul8.a.z("PURR").t("getCachedDirectives: Unable to get non-stale directives. Pulling stale directives.", new Object[0]);
            }
            return Q(null, c);
        }
        PrivacyConfiguration Y = Y(new Triple(q, c, 1));
        if (!this.s) {
            return Y;
        }
        ul8.a.z("PURR").t("getCachedDirectives: " + Y, new Object[0]);
        return Y;
    }

    @Override // defpackage.e96
    public void o(String str, Map map) {
        TCFInfo i = this.b.i();
        if (map == null) {
            map = t.i();
        }
        this.b.p(TCFInfo.copy$default(i, str, map, null, null, 12, null));
    }

    @Override // defpackage.ei1
    public void onPause(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onPause(d44Var);
        this.m.set(false);
    }

    @Override // defpackage.ei1
    public void onResume(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onResume(d44Var);
        this.m.set(true);
    }

    @Override // com.nytimes.android.subauth.core.purr.a
    public boolean p() {
        return T();
    }

    @Override // defpackage.e96
    public String q() {
        boolean r = r();
        boolean T = T();
        TCFInfo i = this.b.i();
        boolean z = i.getTcfString() != null;
        boolean isValidTCF = i.isValidTCF();
        boolean r2 = this.b.r();
        boolean d = this.b.d();
        StringBuilder sb = new StringBuilder();
        sb.append("Should Show: " + r);
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("\thasShowPURRDirective: " + T);
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("\thasTCFString: " + z);
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("\tisValidTCF: " + isValidTCF);
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("\tlastTCFSaveFailed: " + r2);
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("\tisUsingTempTCFForAppSession: " + d);
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.nytimes.android.subauth.core.purr.a
    public boolean r() {
        boolean T = T();
        TCFInfo i = this.b.i();
        boolean z = true;
        boolean z2 = i.getTcfString() != null;
        boolean isValidTCF = i.isValidTCF();
        boolean r = this.b.r();
        boolean d = this.b.d();
        boolean z3 = (r || (z2 && isValidTCF)) ? false : true;
        boolean z4 = r && !d;
        if (!T || (!z3 && !z4)) {
            z = false;
        }
        ul8.a.z("PURR").a("shouldShowTCFBlockerCard: " + z + " (hasShowPURRDirective: " + T + ", hasTCFString: " + z2 + ", isValidTCF: " + isValidTCF + ", lastTCFSaveFailed: " + r + ", isUsingTempTCFForAppSession: " + d + ")", new Object[0]);
        return z;
    }

    @Override // com.nytimes.android.subauth.core.purr.a
    public int s() {
        return (int) this.b.t().getSeconds();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084 A[Catch: PurrClientException -> 0x0037, TryCatch #0 {PurrClientException -> 0x0037, blocks: (B:13:0x0032, B:14:0x00bc, B:15:0x00ca, B:21:0x0046, B:22:0x00a1, B:26:0x00b1, B:29:0x00c3, B:30:0x00c8, B:33:0x0052, B:34:0x007a, B:36:0x0084, B:37:0x0096, B:43:0x0069), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.nytimes.android.subauth.core.purr.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(java.lang.String r10, boolean r11, boolean r12, defpackage.by0 r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.PurrManagerImpl.t(java.lang.String, boolean, boolean, by0):java.lang.Object");
    }

    @Override // com.nytimes.android.subauth.core.purr.a
    public void u(int i) {
        o96 o96Var = this.b;
        Duration ofSeconds = Duration.ofSeconds(i);
        zq3.g(ofSeconds, "ofSeconds(...)");
        o96Var.g(ofSeconds);
    }

    @Override // com.nytimes.android.subauth.core.purr.a
    public TCFInfo v() {
        return this.b.i();
    }

    @Override // defpackage.e96
    public void w(String str, String str2) {
        this.b.p(TCFInfo.copy$default(this.b.i(), null, null, str, str2, 3, null));
    }

    @Override // defpackage.e96
    public String x() {
        return this.b.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.nytimes.android.subauth.core.purr.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(java.lang.Boolean r12, defpackage.by0 r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.PurrManagerImpl.y(java.lang.Boolean, by0):java.lang.Object");
    }

    @Override // defpackage.e96
    public void z(boolean z) {
        this.s = z;
    }

    public /* synthetic */ PurrManagerImpl(s86 s86Var, o96 o96Var, MutableSharedFlow mutableSharedFlow, PurrDirectiveOverrider purrDirectiveOverrider, u86 u86Var, SharedPreferences sharedPreferences, boolean z, SubauthListenerManager subauthListenerManager, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(s86Var, o96Var, mutableSharedFlow, purrDirectiveOverrider, u86Var, sharedPreferences, z, subauthListenerManager, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
