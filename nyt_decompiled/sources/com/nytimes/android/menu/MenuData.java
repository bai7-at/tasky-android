package com.nytimes.android.menu;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.gt2;
import defpackage.kq4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class MenuData {
    private final Integer actionLayout;
    private final int grpId;
    private gt2 handler;
    private final Integer icon;
    private final int id;
    private final boolean isPaywallAffected;
    private Boolean isVisible;
    private Integer orderInGrp;
    private ss2 preparer;
    private final Integer showAsAction;
    private int title;

    public MenuData(int i, int i2, int i3, Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, boolean z, ss2 ss2Var, gt2 gt2Var) {
        this.title = i;
        this.id = i2;
        this.grpId = i3;
        this.orderInGrp = num;
        this.isVisible = bool;
        this.showAsAction = num2;
        this.actionLayout = num3;
        this.icon = num4;
        this.isPaywallAffected = z;
        this.preparer = ss2Var;
        this.handler = gt2Var;
    }

    public final Integer getActionLayout() {
        return this.actionLayout;
    }

    public final int getGrpId() {
        return this.grpId;
    }

    public final gt2 getHandler() {
        return this.handler;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getOrderInGrp() {
        return this.orderInGrp;
    }

    public final ss2 getPreparer() {
        return this.preparer;
    }

    public final Integer getShowAsAction() {
        return this.showAsAction;
    }

    public final int getTitle() {
        return this.title;
    }

    public final boolean isPaywallAffected() {
        return this.isPaywallAffected;
    }

    public final Boolean isVisible() {
        return this.isVisible;
    }

    public final void setHandler(gt2 gt2Var) {
        this.handler = gt2Var;
    }

    public final void setOrderInGrp(Integer num) {
        this.orderInGrp = num;
    }

    public final void setPreparer(ss2 ss2Var) {
        this.preparer = ss2Var;
    }

    public final void setTitle(int i) {
        this.title = i;
    }

    public final void setVisible(Boolean bool) {
        this.isVisible = bool;
    }

    public /* synthetic */ MenuData(int i, int i2, int i3, Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, boolean z, ss2 ss2Var, gt2 gt2Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? null : bool, (i4 & 32) != 0 ? null : num2, (i4 & 64) != 0 ? null : num3, (i4 & 128) != 0 ? null : num4, (i4 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) == 0 ? z : false, (i4 & 512) != 0 ? new ss2() { // from class: com.nytimes.android.menu.MenuData.1
            public final void invoke(kq4 kq4Var) {
                zq3.h(kq4Var, "<anonymous parameter 0>");
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((kq4) obj);
                return ww8.a;
            }
        } : ss2Var, (i4 & 1024) == 0 ? gt2Var : null);
    }
}
