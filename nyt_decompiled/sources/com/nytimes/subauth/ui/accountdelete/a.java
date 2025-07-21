package com.nytimes.subauth.ui.accountdelete;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.subauth.core.auth.models.a;
import com.nytimes.android.subauth.core.devsettings.models.DeleteAccountStatusOverride;
import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import defpackage.by0;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.nytimes.subauth.ui.accountdelete.a$a, reason: collision with other inner class name */
    public static final class C0448a {
        public static AccountDeleteViewModel.AccountDeleteDialogState a(a aVar, com.nytimes.android.subauth.core.auth.models.a aVar2) {
            zq3.h(aVar2, TransferTable.COLUMN_STATE);
            if (zq3.c(aVar2, a.b.a)) {
                return AccountDeleteViewModel.AccountDeleteDialogState.SUCCESS;
            }
            if (aVar2 instanceof a.AbstractC0406a.b ? true : zq3.c(aVar2, a.AbstractC0406a.c.c)) {
                return AccountDeleteViewModel.AccountDeleteDialogState.ERROR_ACTIVE_SUBSCRIPTION;
            }
            if (zq3.c(aVar2, a.AbstractC0406a.C0407a.c) ? true : aVar2 instanceof a.AbstractC0406a.d ? true : aVar2 instanceof a.AbstractC0406a.f ? true : zq3.c(aVar2, a.AbstractC0406a.e.c) ? true : aVar2 instanceof a.AbstractC0406a.g) {
                return AccountDeleteViewModel.AccountDeleteDialogState.ERROR_GENERAL;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static void b(a aVar, DeleteAccountStatusOverride deleteAccountStatusOverride) {
        }
    }

    void a(DeleteAccountStatusOverride deleteAccountStatusOverride);

    Object b(MutableStateFlow mutableStateFlow, by0 by0Var);
}
