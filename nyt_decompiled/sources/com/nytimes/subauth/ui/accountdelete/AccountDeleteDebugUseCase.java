package com.nytimes.subauth.ui.accountdelete;

import com.nytimes.android.subauth.core.auth.models.a;
import com.nytimes.android.subauth.core.devsettings.models.DeleteAccountStatusOverride;
import defpackage.by0;
import defpackage.o98;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final class AccountDeleteDebugUseCase extends AccountDeleteMainUseCase {
    public static final a d = new a(null);
    public static final int e = 8;
    private final o98 b;
    private com.nytimes.android.subauth.core.auth.models.a c;

    public static final class a {

        /* renamed from: com.nytimes.subauth.ui.accountdelete.AccountDeleteDebugUseCase$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0446a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[DeleteAccountStatusOverride.values().length];
                try {
                    iArr[DeleteAccountStatusOverride.NoOverride.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DeleteAccountStatusOverride.Success.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DeleteAccountStatusOverride.Error_Existing_P1_User.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DeleteAccountStatusOverride.Error_Existing_P3_User.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DeleteAccountStatusOverride.Error_Anon_User.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DeleteAccountStatusOverride.Error_Missing_Cookies.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[DeleteAccountStatusOverride.Error_Server.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[DeleteAccountStatusOverride.Error_Unknown.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.nytimes.android.subauth.core.auth.models.a a(DeleteAccountStatusOverride deleteAccountStatusOverride) {
            switch (deleteAccountStatusOverride == null ? -1 : C0446a.a[deleteAccountStatusOverride.ordinal()]) {
                case -1:
                case 1:
                    return null;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 2:
                    return a.b.a;
                case 3:
                    return new a.AbstractC0406a.b(0, "debug");
                case 4:
                    return a.AbstractC0406a.c.c;
                case 5:
                    return a.AbstractC0406a.C0407a.c;
                case 6:
                    return new a.AbstractC0406a.d(0, "debug");
                case 7:
                    return new a.AbstractC0406a.f(0, "debug");
                case 8:
                    return new a.AbstractC0406a.g("debug");
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDeleteDebugUseCase(o98 o98Var) {
        super(o98Var);
        zq3.h(o98Var, "subauthUser");
        this.b = o98Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[LOOP:1: B:24:0x0089->B:29:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlinx.coroutines.flow.MutableStateFlow r18, defpackage.by0 r19) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.accountdelete.AccountDeleteDebugUseCase.f(kotlinx.coroutines.flow.MutableStateFlow, by0):java.lang.Object");
    }

    @Override // com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase, com.nytimes.subauth.ui.accountdelete.a
    public void a(DeleteAccountStatusOverride deleteAccountStatusOverride) {
        this.c = d.a(deleteAccountStatusOverride);
    }

    @Override // com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase, com.nytimes.subauth.ui.accountdelete.a
    public Object b(MutableStateFlow mutableStateFlow, by0 by0Var) {
        return f(mutableStateFlow, by0Var);
    }
}
