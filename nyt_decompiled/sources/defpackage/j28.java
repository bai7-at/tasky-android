package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class j28 extends wc0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j28(Context context, rg8 rg8Var) {
        super(context, rg8Var);
        zq3.h(context, "context");
        zq3.h(rg8Var, "taskExecutor");
    }

    @Override // defpackage.wc0
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // defpackage.wc0
    public void k(Intent intent) {
        String str;
        zq3.h(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        h94 e = h94.e();
        str = k28.a;
        e.a(str, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    g(Boolean.FALSE);
                }
            } else if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                g(Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r4.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L18;
     */
    @Override // defpackage.dv0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean e() {
        /*
            r4 = this;
            android.content.Context r0 = r4.d()
            r1 = 0
            android.content.IntentFilter r4 = r4.j()
            android.content.Intent r4 = r0.registerReceiver(r1, r4)
            r0 = 1
            if (r4 == 0) goto L3d
            java.lang.String r1 = r4.getAction()
            if (r1 != 0) goto L17
            goto L3d
        L17:
            java.lang.String r4 = r4.getAction()
            r1 = 0
            if (r4 == 0) goto L3c
            int r2 = r4.hashCode()
            r3 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r2 == r3) goto L36
            r3 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r2 == r3) goto L2d
            goto L3c
        L2d:
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L3d
            goto L3c
        L36:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r4 = r4.equals(r0)
        L3c:
            r0 = r1
        L3d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j28.e():java.lang.Boolean");
    }
}
