package com.nytimes.android.messaging;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.nytimes.android.messaging.CardParent;
import defpackage.f57;
import defpackage.kw2;
import defpackage.lf6;
import defpackage.m07;
import defpackage.tg6;
import defpackage.ww8;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

@Deprecated
/* loaded from: classes4.dex */
public abstract class CardParent {
    protected Button actionButton;
    protected AppCompatTextView articleLeftVerbiage;
    protected final CompositeDisposable compositeDisposable = new CompositeDisposable();
    protected kw2 gatewayCardListener;
    protected boolean isGateway;
    protected View meterGatewayCardContainer;
    private String url;
    private boolean visibleFlag;

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wireUi$0(ww8 ww8Var) throws Exception {
        kw2 kw2Var = this.gatewayCardListener;
        if (kw2Var != null) {
            kw2Var.z0();
        }
    }

    Observable<ww8> clicksFrom(View view) {
        return f57.a(view);
    }

    protected void configureGravity() {
        LinearLayout linearLayout = (LinearLayout) this.meterGatewayCardContainer.findViewById(tg6.card);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.gravity = getGravity();
        linearLayout.setLayoutParams(layoutParams);
    }

    protected abstract int getActionButtonText();

    protected abstract int getGravity();

    public String getUrl() {
        return this.url;
    }

    public void hide() {
        this.visibleFlag = false;
        this.meterGatewayCardContainer.setVisibility(8);
        this.meterGatewayCardContainer.setOnTouchListener(null);
    }

    public void hideLogin() {
        this.meterGatewayCardContainer.findViewById(tg6.loginContainer).setVisibility(8);
    }

    public void init(kw2 kw2Var, View view) {
        this.gatewayCardListener = kw2Var;
        this.meterGatewayCardContainer = view;
        configureGravity();
        wireUi();
    }

    public boolean isVisible() {
        return this.visibleFlag;
    }

    void setIsGateway(boolean z) {
        this.isGateway = z;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void show(int i, boolean z) {
        this.visibleFlag = true;
        this.gatewayCardListener.w0();
        this.meterGatewayCardContainer.setOnTouchListener(new a());
        this.meterGatewayCardContainer.setVisibility(0);
        if (z) {
            showLogin();
        } else {
            hideLogin();
        }
    }

    public void showLogin() {
        this.meterGatewayCardContainer.findViewById(tg6.loginContainer).setVisibility(0);
    }

    public void unsubscribe() {
        this.compositeDisposable.clear();
    }

    protected void wireUi() {
        this.articleLeftVerbiage = (AppCompatTextView) this.meterGatewayCardContainer.findViewById(tg6.cardTitle);
        Button button = (Button) this.meterGatewayCardContainer.findViewById(tg6.cardButton);
        this.actionButton = button;
        button.setTypeface(m07.g(button.getContext().getApplicationContext(), lf6.font_franklin_medium));
        Button button2 = this.actionButton;
        button2.setPaintFlags(button2.getPaintFlags() | 128);
        this.actionButton.setText(getActionButtonText());
        this.compositeDisposable.add(clicksFrom(this.meterGatewayCardContainer.findViewById(tg6.loginContainer)).subscribe(new Consumer() { // from class: fi0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CardParent.this.lambda$wireUi$0((ww8) obj);
            }
        }));
    }
}
