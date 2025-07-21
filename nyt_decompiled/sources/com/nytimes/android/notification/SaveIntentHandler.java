package com.nytimes.android.notification;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.a;
import com.nytimes.android.notification.SaveIntentHandler;
import defpackage.b04;
import defpackage.cm6;
import defpackage.d44;
import defpackage.ei1;
import defpackage.lk6;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes4.dex */
public final class SaveIntentHandler implements ei1 {
    public static final a Companion = new a(null);
    private final b04 a;
    private final b04 b;
    private final b04 c;
    private final CompletableJob d;
    private final CoroutineScope e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SaveIntentHandler(b04 b04Var, b04 b04Var2, b04 b04Var3) {
        CompletableJob Job$default;
        zq3.h(b04Var, "saveHandler");
        zq3.h(b04Var2, "savedManager");
        zq3.h(b04Var3, "assetRetriever");
        this.a = b04Var;
        this.b = b04Var2;
        this.c = b04Var3;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.d = Job$default;
        this.e = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(Job$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SaveIntentHandler saveIntentHandler, String str, String str2, Context context, DialogInterface dialogInterface, int i) {
        zq3.h(saveIntentHandler, "this$0");
        zq3.h(context, "$context");
        BuildersKt__Builders_commonKt.launch$default(saveIntentHandler.e, null, null, new SaveIntentHandler$handleSaveNotification$1$1(saveIntentHandler, str, str2, context, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Intent intent, DialogInterface dialogInterface) {
        zq3.h(intent, "$intent");
        intent.removeExtra("com.nytimes.android.extra.CONTENT_SRC");
    }

    public final void g(d44 d44Var) {
        zq3.h(d44Var, "target");
        d44Var.getLifecycle().a(this);
    }

    public final void i(final Context context, final Intent intent) {
        zq3.h(context, "context");
        zq3.h(intent, "intent");
        final String stringExtra = intent.getStringExtra("com.nytimes.android.extra.ASSET_URL");
        final String stringExtra2 = intent.getStringExtra("com.nytimes.android.extra.ASSET_URI");
        new a.C0012a(context).e(cm6.loginToSave).setPositiveButton(lk6.login, new DialogInterface.OnClickListener() { // from class: j87
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SaveIntentHandler.j(SaveIntentHandler.this, stringExtra2, stringExtra, context, dialogInterface, i);
            }
        }).setNegativeButton(lk6.cancel, new DialogInterface.OnClickListener() { // from class: k87
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SaveIntentHandler.k(dialogInterface, i);
            }
        }).j(new DialogInterface.OnDismissListener() { // from class: l87
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SaveIntentHandler.l(intent, dialogInterface);
            }
        }).p();
    }

    public final boolean m(Intent intent) {
        zq3.h(intent, "intent");
        return zq3.c("notificationSave", intent.getStringExtra("com.nytimes.android.extra.CONTENT_SRC"));
    }

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        zq3.h(d44Var, "owner");
        Job.DefaultImpls.cancel$default((Job) this.d, (CancellationException) null, 1, (Object) null);
    }
}
