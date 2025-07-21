package com.nytimes.android.devsettings.common;

import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.devsettings.common.DevSettingSimpleClipboardItemKt$DevSettingSimpleClipboardItem$1", f = "DevSettingSimpleClipboardItem.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DevSettingSimpleClipboardItemKt$DevSettingSimpleClipboardItem$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $lazySummary;
    final /* synthetic */ String $title;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DevSettingSimpleClipboardItemKt$DevSettingSimpleClipboardItem$1(ss2 ss2Var, String str, by0 by0Var) {
        super(2, by0Var);
        this.$lazySummary = ss2Var;
        this.$title = str;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((DevSettingSimpleClipboardItemKt$DevSettingSimpleClipboardItem$1) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DevSettingSimpleClipboardItemKt$DevSettingSimpleClipboardItem$1 devSettingSimpleClipboardItemKt$DevSettingSimpleClipboardItem$1 = new DevSettingSimpleClipboardItemKt$DevSettingSimpleClipboardItem$1(this.$lazySummary, this.$title, by0Var);
        devSettingSimpleClipboardItemKt$DevSettingSimpleClipboardItem$1.L$0 = obj;
        return devSettingSimpleClipboardItemKt$DevSettingSimpleClipboardItem$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Context context;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Context context2 = (Context) this.L$0;
            ss2 ss2Var = this.$lazySummary;
            this.L$0 = context2;
            this.label = 1;
            Object invoke = ss2Var.invoke(this);
            if (invoke == h) {
                return h;
            }
            context = context2;
            obj = invoke;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) this.L$0;
            f.b(obj);
        }
        final String str = (String) obj;
        final String str2 = this.$title;
        DevSettingSimpleClipboardItemKt.f(context, new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingSimpleClipboardItemKt$DevSettingSimpleClipboardItem$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ClipboardManager clipboardManager) {
                zq3.h(clipboardManager, "$this$withClipboardManager");
                DevSettingSimpleClipboardItemKt.e(clipboardManager, str2, str);
                Toast.makeText(context, "Copied to clipboard.", 0).show();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                b((ClipboardManager) obj2);
                return ww8.a;
            }
        });
        return ww8.a;
    }
}
