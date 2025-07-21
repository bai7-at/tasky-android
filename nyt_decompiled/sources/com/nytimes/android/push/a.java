package com.nytimes.android.push;

import defpackage.op4;

/* loaded from: classes4.dex */
public abstract class a implements op4 {
    public static void a(FcmIntentService fcmIntentService, MessagingHelper messagingHelper) {
        fcmIntentService.messagingHelper = messagingHelper;
    }
}
