package zendesk.support;

import defpackage.tm9;
import defpackage.y22;

/* loaded from: classes5.dex */
abstract class ZendeskCallbackSuccess<E> extends tm9 {
    private final tm9 callback;

    ZendeskCallbackSuccess(tm9 tm9Var) {
        this.callback = tm9Var;
    }

    @Override // defpackage.tm9
    public void onError(y22 y22Var) {
        tm9 tm9Var = this.callback;
        if (tm9Var != null) {
            tm9Var.onError(y22Var);
        }
    }
}
