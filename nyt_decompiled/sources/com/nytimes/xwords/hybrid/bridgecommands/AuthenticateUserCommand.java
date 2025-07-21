package com.nytimes.xwords.hybrid.bridgecommands;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import defpackage.du8;
import defpackage.mc0;
import defpackage.nc0;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.zq3;
import defpackage.zu2;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class AuthenticateUserCommand extends mc0 {
    public static final a f = new a(null);
    public static final int g = 8;
    private final ss2 b;
    private final ss2 c;
    private final ss2 d;
    private boolean e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.nytimes.xwords.hybrid.bridgecommands.a b(nc0 nc0Var) {
            String j = nc0Var.j(TransferTable.COLUMN_TYPE);
            if (zq3.c(j, "login")) {
                return b.a;
            }
            if (zq3.c(j, "subscribe")) {
                return c.a;
            }
            ul8.a.d("Unhandled Authenticate User Bridge Command", new Object[0]);
            return null;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticateUserCommand(ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3) {
        super("gamesAuthenticateUser");
        zq3.h(ss2Var, "onSubscribe");
        zq3.h(ss2Var2, "onLogin");
        zq3.h(ss2Var3, "onResult");
        this.b = ss2Var;
        this.c = ss2Var2;
        this.d = ss2Var3;
    }

    private final BridgeCommandResult e(int i, zu2 zu2Var, boolean z) {
        return BridgeCommandResult.Companion.c(i, t.m(du8.a("gamesAuthenticateUser", t.m(du8.a("isSubscribed", Boolean.valueOf(zu2Var.g())), du8.a("isUserLoggedIn", Boolean.valueOf(zu2Var.i())), du8.a("nytsCookie", zu2Var.e()), du8.a("regiID", zu2Var.f()), du8.a("email", zu2Var.b()), du8.a("entitlements", zu2Var.c()))), du8.a("aborted", Boolean.valueOf(z))));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x010c A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:15:0x003f, B:16:0x0100, B:18:0x010c, B:20:0x013c, B:24:0x0114, B:26:0x0132, B:27:0x0137, B:32:0x0056, B:34:0x00e3, B:38:0x0062, B:39:0x00c9, B:43:0x006c, B:44:0x00b4, B:49:0x007a, B:51:0x0088, B:54:0x009a, B:56:0x00a2, B:59:0x0159), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0132 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:15:0x003f, B:16:0x0100, B:18:0x010c, B:20:0x013c, B:24:0x0114, B:26:0x0132, B:27:0x0137, B:32:0x0056, B:34:0x00e3, B:38:0x0062, B:39:0x00c9, B:43:0x006c, B:44:0x00b4, B:49:0x007a, B:51:0x0088, B:54:0x009a, B:56:0x00a2, B:59:0x0159), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // defpackage.mc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.webkit.WebView r12, int r13, defpackage.nc0 r14, defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.xwords.hybrid.bridgecommands.AuthenticateUserCommand.b(android.webkit.WebView, int, nc0, by0):java.lang.Object");
    }
}
