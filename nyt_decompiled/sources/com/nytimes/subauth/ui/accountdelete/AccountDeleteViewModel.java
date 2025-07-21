package com.nytimes.subauth.ui.accountdelete;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.devsettings.models.DeleteAccountStatusOverride;
import defpackage.b22;
import defpackage.p60;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class AccountDeleteViewModel extends q {
    private final NYTUser a;
    private final MutableSharedFlow b;
    private final com.nytimes.subauth.ui.accountdelete.a c;
    private final p60 d;
    private final MutableStateFlow e;
    private final StateFlow f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AccountDeleteDialogState {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ AccountDeleteDialogState[] $VALUES;
        public static final AccountDeleteDialogState NONE = new AccountDeleteDialogState("NONE", 0);
        public static final AccountDeleteDialogState SUCCESS = new AccountDeleteDialogState("SUCCESS", 1);
        public static final AccountDeleteDialogState CONFIRM_DELETE = new AccountDeleteDialogState("CONFIRM_DELETE", 2);
        public static final AccountDeleteDialogState ERROR_ACTIVE_SUBSCRIPTION = new AccountDeleteDialogState("ERROR_ACTIVE_SUBSCRIPTION", 3);
        public static final AccountDeleteDialogState ERROR_GENERAL = new AccountDeleteDialogState("ERROR_GENERAL", 4);

        private static final /* synthetic */ AccountDeleteDialogState[] $values() {
            return new AccountDeleteDialogState[]{NONE, SUCCESS, CONFIRM_DELETE, ERROR_ACTIVE_SUBSCRIPTION, ERROR_GENERAL};
        }

        static {
            AccountDeleteDialogState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AccountDeleteDialogState(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static AccountDeleteDialogState valueOf(String str) {
            return (AccountDeleteDialogState) Enum.valueOf(AccountDeleteDialogState.class, str);
        }

        public static AccountDeleteDialogState[] values() {
            return (AccountDeleteDialogState[]) $VALUES.clone();
        }
    }

    public static final class a {
        public static final C0447a e = new C0447a(null);
        private static final a f = new a("", AccountDeleteDialogState.NONE, false, false);
        private final String a;
        private final AccountDeleteDialogState b;
        private final boolean c;
        private final boolean d;

        /* renamed from: com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$a$a, reason: collision with other inner class name */
        public static final class C0447a {
            public /* synthetic */ C0447a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return a.f;
            }

            private C0447a() {
            }
        }

        public a(String str, AccountDeleteDialogState accountDeleteDialogState, boolean z, boolean z2) {
            zq3.h(str, AppsFlyerProperties.USER_EMAIL);
            zq3.h(accountDeleteDialogState, "dialogState");
            this.a = str;
            this.b = accountDeleteDialogState;
            this.c = z;
            this.d = z2;
        }

        public static /* synthetic */ a c(a aVar, String str, AccountDeleteDialogState accountDeleteDialogState, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                accountDeleteDialogState = aVar.b;
            }
            if ((i & 4) != 0) {
                z = aVar.c;
            }
            if ((i & 8) != 0) {
                z2 = aVar.d;
            }
            return aVar.b(str, accountDeleteDialogState, z, z2);
        }

        public final a b(String str, AccountDeleteDialogState accountDeleteDialogState, boolean z, boolean z2) {
            zq3.h(str, AppsFlyerProperties.USER_EMAIL);
            zq3.h(accountDeleteDialogState, "dialogState");
            return new a(str, accountDeleteDialogState, z, z2);
        }

        public final AccountDeleteDialogState d() {
            return this.b;
        }

        public final boolean e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final String f() {
            return this.a;
        }

        public final boolean g() {
            return this.c;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            return "AccountDeleteViewState(userEmail=" + this.a + ", dialogState=" + this.b + ", isLoading=" + this.c + ", showSnackbar=" + this.d + ")";
        }
    }

    public AccountDeleteViewModel(NYTUser nYTUser, MutableSharedFlow mutableSharedFlow, com.nytimes.subauth.ui.accountdelete.a aVar, p60 p60Var) {
        zq3.h(nYTUser, "nytUser");
        zq3.h(mutableSharedFlow, "analyticsEventFlow");
        zq3.h(aVar, "accountDeleteUseCase");
        zq3.h(p60Var, "networkStatus");
        this.a = nYTUser;
        this.b = mutableSharedFlow;
        this.c = aVar;
        this.d = p60Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(a.e.a());
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        Object value;
        if (this.d.a()) {
            return false;
        }
        MutableStateFlow mutableStateFlow = this.e;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, a.c((a) value, null, AccountDeleteDialogState.NONE, false, true, 5, null)));
        return true;
    }

    public final void j() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new AccountDeleteViewModel$checkUserEmail$1(this, null), 3, null);
    }

    public final void k(AccountDeleteDialogState accountDeleteDialogState) {
        Object value;
        zq3.h(accountDeleteDialogState, "dialogState");
        r(accountDeleteDialogState);
        MutableStateFlow mutableStateFlow = this.e;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, a.c((a) value, null, AccountDeleteDialogState.NONE, false, false, 13, null)));
    }

    public final void l() {
        Object value;
        MutableStateFlow mutableStateFlow = this.e;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, a.c((a) value, null, null, false, false, 7, null)));
    }

    public final MutableSharedFlow m() {
        return this.b;
    }

    public final StateFlow n() {
        return this.f;
    }

    public final void p() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new AccountDeleteViewModel$onActivityCreate$1(this, null), 3, null);
    }

    public final void q() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new AccountDeleteViewModel$onDeleteAccountClicked$1(this, null), 3, null);
    }

    public final void r(AccountDeleteDialogState accountDeleteDialogState) {
        zq3.h(accountDeleteDialogState, TransferTable.COLUMN_STATE);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new AccountDeleteViewModel$onDialogCancelButton$1(accountDeleteDialogState, this, null), 3, null);
    }

    public final void s(AccountDeleteDialogState accountDeleteDialogState) {
        zq3.h(accountDeleteDialogState, TransferTable.COLUMN_STATE);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new AccountDeleteViewModel$onDialogVisible$1(accountDeleteDialogState, this, null), 3, null);
    }

    public final void t() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new AccountDeleteViewModel$onPageVisible$1(this, null), 3, null);
    }

    public final void u(DeleteAccountStatusOverride deleteAccountStatusOverride) {
        zq3.h(deleteAccountStatusOverride, "deleteAccountStateOverride");
        this.c.a(deleteAccountStatusOverride);
    }

    public final void v() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new AccountDeleteViewModel$requestDeleteAccount$1(this, null), 3, null);
    }
}
