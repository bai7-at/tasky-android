package com.nytimes.android.messaging.postloginregioffers;

import android.content.Context;
import com.nytimes.abtests.GrowthUIPostAuthVariants;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.postauth.PostAuthActivity;
import com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferBaseActivity;
import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.z58;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class PostLoginRegiOfferManager {
    private final NetworkStatus a;
    private final z58 b;
    private final AbraManager c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoginMethod.values().length];
            try {
                iArr[LoginMethod.LoginCredentials.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoginMethod.GoogleSSO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoginMethod.FacebookSSO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoginMethod.WebSSO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoginMethod.RegisterCredentials.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public PostLoginRegiOfferManager(NetworkStatus networkStatus, z58 z58Var, AbraManager abraManager) {
        zq3.h(networkStatus, "networkStatus");
        zq3.h(z58Var, "subauthClient");
        zq3.h(abraManager, "abraManager");
        this.a = networkStatus;
        this.b = z58Var;
        this.c = abraManager;
    }

    public final void a(Context context) {
        zq3.h(context, "context");
        if (GrowthUIPostAuthVariants.Companion.b(this.c)) {
            PostAuthActivity.a.c(PostAuthActivity.Companion, context, DataConfigId.AllAccessPostLogin, null, 4, null);
        } else {
            context.startActivity(PostRegiLoginOfferBaseActivity.Companion.a(context, "PLO_AA"));
        }
    }

    public final void b(Context context) {
        zq3.h(context, "context");
        if (GrowthUIPostAuthVariants.Companion.b(this.c)) {
            PostAuthActivity.a.c(PostAuthActivity.Companion, context, DataConfigId.AllAccessPostRegistration, null, 4, null);
        } else {
            context.startActivity(PostRegiLoginOfferBaseActivity.Companion.a(context, "PRO_AA"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.app.Activity r10, com.nytimes.android.subauth.core.auth.models.RegiInterface r11, defpackage.by0 r12) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.messaging.postloginregioffers.PostLoginRegiOfferManager.c(android.app.Activity, com.nytimes.android.subauth.core.auth.models.RegiInterface, by0):java.lang.Object");
    }
}
